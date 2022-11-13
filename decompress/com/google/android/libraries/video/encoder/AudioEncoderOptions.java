// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.encoder;

import android.os.Parcelable;

public abstract class AudioEncoderOptions implements Parcelable
{
    public static zxh d() {
        final zxh zxh = new zxh();
        zxh.a = 128000;
        zxh.b = 1;
        return zxh;
    }
    
    public abstract int a();
    
    public abstract Integer b();
    
    public abstract Integer c();
}
