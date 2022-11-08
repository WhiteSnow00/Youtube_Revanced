import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.i;
import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import android.util.Log;
import android.media.NotProvisionedException;
import java.util.List;
import androidx.media3.common.DrmInitData$SchemeData;
import android.os.Looper;
import androidx.media3.decoder.CryptoConfig;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxn implements bkl
{
    private final long A;
    private final qpt B;
    public final bkz a;
    public final byte[] b;
    public final int c;
    public final lxq d;
    public final int e;
    public final lxg f;
    final bli g;
    final UUID h;
    final lxm i;
    public int j;
    protected byte[] k;
    public byte[] l;
    public final int m;
    public final boolean n;
    public final oia o;
    public volatile eaa p;
    private final String q;
    private final HashMap r;
    private final bag s;
    private final lxn t;
    private final bgz u;
    private int v;
    private HandlerThread w;
    private lxl x;
    private CryptoConfig y;
    private bkk z;
    
    public lxn(final UUID h, final bkz a, final byte[] b, String q, final int c, final byte[] l, final HashMap r, final bli g, final Looper looper, final lxq d, final long a2, final int e, final int m, final lxg f, final lxn t, final qpt b2, final bgz u, final oia o, final boolean n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.h = h;
        this.a = a;
        this.c = c;
        this.l = l;
        this.r = r;
        this.g = g;
        this.d = d;
        this.f = f;
        this.t = t;
        this.B = b2;
        this.A = a2;
        this.e = e;
        this.m = m;
        this.u = u;
        this.o = o;
        this.n = n;
        this.j = 2;
        this.s = new bag();
        this.i = new lxm(this, looper);
        (this.w = new HandlerThread("DrmRequestHandler")).start();
        this.x = new lxl(this, this.w.getLooper());
        if (l == null) {
            this.b = b;
        }
        else {
            q = null;
            this.b = null;
        }
        this.q = q;
    }
    
    private final void v(final int n, final boolean b) {
        byte[] array;
        if (n == 3) {
            array = this.l;
        }
        else {
            array = this.k;
        }
        try {
            this.d.b();
            Object r;
            if (this.l == null) {
                r = afcr.r((Object)new DrmInitData$SchemeData(axy.d, this.q, this.b));
            }
            else {
                r = null;
            }
            final eaa p2 = this.a.p(array, (List)r, n, this.r);
            this.d.a();
            this.d.d();
            this.x.a(1, p2, b).sendToTarget();
        }
        catch (final Exception ex) {
            this.k(ex, true);
        }
    }
    
    private final boolean w(final boolean b) {
        if (this.t()) {
            return true;
        }
        try {
            this.d.f();
            this.k = this.a.l();
            this.d.e();
            this.a.i(this.k, this.u);
            this.y = this.a.b(this.k);
            this.j = 3;
            return true;
        }
        catch (final Exception ex) {
            this.j(ex, 1);
        }
        catch (final NotProvisionedException ex2) {
            if (b) {
                if (this.n) {
                    this.o.i(this);
                }
                else {
                    this.r();
                }
            }
            else {
                this.j((Exception)ex2, 1);
            }
        }
        return false;
    }
    
    private final boolean x() {
        try {
            this.a.g(this.k, this.l);
            return true;
        }
        catch (final Exception ex) {
            Log.e("YTDrmSession", "Error trying to restore Widevine keys.", (Throwable)ex);
            this.j(ex, 1);
            return false;
        }
    }
    
    public final int a() {
        return this.j;
    }
    
    public final CryptoConfig b() {
        return this.y;
    }
    
    public final bkk c() {
        if (this.j == 1) {
            return this.z;
        }
        return null;
    }
    
    public final Map d() {
        final byte[] k = this.k;
        if (k == null) {
            return null;
        }
        return this.a.c(k);
    }
    
    public final UUID e() {
        return this.h;
    }
    
    public final lxn f() {
        final lxn t = this.t;
        if (t == null) {
            return this;
        }
        return t;
    }
    
    public final Integer g() {
        final lxg f = this.f;
        if (f == null) {
            return null;
        }
        return f.b;
    }
    
    public final void h(final baf baf) {
        final Iterator iterator = this.s.b().iterator();
        while (iterator.hasNext()) {
            baf.a((Object)iterator.next());
        }
    }
    
    public final void i(final boolean b) {
        final int c = this.c;
        if (c != 0 && c != 1) {
            if (c != 2) {
                this.v(3, b);
                return;
            }
            if (this.l == null) {
                this.v(2, b);
                return;
            }
            if (this.x()) {
                this.v(2, b);
            }
        }
        else {
            if (this.l == null) {
                this.v(1, b);
                return;
            }
            if (this.j == 4 || this.x()) {
                long min;
                if (!axy.d.equals(this.h)) {
                    min = Long.MAX_VALUE;
                }
                else {
                    final Pair c2 = bkt.c((bkl)this);
                    min = Math.min((long)c2.first, (long)c2.second);
                }
                if (this.c == 0 && min <= 60L) {
                    this.v(2, b);
                }
                else if (min <= 0L) {
                    this.j((Exception)new blh(), 2);
                }
                else {
                    this.j = 4;
                    this.h((baf)bjy.h);
                }
                if (this.c == 0 && this.l != null) {
                    final int a = baw.a;
                }
            }
        }
    }
    
    public final void j(final Exception ex, int b) {
        if (ex instanceof lxr) {
            b = 6003;
        }
        else {
            b = bid.b(ex, b);
        }
        this.z = new bkk((Throwable)ex, b);
        this.h((baf)new lxk(ex, 0));
        if (this.j != 4) {
            this.j = 1;
        }
    }
    
    public final void k(final Exception ex, final boolean b) {
        if (!(ex instanceof NotProvisionedException)) {
            int n = 1;
            if (!b) {
                n = 2;
            }
            this.j(ex, n);
            return;
        }
        if (this.n) {
            this.o.i(this);
            return;
        }
        this.r();
    }
    
    public final void l() {
        if (this.w(false)) {
            this.i(true);
        }
    }
    
    public final boolean m() {
        return false;
    }
    
    public final boolean n(final String s) {
        return this.a.k(this.k, s);
    }
    
    public final void o(final trg trg) {
        if (trg != null) {
            this.s.c((Object)trg);
        }
        if (++this.v == 1) {
            if (this.j == 1) {
                return;
            }
            if (this.w(true)) {
                if (this.t == null) {
                    this.i(true);
                    return;
                }
                final lxg f = this.f;
                int n;
                if (f != null) {
                    n = f.c * 500;
                }
                else {
                    n = 60000;
                }
                this.x.postDelayed((Runnable)new i(this, 9), (long)new Random().nextInt(n));
            }
        }
        else if (trg != null) {
            trg.s(this.j);
        }
    }
    
    public final void p(final trg trg) {
        if (this.u(trg)) {
            final lxs lxs = (lxs)this.B.a;
            if (lxs.g && lxs.c == this) {
                lxs.c = null;
            }
            final ArrayList list = new ArrayList();
            list.add(this);
            for (final lxn lxn : lxs.b) {
                if (lxn.f() == this && lxn != this) {
                    list.add(lxn);
                    final boolean u = lxn.u(null);
                    if (!lxs.j || !u) {
                        continue;
                    }
                    lxs.l.h(lxn);
                }
            }
            lxs.b.removeAll(list);
            if (lxs.j) {
                lxs.l.h(this);
            }
            lxs.b.size();
        }
    }
    
    public final void q(final Exception ex, final boolean b) {
        int n = 1;
        if (!b) {
            n = 3;
        }
        this.j(ex, n);
    }
    
    public final void r() {
        final eaa o = this.a.o();
        this.p = o;
        this.x.a(0, o, true).sendToTarget();
    }
    
    public final boolean s(final byte[] array) {
        return Arrays.equals(this.k, array);
    }
    
    public final boolean t() {
        final int j = this.j;
        return j == 3 || j == 4;
    }
    
    public final boolean u(final trg trg) {
        this.h((baf)bjy.e);
        if (trg != null) {
            this.s.d((Object)trg);
        }
        if (--this.v == 0) {
            this.j = 0;
            this.i.removeCallbacksAndMessages((Object)null);
            this.x.removeCallbacksAndMessages((Object)null);
            this.x = null;
            this.w.quit();
            this.w = null;
            this.y = null;
            this.z = null;
            this.p = null;
            final byte[] k = this.k;
            if (k != null) {
                this.k = null;
                final long a = this.A;
                if (a > 0L) {
                    this.i.postDelayed((Runnable)new a(this, k, 11), a);
                }
                else {
                    this.a.d(k);
                }
            }
            return true;
        }
        return false;
    }
}
