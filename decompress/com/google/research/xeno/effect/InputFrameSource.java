// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect;

public enum InputFrameSource
{
    a("BACK_CAMERA", 0, 0), 
    b("FRONT_CAMERA_MIRRORED", 1, 1), 
    c("FRONT_CAMERA_NONMIRRORED", 2, 2), 
    d("VIDEO", 3, 3);
    
    public final int e;
    
    private InputFrameSource(final String s, final int n, final int e) {
        this.e = e;
    }
}
