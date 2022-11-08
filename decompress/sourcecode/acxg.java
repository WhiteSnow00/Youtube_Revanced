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

public final class acxg
{
    public final int A;
    public final adcr B;
    private final CronetEngine C;
    private final String D;
    private String E;
    private final byte[] F;
    private final zki G;
    private final String H;
    private final rfv I;
    private artt J;
    private final acvr K;
    private final int L;
    private boolean M;
    private final String N;
    private final boolean O;
    private final aexq P;
    private final String Q;
    private final String R;
    private final boolean S;
    private final int T;
    public final aetv a;
    protected final AudioRecord b;
    public final Handler c;
    public final acxf d;
    public final acxe e;
    public final String f;
    public final Executor g;
    public final aets h;
    public final aetu i;
    public final acxl j;
    public final int k;
    final arug l;
    public aetx m;
    volatile asgb n;
    public final asgb o;
    public final Runnable p;
    public final acxo q;
    public final float r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final ahca x;
    public final int y;
    public final int z;
    
    public acxg(final acxh acxh) {
        this.j = new acxl();
        final int n = 3;
        this.o = (asgb)new grq(this, 3);
        this.p = new acxd(this);
        this.q = new acxo();
        final int i = acxh.i;
        this.L = i;
        this.C = acxh.a;
        this.I = acxh.b;
        this.B = acxh.I;
        this.d = acxh.g;
        this.e = acxh.h;
        this.l = new arug();
        this.f = acxh.l;
        this.g = acxh.d;
        this.c = acxh.e;
        this.F = acxh.m;
        this.G = acxh.c;
        this.z = acxh.H;
        this.H = acxh.f;
        int g = acxh.G;
        this.T = g;
        final int l = this.l();
        final boolean k = this.k(i);
        this.M = k;
        Label_0239: {
            if (k) {
                final int c = acxo.c(l);
                if (c != 4) {
                    if (acxo.a(acxo.b(c)) != null) {
                        break Label_0239;
                    }
                }
            }
            g = 2;
        }
        this.A = g;
        this.D = acxh.q;
        int b;
        if ((b = acxh.B) <= 0) {
            b = 1024;
        }
        this.k = b;
        final agza builder = aets.a.createBuilder();
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
            ((aets)builder.instance).b = n3 - 2;
            final int j = acxh.i;
            builder.copyOnWrite();
            ((aets)builder.instance).c = j;
            this.h = (aets)builder.build();
            final agza builder2 = aetu.a.createBuilder();
            builder2.copyOnWrite();
            ((aetu)builder2.instance).b = 1;
            builder2.copyOnWrite();
            ((aetu)builder2.instance).c = 16000;
            builder2.copyOnWrite();
            ((aetu)builder2.instance).d = 100;
            this.i = (aetu)builder2.build();
            final int o = acxh.o;
            final int n4 = acxh.n;
            try {
                b2 = new AudioRecord(6, i, o, n4, Math.max(1280, AudioRecord.getMinBufferSize(i, o, n4)));
            }
            catch (final IllegalArgumentException ex) {}
            this.b = b2;
            final agza builder3 = aetv.a.createBuilder();
            final String m = acxh.k;
            builder3.copyOnWrite();
            ((aetv)builder3.instance).b = m;
            final String j2 = acxh.j;
            builder3.copyOnWrite();
            ((aetv)builder3.instance).c = j2;
            this.a = (aetv)builder3.build();
            this.r = acxh.A;
            this.O = acxh.s;
            this.N = acxh.p;
            this.P = acxh.C;
            this.s = acxh.z;
            this.Q = acxh.r;
            this.t = acxh.w;
            this.R = acxh.D;
            this.y = acxh.E;
            this.u = acxh.t;
            this.K = acxh.F;
            this.S = acxh.u;
            this.v = acxh.v;
            ahca x;
            if ((x = acxh.y) == null) {
                x = ahca.a;
            }
            this.x = x;
            this.w = acxh.x;
            return;
        }
        throw null;
    }
    
    private final void i() {
        final String k = this.G.k();
        if (k != null) {
            this.l.f(arub.c("X-Goog-Visitor-Id", arug.c), k);
        }
    }
    
    private final void j() {
        this.M = false;
        if (!this.e()) {
            return;
        }
        try {
            final acxo q = this.q;
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
            final acxo q = this.q;
            q.c = new acxm();
            final acxm c = q.c;
            final int c2 = acxo.c(l);
            c.e = c2;
            if (c2 == 1 || c2 == 4) {
                throw new acxn("Codec not set properly.");
            }
            int n2;
            if ((n2 = c2) == 2) {
                if (n != 16000) {
                    throw new acxn("AMR-WB encoder requires a sample rate of 16kHz.");
                }
                n2 = 2;
            }
            final MediaCodecInfo a = acxo.a(acxo.b(n2));
            if (a != null) {
                c.b = MediaCodec.createByCodecName(a.getName());
                final MediaFormat mediaFormat = new MediaFormat();
                final int c3 = acxo.c(l);
                mediaFormat.setString("mime", acxo.b(c3));
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
            throw new acxn("Encoder not found.");
        }
        catch (final acxn | IOException | IllegalArgumentException ex) {
            return false;
        }
    }
    
    private final int l() {
        int n = this.A;
        if (n == 0) {
            n = this.T;
        }
        final int n2 = n - 1;
        if (n == 0) {
            throw null;
        }
        int n3 = 2;
        if (n2 != 2) {
            if (n2 != 4) {
                n3 = 1;
            }
            return n3;
        }
        return 23851;
    }
    
    public final void a() {
        final AudioRecord b = this.b;
        if (b != null) {
            b.release();
        }
        final artt j = this.J;
        if (j != null) {
            final asce c = ((ascf)j).c;
            final int a = asce.a;
            c.a();
            final asbz asbz = (asbz)((asaj)j).a;
            asbz.H.a(1, "shutdownNow() called");
            asbz.n();
            final asbw i = asbz.J;
            i.c.n.execute((Runnable)new arzs(i, 18));
            asbz.n.execute((Runnable)new arzs(asbz, 12));
        }
    }
    
    public final void b() {
        if (this.m == null) {
            final zkh c = this.G.c();
            if (!c.z() && c instanceof AccountIdentity) {
                final aucj g = this.I.g((AccountIdentity)c);
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
            final zkh c2 = this.G.c();
            if (c2 != null && c2.w()) {
                this.l.f(arub.c("X-Goog-PageId", arug.c), c2.e());
            }
            if (aexs.f(this.E)) {
                this.l.f(arub.c("x-goog-api-key", arug.c), this.D);
                this.i();
            }
            else if (this.O) {
                this.i();
            }
            final arxs b = arxs.b(this.R, 443, this.C);
            b.b.e.addAll(Arrays.asList(new acxj(this.l, this.E)));
            b.b.i = this.H;
            final artt a = b.a();
            this.J = a;
            this.m = (aetx)aetx.c((asfq)new nzh(3), (arrl)a);
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
                ((asfs)this.n).a.b("Reset conversation", Status.b.asException());
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
            this.c.post((Runnable)new abxb(this, 15));
            this.g.execute(aesm.h((Runnable)new acxb(this)));
            return true;
        }
        trn.b("AudioRecord is null or not initialized");
        return false;
    }
    
    protected final void g(final agza agza) {
        final agza builder = ((agzi)akez.a).createBuilder();
        final boolean s = this.s;
        builder.copyOnWrite();
        final akez akez = (akez)builder.instance;
        akez.b |= 0x4;
        akez.e = (s ^ true);
        final String q = this.Q;
        builder.copyOnWrite();
        final akez akez2 = (akez)builder.instance;
        q.getClass();
        akez2.b |= 0x1;
        akez2.c = q;
        if (this.s) {
            final String f = this.f;
            builder.copyOnWrite();
            final akez akez3 = (akez)builder.instance;
            f.getClass();
            akez3.b |= 0x2;
            akez3.d = f;
        }
        final akez i = (akez)builder.build();
        agza.copyOnWrite();
        final akfb akfb = (akfb)agza.instance;
        final akfb a = akfb.a;
        i.getClass();
        akfb.i = i;
        akfb.b |= 0x40000;
    }
    
    protected final void h(agza agza) {
        final agza builder = ((agzi)aptm.a).createBuilder();
        if (this.P.h()) {
            final String c = (String)this.P.c();
            builder.copyOnWrite();
            final aptm aptm = (aptm)builder.instance;
            aptm.b |= 0x200;
            aptm.c = c;
        }
        Object o = ((agzi)apto.a).createBuilder();
        ((agza)o).copyOnWrite();
        final apto apto = (apto)((agza)o).instance;
        final aptm d = (aptm)builder.build();
        d.getClass();
        apto.d = d;
        apto.b |= 0x4;
        final agza builder2 = ((agzi)anvh.a).createBuilder();
        final boolean a = this.K.a;
        builder2.copyOnWrite();
        final anvh anvh = (anvh)builder2.instance;
        anvh.b |= 0x2;
        anvh.c = a;
        final boolean b = this.K.b;
        builder2.copyOnWrite();
        final anvh anvh2 = (anvh)builder2.instance;
        anvh2.b |= 0x8;
        anvh2.d = b;
        final anvh e = (anvh)builder2.build();
        ((agza)o).copyOnWrite();
        final apto apto2 = (apto)((agza)o).instance;
        e.getClass();
        apto2.e = e;
        apto2.b |= 0x80;
        Object builder3 = ((agzi)aptn.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)this.N)) {
            final String n = this.N;
            ((agza)builder3).copyOnWrite();
            final aptn aptn = (aptn)((agza)builder3).instance;
            n.getClass();
            aptn.b |= 0x80;
            aptn.d = n;
        }
        while (true) {
            try {
                final akxg c2 = (akxg)agzi.parseFrom((agzi)akxg.a, this.F);
                if (c2 != null) {
                    ((agza)builder3).copyOnWrite();
                    final aptn aptn2 = (aptn)((agza)builder3).instance;
                    aptn2.c = c2;
                    aptn2.b |= 0x1;
                }
                final boolean s = this.S;
                ((agza)builder3).copyOnWrite();
                final aptn aptn3 = (aptn)((agza)builder3).instance;
                aptn3.b |= 0x800;
                aptn3.e = s;
                builder3 = ((agza)builder3).build();
                ((agza)o).copyOnWrite();
                final apto apto3 = (apto)((agza)o).instance;
                ((agza)builder3).getClass();
                apto3.c = (aptn)builder3;
                apto3.b |= 0x1;
                agza.copyOnWrite();
                agza = (agza)agza.instance;
                builder3 = ((agza)o).build();
                o = akfb.a;
                builder3.getClass();
                ((akfb)agza).f = (apto)builder3;
                ((akfb)agza).b |= 0x1000;
            }
            catch (final ahab ahab) {
                continue;
            }
            break;
        }
    }
}
