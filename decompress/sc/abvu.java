import java.util.Set;
import java.util.Observer;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.time.Duration;
import java.lang.ref.WeakReference;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvu implements abwl
{
    private static long f;
    public final abzl a;
    public final abvg b;
    public final abrz c;
    public final vaf d;
    public final agkz e;
    private final abvt g;
    private final abjj h;
    private final ynp i;
    private final abvh j;
    private final abkj k;
    private final oby l;
    private final Handler m;
    private boolean n;
    private final arwh o;
    private final abrj p;
    private final afhd q;
    
    public abvu(final ynp i, final abvt g, final agkz e, final abjj h, final abvh j, final abkj k, final abvg b, final oby l, final abzl a, final afhd q, final abrj p16, final vaf d, final arwh o, final byte[] array, final byte[] array2, final byte[] array3) {
        this.m = new Handler(Looper.getMainLooper());
        this.n = false;
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.q = q;
        this.e = e;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.p = p16;
        this.d = d;
        this.o = o;
        b.b = new WeakReference((T)a);
        final abrz m = a.k();
        this.c = m;
        if (abrj.B(d)) {
            m.r.c(m.d.Q().an(new abrx(m, 17), new abrx(m, 10)));
            m.r.c(m.e.Q().an(new abrx(m, 8), new abrx(m, 10)));
            m.r.c(m.f.Q().an(new abrx(m, 13), new abrx(m, 10)));
            m.r.c(m.g.Q().an(new abrx(m, 14), new abrx(m, 10)));
            m.r.c(m.h.Q().an(new abrx(m, 5), new abrx(m, 10)));
            m.r.c(m.k.Q().an(new abrx(m, 7), new abrx(m, 10)));
            m.r.c(m.j.Q().an(new abrx(m, 15), new abrx(m, 10)));
            m.r.c(m.s.c().an(new abrx(m, 16), new abrx(m, 10)));
            m.r.c(m.i.Q().an(new abrx(m, 9), new abrx(m, 10)));
            m.r.c(m.l.Q().an(new abrx(m, 12), new abrx(m, 10)));
            m.r.c(m.m.Q().an(new abrx(m, 6), new abrx(m, 10)));
            m.r.c(m.n.Q().an(new abrx(m, 11), new abrx(m, 10)));
            ahtv ahtv;
            if ((ahtv = abrz.c(m.t).q) == null) {
                ahtv = ahtv.a;
            }
            if (ahtv.b) {
                m.r.c(m.s.b().Q().an(new abrx(m, 4), new abrx(m, 10)));
            }
            ahtv ahtv2;
            if ((ahtv2 = abrz.c(m.t).q) == null) {
                ahtv2 = ahtv.a;
            }
            if (ahtv2.h) {
                m.r.c(m.p.Q().an(new abrx(m, 18), new abrx(m, 10)));
            }
        }
    }
    
    private final void B(final int n) {
        aakt.O(this.a, n);
        this.q.p(this.a, 4);
    }
    
    private final void C(long c) {
        this.a.ap().tu((Object)new aamd(aakt.L(this.i), c));
        this.a.i().m(c);
        c = this.a.l().c(c, false);
        this.g.d = c;
    }
    
    private final boolean D() {
        final anef a = abrj.A(this.d);
        boolean b = false;
        if (a != null && a.i) {
            return !this.n;
        }
        if (!this.q.i().e() && (!aakt.P(this.q.j()) || !this.q.i().a(new abke[] { abke.d }))) {
            if (!abrj.ah(this.o, aakt.Q(this.q.j()), aakt.P(this.q.j()))) {
                return b;
            }
            if (!this.q.i().a(new abke[] { abke.d })) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public final void A(final int n) {
        final zbr m = this.i.m();
        this.q.n(this.a, n, m.c, m.b, m.e, m.f);
    }
    
    public final void a(final long n) {
        final long c = this.l.c();
        if (this.D() && aakt.P(this.q.j())) {
            this.a.i().l();
            this.e.n(this.a.aa());
            this.q.l(abke.d);
        }
        else if (abrj.ah(this.o, aakt.Q(this.q.j()), aakt.P(this.q.j())) && this.D() && this.a.a() == 0) {
            this.a.i().l();
            this.e.n(this.a.aa());
            this.q.l(abke.d);
        }
        else if (abrj.ah(this.o, aakt.Q(this.q.j()), aakt.P(this.q.j())) && this.D() && this.a.a() == 1) {
            final PlayerResponseModel c2 = this.a.c();
            if (c2 != null && Math.abs(n - Duration.ofSeconds((long)c2.h()).toMillis()) <= 1000L) {
                aakt.O(this.a, 7);
                this.q.p(this.a, 2);
                this.q.k(false);
                this.q.p(this.a, 3);
                this.e.r(this.a);
            }
            else {
                zlm.b(zll.a, zlk.j, "Gaplessly transitioning away from an Ad before it ends.");
            }
        }
        final afhd q = this.q;
        final abzl a = this.a;
        q.n(a, 4, a.o().f, n, n, -1L);
        final abzs p = this.a.p().p(this.a.aa(), this.a.o().e);
        if (p != null) {
            this.a.av().tu((Object)new aand(p.e, c));
        }
    }
    
    public final PlayerResponseModel b() {
        return this.a.c();
    }
    
    public final abjt c() {
        return this.a.h();
    }
    
    public final void d() {
        if (this.D()) {
            if (abrj.ap(this.o)) {
                this.A(4);
            }
            this.B(5);
        }
    }
    
    public final void e(final FormatStreamModel formatStreamModel, final long n, final long n2, final yqb[] array) {
        for (final yqb yqb : array) {
            if ((aakt.P(this.q.j()) || aakt.Q(this.q.j())) && yqb.a.equals("http://youtube.com/streaming/metadata/segment/102015") && formatStreamModel.z()) {
                final yph c = yph.c(n2, yqb);
                if (c != null) {
                    this.m.post((Runnable)new abvs(this, c, 2));
                }
            }
        }
        final PlayerResponseModel b = this.b();
        if (b != null && b.m() != null && b.m().Y()) {
            final aalv aalv = new aalv(array, formatStreamModel, n, n2);
            this.a.f().a(aalv, this.a.p());
            this.a.ac().tu((Object)aalv);
        }
    }
    
    public final void f() {
        if (this.D()) {
            this.g.b();
            final afhd q = this.q;
            final abzl a = this.a;
            q.n(a, 4, -1L, aakt.J(a), aakt.J(this.a), -1L);
            final abqz i = this.a.i();
            final abrd b = i.b;
            if (b != null && i.f) {
                b.i();
            }
            final abrm d = i.d;
            if (d != null) {
                d.b();
            }
            final abri c = i.c;
            if (c != null) {
                c.c();
            }
            this.a.l().i();
            if (this.q.i().h()) {
                aakt.O(this.a, 7);
                this.q.p(this.a, 2);
                this.q.k(false);
                this.q.p(this.a, 3);
                if (!aakt.P(this.q.j())) {
                    this.e.r(this.a);
                }
            }
            else {
                final afhd q2 = this.q;
                Label_0331: {
                    if (q2.i() == abke.d) {
                        final abve abve = (abve)q2.a;
                        abve.g = abve.aB(false, false, true);
                    }
                    else {
                        if (this.a.p().i()) {
                            final PlayerResponseModel c2 = this.a.c();
                            if ((aakt.P(this.q.j()) && (c2 == null || c2.n() == null || !c2.n().D())) || !this.a.p().h(this.a.aa())) {
                                break Label_0331;
                            }
                        }
                        ((abve)this.q.a).T();
                    }
                }
                this.B(7);
            }
        }
    }
    
    public final void g(final zbq zbq) {
        this.j.t(zbq);
        if (zbq.w()) {
            this.q.o(1);
        }
        if (this.D()) {
            this.e.l(zbq, this.a);
            if (((abve)this.q.a).ar()) {
                return;
            }
            final abrj p = this.p;
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asjv.b((AtomicReference)((vai)p.d).l(45353689L).aH((asjm)new abja(atomicBoolean, 6)));
            final boolean b = atomicBoolean.get() && zbq.z() && this.l.c() - abvu.f > 60000L;
            final boolean equals = zbq.n().equals("staleconfig");
            final String s = null;
            final String s2 = null;
            final String s3 = null;
            if (!equals && !b) {
                if (zbq.m().equals("offline.partial.nocontent")) {
                    this.q.o(1);
                    this.g.b();
                    final abzl a = this.a;
                    aakt.N(a, a.o().g);
                    this.q.q(new abkh(15, false, ""));
                    final long l = aakt.L(this.i);
                    final long j = aakt.J(this.a);
                    final StringBuilder sb = new StringBuilder("currentPositionMs.");
                    sb.append(l);
                    sb.append(";durationMs.");
                    sb.append(j);
                    this.x("ppedb", sb.toString());
                    return;
                }
                if (!zbq.w()) {
                    return;
                }
                if (this.q.i().h() && !aakt.P(this.q.j())) {
                    this.q.k(true);
                }
                else {
                    final PlayerResponseModel b2 = this.b();
                    String k;
                    if (b2 != null) {
                        k = b2.K();
                    }
                    else {
                        k = null;
                    }
                    final abkj i = this.k;
                    final String m = zbq.m();
                    final boolean contains = m.contains("net.unavailable");
                    int n = 10;
                    int n2 = 0;
                    int n3 = 0;
                    boolean b3 = false;
                    String s4 = null;
                    Label_0758: {
                        Label_0420: {
                            if (!contains) {
                                Label_0450: {
                                    if (m.contains("offline.nocontent")) {
                                        n2 = 2132018004;
                                    }
                                    else {
                                        if (m.contains("net.connect") || m.contains("net.connect.timeout") || m.contains("net.dns")) {
                                            n2 = 2132020008;
                                            break Label_0420;
                                        }
                                        if (m.contains("net.retryexhausted") || m.contains("net.closed") || m.contains("net.read") || m.contains("net.read.timeout") || m.contains("net.timeout")) {
                                            n2 = 2132017784;
                                            break Label_0420;
                                        }
                                        if (m.startsWith("fmt.unplayable")) {
                                            n2 = 2132020019;
                                        }
                                        else if (m.startsWith("drm.unimplemented")) {
                                            n2 = 2132018014;
                                        }
                                        else if (m.startsWith("drm.unavailable")) {
                                            n2 = 2132017992;
                                        }
                                        else {
                                            final boolean startsWith = m.startsWith("drm.auth");
                                            n3 = 7;
                                            if (startsWith && zbq.j((Class)ypf.class) != null) {
                                                final ypf ypf = (ypf)zbq.j((Class)ypf.class);
                                                if (ypf != null) {
                                                    b3 = ypf.b();
                                                    if (!b3) {
                                                        n = 7;
                                                    }
                                                    else {
                                                        n = 9;
                                                    }
                                                    s4 = ypf.a();
                                                }
                                                else {
                                                    b3 = false;
                                                    s4 = s3;
                                                }
                                                final int n4 = 2132019299;
                                                n3 = n;
                                                n2 = n4;
                                                break Label_0758;
                                            }
                                            if (zbq.v()) {
                                                n2 = 2132019299;
                                                break Label_0450;
                                            }
                                            if (m.equals("policy.app")) {
                                                n2 = 2132019299;
                                                n3 = 14;
                                                break Label_0450;
                                            }
                                            n2 = 2132019299;
                                            break Label_0420;
                                        }
                                    }
                                    n3 = 10;
                                }
                                b3 = false;
                                s4 = s;
                                break Label_0758;
                            }
                            n2 = 2132017772;
                        }
                        n3 = 10;
                        b3 = true;
                        s4 = s;
                    }
                    if (s4 == null) {
                        s4 = i.b.getString(n2);
                    }
                    final abkh abkh = new abkh(n3, b3, 1, s4, (Throwable)null, k, m);
                    if (abkh.a && this.q.i().f()) {
                        aakt.N(this.a, aakt.L(this.i));
                    }
                    this.q.q(abkh);
                }
                this.g.b();
                this.B(8);
            }
            else {
                abvu.f = this.l.c();
                ((abve)this.q.a).an(0);
                final PlayerResponseModel b4 = this.b();
                String k2 = s2;
                if (b4 != null) {
                    k2 = b4.K();
                }
                if (k2 != null) {
                    this.a.ay().tu((Object)aanj.b(k2));
                }
            }
        }
    }
    
    public final void h(final ypj ypj) {
        this.a.i().g(ypj);
        final agkz e = this.e;
        final abzl a = this.a;
        final Iterator<Object> iterator = ((Set<Object>)e.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().i(ypj, a.aa());
        }
        a.ad().tu((Object)ypj);
        final zaa q = this.c.q;
        if (q != null && abrj.B(this.d)) {
            q.r(ypj);
        }
    }
    
    public final abwp i() {
        return (abwp)this.a.o();
    }
    
    public final void j(final long g, final long n) {
        aakt.M(this.a, n);
        this.a.o().g = g;
    }
    
    public final void k(final String s) {
        this.a.ai().tu((Object)aalx.b(s));
    }
    
    public final void l() {
        final long c = this.l.c();
        if (this.D()) {
            final aamn aamn = new aamn();
            aamn.b(c);
            this.a.al().tu((Object)aamn);
            final abqz i = this.a.i();
            final abrd b = i.b;
            if (b != null && i.f) {
                b.k();
            }
            final abri c2 = i.c;
            if (c2 != null && c2.i) {
                c2.y = apta.c;
                c2.a(false, c2.d.d());
                c2.i = false;
            }
            this.a.l().j();
            this.B(3);
        }
    }
    
    public final void m() {
        if (this.D()) {
            if (abrj.ap(this.o)) {
                this.A(4);
            }
            this.B(6);
        }
    }
    
    public final void n(long c) {
        if (this.D()) {
            this.a.ap().tu((Object)new aamd(aakt.L(this.i), c));
            this.a.i().m(c);
            c = this.a.l().c(c, false);
            this.g.d = c;
            this.B(10);
        }
    }
    
    public final void o(final float n) {
        final PlayerResponseModel c = this.q.j().c();
        final agkz e = this.e;
        final aamb aamb = new aamb(aakt.X(this.i, c).a(), c, n);
        final abzl a = this.a;
        final Iterator<Object> iterator = ((Set<Object>)e.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().P(aamb);
        }
        a.am().tu((Object)aamb);
    }
    
    public final void p() {
        final long c = this.l.c();
        final PlayerResponseModel b = this.b();
        if (aakt.S(this.h, b)) {
            this.i.H(16);
            return;
        }
        final long d = this.i.m().d;
        final boolean q = aakt.Q(this.a);
        long n = 0L;
        if (!q && d > 0L) {
            aakt.M(this.a, d);
        }
        aakt.N(this.a, this.i.m().b);
        this.q.o(3);
        if (!this.D() && !this.q.i().a(new abke[] { abke.g })) {
            return;
        }
        final abvu j = ((abve)this.q.a).j;
        final aamg aamg = null;
        VideoStreamingData n2;
        if (b != null) {
            n2 = b.n();
        }
        else {
            n2 = null;
        }
        boolean b2 = false;
        Label_0242: {
            if (b != null && b.m().aA()) {
                ajra ajra;
                if ((ajra = b.m().c.e) == null) {
                    ajra = ajra.b;
                }
                if (ajra.aZ) {
                    b2 = true;
                    break Label_0242;
                }
            }
            b2 = false;
        }
        this.h.r(abve.as(n2) || b2);
        this.q.m(this);
        if (j != this) {
            if (this.a.a() == 1) {
                ((abve)this.q.a).h(this.a.aa());
                this.q.l(abke.e);
                abve.aA(abka.e, this.a);
                final abzl i = this.q.j();
                if (b != null) {
                    this.a.i().h(i.aa(), b, this.a.aa(), this.a.a());
                }
            }
            else {
                final afhd q2 = this.q;
                ((abve)q2.a).h = null;
                q2.l(abke.h);
                if (abrj.ah(this.o, aakt.Q(this.q.j()), aakt.P(this.q.j()))) {
                    this.a.l().c(this.a.o().e, false);
                }
                if (b != null) {
                    this.a.i().i(this.a.aa(), b, this.a.a());
                }
            }
        }
        if (aakt.Q(this.a)) {
            final long b3 = this.i.m().b;
            if (b3 != -1L) {
                n = b3;
            }
            aakt.N(this.a, n);
        }
        if (b != null) {
            this.a.i().k(aakt.K(this.a), this.a.aa(), b, this.a.a());
        }
        if (abrj.ak(this.o)) {
            this.a.l().n();
        }
        this.g.a();
        aamg aamg2 = aamg;
        if (this.q.i().a(new abke[] { abke.e, abke.f })) {
            if (!this.q.i().d()) {
                this.q.l(abke.f);
                abve.aA(abka.f, this.a);
            }
            aakt.L(this.i);
            aamg2 = new aaml();
        }
        if (this.q.i().a(new abke[] { abke.h, abke.g, abke.i })) {
            if (!this.q.i().d()) {
                this.q.l(abke.i);
            }
            aakt.L(this.i);
            aamg2 = new aaml();
        }
        if (aamg2 != null) {
            aamg2.b(c);
            this.a.ak().tu((Object)aamg2);
        }
        this.B(2);
    }
    
    public final void q() {
        this.q.o(2);
        if (this.p.f()) {
            this.q.m(this);
        }
    }
    
    public final void r(final long n) {
        if (this.q.i().d()) {
            final aamq aamq = new aamq(aakt.L(this.i), this.q.i().a(new abke[] { abke.f }));
            if (n >= 0L) {
                aamq.i(n - this.l.c() + this.l.d());
                aamq.b(n);
            }
            else {
                aamq.b(this.l.c());
            }
            this.a.ar().tu((Object)aamq);
        }
    }
    
    public final void s(final long n) {
        if (this.D()) {
            this.C(n);
            this.B(9);
        }
    }
    
    public final void t(final long n) {
        if (this.D()) {
            this.C(n);
        }
    }
    
    public final void u() {
        if (((abve)this.q.a).at()) {
            this.q.o(1);
            if (this.D()) {
                final abqz i = this.a.i();
                final abrd b = i.b;
                if (b != null && i.f) {
                    b.n();
                }
                final abri c = i.c;
                if (c != null) {
                    c.f();
                }
                this.g.b();
                this.B(4);
            }
        }
    }
    
    public final String v() {
        return this.a.aa();
    }
    
    public final void w(final apoc apoc) {
        this.e.m(new aaly(apoc, false), this.a);
    }
    
    public final void x(final String s, final String s2) {
        final agkz e = this.e;
        final String v = this.v();
        final Iterator<Object> iterator = ((Set<Object>)e.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().q(s, s2, v);
        }
        final zaa q = this.c.q;
        if (q != null && abrj.B(this.d)) {
            q.B(s, s2);
        }
    }
    
    final void y(final boolean b) {
        if (!b) {
            this.e.u(new aamf(this.a.aa()), this.a);
        }
        this.a.i().l();
    }
    
    public final void z() {
        final abvg b = this.b;
        b.a.clear();
        b.b.clear();
        this.a.l().m();
        this.a.n().e(false);
        this.a.n().d();
        this.a.i().j();
        this.a.i().o();
        final abzo o = this.a.o();
        o.e = 0L;
        o.f = -1L;
        o.g = 0L;
        o.h = 0L;
        o.i = 0L;
        o.k = 4;
        this.a.o().l = null;
        if (abrj.B(this.d)) {
            final abrz c = this.c;
            final zaa q = c.q;
            if (q != null) {
                c.o.deleteObserver((Observer)q);
                q.g();
            }
            c.r.dispose();
        }
        this.n = true;
    }
}
