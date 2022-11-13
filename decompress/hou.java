import java.util.Map;
import android.view.accessibility.AccessibilityManager;
import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hou implements abps
{
    public Optional a;
    public final how b;
    
    public hou(final how b) {
        this.b = b;
        this.a = Optional.empty();
    }
    
    final void a(final aanw aanw) {
        this.a = Optional.empty();
        Optional.ofNullable((Object)how.aK(this.b.d.e())).ifPresent((Consumer)new hoa(aanw, 8));
        final Optional ofNullable = Optional.ofNullable((Object)this.b.aN());
        final int a = aanw.a();
        if (a != 5) {
            if (a != 7) {
                if (a != 8) {
                    return;
                }
                synchronized (this.b.bF) {
                    final how b = this.b;
                    b.bI = true;
                    b.bb();
                    monitorexit(this.b.bF);
                    this.b.ag.g(3);
                    this.b.bq((Runnable)new hol(this, 5));
                    return;
                }
            }
            if (!this.b.bd.isPresent()) {
                if (this.b.bD.isPresent() && ((String)((cyb)this.b.bD.get()).a).equals(aanw.b())) {
                    this.b.bD = Optional.empty();
                    this.b.bK(ttl.y(2), true);
                    return;
                }
                this.a = Optional.of((Object)aanw);
                ofNullable.ifPresent((Consumer)gyr.m);
            }
            else {
                ansi ansi;
                if ((ansi = ansi.b(((akqn)this.b.bd.get()).j)) == null) {
                    ansi = ansi.a;
                }
                if (ansi == ansi.c) {
                    this.b.aq.Z(0L);
                    final Optional at = this.b.aT();
                    if (at.isPresent()) {
                        final abem bw = this.b.bW;
                        final String s = (String)at.get();
                        if (bw.a && ((Map)bw.b).containsKey(s)) {
                            final lxk lxk = ((Map<K, lxk>)bw.b).get(s);
                            ++lxk.a;
                        }
                    }
                    ofNullable.ifPresent((Consumer)gyr.n);
                    final boolean o = this.b.d.o();
                    if ((((akqn)this.b.bd.get()).b & 0x8) == 0x0) {
                        if (!o) {
                            final hnm ao = this.b.ao;
                            if (ao.d() && ao.c.b() && !ao.h) {
                                final AccessibilityManager e = ao.e;
                                if (e == null || e.isTouchExplorationEnabled()) {
                                    ao.a();
                                    return;
                                }
                                if (!ao.h) {
                                    ao.h = true;
                                    ao.c.c();
                                }
                                hnu.f(ao.d, true);
                                ao.c(false);
                                final int i = ao.i;
                                if (i > 0) {
                                    ao.d.postDelayed((Runnable)new hol(ao, 1), (long)i);
                                }
                                if (ao.f != null && ao.a == 1) {
                                    ao.a = 3;
                                    ao.b.pF().t((wzz)new wyt(ao.f), (alhi)null);
                                }
                            }
                        }
                    }
                }
                else {
                    ansi ansi2;
                    if ((ansi2 = ansi.b(((akqn)this.b.bd.get()).j)) == null) {
                        ansi2 = ansi.a;
                    }
                    if (ansi2 != ansi.d) {
                        this.b.bc();
                    }
                }
            }
        }
        else if (this.b.bs()) {
            final how b2 = this.b;
            final hov bl = b2.bl;
            if (bl != null && bl.b) {
                bl.b = false;
                b2.al.a();
            }
        }
    }
    
    @Override
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().f).an((asjm)new hom(this, 5), (asjm)hot.a), ((ashi)abpu.p().l).an((asjm)new hom(this, 6), (asjm)hot.a), ((ashi)abpu.p().j).an((asjm)new hom(this, 7), (asjm)hot.a) };
    }
}
