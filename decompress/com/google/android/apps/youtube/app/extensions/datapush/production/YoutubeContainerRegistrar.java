// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.datapush.production;

import com.google.android.libraries.blocks.runtime.JavaRuntime;

public final class YoutubeContainerRegistrar implements sng
{
    private boolean a;
    private final mdp b;
    private final mdp c;
    private final mdp d;
    private final mdp e;
    private final mdp f;
    private final msr g;
    private final adet h;
    private final aeea i;
    private final aeea j;
    private final aeea k;
    
    public YoutubeContainerRegistrar(final mdp b, final mdp c, final mdp f, final mdp e, final mdp d, final msr g, final aeea i, final adet h, final aeea j, final aeea k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = false;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = e;
        this.d = d;
        this.g = g;
        this.i = i;
        this.h = h;
        this.j = j;
        this.k = k;
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
            JavaRuntime.a.a(42, 395487482, (obs)new tdj(this.b, 1, (byte[])null, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 437092259, (obs)new tdj(this.c, 4, (byte[])null, (byte[])null));
            this.f.B(42);
            JavaRuntime.a.a(42, 382814680, (obs)new tdj(this.e, 2, (char[])null, (byte[])null));
            JavaRuntime.a.a(42, 366354626, (obs)new tdj(this.d, 3, (byte[])null, (byte[])null, (char[])null));
            JavaRuntime.a.a(42, 445270221, (obs)new tdj(this.g, 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            this.i.bH(42);
            JavaRuntime.a.a(42, 429754717, (obs)new tdj(this.h, 11, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 444687476, (obs)new tdj(this.j, 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            JavaRuntime.a.a(42, 427886809, (obs)new tdj(this.k, 7, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            registerNative();
        }
    }
}
