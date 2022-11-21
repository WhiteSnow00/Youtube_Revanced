import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl$MutableContext;
import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.player.MultiPlayerResponseModelImpl;
import java.util.Map;
import java.util.Collections;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import android.os.ConditionVariable;
import android.util.LruCache;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class abmg
{
    public static final byte[] a;
    public static final long b;
    public final thg c;
    public final abms d;
    public final abnm e;
    protected final Executor f;
    public final Set g;
    public final oco h;
    public final LruCache i;
    public final absv j;
    public final arzb k;
    public final aefs l;
    private final Executor m;
    private final ConditionVariable n;
    
    static {
        a = vby.b;
        b = TimeUnit.SECONDS.toMillis(15L);
    }
    
    public abmg(final thg c, final abms d, final abnm e, final Executor f, final Executor m, final List list, final aefs l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.n = new ConditionVariable();
        this.l = l;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.m = m;
        this.g = new HashSet(list);
        this.h = (oco)new twe(0);
        this.i = null;
        this.k = null;
        this.j = null;
    }
    
    public abmg(final thg c, final abms d, final abnm e, final Executor f, final Executor m, final Set g, final oco h, final arzb k, final absv j, final aefs l, final abmq i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.n = new ConditionVariable();
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        m.getClass();
        this.m = m;
        g.getClass();
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = i;
        k.getClass();
        this.k = k;
        l.getClass();
        this.l = l;
    }
    
    private final void n() {
        if (absv.ac(this.k).r) {
            this.n.block(Math.max(absv.ac(this.k).s, 1L));
        }
    }
    
    protected PlayerResponseModel a(final String s, final PlayerResponseModel playerResponseModel) {
        return playerResponseModel;
    }
    
    public final Pair b(final abno abno, final boolean b) {
        final LruCache i = this.i;
        Pair pair = null;
        final Pair pair2 = null;
        if (i != null) {
            if (!((vls)abno).m && b) {
                final absv j = this.j;
                if (j == null || !absv.ac((arzb)j.a).H) {
                    final absv k = this.j;
                    if (k == null || !k.e()) {
                        pair = (Pair)this.i.remove((Object)((vls)abno).b());
                        return pair;
                    }
                }
            }
            pair = (Pair)this.i.get((Object)((vls)abno).b());
            if (pair == null && abno.A) {
                abno.y(false);
                final LruCache l = this.i;
                Pair pair3 = pair2;
                if (l != null) {
                    pair3 = (Pair)l.get((Object)((vls)abno).b());
                }
                abno.y(true);
                return pair3;
            }
        }
        return pair;
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final vkn vkn, final boolean b, final abla abla) {
        twd.n(playbackStartDescriptor.k());
        return this.d(playbackStartDescriptor.k(), s, this.e.c(playbackStartDescriptor, n, this.g, abla.b, s), vkn, b, true, abla.b, playbackStartDescriptor);
    }
    
    public final ListenableFuture d(String w, final String n, final abno abno, final vkn vkn, final boolean b, final boolean b2, final xbt xbt, final PlaybackStartDescriptor playbackStartDescriptor) {
        twd.n(w);
        this.c.d((Object)new aaor());
        if (xbt != null) {
            xbt.c("ps_s");
            final ahcr builder = aloj.a.createBuilder();
            if (n != null) {
                builder.copyOnWrite();
                final aloj aloj = (aloj)builder.instance;
                aloj.b |= 0x1000;
                aloj.n = n;
            }
            builder.copyOnWrite();
            final aloj aloj2 = (aloj)builder.instance;
            w.getClass();
            aloj2.b |= 0x4000000;
            aloj2.w = w;
            xbt.a((aloj)builder.build());
        }
        final Pair b3 = this.b(abno, b2);
        zra zra2;
        if (b3 != null && this.g(b3)) {
            final PlayerResponseModel playerResponseModel = (PlayerResponseModel)b3.first;
            this.c.d((Object)new aaoq(true));
            if (xbt != null) {
                xbt.c("ps_r");
                final ahcr builder2 = aloj.a.createBuilder();
                builder2.copyOnWrite();
                final aloj aloj3 = (aloj)builder2.instance;
                aloj3.c |= 0x10;
                aloj3.C = true;
                xbt.a((aloj)builder2.build());
            }
            final ajfb w2 = playerResponseModel.w();
            final String g = playbackStartDescriptor.a.G;
            ahbt aa;
            final ahbt ahbt = aa = null;
            if (g != null) {
                aa = ahbt;
                if (w2 != null) {
                    aa = Collections.unmodifiableMap((Map<?, ? extends ahbt>)w2.b).get(g);
                }
            }
            final absv j = this.j;
            Object o = playerResponseModel;
            if (j != null) {
                o = playerResponseModel;
                if (j.e()) {
                    o = playerResponseModel;
                    if (aa != null) {
                        abno.aa = aa;
                        final abmf abmf = new abmf(this, abno, w, xbt);
                        o = new MultiPlayerResponseModelImpl(playerResponseModel, afvh.e((ListenableFuture)abmf, aewf.a((afax)abej.p), (Executor)afwd.a));
                        if (vkn != null) {
                            vkn.b(((PlayerResponseModelImpl)o).d, ((PlayerResponseModel)o).m());
                        }
                        final abms d = this.d;
                        d.b(abno, (zrb)((abwe)d.e).e((zrb)abmf, ((oco)d.f).d(), (absv)d.h, (PlayerResponseModel)o), vkn, b, xbt);
                    }
                }
            }
            final zra zra = new zra();
            ((afvd)zra).set(o);
            final absv i = this.j;
            zra2 = zra;
            if (i != null) {
                zra2 = zra;
                if (i.i()) {
                    if (((PlayerResponseModel)o).r().d("PLAYER_REQUEST_WAS_AUTOPLAY") == abno.K && ((PlayerResponseModel)o).r().d("PLAYER_REQUEST_WAS_AUTONAV") == abno.L) {
                        final String encodeToString = Base64.encodeToString(((vls)abno).i, 0);
                        final PlayerResponseModelImpl$MutableContext r = ((PlayerResponseModel)o).r();
                        if (r.c.containsKey("PLAYER_REQUEST_CLICK_TRACKING")) {
                            w = (String)r.c.get("PLAYER_REQUEST_CLICK_TRACKING");
                        }
                        else {
                            w = "";
                        }
                        if (encodeToString.equals(w)) {
                            zra2 = zra;
                            return (ListenableFuture)zra2;
                        }
                    }
                    ((PlayerResponseModel)o).r().b("PLAYER_RESPONSE_SOURCE_KEY", 3L);
                    return (ListenableFuture)zra;
                }
            }
        }
        else {
            if (b3 != null) {
                this.f(((vls)abno).b());
            }
            zra2 = new abmf(this, abno, w, xbt);
            this.d.d(abno, (zrb)zra2, vkn, b, xbt);
        }
        return (ListenableFuture)zra2;
    }
    
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final anez anez, final xbt xbt) {
        return this.m(playbackStartDescriptor, anez, xbt, -1L);
    }
    
    public final void f(final String s) {
        final LruCache i = this.i;
        if (i != null) {
            i.remove((Object)s);
        }
    }
    
    public final boolean g(final Pair pair) {
        return this.h.d() <= (long)pair.second && !aamr.f((PlayerResponseModel)pair.first, this.h);
    }
    
    public final void h(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final Executor executor, final abla abla) {
        if (!absv.an(this.k)) {
            return;
        }
        final absv j = this.j;
        if (j != null && j.m(playbackStartDescriptor)) {
            return;
        }
        if (absv.ac(this.k).m) {
            if (!playbackStartDescriptor.s()) {
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    final String b = playbackStartDescriptor.B(this.l);
                    final vkn f = vkn.f(this.k, playbackStartDescriptor.f(), b, playbackStartDescriptor.c(), abla.h, playbackStartDescriptor.y());
                    if (f != null && !TextUtils.isEmpty((CharSequence)s)) {
                        executor.execute(aewf.h((Runnable)new zgq(this, f, s, playbackStartDescriptor, b, abla, 3)));
                        this.n();
                    }
                }
            }
        }
        else if (!playbackStartDescriptor.s()) {
            executor.execute(aewf.h((Runnable)new yzu(this, playbackStartDescriptor, playbackStartDescriptor.B(this.l), abla, s, 5)));
            this.n();
        }
    }
    
    @Deprecated
    public final boolean i(final PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.i == null) {
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            if (playbackStartDescriptor.x() != null) {
                if (this.i.get((Object)((vls)this.e.b(playbackStartDescriptor.k(), playbackStartDescriptor.x(), playbackStartDescriptor.h(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), -1, this.g, (String)null, (xbt)null, playbackStartDescriptor.g, false)).b()) != null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void j(final String s, final byte[] array, final String s2, final int n, final tdg tdg) {
        tdg.getClass();
        this.f.execute(aewf.h((Runnable)new ppg(this, s, s2, array, n, tdg, 4)));
    }
    
    public final void k(String ex, final String s, final byte[] array, final int n, final tdg tdg) {
        try {
            final abkw d = PlaybackStartDescriptor.d();
            ex = (InterruptedException)ablm.n((String)ex, "", -1, 0.0f, s, null);
            final ahbt x = ahbt.x(array);
            ((ahcr)ex).copyOnWrite();
            final aisc aisc = (aisc)((ahct)ex).instance;
            final aisc a = aisc.a;
            aisc.b |= 0x1;
            aisc.c = x;
            d.a = (aisc)((ahcr)ex).build();
            ex = (InterruptedException)this.c(d.a(), null, n, null, false, abla.a);
            final long b = abmg.b;
            final arzb k = this.k;
            long max = b;
            if (k != null) {
                max = Math.max(b, TimeUnit.SECONDS.toMillis(absv.X(k)));
            }
            if (max > 0L) {
                ex = (InterruptedException)((ListenableFuture)ex).get(max, TimeUnit.MILLISECONDS);
            }
            else {
                ex = (InterruptedException)((ListenableFuture)ex).get();
            }
            this.m.execute(aewf.h((Runnable)new aayj(tdg, (PlayerResponseModel)ex, 12)));
            return;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex) {}
        catch (final TimeoutException ex2) {}
        this.m.execute(aewf.h((Runnable)new aayj(tdg, (Exception)ex, 11)));
    }
    
    public final ListenableFuture l(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final boolean b, final abla abla) {
        twd.n(playbackStartDescriptor.k());
        final vkn f = vkn.f(this.k, playbackStartDescriptor.f(), s, playbackStartDescriptor.c(), abla.h, playbackStartDescriptor.y());
        if (f != null && !TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            f.c(playbackStartDescriptor.k());
        }
        return this.c(playbackStartDescriptor, s, -1, f, b, abla);
    }
    
    public final ListenableFuture m(final PlaybackStartDescriptor playbackStartDescriptor, final anez v, final xbt xbt, final long n) {
        final abno b = this.e.b(playbackStartDescriptor.k(), playbackStartDescriptor.x(), playbackStartDescriptor.h(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), -1, this.g, playbackStartDescriptor.B(this.l), xbt, playbackStartDescriptor.g, true);
        b.V = v;
        b.K = playbackStartDescriptor.r();
        b.L = playbackStartDescriptor.q();
        b.N = playbackStartDescriptor.t();
        final absv j = this.j;
        vkn f;
        if (j != null && j.g()) {
            f = vkn.f(this.k, playbackStartDescriptor.f(), playbackStartDescriptor.B(this.l), playbackStartDescriptor.c(), (zfe)null, playbackStartDescriptor.y());
        }
        else {
            f = null;
        }
        if (f != null && !TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            f.t = 1;
            f.c(playbackStartDescriptor.k());
            final int n2 = (int)n;
            f.o = Math.max(n2, 0);
            f.n = Math.max(n2, 0);
        }
        return this.d(playbackStartDescriptor.k(), null, b, f, false, false, xbt, playbackStartDescriptor);
    }
}
