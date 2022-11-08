import android.util.Pair;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bne extends azl
{
    private final ayt b;
    private final afcr c;
    private final afcr d;
    private final afcr e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final long i;
    private final Object j;
    
    public bne(final ayt b, final afcr c, final afcr d, final afcr e, final boolean f, final boolean g, final long h, final long i, final Object j) {
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
        return baw.aC((List)this.d, (Comparable)(n + 1), false);
    }
    
    public final int a(Object o) {
        if (!(o instanceof Pair) || !(((Pair)o).first instanceof Integer)) {
            return -1;
        }
        final int b = bng.b(o);
        o = bng.o(o);
        final int a = ((azl)this.c.get(b)).a(o);
        if (a == -1) {
            return -1;
        }
        return (int)this.d.get(b) + a;
    }
    
    public final int b() {
        return ((afgh)this.e).c;
    }
    
    public final int c() {
        return 1;
    }
    
    public final azj d(final int n, final azj azj, final boolean b) {
        final int r = this.r(n);
        ((azl)this.c.get(r)).d(n - (int)this.d.get(r), azj, b);
        azj.c = 0;
        azj.e = (long)this.e.get(n);
        if (b) {
            final Object b2 = azj.b;
            dk.d(b2);
            azj.b = bng.G(r, b2);
        }
        return azj;
    }
    
    public final azk e(final int n, final azk azk, final long n2) {
        azk.e(azk.a, this.b, this.j, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, (ayo)null, this.i, this.h, this.b() - 1, -(long)this.e.get(0));
        return azk;
    }
    
    public final Object f(final int n) {
        final int r = this.r(n);
        return bng.G(r, ((azl)this.c.get(r)).f(n - (int)this.d.get(r)));
    }
    
    public final azj n(final Object b, final azj azj) {
        final int b2 = bng.b(b);
        final Object o = bng.o(b);
        final azl azl = (azl)this.c.get(b2);
        final int intValue = (int)this.d.get(b2);
        final int a = azl.a(o);
        azl.n(o, azj);
        azj.c = 0;
        azj.e = (long)this.e.get(intValue + a);
        azj.b = b;
        return azj;
    }
}
