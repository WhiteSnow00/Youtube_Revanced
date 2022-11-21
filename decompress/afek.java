import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;
import java.io.Serializable;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class afek extends AbstractMap implements Serializable
{
    public static final Object a;
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;
    
    static {
        a = new Object();
    }
    
    public afek() {
        this.n(3);
    }
    
    public afek(final int n) {
        this.n(n);
    }
    
    public static afek e() {
        return new afek();
    }
    
    public static afek f(final int n) {
        return new afek(n);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            this.n(int1);
            for (int i = 0; i < int1; ++i) {
                this.put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Invalid size: ");
        sb.append(int1);
        throw new InvalidObjectException(sb.toString());
    }
    
    private final int u(final int n, int i, int j, int n2) {
        final int n3 = i - 1;
        final Object c = aegu.C(i);
        if (n2 != 0) {
            aegu.E(c, j & n3, n2 + 1);
        }
        final Object k = this.i();
        final int[] r = this.r();
        int n4;
        int n5;
        int n6;
        int a;
        for (i = 0; i <= n; ++i) {
            for (j = aegu.A(k, i); j != 0; j = (n2 & n)) {
                n4 = j - 1;
                n2 = r[n4];
                n5 = (aegu.w(n2, n) | i);
                n6 = (n5 & n3);
                a = aegu.A(c, n6);
                aegu.E(c, n6, j);
                r[n4] = aegu.x(n5, a, n3);
            }
        }
        this.g = c;
        this.v(n3);
        return n3;
    }
    
    private final void v(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.e = aegu.x(this.e, 32 - numberOfLeadingZeros, 31);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        final Iterator k = this.k();
        while (k.hasNext()) {
            final Map.Entry<Object, V> entry = k.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }
    
    final int a() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }
    
    final int b(int n) {
        if (++n < this.f) {
            return n;
        }
        return -1;
    }
    
    public final int c() {
        return (1 << (this.e & 0x1F)) - 1;
    }
    
    @Override
    public final void clear() {
        if (this.q()) {
            return;
        }
        this.m();
        final Map l = this.l();
        if (l != null) {
            this.e = afxr.C(this.size(), 3, 1073741823);
            l.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(this.s(), 0, this.f, null);
        Arrays.fill(this.t(), 0, this.f, null);
        aegu.D(this.i());
        Arrays.fill(this.r(), 0, this.f, 0);
        this.f = 0;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Map l = this.l();
        boolean containsKey;
        if (l != null) {
            containsKey = l.containsKey(o);
        }
        else {
            if (this.d(o) != -1) {
                return true;
            }
            containsKey = false;
        }
        return containsKey;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        final Map l = this.l();
        if (l == null) {
            for (int i = 0; i < this.f; ++i) {
                if (aexq.c(o, this.j(i))) {
                    return true;
                }
            }
            return false;
        }
        return l.containsValue(o);
    }
    
    public final int d(final Object o) {
        if (this.q()) {
            return -1;
        }
        final int u = aegu.u(o);
        final int c = this.c();
        int a = aegu.A(this.i(), u & c);
        if (a == 0) {
            return -1;
        }
        final int w = aegu.w(u, c);
        int n;
        do {
            --a;
            n = this.r()[a];
            if (aegu.w(n, c) == w && aexq.c(o, this.g(a))) {
                return a;
            }
        } while ((a = (n & c)) != 0);
        return -1;
    }
    
    @Override
    public final Set entrySet() {
        Set i;
        if ((i = this.i) == null) {
            i = new afef(this);
            this.i = i;
        }
        return i;
    }
    
    public final Object g(final int n) {
        return this.s()[n];
    }
    
    @Override
    public final Object get(final Object o) {
        final Map l = this.l();
        if (l != null) {
            return l.get(o);
        }
        final int d = this.d(o);
        if (d == -1) {
            return null;
        }
        return this.j(d);
    }
    
    public final Object h(Object j) {
        if (this.q()) {
            return afek.a;
        }
        final int c = this.c();
        final int z = aegu.z(j, null, c, this.i(), this.r(), this.s(), null);
        if (z == -1) {
            return afek.a;
        }
        j = this.j(z);
        this.o(z, c);
        --this.f;
        this.m();
        return j;
    }
    
    public final Object i() {
        final Object g = this.g;
        g.getClass();
        return g;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    public final Object j(final int n) {
        return this.t()[n];
    }
    
    final Iterator k() {
        final Map l = this.l();
        if (l != null) {
            return l.entrySet().iterator();
        }
        return new afed(this);
    }
    
    @Override
    public final Set keySet() {
        Set h;
        if ((h = this.h) == null) {
            h = new afeh(this);
            this.h = h;
        }
        return h;
    }
    
    final Map l() {
        final Object g = this.g;
        if (g instanceof Map) {
            return (Map)g;
        }
        return null;
    }
    
    final void m() {
        this.e += 32;
    }
    
    final void n(final int n) {
        adme.L(true, "Expected size must be >= 0");
        this.e = afxr.C(n, 1, 1073741823);
    }
    
    final void o(final int n, final int n2) {
        final Object i = this.i();
        final int[] r = this.r();
        final Object[] s = this.s();
        final Object[] t = this.t();
        int n3 = this.size() - 1;
        if (n >= n3) {
            t[n] = (s[n] = null);
            r[n] = 0;
            return;
        }
        final Object o = s[n3];
        s[n] = o;
        t[n] = t[n3];
        t[n3] = (s[n3] = null);
        r[n] = r[n3];
        r[n3] = 0;
        final int n4 = aegu.u(o) & n2;
        int a = aegu.A(i, n4);
        ++n3;
        if (a != n3) {
            int n5;
            int n6;
            do {
                n5 = a - 1;
                n6 = r[n5];
                a = (n6 & n2);
            } while (a != n3);
            r[n5] = aegu.x(n6, n + 1, n2);
            return;
        }
        aegu.E(i, n4, n + 1);
    }
    
    public final void p(final int n, final Object o) {
        this.t()[n] = o;
    }
    
    @Override
    public final Object put(Object o, final Object o2) {
        if (this.q()) {
            adme.U(this.q(), "Arrays already allocated");
            final int e = this.e;
            final int b = aegu.B(e);
            this.g = aegu.C(b);
            this.v(b - 1);
            this.b = new int[e];
            this.c = new Object[e];
            this.d = new Object[e];
        }
        final Map l = this.l();
        if (l != null) {
            return l.put(o, o2);
        }
        final int[] r = this.r();
        final Object[] s = this.s();
        final Object[] t = this.t();
        final int f = this.f;
        final int f2 = f + 1;
        final int u = aegu.u(o);
        final int c = this.c();
        final int n = u & c;
        int a = aegu.A(this.i(), n);
        int n2;
        if (a == 0) {
            if (f2 > c) {
                n2 = this.u(c, aegu.y(c), u, f);
            }
            else {
                aegu.E(this.i(), n, f2);
                n2 = c;
            }
        }
        else {
            final int w = aegu.w(u, c);
            int n3 = 0;
            while (true) {
                final int n4 = a - 1;
                final int n5 = r[n4];
                if (aegu.w(n5, c) == w && aexq.c(o, s[n4])) {
                    o = t[n4];
                    t[n4] = o2;
                    return o;
                }
                a = (n5 & c);
                ++n3;
                if (a != 0) {
                    continue;
                }
                if (n3 >= 9) {
                    final LinkedHashMap g = new LinkedHashMap(this.c() + 1, 1.0f);
                    for (int i = this.a(); i >= 0; i = this.b(i)) {
                        g.put(this.g(i), this.j(i));
                    }
                    this.g = g;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.m();
                    return g.put(o, o2);
                }
                if (f2 > c) {
                    n2 = this.u(c, aegu.y(c), u, f);
                    break;
                }
                r[n4] = aegu.x(n5, f2, c);
                n2 = c;
                break;
            }
        }
        final int length = this.r().length;
        if (f2 > length) {
            final int min = Math.min(1073741823, Math.max(1, length >>> 1) + length | 0x1);
            if (min != length) {
                this.b = Arrays.copyOf(this.r(), min);
                this.c = Arrays.copyOf(this.s(), min);
                this.d = Arrays.copyOf(this.t(), min);
            }
        }
        this.r()[f] = aegu.x(u, 0, n2);
        this.s()[f] = o;
        this.p(f, o2);
        this.f = f2;
        this.m();
        return null;
    }
    
    final boolean q() {
        return this.g == null;
    }
    
    public final int[] r() {
        final int[] b = this.b;
        b.getClass();
        return b;
    }
    
    @Override
    public final Object remove(Object h) {
        final Map l = this.l();
        if (l != null) {
            return l.remove(h);
        }
        if ((h = this.h(h)) == afek.a) {
            h = null;
        }
        return h;
    }
    
    public final Object[] s() {
        final Object[] c = this.c;
        c.getClass();
        return c;
    }
    
    @Override
    public final int size() {
        final Map l = this.l();
        int n;
        if (l != null) {
            n = l.size();
        }
        else {
            n = this.f;
        }
        return n;
    }
    
    public final Object[] t() {
        final Object[] d = this.d;
        d.getClass();
        return d;
    }
    
    @Override
    public final Collection values() {
        Collection j;
        if ((j = this.j) == null) {
            j = new afej(this);
            this.j = j;
        }
        return j;
    }
}
