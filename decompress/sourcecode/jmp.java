import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchController$1;
import android.media.AudioRecord;
import java.util.List;
import android.media.SoundPool;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.ConnectivitySlimStatusBarController;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import android.media.SoundPool$OnLoadCompleteListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmp implements SoundPool$OnLoadCompleteListener, jms, tec
{
    protected acxf A;
    public final uyi B;
    public final arud C;
    public final agjt D;
    public final cxz E;
    private final Context G;
    private final acxp H;
    private final ScheduledExecutorService I;
    private final acvr J;
    private final tku K;
    private final int L;
    private final int M;
    private final int N;
    private int O;
    private int P;
    private int Q;
    private boolean R;
    private final uyf S;
    private final adjo T;
    private final adbp U;
    public final jmo a;
    public final jmt b;
    public final ConnectivitySlimStatusBarController c;
    public final Handler d;
    public final thh e;
    public final vjl f;
    public final wwv g;
    public final wyo h;
    public final aum i;
    public acxg j;
    public final Runnable k;
    SoundPool l;
    final int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public List r;
    public boolean s;
    public ahca t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    AudioRecord z;
    
    public jmp(final Context g, final arud c, final uyf s, final adjo t, final adbp u, final cxz e, final acxp h, final ScheduledExecutorService i, final thh e2, final vjl f, final jmo a, final jmt b, final ConnectivitySlimStatusBarController c2, final Handler d, final wwv g2, final wyo h2, final aum j, final uyi b2, final agjt d2, final acvr k, final tku l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.O = 2;
        this.P = 16;
        this.Q = 16000;
        this.r = (List)afcr.q();
        this.G = g;
        this.C = c;
        this.S = s;
        this.T = t;
        this.U = u;
        this.E = e;
        this.H = h;
        this.I = i;
        this.e = e2;
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c2;
        this.d = d;
        this.g = g2;
        this.h = h2;
        this.i = j;
        this.J = k;
        this.B = b2;
        this.D = d2;
        this.K = l;
        (this.l = new SoundPool(5, 3, 0)).setOnLoadCompleteListener((SoundPool$OnLoadCompleteListener)this);
        this.m = this.l.load(g, 2131951697, 0);
        this.L = this.l.load(g, 2131951708, 0);
        this.M = this.l.load(g, 2131951696, 0);
        this.N = this.l.load(g, 2131951660, 0);
        b.e(this);
        this.o = e2.p();
        this.k = (Runnable)new jcd(this, 19);
        if (b2.cj()) {
            j.getLifecycle().b((aul)new VoiceSearchController$1(j, d2, (byte[])null, (byte[])null));
        }
    }
    
    private final String q() {
        final String n = adbp.n();
        final String a = this.U.a();
        if (!n.isEmpty() && !a.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append("-");
            sb.append(a);
            return sb.toString();
        }
        return "en-US";
    }
    
    private final void r(final int n) {
        final SoundPool l = this.l;
        if (l != null && l.play(n, 1.0f, 1.0f, 0, 0, 1.0f) == 0 && n == this.m) {
            this.R = true;
        }
    }
    
    public final qw a() {
        return new jml(this);
    }
    
    public final ListenableFuture b() {
        return afva.t(this.E.F(), 300L, TimeUnit.MILLISECONDS, this.I);
    }
    
    public final void c() {
        if (this.b.s() && !this.r.isEmpty()) {
            final StringBuilder sb = new StringBuilder(this.G.getResources().getString(2132020000));
            sb.append(this.b.b());
            sb.append("''");
            final List r = this.r;
            int n = 0;
            sb.append((String)r.get(0));
            sb.append("''");
            this.b.f(sb);
            final StringBuilder sb2 = new StringBuilder();
            for (final String s : this.r) {
                ++n;
                sb2.append("''");
                sb2.append(s);
                sb2.append("''");
                if (n >= this.b.a()) {
                    break;
                }
                sb2.append("\n\n");
            }
            this.b.d(sb2);
        }
    }
    
    public final void d() {
        this.l();
        this.b.l();
        this.b.c();
    }
    
    public final void f() {
        this.g.J(3, (wxz)new wws(wya.c(88272)), (alff)null);
        this.a.e();
    }
    
    public final void g(String q, final byte[] array, final String s) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final ashe cg = this.B.cg();
        final boolean b = false;
        final Boolean value = false;
        asjg.b((AtomicReference)cg.aw((Object)value).Z((asix)new jmj(atomicBoolean, 2)));
        if (atomicBoolean.get()) {
            tcp.i(this.K.a(), (tco)new hfi(this, 20));
        }
        else {
            this.s = false;
            this.t = ahca.a;
        }
        if (this.A == null) {
            this.A = (acxf)new jmn(this, 0);
        }
        final jmm jmm = new jmm(this);
        boolean b2;
        if (q.isEmpty()) {
            q = this.q();
            b2 = false;
        }
        else {
            b2 = true;
        }
        if (this.j == null) {
            trn.h("voz", "about to create request");
            final acxh l = this.T.l(this.A, (acxe)jmm, this.Q, q, array, gkt.aQ(this.C), this.O, this.P, s, this.q());
            l.H = gkt.aR(this.C);
            l.A = gkt.ae(this.C);
            l.c(gkt.af(this.C));
            l.C = gkt.an(this.C);
            l.s = gkt.aN(this.C);
            boolean z = b;
            if (gkt.u(this.S)) {
                z = b;
                if (b2) {
                    z = true;
                }
            }
            l.z = z;
            l.b(aexq.k(gkt.ap(this.C)));
            l.E = gkt.al(this.C);
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean();
            asjg.b((AtomicReference)this.B.cc().aw((Object)value).Z((asix)new jmj(atomicBoolean2, 2)));
            l.t = atomicBoolean2.get();
            l.w = this.B.cj();
            l.F = this.J;
            l.x = this.s;
            l.y = this.t;
            this.j = l.a();
        }
    }
    
    public final void h() {
        if (this.n) {
            this.g.J(3, (wxz)new wws(wya.c(62943)), (alff)null);
            this.r(this.M);
            this.p = true;
            this.m();
            return;
        }
        this.n();
    }
    
    public final void i() {
        if (!this.n && this.b.t()) {
            return;
        }
        this.r(this.N);
    }
    
    public final void j() {
        this.r(this.L);
    }
    
    public final void k() {
        final acxg j = this.j;
        if (j != null) {
            j.a();
            this.j = null;
        }
    }
    
    public final void l() {
        this.n = false;
        this.x = false;
        this.y = false;
        final acxg j = this.j;
        if (j != null) {
            j.c();
        }
    }
    
    public final void m() {
        this.l();
        this.b.p(this.o, this.p);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean a = ((tge)o).a();
            this.o = a;
            final ConnectivitySlimStatusBarController c = this.c;
            if (c != null) {
                c.r(a ^ true);
            }
            final boolean o2 = this.o;
            array = null;
            if (o2) {
                this.d.removeCallbacks(this.k);
                this.b.h();
                if (!TextUtils.isEmpty((CharSequence)this.u)) {
                    this.b.r();
                    return null;
                }
            }
            else if (this.n) {
                this.d.postDelayed(this.k, 3000L);
            }
            else {
                this.d();
            }
        }
        else {
            array = new Class[] { tge.class };
        }
        return array;
    }
    
    public final void n() {
        this.n = true;
        this.p = false;
        this.q = false;
        this.b.j();
        final acxg j = this.j;
        if (j != null && j.f()) {
            this.r(this.m);
            return;
        }
        this.a.g();
    }
    
    public final void o() {
        this.n = false;
        this.A = null;
        final SoundPool l = this.l;
        if (l != null) {
            l.release();
            this.l = null;
        }
        this.k();
    }
    
    public final void onLoadComplete(final SoundPool soundPool, final int n, int m) {
        m = this.m;
        if (n == m && this.R) {
            this.r(m);
            this.R = false;
        }
    }
    
    public final boolean p() {
        final AudioRecord a = this.H.a();
        this.z = a;
        if (a != null) {
            this.O = a.getAudioFormat();
            this.P = this.z.getChannelConfiguration();
            this.Q = this.z.getSampleRate();
            return true;
        }
        return false;
    }
}
