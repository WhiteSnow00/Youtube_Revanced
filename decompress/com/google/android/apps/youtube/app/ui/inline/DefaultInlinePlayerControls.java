// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.inline;

public class DefaultInlinePlayerControls extends gec implements tfh, kas, abnq
{
    public final abno d;
    public final kab e;
    public final iqi f;
    private final fjp g;
    private final tdz h;
    private final abns i;
    private final asib j;
    private final fno k;
    private final fgn l;
    private final kam m;
    private final abpj n;
    
    public DefaultInlinePlayerControls(final abno d, final iqi f, final fjp g, final tdz h, final abns i, final fno k, final fgn l, final qv qv, final abpj n, final kam m, final byte[] array, final byte[] array2) {
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = l;
        this.n = n;
        this.m = m;
        this.j = new asib();
        this.e = new kab(this, qv, (byte[])null, (byte[])null);
    }
    
    private final boolean v() {
        return this.k.b == fnl.a && this.d.f();
    }
    
    protected final boolean l(final ged ged, final int n) {
        if (n == 3) {
            return this.v();
        }
        boolean b = true;
        if (n == 0) {
            if (!this.e.a) {
                return true;
            }
            if (this.m.a()) {
                return true;
            }
            if (!this.v()) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = ((asgt)abns.q().b).am((asix)new jyo(this, 6), (asix)jky.m);
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new jyo(this, 7), (asix)jky.m);
        }
        else {
            asic = abns.Q().R().P(ashw.a()).am((asix)new jyo(this, 7), (asix)jky.m);
        }
        return new asic[] { am, asic };
    }
    
    public final String n() {
        return this.d.s();
    }
    
    public final void o() {
        this.d.g();
    }
    
    public final void oS(final aum aum) {
        this.j.f(this.lX(this.i));
    }
    
    public final void oW(final aum aum) {
        this.j.b();
    }
    
    public final void p() {
        this.d.a();
    }
    
    public final void q() {
        this.d.D();
    }
    
    public final void r() {
        this.d.ak(29);
    }
    
    public final void s() {
        this.d.ah();
    }
    
    public final boolean t() {
        return this.d.f();
    }
    
    public final void u(final fkg fkg) {
        if (!this.n.c()) {
            this.h.f((Object)new fid());
        }
        final wyn b = this.l.b(alkz.b);
        if (this.n.w()) {
            this.f.b().i(fkg, this.g.j(), b);
        }
        this.f.b().k(fkg, this.g.j(), false, b);
    }
}
