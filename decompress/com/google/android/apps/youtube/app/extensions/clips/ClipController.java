// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.clips;

import java.util.function.Consumer;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import java.util.List;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import java.util.concurrent.Executor;

public class ClipController implements ktj, tfh, grz, gsb, grv
{
    public static final Long a;
    private final atjj A;
    private final atjj B;
    private final arhr C;
    private final atjj D;
    private final Executor E;
    private final aujp F;
    private final asib G;
    private String H;
    private boolean I;
    private long J;
    public final tdz b;
    public final atjj c;
    public final atjj d;
    public final atjj e;
    public aioe f;
    public gtb g;
    public abul h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public long s;
    public ainb t;
    public Optional u;
    public Optional v;
    public long w;
    public boolean x;
    public String y;
    private final atjj z;
    
    static {
        a = -18372402L;
    }
    
    public ClipController(final atjj z, final atjj c, final atjj a, final atjj b, final atjj d, final arhr c2, final atjj e, final tdz b2, final atjj d2, final Executor e2, final aujp f) {
        this.f = null;
        this.h = (abul)new abuj();
        this.H = "";
        this.l = false;
        this.m = false;
        this.n = false;
        this.I = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = "";
        this.s = Long.MAX_VALUE;
        this.J = Long.MIN_VALUE;
        this.u = Optional.empty();
        this.v = Optional.empty();
        this.w = 0L;
        this.x = false;
        this.y = "NO_CLIP_ID";
        this.z = z;
        this.c = c;
        this.A = a;
        this.B = b;
        this.d = d;
        this.C = c2;
        this.e = e;
        this.b = b2;
        this.D = d2;
        this.E = e2;
        this.F = f;
        this.G = new asib();
    }
    
    private final void B(final boolean l) {
        this.l = l;
        if (l) {
            this.v();
        }
        else {
            ((aaxs)this.z.a()).a();
        }
        final gtb g = this.g;
        if (g != null && !l) {
            final gtn d = g.D;
            if (d != null) {
                d.an();
            }
        }
    }
    
    public final boolean A() {
        return this.h.f() > 0L;
    }
    
    @Override
    public final void c(final fkg fkg) {
        final PlaybackStartDescriptor a = fkg.a.a;
        final aioe b = a.b;
        if (b != null) {
            if (((agzd)b).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                final apqg apqg = (apqg)((agzd)a.b).rr((agyr)WatchEndpointOuterClass.watchEndpoint);
                if ((apqg.b & 0x20000000) != 0x0) {
                    appw appw;
                    if ((appw = apqg.v) == null) {
                        appw = appw.a;
                    }
                    ainb t;
                    if ((t = appw.b) == null) {
                        t = ainb.a;
                    }
                    this.t = t;
                    return;
                }
                this.t = null;
            }
        }
    }
    
    @Override
    public final void d(final fkg fkg) {
        this.H = fkg.a.a.k();
    }
    
    public final long j(final long n) {
        long g;
        final long n2 = g = this.h.g();
        if (!this.k) {
            g = n2 - n / 2L;
        }
        final long n3 = n / 2L;
        long n4 = g;
        if (g - n3 < 0L) {
            n4 = 0L;
        }
        final long f = this.h.f();
        if (n3 + n4 > f) {
            return f - n;
        }
        return n4;
    }
    
    public final String k() {
        return this.y;
    }
    
    public final void l() {
        this.u("-");
        this.f = null;
        this.t = null;
        this.b.d((Object)new abch(abcg.e, (List)afcr.q()));
        this.b.d((Object)new abch(abcg.d, (List)afcr.q()));
    }
    
    public final void m(final ainb ainb, final String r) {
        if (this.j == 0) {
            if (!r.equals(this.r)) {
                ((aaxs)this.z.a()).b(ainb.e, ainb.f);
                if ((ainb.b & 0x10) != 0x0) {
                    aioe f;
                    if ((f = ainb.g) == null) {
                        f = aioe.a;
                    }
                    this.f = f;
                }
                this.r = r;
                this.s = ainb.e;
                this.J = ainb.f;
                this.I = false;
                String d;
                if ((ainb.b & 0x2) != 0x0) {
                    d = ainb.d;
                }
                else {
                    d = "NO_CLIP_ID";
                }
                this.y = d;
            }
        }
    }
    
    public final void n(final String... array) {
        for (final String d : array) {
            final agza builder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
            builder.copyOnWrite();
            final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.instance;
            d.getClass();
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = d;
            final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.build();
            final vax vax = (vax)this.c.a();
            if (vax != null) {
                final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                agzc.e((agyr)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
                vax.a((aioe)agzc.build());
            }
        }
        this.l();
    }
    
    public final void o() {
        this.I = true;
    }
    
    public final void oS(final aum aum) {
        final jdt jdt = (jdt)this.A.a();
        this.G.c(jdt.I((aexg)gku.j, (aexg)gku.i).j(aajj.r(1)).am((asix)new grs(this, 1), (asix)gpa.i));
        this.G.c(jdt.z().am((asix)new grs(this, 0), (asix)gpa.i));
        this.G.c(jdt.B().am((asix)new grs(this, 2), (asix)gpa.i));
        this.G.c(jdt.w().am((asix)new grs(this, 3), (asix)gpa.i));
        this.G.c(((asgt)jdt.q().e).am((asix)new grs(this, 4), (asix)gpa.i));
        this.G.c(((asgt)jdt.q().k).am((asix)new grs(this, 5), (asix)gpa.i));
        this.G.c(((asgt)jdt.q().a).am((asix)new gly(this, 16), (asix)gpa.i));
        ((ktk)this.B.a()).a(this);
        ((abgp)this.C.a()).g();
        this.G.c(((uyi)this.D.a()).l(45356829L).aC((asix)new gly(this, 17), (asix)gpa.i));
        this.G.c(((uyi)this.D.a()).l(45357323L).aC((asix)new gly(this, 18), (asix)gpa.i));
        this.G.c(((uyi)this.D.a()).l(45357621L).aC((asix)new gly(this, 19), (asix)gpa.i));
        this.G.c(((uyi)this.D.a()).l(45358832L).aC((asix)new gly(this, 20), (asix)gpa.i));
    }
    
    public final void oW(final aum aum) {
        this.l();
        this.G.b();
        ((ktk)this.B.a()).b(this);
        ((abgp)this.C.a()).p.b();
        this.u = Optional.empty();
        this.v = Optional.empty();
    }
    
    public final void p() {
        this.B(false);
        if (this.x && this.w != ClipController.a) {
            this.E.execute(aesm.h((Runnable)new grt(this, 1)));
        }
    }
    
    public final void q() {
        this.B(true);
        if (this.x) {
            if (this.h.g() + 1000L >= this.h.f()) {
                this.w = Long.MAX_VALUE;
                return;
            }
            this.w = this.h.g();
        }
    }
    
    public final void r() {
        this.m = false;
        ((aaxs)this.z.a()).a();
        this.F.tr((Object)grx.a());
    }
    
    public final void s() {
        this.m = true;
        this.F.tr((Object)new grx(true, this.h.g(), this.s, this.J, this.h.a()));
    }
    
    public final void t(final Runnable runnable, final Runnable runnable2) {
        final gtb g = this.g;
        if (g != null && (g.A || g.B)) {
            runnable.run();
            return;
        }
        runnable2.run();
    }
    
    public final void u(final String s) {
        this.u.ifPresent((Consumer)new gft(s, 15));
    }
    
    public final void v() {
        if (this.l) {
            final gtb g = this.g;
            if (g != null) {
                g.m((abul)gry.e(this.j(g.d), this.h.h(), this.h.f()));
            }
        }
    }
    
    public final boolean w() {
        return !this.H.equals(this.i);
    }
    
    public final boolean x() {
        return this.j != 0;
    }
    
    public final boolean y() {
        return this.I;
    }
    
    public final boolean z() {
        return this.n;
    }
}
