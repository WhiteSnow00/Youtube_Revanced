// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api.jar.client;

public final class e implements Runnable
{
    public final f a;
    public final long b;
    public final long c;
    private final int d;
    
    public e(final f a, final long b, final long c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.d != 0) {
            final f a = this.a;
            final long b = this.b;
            final long c = this.c;
            final RemoteEmbeddedPlayer a2 = a.a;
            a2.f = b;
            a2.g = c;
            return;
        }
        final f a3 = this.a;
        final long b2 = this.b;
        final long c2 = this.c;
        final RemoteEmbeddedPlayer a4 = a3.a;
        a4.f = b2;
        a4.g = c2;
        a4.a = true;
        a4.S();
    }
}
