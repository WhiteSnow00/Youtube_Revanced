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

final class afau extends AbstractMap implements Serializable
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
    
    public afau() {
        this.n(3);
    }
    
    public afau(final int n) {
        this.n(n);
    }
    
    public static afau e() {
        return new afau();
    }
    
    public static afau f(final int n) {
        return new afau(n);
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
        final Object ap = ahbz.ap(i);
        final int n3 = i - 1;
        if (n2 != 0) {
            ahbz.ar(ap, j & n3, n2 + 1);
        }
        final Object k = this.i();
        final int[] r = this.r();
        int n4;
        int n5;
        int n6;
        int an;
        for (i = 0; i <= n; ++i) {
            for (j = ahbz.an(k, i); j != 0; j = (n4 & n)) {
                n2 = j - 1;
                n4 = r[n2];
                n5 = (ahbz.aj(n4, n) | i);
                n6 = (n5 & n3);
                an = ahbz.an(ap, n6);
                ahbz.ar(ap, n6, j);
                r[n2] = ahbz.ak(n5, an, n3);
            }
        }
        this.g = ap;
        this.v(n3);
        return n3;
    }
    
    private final void v(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.e = ahbz.ak(this.e, 32 - numberOfLeadingZeros, 31);
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
            this.e = aesy.x(this.size(), 3, 1073741823);
            l.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(this.s(), 0, this.f, null);
        Arrays.fill(this.t(), 0, this.f, null);
        ahbz.aq(this.i());
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
                if (aeda.v(o, this.j(i))) {
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
        final int ah = ahbz.ah(o);
        final int c = this.c();
        int an = ahbz.an(this.i(), ah & c);
        if (an == 0) {
            return -1;
        }
        final int aj = ahbz.aj(ah, c);
        int n;
        do {
            final int n2 = an - 1;
            n = this.r()[n2];
            if (ahbz.aj(n, c) == aj && aeda.v(o, this.g(n2))) {
                return n2;
            }
        } while ((an = (n & c)) != 0);
        return -1;
    }
    
    @Override
    public final Set entrySet() {
        Set i;
        if ((i = this.i) == null) {
            i = new afap(this);
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
            return afau.a;
        }
        final int c = this.c();
        final int am = ahbz.am(j, null, c, this.i(), this.r(), this.s(), null);
        if (am == -1) {
            return afau.a;
        }
        j = this.j(am);
        this.o(am, c);
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
        return (Iterator)new afan(this);
    }
    
    @Override
    public final Set keySet() {
        Set h;
        if ((h = this.h) == null) {
            h = new afar(this);
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
        agot.v(true, (Object)"Expected size must be >= 0");
        this.e = aesy.x(n, 1, 1073741823);
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
        final int n4 = ahbz.ah(o) & n2;
        int an = ahbz.an(i, n4);
        ++n3;
        if (an != n3) {
            int n5;
            int n6;
            do {
                n5 = an - 1;
                n6 = r[n5];
                an = (n6 & n2);
            } while (an != n3);
            r[n5] = ahbz.ak(n6, n + 1, n2);
            return;
        }
        ahbz.ar(i, n4, n + 1);
    }
    
    public final void p(final int n, final Object o) {
        this.t()[n] = o;
    }
    
    @Override
    public final Object put(Object o, final Object o2) {
        if (this.q()) {
            agot.E(this.q(), (Object)"Arrays already allocated");
            final int e = this.e;
            final int ao = ahbz.ao(e);
            this.g = ahbz.ap(ao);
            this.v(ao - 1);
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
        final int ah = ahbz.ah(o);
        final int c = this.c();
        final int n = ah & c;
        int an = ahbz.an(this.i(), n);
        int n2;
        if (an == 0) {
            if (f2 > c) {
                n2 = this.u(c, ahbz.al(c), ah, f);
            }
            else {
                ahbz.ar(this.i(), n, f2);
                n2 = c;
            }
        }
        else {
            final int aj = ahbz.aj(ah, c);
            int n3 = 0;
            while (true) {
                final int n4 = an - 1;
                final int n5 = r[n4];
                if (ahbz.aj(n5, c) == aj && aeda.v(o, s[n4])) {
                    o = t[n4];
                    t[n4] = o2;
                    return o;
                }
                an = (n5 & c);
                ++n3;
                if (an != 0) {
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
                    n2 = this.u(c, ahbz.al(c), ah, f);
                    break;
                }
                r[n4] = ahbz.ak(n5, f2, c);
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
        this.r()[f] = ahbz.ak(ah, 0, n2);
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
        if ((h = this.h(h)) == afau.a) {
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
            j = new afat(this);
            this.j = j;
        }
        return j;
    }
}
