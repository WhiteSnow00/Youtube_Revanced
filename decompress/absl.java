import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import com.google.android.libraries.youtube.player.stats.PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import java.util.Arrays;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.stats.PlaybackClientManager$State;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absl implements thj
{
    public final absf a;
    public absp b;
    public absu c;
    public absy d;
    public PlaybackClientManager$State e;
    public boolean f;
    public final absv g;
    private absh h;
    private absm i;
    private final absq j;
    private final absv k;
    private final aske l;
    private final aske m;
    private final aske n;
    private final asla o;
    private final absz p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private aapi u;
    private final absv v;
    private final abnd w;
    private final arzb x;
    
    public absl(final absf a, final absv v, final absq j, final absz p15, final absv k, final arzb x, final absv g, final aske l, final abnd w, final aske m, final aske n, final asla o, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        v.getClass();
        this.v = v;
        this.j = j;
        this.p = p15;
        this.k = k;
        this.x = x;
        this.g = g;
        this.l = l;
        this.w = w;
        this.m = m;
        this.n = n;
        this.o = o;
        this.f = true;
    }
    
    private final void q() {
        final absp b = this.b;
        if (b != null && this.f) {
            final aapi u = this.u;
            if (u != null) {
                b.e(u);
            }
        }
    }
    
    private final void r() {
        final PlaybackClientManager$State e = this.e;
        if (e == null) {
            return;
        }
        final HeartbeatClient$HeartbeatClientState b = e.b;
        absh h = null;
        Label_0148: {
            if (b != null) {
                final absf a = this.a;
                a.h.getClass();
                if (a.i.c && absf.a(b.a) && absf.b(b.b)) {
                    if (!TextUtils.isEmpty((CharSequence)b.c)) {
                        h = new absh(a.a, a.b, a.c, a.d, a.e, a.f, a.h, b.a, b.b, b.c, a.g);
                        h.h = b.e;
                        h.g = b.d;
                        break Label_0148;
                    }
                }
            }
            h = null;
        }
        this.h = h;
        final PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState c = e.c;
        absm b2;
        if (c == null) {
            b2 = null;
        }
        else {
            b2 = this.v.b(Arrays.asList(c.a), Arrays.asList(c.b), c.c);
        }
        this.i = b2;
        final VideoStats2Client$VideoStats2ClientState d = e.d;
        absp b3;
        if (d == null) {
            b3 = null;
        }
        else {
            final absq j = this.j;
            final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)j.a.a();
            scheduledExecutorService.getClass();
            final aajb aajb = (aajb)j.b.a();
            aajb.getClass();
            final zkr zkr = (zkr)j.c.a();
            zkr.getClass();
            final oco oco = (oco)j.d.a();
            oco.getClass();
            final tkq tkq = (tkq)j.e.a();
            tkq.getClass();
            final zkn zkn = (zkn)j.g.a();
            zkn.getClass();
            final zrg zrg = (zrg)j.h.a();
            zrg.getClass();
            final tsd tsd = (tsd)j.i.a();
            final aamy aamy = (aamy)j.j.a();
            aamy.getClass();
            final zoa zoa = (zoa)j.k.a();
            zoa.getClass();
            final arzb arzb = (arzb)j.l.a();
            arzb.getClass();
            final absv absv = (absv)j.m.a();
            absv.getClass();
            final abkq abkq = (abkq)j.n.a();
            abkq.getClass();
            final apup apup = (apup)j.p.a();
            final adry adry = (adry)j.q.a();
            adry.getClass();
            final twn twn = (twn)j.f.a();
            twn.getClass();
            b3 = new absp(scheduledExecutorService, aajb, zkr, oco, tkq, zkn, zrg, tsd, aamy, zoa, arzb, absv, abkq, apup, d, adry, twn, null, null, null);
        }
        this.b = b3;
        this.q();
        if (absv.aj(this.x)) {
            final VideoStats3Client$VideoStats3ClientState f = e.f;
            absu c2;
            if (f == null) {
                c2 = null;
            }
            else {
                final absv k = this.k;
                final ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService)((atnb)k.a).a();
                scheduledExecutorService2.getClass();
                final tkq tkq2 = (tkq)((atnb)k.b).a();
                tkq2.getClass();
                final twn twn2 = (twn)((atnb)k.d).a();
                twn2.getClass();
                final oco oco2 = (oco)((atnb)k.e).a();
                oco2.getClass();
                final wza wza = (wza)((atnb)k.c).a();
                wza.getClass();
                final abkq abkq2 = (abkq)((atnb)k.g).a();
                abkq2.getClass();
                c2 = new absu(scheduledExecutorService2, tkq2, twn2, oco2, wza, abkq2, (apup)((atnb)k.h).a(), f);
            }
            this.c = c2;
        }
        final AttestationClient$AttestationClientState e2 = e.e;
        absy d2;
        if (e2 == null) {
            d2 = null;
        }
        else {
            final absz p = this.p;
            final aajb aajb2 = (aajb)((atnb)p.b).a();
            aajb2.getClass();
            final Executor executor = (Executor)((atnb)p.c).a();
            executor.getClass();
            ((atnb)p.d).a().getClass();
            final mtf mtf = (mtf)((atnb)p.e).a();
            mtf.getClass();
            final zoa zoa2 = (zoa)((atnb)p.f).a();
            zoa2.getClass();
            final tkq tkq3 = (tkq)p.a.a();
            tkq3.getClass();
            final zmd zmd = (zmd)((atnb)p.g).a();
            zmd.getClass();
            final vbo vbo = (vbo)((atnb)p.h).a();
            vbo.getClass();
            d2 = new absy(aajb2, executor, mtf, zoa2, tkq3, zmd, vbo, e2, null, null);
        }
        this.d = d2;
    }
    
    private final void s() {
        final absp b = this.b;
        if (b != null) {
            b.r();
        }
        this.b = null;
        final absu c = this.c;
        if (c != null) {
            c.h();
        }
        this.c = null;
        this.d = null;
        this.h = null;
        this.i = null;
    }
    
    private static boolean t(final PlayerResponseModel playerResponseModel) {
        return playerResponseModel.o().k != null;
    }
    
    private final boolean u(final String s) {
        final PlaybackClientManager$State e = this.e;
        boolean b = false;
        if (e != null) {
            b = b;
            if (e.a.equals(s)) {
                b = true;
            }
        }
        return b;
    }
    
    public final PlaybackClientManager$State a() {
        final PlaybackClientManager$State e = this.e;
        final String q = this.q;
        if (e != null) {
            return e;
        }
        if (q == null) {
            return null;
        }
        final absp b = this.b;
        VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState;
        if (b != null) {
            videoStats2Client$VideoStats2ClientState = new VideoStats2Client$VideoStats2ClientState(b.a, b.b, b.c, b.d, b.e, b.q, b.C, b.f, b.g, b.h, b.i, b.j, b.s, b.r, b.k, b.l, b.t, b.u, b.v, b.x, b.G, b.w, b.y, b.z, b.A, b.B, b.n, b.o, b.p, b.F, b.D, b.E, b.J, b.K, b.L);
        }
        else {
            videoStats2Client$VideoStats2ClientState = null;
        }
        final absu c = this.c;
        VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState;
        if (c != null) {
            videoStats3Client$VideoStats3ClientState = new VideoStats3Client$VideoStats3ClientState(c.m, c.l, c.p, c.o, c.s, c.j, c.n, c.t, c.u, c.q, c.r, c.v, c.w, c.A, c.c, c.B, c.e, c.G, c.F, c.b, c.f, c.C, c.D, c.y, c.E);
        }
        else {
            videoStats3Client$VideoStats3ClientState = null;
        }
        final absy d = this.d;
        final absh h = this.h;
        final absm i = this.i;
        HeartbeatClient$HeartbeatClientState a;
        if (h == null) {
            a = null;
        }
        else {
            a = h.a();
        }
        PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState a2;
        if (i == null) {
            a2 = null;
        }
        else {
            a2 = i.a();
        }
        AttestationClient$AttestationClientState attestationClient$AttestationClientState;
        if (d == null) {
            attestationClient$AttestationClientState = null;
        }
        else {
            attestationClient$AttestationClientState = new AttestationClient$AttestationClientState(d.b, d.c, d.d, d.e, d.i);
        }
        return new PlaybackClientManager$State(q, a, a2, videoStats2Client$VideoStats2ClientState, attestationClient$AttestationClientState, videoStats3Client$VideoStats3ClientState);
    }
    
    public final void b(final aany aany) {
        final absp b = this.b;
        if (b != null && this.f) {
            b.c(aany);
        }
        final absu c = this.c;
        if (c != null && c.n != aany.a()) {
            c.a(false, c.d.d());
            c.n = aany.a();
            c.i(c.d.d());
        }
    }
    
    public final void c(final aaoe z) {
        final absp b = this.b;
        if (b != null && this.f) {
            b.d(z);
        }
        final absu c = this.c;
        if (c != null) {
            final aaoe z2 = c.z;
            if (z2 == null || z2.d() != z.d() || c.z.e() != z.e()) {
                c.a(false, c.d.d());
                c.z = z;
                c.i(c.d.d());
            }
        }
    }
    
    public final void d(final aapi u) {
        if (u != null) {
            this.u = u;
        }
        final absp b = this.b;
        if (b != null && this.f) {
            b.e(u);
        }
        final absu c = this.c;
        if (c != null && !TextUtils.equals((CharSequence)c.q, (CharSequence)u.b())) {
            if (c.k) {
                c.a(false, c.d.d());
                c.i(c.d.d());
            }
            c.q = u.b();
        }
    }
    
    public final void f() {
        if (this.g.z()) {
            this.o.aa(new absi(new aslm(new asln[] { this.l.an((asmi)new abps(this, 19), (asmi)abgj.n), this.w.c().an((asmi)new abps(this, 20), (asmi)abgj.n), this.m.an(new absi(this, 1), (asmi)abgj.n), this.n.an(new absi(this, 0), (asmi)abgj.n) }), 2));
        }
    }
    
    public final void g(final yre yre) {
        if (!yed.m(yre.b())) {
            return;
        }
        final absh h = this.h;
        if (h != null) {
            h.b();
        }
        final absp b = this.b;
        if (b != null && this.f) {
            b.g(yre);
        }
        final absu c = this.c;
        if (c != null) {
            final FormatStreamModel e = yre.e();
            if (c.r.isPresent() && e != null && !((String)c.r.get()).equals(e.q())) {
                c.a(false, c.d.d());
                c.i(c.d.d());
                c.r = Optional.of((Object)e.q());
            }
        }
    }
    
    public final void h(final String s, final PlayerResponseModel playerResponseModel, final String s2, final int n) {
        if (this.s) {
            return;
        }
        this.s = true;
        if (this.u(playerResponseModel.K())) {
            if (!playerResponseModel.K().equals(this.q)) {
                this.r();
            }
        }
        else if (!TextUtils.isEmpty((CharSequence)playerResponseModel.K())) {
            final PlaybackTrackingModel o = playerResponseModel.o();
            if (o.f != null && o.b != null) {
                if (!playerResponseModel.m().aI()) {
                    this.i = this.v.b(o.g, o.h, s2);
                }
                this.b = this.j.a(s, playerResponseModel, s2, n);
                this.q();
                if (absv.aj(this.x) && t(playerResponseModel)) {
                    this.c = this.k.a(s2, n, playerResponseModel);
                }
                if (playerResponseModel.C() != null && o.a != null) {
                    this.d = this.p.a(playerResponseModel.C(), o.a, s2, playerResponseModel.h());
                }
            }
            else {
                tut.l("Missing QoE or Vss base url");
            }
        }
        this.e = null;
        this.q = playerResponseModel.K();
    }
    
    public final void i(final String s, final PlayerResponseModel playerResponseModel, final int n) {
        if (this.r) {
            return;
        }
        twd.n(s);
        boolean b = true;
        this.r = true;
        final String k = playerResponseModel.K();
        if (!TextUtils.equals((CharSequence)k, (CharSequence)this.q)) {
            if (this.u(k)) {
                this.r();
            }
            else if (!this.t) {
                final PlaybackTrackingModel o = playerResponseModel.o();
                this.t = false;
                if (!playerResponseModel.K().isEmpty()) {
                    if (playerResponseModel.n() == null || !playerResponseModel.n().x) {
                        b = false;
                    }
                    final absf a = this.a;
                    final akys x = playerResponseModel.x();
                    final byte[] y = playerResponseModel.Y();
                    final String i = playerResponseModel.K();
                    a.h.getClass();
                    twd.n(i);
                    absh h;
                    if (a.i.c && x != null && absf.a(x) && absf.b(y) && (!b || x.h) && n != 3 && !a.j.q()) {
                        h = new absh(a.a, a.b, a.c, a.d, a.e, a.f, a.h, x, y, i, a.g);
                    }
                    else {
                        h = null;
                    }
                    this.h = h;
                }
                if (!playerResponseModel.m().aI()) {
                    this.i = this.v.b(o.g, o.h, s);
                }
                if (this.b == null) {
                    this.b = this.j.a(null, playerResponseModel, s, n);
                    this.q();
                }
                if (absv.aj(this.x) && this.c == null && t(playerResponseModel)) {
                    this.c = this.k.a(s, n, playerResponseModel);
                }
                if (playerResponseModel.C() != null) {
                    final List g = o.g;
                    this.d = this.p.a(playerResponseModel.C(), o.a, s, playerResponseModel.h());
                }
            }
        }
        this.q = k;
        this.e = null;
    }
    
    public final void j() {
        final absp b = this.b;
        if (b != null && this.f) {
            b.h();
        }
        final absy d = this.d;
        if (d != null) {
            d.b();
        }
        final absu c = this.c;
        if (c != null) {
            c.a(true, c.d.d());
            c.B = true;
        }
        this.s();
    }
    
    public final void k(final long n, final String s, final PlayerResponseModel playerResponseModel, final int n2) {
        if (this.b == null) {
            final PlaybackTrackingModel o = playerResponseModel.o();
            if (o.f != null && o.b != null) {
                this.b = this.j.a(null, playerResponseModel, s, n2);
                this.q();
            }
            else {
                tut.l("Missing QoE or Vss base url");
            }
        }
        if (!t(playerResponseModel)) {
            tut.l("Missing Vss3Config");
        }
        else if (absv.aj(this.x) && this.c == null) {
            this.c = this.k.a(s, n2, playerResponseModel);
        }
        final absp b = this.b;
        if (b != null && this.f) {
            b.m(n);
        }
        final absu c = this.c;
        if (c != null) {
            c.e(n);
        }
    }
    
    public final void l() {
        final absp b = this.b;
        if (b != null && this.f) {
            b.o();
        }
        final absy d = this.d;
        if (d != null) {
            d.b();
        }
        final absu c = this.c;
        if (c != null) {
            c.g();
        }
    }
    
    public final void m(final long n) {
        final absp b = this.b;
        if (b != null && this.f) {
            b.l(n);
        }
        final absu c = this.c;
        if (c != null) {
            c.d(n);
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 5: {
                final abkd abkd = (abkd)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.p();
                return null;
            }
            case 4: {
                final aapn aapn = (aapn)o;
                final absp b = this.b;
                if (b != null && this.f) {
                    b.f(aapn);
                }
                final absu c = this.c;
                array2 = array;
                if (c == null) {
                    break;
                }
                if (c.x == aapn.a()) {
                    array2 = array;
                    break;
                }
                c.a(false, c.d.d());
                c.x = aapn.a();
                c.i(c.d.d());
                return null;
            }
            case 3: {
                final aapi aapi = (aapi)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.d(aapi);
                return null;
            }
            case 2: {
                final aaoe aaoe = (aaoe)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.c(aaoe);
                return null;
            }
            case 1: {
                final aany aany = (aany)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.b(aany);
                return null;
            }
            case 0: {
                final tjn tjn = (tjn)o;
                final absp b2 = this.b;
                if (b2 != null && this.f) {
                    b2.b();
                }
                final absu c2 = this.c;
                if (c2 == null) {
                    array2 = array;
                    break;
                }
                c2.a(false, c2.d.d());
                c2.i(c2.d.d());
                return null;
            }
            case -1: {
                array2 = new Class[] { tjn.class, aany.class, aaoe.class, aapi.class, aapn.class, abkd.class };
                break;
            }
        }
        return array2;
    }
    
    public final void n(final aapq aapq) {
        final absh h = this.h;
        if (h != null) {
            h.c(aapq);
        }
        final absm i = this.i;
        if (i != null) {
            i.c(aapq);
        }
        final absp b = this.b;
        if (b != null && this.f) {
            b.q(aapq);
        }
        final absy d = this.d;
        if (d != null && aapq.j() && aapq.e() >= d.c.b(5) * 1000L) {
            d.b();
        }
        final absu c = this.c;
        if (c != null) {
            if (aapq.f() > 0L) {
                c.l = aapq.f();
            }
            if (aapq.j()) {
                final long e = aapq.e();
                final long m = c.m;
                if (e < -5000L + m || e > 5000L + m) {
                    final StringBuilder sb = new StringBuilder("Warning: unexpected playback progress ");
                    sb.append(e);
                    sb.append(" for current playback position ");
                    sb.append(m);
                    tut.l(sb.toString());
                    c.d(e);
                    return;
                }
                if (e >= m) {
                    if (c.i) {
                        final long n = c.s + (e - m);
                        c.s = n;
                        c.m = e;
                        c.A = aapq.b() - aapq.e();
                        final int b2 = c.a.b;
                        if (b2 != c.t && !c.k()) {
                            c.t = b2;
                            c.u = n;
                        }
                        final long u = c.u;
                        if (c.k() && n - u > 2000L) {
                            c.u = -1L;
                            c.t = b2;
                            c.a(false, c.d.d());
                            c.i(c.d.d());
                        }
                        if (c.h == null && !c.B) {
                            c.e(c.m);
                        }
                    }
                }
            }
            else if (!aapq.j()) {
                tut.l("Video time event received with event.hasPlaybackStarted=false. event: ".concat(aapq.toString()));
            }
        }
    }
    
    public final void o() {
        this.t = false;
        this.r = false;
        this.s = false;
        this.q = null;
        this.e = null;
        this.u = null;
        this.s();
    }
    
    public final void p() {
        this.t = true;
    }
}
