import java.util.Set;
import android.os.SystemClock;
import android.os.Handler;
import android.media.NotProvisionedException;
import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import android.os.Looper;
import androidx.media3.decoder.CryptoConfig;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.UUID;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkd implements bkl
{
    public final List a;
    public final bkz b;
    public final brh c;
    final bli d;
    final UUID e;
    final bkb f;
    public int g;
    public byte[] h;
    public byte[] i;
    public final bkh j;
    public eaa k;
    public eaa l;
    private final boolean m;
    private final boolean n;
    private final HashMap o;
    private final bag p;
    private final bgz q;
    private int r;
    private HandlerThread s;
    private bjz t;
    private CryptoConfig u;
    private bkk v;
    private final qpt w;
    
    public bkd(final UUID e, final bkz b, final bkh j, final qpt w, final List list, final boolean m, final boolean n, final byte[] i, final HashMap o, final bli d, final Looper looper, final brh c, final bgz q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.e = e;
        this.j = j;
        this.w = w;
        this.b = b;
        this.m = m;
        this.n = n;
        if (i != null) {
            this.i = i;
            this.a = null;
        }
        else {
            dk.d((Object)list);
            this.a = Collections.unmodifiableList((List<?>)list);
        }
        this.o = o;
        this.d = d;
        this.p = new bag();
        this.c = c;
        this.q = q;
        this.g = 2;
        this.f = new bkb(this, looper);
    }
    
    private final void q(final byte[] array, int a, final boolean b) {
        try {
            this.l = this.b.p(array, this.a, a, this.o);
            final bjz t = this.t;
            a = baw.a;
            final eaa l = this.l;
            dk.d((Object)l);
            t.a(1, (Object)l, b);
        }
        catch (final Exception ex) {
            this.i(ex, true);
        }
    }
    
    public final int a() {
        return this.g;
    }
    
    public final CryptoConfig b() {
        return this.u;
    }
    
    public final bkk c() {
        if (this.g == 1) {
            return this.v;
        }
        return null;
    }
    
    public final Map d() {
        final byte[] h = this.h;
        if (h == null) {
            return null;
        }
        return this.b.c(h);
    }
    
    public final UUID e() {
        return this.e;
    }
    
    public final void f(final baf baf) {
        final Iterator iterator = this.p.b().iterator();
        while (iterator.hasNext()) {
            baf.a((Object)iterator.next());
        }
    }
    
    public final void g(final boolean b) {
        if (this.n) {
            return;
        }
        final byte[] array = (byte[])baw.L(this.h);
        final byte[] i = this.i;
        if (i == null) {
            this.q(array, 1, b);
            return;
        }
        if (this.g != 4) {
            try {
                this.b.g(this.h, i);
            }
            catch (final Exception ex) {
                this.h(ex, 1);
                return;
            }
        }
        long min;
        if (!axy.d.equals(this.e)) {
            min = Long.MAX_VALUE;
        }
        else {
            final Pair c = bkt.c((bkl)this);
            dk.d((Object)c);
            min = Math.min((long)c.first, (long)c.second);
        }
        if (min <= 60L) {
            bao.e();
            this.q(array, 2, b);
            return;
        }
        this.g = 4;
        this.f((baf)bjy.a);
    }
    
    public final void h(final Exception ex, final int n) {
        this.v = new bkk((Throwable)ex, bid.b(ex, n));
        bao.b("DefaultDrmSession", "DRM session error", (Throwable)ex);
        this.f((baf)new lxk(ex, 1));
        if (this.g != 4) {
            this.g = 1;
        }
    }
    
    public final void i(final Exception ex, final boolean b) {
        if (!(ex instanceof NotProvisionedException)) {
            int n = 1;
            if (!b) {
                n = 2;
            }
            this.h(ex, n);
            return;
        }
        this.j.b(this);
    }
    
    public final void j() {
        this.k = this.b.o();
        final bjz t = this.t;
        final int a = baw.a;
        final eaa k = this.k;
        dk.d((Object)k);
        t.a(0, (Object)k, true);
    }
    
    public final boolean k() {
        final int g = this.g;
        return g == 3 || g == 4;
    }
    
    public final boolean l() {
        if (this.k()) {
            return true;
        }
        try {
            final byte[] l = this.b.l();
            this.h = l;
            this.b.i(l, this.q);
            this.u = this.b.b(this.h);
            this.g = 3;
            this.f((baf)new bjy(1));
            dk.d((Object)this.h);
            return true;
        }
        catch (final Exception ex) {
            this.h(ex, 1);
        }
        catch (final NotProvisionedException ex2) {
            this.j.b(this);
        }
        return false;
    }
    
    public final boolean m() {
        return this.m;
    }
    
    public final boolean n(final String s) {
        return this.b.k((byte[])dk.e((Object)this.h), s);
    }
    
    public final void o(final trg trg) {
        final int r = this.r;
        boolean b = false;
        if (r < 0) {
            final StringBuilder sb = new StringBuilder("Session reference count less than zero: ");
            sb.append(r);
            bao.a("DefaultDrmSession", sb.toString());
            this.r = 0;
        }
        if (trg != null) {
            this.p.c((Object)trg);
        }
        if (++this.r == 1) {
            if (this.g == 2) {
                b = true;
            }
            dk.h(b);
            (this.s = new HandlerThread("ExoPlayer:DrmRequestHandler")).start();
            this.t = new bjz(this, this.s.getLooper());
            if (this.l()) {
                this.g(true);
            }
        }
        else if (trg != null && this.k() && this.p.a((Object)trg) == 1) {
            trg.s(this.g);
        }
        final qpt w = this.w;
        ((bki)w.a).e.remove(this);
        final Handler j = ((bki)w.a).j;
        dk.d((Object)j);
        j.removeCallbacksAndMessages((Object)this);
    }
    
    public final void p(final trg trg) {
        int r = this.r;
        if (r <= 0) {
            bao.a("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        --r;
        if ((this.r = r) == 0) {
            this.g = 0;
            final bkb f = this.f;
            final int a = baw.a;
            f.removeCallbacksAndMessages((Object)null);
            this.t.b();
            this.t = null;
            this.s.quit();
            this.s = null;
            this.u = null;
            this.v = null;
            this.l = null;
            this.k = null;
            final byte[] h = this.h;
            if (h != null) {
                this.b.d(h);
                this.h = null;
            }
        }
        if (trg != null) {
            this.p.d((Object)trg);
            if (this.p.a((Object)trg) == 0) {
                trg.u();
            }
        }
        final qpt w = this.w;
        final int r2 = this.r;
        if (r2 == 1) {
            final bki bki = (bki)w.a;
            if (bki.f > 0) {
                bki.e.add(this);
                final Handler j = ((bki)w.a).j;
                dk.d((Object)j);
                j.postAtTime((Runnable)new aur(this, 10), (Object)this, SystemClock.uptimeMillis() + ((bki)w.a).b);
            }
        }
        else if (r2 == 0) {
            ((bki)w.a).c.remove(this);
            final bki bki2 = (bki)w.a;
            if (bki2.g == this) {
                bki2.g = null;
            }
            if (bki2.h == this) {
                bki2.h = null;
            }
            final bkh a2 = bki2.a;
            ((Set)a2.a).remove(this);
            if (a2.b == this) {
                a2.b = null;
                if (!((Set)a2.a).isEmpty()) {
                    a2.b = ((Set<Object>)a2.a).iterator().next();
                    ((bkd)a2.b).j();
                }
            }
            final Handler i = ((bki)w.a).j;
            dk.d((Object)i);
            i.removeCallbacksAndMessages((Object)this);
            ((bki)w.a).e.remove(this);
        }
        ((bki)w.a).b();
    }
}
