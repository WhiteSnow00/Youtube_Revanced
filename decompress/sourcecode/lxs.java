import java.util.Arrays;
import j$.nio.charset.StandardCharsets;
import java.util.Iterator;
import android.util.Log;
import androidx.media3.common.DrmInitData$SchemeData;
import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import android.os.Looper;
import java.util.HashMap;
import java.util.UUID;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxs implements bkr
{
    public lxq a;
    public final List b;
    public lxn c;
    public int d;
    public byte[] e;
    public int f;
    public final boolean g;
    public boolean h;
    public long i;
    public boolean j;
    public final ynh k;
    public final oia l;
    private final UUID n;
    private final HashMap o;
    private final lxp p;
    private int q;
    private Looper r;
    private bgz s;
    private boolean t;
    private bkz u;
    private int v;
    
    public lxs(final UUID n, final ynh k, final HashMap o, final lxq a, final lxp p6, final boolean g) {
        this.f = -1;
        this.h = true;
        this.j = false;
        dk.d((Object)n);
        this.n = n;
        this.k = k;
        this.o = o;
        this.a = a;
        this.p = p6;
        this.v = 3;
        this.t = false;
        this.g = g;
        this.l = new oia((byte[])null, (byte[])null);
        this.d = 0;
        this.b = new ArrayList();
    }
    
    private static DrmInitData$SchemeData n(final DrmInitData drmInitData, final UUID uuid, final boolean b) {
        final ArrayList list = new ArrayList(drmInitData.c);
        for (int i = 0; i < drmInitData.c; ++i) {
            final DrmInitData$SchemeData a = drmInitData.a(i);
            if ((a.b(uuid) || (axy.c.equals(uuid) && a.b(axy.b))) && (a.d != null || b)) {
                list.add(a);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        if (axy.d.equals(uuid)) {
            for (int j = 0; j < list.size(); ++j) {
                final DrmInitData$SchemeData drmInitData$SchemeData = (DrmInitData$SchemeData)list.get(j);
                int a2;
                if (drmInitData$SchemeData.a()) {
                    a2 = byl.a(drmInitData$SchemeData.d);
                }
                else {
                    a2 = -1;
                }
                final int a3 = baw.a;
                if (a2 == 1) {
                    return drmInitData$SchemeData;
                }
            }
        }
        return (DrmInitData$SchemeData)list.get(0);
    }
    
    public final int a(final ayf ayf) {
        final DrmInitData q = ayf.q;
        if (q == null) {
            return 0;
        }
        if (this.e == null) {
            if (n(q, this.n, true) == null) {
                if (q.c != 1 || !q.a(0).b(axy.b)) {
                    return 1;
                }
                Log.w("YTDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(String.valueOf(this.n))));
            }
            final String b = q.b;
            if (b != null && !"cenc".equals(b) && ("cbc1".equals(b) || "cbcs".equals(b) || "cens".equals(b))) {
                final int a = baw.a;
            }
        }
        return 2;
    }
    
    public final void b(final byte[] array, final int n) {
        if (this.d != 0) {
            return;
        }
        for (final lxn lxn : this.b) {
            if (lxn.s(array)) {
                if (lxn.t()) {
                    if (n != 1) {
                        if (n == 2) {
                            lxn.i(false);
                            return;
                        }
                        if (n == 3) {
                            if (lxn.j == 4) {
                                lxn.j = 3;
                                lxn.j((Exception)new blh(), 2);
                            }
                        }
                    }
                    else {
                        lxn.j = 3;
                        if (lxn.n) {
                            lxn.o.i(lxn);
                            return;
                        }
                        lxn.r();
                        break;
                    }
                }
            }
        }
    }
    
    public final void c() {
        ++this.q;
    }
    
    public final void d() {
        final int q = this.q - 1;
        this.q = q;
        if (q != 0) {
            return;
        }
        this.p.A(this);
    }
    
    public final void e(final Looper r, final bgz s) {
        final Looper r2 = this.r;
        boolean b = true;
        if (r2 != null) {
            b = (r2 == r && b);
        }
        dk.h(b);
        this.r = r;
        this.s = s;
    }
    
    public final bkl f(final trg trg, final ayf ayf) {
        if (ayf.q == null) {
            return null;
        }
        if (this.g) {
            if (!this.h) {
                final lxn c = this.c;
                if (c != null) {
                    ((bkl)c).o(trg);
                    return (bkl)c;
                }
            }
        }
        else if (!this.h && !this.b.isEmpty()) {
            final bkl bkl = this.b.get(0);
            bkl.o(trg);
            return bkl;
        }
        byte[] d;
        Object c2;
        if (this.e == null) {
            final DrmInitData$SchemeData n = n(ayf.q, this.n, false);
            if (n == null) {
                final lxr lxr = new lxr(this.n);
                if (trg != null) {
                    trg.t((Exception)lxr);
                }
                return (bkl)new bkx(new bkk((Throwable)lxr, 6003));
            }
            d = n.d;
            c2 = n.c;
        }
        else {
            c2 = (d = null);
        }
        lxg f = null;
        Label_0427: {
            Label_0421: {
                if ("video/webm".equals(c2)) {
                    Label_0184: {
                        if (d != null) {
                            try {
                                final Iterator iterator = aeyk.d(";").f(new String(d, StandardCharsets.UTF_8)).iterator();
                                Integer value2;
                                Integer value = value2 = null;
                                while (iterator.hasNext()) {
                                    final List h = aeyk.c(": ").h((CharSequence)iterator.next());
                                    if (h.size() >= 2) {
                                        if (((String)h.get(0)).equals("Crypto-Period-Index")) {
                                            value = Integer.parseInt((String)h.get(1));
                                        }
                                        else {
                                            if (!((String)h.get(0)).equals("Crypto-Period-Seconds")) {
                                                continue;
                                            }
                                            value2 = Integer.parseInt((String)h.get(1));
                                        }
                                    }
                                }
                                if (value == null) {
                                    break Label_0184;
                                }
                                final int intValue = value;
                                int intValue2;
                                if (value2 != null) {
                                    intValue2 = value2;
                                }
                                else {
                                    intValue2 = 120;
                                }
                                f = new lxg(new byte[0], intValue, intValue2);
                                break Label_0427;
                            }
                            catch (final RuntimeException ex) {
                                yzs.d(yzr.d, (Object)"Could not parse drmInitData from WebM");
                                break Label_0184;
                            }
                            break Label_0421;
                        }
                    }
                    f = null;
                    break Label_0427;
                }
            }
            f = xyl.f(d);
        }
        if (f != null) {
            this.k.l = f.b;
        }
        else {
            this.k.l = null;
        }
        final Iterator iterator2 = this.b.iterator();
        lxn lxn = null;
        while (true) {
            while (iterator2.hasNext()) {
                final lxn lxn2 = (lxn)iterator2.next();
                if (!Arrays.equals(lxn2.b, d)) {
                    if (!this.h || f == null || lxn2.g() != f.b) {
                        if (lxn2.j != 4 || f == null) {
                            continue;
                        }
                        final lxg f2 = lxn2.f;
                        if (f2 != null && f.b != -1 && f2.b != -1 && Arrays.equals(f.a, f2.a) && Math.abs(f.b - f2.b) <= 1) {
                            lxn = lxn2;
                            continue;
                        }
                        continue;
                    }
                }
                lxn c3;
                if (lxn2 != null) {
                    c3 = lxn2.f();
                }
                else if (lxn != null && this.t) {
                    dk.d((Object)f);
                    lxn lxn3 = null;
                    Label_0732: {
                        if (lxn.f() != lxn) {
                            final lxn f3 = lxn.f();
                            for (final lxn lxn3 : this.b) {
                                if (lxn3 != f3 && lxn3 != lxn && lxn3.f() == f3) {
                                    break Label_0732;
                                }
                            }
                        }
                        lxn3 = null;
                    }
                    if (lxn3 != null) {
                        lxn3.p(null);
                        this.b.remove(lxn3);
                    }
                    final lxn f4 = lxn.f();
                    final Integer g = lxn.g();
                    if (g == null) {
                        Log.w("YTDrmSessionMgr", "AcquireSession: No crypto period index available for overlap session!");
                    }
                    if (f.b > g) {
                        final lxn m = this.m(d, (String)c2, f, f4);
                        this.b.add(m);
                        m.o(null);
                    }
                    c3 = f4;
                }
                else {
                    c3 = this.m(d, (String)c2, f, null);
                    if (this.g && !this.h) {
                        this.c = c3;
                    }
                    this.b.add(c3);
                }
                c3.o(trg);
                return (bkl)c3;
            }
            final lxn lxn2 = null;
            continue;
        }
    }
    
    public final void g(final byte[] array, final long n) {
        if (this.d != 0) {
            return;
        }
        this.a.j(n);
        for (final lxn lxn : this.b) {
            if (lxn.s(array)) {
                if (lxn.l != null) {
                    lxn.d.i();
                    break;
                }
                break;
            }
        }
    }
    
    public final void i(final int v) {
        if (v > 0) {
            this.v = v;
        }
    }
    
    public final void j(final bkz u, final boolean t) {
        dk.d((Object)u);
        this.u = u;
        this.t = t;
    }
    
    public final void k(final int d, final byte[] e) {
        dk.h(this.b.isEmpty());
        if (d == 1 || d == 3) {
            dk.d((Object)e);
        }
        this.d = d;
        this.e = e;
    }
    
    public final boolean l(final byte[] array) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            if (((lxn)iterator.next()).s(array)) {
                return true;
            }
        }
        return false;
    }
    
    protected final lxn m(final byte[] array, final String s, final lxg lxg, final lxn lxn) {
        dk.d((Object)this.u);
        dk.d((Object)this.a);
        return new lxn(this.n, this.u, array, s, this.d, this.e, this.o, (bli)this.k, this.r, this.a, this.i, this.v, this.f, lxg, lxn, new qpt(this), this.s, this.l, this.j, null, null, null, null, null);
    }
}
