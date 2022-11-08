// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Handler;

public final class h implements sgs
{
    public final g a;
    private final aceo b;
    private final Handler c;
    private szz d;
    private sib e;
    
    public h(final g a, final Handler c, final aceo b) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
        this.e = sib.a().a();
    }
    
    public final void pm(final sji sji) {
        this.a.u(sji);
    }
    
    public final void rP(final sib e) {
        final boolean a = e.a;
        if (a != this.e.a) {
            this.a.y(a);
        }
        final sif g = e.g;
        if (!g.a.equals((Object)this.e.g.a)) {
            final shz a2 = g.a;
            final aorm d = a2.d;
            this.a.p(a2.b);
            if (d == null) {
                final szz d2 = this.d;
                if (d2 != null) {
                    d2.d();
                    this.d = null;
                }
                this.a.q(null);
            }
            else {
                final Uri d3 = actc.D(d);
                if (d3 != null) {
                    final szz c = szz.c((szx)new hwo(this, 4));
                    this.d = c;
                    this.b.k(d3, (szx)taf.c(this.c, (szx)c));
                }
            }
        }
        final sid e2 = e.e;
        final int a3 = e2.a;
        final sid e3 = this.e.e;
        final int a4 = e3.a;
        final boolean equals = e2.c.equals((Object)e3.c);
        if (a3 != a4 || (equals ^ true)) {
            final g a5 = this.a;
            final int a6 = e2.a;
            final sav c2 = e2.c;
            a5.n(a6, c2.b, c2.c);
        }
        final boolean b = e2.b;
        if (b != this.e.e.b) {
            this.a.v(b);
        }
        final sij f = e.f;
        if (!f.c.toString().contentEquals(this.e.f.c)) {
            if (!f.c.toString().contentEquals("<NONE>")) {
                this.a.A(f.c);
            }
        }
        final sim c3 = e.c;
        final int d4 = c3.d;
        if (d4 != this.e.c.d) {
            if (d4 != 0) {
                if (d4 != 1) {
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
        final boolean e4 = c3.e;
        if (e4 != this.e.c.e) {
            this.a.s(e4);
        }
        final int f2 = c3.f;
        if (f2 != this.e.c.f && c3.d == 0) {
            this.a.o(f2);
        }
        this.e = e;
    }
}
