import java.util.Iterator;
import android.media.ResourceBusyException;
import java.util.Collection;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkm implements bkv
{
    public final bkl a;
    public final long b;
    public final List c;
    public final Set d;
    public final Set e;
    public int f;
    public bkh g;
    public bkh h;
    public Looper i;
    public Handler j;
    public byte[] k;
    public volatile bki l;
    private final UUID n;
    private final blm o;
    private final HashMap p;
    private final int[] q;
    private final brl r;
    private bld s;
    private bhd t;
    private final oqz u;
    
    public bkm(final UUID n, final blm o, final HashMap p5, final int[] q, final brl r) {
        bad.b(n);
        bad.e(aya.b.equals(n) ^ true, "Use C.CLEARKEY_UUID instead");
        this.n = n;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.a = new bkl();
        this.u = new oqz(this);
        this.c = new ArrayList();
        this.d = agra.O();
        this.e = agra.O();
        this.b = 300000L;
    }
    
    private static List i(final DrmInitData drmInitData, final UUID uuid, final boolean b) {
        final ArrayList list = new ArrayList(drmInitData.c);
        for (int i = 0; i < drmInitData.c; ++i) {
            final DrmInitData$SchemeData a = drmInitData.a(i);
            if ((a.b(uuid) || (aya.c.equals(uuid) && a.b(aya.b))) && (a.d != null || b)) {
                list.add(a);
            }
        }
        return list;
    }
    
    private final void j(final Looper i) {
        synchronized (this) {
            final Looper j = this.i;
            if (j == null) {
                this.i = i;
                this.j = new Handler(i);
                return;
            }
            bad.f(j == i);
            bad.b(this.j);
        }
    }
    
    private final void k() {
        final aflu k = afhk.p(this.e).k();
        while (((Iterator)k).hasNext()) {
            ((bkp)((Iterator)k).next()).p((tun)null);
        }
    }
    
    private final void l() {
        final aflu k = afhk.p(this.d).k();
        while (((Iterator)k).hasNext()) {
            ((bkk)((Iterator)k).next()).a();
        }
    }
    
    private static boolean m(final bkp bkp) {
        if (((bkh)bkp).g == 1) {
            final int a = baz.a;
            final bko c = bkp.c();
            bad.b(c);
            if (c.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }
    
    private final bkh n(final List list, final boolean b, final tun tun) {
        bad.b(this.s);
        final UUID n = this.n;
        final bld s = this.s;
        final bkl a = this.a;
        final oqz u = this.u;
        final byte[] k = this.k;
        final HashMap p3 = this.p;
        final blm o = this.o;
        final Looper i = this.i;
        bad.b(i);
        final brl r = this.r;
        final bhd t = this.t;
        bad.b(t);
        final bkh bkh = new bkh(n, s, a, u, list, b, b, k, p3, o, i, r, t, null, null, null, null, null, null);
        bkh.o(tun);
        bkh.o(null);
        return bkh;
    }
    
    private final bkh o(final List list, final boolean b, final tun tun, final boolean b2) {
        Object o;
        final bkh bkh = (bkh)(o = this.n(list, b, tun));
        if (m((bkp)bkh)) {
            o = bkh;
            if (!this.e.isEmpty()) {
                this.k();
                p((bkp)bkh, tun);
                o = this.n(list, b, tun);
            }
        }
        Object n = o;
        if (m((bkp)o)) {
            n = o;
            if (b2) {
                n = o;
                if (!this.d.isEmpty()) {
                    this.l();
                    if (!this.e.isEmpty()) {
                        this.k();
                    }
                    p((bkp)o, tun);
                    n = this.n(list, b, tun);
                }
            }
        }
        return (bkh)n;
    }
    
    private static final void p(final bkp bkp, final tun tun) {
        bkp.p(tun);
        bkp.p((tun)null);
    }
    
    public final int a(final ayh ayh) {
        final bld s = this.s;
        bad.b(s);
        final int a = s.a();
        final DrmInitData q = ayh.q;
        if (q != null) {
            if (this.k == null) {
                if (i(q, this.n, true).isEmpty()) {
                    if (q.c != 1 || !q.a(0).b(aya.b)) {
                        return 1;
                    }
                    baq.c("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(String.valueOf(this.n))));
                }
                final String b = q.b;
                if (b == null || "cenc".equals(b)) {
                    return a;
                }
                if ("cbcs".equals(b)) {
                    final int a2 = baz.a;
                    return a;
                }
                if (!"cbc1".equals(b) && !"cens".equals(b)) {
                    return a;
                }
                return 1;
            }
            return a;
        }
        if (baz.p(this.q, aza.b(ayh.n)) != -1) {
            return a;
        }
        return 0;
    }
    
    public final void b() {
        if (this.s != null && this.f == 0 && this.c.isEmpty() && this.d.isEmpty()) {
            final bld s = this.s;
            bad.b(s);
            s.f();
            this.s = null;
        }
    }
    
    public final void c() {
        if (this.f++ != 0) {
            return;
        }
        if (this.s == null) {
            final UUID n = this.n;
            bld q;
            try {
                q = blj.q(n);
            }
            catch (final blo blo) {
                final String value = String.valueOf(n);
                final StringBuilder sb = new StringBuilder("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                sb.append(value);
                sb.append(".");
                baq.a("FrameworkMediaDrm", sb.toString());
                q = new bla();
            }
            (this.s = q).h((blc)new yud(this, 1));
            return;
        }
        for (int i = 0; i < this.c.size(); ++i) {
            ((bkh)this.c.get(i)).o(null);
        }
    }
    
    public final void d() {
        final int f = this.f - 1;
        this.f = f;
        if (f != 0) {
            return;
        }
        final ArrayList list = new ArrayList(this.c);
        for (int i = 0; i < list.size(); ++i) {
            ((bkh)list.get(i)).p(null);
        }
        this.l();
        this.b();
    }
    
    public final void e(final Looper looper, final bhd t) {
        this.j(looper);
        this.t = t;
    }
    
    public final bkp f(final tun tun, final ayh ayh) {
        bad.f(this.f > 0);
        bad.c(this.i);
        return this.g(this.i, tun, ayh, true);
    }
    
    public final bkp g(final Looper looper, final tun tun, final ayh ayh, final boolean b) {
        if (this.l == null) {
            this.l = new bki(this, looper);
        }
        final DrmInitData q = ayh.q;
        List i = null;
        final bkp bkp = null;
        if (q == null) {
            final int b2 = aza.b(ayh.n);
            final bld s = this.s;
            bad.b(s);
            Object g;
            if (s.a() == 2 && ble.a) {
                g = bkp;
            }
            else {
                g = bkp;
                if (baz.p(this.q, b2) != -1) {
                    if (s.a() == 1) {
                        g = bkp;
                    }
                    else {
                        final bkh g2 = this.g;
                        if (g2 == null) {
                            final bkh o = this.o(afgh.q(), true, null, b);
                            this.c.add(o);
                            this.g = o;
                        }
                        else {
                            g2.o(null);
                        }
                        g = this.g;
                    }
                }
            }
            return (bkp)g;
        }
        if (this.k == null && (i = i(q, this.n, false)).isEmpty()) {
            final bkj bkj = new bkj(this.n);
            baq.b("DefaultDrmSessionMgr", "DRM error", (Throwable)bkj);
            if (tun != null) {
                tun.t((Exception)bkj);
            }
            return (bkp)new blb(new bko((Throwable)bkj, 6003));
        }
        final bkh h = this.h;
        bkh o2;
        if (h == null) {
            o2 = this.o(i, false, tun, b);
            this.h = o2;
            this.c.add(o2);
        }
        else {
            h.o(tun);
            o2 = h;
        }
        return (bkp)o2;
    }
    
    public final bku h(final tun tun, final ayh ayh) {
        bad.f(this.f > 0);
        bad.c(this.i);
        final bkk bkk = new bkk(this, tun, null, null, null, null);
        final Handler j = bkk.c.j;
        bad.b(j);
        j.post((Runnable)new bhg(bkk, ayh, 7));
        return (bku)bkk;
    }
}
