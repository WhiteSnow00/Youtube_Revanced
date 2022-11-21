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

public final class abxd implements abxu
{
    private static long f;
    public final acav a;
    public final abwr b;
    public final abtl c;
    public final vbo d;
    public final agmq e;
    private final abxc g;
    private final abkq h;
    private final ypn i;
    private final abws j;
    private final ablq k;
    private final oco l;
    private final Handler m;
    private boolean n;
    private final absv o;
    private final arzb p;
    private final adzx q;
    
    public abxd(final ypn i, final abxc g, final agmq e, final abkq h, final abws j, final ablq k, final abwr b, final oco l, final acav a, final adzx q, final absv o, final vbo d, final arzb p17, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        this.o = o;
        this.d = d;
        this.p = p17;
        b.b = new WeakReference((T)a);
        final abtl m = a.k();
        this.c = m;
        if (absv.B(d)) {
            m.r.c(m.d.Q().an(new abtk(m, 0), new absi(m, 15)));
            m.r.c(m.e.Q().an(new absi(m, 13), new absi(m, 15)));
            m.r.c(m.f.Q().an(new absi(m, 18), new absi(m, 15)));
            m.r.c(m.g.Q().an(new absi(m, 19), new absi(m, 15)));
            m.r.c(m.h.Q().an(new absi(m, 10), new absi(m, 15)));
            m.r.c(m.k.Q().an(new absi(m, 12), new absi(m, 15)));
            m.r.c(m.j.Q().an(new absi(m, 20), new absi(m, 15)));
            m.r.c(m.s.c().an(new abtk(m, 1), new absi(m, 15)));
            m.r.c(m.i.Q().an(new absi(m, 14), new absi(m, 15)));
            m.r.c(m.l.Q().an(new absi(m, 17), new absi(m, 15)));
            m.r.c(m.m.Q().an(new absi(m, 11), new absi(m, 15)));
            m.r.c(m.n.Q().an(new absi(m, 16), new absi(m, 15)));
            ahvo ahvo;
            if ((ahvo = abtl.c(m.t).q) == null) {
                ahvo = ahvo.a;
            }
            if (ahvo.b) {
                m.r.c(m.s.b().Q().an(new absi(m, 9), new absi(m, 15)));
            }
            ahvo ahvo2;
            if ((ahvo2 = abtl.c(m.t).q) == null) {
                ahvo2 = ahvo.a;
            }
            if (ahvo2.h) {
                m.r.c(m.p.Q().an(new abtk(m, 2), new absi(m, 15)));
            }
        }
    }
    
    private final void B(final int n) {
        aamp.P(this.a, n);
        this.q.m(this.a, 4);
    }
    
    private final void C(long c) {
        this.a.ap().tt(new aaoa(aamp.M(this.i), c));
        this.a.i().m(c);
        c = this.a.l().c(c, false);
        this.g.d = c;
    }
    
    private final boolean D() {
        final angm a = absv.A(this.d);
        boolean b = false;
        if (a != null && a.i) {
            return !this.n;
        }
        if (!this.q.f().e() && (!aamp.Q(this.q.g()) || !this.q.f().a(abll.d))) {
            if (!absv.ad(this.p, aamp.R(this.q.g()), aamp.Q(this.q.g()))) {
                return b;
            }
            if (!this.q.f().a(abll.d)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public final void A(final int n) {
        final zdl m = this.i.m();
        this.q.k(this.a, n, m.c, m.b, m.e, (long)m.f);
    }
    
    public final void a(final long n) {
        final long c = this.l.c();
        if (this.D() && aamp.Q(this.q.g())) {
            this.a.i().l();
            this.e.n(this.a.aa());
            this.q.i(abll.d);
        }
        else if (absv.ad(this.p, aamp.R(this.q.g()), aamp.Q(this.q.g())) && this.D() && this.a.a() == 0) {
            this.a.i().l();
            this.e.n(this.a.aa());
            this.q.i(abll.d);
        }
        else if (absv.ad(this.p, aamp.R(this.q.g()), aamp.Q(this.q.g())) && this.D() && this.a.a() == 1) {
            final PlayerResponseModel c2 = this.a.c();
            if (c2 != null && Math.abs(n - Duration.ofSeconds((long)c2.h()).toMillis()) <= 1000L) {
                aamp.P(this.a, 7);
                this.q.m(this.a, 2);
                this.q.h(false);
                this.q.m(this.a, 3);
                this.e.r(this.a);
            }
            else {
                znh.b(zng.a, znf.j, "Gaplessly transitioning away from an Ad before it ends.");
            }
        }
        final adzx q = this.q;
        final acav a = this.a;
        q.k(a, 4, a.o().f, n, n, -1L);
        final acbb p = this.a.p().p(this.a.aa(), this.a.o().e);
        if (p != null) {
            this.a.av().tt(new aapa(p.e, c));
        }
    }
    
    public final PlayerResponseModel b() {
        return this.a.c();
    }
    
    public final abla c() {
        return this.a.h();
    }
    
    public final void d() {
        if (this.D()) {
            if (absv.al(this.p)) {
                this.A(4);
            }
            this.B(5);
        }
    }
    
    public final void e(final FormatStreamModel formatStreamModel, final long n, final long n2, final yrv[] array) {
        for (final yrv yrv : array) {
            if ((aamp.Q(this.q.g()) || aamp.R(this.q.g())) && yrv.a.equals("http://youtube.com/streaming/metadata/segment/102015") && formatStreamModel.z()) {
                final yrc c = yrc.c(n2, yrv);
                if (c != null) {
                    this.m.post((Runnable)new abse(this, c, 5));
                }
            }
        }
        final PlayerResponseModel b = this.b();
        if (b != null && b.m() != null && b.m().Y()) {
            final aans aans = new aans(array, formatStreamModel, n, n2);
            this.a.f().a(aans, this.a.p());
            this.a.ac().tt(aans);
        }
    }
    
    public final void f() {
        if (this.D()) {
            this.g.b();
            final adzx q = this.q;
            final acav a = this.a;
            q.k(a, 4, -1L, aamp.K(a), aamp.K(this.a), -1L);
            final absl i = this.a.i();
            final absp b = i.b;
            if (b != null && i.f) {
                b.i();
            }
            final absy d = i.d;
            if (d != null) {
                d.b();
            }
            final absu c = i.c;
            if (c != null) {
                c.c();
            }
            this.a.l().i();
            if (this.q.f().h()) {
                aamp.P(this.a, 7);
                this.q.m(this.a, 2);
                this.q.h(false);
                this.q.m(this.a, 3);
                if (!aamp.Q(this.q.g())) {
                    this.e.r(this.a);
                }
            }
            else {
                final adzx q2 = this.q;
                Label_0331: {
                    if (q2.f() == abll.d) {
                        final abwp abwp = (abwp)q2.a;
                        abwp.g = abwp.aB(false, false, true);
                    }
                    else {
                        if (this.a.p().i()) {
                            final PlayerResponseModel c2 = this.a.c();
                            if ((aamp.Q(this.q.g()) && (c2 == null || c2.n() == null || !c2.n().D())) || !this.a.p().h(this.a.aa())) {
                                break Label_0331;
                            }
                        }
                        ((abwp)this.q.a).T();
                    }
                }
                this.B(7);
            }
        }
    }
    
    public final void g(final zdk zdk) {
        this.j.t(zdk);
        if (zdk.w()) {
            this.q.l(1);
        }
        if (this.D()) {
            this.e.l(zdk, this.a);
            if (((abwp)this.q.a).ar()) {
                return;
            }
            final absv o = this.o;
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            asmr.b((AtomicReference)((vbs)o.d).l(45353689L).aH(new abkh(atomicBoolean, 11)));
            final boolean b = atomicBoolean.get() && zdk.z() && this.l.c() - abxd.f > 60000L;
            final boolean equals = zdk.n().equals("staleconfig");
            final String s = null;
            final String s2 = null;
            final String s3 = null;
            if (!equals && !b) {
                if (zdk.m().equals("offline.partial.nocontent")) {
                    this.q.l(1);
                    this.g.b();
                    final acav a = this.a;
                    aamp.O(a, a.o().g);
                    this.q.n(new ablo(15, false, ""));
                    final long m = aamp.M(this.i);
                    final long k = aamp.K(this.a);
                    final StringBuilder sb = new StringBuilder("currentPositionMs.");
                    sb.append(m);
                    sb.append(";durationMs.");
                    sb.append(k);
                    this.x("ppedb", sb.toString());
                    return;
                }
                if (!zdk.w()) {
                    return;
                }
                if (this.q.f().h() && !aamp.Q(this.q.g())) {
                    this.q.h(true);
                }
                else {
                    final PlayerResponseModel b2 = this.b();
                    String i;
                    if (b2 != null) {
                        i = b2.K();
                    }
                    else {
                        i = null;
                    }
                    final ablq j = this.k;
                    final String l = zdk.m();
                    final boolean contains = l.contains("net.unavailable");
                    final int n = 10;
                    int n3 = 0;
                    boolean b3 = false;
                    String s4 = null;
                    int n7 = 0;
                    Label_0771: {
                        Label_0420: {
                            if (!contains) {
                                int n4 = 0;
                                int n8 = 0;
                                Label_0457: {
                                    int n2;
                                    if (l.contains("offline.nocontent")) {
                                        n2 = 2132018004;
                                    }
                                    else {
                                        if (l.contains("net.connect") || l.contains("net.connect.timeout") || l.contains("net.dns")) {
                                            n3 = 2132020011;
                                            break Label_0420;
                                        }
                                        if (l.contains("net.retryexhausted") || l.contains("net.closed") || l.contains("net.read") || l.contains("net.read.timeout") || l.contains("net.timeout")) {
                                            n3 = 2132017784;
                                            break Label_0420;
                                        }
                                        if (l.startsWith("fmt.unplayable")) {
                                            n2 = 2132020022;
                                        }
                                        else if (l.startsWith("drm.unimplemented")) {
                                            n2 = 2132018014;
                                        }
                                        else if (l.startsWith("drm.unavailable")) {
                                            n2 = 2132017992;
                                        }
                                        else {
                                            final boolean startsWith = l.startsWith("drm.auth");
                                            n4 = 7;
                                            if (startsWith && zdk.j((Class)yra.class) != null) {
                                                final yra yra = (yra)zdk.j((Class)yra.class);
                                                int n5;
                                                if (yra != null) {
                                                    b3 = yra.b();
                                                    if (!b3) {
                                                        n5 = 7;
                                                    }
                                                    else {
                                                        n5 = 9;
                                                    }
                                                    s4 = yra.a();
                                                }
                                                else {
                                                    b3 = false;
                                                    n5 = n;
                                                    s4 = s3;
                                                }
                                                final int n6 = 2132019301;
                                                n7 = n5;
                                                n3 = n6;
                                                break Label_0771;
                                            }
                                            if (zdk.v()) {
                                                n8 = 2132019301;
                                                break Label_0457;
                                            }
                                            if (l.equals("policy.app")) {
                                                n8 = 2132019301;
                                                n4 = 14;
                                                break Label_0457;
                                            }
                                            n3 = 2132019301;
                                            break Label_0420;
                                        }
                                    }
                                    final int n9 = 10;
                                    n8 = n2;
                                    n4 = n9;
                                }
                                b3 = false;
                                s4 = s;
                                n7 = n4;
                                n3 = n8;
                                break Label_0771;
                            }
                            n3 = 2132017772;
                        }
                        n7 = 10;
                        b3 = true;
                        s4 = s;
                    }
                    if (s4 == null) {
                        s4 = j.b.getString(n3);
                    }
                    final ablo ablo = new ablo(n7, b3, 1, s4, null, i, l);
                    if (ablo.a && this.q.f().f()) {
                        aamp.O(this.a, aamp.M(this.i));
                    }
                    this.q.n(ablo);
                }
                this.g.b();
                this.B(8);
            }
            else {
                abxd.f = this.l.c();
                ((abwp)this.q.a).an(0);
                final PlayerResponseModel b4 = this.b();
                String k2 = s2;
                if (b4 != null) {
                    k2 = b4.K();
                }
                if (k2 != null) {
                    this.a.ay().tt(aapg.b(k2));
                }
            }
        }
    }
    
    public final void h(final yre yre) {
        this.a.i().g(yre);
        final agmq e = this.e;
        final acav a = this.a;
        final Iterator<Object> iterator = ((Set<Object>)e.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().i(yre, a.aa());
        }
        a.ad().tt(yre);
        final zbx q = this.c.q;
        if (q != null && absv.B(this.d)) {
            q.r(yre);
        }
    }
    
    public final abxy i() {
        return (abxy)this.a.o();
    }
    
    public final void j(final long g, final long n) {
        aamp.N(this.a, n);
        this.a.o().g = g;
    }
    
    public final void k(final String s) {
        this.a.ai().tt(aanu.b(s));
    }
    
    public final void l() {
        final long c = this.l.c();
        if (this.D()) {
            final aaok aaok = new aaok();
            aaok.b(c);
            this.a.al().tt(aaok);
            final absl i = this.a.i();
            final absp b = i.b;
            if (b != null && i.f) {
                b.k();
            }
            final absu c2 = i.c;
            if (c2 != null && c2.i) {
                c2.y = apvn.c;
                c2.a(false, c2.d.d());
                c2.i = false;
            }
            this.a.l().j();
            this.B(3);
        }
    }
    
    public final void m() {
        if (this.D()) {
            if (absv.al(this.p)) {
                this.A(4);
            }
            this.B(6);
        }
    }
    
    public final void n(long c) {
        if (this.D()) {
            this.a.ap().tt(new aaoa(aamp.M(this.i), c));
            this.a.i().m(c);
            c = this.a.l().c(c, false);
            this.g.d = c;
            this.B(10);
        }
    }
    
    public final void o(final float n) {
        final PlayerResponseModel c = this.q.g().c();
        final agmq e = this.e;
        final aany aany = new aany(aamp.Y(this.i, c).a(), c, n);
        final acav a = this.a;
        final Iterator<Object> iterator = ((Set<Object>)e.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().P(aany);
        }
        a.am().tt(aany);
    }
    
    public final void p() {
        final long c = this.l.c();
        final PlayerResponseModel b = this.b();
        if (aamp.T(this.h, b)) {
            this.i.H(16);
            return;
        }
        final long d = this.i.m().d;
        final boolean r = aamp.R(this.a);
        long n = 0L;
        if (!r && d > 0L) {
            aamp.N(this.a, d);
        }
        aamp.O(this.a, this.i.m().b);
        this.q.l(3);
        if (!this.D() && !this.q.f().a(abll.g)) {
            return;
        }
        final abxd j = ((abwp)this.q.a).j;
        final aaod aaod = null;
        VideoStreamingData n2;
        if (b != null) {
            n2 = b.n();
        }
        else {
            n2 = null;
        }
        boolean b2 = false;
        Label_0240: {
            if (b != null && b.m().aA()) {
                ajsz ajsz;
                if ((ajsz = b.m().c.e) == null) {
                    ajsz = ajsz.b;
                }
                if (ajsz.aZ) {
                    b2 = true;
                    break Label_0240;
                }
            }
            b2 = false;
        }
        this.h.r(abwp.as(n2) || b2);
        this.q.j(this);
        if (j != this) {
            if (this.a.a() == 1) {
                ((abwp)this.q.a).h(this.a.aa());
                this.q.i(abll.e);
                abwp.aA(ablh.e, this.a);
                final acav g = this.q.g();
                if (b != null) {
                    this.a.i().h(g.aa(), b, this.a.aa(), this.a.a());
                }
            }
            else {
                final adzx q = this.q;
                ((abwp)q.a).h = null;
                q.i(abll.h);
                if (absv.ad(this.p, aamp.R(this.q.g()), aamp.Q(this.q.g()))) {
                    this.a.l().c(this.a.o().e, false);
                }
                if (b != null) {
                    this.a.i().i(this.a.aa(), b, this.a.a());
                }
            }
        }
        if (aamp.R(this.a)) {
            final long b3 = this.i.m().b;
            if (b3 != -1L) {
                n = b3;
            }
            aamp.O(this.a, n);
        }
        if (b != null) {
            this.a.i().k(aamp.L(this.a), this.a.aa(), b, this.a.a());
        }
        if (absv.ag(this.p)) {
            this.a.l().n();
        }
        this.g.a();
        aaod aaod2 = aaod;
        if (this.q.f().a(abll.e, abll.f)) {
            if (!this.q.f().d()) {
                this.q.i(abll.f);
                abwp.aA(ablh.f, this.a);
            }
            aamp.M(this.i);
            aaod2 = new aaoi();
        }
        if (this.q.f().a(abll.h, abll.g, abll.i)) {
            if (!this.q.f().d()) {
                this.q.i(abll.i);
            }
            aamp.M(this.i);
            aaod2 = new aaoi();
        }
        if (aaod2 != null) {
            aaod2.b(c);
            this.a.ak().tt(aaod2);
        }
        this.B(2);
    }
    
    public final void q() {
        this.q.l(2);
        if (this.o.f()) {
            this.q.j(this);
        }
    }
    
    public final void r(final long n) {
        if (this.q.f().d()) {
            final aaon aaon = new aaon(aamp.M(this.i), this.q.f().a(abll.f));
            if (n >= 0L) {
                aaon.i(n - this.l.c() + this.l.d());
                aaon.b(n);
            }
            else {
                aaon.b(this.l.c());
            }
            this.a.ar().tt(aaon);
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
        if (((abwp)this.q.a).at()) {
            this.q.l(1);
            if (this.D()) {
                final absl i = this.a.i();
                final absp b = i.b;
                if (b != null && i.f) {
                    b.n();
                }
                final absu c = i.c;
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
    
    public final void w(final apqo apqo) {
        this.e.m(new aanv(apqo, false), this.a);
    }
    
    public final void x(final String s, final String s2) {
        final agmq e = this.e;
        final String v = this.v();
        final Iterator<Object> iterator = ((Set<Object>)e.c).iterator();
        while (iterator.hasNext()) {
            iterator.next().q(s, s2, v);
        }
        final zbx q = this.c.q;
        if (q != null && absv.B(this.d)) {
            q.B(s, s2);
        }
    }
    
    final void y(final boolean b) {
        if (!b) {
            this.e.u(new aaoc(this.a.aa()), this.a);
        }
        this.a.i().l();
    }
    
    public final void z() {
        final abwr b = this.b;
        b.a.clear();
        b.b.clear();
        this.a.l().m();
        this.a.n().e(false);
        this.a.n().d();
        this.a.i().j();
        this.a.i().o();
        final acax o = this.a.o();
        o.e = 0L;
        o.f = -1L;
        o.g = 0L;
        o.h = 0L;
        o.i = 0L;
        o.k = 4;
        this.a.o().l = null;
        if (absv.B(this.d)) {
            final abtl c = this.c;
            final zbx q = c.q;
            if (q != null) {
                c.o.deleteObserver((Observer)q);
                q.g();
            }
            c.r.dispose();
        }
        this.n = true;
    }
}
