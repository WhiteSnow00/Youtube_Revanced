// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Handler;

public final class h implements sjw
{
    public final g a;
    private final acig b;
    private final Handler c;
    private tdi d;
    private slh e;
    
    public h(final g a, final Handler c, final acig b) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
        this.e = slh.a().a();
    }
    
    public final void po(final smo smo) {
        this.a.u(smo);
    }
    
    public final void rV(final slh e) {
        final boolean a = e.a;
        if (a != this.e.a) {
            this.a.y(a);
        }
        final sll g = e.g;
        if (!g.a.equals((Object)this.e.g.a)) {
            final slf a2 = g.a;
            final aowb d = a2.d;
            this.a.p(a2.b);
            if (d == null) {
                final tdi d2 = this.d;
                if (d2 != null) {
                    d2.b();
                    this.d = null;
                }
                this.a.q(null);
            }
            else {
                final Uri n = aamz.N(d);
                if (n != null) {
                    final tdi a3 = tdi.a((tdg)new hxt(this, 4));
                    this.d = a3;
                    this.b.k(n, (tdg)tdo.a(this.c, (tdg)a3));
                }
            }
        }
        final slj e2 = e.e;
        final int a4 = e2.a;
        final slj e3 = this.e.e;
        final int a5 = e3.a;
        final boolean equals = e2.c.equals((Object)e3.c);
        if (a4 != a5 || (equals ^ true)) {
            final g a6 = this.a;
            final int a7 = e2.a;
            final sdz c = e2.c;
            a6.n(a7, c.b, c.c);
        }
        final boolean b = e2.b;
        if (b != this.e.e.b) {
            this.a.v(b);
        }
        final slp f = e.f;
        if (!f.c.toString().contentEquals(this.e.f.c)) {
            if (!f.c.toString().contentEquals("<NONE>")) {
                this.a.A(f.c);
            }
        }
        final sls c2 = e.c;
        final int d3 = c2.d;
        if (d3 != this.e.c.d) {
            if (d3 != 0) {
                if (d3 != 1) {
                    this.a.x(false);
                    this.a.w(false);
                }
                else {
                    this.a.x(true);
                    this.a.w(true);
                }
            }
            else {
                this.a.x(true);
                this.a.w(false);
            }
        }
        final boolean e4 = c2.e;
        if (e4 != this.e.c.e) {
            this.a.s(e4);
        }
        final int f2 = c2.f;
        if (f2 != this.e.c.f && c2.d == 0) {
            this.a.o(f2);
        }
        this.e = e;
    }
}
