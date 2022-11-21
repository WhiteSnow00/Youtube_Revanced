// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import j$.util.Optional;

public final class c
{
    public boolean a;
    final d b;
    private final xab c;
    
    public c(final d b, final xab c) {
        this.b = b;
        this.a = false;
        this.c = c;
    }
    
    public final void a(final b b, final String s) {
        final alji a = this.b.a(s);
        if (!this.b.f.contains(b)) {
            this.b.f.add(b);
        }
        final a a2 = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.a;
        final int ordinal = b.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    final byte[] b2 = b.b;
                    if (b2 != null) {
                        this.c.t((xbe)new wzy(b2), a);
                        return;
                    }
                    final xbg c = b.c;
                    if (c != null) {
                        this.c.t((xbe)new wzy(c), a);
                    }
                }
            }
            else {
                final byte[] b3 = b.b;
                if (b3 != null) {
                    this.c.J(3, (xbe)new wzy(b3), a);
                    return;
                }
                final xbg c2 = b.c;
                if (c2 != null) {
                    this.c.J(3, (xbe)new wzy(c2), a);
                }
            }
            return;
        }
        final byte[] b4 = b.b;
        wzy wzy;
        if (b4 != null) {
            wzy = new wzy(b4);
        }
        else {
            final xbg c3 = b.c;
            c3.getClass();
            wzy = new wzy(c3);
        }
        ((wzr)this.c).C((xbe)wzy);
        if (s != null) {
            this.c.q(s);
        }
        this.c.w((xbe)wzy, this.b.a(null));
    }
    
    public final void b(final xbg xbg, final Optional optional, final alji alji) {
        this.c.b(xbg, (aisc)optional.orElse((Object)null), alji);
        this.a = true;
    }
    
    public final void c() {
        this.c.y();
        this.a = false;
    }
    
    public final void d(final Optional optional) {
        Optional.ofNullable((Object)this.c.f((aisc)optional.orElse((Object)null)));
    }
}
