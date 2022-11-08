import android.view.KeyEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhk implements hhm
{
    public final /* synthetic */ ucx a;
    private final /* synthetic */ int b;
    
    public hhk(final hbl a, final int b) {
        this.b = b;
        this.a = (ucx)a;
    }
    
    public hhk(final hhl a, final int b) {
        this.b = b;
        this.a = (ucx)a;
    }
    
    public final boolean a() {
        if (this.b != 0) {
            final hbl hbl = (hbl)this.a;
            final cl supportFragmentManager = hbl.od().getSupportFragmentManager();
            final int a = supportFragmentManager.a();
            final boolean b = true;
            boolean b2;
            if (a > 0) {
                supportFragmentManager.I();
                b2 = b;
            }
            else {
                final br e = hbl.og().e(2131430844);
                if (e instanceof hbg) {
                    if (!hbl.ax) {
                        hbl.p(-1, false, avt.Q(hbl.r(), hbl.as, 22156));
                        b2 = b;
                    }
                    else {
                        final hbk an = hbl.an;
                        b2 = b;
                        if (an != null) {
                            an.g(false);
                            b2 = b;
                        }
                    }
                }
                else if (e instanceof gvs) {
                    ((gvs)e).a().l();
                    b2 = b;
                }
                else if (e instanceof gxr) {
                    ((gxr)e).a().i();
                    b2 = b;
                }
                else if (e instanceof hea) {
                    ((hea)e).d();
                    b2 = b;
                }
                else if (e instanceof hek) {
                    ((hek)e).r();
                    b2 = b;
                }
                else if (e instanceof hef) {
                    ((hef)e).r(apmt.e);
                    b2 = b;
                }
                else if (e instanceof hfl) {
                    ((hfl)e).aM();
                    b2 = b;
                }
                else {
                    if (e instanceof gxi) {
                        final br n = hbl.n();
                        if (n != null) {
                            final ct i = hbl.og().i();
                            hbl.aO("loadingFragment");
                            i.n(n);
                            i.d();
                        }
                    }
                    b2 = false;
                }
            }
            return b2;
        }
        return ((hhl)this.a).bj();
    }
    
    public final boolean b(final int n, final KeyEvent keyEvent) {
        final int b = this.b;
        boolean a = true;
        if (b != 0) {
            final hbl hbl = (hbl)this.a;
            final br e = hbl.og().e(2131430844);
            if (e != null && hbl.ba(e)) {
                final gwr at = ((gvs)e).a().at;
                if (at != null && !at.d && at.a.a(n, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
        final br e2 = ((hhl)this.a).og().e(2131430844);
        if (e2.aw() && e2 instanceof hhi) {
            final hhi hhi = (hhi)e2;
            if (!hhi.aY()) {
                final hiu ao = hhi.ao;
                if (ao != null) {
                    a = ao.a(n, keyEvent);
                    return a;
                }
                if (n == 24 || n == 25) {
                    keyEvent.startTracking();
                    return a;
                }
            }
        }
        a = false;
        return a;
    }
    
    public final boolean c(final int n) {
        final int b = this.b;
        boolean d = true;
        if (b != 0) {
            final hbl hbl = (hbl)this.a;
            final br e = hbl.og().e(2131430844);
            if (e != null && hbl.ba(e)) {
                final gwr at = ((gvs)e).a().at;
                if (at != null && !at.d && at.a.d(n)) {
                    return true;
                }
            }
            return false;
        }
        final br e2 = ((hhl)this.a).og().e(2131430844);
        if (e2.aw() && e2 instanceof hhi) {
            final hhi hhi = (hhi)e2;
            if (!hhi.aY()) {
                final hiu ao = hhi.ao;
                if (ao != null) {
                    d = ao.d(n);
                    return d;
                }
                if (n == 24 || n == 25) {
                    hhi.aW();
                    hhi.ap = true;
                    return d;
                }
            }
        }
        d = false;
        return d;
    }
    
    public final boolean d(final int n) {
        final int b = this.b;
        boolean g = true;
        if (b != 0) {
            final hbl hbl = (hbl)this.a;
            final br e = hbl.og().e(2131430844);
            if (e != null && hbl.ba(e)) {
                final gwr at = ((gvs)e).a().at;
                if (at != null && !at.d && at.a.g(n)) {
                    return true;
                }
            }
            return false;
        }
        final br e2 = ((hhl)this.a).og().e(2131430844);
        if (e2.aw() && e2 instanceof hhi) {
            final hhi hhi = (hhi)e2;
            if (!hhi.aY()) {
                final hiu ao = hhi.ao;
                if (ao != null) {
                    g = ao.g(n);
                    return g;
                }
                if (n == 24 || n == 25) {
                    if (hhi.ap) {
                        hhi.ap = false;
                    }
                    else if (!hhi.an.L()) {
                        hhi.aW();
                        return g;
                    }
                    hhi.aP();
                    return g;
                }
            }
        }
        g = false;
        return g;
    }
}
