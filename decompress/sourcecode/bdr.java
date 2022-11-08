import android.util.Pair;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdr extends azl
{
    public final int b;
    public final azl[] c;
    private final int d;
    private final int e;
    private final int[] f;
    private final int[] g;
    private final Object[] h;
    private final HashMap i;
    private final eg j;
    
    public bdr(final Collection collection, final eg j, final byte[] array, final byte[] array2) {
        this.j = j;
        this.d = j.v();
        final int size = collection.size();
        this.f = new int[size];
        this.g = new int[size];
        this.c = new azl[size];
        this.h = new Object[size];
        this.i = new HashMap();
        final Iterator iterator = collection.iterator();
        int b = 0;
        int e = 0;
        int n = 0;
        while (iterator.hasNext()) {
            final bfg bfg = (bfg)iterator.next();
            this.c[n] = bfg.a();
            this.g[n] = b;
            this.f[n] = e;
            b += this.c[n].c();
            e += this.c[n].b();
            this.h[n] = bfg.b();
            this.i.put(this.h[n], n);
            ++n;
        }
        this.b = b;
        this.e = e;
    }
    
    private final int A(int n, final boolean b) {
        final int n2 = -1;
        if (b) {
            final eg j = this.j;
            final int n3 = ((int[])j.c)[n] + 1;
            final int[] array = (int[])j.d;
            n = n2;
            if (n3 < array.length) {
                n = array[n3];
            }
        }
        else {
            if (n < this.d - 1) {
                return n + 1;
            }
            n = n2;
        }
        return n;
    }
    
    private final int B(int n, final boolean b) {
        final int n2 = -1;
        if (b) {
            final eg j = this.j;
            final int n3 = ((int[])j.c)[n] - 1;
            n = n2;
            if (n3 >= 0) {
                n = ((int[])j.d)[n3];
            }
        }
        else {
            if (n > 0) {
                return n - 1;
            }
            n = n2;
        }
        return n;
    }
    
    public static Object r(final Object o) {
        return ((Pair)o).second;
    }
    
    public static Object s(final Object o) {
        return ((Pair)o).first;
    }
    
    public final int a(Object r) {
        if (!(r instanceof Pair)) {
            return -1;
        }
        final Object s = s(r);
        r = r(r);
        final int t = this.t(s);
        if (t == -1) {
            return -1;
        }
        final int a = this.y(t).a(r);
        if (a == -1) {
            return -1;
        }
        return this.w(t) + a;
    }
    
    public final int b() {
        return this.e;
    }
    
    public final int c() {
        return this.b;
    }
    
    public final azj d(final int n, final azj azj, final boolean b) {
        final int u = this.u(n);
        final int x = this.x(u);
        this.y(u).d(n - this.w(u), azj, b);
        azj.c += x;
        if (b) {
            final Object z = this.z(u);
            final Object b2 = azj.b;
            dk.d(b2);
            azj.b = Pair.create(z, b2);
        }
        return azj;
    }
    
    public final azk e(final int n, final azk azk, final long n2) {
        final int v = this.v(n);
        final int x = this.x(v);
        final int w = this.w(v);
        this.y(v).e(n - x, azk, n2);
        Object b = this.z(v);
        if (!azk.a.equals(azk.b)) {
            b = Pair.create(b, azk.b);
        }
        azk.b = b;
        azk.o += w;
        azk.p += w;
        return azk;
    }
    
    public final Object f(final int n) {
        final int u = this.u(n);
        return Pair.create(this.z(u), this.y(u).f(n - this.w(u)));
    }
    
    public final int g(final boolean b) {
        if (this.d == 0) {
            return -1;
        }
        int a = 0;
        if (b) {
            final int[] array = (int[])this.j.d;
            if (array.length > 0) {
                a = array[0];
            }
            else {
                a = -1;
            }
        }
        while (this.y(a).p()) {
            if ((a = this.A(a, b)) == -1) {
                return -1;
            }
        }
        return this.x(a) + this.y(a).g(b);
    }
    
    public final int h(final boolean b) {
        int n = this.d;
        if (n == 0) {
            return -1;
        }
        if (b) {
            final int[] array = (int[])this.j.d;
            final int length = array.length;
            if (length > 0) {
                n = array[length - 1];
            }
            else {
                n = -1;
            }
        }
        else {
            --n;
        }
        while (this.y(n).p()) {
            if ((n = this.B(n, b)) == -1) {
                return -1;
            }
        }
        return this.x(n) + this.y(n).h(b);
    }
    
    public final int j(int n, final int n2, final boolean b) {
        final int v = this.v(n);
        final int x = this.x(v);
        final azl y = this.y(v);
        int n3;
        if (n2 == 2) {
            n3 = 0;
        }
        else {
            n3 = n2;
        }
        n = y.j(n - x, n3, b);
        if (n != -1) {
            return x + n;
        }
        for (n = this.A(v, b); n != -1 && this.y(n).p(); n = this.A(n, b)) {}
        if (n != -1) {
            return this.x(n) + this.y(n).g(b);
        }
        if (n2 == 2) {
            return this.g(b);
        }
        return -1;
    }
    
    public final azj n(final Object b, final azj azj) {
        final Object s = s(b);
        final Object r = r(b);
        final int t = this.t(s);
        final int x = this.x(t);
        this.y(t).n(r, azj);
        azj.c += x;
        azj.b = b;
        return azj;
    }
    
    public final int q(int n, final int n2) {
        final int v = this.v(n);
        final int x = this.x(v);
        final azl y = this.y(v);
        int n3;
        if (n2 == 2) {
            n3 = 0;
        }
        else {
            n3 = n2;
        }
        n = y.q(n - x, n3);
        if (n != -1) {
            return x + n;
        }
        for (n = this.B(v, false); n != -1 && this.y(n).p(); n = this.B(n, false)) {}
        if (n != -1) {
            return this.x(n) + this.y(n).h(false);
        }
        if (n2 == 2) {
            return this.h(false);
        }
        return -1;
    }
    
    protected final int t(final Object o) {
        final Integer n = this.i.get(o);
        if (n == null) {
            return -1;
        }
        return n;
    }
    
    protected final int u(final int n) {
        return baw.b(this.f, n + 1, false, false);
    }
    
    protected final int v(final int n) {
        return baw.b(this.g, n + 1, false, false);
    }
    
    protected final int w(final int n) {
        return this.f[n];
    }
    
    protected final int x(final int n) {
        return this.g[n];
    }
    
    protected final azl y(final int n) {
        return this.c[n];
    }
    
    protected final Object z(final int n) {
        return this.h[n];
    }
}
