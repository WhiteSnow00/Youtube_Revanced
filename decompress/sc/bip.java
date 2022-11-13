import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bip extends azm
{
    private final long b;
    private final long c;
    private final long d;
    private final int e;
    private final long f;
    private final long g;
    private final long h;
    private final bjh i;
    private final ayu j;
    private final ayp k;
    
    public bip(final long b, final long c, final long d, final int e, final long f, final long g, final long h, final bjh i, final ayu j, final ayp k) {
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
    
    private static boolean r(final bjh bjh) {
        return bjh.d && bjh.e != -9223372036854775807L && bjh.b == -9223372036854775807L;
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
    
    public final azk d(int a, final azk azk, final boolean b) {
        dk.j(a, this.b());
        Object value = null;
        Object c;
        if (b) {
            c = this.i.d(a).c;
        }
        else {
            c = null;
        }
        if (b) {
            value = this.e + a;
        }
        final long c2 = this.i.c(a);
        final long a2 = this.i.d(a).a;
        final long a3 = this.i.d(0).a;
        a = bax.a;
        azk.g(c, value, c2, bax.w(a2 - a3) - this.f);
        return azk;
    }
    
    public final azl e(int i, final azl azl, long c) {
        dk.j(i, 1);
        final long h = this.h;
        Label_0024: {
            if (r(this.i)) {
                long n = h;
                if (c > 0L) {
                    c = (n = h + c);
                    if (c > this.g) {
                        c = -9223372036854775807L;
                        break Label_0024;
                    }
                }
                long n2;
                long c2;
                for (n2 = this.f + n, c2 = this.i.c(0), i = 0; i < this.i.a() - 1 && n2 >= c2; ++i, c = this.i.c(i), n2 -= c2, c2 = c) {}
                final adhi d = this.i.d(i);
                final int size = ((List)d.d).size();
                i = 0;
                while (true) {
                    while (i < size) {
                        if (((bjf)((List<Object>)d.d).get(i)).b == 2) {
                            if (i == -1) {
                                c = n;
                                break Label_0024;
                            }
                            final biw k = ((List<bjf>)d.d).get(i).c.get(0).k();
                            c = n;
                            if (k == null) {
                                break Label_0024;
                            }
                            if (k.f(c2) == 0L) {
                                c = n;
                                break Label_0024;
                            }
                            c = n + k.h(k.g(n2, c2)) - n2;
                            break Label_0024;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            c = h;
        }
        final Object a = azl.a;
        final ayu j = this.j;
        final bjh l = this.i;
        azl.e(a, j, (Object)l, this.b, this.c, this.d, true, r(l), this.k, c, this.g, this.b() - 1, this.f);
        return azl;
    }
    
    public final Object f(final int n) {
        dk.j(n, this.b());
        return this.e + n;
    }
}
