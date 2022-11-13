import android.util.Pair;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bnf extends azm
{
    private final ayu b;
    private final afeq c;
    private final afeq d;
    private final afeq e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final long i;
    private final Object j;
    
    public bnf(final ayu b, final afeq c, final afeq d, final afeq e, final boolean f, final boolean g, final long h, final long i, final Object j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private final int r(final int n) {
        return bax.aC((List)this.d, (Comparable)(n + 1), false);
    }
    
    public final int a(Object o) {
        if (!(o instanceof Pair) || !(((Pair)o).first instanceof Integer)) {
            return -1;
        }
        final int b = bnh.b(o);
        o = bnh.o(o);
        final int a = ((azm)this.c.get(b)).a(o);
        if (a == -1) {
            return -1;
        }
        return (int)this.d.get(b) + a;
    }
    
    public final int b() {
        return ((afih)this.e).c;
    }
    
    public final int c() {
        return 1;
    }
    
    public final azk d(final int n, final azk azk, final boolean b) {
        final int r = this.r(n);
        ((azm)this.c.get(r)).d(n - (int)this.d.get(r), azk, b);
        azk.c = 0;
        azk.e = (long)this.e.get(n);
        if (b) {
            final Object b2 = azk.b;
            dk.d(b2);
            azk.b = bnh.G(r, b2);
        }
        return azk;
    }
    
    public final azl e(final int n, final azl azl, final long n2) {
        azl.e(azl.a, this.b, this.j, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, (ayp)null, this.i, this.h, this.b() - 1, -(long)this.e.get(0));
        return azl;
    }
    
    public final Object f(final int n) {
        final int r = this.r(n);
        return bnh.G(r, ((azm)this.c.get(r)).f(n - (int)this.d.get(r)));
    }
    
    public final azk n(final Object b, final azk azk) {
        final int b2 = bnh.b(b);
        final Object o = bnh.o(b);
        final azm azm = (azm)this.c.get(b2);
        final int intValue = (int)this.d.get(b2);
        final int a = azm.a(o);
        azm.n(o, azk);
        azk.c = 0;
        azk.e = (long)this.e.get(intValue + a);
        azk.b = b;
        return azk;
    }
}
