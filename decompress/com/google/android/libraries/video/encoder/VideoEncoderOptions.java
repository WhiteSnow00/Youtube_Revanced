// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.encoder;

import android.os.Parcelable;

public abstract class VideoEncoderOptions implements Parcelable
{
    public static rad f() {
        final rad rad = new rad();
        rad.b(5000000);
        return rad;
    }
    
    public abstract int a();
    
    public abstract int b();
    
    public abstract int c();
    
    public abstract Float d();
    
    public abstract int e();
}
