// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

public final class c implements Runnable
{
    public final f a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;
    
    public c(final f a, final String b, final boolean c, final boolean d, final long e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final f a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final long e = this.e;
        final long f = this.f;
        a.a.aC(b);
        final RemoteEmbeddedPlayer a2 = a.a;
        a2.c = c;
        a2.b = d;
        a2.f = e;
        a2.g = f;
    }
}
