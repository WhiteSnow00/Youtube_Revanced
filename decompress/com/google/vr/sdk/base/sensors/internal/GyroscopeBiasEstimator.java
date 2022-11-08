// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base.sensors.internal;

public class GyroscopeBiasEstimator
{
    private LowPassFilter accelLowPass;
    private LowPassFilter gyroBiasLowPass;
    private LowPassFilter gyroLowPass;
    private GyroscopeBiasEstimator$IsStaticCounter isAccelStatic;
    private GyroscopeBiasEstimator$IsStaticCounter isGyroStatic;
    private Vector3d smoothedAccelDiff;
    private Vector3d smoothedGyroDiff;
    
    public GyroscopeBiasEstimator() {
        this.reset();
    }
    
    private void updateGyroBias(final Vector3d vector3d, final long n) {
        if (vector3d.length() >= 0.3499999940395355) {
            return;
        }
        final double max = Math.max(0.0, 1.0 - vector3d.length() / 0.3499999940395355);
        this.gyroBiasLowPass.addWeightedSample(this.gyroLowPass.getFilteredData(), n, max * max);
    }
    
    public void getGyroBias(final Vector3d vector3d) {
        if (this.gyroBiasLowPass.getNumSamples() < 30) {
            vector3d.setZero();
            return;
        }
        vector3d.set(this.gyroBiasLowPass.getFilteredData());
        final double n = this.gyroBiasLowPass.getNumSamples() - 30;
        Double.isNaN(n);
        vector3d.scale(Math.min(1.0, n / 100.0));
    }
    
    public void processAccelerometer(final Vector3d vector3d, final long n) {
        this.accelLowPass.addSample(vector3d, n);
        Vector3d.sub(vector3d, this.accelLowPass.getFilteredData(), this.smoothedAccelDiff);
        this.isAccelStatic.appendFrame(this.smoothedAccelDiff.length() < 0.5);
    }
    
    public void processGyroscope(final Vector3d vector3d, final long n) {
        this.gyroLowPass.addSample(vector3d, n);
        Vector3d.sub(vector3d, this.gyroLowPass.getFilteredData(), this.smoothedGyroDiff);
        this.isGyroStatic.appendFrame(this.smoothedGyroDiff.length() < 0.00800000037997961);
        if (this.isGyroStatic.isRecentlyStatic() && this.isAccelStatic.isRecentlyStatic()) {
            this.updateGyroBias(vector3d, n);
        }
    }
    
    public void reset() {
        this.smoothedGyroDiff = new Vector3d();
        this.smoothedAccelDiff = new Vector3d();
        this.accelLowPass = new LowPassFilter(1.0);
        this.gyroLowPass = new LowPassFilter(10.0);
        this.gyroBiasLowPass = new LowPassFilter(0.15000000596046448);
        this.isAccelStatic = new GyroscopeBiasEstimator$IsStaticCounter(10);
        this.isGyroStatic = new GyroscopeBiasEstimator$IsStaticCounter(10);
    }
}
