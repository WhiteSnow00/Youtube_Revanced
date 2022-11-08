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

public final class bki implements bkr
{
    public final bkh a;
    public final long b;
    public final List c;
    public final Set d;
    public final Set e;
    public int f;
    public bkd g;
    public bkd h;
    public Looper i;
    public Handler j;
    public byte[] k;
    public volatile bke l;
    private final UUID n;
    private final bli o;
    private final HashMap p;
    private final int[] q;
    private final brh r;
    private bkz s;
    private bgz t;
    private final qpt u;
    
    public bki(final UUID n, final bli o, final HashMap p5, final int[] q, final brh r) {
        dk.d((Object)n);
        dk.g(axy.b.equals(n) ^ true, (Object)"Use C.CLEARKEY_UUID instead");
        this.n = n;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.a = new bkh();
        this.u = new qpt(this);
        this.c = new ArrayList();
        this.d = aesy.r();
        this.e = aesy.r();
        this.b = 300000L;
    }
    
    private static List i(final DrmInitData drmInitData, final UUID uuid, final boolean b) {
        final ArrayList list = new ArrayList(drmInitData.c);
        for (int i = 0; i < drmInitData.c; ++i) {
            final DrmInitData$SchemeData a = drmInitData.a(i);
            if ((a.b(uuid) || (axy.c.equals(uuid) && a.b(axy.b))) && (a.d != null || b)) {
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
            dk.h(j == i);
            dk.d((Object)this.j);
        }
    }
    
    private final void k() {
        final afie k = afdu.p((Collection)this.e).k();
        while (((Iterator)k).hasNext()) {
            ((bkl)((Iterator)k).next()).p((trg)null);
        }
    }
    
    private final void l() {
        final afie k = afdu.p((Collection)this.d).k();
        while (((Iterator)k).hasNext()) {
            ((bkg)((Iterator)k).next()).a();
        }
    }
    
    private static boolean m(final bkl bkl) {
        if (((bkd)bkl).g == 1) {
            final int a = baw.a;
            final bkk c = bkl.c();
            dk.d((Object)c);
            if (c.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }
    
    private final bkd n(final List list, final boolean b, final trg trg) {
        dk.d((Object)this.s);
        final UUID n = this.n;
        final bkz s = this.s;
        final bkh a = this.a;
        final qpt u = this.u;
        final byte[] k = this.k;
        final HashMap p3 = this.p;
        final bli o = this.o;
        final Looper i = this.i;
        dk.d((Object)i);
        final brh r = this.r;
        final bgz t = this.t;
        dk.d((Object)t);
        final bkd bkd = new bkd(n, s, a, u, list, b, b, k, p3, o, i, r, t, null, null, null, null, null, null);
        bkd.o(trg);
        bkd.o(null);
        return bkd;
    }
    
    private final bkd o(final List list, final boolean b, final trg trg, final boolean b2) {
        Object o;
        final bkd bkd = (bkd)(o = this.n(list, b, trg));
        if (m((bkl)bkd)) {
            o = bkd;
            if (!this.e.isEmpty()) {
                this.k();
                p((bkl)bkd, trg);
                o = this.n(list, b, trg);
            }
        }
        Object n = o;
        if (m((bkl)o)) {
            n = o;
            if (b2) {
                n = o;
                if (!this.d.isEmpty()) {
                    this.l();
                    if (!this.e.isEmpty()) {
                        this.k();
                    }
                    p((bkl)o, trg);
                    n = this.n(list, b, trg);
                }
            }
        }
        return (bkd)n;
    }
    
    private static final void p(final bkl bkl, final trg trg) {
        bkl.p(trg);
        bkl.p((trg)null);
    }
    
    public final int a(final ayf ayf) {
        final bkz s = this.s;
        dk.d((Object)s);
        final int a = s.a();
        final DrmInitData q = ayf.q;
        if (q != null) {
            if (this.k == null) {
                if (i(q, this.n, true).isEmpty()) {
                    if (q.c != 1 || !q.a(0).b(axy.b)) {
                        return 1;
                    }
                    bao.c("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(String.valueOf(this.n))));
                }
                final String b = q.b;
                if (b == null || "cenc".equals(b)) {
                    return a;
                }
                if ("cbcs".equals(b)) {
                    final int a2 = baw.a;
                    return a;
                }
                if (!"cbc1".equals(b) && !"cens".equals(b)) {
                    return a;
                }
                return 1;
            }
            return a;
        }
        if (baw.p(this.q, ayy.b(ayf.n)) != -1) {
            return a;
        }
        return 0;
    }
    
    public final void b() {
        if (this.s != null && this.f == 0 && this.c.isEmpty() && this.d.isEmpty()) {
            final bkz s = this.s;
            dk.d((Object)s);
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
            Object q;
            try {
                q = blf.q(n);
            }
            catch (final blk blk) {
                final String value = String.valueOf(n);
                final StringBuilder sb = new StringBuilder("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                sb.append(value);
                sb.append(".");
                bao.a("FrameworkMediaDrm", sb.toString());
                q = new bkw();
            }
            (this.s = (bkz)q).h((bky)new yqh(this, 1));
            return;
        }
        for (int i = 0; i < this.c.size(); ++i) {
            ((bkd)this.c.get(i)).o(null);
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
            ((bkd)list.get(i)).p(null);
        }
        this.l();
        this.b();
    }
    
    public final void e(final Looper looper, final bgz t) {
        this.j(looper);
        this.t = t;
    }
    
    public final bkl f(final trg trg, final ayf ayf) {
        dk.h(this.f > 0);
        dk.e((Object)this.i);
        return this.g(this.i, trg, ayf, true);
    }
    
    public final bkl g(final Looper looper, final trg trg, final ayf ayf, final boolean b) {
        if (this.l == null) {
            this.l = new bke(this, looper);
        }
        final DrmInitData q = ayf.q;
        List i = null;
        final bkl bkl = null;
        if (q == null) {
            final int b2 = ayy.b(ayf.n);
            final bkz s = this.s;
            dk.d((Object)s);
            Object g;
            if (s.a() == 2 && bla.a) {
                g = bkl;
            }
            else {
                g = bkl;
                if (baw.p(this.q, b2) != -1) {
                    if (s.a() == 1) {
                        g = bkl;
                    }
                    else {
                        final bkd g2 = this.g;
                        if (g2 == null) {
                            final bkd o = this.o((List)afcr.q(), true, null, b);
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
            return (bkl)g;
        }
        if (this.k == null && (i = i(q, this.n, false)).isEmpty()) {
            final bkf bkf = new bkf(this.n);
            bao.b("DefaultDrmSessionMgr", "DRM error", (Throwable)bkf);
            if (trg != null) {
                trg.t((Exception)bkf);
            }
            return (bkl)new bkx(new bkk((Throwable)bkf, 6003));
        }
        final bkd h = this.h;
        bkd o2;
        if (h == null) {
            o2 = this.o(i, false, trg, b);
            this.h = o2;
            this.c.add(o2);
        }
        else {
            h.o(trg);
            o2 = h;
        }
        return (bkl)o2;
    }
    
    public final bkq h(final trg trg, final ayf ayf) {
        dk.h(this.f > 0);
        dk.e((Object)this.i);
        final bkg bkg = new bkg(this, trg, null, null, null, null);
        final Handler j = bkg.c.j;
        dk.d((Object)j);
        j.post((Runnable)new bhc(bkg, ayf, 7));
        return (bkq)bkg;
    }
}
