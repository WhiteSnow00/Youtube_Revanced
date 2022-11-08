// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.opengl.Matrix;

public class HeadTransform
{
    private final float[] headView;
    
    public HeadTransform() {
        Matrix.setIdentityM(this.headView = new float[16], 0);
    }
    
    public void getHeadView(final float[] array, final int n) {
        System.arraycopy(this.headView, 0, array, 0, 16);
    }
    
    public float[] getHeadView() {
        return this.headView;
    }
}
