import android.os.Process;
import android.os.Looper;
import android.util.Pair;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnb implements Runnable
{
    public final PlaybackStartDescriptor a;
    public final int b;
    public final String c;
    public final long d;
    public final abna e;
    public final tre f;
    public final askz g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile WatchNextResponseModel j;
    public volatile Throwable k;
    public volatile PlayerResponseModel l;
    public volatile Throwable m;
    final atmn n;
    public final absv o;
    private final abmd p;
    private final PlayerResponseModel q;
    private final boolean r;
    private final Handler s;
    private final long t;
    private final abla u;
    private final boolean v;
    private final ScheduledExecutorService w;
    
    public abnb(final PlaybackStartDescriptor a, final int b, final abmd p17, final PlayerResponseModel q, final String c, final boolean r, final Handler s, final long d, final long t, final tre f, final abna e, final boolean v, final abla u, final askz g, final ScheduledExecutorService w, final absv o, final byte[] array) {
        this.i = true;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = new atmn();
        this.a = a;
        this.b = b;
        this.p = p17;
        this.q = q;
        this.c = c;
        this.r = r;
        this.s = s;
        this.d = d;
        this.t = t;
        this.f = f;
        this.e = e;
        this.v = v;
        this.u = u;
        this.g = g;
        this.w = w;
        this.o = o;
    }
    
    private final void g(final Throwable t) {
        this.s.post((Runnable)new aayj(this, t, 15));
    }
    
    private final void h(final PlayerResponseModel playerResponseModel) {
        if (this.o.e()) {
            this.s.post((Runnable)new aayj(this, playerResponseModel, 18));
            return;
        }
        this.s.post((Runnable)new abgl(this, 10));
    }
    
    private final void i(final PlayerResponseModel playerResponseModel) {
        final aayj aayj = new aayj(this, playerResponseModel, 19);
        if (this.r) {
            this.s.post((Runnable)aayj);
            return;
        }
        this.s.postAtFrontOfQueue((Runnable)aayj);
    }
    
    private final void j() {
        this.s.post((Runnable)new abgl(this, 9));
    }
    
    private final void k(final WatchNextResponseModel watchNextResponseModel) {
        this.s.post((Runnable)new aayj(this, watchNextResponseModel, 17));
    }
    
    private final void l() {
        ListenableFuture b = null;
        try {
            b = this.p.b(this.a.k(), this.c, this.a, this.u, this.v);
            this.h(null);
            this.i(this.l = ((Future<PlayerResponseModel>)b).get(this.t, TimeUnit.MILLISECONDS));
            return;
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            this.g(ex);
            return;
        }
        catch (final TimeoutException b) {}
        catch (final ExecutionException ex2) {}
        this.g((Throwable)b);
    }
    
    private final void m(final boolean b) {
        final Pair a = this.p.a(this.a, this.c, this.u, this.v);
        final ListenableFuture listenableFuture = (ListenableFuture)a.second;
        final ListenableFuture listenableFuture2 = (ListenableFuture)a.first;
        final boolean e = this.o.e();
        PlayerResponseModel playerResponseModel = null;
        ListenableFuture listenableFuture3;
        if (e && listenableFuture2.isDone()) {
            try {
                this.l = (PlayerResponseModel)afxr.t((Future)listenableFuture2);
            }
            catch (final ExecutionException m) {
                znh.b(zng.b, znf.j, "Problem fetching player response from completed future: ".concat(m.toString()));
                this.m = m;
            }
            final PlayerResponseModel l = this.l;
            if (l == null) {
                this.h(null);
                this.i = false;
                Throwable i;
                if (this.m != null) {
                    i = this.m;
                }
                else {
                    i = new Exception("Problem fetching player response from completed future.");
                }
                listenableFuture3 = afxr.k(i);
            }
            else {
                if (!l.g()) {
                    playerResponseModel = l;
                }
                this.h(playerResponseModel);
                this.i = false;
                listenableFuture3 = afvh.f(l.a(), (afvq)new zwb(l, 4), (Executor)this.w);
            }
        }
        else {
            this.h(null);
            listenableFuture3 = listenableFuture2;
        }
        ume.N(listenableFuture3).S(this.t, TimeUnit.MILLISECONDS, this.g).B((asmi)new n(this, b, 5)).A((asmi)new n(this, b, 6)).J(abmy.a).N(abmy.c).i().w(new abmz(this, b, 0)).w((asmn)new vvp(this, listenableFuture, 8)).E(this.g).ad((asmi)new n(this, b, 3), (asmi)new n(this, b, 4));
    }
    
    private final void n() {
        if (this.j != null) {
            this.k(this.j);
            return;
        }
        if (this.k != null) {
            this.s.post((Runnable)new aayj(this, this.k, 16));
        }
    }
    
    public final void a() {
        if (this.l != null) {
            this.i(this.l);
            return;
        }
        if (this.m != null) {
            this.g(this.m);
        }
    }
    
    public final void b() {
        this.n.tr((Object)true);
    }
    
    public final void c() {
        if (this.b == 0) {
            return;
        }
        if (this.l != null && this.j != null) {
            this.j();
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.b();
        }
    }
    
    public final void e(final boolean b) {
        if (b) {
            if (this.j != null || this.k != null) {
                final PlayerResponseModel l = this.l;
                final Throwable m = this.m;
                final WatchNextResponseModel j = this.j;
                final Throwable k = this.k;
                final boolean b2 = false;
                final boolean b3 = l != null || m != null;
                final boolean b4 = j != null || k != null;
                boolean b5 = b2;
                if (b3) {
                    b5 = b2;
                    if (b4) {
                        b5 = true;
                    }
                }
                adme.T(b5);
                if (m != null) {
                    this.g(m);
                }
                else if (k != null) {
                    this.g(k);
                }
                else if (l != null && j != null) {
                    this.k(j);
                    this.i(l);
                }
            }
        }
        else {
            this.n();
        }
        this.c();
    }
    
    public final boolean f(final boolean b) {
        if (!this.i && !b) {
            this.b();
            return false;
        }
        this.h = true;
        this.d();
        return true;
    }
    
    @Override
    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper() && Process.getThreadPriority(Process.myTid()) != 0) {
            tut.b("Request being made from non-critical thread");
        }
        this.e.e();
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    this.m(false);
                }
                else {
                    this.m(true);
                }
            }
            else {
                this.l = this.q;
                final ListenableFuture d = this.p.d(this.a, this.u);
                if (!this.h) {
                    try {
                        this.j = ((Future<WatchNextResponseModel>)d).get();
                    }
                    catch (final InterruptedException k) {
                        Thread.currentThread().interrupt();
                        this.k = k;
                    }
                    catch (final ExecutionException i) {
                        this.k = i;
                    }
                }
                this.n();
            }
        }
        else {
            this.l();
        }
        if (this.b == 0) {
            return;
        }
        if (this.l != null && this.j != null) {
            this.j();
        }
    }
}
