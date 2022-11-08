import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bio extends azl
{
    private final long b;
    private final long c;
    private final long d;
    private final int e;
    private final long f;
    private final long g;
    private final long h;
    private final bjg i;
    private final ayt j;
    private final ayo k;
    
    public bio(final long b, final long c, final long d, final int e, final long f, final long g, final long h, final bjg i, final ayt j, final ayo k) {
        final boolean d2 = i.d;
        boolean b2 = false;
        if (d2 == (k != null)) {
            b2 = true;
        }
        dk.h(b2);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    private static boolean r(final bjg bjg) {
        return bjg.d && bjg.e != -9223372036854775807L && bjg.b == -9223372036854775807L;
    }
    
    public final int a(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int n = (int)o - this.e;
        if (n >= 0 && n < this.b()) {
            return n;
        }
        return -1;
    }
    
    public final int b() {
        return this.i.a();
    }
    
    public final int c() {
        return 1;
    }
    
    public final azj d(final int n, final azj azj, final boolean b) {
        dk.j(n, this.b());
        Object value = null;
        Object c;
        if (b) {
            c = this.i.d(n).c;
        }
        else {
            c = null;
        }
        if (b) {
            value = this.e + n;
        }
        azj.g(c, value, this.i.c(n), baw.w(this.i.d(n).a - this.i.d(0).a) - this.f);
        return azj;
    }
    
    public final azk e(int i, final azk azk, long n) {
        dk.j(i, 1);
        final long h = this.h;
        Label_0024: {
            if (r(this.i)) {
                long n2 = h;
                if (n > 0L) {
                    n = (n2 = h + n);
                    if (n > this.g) {
                        n = -9223372036854775807L;
                        break Label_0024;
                    }
                }
                long n3;
                long n4;
                for (n3 = this.f + n2, n4 = this.i.c(0), i = 0; i < this.i.a() - 1 && n3 >= n4; n3 -= n4, ++i, n4 = this.i.c(i)) {}
                final adff d = this.i.d(i);
                final int size = ((List)d.d).size();
                i = 0;
                while (true) {
                    while (i < size) {
                        final int n5 = i;
                        if (((bje)((List<Object>)d.d).get(i)).b != 2) {
                            ++i;
                        }
                        else {
                            if (n5 == -1) {
                                n = n2;
                                break Label_0024;
                            }
                            final biv k = ((List<bje>)d.d).get(n5).c.get(0).k();
                            n = n2;
                            if (k == null) {
                                break Label_0024;
                            }
                            if (k.f(n4) == 0L) {
                                n = n2;
                                break Label_0024;
                            }
                            n = n2 + k.h(k.g(n3, n4)) - n3;
                            break Label_0024;
                        }
                    }
                    final int n5 = -1;
                    continue;
                }
            }
            n = h;
        }
        final Object a = azk.a;
        final ayt j = this.j;
        final bjg l = this.i;
        azk.e(a, j, (Object)l, this.b, this.c, this.d, true, r(l), this.k, n, this.g, this.b() - 1, this.f);
        return azk;
    }
    
    public final Object f(final int n) {
        dk.j(n, this.b());
        return this.e + n;
    }
}
