import android.text.TextUtils;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import j$.util.Optional;
import java.util.concurrent.Executor;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmo
{
    private final adzx A;
    public final arna a;
    public final askz b;
    public final askz c;
    public final tre d;
    public final ScheduledExecutorService e;
    public final askz f;
    public final aske g;
    public abmn h;
    public tdi i;
    public volatile abnb j;
    public volatile abli k;
    public abmd l;
    public PlaybackStartDescriptor m;
    public PlaybackStartDescriptor n;
    public volatile PlayerResponseModel o;
    public volatile WatchNextResponseModel p;
    public boolean q;
    public final abqc r;
    public final absv s;
    public final arzb t;
    private final Handler u;
    private final askz v;
    private final Executor w;
    private Optional x;
    private final vbo y;
    private final wrk z;
    
    public abmo(final thg thg, final arna a, final Handler u, final askz b, final askz v, final askz c, final tre d, final ScheduledExecutorService e, final Executor w, final abqc r, final adzx a2, final aske aske, final arzb t, final vbo y, final absv s, final askz f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final wrk z = new wrk(this, 12);
        this.z = z;
        this.x = Optional.empty();
        this.a = a;
        this.u = u;
        this.b = b;
        this.v = v;
        this.c = c;
        this.d = d;
        this.e = e;
        this.w = w;
        this.r = r;
        this.A = a2;
        this.t = t;
        this.y = y;
        this.s = s;
        this.f = f;
        this.g = aana.o(aske, (afax)abej.q);
        thg.g((Object)z);
    }
    
    static boolean o(final int n) {
        return n == 3 || n == 2 || n == 0;
    }
    
    public static /* bridge */ void q(final abmo abmo) {
        abmo.i = null;
    }
    
    private final void t(final abli k) {
        String.valueOf(this.k = k);
    }
    
    public final WatchNextResponseModel a() {
        final WatchNextResponseModel p = this.p;
        if (this.k == abli.e && !this.p(p, "currentWatchNextResponse")) {
            return p;
        }
        return null;
    }
    
    public final PlayerResponseModel b() {
        final boolean a = this.k.a(abli.d, abli.e);
        final PlayerResponseModel o = this.o;
        if (a && !this.p(o, "currentPlayerResponse")) {
            return o;
        }
        return null;
    }
    
    final abna c(final abna abna, final xbt xbt) {
        return (abna)new abmm(this, abna, xbt);
    }
    
    public final void d() {
        final PlayerResponseModel b = this.b();
        final WatchNextResponseModel a = this.a();
        final PlaybackStartDescriptor n = this.n;
        aisc b2;
        if (n != null) {
            b2 = n.b;
        }
        else {
            b2 = null;
        }
        ((auna)this.r.g).tt(new aapf(this.k, b, a, b2));
    }
    
    public final void e() {
        if (this.j != null) {
            this.j.f(true);
            this.j = null;
        }
        final tdi i = this.i;
        if (i != null) {
            i.b();
            this.i = null;
        }
        this.x.ifPresent((Consumer)new aaqr(this, 10));
    }
    
    public final void f() {
        this.n(abli.a);
        if (this.o != null) {
            this.n(abli.d);
            if (this.p != null) {
                this.n(abli.e);
            }
        }
    }
    
    public final void g(abmd ex, final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final tdi tdi) {
        try {
            final PlayerResponseModel playerResponseModel = (PlayerResponseModel)((abmd)ex).c(playbackStartDescriptor, s, n, abla.a).get(Math.max(abmg.b, TimeUnit.SECONDS.toMillis(absv.X(this.t))), TimeUnit.MILLISECONDS);
            final Executor w = this.w;
            ex = (InterruptedException)new aayj(tdi, playerResponseModel, 13);
            w.execute(aewf.h((Runnable)ex));
            return;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex) {}
        catch (final TimeoutException ex2) {}
        this.w.execute(aewf.h((Runnable)new aayj(tdi, (Exception)ex, 14)));
    }
    
    public final void h(final PlayerResponseModel o, final PlaybackStartDescriptor playbackStartDescriptor, final xbt xbt) {
        o.getClass();
        final WatchNextResponseModel p3 = this.p;
        if (p3 != null && !o.K().equals(p3.b)) {
            this.p = null;
            final abmn h = this.h;
            if (h != null) {
                ((abrn)h).a.tt(aaps.a);
            }
        }
        this.o = o;
        if (!this.s.s() && this.A.s((Object)o) == 2) {
            return;
        }
        if (!this.k.b(abli.d)) {
            this.n(abli.d);
        }
        final abmn h2 = this.h;
        if (h2 != null) {
            ((abrn)h2).d.a(o, playbackStartDescriptor, (abrx)h2, xbt);
        }
    }
    
    public final void i(final WatchNextResponseModel p2, final String s) {
        this.p = p2;
        if (p2 != null) {
            final PlaybackStartDescriptor n = this.n;
            if (n == null) {
                return;
            }
            if (TextUtils.isEmpty((CharSequence)n.k())) {
                final abkw e = n.e();
                e.p = p2.b;
                this.n = e.a();
            }
            final abkw d = PlaybackStartDescriptor.d();
            d.a = p2.c;
            this.m = d.a();
        }
        else {
            this.m = null;
        }
        final abmn h = this.h;
        if (h != null) {
            h.a(this.n, p2, s);
        }
    }
    
    public final void j(final String s, final abna abna) {
        final PlaybackStartDescriptor n = this.n;
        if (n != null) {
            final abmn h = this.h;
            if (h != null) {
                ((abrn)h).e.g();
            }
            this.k(n, s, abna, abla.a);
        }
    }
    
    public final void k(final PlaybackStartDescriptor n, final String s, abna c, final abla abla) {
        int n2;
        if (n.v()) {
            if (this.q) {
                n2 = 2;
            }
            else {
                n2 = 3;
            }
        }
        else {
            n2 = 0;
        }
        if (((vbs)this.s.g).f(45359734L) && n2 == 3) {
            final boolean o = o(3);
            if (o) {
                this.r();
            }
            final abmd l = this.l;
            l.getClass();
            this.n = n;
            if (o) {
                this.n(abli.b);
            }
            c = this.c(c, abla.b);
            final long y = absv.Y(this.t, abmg.b);
            final int d = abla.d;
            long z;
            if (d >= 0) {
                z = d;
            }
            else {
                z = absv.Z(this.t);
            }
            c.e();
            final asla o2 = asla.r(new abmk(this, l, n, s, abla, y, c, z)).Q(this.v).o();
            o2.ab((asmi)abgj.l, (asmi)abgj.k);
            this.x = Optional.of((Object)o2);
            if (o) {
                this.n(abli.b);
            }
            return;
        }
        this.l(n, n2, s, c, abla);
    }
    
    public final void l(final PlaybackStartDescriptor n, final int n2, final String s, abna c, final abla abla) {
        final boolean o = o(n2);
        if (o) {
            this.r();
        }
        final abmd l = this.l;
        l.getClass();
        this.n = n;
        if (o && !absv.G(this.y)) {
            this.n(abli.b);
        }
        c = this.c(c, abla.b);
        final int d = abla.d;
        long z;
        if (d >= 0) {
            z = d;
        }
        else {
            z = absv.Z(this.t);
        }
        this.j = new abnb(n, n2, l, this.o, s, this.q, this.u, z, absv.Y(this.t, abmg.b), this.d, c, absv.am(this.t) ^ true, abla, this.f, this.e, this.s, null);
        this.e.execute(this.j);
        if (o && absv.G(this.y)) {
            this.n(abli.b);
        }
    }
    
    public final void m() {
        this.e();
        this.l = null;
        this.o = null;
        this.p = null;
        this.x = Optional.empty();
        this.m = null;
        this.n = null;
    }
    
    public final void n(final abli k) {
        String.valueOf(this.k = k);
        this.d();
    }
    
    public final boolean p(final Object o, final String s) {
        if (o == null) {
            znh.b(zng.b, znf.j, String.format("%s was null when it shouldn't be", s));
            final abmn h = this.h;
            if (h != null) {
                ((abrn)h).e.h(new ablo(10, true, "There was an error with the video", new IllegalStateException()));
            }
            return true;
        }
        return false;
    }
    
    public final void r() {
        if (this.j != null && !this.j.f(false)) {
            return;
        }
        this.x.ifPresent((Consumer)new aaqr(this, 11));
        final tdi i = this.i;
        if (i != null) {
            i.b();
            this.i = null;
        }
        if (this.o == null) {
            if (this.k == abli.b) {
                this.n(abli.a);
            }
            return;
        }
        if (this.p != null) {
            this.t(abli.e);
            return;
        }
        this.t(abli.d);
    }
    
    public final void s(final String s, final abna abna) {
        if (this.k.a(abli.e)) {
            final PlaybackStartDescriptor m = this.m;
            if (m != null) {
                this.l(m, 1, s, abna, abla.a);
                return;
            }
        }
        if (this.k.a(abli.d) || this.k.a(abli.c)) {
            final PlaybackStartDescriptor n = this.n;
            if (n != null) {
                this.l(n, 1, s, abna, abla.a);
            }
        }
    }
}
