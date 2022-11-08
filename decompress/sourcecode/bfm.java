import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfm
{
    public static final ayx p;
    public final azl a;
    public final long b;
    public final long c;
    public final int d;
    public final bee e;
    public final boolean f;
    public final bpd g;
    public final List h;
    public final boolean i;
    public final int j;
    public final azb k;
    public final boolean l;
    public volatile long m;
    public volatile long n;
    public volatile long o;
    public final ayx q;
    public final ayx r;
    public final aetc s;
    
    static {
        p = new ayx(new Object());
    }
    
    public bfm(final azl a, final ayx q, final long b, final long c, final int d, final bee e, final boolean f, final bpd g, final aetc s, final List h, final ayx r, final boolean i, final int j, final azb k, final long m, final long n, final long o, final boolean l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.q = q;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.s = s;
        this.h = h;
        this.r = r;
        this.i = i;
        this.j = j;
        this.k = k;
        this.m = m;
        this.n = n;
        this.o = o;
        this.l = l;
    }
    
    public static bfm g(final aetc aetc) {
        final azl a = azl.a;
        final ayx p = bfm.p;
        return new bfm(a, p, -9223372036854775807L, 0L, 1, null, false, bpd.a, aetc, (List)afcr.q(), p, false, 0, azb.a, 0L, 0L, 0L, false, null, null, null);
    }
    
    public final bfm a(final boolean b, final int n) {
        return new bfm(this.a, this.q, this.b, this.c, this.d, this.e, this.f, this.g, this.s, this.h, this.r, b, n, this.k, this.m, this.n, this.o, this.l, null, null, null);
    }
    
    public final bfm b(final bee bee) {
        return new bfm(this.a, this.q, this.b, this.c, this.d, bee, this.f, this.g, this.s, this.h, this.r, this.i, this.j, this.k, this.m, this.n, this.o, this.l, null, null, null);
    }
    
    public final bfm c(final azb azb) {
        return new bfm(this.a, this.q, this.b, this.c, this.d, this.e, this.f, this.g, this.s, this.h, this.r, this.i, this.j, azb, this.m, this.n, this.o, this.l, null, null, null);
    }
    
    public final bfm d(final int n) {
        return new bfm(this.a, this.q, this.b, this.c, n, this.e, this.f, this.g, this.s, this.h, this.r, this.i, this.j, this.k, this.m, this.n, this.o, this.l, null, null, null);
    }
    
    public final bfm e(final azl azl) {
        return new bfm(azl, this.q, this.b, this.c, this.d, this.e, this.f, this.g, this.s, this.h, this.r, this.i, this.j, this.k, this.m, this.n, this.o, this.l, null, null, null);
    }
    
    public final bfm f(final ayx ayx) {
        return new bfm(this.a, this.q, this.b, this.c, this.d, this.e, this.f, this.g, this.s, this.h, ayx, this.i, this.j, this.k, this.m, this.n, this.o, this.l, null, null, null);
    }
    
    public final bfm h(final ayx ayx, final long n, final long n2, final long n3, final long n4, final bpd bpd, final aetc aetc, final List list) {
        return new bfm(this.a, ayx, n2, n3, this.d, this.e, this.f, bpd, aetc, list, this.r, this.i, this.j, this.k, this.m, n4, n, this.l, null, null, null);
    }
}
