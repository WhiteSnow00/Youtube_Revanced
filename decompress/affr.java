import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.io.ObjectInputStream;
import java.util.Set;
import java.io.Serializable;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class affr extends AbstractMap implements Serializable, afdu
{
    transient Object[] a;
    transient Object[] b;
    transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient afdu g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;
    
    private affr(final int n) {
        this.j(n);
    }
    
    public static affr g() {
        return h(16);
    }
    
    public static affr h(final int n) {
        return new affr(n);
    }
    
    private final int p(final int n) {
        return n & this.h.length - 1;
    }
    
    private final void q(final int n, int i) {
        adme.K(n != -1);
        i = this.p(i);
        final int[] h = this.h;
        int n2 = h[i];
        if (n2 == n) {
            final int[] j = this.j;
            h[i] = j[n];
            j[n] = -1;
            return;
        }
        int[] k;
        int n3;
        for (i = this.j[n2]; i != -1; i = n3) {
            if (i == n) {
                k = this.j;
                k[n2] = k[n];
                k[n] = -1;
                return;
            }
            n3 = this.j[i];
            n2 = i;
        }
        final StringBuilder sb = new StringBuilder("Expected to find entry with key ");
        final Object o = this.a[n];
        sb.append(o);
        throw new AssertionError((Object)"Expected to find entry with key ".concat(String.valueOf(o)));
    }
    
    private final void r(final int n, int i) {
        adme.K(n != -1);
        i = this.p(i);
        final int[] j = this.i;
        int n2 = j[i];
        if (n2 == n) {
            final int[] k = this.k;
            j[i] = k[n];
            k[n] = -1;
            return;
        }
        int[] l;
        int n3;
        for (i = this.k[n2]; i != -1; i = n3) {
            if (i == n) {
                l = this.k;
                l[n2] = l[n];
                l[n] = -1;
                return;
            }
            n3 = this.k[i];
            n2 = i;
        }
        final StringBuilder sb = new StringBuilder("Expected to find entry with value ");
        final Object o = this.b[n];
        sb.append(o);
        throw new AssertionError((Object)"Expected to find entry with value ".concat(String.valueOf(o)));
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        this.j(16);
        for (int i = 0; i < int1; ++i) {
            this.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
    
    private final void s(int i) {
        final int length = this.j.length;
        if (length < i) {
            final int f = affx.f(length, i);
            this.a = Arrays.copyOf(this.a, f);
            this.b = Arrays.copyOf(this.b, f);
            this.j = y(this.j, f);
            this.k = y(this.k, f);
            this.m = y(this.m, f);
            this.f = y(this.f, f);
        }
        if (this.h.length < i) {
            i = aegu.v(i);
            this.h = x(i);
            this.i = x(i);
            int p;
            int[] j;
            int[] h;
            int p2;
            int[] k;
            int[] l;
            for (i = 0; i < this.c; ++i) {
                p = this.p(aegu.u(this.a[i]));
                j = this.j;
                h = this.h;
                j[i] = h[p];
                h[p] = i;
                p2 = this.p(aegu.u(this.b[i]));
                k = this.k;
                l = this.i;
                k[i] = l[p2];
                l[p2] = i;
            }
        }
    }
    
    private final void t(final int n, int p2) {
        adme.K(n != -1);
        p2 = this.p(p2);
        final int[] j = this.j;
        final int[] h = this.h;
        j[n] = h[p2];
        h[p2] = n;
    }
    
    private final void u(final int n, int p2) {
        adme.K(n != -1);
        p2 = this.p(p2);
        final int[] k = this.k;
        final int[] i = this.i;
        k[n] = i[p2];
        i[p2] = n;
    }
    
    private final void v(int c, int i, int n) {
        adme.K(c != -1);
        this.q(c, i);
        this.r(c, n);
        this.w(this.m[c], this.f[c]);
        final int n2 = this.c - 1;
        if (n2 != c) {
            n = this.m[n2];
            i = this.f[n2];
            this.w(n, c);
            this.w(c, i);
            final Object[] a = this.a;
            final Object o = a[n2];
            final Object[] b = this.b;
            final Object o2 = b[n2];
            a[c] = o;
            b[c] = o2;
            i = this.p(aegu.u(o));
            final int[] h = this.h;
            n = h[i];
            if (n == n2) {
                h[i] = c;
            }
            else {
                int n3;
                for (i = this.j[n]; i != n2; i = n3) {
                    n3 = this.j[i];
                    n = i;
                }
                this.j[n] = c;
            }
            final int[] j = this.j;
            j[c] = j[n2];
            j[n2] = -1;
            i = this.p(aegu.u(o2));
            final int[] k = this.i;
            n = k[i];
            if (n == n2) {
                k[i] = c;
            }
            else {
                int n4;
                for (i = this.k[n]; i != n2; i = n4) {
                    n4 = this.k[i];
                    n = i;
                }
                this.k[n] = c;
            }
            final int[] l = this.k;
            l[c] = l[n2];
            l[n2] = -1;
        }
        final Object[] a2 = this.a;
        c = this.c - 1;
        a2[c] = null;
        this.b[c] = null;
        this.c = c;
        ++this.d;
    }
    
    private final void w(final int l, final int e) {
        if (l == -2) {
            this.e = e;
        }
        else {
            this.f[l] = e;
        }
        if (e == -2) {
            this.l = l;
            return;
        }
        this.m[e] = l;
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        for (final Map.Entry<Object, V> entry : this.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }
    
    private static int[] x(final int n) {
        final int[] array = new int[n];
        Arrays.fill(array, -1);
        return array;
    }
    
    private static int[] y(int[] copy, final int n) {
        final int length = copy.length;
        copy = Arrays.copyOf(copy, n);
        Arrays.fill(copy, length, n, -1);
        return copy;
    }
    
    @Override
    public final afdu a() {
        afdu g;
        if ((g = this.g) == null) {
            g = new affl(this);
            this.g = g;
        }
        return g;
    }
    
    final int b(final Object o, int i, final int[] array, final int[] array2, final Object[] array3) {
        for (i = array[this.p(i)]; i != -1; i = array2[i]) {
            if (aexq.c(array3[i], o)) {
                return i;
            }
        }
        return -1;
    }
    
    final int c(final Object o) {
        return this.d(o, aegu.u(o));
    }
    
    @Override
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, null);
        Arrays.fill(this.b, 0, this.c, null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        ++this.d;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.c(o) != -1;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.e(o) != -1;
    }
    
    final int d(final Object o, final int n) {
        return this.b(o, n, this.h, this.j, this.a);
    }
    
    final int e(final Object o) {
        return this.f(o, aegu.u(o));
    }
    
    @Override
    public final Set entrySet() {
        Set p;
        if ((p = this.p) == null) {
            p = new affk(this);
            this.p = p;
        }
        return p;
    }
    
    final int f(final Object o, final int n) {
        return this.b(o, n, this.i, this.k, this.b);
    }
    
    @Override
    public final Object get(final Object o) {
        final int c = this.c(o);
        if (c == -1) {
            return null;
        }
        return this.b[c];
    }
    
    public final Set i() {
        Set o;
        if ((o = this.o) == null) {
            o = new affo(this);
            this.o = o;
        }
        return o;
    }
    
    final void j(final int n) {
        adzw.H(n, "expectedSize");
        final int v = aegu.v(n);
        this.c = 0;
        this.a = new Object[n];
        this.b = new Object[n];
        this.h = x(v);
        this.i = x(v);
        this.j = x(n);
        this.k = x(n);
        this.e = -2;
        this.l = -2;
        this.m = x(n);
        this.f = x(n);
    }
    
    final void k(final int n, final int n2) {
        this.v(n, n2, aegu.u(this.b[n]));
    }
    
    @Override
    public final Set keySet() {
        Set n;
        if ((n = this.n) == null) {
            n = new affn(this);
            this.n = n;
        }
        return n;
    }
    
    final void l(final int n, final int n2) {
        this.v(n, aegu.u(this.a[n]), n2);
    }
    
    final Object m(Object o, final Object o2) {
        final int u = aegu.u(o);
        final int f = this.f(o, u);
        if (f == -1) {
            final int l = this.l;
            final int u2 = aegu.u(o2);
            adme.P(this.d(o2, u2) == -1, "Key already present: %s", o2);
            this.s(this.c + 1);
            final Object[] a = this.a;
            final int c = this.c;
            a[c] = o2;
            this.b[c] = o;
            this.t(c, u2);
            this.u(this.c, u);
            int e;
            if (l == -2) {
                e = this.e;
            }
            else {
                e = this.f[l];
            }
            this.w(l, this.c);
            this.w(this.c, e);
            ++this.c;
            ++this.d;
            return null;
        }
        o = this.a[f];
        if (aexq.c(o, o2)) {
            return o2;
        }
        this.n(f, o2);
        return o;
    }
    
    public final void n(final int n, final Object o) {
        adme.K(n != -1);
        int d = this.d(o, aegu.u(o));
        final int l = this.l;
        if (d == -1) {
            int n2;
            if (l == n) {
                n2 = this.m[n];
            }
            else if ((n2 = l) == this.c) {
                n2 = d;
            }
            if (n == -2) {
                d = this.f[-2];
            }
            else if (this.c != -2) {
                d = -2;
            }
            this.w(this.m[n], this.f[n]);
            this.q(n, aegu.u(this.a[n]));
            this.a[n] = o;
            this.t(n, aegu.u(o));
            this.w(n2, n);
            this.w(n, d);
            return;
        }
        new StringBuilder("Key already present in map: ").append(o);
        throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(o)));
    }
    
    public final void o(final int n, final Object o) {
        adme.K(n != -1);
        final int u = aegu.u(o);
        if (this.f(o, u) == -1) {
            this.r(n, aegu.u(this.b[n]));
            this.b[n] = o;
            this.u(n, u);
            return;
        }
        new StringBuilder("Value already present in map: ").append(o);
        throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(o)));
    }
    
    @Override
    public final Object put(Object o, final Object o2) {
        final int u = aegu.u(o);
        final int d = this.d(o, u);
        if (d != -1) {
            final Object o3 = this.b[d];
            o = o2;
            if (!aexq.c(o3, o2)) {
                this.o(d, o2);
                return o3;
            }
        }
        else {
            final int u2 = aegu.u(o2);
            adme.P(this.f(o2, u2) == -1, "Value already present: %s", o2);
            this.s(this.c + 1);
            final Object[] a = this.a;
            final int c = this.c;
            a[c] = o;
            this.b[c] = o2;
            this.t(c, u);
            this.u(this.c, u2);
            this.w(this.l, this.c);
            this.w(this.c, -2);
            ++this.c;
            ++this.d;
            o = null;
        }
        return o;
    }
    
    @Override
    public final Object remove(Object o) {
        final int u = aegu.u(o);
        final int d = this.d(o, u);
        if (d == -1) {
            return null;
        }
        o = this.b[d];
        this.k(d, u);
        return o;
    }
    
    @Override
    public final int size() {
        return this.c;
    }
    
    @Override
    public final /* bridge */ Collection values() {
        return this.i();
    }
}
