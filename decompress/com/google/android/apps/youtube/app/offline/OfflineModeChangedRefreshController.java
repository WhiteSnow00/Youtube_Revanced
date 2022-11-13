// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.offline;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.view.View;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import j$.time.Duration;

public class OfflineModeChangedRefreshController implements thl, feu
{
    private static final Duration c;
    public volatile int a;
    public volatile abkb b;
    private final ghb d;
    private final fjv e;
    private final fny f;
    private final abpq g;
    private final abpl h;
    private final llb i;
    private final abpu j;
    private final asiq k;
    private final hzn l;
    private final hzn m;
    private final arwh n;
    private final skt o;
    private final elx p;
    private final fzw q;
    
    static {
        c = Duration.ofMillis(50L);
    }
    
    public OfflineModeChangedRefreshController(final ghb d, final fjv e, final fny f, final arwh n, final abpq g, final abpl h, final elx p19, final llb i, final abpu j, final hzn m, final fzw q, final hzn l, final skt o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.k = new asiq();
        this.a = 0;
        this.b = abkb.a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.n = n;
        this.g = g;
        this.h = h;
        this.p = p19;
        this.i = i;
        this.j = j;
        this.m = m;
        this.q = q;
        this.l = l;
        this.o = o;
    }
    
    public final void b(final boolean b) {
        boolean b2 = false;
        if (b) {
            this.i.k(false);
            return;
        }
        this.i.k(true);
        if (this.d.d() == null) {
            return;
        }
        this.d.s();
        br f;
        final ggq ggq = (ggq)(f = this.d.f());
        if (((Class)this.m.a).isInstance(ggq)) {
            f = ggq.og().f("primary_fragment_tag");
        }
        br br = f;
        if (((Class)this.l.a).isInstance(f)) {
            final br br2 = (br)Optional.ofNullable((Object)f).filter((Predicate)new fqn((Class)hyd.class, 14)).map((Function)new hra((Class)hyd.class, 6)).map((Function)hvv.l).orElse((Object)null);
            br = f;
            if (br2 instanceof ggq) {
                br = br2;
            }
        }
        if (((Class)this.q.b).isInstance(br)) {
            final Duration c = OfflineModeChangedRefreshController.c;
            if (br instanceof hvk) {
                final hvk hvk = (hvk)br;
                if (hvk.ar() && hvk.mI() != null) {
                    final View o = br.O;
                    hvk.getClass();
                    o.postDelayed((Runnable)new hol(hvk, 18), c.toMillis());
                }
            }
        }
        if (this.e.j().i()) {
            if (this.a == 8 || this.a == 4) {
                b2 = true;
            }
            if (this.e.j().i() && b2) {
                final Object a = this.p.a;
                if (a != null && ((lhq)a).i() == 2) {
                    this.h.o();
                    this.g.a();
                    return;
                }
                if (this.g.S()) {
                    if (this.b != abkb.c) {
                        alxw alxw;
                        if ((alxw = this.n.f().e) == null) {
                            alxw = alxw.a;
                        }
                        if (alxw.U) {
                            return;
                        }
                    }
                }
                this.f.a();
                this.g.a();
            }
            else {
                final Object a2 = this.p.a;
                if (a2 != null) {
                    final lds j = ((lhq)a2).j();
                    if (j != null) {
                        final WatchNextResponseModel d = j.d();
                        if (d != null) {
                            final aiqj c2 = d.c;
                            if (c2 != null && ((ahbc)c2).ry((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                                this.g.af();
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        this.k.c(((ashi)this.j.p().l).an((asjm)new iad(this, 12), (asjm)hot.i));
        final asiq k = this.k;
        asir asir;
        if (((vai)this.j.ci().g).bx()) {
            asir = this.j.Q().an((asjm)new iad(this, 13), (asjm)hot.i);
        }
        else {
            asir = this.j.P().R().P(asil.a()).an((asjm)new iad(this, 13), (asjm)hot.i);
        }
        k.c(asir);
        this.o.j((feu)this);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.k.b();
        this.o.k((feu)this);
    }
}
