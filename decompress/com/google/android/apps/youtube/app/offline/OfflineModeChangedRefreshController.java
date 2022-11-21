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

public class OfflineModeChangedRefreshController implements tio, fex
{
    private static final Duration c;
    public volatile int a;
    public volatile abli b;
    private final ghf d;
    private final fjy e;
    private final fob f;
    private final abqv g;
    private final abqq h;
    private final llo i;
    private final abqz j;
    private final aslm k;
    private final hzw l;
    private final hzw m;
    private final arzb n;
    private final slt o;
    private final ema p;
    private final gab q;
    
    static {
        c = Duration.ofMillis(50L);
    }
    
    public OfflineModeChangedRefreshController(final ghf d, final fjy e, final fob f, final arzb n, final abqv g, final abqq h, final ema p19, final llo i, final abqz j, final hzw m, final gab q, final hzw l, final slt o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.k = new aslm();
        this.a = 0;
        this.b = abli.a;
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
    
    public final tik g() {
        return tik.b;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oJ(final boolean b) {
        boolean b2 = false;
        if (b) {
            this.i.k(false);
            return;
        }
        this.i.k(true);
        if (this.d.d() == null) {
            return;
        }
        this.d.t();
        ggv f;
        final ggv ggv = f = this.d.f();
        if (((Class)this.m.a).isInstance(ggv)) {
            f = (ggv)((br)ggv).oc().f("primary_fragment_tag");
        }
        ggv ggv2 = f;
        if (((Class)this.l.a).isInstance(f)) {
            final br br = (br)Optional.ofNullable((Object)f).filter((Predicate)new fqp((Class)hyj.class, 14)).map((Function)new hri((Class)hyj.class, 6)).map((Function)hwc.m).orElse((Object)null);
            ggv2 = f;
            if (br instanceof ggv) {
                ggv2 = (ggv)br;
            }
        }
        if (((Class)this.q.b).isInstance(ggv2)) {
            final Duration c = OfflineModeChangedRefreshController.c;
            if (ggv2 instanceof hvs) {
                final hvs hvs = (hvs)ggv2;
                if (hvs.ar() && hvs.mE() != null) {
                    final View o = ((br)ggv2).O;
                    hvs.getClass();
                    o.postDelayed((Runnable)new hou(hvs, 17), c.toMillis());
                }
            }
        }
        if (this.e.j().i()) {
            if (this.a == 8 || this.a == 4) {
                b2 = true;
            }
            if (this.e.j().i() && b2) {
                final Object a = this.p.a;
                if (a != null && ((lhy)a).i() == 2) {
                    this.h.o();
                    this.g.a();
                    return;
                }
                if (this.g.U()) {
                    if (this.b != abli.c) {
                        alzw alzw;
                        if ((alzw = this.n.f().e) == null) {
                            alzw = alzw.a;
                        }
                        if (alzw.U) {
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
                    final lea j = ((lhy)a2).j();
                    if (j != null) {
                        final WatchNextResponseModel d = j.d();
                        if (d != null) {
                            final aisc c2 = d.c;
                            if (c2 != null && ((ahcu)c2).ry((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
                                this.g.ah();
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.k.c(((aske)this.j.p().l).an((asmi)new iam(this, 14), (asmi)hoq.j));
        final aslm k = this.k;
        asln asln;
        if (((vbs)this.j.cg().g).bA()) {
            asln = this.j.Q().an((asmi)new iam(this, 15), (asmi)hoq.j);
        }
        else {
            asln = this.j.P().R().P(aslh.a()).an((asmi)new iam(this, 15), (asmi)hoq.j);
        }
        k.c(asln);
        this.o.j((fex)this);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.k.b();
        this.o.k((fex)this);
    }
}
