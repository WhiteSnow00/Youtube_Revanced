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

public final class abqz implements tgg
{
    public final abqu a;
    public abrd b;
    public abri c;
    public abrm d;
    public PlaybackClientManager$State e;
    public boolean f;
    public final abrj g;
    private abqw h;
    private abra i;
    private final abre j;
    private final abrj k;
    private final ashi l;
    private final ashi m;
    private final ashi n;
    private final asie o;
    private final abrn p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private aanl u;
    private final abrj v;
    private final ablw w;
    private final arwh x;
    
    public abqz(final abqu a, final abrj v, final abre j, final abrn p16, final abrj k, final arwh x, final abrj g, final ashi l, final ablw w, final ashi m, final ashi n, final asie o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        v.getClass();
        this.v = v;
        this.j = j;
        this.p = p16;
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
        final abrd b = this.b;
        if (b != null && this.f) {
            final aanl u = this.u;
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
        abqw h = null;
        Label_0148: {
            if (b != null) {
                final abqu a = this.a;
                a.h.getClass();
                if (a.i.c && abqu.a(b.a) && abqu.b(b.b)) {
                    if (!TextUtils.isEmpty((CharSequence)b.c)) {
                        h = new abqw(a.a, a.b, a.c, a.d, a.e, a.f, a.h, b.a, b.b, b.c, a.g);
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
        abra b2;
        if (c == null) {
            b2 = null;
        }
        else {
            b2 = this.v.b((List)Arrays.asList(c.a), (List)Arrays.asList(c.b), c.c);
        }
        this.i = b2;
        final VideoStats2Client$VideoStats2ClientState d = e.d;
        abrd b3;
        if (d == null) {
            b3 = null;
        }
        else {
            final abre j = this.j;
            final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)j.a.a();
            scheduledExecutorService.getClass();
            final aahc aahc = (aahc)j.b.a();
            aahc.getClass();
            final ziw ziw = (ziw)j.c.a();
            ziw.getClass();
            final oby oby = (oby)j.d.a();
            oby.getClass();
            final tjm tjm = (tjm)j.e.a();
            tjm.getClass();
            final zis zis = (zis)j.g.a();
            zis.getClass();
            final zpk zpk = (zpk)j.h.a();
            zpk.getClass();
            final trc trc = (trc)j.i.a();
            final aalc aalc = (aalc)j.j.a();
            aalc.getClass();
            final zmf zmf = (zmf)j.k.a();
            zmf.getClass();
            final arwh arwh = (arwh)j.l.a();
            arwh.getClass();
            final abrj abrj = (abrj)j.m.a();
            abrj.getClass();
            final abjj abjj = (abjj)j.n.a();
            abjj.getClass();
            final apsd apsd = (apsd)j.p.a();
            final adqh adqh = (adqh)j.q.a();
            adqh.getClass();
            final tvl tvl = (tvl)j.f.a();
            tvl.getClass();
            b3 = new abrd(scheduledExecutorService, aahc, ziw, oby, tjm, zis, zpk, trc, aalc, zmf, arwh, abrj, abjj, apsd, d, adqh, tvl, null, null, null, null);
        }
        this.b = b3;
        this.q();
        if (abrj.an(this.x)) {
            final VideoStats3Client$VideoStats3ClientState f = e.f;
            abri c2;
            if (f == null) {
                c2 = null;
            }
            else {
                final abrj k = this.k;
                final ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService)((atke)k.a).a();
                scheduledExecutorService2.getClass();
                final tjm tjm2 = (tjm)((atke)k.b).a();
                tjm2.getClass();
                final tvl tvl2 = (tvl)((atke)k.d).a();
                tvl2.getClass();
                final oby oby2 = (oby)((atke)k.e).a();
                oby2.getClass();
                final wxx wxx = (wxx)((atke)k.c).a();
                wxx.getClass();
                final abjj abjj2 = (abjj)((atke)k.g).a();
                abjj2.getClass();
                c2 = new abri(scheduledExecutorService2, tjm2, tvl2, oby2, wxx, abjj2, (apsd)((atke)k.h).a(), f);
            }
            this.c = c2;
        }
        final AttestationClient$AttestationClientState e2 = e.e;
        abrm d2;
        if (e2 == null) {
            d2 = null;
        }
        else {
            final abrn p = this.p;
            final aahc aahc2 = (aahc)((atke)p.b).a();
            aahc2.getClass();
            final Executor executor = (Executor)((atke)p.c).a();
            executor.getClass();
            ((atke)p.d).a().getClass();
            final mdp mdp = (mdp)((atke)p.e).a();
            mdp.getClass();
            final zmf zmf2 = (zmf)((atke)p.f).a();
            zmf2.getClass();
            final tjm tjm3 = (tjm)p.a.a();
            tjm3.getClass();
            final zki zki = (zki)((atke)p.g).a();
            zki.getClass();
            final vaf vaf = (vaf)((atke)p.h).a();
            vaf.getClass();
            d2 = new abrm(aahc2, executor, mdp, zmf2, tjm3, zki, vaf, e2, (byte[])null, (byte[])null);
        }
        this.d = d2;
    }
    
    private final void s() {
        final abrd b = this.b;
        if (b != null) {
            b.r();
        }
        this.b = null;
        final abri c = this.c;
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
        final abrd b = this.b;
        VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState;
        if (b != null) {
            videoStats2Client$VideoStats2ClientState = new VideoStats2Client$VideoStats2ClientState(b.a, b.b, b.c, b.d, b.e, b.q, b.C, b.f, b.g, b.h, b.i, b.j, b.s, b.r, b.k, b.l, b.t, b.u, b.v, b.x, b.G, b.w, b.y, b.z, b.A, b.B, b.n, b.o, b.p, b.F, b.D, b.E, b.J, b.K, b.L);
        }
        else {
            videoStats2Client$VideoStats2ClientState = null;
        }
        final abri c = this.c;
        VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState;
        if (c != null) {
            videoStats3Client$VideoStats3ClientState = new VideoStats3Client$VideoStats3ClientState(c.m, c.l, c.p, c.o, c.s, c.j, c.n, c.t, c.u, c.q, c.r, c.v, c.w, c.A, c.c, c.B, c.e, c.G, c.F, c.b, c.f, c.C, c.D, c.y, c.E);
        }
        else {
            videoStats3Client$VideoStats3ClientState = null;
        }
        final abrm d = this.d;
        final abqw h = this.h;
        final abra i = this.i;
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
    
    public final void b(final aamb aamb) {
        final abrd b = this.b;
        if (b != null && this.f) {
            b.c(aamb);
        }
        final abri c = this.c;
        if (c != null && c.n != aamb.a()) {
            c.a(false, c.d.d());
            c.n = aamb.a();
            c.i(c.d.d());
        }
    }
    
    public final void c(final aamh z) {
        final abrd b = this.b;
        if (b != null && this.f) {
            b.d(z);
        }
        final abri c = this.c;
        if (c != null) {
            final aamh z2 = c.z;
            if (z2 == null || z2.d() != z.d() || c.z.e() != z.e()) {
                c.a(false, c.d.d());
                c.z = z;
                c.i(c.d.d());
            }
        }
    }
    
    public final void d(final aanl u) {
        if (u != null) {
            this.u = u;
        }
        final abrd b = this.b;
        if (b != null && this.f) {
            b.e(u);
        }
        final abri c = this.c;
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
            this.o.aa((asjm)new abpj(new asiq(new asir[] { this.l.an((asjm)new abpj(this, 14), (asjm)abfd.k), this.w.c().an((asjm)new abpj(this, 15), (asjm)abfd.k), this.m.an((asjm)new abpj(this, 16), (asjm)abfd.k), this.n.an((asjm)new abpj(this, 17), (asjm)abfd.k) }), 18));
        }
    }
    
    public final void g(final ypj ypj) {
        if (!yfd.bw(ypj.b())) {
            return;
        }
        final abqw h = this.h;
        if (h != null) {
            h.b();
        }
        final abrd b = this.b;
        if (b != null && this.f) {
            b.g(ypj);
        }
        final abri c = this.c;
        if (c != null) {
            final FormatStreamModel e = ypj.e();
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
                if (!playerResponseModel.m().aH()) {
                    this.i = this.v.b(o.g, o.h, s2);
                }
                this.b = this.j.a(s, playerResponseModel, s2, n);
                this.q();
                if (abrj.an(this.x) && t(playerResponseModel)) {
                    this.c = this.k.a(s2, n, playerResponseModel);
                }
                if (playerResponseModel.C() != null && o.a != null) {
                    this.d = this.p.a(playerResponseModel.C(), o.a, s2, playerResponseModel.h());
                }
            }
            else {
                ttr.l("Missing QoE or Vss base url");
            }
        }
        this.e = null;
        this.q = playerResponseModel.K();
    }
    
    public final void i(final String s, final PlayerResponseModel playerResponseModel, final int n) {
        if (this.r) {
            return;
        }
        tvb.n(s);
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
                    final abqu a = this.a;
                    final akws x = playerResponseModel.x();
                    final byte[] y = playerResponseModel.Y();
                    final String i = playerResponseModel.K();
                    a.h.getClass();
                    tvb.n(i);
                    abqw h;
                    if (a.i.c && x != null && abqu.a(x) && abqu.b(y) && (!b || x.h) && n != 3 && !a.j.q()) {
                        h = new abqw(a.a, a.b, a.c, a.d, a.e, a.f, a.h, x, y, i, a.g);
                    }
                    else {
                        h = null;
                    }
                    this.h = h;
                }
                if (!playerResponseModel.m().aH()) {
                    this.i = this.v.b(o.g, o.h, s);
                }
                if (this.b == null) {
                    this.b = this.j.a(null, playerResponseModel, s, n);
                    this.q();
                }
                if (abrj.an(this.x) && this.c == null && t(playerResponseModel)) {
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
        final abrd b = this.b;
        if (b != null && this.f) {
            b.h();
        }
        final abrm d = this.d;
        if (d != null) {
            d.b();
        }
        final abri c = this.c;
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
                ttr.l("Missing QoE or Vss base url");
            }
        }
        if (!t(playerResponseModel)) {
            ttr.l("Missing Vss3Config");
        }
        else if (abrj.an(this.x) && this.c == null) {
            this.c = this.k.a(s, n2, playerResponseModel);
        }
        final abrd b = this.b;
        if (b != null && this.f) {
            b.m(n);
        }
        final abri c = this.c;
        if (c != null) {
            c.e(n);
        }
    }
    
    public final void l() {
        final abrd b = this.b;
        if (b != null && this.f) {
            b.o();
        }
        final abrm d = this.d;
        if (d != null) {
            d.b();
        }
        final abri c = this.c;
        if (c != null) {
            c.g();
        }
    }
    
    public final void m(final long n) {
        final abrd b = this.b;
        if (b != null && this.f) {
            b.l(n);
        }
        final abri c = this.c;
        if (c != null) {
            c.d(n);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 5: {
                final abiw abiw = (abiw)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.p();
                return null;
            }
            case 4: {
                final aanq aanq = (aanq)o;
                final abrd b = this.b;
                if (b != null && this.f) {
                    b.f(aanq);
                }
                final abri c = this.c;
                array2 = array;
                if (c == null) {
                    break;
                }
                if (c.x == aanq.a()) {
                    array2 = array;
                    break;
                }
                c.a(false, c.d.d());
                c.x = aanq.a();
                c.i(c.d.d());
                return null;
            }
            case 3: {
                final aanl aanl = (aanl)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.d(aanl);
                return null;
            }
            case 2: {
                final aamh aamh = (aamh)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.c(aamh);
                return null;
            }
            case 1: {
                final aamb aamb = (aamb)o;
                if (this.g.z()) {
                    array2 = array;
                    break;
                }
                this.b(aamb);
                return null;
            }
            case 0: {
                final tij tij = (tij)o;
                final abrd b2 = this.b;
                if (b2 != null && this.f) {
                    b2.b();
                }
                final abri c2 = this.c;
                if (c2 == null) {
                    array2 = array;
                    break;
                }
                c2.a(false, c2.d.d());
                c2.i(c2.d.d());
                return null;
            }
            case -1: {
                array2 = new Class[] { tij.class, aamb.class, aamh.class, aanl.class, aanq.class, abiw.class };
                break;
            }
        }
        return array2;
    }
    
    public final void n(final aant aant) {
        final abqw h = this.h;
        if (h != null) {
            h.c(aant);
        }
        final abra i = this.i;
        if (i != null) {
            i.c(aant);
        }
        final abrd b = this.b;
        if (b != null && this.f) {
            b.q(aant);
        }
        final abrm d = this.d;
        if (d != null && aant.j() && aant.e() >= d.c.b(5) * 1000L) {
            d.b();
        }
        final abri c = this.c;
        if (c != null) {
            if (aant.f() > 0L) {
                c.l = aant.f();
            }
            if (aant.j()) {
                final long e = aant.e();
                final long m = c.m;
                if (e < -5000L + m || e > 5000L + m) {
                    final StringBuilder sb = new StringBuilder("Warning: unexpected playback progress ");
                    sb.append(e);
                    sb.append(" for current playback position ");
                    sb.append(m);
                    ttr.l(sb.toString());
                    c.d(e);
                    return;
                }
                if (e >= m) {
                    if (c.i) {
                        final long n = c.s + (e - m);
                        c.s = n;
                        c.m = e;
                        c.A = aant.b() - aant.e();
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
            else if (!aant.j()) {
                ttr.l("Video time event received with event.hasPlaybackStarted=false. event: ".concat(aant.toString()));
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
