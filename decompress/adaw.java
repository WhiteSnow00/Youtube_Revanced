import android.text.TextUtils;
import io.grpc.Status;
import java.util.Collection;
import java.util.Arrays;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import android.media.MediaCodecInfo;
import java.io.IOException;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.media.AudioRecord;
import org.chromium.net.CronetEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adaw
{
    public final int A;
    public final aefs B;
    private final CronetEngine C;
    private final String D;
    private String E;
    private final byte[] F;
    private final zoa G;
    private final String H;
    private final riw I;
    private aryr J;
    private final aczg K;
    private final int L;
    private boolean M;
    private final String N;
    private final boolean O;
    private final afbh P;
    private final String Q;
    private final String R;
    private final boolean S;
    private final int T;
    public final aexn a;
    protected final AudioRecord b;
    public final Handler c;
    public final adav d;
    public final adau e;
    public final String f;
    public final Executor g;
    public final aexk h;
    public final aexm i;
    public final adbb j;
    public final int k;
    final arze l;
    public aexp m;
    volatile asjm n;
    public final asjm o;
    public final Runnable p;
    public final adbe q;
    public final float r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final ahfq x;
    public final int y;
    public final int z;
    
    public adaw(final adax adax) {
        this.j = new adbb();
        final int n = 3;
        this.o = (asjm)new gsf(this, 3);
        this.p = new adas(this);
        this.q = new adbe();
        final int i = adax.i;
        this.L = i;
        this.C = adax.a;
        this.I = adax.b;
        this.B = adax.I;
        this.d = adax.g;
        this.e = adax.h;
        this.l = new arze();
        this.f = adax.l;
        this.g = adax.d;
        this.c = adax.e;
        this.F = adax.m;
        this.G = adax.c;
        this.z = adax.H;
        this.H = adax.f;
        int g = adax.G;
        this.T = g;
        final int l = this.l();
        final boolean k = this.k(i);
        this.M = k;
        Label_0235: {
            if (k) {
                final int c = adbe.c(l);
                if (c != 4) {
                    if (adbe.a(adbe.b(c)) != null) {
                        break Label_0235;
                    }
                }
            }
            g = 2;
        }
        this.A = g;
        this.D = adax.q;
        int b;
        if ((b = adax.B) <= 0) {
            b = 1024;
        }
        this.k = b;
        final ahcr builder = aexk.a.createBuilder();
        final int n2 = g - 1;
        AudioRecord b2 = null;
        if (g != 0) {
            int n3;
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        n3 = n;
                    }
                    else {
                        n3 = 4;
                    }
                }
                else {
                    n3 = 6;
                }
            }
            else {
                n3 = 5;
            }
            builder.copyOnWrite();
            ((aexk)builder.instance).b = n3 - 2;
            final int j = adax.i;
            builder.copyOnWrite();
            ((aexk)builder.instance).c = j;
            this.h = (aexk)builder.build();
            final ahcr builder2 = aexm.a.createBuilder();
            builder2.copyOnWrite();
            ((aexm)builder2.instance).b = 1;
            builder2.copyOnWrite();
            ((aexm)builder2.instance).c = 16000;
            builder2.copyOnWrite();
            ((aexm)builder2.instance).d = 100;
            this.i = (aexm)builder2.build();
            final int o = adax.o;
            final int n4 = adax.n;
            try {
                b2 = new AudioRecord(6, i, o, n4, Math.max(1280, AudioRecord.getMinBufferSize(i, o, n4)));
            }
            catch (final IllegalArgumentException ex) {}
            this.b = b2;
            final ahcr builder3 = aexn.a.createBuilder();
            final String m = adax.k;
            builder3.copyOnWrite();
            ((aexn)builder3.instance).b = m;
            final String j2 = adax.j;
            builder3.copyOnWrite();
            ((aexn)builder3.instance).c = j2;
            this.a = (aexn)builder3.build();
            this.r = adax.A;
            this.O = adax.s;
            this.N = adax.p;
            this.P = adax.C;
            this.s = adax.z;
            this.Q = adax.r;
            this.t = adax.w;
            this.R = adax.D;
            this.y = adax.E;
            this.u = adax.t;
            this.K = adax.F;
            this.S = adax.u;
            this.v = adax.v;
            ahfq x;
            if ((x = adax.y) == null) {
                x = ahfq.a;
            }
            this.x = x;
            this.w = adax.x;
            return;
        }
        throw null;
    }
    
    private final void i() {
        final String k = this.G.k();
        if (k != null) {
            this.l.f(aryz.c("X-Goog-Visitor-Id", arze.c), k);
        }
    }
    
    private final void j() {
        this.M = false;
        if (!this.e()) {
            return;
        }
        try {
            final adbe q = this.q;
            if (!q.b) {
                throw new IllegalStateException("You forgot to call init()!");
            }
            if (!q.a) {
                q.a = true;
                q.c.b();
                q.b = false;
                return;
            }
            throw new IllegalStateException("Already flushed. You must reinitialize.");
        }
        catch (final IllegalStateException ex) {}
    }
    
    private final boolean k(final int n) {
        final int l = this.l();
        if (l == 1) {
            return false;
        }
        try {
            final adbe q = this.q;
            q.c = new adbc();
            final adbc c = q.c;
            final int c2 = adbe.c(l);
            c.e = c2;
            if (c2 == 1 || c2 == 4) {
                throw new adbd("Codec not set properly.");
            }
            int n2;
            if ((n2 = c2) == 2) {
                if (n != 16000) {
                    throw new adbd("AMR-WB encoder requires a sample rate of 16kHz.");
                }
                n2 = 2;
            }
            final MediaCodecInfo a = adbe.a(adbe.b(n2));
            if (a != null) {
                c.b = MediaCodec.createByCodecName(a.getName());
                final MediaFormat mediaFormat = new MediaFormat();
                final int c3 = adbe.c(l);
                mediaFormat.setString("mime", adbe.b(c3));
                mediaFormat.setInteger("sample-rate", n);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("max-input-size", 4096);
                if (c3 != 3) {
                    mediaFormat.setInteger("bitrate", l - 1);
                }
                c.b.configure(mediaFormat, (Surface)null, (MediaCrypto)null, 1);
                c.b.start();
                c.d = false;
                c.c = false;
                c.a = false;
                q.b = true;
                q.a = false;
                return true;
            }
            throw new adbd("Encoder not found.");
        }
        catch (final adbd | IOException | IllegalArgumentException ex) {
            return false;
        }
    }
    
    private final int l() {
        int n = this.A;
        if (n == 0) {
            n = this.T;
        }
        if (n == 0) {
            throw null;
        }
        if (--n == 2) {
            return 23851;
        }
        if (n != 4) {
            return 1;
        }
        return 2;
    }
    
    public final void a() {
        final AudioRecord b = this.b;
        if (b != null) {
            b.release();
        }
        final aryr j = this.J;
        if (j != null) {
            final asgg c = ((asgh)j).c;
            final int a = asgg.a;
            c.a();
            final asgb asgb = (asgb)((asen)j).a;
            asgb.G.a(1, "shutdownNow() called");
            asgb.n();
            final asfy i = asgb.I;
            i.c.n.execute((Runnable)new asdv(i, 18));
            asgb.n.execute((Runnable)new asdv(asgb, 12));
        }
    }
    
    public final void b() {
        if (this.m == null) {
            final znz c = this.G.c();
            if (!c.z() && c instanceof AccountIdentity) {
                final aufw g = this.I.g((AccountIdentity)c);
                if (!g.f()) {
                    this.E = "";
                }
                else {
                    this.E = g.d();
                }
            }
            else {
                this.E = "";
            }
            final znz c2 = this.G.c();
            if (c2 != null && c2.w()) {
                this.l.f(aryz.c("X-Goog-PageId", arze.c), c2.e());
            }
            if (afbj.f(this.E)) {
                this.l.f(aryz.c("x-goog-api-key", arze.c), this.D);
                this.i();
            }
            else if (this.O) {
                this.i();
            }
            final asbz b = asbz.b(this.R, 443, this.C);
            b.b.e.addAll(Arrays.asList(new adaz(this.l, this.E)));
            b.b.i = this.H;
            final aryr a = b.a();
            this.J = a;
            this.m = (aexp)asiz.c((asjb)new obd(3), (arws)a);
        }
    }
    
    public final void c() {
        final AudioRecord b = this.b;
        if (b != null) {
            b.stop();
        }
        synchronized (this) {
            this.j();
            if (this.n != null) {
                ((asjd)this.n).a.b("Reset conversation", (Throwable)Status.b.asException());
                this.n = null;
            }
        }
    }
    
    public final void d() {
        final AudioRecord b = this.b;
        if (b != null) {
            b.stop();
        }
        synchronized (this) {
            this.j();
            if (this.n != null) {
                this.n.a();
                this.n = null;
            }
        }
    }
    
    public final boolean e() {
        return this.A != 2;
    }
    
    public final boolean f() {
        final AudioRecord b = this.b;
        if (b != null && b.getState() == 1) {
            if (!this.M) {
                this.M = this.k(this.L);
            }
            this.b.startRecording();
            this.c.post((Runnable)new acan(this, 16));
            this.g.execute(aewf.h(new adaq(this)));
            return true;
        }
        tut.b("AudioRecord is null or not initialized");
        return false;
    }
    
    protected final void g(final ahcr ahcr) {
        final ahcr builder = ((ahcz)akjd.a).createBuilder();
        final boolean s = this.s;
        builder.copyOnWrite();
        final akjd akjd = (akjd)builder.instance;
        akjd.b |= 0x4;
        akjd.e = (s ^ true);
        final String q = this.Q;
        builder.copyOnWrite();
        final akjd akjd2 = (akjd)builder.instance;
        q.getClass();
        akjd2.b |= 0x1;
        akjd2.c = q;
        if (this.s) {
            final String f = this.f;
            builder.copyOnWrite();
            final akjd akjd3 = (akjd)builder.instance;
            f.getClass();
            akjd3.b |= 0x2;
            akjd3.d = f;
        }
        final akjd i = (akjd)builder.build();
        ahcr.copyOnWrite();
        final akjf akjf = (akjf)ahcr.instance;
        final akjf a = akjf.a;
        i.getClass();
        akjf.i = i;
        akjf.b |= 0x40000;
    }
    
    protected final void h(ahcr ahcr) {
        final ahcr builder = apyk.a.createBuilder();
        if (this.P.h()) {
            final String c = (String)this.P.c();
            builder.copyOnWrite();
            final apyk apyk = (apyk)builder.instance;
            apyk.b |= 0x200;
            apyk.c = c;
        }
        Object builder2 = apym.a.createBuilder();
        ((ahcr)builder2).copyOnWrite();
        final apym apym = (apym)((ahcr)builder2).instance;
        final apyk d = (apyk)builder.build();
        d.getClass();
        apym.d = d;
        apym.b |= 0x4;
        final ahcr builder3 = ((ahcz)anzr.a).createBuilder();
        final boolean a = this.K.a;
        builder3.copyOnWrite();
        final anzr anzr = (anzr)builder3.instance;
        anzr.b |= 0x2;
        anzr.c = a;
        final boolean b = this.K.b;
        builder3.copyOnWrite();
        final anzr anzr2 = (anzr)builder3.instance;
        anzr2.b |= 0x8;
        anzr2.d = b;
        final anzr e = (anzr)builder3.build();
        ((ahcr)builder2).copyOnWrite();
        final apym apym2 = (apym)((ahcr)builder2).instance;
        e.getClass();
        apym2.e = e;
        apym2.b |= 0x80;
        Object c2 = apyl.a.createBuilder();
        if (!TextUtils.isEmpty((CharSequence)this.N)) {
            final String n = this.N;
            ((ahcr)c2).copyOnWrite();
            final apyl apyl = (apyl)((ahcr)c2).instance;
            n.getClass();
            apyl.b |= 0x80;
            apyl.d = n;
        }
        while (true) {
            try {
                final albj c3 = (albj)ahcz.parseFrom((ahcz)albj.a, this.F);
                if (c3 != null) {
                    ((ahcr)c2).copyOnWrite();
                    final apyl apyl2 = (apyl)((ahcr)c2).instance;
                    apyl2.c = c3;
                    apyl2.b |= 0x1;
                }
                final boolean s = this.S;
                ((ahcr)c2).copyOnWrite();
                final apyl apyl3 = (apyl)((ahcr)c2).instance;
                apyl3.b |= 0x800;
                apyl3.e = s;
                c2 = ((ahcr)c2).build();
                ((ahcr)builder2).copyOnWrite();
                final apym apym3 = (apym)((ahcr)builder2).instance;
                ((ahcr)c2).getClass();
                apym3.c = (apyl)c2;
                apym3.b |= 0x1;
                ahcr.copyOnWrite();
                ahcr = (ahcr)ahcr.instance;
                builder2 = ((ahcr)builder2).build();
                c2 = akjf.a;
                ((ahcr)builder2).getClass();
                ((akjf)ahcr).f = (apym)builder2;
                ((akjf)ahcr).b |= 0x1000;
            }
            catch (final ahds ahds) {
                continue;
            }
            break;
        }
    }
}
