// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.datapush.production;

import com.google.android.libraries.blocks.runtime.JavaRuntime;

public final class YoutubeContainerRegistrar implements slb
{
    private boolean a;
    private final lzi b;
    private final mck c;
    private final mck d;
    private final mck e;
    private final mrm f;
    private final mrm g;
    private final avt h;
    private final adcr i;
    private final aeby j;
    private final adcr k;
    
    public YoutubeContainerRegistrar(final lzi b, final mrm g, final mck e, final mck d, final mck c, final mrm f, final adcr i, final aeby j, final adcr k, final avt h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = false;
        this.b = b;
        this.g = g;
        this.e = e;
        this.d = d;
        this.c = c;
        this.f = f;
        this.i = i;
        this.j = j;
        this.k = k;
        this.h = h;
    }
    
    private static native void registerNative();
    
    private static native void unregisterNative();
    
    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            monitorexit(this);
            JavaRuntime.a.a(42, 395487482, (oam)new tbf(this.b, 1, (byte[])null, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 437092259, (oam)new tbf(this.g, 4, (byte[])null, (char[])null, (byte[])null, (byte[])null));
            this.e.L(42);
            JavaRuntime.a.a(42, 382814680, (oam)new tbf(this.d, 2, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 366354626, (oam)new tbf(this.c, 3, (byte[])null));
            JavaRuntime.a.a(42, 445270221, (oam)new tbf(this.f, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            this.i.aP(42);
            JavaRuntime.a.a(42, 429754717, (oam)new tbf(this.j, 11, (byte[])null, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 444687476, (oam)new tbf(this.k, 8, (byte[])null, (byte[])null, (char[])null, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 427886809, (oam)new tbf(this.h, 7, (byte[])null, (byte[])null, (byte[])null));
            registerNative();
        }
    }
}
