// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base.sensors.internal;

import java.util.concurrent.TimeUnit;

public class LowPassFilter
{
    private static final double NANOS_TO_SECONDS;
    private final Vector3d filteredData;
    private long lastTimestampNs;
    private int numSamples;
    private final Vector3d temp;
    private final double timeConstantSecs;
    
    static {
        final double n = (double)TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS);
        Double.isNaN(n);
        NANOS_TO_SECONDS = 1.0 / n;
    }
    
    public LowPassFilter(final double n) {
        this.filteredData = new Vector3d();
        this.temp = new Vector3d();
        this.timeConstantSecs = 1.0 / (n * 6.283185307179586);
    }
    
    public void addSample(final Vector3d vector3d, final long n) {
        this.addWeightedSample(vector3d, n, 1.0);
    }
    
    public void addWeightedSample(Vector3d filteredData, final long n, double n2) {
        final int numSamples = this.numSamples + 1;
        this.numSamples = numSamples;
        if (numSamples == 1) {
            this.filteredData.set(filteredData);
            this.lastTimestampNs = n;
            return;
        }
        final double n3 = (double)(n - this.lastTimestampNs);
        Double.isNaN(n3);
        n2 = n2 * n3 * LowPassFilter.NANOS_TO_SECONDS;
        n2 /= this.timeConstantSecs + n2;
        this.filteredData.scale(1.0 - n2);
        this.temp.set(filteredData);
        this.temp.scale(n2);
        final Vector3d temp = this.temp;
        filteredData = this.filteredData;
        Vector3d.add(temp, filteredData, filteredData);
        this.lastTimestampNs = n;
    }
    
    public Vector3d getFilteredData() {
        return this.filteredData;
    }
    
    public int getNumSamples() {
        return this.numSamples;
    }
}
