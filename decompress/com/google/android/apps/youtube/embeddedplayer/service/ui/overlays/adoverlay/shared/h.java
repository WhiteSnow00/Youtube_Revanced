// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Handler;

public final class h implements six
{
    public final g a;
    private final acgs b;
    private final Handler c;
    private tce d;
    private skh e;
    
    public h(final g a, final Handler c, final acgs b) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = b;
        this.e = skh.a().a();
    }
    
    public final void po(final sln sln) {
        this.a.u(sln);
    }
    
    public final void rV(final skh e) {
        final boolean a = e.a;
        if (a != this.e.a) {
            this.a.y(a);
        }
        final skl g = e.g;
        if (!g.a.equals((Object)this.e.g.a)) {
            final skf a2 = g.a;
            final aotp d = a2.d;
            this.a.p(a2.b);
            if (d == null) {
                final tce d2 = this.d;
                if (d2 != null) {
                    d2.d();
                    this.d = null;
                }
                this.a.q(null);
            }
            else {
                final Uri j = aald.J(d);
                if (j != null) {
                    final tce c = tce.c((tcc)new hxl(this, 4));
                    this.d = c;
                    this.b.k(j, (tcc)tck.c(this.c, (tcc)c));
                }
            }
        }
        final skj e2 = e.e;
        final int a3 = e2.a;
        final skj e3 = this.e.e;
        final int a4 = e3.a;
        final boolean equals = e2.c.equals((Object)e3.c);
        if (a3 != a4 || (equals ^ true)) {
            final g a5 = this.a;
            final int a6 = e2.a;
            final sda c2 = e2.c;
            a5.n(a6, c2.b, c2.c);
        }
        final boolean b = e2.b;
        if (b != this.e.e.b) {
            this.a.v(b);
        }
        final skp f = e.f;
        if (!f.c.toString().contentEquals(this.e.f.c)) {
            if (!f.c.toString().contentEquals("<NONE>")) {
                this.a.A(f.c);
            }
        }
        final sks c3 = e.c;
        final int d3 = c3.d;
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
