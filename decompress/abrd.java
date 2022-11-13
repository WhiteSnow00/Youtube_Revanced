import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashMap;
import java.util.function.Consumer;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.util.concurrent.ScheduledExecutorService;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrd
{
    public String A;
    public float B;
    public long C;
    public int D;
    public long E;
    public final String F;
    public final boolean G;
    public final zme H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public Optional L;
    public final aahc M;
    private final oby N;
    private final tvi O;
    private final tvi P;
    private final tvi Q;
    private final apsd R;
    private final zis S;
    private final trc T;
    private final tjm U;
    private final abrh V;
    private final zpk W;
    private final boolean X;
    private final ScheduledExecutorService Y;
    private aamh Z;
    public final TrackingUrlModel a;
    private abkd aa;
    private boolean ab;
    private boolean ac;
    private final tvl ad;
    private final Runnable ae;
    private long af;
    private long ag;
    private ScheduledFuture ah;
    private List ai;
    private final adqh aj;
    private final arwh ak;
    private final abrj al;
    public final TrackingUrlModel b;
    public final TrackingUrlModel c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final ziw m;
    public final int n;
    public final int[] o;
    public int p;
    public long q;
    public long r;
    public long s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public volatile boolean x;
    public int y;
    public int z;
    
    @Deprecated
    public abrd(final ScheduledExecutorService y, final aahc m, final ziw i, final oby n, final TrackingUrlModel a, final TrackingUrlModel b, final TrackingUrlModel c, final boolean d, final String f, final long c2, final int j, final boolean k, final boolean l, final boolean g, final boolean w, final String g2, final String h, final String i2, final long e, final String a2, final float b2, final aamh z, final abkd aa, final tjm u, final zis s, final trc t, final zpk w2, final int n2, final int[] o, final int p50, final boolean x, String f2, final zmf zmf, final arwh ak, final abrj al, final int d2, final long e2, final adqh aj, final boolean j2, final boolean v, final boolean t2, final boolean u2, final tvl ad, final boolean k2, final apsd r, final Optional l2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.ae = (Runnable)new abei(this, 18);
        this.Y = y;
        this.M = m;
        this.m = i;
        this.N = n;
        a.getClass();
        this.a = a;
        final tvi b3 = tvi.b(a.c());
        this.O = b3;
        this.b = b;
        tvi b4;
        if (b != null) {
            b4 = tvi.b(b.c());
        }
        else {
            b4 = null;
        }
        this.P = b4;
        c.getClass();
        this.c = c;
        final tvi b5 = tvi.b(c.c());
        this.Q = b5;
        this.d = d;
        this.ak = ak;
        this.al = al;
        this.f = f;
        this.C = c2;
        this.j = j;
        this.k = k;
        this.l = l;
        this.G = g;
        this.w = w;
        this.g = g2;
        this.h = h;
        this.e = e;
        this.A = a2;
        this.B = b2;
        this.Z = z;
        this.aa = aa;
        this.U = u;
        this.S = s;
        this.i = i2;
        this.s = 0L;
        this.T = t;
        this.W = w2;
        this.X = x;
        w2.e((zpj)(this.V = new abrh(u, z.d(), aa, n, e, h)));
        this.n = n2;
        this.o = o;
        this.p = p50;
        this.ai = new ArrayList();
        if (f2 == null) {
            f2 = "";
        }
        this.F = f2;
        this.D = d2;
        this.E = e2;
        this.aj = aj;
        this.J = j2;
        this.K = k2;
        this.v = v;
        this.t = t2;
        this.u = u2;
        this.ad = ad;
        this.H = zmf.c();
        this.I = zmf.k();
        this.R = r;
        this.L = l2;
        ad.a();
        this.B(b3);
        this.B(b5);
        this.B(b4);
    }
    
    public abrd(final ScheduledExecutorService scheduledExecutorService, final aahc aahc, final ziw ziw, final oby oby, final tjm tjm, final tvl tvl, final zis zis, final zpk zpk, final trc trc, final aalc aalc, final zmf zmf, final arwh arwh, final abrj abrj, final abjj abjj, final abkl abkl, final apsd apsd, final adqh adqh, final PlaybackStartDescriptor playbackStartDescriptor, final String s, final PlayerResponseModel playerResponseModel, final String s2, int b, final boolean b2, final boolean b3, final boolean b4, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final TrackingUrlModel b5 = playerResponseModel.o().b;
        final TrackingUrlModel c = playerResponseModel.o().c;
        final TrackingUrlModel d = playerResponseModel.o().d;
        final boolean b6 = playerResponseModel.r().e() == 2L || playerResponseModel.r().e() == 3L;
        final String k = playerResponseModel.K();
        final long millis = TimeUnit.SECONDS.toMillis(playerResponseModel.h());
        final TrackingUrlModel c2 = playerResponseModel.o().c;
        int n;
        if (!abkl.l()) {
            n = 0;
        }
        else {
            n = 4;
        }
        int b7;
        if (c2 == null) {
            b7 = 0;
        }
        else {
            b7 = c2.b(n);
        }
        final boolean b8 = J(b) && abkl.l();
        final boolean b9 = J(b) && abkl.o();
        final boolean t = playerResponseModel.T();
        final boolean b10 = J(b) && u(playerResponseModel.m(), abjj);
        String i;
        if (J(b) && playbackStartDescriptor != null) {
            i = playbackStartDescriptor.i();
        }
        else {
            i = null;
        }
        final long d2 = oby.d();
        final aamh c3 = abjj.c();
        final abkd r = abjj.r;
        final int j = playerResponseModel.o().i;
        final int[] l = playerResponseModel.o().j;
        final boolean b11 = aalc.b;
        final String s3 = (String)aalc.e.a();
        b = tvl.b;
        final boolean b12 = playerResponseModel.o().k != null && abrj.an(arwh) && abrj.ao(arwh) && abrj.am(arwh);
        final boolean b13 = playerResponseModel.o().k != null && abrj.an(arwh) && abrj.ao(arwh) && !abrj.am(arwh);
        Optional optional;
        if (playerResponseModel.V()) {
            optional = Collection$_EL.stream((Collection)playerResponseModel.n().o).filter((Predicate)wzn.p).filter((Predicate)wzn.q).findFirst().map((Function)zze.j);
        }
        else {
            optional = Optional.empty();
        }
        this(scheduledExecutorService, aahc, ziw, oby, b5, c, d, b6, k, millis, b7, b8, b9, t, b10, s, s2, i, d2, "-", 1.0f, c3, r, tjm, zis, trc, zpk, j, l, 0, b11, s3, zmf, arwh, abrj, b, -1L, adqh, b12, b2, b3, b4, tvl, b13, apsd, optional, null, null, null, null);
    }
    
    public abrd(final ScheduledExecutorService scheduledExecutorService, final aahc aahc, final ziw ziw, final oby oby, final tjm tjm, final zis zis, final zpk zpk, final trc trc, final aalc aalc, final zmf zmf, final arwh arwh, final abrj abrj, final abjj abjj, final apsd apsd, final VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState, final adqh adqh, final tvl tvl, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this(scheduledExecutorService, aahc, ziw, oby, videoStats2Client$VideoStats2ClientState.a, videoStats2Client$VideoStats2ClientState.b, videoStats2Client$VideoStats2ClientState.c, videoStats2Client$VideoStats2ClientState.d, videoStats2Client$VideoStats2ClientState.h, videoStats2Client$VideoStats2ClientState.g, videoStats2Client$VideoStats2ClientState.l, videoStats2Client$VideoStats2ClientState.o, videoStats2Client$VideoStats2ClientState.p, videoStats2Client$VideoStats2ClientState.u, videoStats2Client$VideoStats2ClientState.v, videoStats2Client$VideoStats2ClientState.i, videoStats2Client$VideoStats2ClientState.j, videoStats2Client$VideoStats2ClientState.k, videoStats2Client$VideoStats2ClientState.e, videoStats2Client$VideoStats2ClientState.A, videoStats2Client$VideoStats2ClientState.B, abjj.c(), abjj.r, tjm, zis, trc, zpk, videoStats2Client$VideoStats2ClientState.C, videoStats2Client$VideoStats2ClientState.D, videoStats2Client$VideoStats2ClientState.E, aalc.b, videoStats2Client$VideoStats2ClientState.F, zmf, arwh, abrj, videoStats2Client$VideoStats2ClientState.y, videoStats2Client$VideoStats2ClientState.z, adqh, videoStats2Client$VideoStats2ClientState.G, videoStats2Client$VideoStats2ClientState.r, videoStats2Client$VideoStats2ClientState.q, videoStats2Client$VideoStats2ClientState.s, tvl, videoStats2Client$VideoStats2ClientState.H, apsd, videoStats2Client$VideoStats2ClientState.I, null, null, null, null);
        this.q = videoStats2Client$VideoStats2ClientState.f;
        this.s = videoStats2Client$VideoStats2ClientState.m;
        this.x = videoStats2Client$VideoStats2ClientState.t;
        this.y = videoStats2Client$VideoStats2ClientState.w;
        this.z = videoStats2Client$VideoStats2ClientState.x;
    }
    
    private final void A(final tvi tvi, final String s) {
        for (final Map.Entry<String, V> entry : this.S.a().entrySet()) {
            tvi.h((String)entry.getKey(), (String)entry.getValue());
        }
        tvi.h("rt", s);
        tvi.h("len", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.C)));
        final trc t = this.T;
        if (t != null) {
            tvi.h("lact", String.valueOf(t.a()));
        }
        if (this.z == 0 && this.y == 0) {
            ttr.l("Warning: Sending VSS ping without a format parameter.");
        }
        final int y = this.y;
        if (y > 0) {
            tvi.k("fmt", y);
        }
        final int z = this.z;
        if (z > 0 && z != this.y) {
            tvi.k("afmt", z);
        }
        final apsd r = this.R;
        if (r != null && (r.b & 0x1) != 0x0) {
            tvi.e(r.c);
        }
    }
    
    private final void B(final tvi tvi) {
        if (tvi != null) {
            tvi.h("cpn", this.h);
            tvi.h("ns", "yt");
            tvi.h("docid", this.f);
            tvi.h("ver", "2");
            this.S.c(tvi);
            if (tvi.d("adformat") != null) {
                tvi.h("el", "adunit");
            }
            else {
                tvi.h("el", "detailpage");
                if (this.k && !TextUtils.isEmpty((CharSequence)this.i)) {
                    tvi.h("autonav", "1");
                }
            }
            if (!TextUtils.isEmpty((CharSequence)this.g)) {
                tvi.h("host_cpn", this.g);
            }
            if (!TextUtils.isEmpty((CharSequence)this.i)) {
                tvi.h("list", this.i);
            }
            if (this.k) {
                tvi.h("autoplay", "1");
            }
            if (this.l) {
                tvi.h("splay", "1");
            }
            if (!this.X) {
                tvi.h("dnc", "1");
            }
            if (!TextUtils.isEmpty((CharSequence)this.F)) {
                tvi.h("referring_app", this.F);
            }
        }
    }
    
    private final void C() {
        synchronized (this) {
            if (this.ac && !this.ai.isEmpty()) {
                final List ai = this.ai;
                final abrc abrc = ai.remove(ai.size() - 1);
                final List ai2 = this.ai;
                Optional.empty();
                ai2.add(aale.m(abrc.a, y(this.w()), abrc.c, abrc.d, abrc.e, abrc.f, abrc.g, abrc.h, abrc.i, abrc.j, abrc.k, abrc.l, abrc.m, (byte)3));
                this.ac = false;
            }
        }
    }
    
    private final void D() {
        final tvi p = this.P;
        if (p != null) {
            final TrackingUrlModel b = this.b;
            if (b != null && !this.t) {
                final int j = this.j;
                if (j != 0) {
                    if (this.s >= j * 1000) {
                        this.t = true;
                        this.F(p, b, false);
                    }
                }
            }
        }
    }
    
    private final void E(final tvi tvi, final znx znx) {
        if (this.u) {
            final String h = this.h;
            final StringBuilder sb = new StringBuilder("Final ping for playback ");
            sb.append(h);
            sb.append(" has already been sent - Ignoring request");
            ttr.l(sb.toString());
            return;
        }
        if (!this.x) {
            this.Y.execute((Runnable)new ztq(this, tvi, znx, 19));
        }
    }
    
    private final void F(final tvi tvi, final TrackingUrlModel trackingUrlModel, final boolean b) {
        final long x = this.x();
        final String y = y(x);
        final tvi c = tvi.c(tvi);
        this.A(c, y);
        c.h("cmt", y(this.w()));
        c.k("conn", this.U.a());
        c.h("vis", this.Z.d().a());
        c.h("uao", this.aa.a());
        String s;
        if (!this.w) {
            s = "0";
        }
        else {
            s = "1";
        }
        c.h("muted", s);
        c.h("volume", String.valueOf(this.v()));
        final int j = this.j;
        if (j > 0) {
            c.k("delay", j);
        }
        if (!TextUtils.equals((CharSequence)this.A, (CharSequence)"-")) {
            c.h("cc", this.A);
        }
        final float b2 = this.B;
        if (b2 != 1.0f) {
            c.h("rate", String.valueOf(b2));
        }
        if (this.d) {
            c.k("reuse", 1);
        }
        if (!TextUtils.equals((CharSequence)"-", (CharSequence)this.aj.b)) {
            c.h("clipid", (String)this.aj.b);
        }
        this.L.ifPresent((Consumer)new aaxy(c, 5));
        if (b) {
            this.M(c, 1, x);
        }
        this.E(c, (znx)new vjn(trackingUrlModel, 0));
    }
    
    private final void G(final boolean b) {
        this.ab = b;
        this.V.c = b;
    }
    
    private final void H() {
        synchronized (this) {
            this.ac = true;
            Optional.empty();
            final String y = y(this.w());
            final int a = this.U.a();
            final String a2 = this.A;
            final float b = this.B;
            final String a3 = this.Z.d().a();
            final String a4 = this.aa.a();
            String s;
            if (!this.Z.e()) {
                s = "0";
            }
            else {
                s = "1";
            }
            final int v = this.v();
            String s2;
            if (!this.w) {
                s2 = "0";
            }
            else {
                s2 = "1";
            }
            final adqh aj = this.aj;
            final Object b2 = aj.b;
            final Object c = aj.c;
            final Optional l = this.L;
            if (l != null) {
                this.ai.add(aale.m(y, "", String.valueOf(a), a3, a2, a4, s, s2, b, v, (String)b2, (String)c, l, (byte)3));
                return;
            }
            throw new NullPointerException("Null multiAudioTrackId");
        }
    }
    
    private final void I() {
        synchronized (this) {
            if (this.ab && !this.ac) {
                this.H();
            }
        }
    }
    
    private static boolean J(final int n) {
        return n == 0;
    }
    
    private final boolean K() {
        final int n = this.n;
        boolean b = true;
        if (n <= 0) {
            final int[] o = this.o;
            if (o != null) {
                if (this.p >= o.length) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    private final boolean L() {
        return this.E != -1L;
    }
    
    private final void M(final tvi tvi, final int n, final long n2) {
        final long ag = this.ag;
        if (ag > 0L && n != 1) {
            tvi.h("rti", y(ag));
        }
        long millis = 0L;
        Label_0125: {
            if (this.o != null) {
                while (this.p < this.o.length) {
                    millis = TimeUnit.SECONDS.toMillis(this.o[this.p++]);
                    if (millis > n2) {
                        break Label_0125;
                    }
                }
            }
            if (this.n > 0) {
                millis = TimeUnit.SECONDS.toMillis(this.n) + n2;
            }
            else {
                millis = 0L;
            }
        }
        if (millis != 0L) {
            Label_0209: {
                if (n != 1) {
                    if (n == 2) {
                        if (this.ab) {
                            break Label_0209;
                        }
                        if (this.N.d() < this.af && !this.ab) {
                            break Label_0209;
                        }
                    }
                    else if (n == 4) {
                        final ScheduledFuture ah = this.ah;
                        if (ah != null) {
                            ah.cancel(true);
                        }
                    }
                    this.ah = null;
                    this.ag = 0L;
                    return;
                }
            }
            tvi.h("rtn", y(millis));
            this.ag = millis;
            final ScheduledFuture ah2 = this.ah;
            if (ah2 != null) {
                ah2.cancel(true);
            }
            this.ah = this.Y.schedule(this.ae, millis - n2, TimeUnit.MILLISECONDS);
        }
    }
    
    private final void N(final int n) {
        monitorenter(this);
        try {
            if (this.K) {
                monitorexit(this);
                return;
            }
            final long x = this.x();
            final String y = y(x);
            final tvi c = tvi.c(this.Q);
            this.A(c, y);
            final List z = this.z();
            String s;
            if (!this.ab) {
                s = "paused";
            }
            else {
                s = "playing";
            }
            c.h("state", s);
            if (this.G) {
                final long r = this.r;
                if (r > 0L) {
                    c.g("lio", y(r));
                }
            }
            if (this.J) {
                c.h("dl", "1");
            }
            final HashMap<String, StringBuilder> hashMap = new HashMap<String, StringBuilder>();
            hashMap.put("st", new StringBuilder());
            hashMap.put("et", new StringBuilder());
            hashMap.put("conn", new StringBuilder());
            hashMap.put("vis", new StringBuilder());
            hashMap.put("uao", new StringBuilder());
            hashMap.put("cc", new StringBuilder());
            hashMap.put("rate", new StringBuilder());
            hashMap.put("blo", new StringBuilder());
            hashMap.put("muted", new StringBuilder());
            hashMap.put("volume", new StringBuilder());
            hashMap.put("clipid", new StringBuilder());
            hashMap.put("als", new StringBuilder());
            hashMap.put("au", new StringBuilder());
            final Iterator iterator = z.iterator();
            String s2 = "";
            boolean b = false;
            boolean b2 = false;
            boolean b3 = false;
            boolean b4 = false;
        Label_0510_Outer:
            while (iterator.hasNext()) {
                final abrc abrc = (abrc)iterator.next();
                while (true) {
                    Label_0531: {
                        if (z.size() == 1) {
                            break Label_0531;
                        }
                        final String s3 = s2;
                        final boolean b5 = b;
                        final boolean b6 = b2;
                        final boolean b7 = b3;
                        final boolean b8 = b4;
                        if (!TextUtils.equals((CharSequence)abrc.a, (CharSequence)abrc.b)) {
                            break Label_0531;
                        }
                        s2 = s3;
                        b = b5;
                        b2 = b6;
                        b3 = b7;
                        b4 = b8;
                        continue Label_0510_Outer;
                    }
                    final StringBuilder sb = hashMap.get("st");
                    sb.append(s2);
                    sb.append(abrc.a);
                    final StringBuilder sb2 = hashMap.get("et");
                    sb2.append(s2);
                    sb2.append(abrc.b);
                    final StringBuilder sb3 = hashMap.get("conn");
                    sb3.append(s2);
                    sb3.append(abrc.c);
                    final StringBuilder sb4 = hashMap.get("vis");
                    sb4.append(s2);
                    sb4.append(abrc.d);
                    final StringBuilder sb5 = hashMap.get("uao");
                    sb5.append(s2);
                    sb5.append(abrc.f);
                    final StringBuilder sb6 = hashMap.get("cc");
                    sb6.append(s2);
                    sb6.append(abrc.e);
                    final StringBuilder sb7 = hashMap.get("rate");
                    sb7.append(s2);
                    sb7.append(abrc.i);
                    final StringBuilder sb8 = hashMap.get("blo");
                    sb8.append(s2);
                    sb8.append(abrc.g);
                    final StringBuilder sb9 = hashMap.get("muted");
                    sb9.append(s2);
                    sb9.append(abrc.h);
                    final StringBuilder sb10 = hashMap.get("volume");
                    sb10.append(s2);
                    sb10.append(abrc.j);
                    final StringBuilder sb11 = hashMap.get("clipid");
                    sb11.append(s2);
                    sb11.append(abrc.k);
                    final StringBuilder sb12 = hashMap.get("als");
                    sb12.append(s2);
                    sb12.append(abrc.l);
                    final StringBuilder sb13 = hashMap.get("au");
                    sb13.append(s2);
                    sb13.append((String)abrc.m.orElse((Object)""));
                    final boolean b9 = b | (TextUtils.equals((CharSequence)abrc.e, (CharSequence)"-") ^ true);
                    final boolean b10 = b2 | (abrc.i == 1.0f ^ true);
                    final boolean b7 = b3 | (TextUtils.equals((CharSequence)"0", (CharSequence)abrc.g) ^ true);
                    final boolean b8 = b4 | (TextUtils.equals((CharSequence)"-", (CharSequence)abrc.k) ^ true);
                    final String s3 = ",";
                    final boolean b5 = b9;
                    final boolean b6 = b10;
                    continue;
                }
            }
            if (!b) {
                hashMap.remove("cc");
            }
            if (!b2) {
                hashMap.remove("rate");
            }
            if (!b3) {
                hashMap.remove("blo");
            }
            if (!b4) {
                hashMap.remove("clipid");
            }
            if (!this.L.isPresent()) {
                hashMap.remove("au");
            }
            for (final Map.Entry<K, StringBuilder> entry : hashMap.entrySet()) {
                if (entry.getValue().toString().length() > 0) {
                    c.i((String)entry.getKey(), entry.getValue().toString(), ",:");
                }
            }
            final boolean b11 = n != 3;
            if (n == 3) {
                c.h("final", "1");
            }
            if (this.K()) {
                this.M(c, n, x);
            }
            this.E(c, (znx)new vjn(this.c, 0));
            this.u |= (true ^ b11);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public static boolean u(final PlayerConfigModel playerConfigModel, final abjj abjj) {
        final int s = abjj.s;
        boolean b2;
        final boolean b = b2 = true;
        if (s != 2) {
            if (playerConfigModel != null) {
                b2 = b;
                if (playerConfigModel.ax()) {
                    return b2;
                }
                if (playerConfigModel.az()) {
                    if (abjj.s == 1) {
                        b2 = b;
                        return b2;
                    }
                    return false;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    private final int v() {
        return this.ad.b;
    }
    
    private final long w() {
        if (!this.G || !abrj.ag(this.ak).f) {
            final long q = this.q;
            final long c = this.C;
            if (q > c && c != 0L) {
                final StringBuilder sb = new StringBuilder("Reported playback position ");
                sb.append(q);
                sb.append(" is greater than the duration of the video ");
                sb.append(c);
                ttr.l(sb.toString());
                return this.C;
            }
        }
        return this.q;
    }
    
    private final long x() {
        return this.N.d() - this.e;
    }
    
    private static String y(long n) {
        final long n2 = n + 50L;
        n = n2 % 1000L / 100L;
        final long n3 = n2 / 1000L;
        final StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n3));
        sb.append(".");
        sb.append(String.valueOf(n));
        return sb.toString();
    }
    
    private final List z() {
        synchronized (this) {
            if (this.ai.isEmpty()) {
                this.H();
                this.C();
            }
            final List ai = this.ai;
            this.ai = new ArrayList();
            return ai;
        }
    }
    
    public final abqy a() {
        return new abqy(this.v, this.t, this.u);
    }
    
    public final void b() {
        this.C();
        this.I();
    }
    
    public final void c(final aamb aamb) {
        if (this.B != aamb.a()) {
            this.B = aamb.a();
            this.C();
            this.I();
        }
    }
    
    public final void d(final aamh z) {
        this.V.a = z.d();
        final aamh z2 = this.Z;
        if (z2 != null && z2.d() == z.d() && this.Z.e() == z.e()) {
            return;
        }
        this.C();
        this.Z = z;
        this.I();
    }
    
    public final void e(final aanl aanl) {
        if (!TextUtils.equals((CharSequence)this.A, (CharSequence)aanl.b())) {
            this.A = aanl.b();
            this.C();
            this.I();
        }
    }
    
    public final void f(final aanq aanq) {
        if (this.aa != aanq.a()) {
            this.C();
            this.aa = aanq.a();
            this.I();
        }
    }
    
    public final void g(final ypj ypj) {
        final FormatStreamModel e = ypj.e();
        final FormatStreamModel f = ypj.f();
        final int n = 0;
        int e2;
        if (f == null) {
            e2 = 0;
        }
        else {
            e2 = f.e();
        }
        this.y = e2;
        int e3;
        if (e == null) {
            e3 = n;
        }
        else {
            e3 = e.e();
        }
        this.z = e3;
        if (this.L.isPresent() && e != null && !((String)this.L.get()).equals(e.q())) {
            this.L = Optional.of((Object)e.q());
            this.t();
        }
    }
    
    public final void h() {
        this.C();
        if (this.v) {
            this.N(3);
        }
    }
    
    public final void i() {
        this.G(false);
        this.D();
        this.C();
        if (this.s > 0L) {
            if (this.K()) {
                final ScheduledFuture ah = this.ah;
                if (ah != null) {
                    ah.cancel(true);
                    this.ah = null;
                }
            }
            this.N(2);
        }
    }
    
    public final void j() {
        if (!this.ab) {
            return;
        }
        this.C();
        this.w = true;
        this.I();
    }
    
    public final void k() {
        this.G(false);
        if (((vai)this.al.e).f(45382253L)) {
            this.o();
        }
    }
    
    public final void l(final long q) {
        this.C();
        this.q = q;
        this.I();
    }
    
    public final void m(final long q) {
        if (this.ab) {
            final StringBuilder sb = new StringBuilder("Warning: unexpected playback play ");
            sb.append(q);
            sb.append(" suppressed");
            ttr.l(sb.toString());
            return;
        }
        this.G(true);
        this.q = q;
    }
    
    public final void n() {
        this.G(false);
    }
    
    public final void o() {
        this.C();
        if (this.v) {
            this.N(4);
        }
    }
    
    public final void p() {
        if (!this.ab) {
            return;
        }
        this.C();
        this.w = false;
        this.I();
    }
    
    public final void q(final aant aant) {
        if (aant.f() > 0L) {
            this.C = aant.f();
        }
        if (aant.j()) {
            final long e = aant.e();
            final long q = this.q;
            if (e >= -5000L + q && e <= 5000L + q) {
                if (e < q) {
                    return;
                }
                final long n = this.s + (e - q);
                this.s = n;
                this.q = e;
                this.r = aant.b() - aant.e();
                this.af = aant.c() + 30000L;
                this.V.b = e;
                final int v = this.v();
                if (v != this.D && !this.L()) {
                    this.D = v;
                    this.E = n;
                }
                final long e2 = this.E;
                if (this.L() && n - e2 > 2000L) {
                    this.E = -1L;
                    this.D = v;
                    this.C();
                    this.I();
                }
                if (!this.v) {
                    this.v = true;
                    this.F(this.O, this.a, this.K());
                }
                else if (this.K() && this.ah == null) {
                    this.s();
                }
                this.I();
                this.D();
            }
            else {
                final StringBuilder sb = new StringBuilder("Warning: unexpected playback progress ");
                sb.append(e);
                sb.append(" for current playback position ");
                sb.append(q);
                ttr.l(sb.toString());
                this.l(e);
            }
        }
    }
    
    public final void r() {
        if (this.ac) {
            ttr.n("VSS2 client released unexpectedly", (Throwable)new Exception());
            this.o();
        }
        this.W.g((zpj)this.V);
        this.ad.b();
    }
    
    public final void s() {
        synchronized (this) {
            if (!this.u) {
                this.C();
                this.N(2);
                this.I();
            }
        }
    }
    
    public final void t() {
        this.C();
        this.I();
    }
}
