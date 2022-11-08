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

public class OfflineModeChangedRefreshController implements tfh, fen
{
    private static final Duration c;
    public volatile int a;
    public volatile abij b;
    private final ggs d;
    private final fjp e;
    private final fnt f;
    private final abno g;
    private final abni h;
    private final ljz i;
    private final abns j;
    private final asib k;
    private final hyr l;
    private final hyr m;
    private final arud n;
    private final sin o;
    private final elw p;
    private final fzo q;
    
    static {
        c = Duration.ofMillis(50L);
    }
    
    public OfflineModeChangedRefreshController(final ggs d, final fjp e, final fnt f, final arud n, final abno g, final abni h, final elw p19, final ljz i, final abns j, final hyr m, final fzo q, final hyr l, final sin o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.k = new asib();
        this.a = 0;
        this.b = abij.a;
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
        final ggh ggh = (ggh)(f = this.d.f());
        if (((Class)this.m.a).isInstance(ggh)) {
            f = ggh.og().f("primary_fragment_tag");
        }
        br br = f;
        if (((Class)this.l.a).isInstance(f)) {
            final br br2 = (br)Optional.ofNullable((Object)f).filter((Predicate)new fqe(hxg.class, 14)).map((Function)new hqf(hxg.class, 6)).map((Function)huy.l).orElse((Object)null);
            br = f;
            if (br2 instanceof ggh) {
                br = br2;
            }
        }
        if (((Class)this.q.b).isInstance(br)) {
            final Duration c = OfflineModeChangedRefreshController.c;
            if (br instanceof hup) {
                final hup hup = (hup)br;
                if (hup.ar() && hup.mI() != null) {
                    final View o = br.O;
                    hup.getClass();
                    o.postDelayed((Runnable)new hmi(hup, 20), c.toMillis());
                }
            }
        }
        if (this.e.j().i()) {
            if (this.a == 8 || this.a == 4) {
                b2 = true;
            }
            if (this.e.j().i() && b2) {
                final Object a = this.p.a;
                if (a != null && ((lgq)a).i() == 2) {
                    this.h.o();
                    this.g.a();
                    return;
                }
                if (this.g.T()) {
                    if (this.b != abij.c) {
                        alvs alvs;
                        if ((alvs = this.n.f().e) == null) {
                            alvs = alvs.a;
                        }
                        if (alvs.U) {
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
                    final lcq j = ((lgq)a2).j();
                    if (j != null) {
                        final WatchNextResponseModel d = j.d();
                        if (d != null) {
                            final aioe c2 = d.c;
                            if (c2 != null && ((agzd)c2).rs((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                                this.g.ag();
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void oS(final aum aum) {
        this.k.c(((asgt)this.j.q().l).am((asix)new hzh(this, 13), (asix)hnn.j));
        final asib k = this.k;
        asic asic;
        if (((uyi)this.j.cd().h).bx()) {
            asic = this.j.R().am((asix)new hzh(this, 14), (asix)hnn.j);
        }
        else {
            asic = this.j.Q().R().P(ashw.a()).am((asix)new hzh(this, 14), (asix)hnn.j);
        }
        k.c(asic);
        this.o.j((fen)this);
    }
    
    public final void oW(final aum aum) {
        this.k.b();
        this.o.k((fen)this);
    }
}
