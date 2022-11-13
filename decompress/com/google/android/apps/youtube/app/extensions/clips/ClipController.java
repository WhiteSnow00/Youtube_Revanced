// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.clips;

import android.support.v7.widget.RecyclerView;
import java.util.function.Consumer;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import java.util.List;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import java.util.concurrent.Executor;

public class ClipController implements kul, thl, gsh, gsk, gsd
{
    public static final Long a;
    private final atke A;
    private final atke B;
    private final arkg C;
    private final atke D;
    private final Executor E;
    private final aukf F;
    private final asiq G;
    private String H;
    private boolean I;
    private long J;
    public final tgd b;
    public final atke c;
    public final atke d;
    public final atke e;
    public aiqj f;
    public gtk g;
    public abwp h;
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
    public aipg t;
    public Optional u;
    public Optional v;
    public long w;
    public boolean x;
    public String y;
    private final atke z;
    
    static {
        a = -18372402L;
    }
    
    public ClipController(final atke z, final atke c, final atke a, final atke b, final atke d, final arkg c2, final atke e, final tgd b2, final atke d2, final Executor e2, final aukf f) {
        this.f = null;
        this.h = (abwp)new abwn();
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
        this.G = new asiq();
    }
    
    private final void B(final boolean l) {
        this.l = l;
        if (l) {
            this.v();
        }
        else {
            ((aazo)this.z.a()).a();
        }
        final gtk g = this.g;
        if (g != null && !l) {
            final gtw d = g.D;
            if (d != null) {
                ((RecyclerView)d).an();
            }
        }
    }
    
    public final boolean A() {
        return this.h.f() > 0L;
    }
    
    public final void c(final fkn fkn) {
        final PlaybackStartDescriptor a = fkn.a.a;
        final aiqj b = a.b;
        if (b != null) {
            if (((ahbc)b).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                final apsk apsk = (apsk)((ahbc)a.b).rx((ahaq)WatchEndpointOuterClass.watchEndpoint);
                if ((apsk.b & 0x40000000) != 0x0) {
                    apsa apsa;
                    if ((apsa = apsk.v) == null) {
                        apsa = apsa.a;
                    }
                    aipg t;
                    if ((t = apsa.b) == null) {
                        t = aipg.a;
                    }
                    this.t = t;
                    return;
                }
                this.t = null;
            }
        }
    }
    
    public final void d(final fkn fkn) {
        this.H = fkn.a.a.k();
    }
    
    public final thh g() {
        return thh.b;
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
        this.b.d((Object)new abeb(abea.e, (List)afeq.q()));
        this.b.d((Object)new abeb(abea.d, (List)afeq.q()));
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m(final aipg aipg, final String r) {
        if (this.j == 0) {
            if (!r.equals(this.r)) {
                ((aazo)this.z.a()).b(aipg.e, aipg.f);
                if ((aipg.b & 0x10) != 0x0) {
                    aiqj f;
                    if ((f = aipg.g) == null) {
                        f = aiqj.a;
                    }
                    this.f = f;
                }
                this.r = r;
                this.s = aipg.e;
                this.J = aipg.f;
                this.I = false;
                String d;
                if ((aipg.b & 0x2) != 0x0) {
                    d = aipg.d;
                }
                else {
                    d = "NO_CLIP_ID";
                }
                this.y = d;
            }
        }
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n(final String... array) {
        for (int i = 0; i < array.length; ++i) {
            final String d = array[i];
            final ahaz builder = ((ahbh)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a).createBuilder();
            builder.copyOnWrite();
            final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.instance;
            d.getClass();
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = d;
            final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.build();
            final vcy vcy = (vcy)this.c.a();
            if (vcy != null) {
                final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                ahbb.e((ahaq)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, (Object)hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
                vcy.a((aiqj)((ahaz)ahbb).build());
            }
        }
        this.l();
    }
    
    public final void o() {
        this.I = true;
    }
    
    public final void oS(final aun aun) {
        final jet jet = (jet)this.A.a();
        this.G.c(jet.H((aezf)glc.j, (aezf)glc.i).j(aale.q(1)).an((asjm)new gsa(this, 0), (asjm)gpg.i));
        this.G.c(jet.y().an((asjm)new gsa(this, 2), (asjm)gpg.i));
        this.G.c(jet.A().an((asjm)new gsa(this, 3), (asjm)gpg.i));
        this.G.c(jet.v().an((asjm)new gsa(this, 4), (asjm)gpg.i));
        this.G.c(((ashi)jet.p().e).an((asjm)new gsa(this, 5), (asjm)gpg.i));
        this.G.c(((ashi)jet.p().k).an((asjm)new gsa(this, 6), (asjm)gpg.i));
        this.G.c(((ashi)jet.p().a).an((asjm)new gmf(this, 17), (asjm)gpg.i));
        ((kum)this.B.a()).a((kul)this);
        ((abij)this.C.a()).g();
        this.G.c(((vai)this.D.a()).l(45356829L).aI((asjm)new gmf(this, 18), (asjm)gpg.i));
        this.G.c(((vai)this.D.a()).l(45357323L).aI((asjm)new gmf(this, 19), (asjm)gpg.i));
        this.G.c(((vai)this.D.a()).l(45357621L).aI((asjm)new gmf(this, 20), (asjm)gpg.i));
        this.G.c(((vai)this.D.a()).l(45358832L).aI((asjm)new gsa(this, 1), (asjm)gpg.i));
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.l();
        this.G.b();
        ((kum)this.B.a()).b((kul)this);
        ((abij)this.C.a()).p.b();
        this.u = Optional.empty();
        this.v = Optional.empty();
    }
    
    public final void p() {
        this.B(false);
        if (this.x && this.w != ClipController.a) {
            this.E.execute(aeun.h((Runnable)new ght(this, 20)));
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
        ((aazo)this.z.a()).a();
        this.F.tu((Object)gsf.a());
    }
    
    public final void s() {
        this.m = true;
        this.F.tu((Object)new gsf(true, this.h.g(), this.s, this.J, this.h.a()));
    }
    
    public final void t(final Runnable runnable, final Runnable runnable2) {
        final gtk g = this.g;
        if (g != null && (g.A || g.B)) {
            runnable.run();
            return;
        }
        runnable2.run();
    }
    
    public final void u(final String s) {
        this.u.ifPresent((Consumer)new gga(s, 15));
    }
    
    public final void v() {
        if (this.l) {
            final gtk g = this.g;
            if (g != null) {
                g.m((abwp)gsg.e(this.j(g.d), this.h.h(), this.h.f()));
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
