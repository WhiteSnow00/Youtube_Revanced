// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distortion
{
    private static final float[] CARDBOARD_V1_COEFFICIENTS;
    private static final float[] CARDBOARD_V2_2_COEFFICIENTS;
    private float[] coefficients;
    
    static {
        CARDBOARD_V2_2_COEFFICIENTS = new float[] { 0.34f, 0.55f };
        CARDBOARD_V1_COEFFICIENTS = new float[] { 0.441f, 0.156f };
    }
    
    public Distortion() {
        this.coefficients = Distortion.CARDBOARD_V2_2_COEFFICIENTS.clone();
    }
    
    public Distortion(final Distortion distortion) {
        this.setCoefficients(distortion.coefficients);
    }
    
    public static Distortion parseFromProtobuf(final List list) {
        final float[] coefficients = new float[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            coefficients[i] = (float)list.get(i);
        }
        final Distortion distortion = new Distortion();
        distortion.setCoefficients(coefficients);
        return distortion;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && (o == this || (o instanceof Distortion && Arrays.equals(this.coefficients, ((Distortion)o).coefficients)));
    }
    
    public void setCoefficients(float[] coefficients) {
        if (coefficients != null) {
            coefficients = coefficients.clone();
        }
        else {
            coefficients = new float[0];
        }
        this.coefficients = coefficients;
    }
    
    public List toProtobufAsList() {
        final ArrayList list = new ArrayList(this.coefficients.length);
        int n = 0;
        while (true) {
            final float[] coefficients = this.coefficients;
            if (n >= coefficients.length) {
                break;
            }
            list.add(coefficients[n]);
            ++n;
        }
        return list;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{\n  coefficients: [");
        int n = 0;
        while (true) {
            final float[] coefficients = this.coefficients;
            if (n >= coefficients.length) {
                break;
            }
            sb.append(Float.toString(coefficients[n]));
            if (n < this.coefficients.length - 1) {
                sb.append(", ");
            }
            ++n;
        }
        sb.append("],\n}");
        return sb.toString();
    }
}
