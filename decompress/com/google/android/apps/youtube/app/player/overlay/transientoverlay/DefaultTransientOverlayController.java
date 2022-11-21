// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.transientoverlay;

import j$.util.Optional;

public final class DefaultTransientOverlayController implements lao, jdx
{
    public final iyo a;
    public final askz b;
    public final askz c;
    public final atlt d;
    public final atlt e;
    public final atlt f;
    private final abqz g;
    private final ivf h;
    private final atlt i;
    private final aske j;
    private final aske k;
    private final aske l;
    private final ive m;
    private final aslm n;
    private boolean o;
    
    public DefaultTransientOverlayController(final abqz g, final ivf h, final iyo a, final askz b, final askz c) {
        this.g = g;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.m = (ive)new jdt(this);
        this.n = new aslm();
        final atlt al = ((atlt)atls.aF((Object)Optional.empty())).aL();
        this.d = al;
        final atlt al2 = ((atlt)atlv.aE()).aL();
        this.i = al2;
        final Boolean value = false;
        final atlt al3 = ((atlt)atls.aF((Object)value)).aL();
        this.e = al3;
        final atlt al4 = ((atlt)atls.aF((Object)value)).aL();
        this.f = al4;
        final aske p5 = aske.e((aumz)g.p().c, g.v().L((asmn)jdb.d), (asme)ivv.m).p();
        final aske e = aske.e((aumz)al4, (aumz)al3, (asme)ivv.j);
        final aske p6 = aske.N((aumz)al2, aske.e(e, p5, (asme)ivv.k)).p();
        this.j = aske.e(aske.O((aumz)al, p5.Y((asmn)new jbl(e, 7)), g.Q().L((asmn)jdb.g).af(p6, (asme)ivv.n).B((asmo)iuv.m).L((asmn)jdb.h)), p6, (asme)ivv.l).B((asmo)iuv.k).Y((asmn)new jbl(this, 8));
        final aske y = ((aske)al).B((asmo)iuv.j).Y((asmn)jdb.c);
        this.k = y;
        this.l = y.L((asmn)jdb.e).V();
        this.o = false;
    }
    
    public final tik g() {
        return tik.a;
    }
    
    public final aske j() {
        return this.l;
    }
    
    public final void k() {
        this.i.tt((Object)jdw.c);
    }
    
    public final void l(final long n, final long n2, final long n3, final jcp jcp) {
        this.d.tt((Object)Optional.of((Object)new jdu(n, n2, n3, jcp)));
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void m(final int n) {
        final boolean o = n != 0;
        if (this.o == o) {
            return;
        }
        if (o) {
            this.h.a(this.m);
            this.n.f(this.k.am((asmi)new jds(this, 1)), this.j.al());
        }
        else {
            this.h.b(this.m);
            this.n.b();
            this.d.tt((Object)Optional.empty());
        }
        this.o = o;
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
        this.h.b(this.m);
        this.n.b();
        this.o = false;
    }
    
    public final void oT(final aup aup) {
    }
    
    public final void oU() {
        tgj.h((tim)this);
    }
    
    public final void oX() {
        tgj.g((tim)this);
    }
    
    public final void oY(final aup aup) {
    }
}
