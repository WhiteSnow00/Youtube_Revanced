import android.text.TextUtils;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bql extends bqw implements Comparable
{
    private final int e;
    private final boolean f;
    private final String g;
    private final bqo h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    
    public bql(int i, final azo azo, int t, final bqo h, final int n, final boolean b, final afbk afbk) {
        super(i, azo, t);
        this.h = h;
        this.g = bqy.e(this.d.e);
        final int n2 = 0;
        this.i = bqy.k(n, false);
        i = 0;
        int n3;
        while (true) {
            final afgh o = h.o;
            t = ((afjx)o).c;
            n3 = Integer.MAX_VALUE;
            if (i >= t) {
                t = Integer.MAX_VALUE;
                i = 0;
                break;
            }
            final int a = bqy.a(this.d, (String)o.get(i), false);
            if (a > 0) {
                t = i;
                i = a;
                break;
            }
            ++i;
        }
        this.k = t;
        this.j = i;
        i = this.d.g;
        t = h.p;
        this.l = bqy.b(i, 0);
        final ayh d = this.d;
        i = d.g;
        this.m = (i == 0 || (i & 0x1) != 0x0);
        this.p = (0x1 == (d.f & 0x1));
        this.q = d.A;
        this.r = d.B;
        this.s = d.j;
        i = d.j;
        boolean f = false;
        Label_0288: {
            if (i == -1 || i <= h.r) {
                i = d.A;
                if ((i == -1 || i <= h.q) && afbk.a(d)) {
                    f = true;
                    break Label_0288;
                }
            }
            f = false;
        }
        this.f = f;
        while (true) {
            String[] ao;
            afgh s;
            String n4;
            bqo h2;
            boolean f2;
            boolean x;
            for (ao = baz.ao(), i = 0; i < ao.length; ++i) {
                t = bqy.a(this.d, ao[i], false);
                if (t > 0) {
                    this.n = i;
                    this.o = t;
                    i = 0;
                    while (true) {
                        s = h.s;
                        t = n3;
                        if (i >= ((afjx)s).c) {
                            break;
                        }
                        n4 = this.d.n;
                        if (n4 != null && n4.equals(s.get(i))) {
                            t = i;
                            break;
                        }
                        ++i;
                    }
                    this.t = t;
                    this.u = (bht.e(n) == 128);
                    this.v = (bht.g(n) == 64);
                    h2 = this.h;
                    Label_0566: {
                        if (!bqy.k(n, h2.M)) {
                            i = n2;
                        }
                        else {
                            f2 = this.f;
                            if (!f2 && !h2.G) {
                                i = n2;
                            }
                            else {
                                if (bqy.k(n, false) && f2 && this.d.j != -1 && !h2.y) {
                                    x = h2.x;
                                    if (h2.O || !b) {
                                        i = 2;
                                        break Label_0566;
                                    }
                                }
                                i = 1;
                            }
                        }
                    }
                    this.e = i;
                    return;
                }
            }
            i = Integer.MAX_VALUE;
            t = 0;
            continue;
        }
    }
    
    public final int a(final bql bql) {
        afjr afjr;
        if (this.f && this.i) {
            afjr = bqy.a;
        }
        else {
            afjr = bqy.a.c();
        }
        final afeq d = afeq.b.e(this.i, bql.i).d(this.k, bql.k, (Comparator)afki.a).b(this.j, bql.j).b(this.l, bql.l).e(this.p, bql.p).e(this.m, bql.m).d(this.n, bql.n, (Comparator)afki.a).b(this.o, bql.o).e(this.f, bql.f).d(this.t, bql.t, (Comparator)afki.a);
        final int s = this.s;
        final int s2 = bql.s;
        final boolean x = this.h.x;
        final afeq d2 = d.d(s, s2, bqy.b).e(this.u, bql.u).e(this.v, bql.v).d(this.q, bql.q, afjr).d(this.r, bql.r, afjr);
        final int s3 = this.s;
        final int s4 = bql.s;
        if (!baz.aa(this.g, bql.g)) {
            afjr = bqy.b;
        }
        return d2.d(s3, s4, afjr).a();
    }
    
    @Override
    public final int b() {
        return this.e;
    }
    
    @Override
    public final /* bridge */ boolean c(final bqw bqw) {
        final bql bql = (bql)bqw;
        final bqo h = this.h;
        final boolean j = h.J;
        final ayh d = this.d;
        final int a = d.A;
        if (a != -1) {
            final ayh d2 = bql.d;
            if (a == d2.A) {
                final boolean h2 = h.H;
                final String n = d.n;
                if (n != null && TextUtils.equals((CharSequence)n, (CharSequence)d2.n)) {
                    final bqo h3 = this.h;
                    final boolean i = h3.I;
                    final int b = this.d.B;
                    if (b != -1 && b == bql.d.B) {
                        final boolean k = h3.K;
                        if (this.u == bql.u && this.v == bql.v) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a((bql)o);
    }
}
