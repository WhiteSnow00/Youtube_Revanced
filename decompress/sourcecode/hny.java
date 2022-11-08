import java.util.Map;
import android.view.accessibility.AccessibilityManager;
import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hny implements abnq
{
    public Optional a;
    public final /* synthetic */ hoa b;
    
    public hny(final hoa b) {
        this.b = b;
        this.a = Optional.empty();
    }
    
    final void a(final aamc aamc) {
        this.a = Optional.empty();
        Optional.ofNullable((Object)hoa.aK(this.b.d.e())).ifPresent((Consumer)new hnr(aamc, 7));
        final Optional ofNullable = Optional.ofNullable((Object)this.b.aN());
        final int a = aamc.a();
        if (a != 5) {
            if (a != 7) {
                if (a != 8) {
                    return;
                }
                synchronized (this.b.bG) {
                    final hoa b = this.b;
                    b.bJ = true;
                    b.bb();
                    monitorexit(this.b.bG);
                    this.b.ag.g(3);
                    this.b.bq((Runnable)new hmi(this, 7));
                    return;
                }
            }
            if (!this.b.bf.isPresent()) {
                if (this.b.bE.isPresent() && ((String)((cya)this.b.bE.get()).a).equals(aamc.b())) {
                    this.b.bE = Optional.empty();
                    this.b.bK(trg.y(2), true);
                    return;
                }
                this.a = Optional.of((Object)aamc);
                ofNullable.ifPresent((Consumer)gyc.m);
            }
            else {
                anqf anqf;
                if ((anqf = anqf.b(((akok)this.b.bf.get()).j)) == null) {
                    anqf = anqf.a;
                }
                if (anqf == anqf.c) {
                    this.b.ar.aa(0L);
                    final Optional at = this.b.aT();
                    if (at.isPresent()) {
                        final abcr bv = this.b.bV;
                        final String s = (String)at.get();
                        if (bv.a && ((Map)bv.b).containsKey(s)) {
                            final lwf lwf = ((Map<K, lwf>)bv.b).get(s);
                            ++lwf.a;
                        }
                    }
                    ofNullable.ifPresent((Consumer)gyc.n);
                    final boolean o = this.b.d.o();
                    if ((((akok)this.b.bf.get()).b & 0x8) == 0x0) {
                        if (!o) {
                            final hms ap = this.b.ap;
                            if (ap.d() && ap.c.b() && !ap.h) {
                                final AccessibilityManager e = ap.e;
                                if (e == null || e.isTouchExplorationEnabled()) {
                                    ap.a();
                                    return;
                                }
                                if (!ap.h) {
                                    ap.h = true;
                                    ap.c.c();
                                }
                                iba.e(ap.d, true);
                                ap.c(false);
                                final int i = ap.i;
                                if (i > 0) {
                                    ap.d.postDelayed((Runnable)new hmi(ap, 2), (long)i);
                                }
                                if (ap.f != null && ap.a == 1) {
                                    ap.a = 3;
                                    ap.b.n().t((wxz)new wws(ap.f), (alff)null);
                                }
                            }
                        }
                    }
                }
                else {
                    anqf anqf2;
                    if ((anqf2 = anqf.b(((akok)this.b.bf.get()).j)) == null) {
                        anqf2 = anqf.a;
                    }
                    if (anqf2 != anqf.d) {
                        this.b.bc();
                    }
                }
            }
        }
        else if (this.b.bs()) {
            final hoa b2 = this.b;
            final hnz bm = b2.bm;
            if (bm != null && bm.b) {
                bm.b = false;
                b2.am.a();
            }
        }
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().f).am((asix)new hnq(this, 5), (asix)hnn.c), ((asgt)abns.q().l).am((asix)new hnq(this, 6), (asix)hnn.c), ((asgt)abns.q().j).am((asix)new hnq(this, 7), (asix)hnn.c) };
    }
}
