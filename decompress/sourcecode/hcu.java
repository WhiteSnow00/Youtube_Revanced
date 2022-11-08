import java.util.concurrent.atomic.AtomicReference;
import java.util.Collection;
import com.google.android.libraries.youtube.creation.music.ShortsCreationSelectedTrack;
import android.os.Looper;
import android.view.View$AccessibilityDelegate;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ContextThemeWrapper;
import com.google.apps.tiktok.account.AccountId;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.MusicWaveformView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.DspSeekBar;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import android.widget.TextView;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcu extends usa implements View$OnClickListener, hci
{
    public alff A;
    public final cya B;
    public avt C;
    public final auip D;
    private final Context F;
    private final cl G;
    private final hbr H;
    private final TextView I;
    private final TextView J;
    private final PlayerView K;
    private asic L;
    private hcs M;
    private final wwv N;
    private aioe O;
    private String P;
    private boolean Q;
    private final qpt R;
    public final Context a;
    public final Executor b;
    public final tzg c;
    public final tzz d;
    public final tzs e;
    public final View f;
    public final Handler g;
    public final TextView h;
    public final DspSeekBar i;
    public final MusicWaveformView j;
    public final hcf k;
    public final boolean l;
    public final hcj m;
    public final ImageView n;
    public final boolean o;
    public final ImageView p;
    public View q;
    public long r;
    public long s;
    public long t;
    public final wwv u;
    public final acex v;
    public tzh w;
    public final hch x;
    final SeekBar$OnSeekBarChangeListener y;
    public wyb z;
    
    public hcu(final Context a, final Executor b, final wwv n, final wwv u, final tzg c, final hbr h, final auip d, final cl g, final cya b2, final tzz d2, final AccountId accountId, final uyi uyi, final aceo aceo, final tzs e, final hcf k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(a, g, u, true, true);
        this.s = -1L;
        this.a = a;
        int n2;
        if (uyi.aT() && uyi.aU()) {
            n2 = 2132083647;
        }
        else {
            n2 = 2132083646;
        }
        final ContextThemeWrapper f = new ContextThemeWrapper(a, n2);
        this.F = (Context)f;
        this.b = b;
        this.H = h;
        this.c = c;
        this.D = d;
        this.G = g;
        this.u = u;
        this.N = n;
        this.B = b2;
        this.d = d2;
        this.e = e;
        this.k = k;
        this.o = d.bz();
        this.J(a.getResources().getString(2132018757));
        final View inflate = LayoutInflater.from((Context)f).inflate(2131624890, (ViewGroup)null);
        this.f = inflate;
        inflate.findViewById(2131431455).setOnClickListener((View$OnClickListener)new gxu(this, 17));
        final ImageView n3 = (ImageView)inflate.findViewById(2131429985);
        n3.getClass();
        this.n = n3;
        this.v = actc.B((tni)aceo, n3);
        this.I = (TextView)inflate.findViewById(2131430418);
        this.h = (TextView)inflate.findViewById(2131427652);
        this.J = (TextView)inflate.findViewById(2131431362);
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131430420);
        viewStub.setLayoutResource(2131624889);
        viewStub.inflate();
        final DspSeekBar i = (DspSeekBar)inflate.findViewById(2131430419);
        this.i = i;
        final hch hch = new hch();
        this.x = hch;
        i.a = hch;
        this.p = (ImageView)inflate.findViewById(2131432459);
        i.setOnSeekBarChangeListener(this.y = (SeekBar$OnSeekBarChangeListener)new hcq(this));
        i.setAccessibilityDelegate((View$AccessibilityDelegate)new hct(this));
        final MusicWaveformView j = (MusicWaveformView)inflate.findViewById(2131432461);
        j.getClass();
        (this.j = j).c(true);
        j.g = (hci)this;
        this.g = new Handler(Looper.getMainLooper());
        final qpt qpt = new qpt(this);
        this.R = qpt;
        final hcj m = new hcj();
        aenz.e((br)m, accountId);
        this.m = m;
        m.af = inflate;
        if (m.ae) {
            m.aK();
        }
        m.ak = qpt;
        this.l = (boolean)((uyi)d.c).l(45357432L).aG();
        this.K = (PlayerView)inflate.findViewById(2131431279);
    }
    
    static final alff B(final long c) {
        final agza builder = ((agzi)alff.a).createBuilder();
        final agza builder2 = ((agzi)algf.a).createBuilder();
        final agza builder3 = ((agzi)alfy.a).createBuilder();
        builder3.copyOnWrite();
        final alfy alfy = (alfy)builder3.instance;
        alfy.b |= 0x1;
        alfy.c = c;
        final alfy e = (alfy)builder3.build();
        builder2.copyOnWrite();
        final algf algf = (algf)builder2.instance;
        e.getClass();
        algf.e = e;
        algf.b |= 0x8;
        final algf d = (algf)builder2.build();
        builder.copyOnWrite();
        final alff alff = (alff)builder.instance;
        d.getClass();
        alff.D = d;
        alff.c |= 0x40000;
        return (alff)builder.build();
    }
    
    private final long N(final long n) {
        long j = n;
        if (this.Q(n)) {
            j = this.j();
        }
        return j;
    }
    
    private final long O() {
        final ShortsCreationSelectedTrack a = this.c.a();
        long longValue = 0L;
        if (a == null) {
            return 0L;
        }
        if (a.f().h()) {
            longValue = (long)a.f().c();
        }
        return Math.min(Math.min(longValue, this.m()), a.b());
    }
    
    private final void P(final long n) {
        szc.f();
        final TextView i = this.I;
        if (i != null) {
            i.setText((CharSequence)qhd.k(this.a, n, false));
            this.I.setContentDescription((CharSequence)tmy.bM(this.a, n));
        }
    }
    
    private final boolean Q(final long n) {
        return n >= this.j();
    }
    
    public final void A(aexq g) {
        if (g.h()) {
            final ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack)g.c();
            final String n = shortsCreationSelectedTrack.n();
            this.r = shortsCreationSelectedTrack.c();
            if (!n.equals(this.P)) {
                this.P = n;
                this.b.execute(aesm.h((Runnable)new gwx(this, 20)));
                if (this.x != null) {
                    this.b.execute(aesm.h((Runnable)new gvu(this, shortsCreationSelectedTrack, 20)));
                }
            }
            else {
                this.b.execute(aesm.h((Runnable)new hcp(this, 1)));
            }
            if (this.D.bC()) {
                final long b = shortsCreationSelectedTrack.b();
                final TextView j = this.J;
                final double n2 = (double)b;
                Double.isNaN(n2);
                final double ceil = Math.ceil(n2 / 100.0);
                final StringBuilder sb = new StringBuilder();
                sb.append(ceil / 10.0);
                sb.append("s");
                j.setText((CharSequence)sb.toString());
            }
            else {
                this.J.setVisibility(8);
            }
            this.b.execute(aesm.h((Runnable)new gvu(this, shortsCreationSelectedTrack, 17)));
            if (this.x != null && shortsCreationSelectedTrack.j() != null) {
                this.b.execute(aesm.h((Runnable)new gvu(this, shortsCreationSelectedTrack, 18)));
            }
            this.b.execute(aesm.h((Runnable)new gvu(this, shortsCreationSelectedTrack, 19)));
            if (this.c.r(shortsCreationSelectedTrack)) {
                final long longValue = (long)shortsCreationSelectedTrack.f().c();
                final long o = this.O();
                g = shortsCreationSelectedTrack.g();
                if (longValue != this.t) {
                    this.t = longValue;
                    this.b.execute(aesm.h((Runnable)new bsm(this, g, longValue, o, 2)));
                }
            }
            return;
        }
        this.t = 0L;
        this.P = null;
        this.b.execute(aesm.h((Runnable)new gwx(this, 19)));
    }
    
    protected final View a() {
        return this.f;
    }
    
    public final void b() {
        this.m.nb(false);
        this.g.removeCallbacksAndMessages((Object)null);
        final hch x = this.x;
        if (x != null) {
            x.d = null;
        }
        if (this.l) {
            this.k.g();
        }
    }
    
    public final void d() {
        this.C.S(wya.c(107599)).i();
        this.m.nb(true);
        if (this.x != null) {
            final MusicWaveformView j = this.j;
            final long r = this.r;
            final hcw a = j.a;
            if (afcr.o((Collection)a.c).contains((Object)(int)(r / a.e))) {
                final aexq a2 = this.x.a(this.r, this.t);
                if (a2.h()) {
                    final tuw s = this.C.S(wya.c(131968));
                    s.b = (agzi)B((long)a2.c());
                    s.d();
                    this.x.d = (Long)a2.c();
                    this.r = (long)a2.c();
                }
            }
        }
        this.n(this.r);
        this.b.execute((Runnable)new gwx(this, 18));
    }
    
    protected final String f() {
        return this.a.getResources().getString(2132019852);
    }
    
    public final void h() {
        this.p();
        super.h();
    }
    
    public final void i() {
        this.q();
    }
    
    public final long j() {
        return Math.max(this.t - this.O(), 0L);
    }
    
    public final void k() {
        this.r();
    }
    
    public final void l() {
        super.l();
        this.t();
    }
    
    public final long m() {
        long c;
        if (this.Q) {
            c = tzz.c(this.e.b());
        }
        else {
            c = this.d.c;
        }
        return c;
    }
    
    public final void n(final long n) {
        if (this.l) {
            this.k.b(this.r);
            return;
        }
        if (!this.Q) {
            this.H.d(n);
            return;
        }
        this.c.j(n);
    }
    
    public final boolean nt(final long n) {
        final long n2 = this.N(n);
        this.P(n2);
        this.w(n2);
        this.r = n2;
        return this.Q(n);
    }
    
    public final void onClick(final View view) {
        if (view == this.q) {
            this.v();
        }
    }
    
    public final void p() {
        this.C.P(wya.b(127991)).a();
        this.C.S(wya.c(22156)).d();
        if (this.l) {
            this.k.c();
        }
        else {
            if (!this.Q) {
                this.H.g(false);
                this.H.h(true);
            }
            if (!this.Q) {
                this.c.j(this.r);
            }
        }
        final hcs m = this.M;
        if (m != null) {
            m.a();
        }
        this.C.S(wya.c(107610)).d();
    }
    
    public final void q() {
        if (this.l) {
            this.k.g();
        }
        else if (!this.Q) {
            this.H.c();
        }
        this.g.removeCallbacksAndMessages((Object)null);
    }
    
    public final void r() {
        this.i.setProgress((int)this.r);
        if (this.l) {
            this.k.d();
            this.k.b(this.r);
        }
        else if (!this.Q) {
            this.H.h(false);
            this.H.f(1.0f);
            this.H.g(true);
            this.H.j();
        }
        this.b.execute((Runnable)new gwx(this, 18));
        final hcs m = this.M;
        if (m != null) {
            m.b();
        }
    }
    
    public final void s(final View q, final hcs m, final wyb z, final boolean q2, final tzh w, final aioe aioe) {
        this.q = q;
        if (q != null) {
            q.setOnClickListener((View$OnClickListener)this);
        }
        this.M = m;
        this.z = z;
        this.Q = q2;
        this.w = w;
        this.C = new avt(this.u, (byte[])null);
        this.m.ag = this.k.i();
        if (this.D.bs()) {
            final PlayerView k = this.K;
            if (k != null) {
                this.k.h(k);
            }
        }
        boolean b2;
        final boolean b = b2 = true;
        if (!q2) {
            b2 = b;
            if (!w.equals(this.H)) {
                b2 = (w.equals(this.k) && b);
            }
        }
        agot.u(b2);
        this.L = this.c.b().aB((asix)new gxt(this, 18));
        this.A(aexq.j(this.c.a()));
        this.O = avt.Q(this.N, aioe, z.a);
    }
    
    public final void t() {
        if (this.O != null) {
            final tuw p = this.C.P(wya.b(127991));
            p.b = (agzi)this.O;
            p.b();
        }
        this.C.S(wya.c(22156)).c();
        if (this.x != null) {
            final ShortsCreationSelectedTrack a = this.c.a();
            if (a != null && a.j() != null && !((agzi)aoci.a).equals((Object)a.j())) {
                this.b.execute(aesm.h((Runnable)new gvu(this, a, 15)));
                if (a.f().h()) {
                    this.b.execute(aesm.h((Runnable)new gvu(this, a, 16)));
                }
            }
            else {
                this.b.execute(aesm.h((Runnable)new hcp(this, 0)));
            }
        }
        final tuw s = this.C.S(wya.c(107600));
        s.k(true);
        s.c();
        final tuw s2 = this.C.S(wya.c(131968));
        s2.k(true);
        s2.c();
        final tuw s3 = this.C.S(wya.c(107599));
        s3.k(true);
        s3.c();
        final tuw s4 = this.C.S(wya.c(107610));
        s4.k(true);
        s4.c();
        final tuw s5 = this.C.S(wya.c(127992));
        s5.k(true);
        s5.c();
        final tuw s6 = this.C.S(wya.c(127993));
        s6.k(true);
        s6.c();
        if (this.o) {
            final tuw s7 = this.C.S(wya.c(160736));
            s7.k(true);
            s7.c();
        }
    }
    
    public final void u() {
        final asic l = this.L;
        if (l != null && !l.tx()) {
            asjg.b((AtomicReference)this.L);
        }
        this.w = null;
    }
    
    public final void v() {
        final wyb z = this.z;
        if (z != null && this.q != null) {
            final tuw s = this.C.S(z);
            s.b = (agzi)this.A;
            s.d();
        }
        if (!this.m.aw()) {
            if (this.G.Z()) {
                trn.b("FragmentManager has already saved state");
                return;
            }
            try {
                this.m.r(this.G, "OverlayDialogFragment");
            }
            catch (final IllegalStateException ex) {
                zjp.c(zjo.b, zjn.f, "[ShortsCreation][Android][Music]Could not show overlay scrubber dialog", (Throwable)ex);
            }
        }
    }
    
    public final void w(final long n) {
        szc.f();
        final DspSeekBar i = this.i;
        if (i != null) {
            i.setProgress((int)n);
        }
    }
    
    public final void x(long n) {
        n = this.N(n);
        this.y(n);
        this.r = n;
    }
    
    public final void y(final long n) {
        this.P(n);
        this.j.e(n);
    }
    
    public final void z() {
        szc.f();
        final tzh w = this.w;
        if (w == null) {
            return;
        }
        final long a = w.a();
        if (this.l) {
            this.k.f(this.O());
        }
        else if (a >= this.r + this.O()) {
            final long r = this.r;
            if (!this.Q) {
                this.H.d(r);
            }
        }
        final MusicWaveformView j = this.j;
        j.e = Math.max(a / j.a.e, j.d);
        j.invalidate();
        this.g.postDelayed((Runnable)new gwx(this, 18), 60L);
    }
}
