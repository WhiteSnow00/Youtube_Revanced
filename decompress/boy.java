import java.io.EOFException;
import androidx.media3.common.DrmInitData;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boy implements bug
{
    private ayh A;
    private boolean B;
    private boolean C;
    private final adfz D;
    private final agpw E;
    private final tun F;
    public final bow a;
    public box b;
    public int c;
    public long d;
    public boolean e;
    public int f;
    public long g;
    private final bkv h;
    private ayh i;
    private bkp j;
    private int k;
    private int[] l;
    private long[] m;
    private int[] n;
    private int[] o;
    private long[] p;
    private buf[] q;
    private int r;
    private int s;
    private int t;
    private long u;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ayh z;
    
    protected boy(final bri bri, final bkv h, final tun f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = h;
        this.F = f;
        this.a = new bow(bri);
        this.D = new adfz();
        this.k = 1000;
        this.l = new int[1000];
        this.m = new long[1000];
        this.p = new long[1000];
        this.o = new int[1000];
        this.n = new int[1000];
        this.q = new buf[1000];
        this.E = new agpw(bkc.c);
        this.d = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
    }
    
    public static boy D(final bri bri) {
        return new boy(bri, null, null, null, null, null, null);
    }
    
    public static boy F(final bri bri, final bkv bkv, final tun tun) {
        bad.b(bkv);
        return new boy(bri, bkv, tun, null, null, null, null);
    }
    
    private final int G(int n, final int n2, final long n3, final boolean b) {
        int n4 = -1;
        final int n5 = 0;
        int n6 = n;
        n = n5;
        int n7;
        while (true) {
            n7 = n4;
            if (n >= n2) {
                break;
            }
            final long n8 = this.p[n6];
            n7 = n4;
            if (n8 > n3) {
                break;
            }
            if (!b || (this.o[n6] & 0x1) != 0x0) {
                if (n8 == n3) {
                    n7 = n;
                    break;
                }
                n4 = n;
            }
            if (++n6 == this.k) {
                n6 = 0;
            }
            ++n;
        }
        return n7;
    }
    
    private final int H(int n) {
        n += this.s;
        final int k = this.k;
        if (n < k) {
            return n;
        }
        return n - k;
    }
    
    private final long I(long k, final boolean b, final boolean b2) {
        synchronized (this) {
            final int r = this.r;
            if (r != 0) {
                final long[] p3 = this.p;
                final int s = this.s;
                if (k >= p3[s]) {
                    int n = r;
                    if (b2) {
                        final int t = this.t;
                        if (t != (n = r)) {
                            n = t + 1;
                        }
                    }
                    final int g = this.G(s, n, k, b);
                    if (g == -1) {
                        return -1L;
                    }
                    k = this.K(g);
                    return k;
                }
            }
            return -1L;
        }
    }
    
    private final long J() {
        synchronized (this) {
            final int r = this.r;
            if (r == 0) {
                return -1L;
            }
            return this.K(r);
        }
    }
    
    private final long K(int i) {
        this.u = Math.max(this.u, this.L(i));
        this.r -= i;
        final int c = this.c + i;
        this.c = c;
        final int s = this.s + i;
        this.s = s;
        final int k = this.k;
        if (s >= k) {
            this.s = s - k;
        }
        final int t = this.t - i;
        this.t = t;
        i = 0;
        if (t < 0) {
            this.t = 0;
        }
        int n;
        for (agpw e = this.E; i < ((SparseArray)e.a).size() - 1; i = n) {
            final Object a = e.a;
            n = i + 1;
            if (c < ((SparseArray)a).keyAt(n)) {
                break;
            }
            ((bah)e.c).a(((SparseArray)e.a).valueAt(i));
            ((SparseArray)e.a).removeAt(i);
            i = e.b;
            if (i > 0) {
                e.b = i - 1;
            }
        }
        if (this.r == 0) {
            if ((i = this.s) == 0) {
                i = this.k;
            }
            final long[] m = this.m;
            --i;
            return m[i] + this.n[i];
        }
        return this.m[this.s];
    }
    
    private final long L(final int n) {
        long max = Long.MIN_VALUE;
        if (n == 0) {
            return Long.MIN_VALUE;
        }
        int h = this.H(n - 1);
        int n2 = 0;
        long n3;
        while (true) {
            n3 = max;
            if (n2 >= n) {
                break;
            }
            max = Math.max(max, this.p[h]);
            if ((this.o[h] & 0x1) != 0x0) {
                n3 = max;
                break;
            }
            if (--h == -1) {
                h = this.k - 1;
            }
            ++n2;
        }
        return n3;
    }
    
    private final void M(final long n, int i, final long n2, int n3, final buf buf) {
        synchronized (this) {
            final int r = this.r;
            if (r > 0) {
                final int h = this.H(r - 1);
                bad.d(this.m[h] + this.n[h] <= n2);
            }
            this.w = ((0x20000000 & i) != 0x0);
            this.v = Math.max(this.v, n);
            final int h2 = this.H(this.r);
            this.p[h2] = n;
            this.m[h2] = n2;
            this.n[h2] = n3;
            this.o[h2] = i;
            this.q[h2] = buf;
            this.l[h2] = this.f;
            if (this.E.A() || !((ayh)((eae)this.E.z()).b).equals((Object)this.A)) {
                final bkv h3 = this.h;
                bku bku;
                if (h3 != null) {
                    bku = h3.h(this.F, this.A);
                }
                else {
                    bku = bku.e;
                }
                final agpw e = this.E;
                i = this.i();
                final ayh a = this.A;
                bad.b(a);
                final eae eae = new eae(a, bku);
                if (e.b == -1) {
                    bad.f(((SparseArray)e.a).size() == 0);
                    e.b = 0;
                }
                if (((SparseArray)e.a).size() > 0) {
                    final Object a2 = e.a;
                    n3 = ((SparseArray)a2).size();
                    n3 = ((SparseArray)a2).keyAt(n3 - 1);
                    bad.d(i >= n3);
                    if (n3 == i) {
                        final Object c = e.c;
                        final Object a3 = e.a;
                        n3 = ((SparseArray)a3).size();
                        ((bah)c).a(((SparseArray)a3).valueAt(n3 - 1));
                    }
                }
                ((SparseArray)e.a).append(i, (Object)eae);
            }
            i = this.r + 1;
            this.r = i;
            final int k = this.k;
            if (i == k) {
                i = k + 1000;
                final int[] l = new int[i];
                final long[] m = new long[i];
                final long[] p5 = new long[i];
                final int[] o = new int[i];
                final int[] n4 = new int[i];
                final buf[] q = new buf[i];
                n3 = this.s;
                final int n5 = k - n3;
                System.arraycopy(this.m, n3, m, 0, n5);
                System.arraycopy(this.p, this.s, p5, 0, n5);
                System.arraycopy(this.o, this.s, o, 0, n5);
                System.arraycopy(this.n, this.s, n4, 0, n5);
                System.arraycopy(this.q, this.s, q, 0, n5);
                System.arraycopy(this.l, this.s, l, 0, n5);
                n3 = this.s;
                System.arraycopy(this.m, 0, m, n5, n3);
                System.arraycopy(this.p, 0, p5, n5, n3);
                System.arraycopy(this.o, 0, o, n5, n3);
                System.arraycopy(this.n, 0, n4, n5, n3);
                System.arraycopy(this.q, 0, q, n5, n3);
                System.arraycopy(this.l, 0, l, n5, n3);
                this.m = m;
                this.p = p5;
                this.o = o;
                this.n = n4;
                this.q = q;
                this.l = l;
                this.s = 0;
                this.k = i;
            }
        }
    }
    
    private final void N() {
        final bkp j = this.j;
        if (j != null) {
            j.p(this.F);
            this.j = null;
            this.i = null;
        }
    }
    
    private final void O() {
        synchronized (this) {
            this.t = 0;
            final bow a = this.a;
            a.d = a.c;
        }
    }
    
    private final boolean P() {
        return this.t != this.r;
    }
    
    private final boolean Q(final int n) {
        final bkp j = this.j;
        boolean b2;
        final boolean b = b2 = true;
        if (j != null) {
            b2 = b;
            if (j.a() != 4) {
                if ((this.o[n] & 0x40000000) == 0x0) {
                    if (!j.m()) {
                        return false;
                    }
                    b2 = b;
                }
                else {
                    b2 = false;
                }
            }
        }
        return b2;
    }
    
    private final boolean R(ayh a) {
        synchronized (this) {
            this.y = false;
            if (baz.aa(a, this.A)) {
                return false;
            }
            if (!this.E.A() && ((ayh)((eae)this.E.z()).b).equals((Object)a)) {
                this.A = (ayh)((eae)this.E.z()).b;
            }
            else {
                this.A = a;
            }
            a = this.A;
            this.B = aza.h(a.n, a.k);
            this.C = false;
            return true;
        }
    }
    
    private final void S(final ayh i, final bxf bxf) {
        final ayh j = this.i;
        final boolean b = j == null;
        Object q;
        if (b) {
            q = null;
        }
        else {
            q = j.q;
        }
        this.i = i;
        final DrmInitData q2 = i.q;
        final bkv h = this.h;
        ayh c;
        if (h != null) {
            c = i.c(h.a(i));
        }
        else {
            c = i;
        }
        bxf.a = c;
        bxf.b = this.j;
        if (this.h == null) {
            return;
        }
        if (!b && baz.aa(q, q2)) {
            return;
        }
        final bkp k = this.j;
        final bkp f = this.h.f(this.F, i);
        this.j = f;
        bxf.b = f;
        if (k != null) {
            k.p(this.F);
        }
    }
    
    private final int T(final bxf bxf, final bde bde, final boolean b, final boolean b2, final adfz adfz) {
        synchronized (this) {
            bde.d = false;
            if (!this.P()) {
                if (b2 || this.w) {
                    ((bcy)bde).setFlags(4);
                    return -4;
                }
                final ayh a = this.A;
                if (a != null && (b || a != this.i)) {
                    this.S(a, bxf);
                    return -5;
                }
                return -3;
            }
            else {
                final Object b3 = ((eae)this.E.y(this.g())).b;
                if (b || b3 != this.i) {
                    this.S((ayh)b3, bxf);
                    return -5;
                }
                final int h = this.H(this.t);
                if (!this.Q(h)) {
                    bde.d = true;
                    return -3;
                }
                ((bcy)bde).setFlags(this.o[h]);
                final long e = this.p[h];
                bde.e = e;
                if (e < this.d) {
                    ((bcy)bde).addFlag(Integer.MIN_VALUE);
                }
                adfz.c = this.n[h];
                adfz.b = this.m[h];
                adfz.a = this.q[h];
                return -4;
            }
        }
    }
    
    public final boolean A(final boolean b) {
        synchronized (this) {
            final boolean p = this.P();
            final boolean b2 = true;
            if (!p) {
                boolean b3 = b2;
                if (!b) {
                    b3 = b2;
                    if (!this.w) {
                        final ayh a = this.A;
                        if (a != null) {
                            if (a == this.i) {
                                return false;
                            }
                            b3 = b2;
                        }
                        else {
                            b3 = false;
                        }
                    }
                }
                return b3;
            }
            return ((eae)this.E.y(this.g())).b != this.i || this.Q(this.H(this.t));
        }
    }
    
    public final boolean B(final int n) {
        synchronized (this) {
            this.O();
            final int c = this.c;
            if (n >= c && n <= this.r + c) {
                this.d = Long.MIN_VALUE;
                this.t = n - c;
                return true;
            }
            return false;
        }
    }
    
    public final boolean C(final long d, final boolean b) {
        synchronized (this) {
            this.O();
            final int t = this.t;
            final int h = this.H(t);
            if (!this.P() || d < this.p[h] || (d > this.v && !b)) {
                return false;
            }
            final int g = this.G(h, this.r - t, d, true);
            if (g == -1) {
                return false;
            }
            this.d = d;
            this.t += g;
            return true;
        }
    }
    
    public final int E(final bxf bxf, final bde bde, final int n, final boolean b) {
        int t;
        if ((t = this.T(bxf, bde, (n & 0x2) != 0x0, b, this.D)) == -4) {
            Label_0149: {
                if (!((bcy)bde).isEndOfStream()) {
                    final int n2 = n & 0x1;
                    if ((n & 0x4) == 0x0) {
                        if (n2 != 0) {
                            final bow a = this.a;
                            bow.e(a.d, bde, this.D, a.b);
                            break Label_0149;
                        }
                        final bow a2 = this.a;
                        a2.d = bow.e(a2.d, bde, this.D, a2.b);
                    }
                    else if (n2 != 0) {
                        break Label_0149;
                    }
                    ++this.t;
                    return -4;
                }
            }
            t = -4;
        }
        return t;
    }
    
    public final int a(final ayc ayc, final int n, final boolean b) {
        return bht.h((bug)this, ayc, n, b);
    }
    
    public final void b(final ayh z) {
        ayh a;
        if (this.g != 0L && z.r != Long.MAX_VALUE) {
            final ayg b = z.b();
            b.o = z.r + this.g;
            a = b.a();
        }
        else {
            a = z;
        }
        this.e = false;
        this.z = z;
        final boolean r = this.R(a);
        final box b2 = this.b;
        if (b2 != null && r) {
            final bor bor = (bor)b2;
            bor.h.post(bor.f);
        }
    }
    
    public final void c(final bat bat, final int n) {
        bht.i((bug)this, bat, n);
    }
    
    public final void d(final bat bat, int i, int a) {
        final bow a2 = this.a;
        while (i > 0) {
            a = a2.a(i);
            final bov e = a2.e;
            bat.B((byte[])e.d.b, e.a(a2.f), a);
            i -= a;
            a2.d(a);
        }
    }
    
    public final void e(long n, int n2, final int n3, final int n4, final buf buf) {
        if (this.e) {
            final ayh z = this.z;
            bad.c(z);
            this.b(z);
        }
        final int n5 = n2 & 0x1;
        if (this.x) {
            if (n5 == 0) {
                return;
            }
            this.x = false;
        }
        n += this.g;
        if (this.B) {
            if (n < this.d) {
                return;
            }
            if (n5 == 0) {
                if (!this.C) {
                    baq.c("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.A))));
                    this.C = true;
                }
                n2 |= 0x1;
            }
        }
        this.M(n, n2, this.a.f - n3 - n4, n3, buf);
    }
    
    public final int f(final ayc ayc, int n, final boolean b) {
        final bow a = this.a;
        n = a.a(n);
        final bov e = a.e;
        n = ayc.a((byte[])e.d.b, e.a(a.f), n);
        if (n == -1) {
            if (!b) {
                throw new EOFException();
            }
            n = -1;
        }
        else {
            a.d(n);
        }
        return n;
    }
    
    public final int g() {
        return this.c + this.t;
    }
    
    public final int h(final long n, final boolean b) {
        synchronized (this) {
            final int t = this.t;
            final int h = this.H(t);
            if (!this.P() || n < this.p[h]) {
                return 0;
            }
            if (n > this.v && b) {
                final int r = this.r;
                monitorexit(this);
                return r - t;
            }
            final int g = this.G(h, this.r - t, n, true);
            monitorexit(this);
            if (g == -1) {
                return 0;
            }
            return g;
        }
    }
    
    public final int i() {
        return this.c + this.r;
    }
    
    public final int j() {
        synchronized (this) {
            final int h = this.H(this.t);
            int f;
            if (this.P()) {
                f = this.l[h];
            }
            else {
                f = this.f;
            }
            return f;
        }
    }
    
    public final long k() {
        synchronized (this) {
            final int t = this.t;
            if (t == 0) {
                return -1L;
            }
            return this.K(t);
        }
    }
    
    public final long l() {
        synchronized (this) {
            if (this.r == 0) {
                return Long.MIN_VALUE;
            }
            return this.p[this.s];
        }
    }
    
    public final long m() {
        synchronized (this) {
            return this.v;
        }
    }
    
    public final long n() {
        synchronized (this) {
            return Math.max(this.u, this.L(this.t));
        }
    }
    
    public final ayh o() {
        synchronized (this) {
            if (this.y) {
                return null;
            }
            return this.A;
        }
    }
    
    public final void p(final long n, final boolean b, final boolean b2) {
        this.a.c(this.I(n, b, b2));
    }
    
    public final void q() {
        this.a.c(this.J());
    }
    
    public final void r(final long n) {
        if (this.r == 0) {
            return;
        }
        bad.d(n > this.n());
        int r = this.r;
        int n2;
        for (int h = this.H(r - 1); r > this.t && this.p[h] >= n; h = this.k - 1, r = n2) {
            n2 = r - 1;
            final int n3 = h - 1;
            r = n2;
            if ((h = n3) == -1) {}
        }
        this.s(this.c + r);
    }
    
    public final void s(int b) {
        final bow a = this.a;
        final int n = this.i() - b;
        final boolean b2 = true;
        bad.d(n >= 0 && n <= this.r - this.t);
        final int r = this.r - n;
        this.r = r;
        this.v = Math.max(this.u, this.L(r));
        this.w = (n == 0 && this.w);
        final agpw e = this.E;
        for (int n2 = ((SparseArray)e.a).size() - 1; n2 >= 0 && b < ((SparseArray)e.a).keyAt(n2); --n2) {
            ((bah)e.c).a(((SparseArray)e.a).valueAt(n2));
            ((SparseArray)e.a).removeAt(n2);
        }
        if (((SparseArray)e.a).size() > 0) {
            b = Math.min(e.b, ((SparseArray)e.a).size() - 1);
        }
        else {
            b = -1;
        }
        e.b = b;
        b = this.r;
        long f;
        if (b != 0) {
            b = this.H(b - 1);
            f = this.m[b] + this.n[b];
        }
        else {
            f = 0L;
        }
        bad.d(f <= a.f && b2);
        a.f = f;
        if (f != 0L) {
            bov bov = a.c;
            if (f != bov.a) {
                while (a.f > bov.b) {
                    bov = bov.c;
                }
                final bov c = bov.c;
                bad.b(c);
                a.b(c);
                bov.c = new bov(bov.b, a.a);
                bov c2;
                if (a.f == bov.b) {
                    c2 = bov.c;
                }
                else {
                    c2 = bov;
                }
                a.e = c2;
                if (a.d == c) {
                    a.d = bov.c;
                }
                return;
            }
        }
        a.b(a.c);
        a.c = new bov(a.f, a.a);
        final bov c3 = a.c;
        a.d = c3;
        a.e = c3;
    }
    
    public final void t() {
        final bkp j = this.j;
        if (j != null && j.a() == 1) {
            final bko c = j.c();
            bad.b(c);
            throw c;
        }
    }
    
    public final void u() {
        this.q();
        this.N();
    }
    
    public final void v() {
        this.x(true);
        this.N();
    }
    
    public final void w() {
        this.x(false);
    }
    
    public final void x(final boolean b) {
        final bow a = this.a;
        a.b(a.c);
        a.c.c(0L, a.a);
        final bov c = a.c;
        a.d = c;
        a.e = c;
        a.f = 0L;
        a.g.d();
        int i = 0;
        this.r = 0;
        this.c = 0;
        this.s = 0;
        this.t = 0;
        this.x = true;
        this.d = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        agpw e;
        for (e = this.E; i < ((SparseArray)e.a).size(); ++i) {
            ((bah)e.c).a(((SparseArray)e.a).valueAt(i));
        }
        e.b = -1;
        ((SparseArray)e.a).clear();
        if (b) {
            this.z = null;
            this.A = null;
            this.y = true;
        }
    }
    
    public final void y(final int n) {
        monitorenter(this);
        boolean b = false;
        Label_0035: {
            if (n >= 0) {
                b = b;
                Label_0052: {
                    try {
                        if (this.t + n <= this.r) {
                            b = true;
                        }
                    }
                    finally {
                        break Label_0052;
                    }
                    break Label_0035;
                }
                monitorexit(this);
            }
        }
        bad.d(b);
        this.t += n;
        monitorexit(this);
    }
    
    public final boolean z() {
        synchronized (this) {
            return this.w;
        }
    }
}
