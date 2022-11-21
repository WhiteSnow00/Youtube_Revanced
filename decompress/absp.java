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

public final class absp
{
    public String A;
    public float B;
    public long C;
    public int D;
    public long E;
    public final String F;
    public final boolean G;
    public final znz H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public Optional L;
    public final aajb M;
    private final oco N;
    private final twk O;
    private final twk P;
    private final twk Q;
    private final apup R;
    private final zkn S;
    private final tsd T;
    private final tkq U;
    private final abst V;
    private final zrg W;
    private final boolean X;
    private final ScheduledExecutorService Y;
    private aaoe Z;
    public final TrackingUrlModel a;
    private ablk aa;
    private boolean ab;
    private boolean ac;
    private final twn ad;
    private final Runnable ae;
    private long af;
    private long ag;
    private ScheduledFuture ah;
    private List ai;
    private final adry aj;
    private final absv ak;
    private final arzb al;
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
    public final zkr m;
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
    public absp(final ScheduledExecutorService y, final aajb m, final zkr i, final oco n, final TrackingUrlModel a, final TrackingUrlModel b, final TrackingUrlModel c, final boolean d, final String f, final long c2, final int j, final boolean k, final boolean l, final boolean g, final boolean w, final String g2, final String h, final String i2, final long e, final String a2, final float b2, final aaoe z, final ablk aa, final tkq u, final zkn s, final tsd t, final zrg w2, final int n2, final int[] o, final int p49, final boolean x, String f2, final zoa zoa, final arzb al, final absv ak, final int d2, final long e2, final adry aj, final boolean j2, final boolean v, final boolean t2, final boolean u2, final twn ad, final boolean k2, final apup r, final Optional l2, final byte[] array, final byte[] array2, final byte[] array3) {
        this.ae = (Runnable)new abgl(this, 17);
        this.Y = y;
        this.M = m;
        this.m = i;
        this.N = n;
        a.getClass();
        this.a = a;
        final twk b3 = twk.b(a.c());
        this.O = b3;
        this.b = b;
        twk b4;
        if (b != null) {
            b4 = twk.b(b.c());
        }
        else {
            b4 = null;
        }
        this.P = b4;
        c.getClass();
        this.c = c;
        final twk b5 = twk.b(c.c());
        this.Q = b5;
        this.d = d;
        this.al = al;
        this.ak = ak;
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
        w2.e((zrf)(this.V = new abst(u, z.d(), aa, n, e, h)));
        this.n = n2;
        this.o = o;
        this.p = p49;
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
        this.H = zoa.c();
        this.I = zoa.k();
        this.R = r;
        this.L = l2;
        ad.a();
        this.B(b3);
        this.B(b5);
        this.B(b4);
    }
    
    public absp(final ScheduledExecutorService scheduledExecutorService, final aajb aajb, final zkr zkr, final oco oco, final tkq tkq, final twn twn, final zkn zkn, final zrg zrg, final tsd tsd, final aamy aamy, final zoa zoa, final arzb arzb, final absv absv, final abkq abkq, final abls abls, final apup apup, final adry adry, final PlaybackStartDescriptor playbackStartDescriptor, final String s, final PlayerResponseModel playerResponseModel, final String s2, int i, final boolean b, final boolean b2, final boolean b3, final byte[] array, final byte[] array2, final byte[] array3) {
        final TrackingUrlModel b4 = playerResponseModel.o().b;
        final TrackingUrlModel c = playerResponseModel.o().c;
        final TrackingUrlModel d = playerResponseModel.o().d;
        final boolean b5 = playerResponseModel.r().e() == 2L || playerResponseModel.r().e() == 3L;
        final String k = playerResponseModel.K();
        final long millis = TimeUnit.SECONDS.toMillis(playerResponseModel.h());
        final TrackingUrlModel c2 = playerResponseModel.o().c;
        int n;
        if (!abls.l()) {
            n = 0;
        }
        else {
            n = 4;
        }
        int b6;
        if (c2 == null) {
            b6 = 0;
        }
        else {
            b6 = c2.b(n);
        }
        final boolean b7 = J(i) && abls.l();
        final boolean b8 = J(i) && abls.o();
        final boolean t = playerResponseModel.T();
        final boolean b9 = J(i) && u(playerResponseModel.m(), abkq);
        String j;
        if (J(i) && playbackStartDescriptor != null) {
            j = playbackStartDescriptor.i();
        }
        else {
            j = null;
        }
        final long d2 = oco.d();
        final aaoe c3 = abkq.c();
        final ablk r = abkq.r;
        i = playerResponseModel.o().i;
        final int[] l = playerResponseModel.o().j;
        final boolean b10 = aamy.b;
        final String s3 = (String)aamy.e.a();
        final int b11 = twn.b;
        final boolean b12 = playerResponseModel.o().k != null && absv.aj(arzb) && absv.ak(arzb) && absv.ai(arzb);
        final boolean b13 = playerResponseModel.o().k != null && absv.aj(arzb) && absv.ak(arzb) && !absv.ai(arzb);
        Optional optional;
        if (playerResponseModel.V()) {
            optional = Collection$_EL.stream((Collection)playerResponseModel.n().o).filter((Predicate)xas.p).filter((Predicate)xas.q).findFirst().map((Function)zzl.m);
        }
        else {
            optional = Optional.empty();
        }
        this(scheduledExecutorService, aajb, zkr, oco, b4, c, d, b5, k, millis, b6, b7, b8, t, b9, s, s2, j, d2, "-", 1.0f, c3, r, tkq, zkn, tsd, zrg, i, l, 0, b10, s3, zoa, arzb, absv, b11, -1L, adry, b12, b, b2, b3, twn, b13, apup, optional, null, null, null);
    }
    
    public absp(final ScheduledExecutorService scheduledExecutorService, final aajb aajb, final zkr zkr, final oco oco, final tkq tkq, final zkn zkn, final zrg zrg, final tsd tsd, final aamy aamy, final zoa zoa, final arzb arzb, final absv absv, final abkq abkq, final apup apup, final VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState, final adry adry, final twn twn, final byte[] array, final byte[] array2, final byte[] array3) {
        this(scheduledExecutorService, aajb, zkr, oco, videoStats2Client$VideoStats2ClientState.a, videoStats2Client$VideoStats2ClientState.b, videoStats2Client$VideoStats2ClientState.c, videoStats2Client$VideoStats2ClientState.d, videoStats2Client$VideoStats2ClientState.h, videoStats2Client$VideoStats2ClientState.g, videoStats2Client$VideoStats2ClientState.l, videoStats2Client$VideoStats2ClientState.o, videoStats2Client$VideoStats2ClientState.p, videoStats2Client$VideoStats2ClientState.u, videoStats2Client$VideoStats2ClientState.v, videoStats2Client$VideoStats2ClientState.i, videoStats2Client$VideoStats2ClientState.j, videoStats2Client$VideoStats2ClientState.k, videoStats2Client$VideoStats2ClientState.e, videoStats2Client$VideoStats2ClientState.A, videoStats2Client$VideoStats2ClientState.B, abkq.c(), abkq.r, tkq, zkn, tsd, zrg, videoStats2Client$VideoStats2ClientState.C, videoStats2Client$VideoStats2ClientState.D, videoStats2Client$VideoStats2ClientState.E, aamy.b, videoStats2Client$VideoStats2ClientState.F, zoa, arzb, absv, videoStats2Client$VideoStats2ClientState.y, videoStats2Client$VideoStats2ClientState.z, adry, videoStats2Client$VideoStats2ClientState.G, videoStats2Client$VideoStats2ClientState.r, videoStats2Client$VideoStats2ClientState.q, videoStats2Client$VideoStats2ClientState.s, twn, videoStats2Client$VideoStats2ClientState.H, apup, videoStats2Client$VideoStats2ClientState.I, null, null, null);
        this.q = videoStats2Client$VideoStats2ClientState.f;
        this.s = videoStats2Client$VideoStats2ClientState.m;
        this.x = videoStats2Client$VideoStats2ClientState.t;
        this.y = videoStats2Client$VideoStats2ClientState.w;
        this.z = videoStats2Client$VideoStats2ClientState.x;
    }
    
    private final void A(final twk twk, final String s) {
        for (final Map.Entry<String, V> entry : this.S.a().entrySet()) {
            twk.h((String)entry.getKey(), (String)entry.getValue());
        }
        twk.h("rt", s);
        twk.h("len", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.C)));
        final tsd t = this.T;
        if (t != null) {
            twk.h("lact", String.valueOf(t.a()));
        }
        if (this.z == 0 && this.y == 0) {
            tut.l("Warning: Sending VSS ping without a format parameter.");
        }
        final int y = this.y;
        if (y > 0) {
            twk.k("fmt", y);
        }
        final int z = this.z;
        if (z > 0 && z != this.y) {
            twk.k("afmt", z);
        }
        final apup r = this.R;
        if (r != null && (r.b & 0x1) != 0x0) {
            twk.e(r.c);
        }
    }
    
    private final void B(final twk twk) {
        if (twk != null) {
            twk.h("cpn", this.h);
            twk.h("ns", "yt");
            twk.h("docid", this.f);
            twk.h("ver", "2");
            this.S.c(twk);
            if (twk.d("adformat") != null) {
                twk.h("el", "adunit");
            }
            else {
                twk.h("el", "detailpage");
                if (this.k && !TextUtils.isEmpty((CharSequence)this.i)) {
                    twk.h("autonav", "1");
                }
            }
            if (!TextUtils.isEmpty((CharSequence)this.g)) {
                twk.h("host_cpn", this.g);
            }
            if (!TextUtils.isEmpty((CharSequence)this.i)) {
                twk.h("list", this.i);
            }
            if (this.k) {
                twk.h("autoplay", "1");
            }
            if (this.l) {
                twk.h("splay", "1");
            }
            if (!this.X) {
                twk.h("dnc", "1");
            }
            if (!TextUtils.isEmpty((CharSequence)this.F)) {
                twk.h("referring_app", this.F);
            }
        }
    }
    
    private final void C() {
        synchronized (this) {
            if (this.ac && !this.ai.isEmpty()) {
                final List ai = this.ai;
                final abso abso = ai.remove(ai.size() - 1);
                final List ai2 = this.ai;
                Optional.empty();
                ai2.add(aana.m(abso.a, y(this.w()), abso.c, abso.d, abso.e, abso.f, abso.g, abso.h, abso.i, abso.j, abso.k, abso.l, abso.m, (byte)3));
                this.ac = false;
            }
        }
    }
    
    private final void D() {
        final twk p = this.P;
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
    
    private final void E(final twk twk, final zpt zpt) {
        if (this.u) {
            final String h = this.h;
            final StringBuilder sb = new StringBuilder("Final ping for playback ");
            sb.append(h);
            sb.append(" has already been sent - Ignoring request");
            tut.l(sb.toString());
            return;
        }
        if (!this.x) {
            this.Y.execute((Runnable)new zvn(this, twk, zpt, 19));
        }
    }
    
    private final void F(final twk twk, final TrackingUrlModel trackingUrlModel, final boolean b) {
        final long x = this.x();
        final String y = y(x);
        final twk c = twk.c(twk);
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
        this.L.ifPresent((Consumer)new aaqr(c, 12));
        if (b) {
            this.M(c, 1, x);
        }
        this.E(c, (zpt)new vkv(trackingUrlModel, 0));
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
            final adry aj = this.aj;
            final Object b2 = aj.b;
            final Object c = aj.c;
            final Optional l = this.L;
            if (l != null) {
                this.ai.add(aana.m(y, "", String.valueOf(a), a3, a2, a4, s, s2, b, v, (String)b2, (String)c, l, (byte)3));
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
    
    private final void M(final twk twk, final int n, final long n2) {
        final long ag = this.ag;
        if (ag > 0L && n != 1) {
            twk.h("rti", y(ag));
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
            twk.h("rtn", y(millis));
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
            final twk c = twk.c(this.Q);
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
                final abso abso = (abso)iterator.next();
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
                        if (!TextUtils.equals((CharSequence)abso.a, (CharSequence)abso.b)) {
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
                    sb.append(abso.a);
                    final StringBuilder sb2 = hashMap.get("et");
                    sb2.append(s2);
                    sb2.append(abso.b);
                    final StringBuilder sb3 = hashMap.get("conn");
                    sb3.append(s2);
                    sb3.append(abso.c);
                    final StringBuilder sb4 = hashMap.get("vis");
                    sb4.append(s2);
                    sb4.append(abso.d);
                    final StringBuilder sb5 = hashMap.get("uao");
                    sb5.append(s2);
                    sb5.append(abso.f);
                    final StringBuilder sb6 = hashMap.get("cc");
                    sb6.append(s2);
                    sb6.append(abso.e);
                    final StringBuilder sb7 = hashMap.get("rate");
                    sb7.append(s2);
                    sb7.append(abso.i);
                    final StringBuilder sb8 = hashMap.get("blo");
                    sb8.append(s2);
                    sb8.append(abso.g);
                    final StringBuilder sb9 = hashMap.get("muted");
                    sb9.append(s2);
                    sb9.append(abso.h);
                    final StringBuilder sb10 = hashMap.get("volume");
                    sb10.append(s2);
                    sb10.append(abso.j);
                    final StringBuilder sb11 = hashMap.get("clipid");
                    sb11.append(s2);
                    sb11.append(abso.k);
                    final StringBuilder sb12 = hashMap.get("als");
                    sb12.append(s2);
                    sb12.append(abso.l);
                    final StringBuilder sb13 = hashMap.get("au");
                    sb13.append(s2);
                    sb13.append((String)abso.m.orElse((Object)""));
                    final boolean b9 = b | (TextUtils.equals((CharSequence)abso.e, (CharSequence)"-") ^ true);
                    final boolean b10 = b2 | (abso.i == 1.0f ^ true);
                    final boolean b7 = b3 | (TextUtils.equals((CharSequence)"0", (CharSequence)abso.g) ^ true);
                    final boolean b8 = b4 | (TextUtils.equals((CharSequence)"-", (CharSequence)abso.k) ^ true);
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
            this.E(c, (zpt)new vkv(this.c, 0));
            this.u |= (true ^ b11);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public static boolean u(final PlayerConfigModel playerConfigModel, final abkq abkq) {
        final int s = abkq.s;
        boolean b2;
        final boolean b = b2 = true;
        if (s != 2) {
            if (playerConfigModel != null) {
                b2 = b;
                if (playerConfigModel.ax()) {
                    return b2;
                }
                if (playerConfigModel.az()) {
                    if (abkq.s == 1) {
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
        if (!this.G || !absv.ac(this.al).f) {
            final long q = this.q;
            final long c = this.C;
            if (q > c && c != 0L) {
                final StringBuilder sb = new StringBuilder("Reported playback position ");
                sb.append(q);
                sb.append(" is greater than the duration of the video ");
                sb.append(c);
                tut.l(sb.toString());
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
    
    public final absk a() {
        return new absk(this.v, this.t, this.u);
    }
    
    public final void b() {
        this.C();
        this.I();
    }
    
    public final void c(final aany aany) {
        if (this.B != aany.a()) {
            this.B = aany.a();
            this.C();
            this.I();
        }
    }
    
    public final void d(final aaoe z) {
        this.V.a = z.d();
        final aaoe z2 = this.Z;
        if (z2 != null && z2.d() == z.d() && this.Z.e() == z.e()) {
            return;
        }
        this.C();
        this.Z = z;
        this.I();
    }
    
    public final void e(final aapi aapi) {
        if (!TextUtils.equals((CharSequence)this.A, (CharSequence)aapi.b())) {
            this.A = aapi.b();
            this.C();
            this.I();
        }
    }
    
    public final void f(final aapn aapn) {
        if (this.aa != aapn.a()) {
            this.C();
            this.aa = aapn.a();
            this.I();
        }
    }
    
    public final void g(final yre yre) {
        final FormatStreamModel e = yre.e();
        final FormatStreamModel f = yre.f();
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
        if (((vbs)this.ak.e).f(45382253L)) {
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
            tut.l(sb.toString());
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
    
    public final void q(final aapq aapq) {
        if (aapq.f() > 0L) {
            this.C = aapq.f();
        }
        if (aapq.j()) {
            final long e = aapq.e();
            final long q = this.q;
            if (e >= -5000L + q && e <= 5000L + q) {
                if (e < q) {
                    return;
                }
                final long n = this.s + (e - q);
                this.s = n;
                this.q = e;
                this.r = aapq.b() - aapq.e();
                this.af = aapq.c() + 30000L;
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
                tut.l(sb.toString());
                this.l(e);
            }
        }
    }
    
    public final void r() {
        if (this.ac) {
            tut.n("VSS2 client released unexpectedly", (Throwable)new Exception());
            this.o();
        }
        this.W.g((zrf)this.V);
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
