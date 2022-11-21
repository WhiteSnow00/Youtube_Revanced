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

public final class bkh implements bkp
{
    public final List a;
    public final bld b;
    public final brl c;
    final blm d;
    final UUID e;
    final bkf f;
    public int g;
    public byte[] h;
    public byte[] i;
    public final bkl j;
    public eae k;
    public eae l;
    private final boolean m;
    private final boolean n;
    private final HashMap o;
    private final bai p;
    private final bhd q;
    private int r;
    private HandlerThread s;
    private bkd t;
    private CryptoConfig u;
    private bko v;
    private final oqz w;
    
    public bkh(final UUID e, final bld b, final bkl j, final oqz w, final List list, final boolean m, final boolean n, final byte[] i, final HashMap o, final blm d, final Looper looper, final brl c, final bhd q, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
            bad.b(list);
            this.a = Collections.unmodifiableList((List<?>)list);
        }
        this.o = o;
        this.d = d;
        this.p = new bai();
        this.c = c;
        this.q = q;
        this.g = 2;
        this.f = new bkf(this, looper);
    }
    
    private final void q(final byte[] array, int a, final boolean b) {
        try {
            this.l = this.b.p(array, this.a, a, this.o);
            final bkd t = this.t;
            a = baz.a;
            final eae l = this.l;
            bad.b(l);
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
    
    public final bko c() {
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
    
    public final void f(final bah bah) {
        final Iterator iterator = this.p.b().iterator();
        while (iterator.hasNext()) {
            bah.a(iterator.next());
        }
    }
    
    public final void g(final boolean b) {
        if (this.n) {
            return;
        }
        final byte[] array = (byte[])baz.L(this.h);
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
        if (!aya.d.equals(this.e)) {
            min = Long.MAX_VALUE;
        }
        else {
            final Pair c = bky.c((bkp)this);
            bad.b(c);
            min = Math.min((long)c.first, (long)c.second);
        }
        if (min <= 60L) {
            baq.e();
            this.q(array, 2, b);
            return;
        }
        this.g = 4;
        this.f(bkc.a);
    }
    
    public final void h(final Exception ex, final int n) {
        this.v = new bko((Throwable)ex, bkx.c(ex, n));
        baq.b("DefaultDrmSession", "DRM session error", ex);
        this.f((bah)new lzd(ex, 1));
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
        final bkd t = this.t;
        final int a = baz.a;
        final eae k = this.k;
        bad.b(k);
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
            this.f(new bkc(1));
            bad.b(this.h);
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
        return this.b.k((byte[])bad.c(this.h), s);
    }
    
    public final void o(final tun tun) {
        final int r = this.r;
        boolean b = false;
        if (r < 0) {
            final StringBuilder sb = new StringBuilder("Session reference count less than zero: ");
            sb.append(r);
            baq.a("DefaultDrmSession", sb.toString());
            this.r = 0;
        }
        if (tun != null) {
            this.p.c(tun);
        }
        if (++this.r == 1) {
            if (this.g == 2) {
                b = true;
            }
            bad.f(b);
            (this.s = new HandlerThread("ExoPlayer:DrmRequestHandler")).start();
            this.t = new bkd(this, this.s.getLooper());
            if (this.l()) {
                this.g(true);
            }
        }
        else if (tun != null && this.k() && this.p.a(tun) == 1) {
            tun.s(this.g);
        }
        final oqz w = this.w;
        ((bkm)w.a).e.remove(this);
        final Handler j = ((bkm)w.a).j;
        bad.b(j);
        j.removeCallbacksAndMessages((Object)this);
    }
    
    public final void p(final tun tun) {
        int r = this.r;
        if (r <= 0) {
            baq.a("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        --r;
        if ((this.r = r) == 0) {
            this.g = 0;
            final bkf f = this.f;
            final int a = baz.a;
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
        if (tun != null) {
            this.p.d(tun);
            if (this.p.a(tun) == 0) {
                tun.u();
            }
        }
        final oqz w = this.w;
        final int r2 = this.r;
        if (r2 == 1) {
            final bkm bkm = (bkm)w.a;
            if (bkm.f > 0) {
                bkm.e.add(this);
                final Handler j = ((bkm)w.a).j;
                bad.b(j);
                j.postAtTime((Runnable)new asa(this, 11), (Object)this, SystemClock.uptimeMillis() + ((bkm)w.a).b);
            }
        }
        else if (r2 == 0) {
            ((bkm)w.a).c.remove(this);
            final bkm bkm2 = (bkm)w.a;
            if (bkm2.g == this) {
                bkm2.g = null;
            }
            if (bkm2.h == this) {
                bkm2.h = null;
            }
            final bkl a2 = bkm2.a;
            ((Set)a2.a).remove(this);
            if (a2.b == this) {
                a2.b = null;
                if (!((Set)a2.a).isEmpty()) {
                    a2.b = ((Set<Object>)a2.a).iterator().next();
                    ((bkh)a2.b).j();
                }
            }
            final Handler i = ((bkm)w.a).j;
            bad.b(i);
            i.removeCallbacksAndMessages((Object)this);
            ((bkm)w.a).e.remove(this);
        }
        ((bkm)w.a).b();
    }
}
