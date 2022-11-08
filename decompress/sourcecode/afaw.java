import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class afaw extends AbstractSet implements Serializable
{
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;
    
    public afaw() {
        this.f(3);
    }
    
    private final int h() {
        return (1 << (this.b & 0x1F)) - 1;
    }
    
    private final int i(final int n, int i, int j, int n2) {
        final Object ap = ahbz.ap(i);
        final int n3 = i - 1;
        if (n2 != 0) {
            ahbz.ar(ap, j & n3, n2 + 1);
        }
        final Object k = this.j();
        final int[] l = this.l();
        int n4;
        int n5;
        int n6;
        int an;
        for (i = 0; i <= n; ++i) {
            for (j = ahbz.an(k, i); j != 0; j = (n5 & n)) {
                n4 = j - 1;
                n5 = l[n4];
                n6 = (ahbz.aj(n5, n) | i);
                n2 = (n6 & n3);
                an = ahbz.an(ap, n2);
                ahbz.ar(ap, n2, j);
                l[n4] = ahbz.ak(n6, an, n3);
            }
        }
        this.c = ap;
        this.k(n3);
        return n3;
    }
    
    private final Object j() {
        final Object c = this.c;
        c.getClass();
        return c;
    }
    
    private final void k(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.b = ahbz.ak(this.b, 32 - numberOfLeadingZeros, 31);
    }
    
    private final int[] l() {
        final int[] d = this.d;
        d.getClass();
        return d;
    }
    
    private final Object[] m() {
        final Object[] a = this.a;
        a.getClass();
        return a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            this.f(int1);
            for (int i = 0; i < int1; ++i) {
                this.add(objectInputStream.readObject());
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Invalid size: ");
        sb.append(int1);
        throw new InvalidObjectException(sb.toString());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            objectOutputStream.writeObject(iterator.next());
        }
    }
    
    final int a() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }
    
    @Override
    public final boolean add(final Object o) {
        if (this.g()) {
            agot.E(this.g(), (Object)"Arrays already allocated");
            final int b = this.b;
            final int ao = ahbz.ao(b);
            this.c = ahbz.ap(ao);
            this.k(ao - 1);
            this.d = new int[b];
            this.a = new Object[b];
        }
        final Set d = this.d();
        if (d != null) {
            return d.add(o);
        }
        final int[] l = this.l();
        final Object[] m = this.m();
        final int e = this.e;
        final int e2 = e + 1;
        final int ah = ahbz.ah(o);
        final int h = this.h();
        final int n = ah & h;
        int an = ahbz.an(this.j(), n);
        int n2;
        if (an == 0) {
            if (e2 > h) {
                n2 = this.i(h, ahbz.al(h), ah, e);
            }
            else {
                ahbz.ar(this.j(), n, e2);
                n2 = h;
            }
        }
        else {
            final int aj = ahbz.aj(ah, h);
            int n3 = 0;
            while (true) {
                final int n4 = an - 1;
                final int n5 = l[n4];
                if (ahbz.aj(n5, h) == aj && aeda.v(o, m[n4])) {
                    return false;
                }
                an = (n5 & h);
                ++n3;
                if (an != 0) {
                    continue;
                }
                if (n3 >= 9) {
                    final LinkedHashSet c = new LinkedHashSet(this.h() + 1, 1.0f);
                    for (int i = this.a(); i >= 0; i = this.b(i)) {
                        c.add(this.c(i));
                    }
                    this.c = c;
                    this.d = null;
                    this.a = null;
                    this.e();
                    return c.add(o);
                }
                if (e2 > h) {
                    n2 = this.i(h, ahbz.al(h), ah, e);
                    break;
                }
                l[n4] = ahbz.ak(n5, e2, h);
                n2 = h;
                break;
            }
        }
        final int length = this.l().length;
        if (e2 > length) {
            final int min = Math.min(1073741823, Math.max(1, length >>> 1) + length | 0x1);
            if (min != length) {
                this.d = Arrays.copyOf(this.l(), min);
                this.a = Arrays.copyOf(this.m(), min);
            }
        }
        this.l()[e] = ahbz.ak(ah, 0, n2);
        this.m()[e] = o;
        this.e = e2;
        this.e();
        return true;
    }
    
    final int b(int n) {
        if (++n < this.e) {
            return n;
        }
        return -1;
    }
    
    public final Object c(final int n) {
        return this.m()[n];
    }
    
    @Override
    public final void clear() {
        if (this.g()) {
            return;
        }
        this.e();
        final Set d = this.d();
        if (d != null) {
            this.b = aesy.x(this.size(), 3, 1073741823);
            d.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(this.m(), 0, this.e, null);
        ahbz.aq(this.j());
        Arrays.fill(this.l(), 0, this.e, 0);
        this.e = 0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (this.g()) {
            return false;
        }
        final Set d = this.d();
        if (d != null) {
            return d.contains(o);
        }
        final int ah = ahbz.ah(o);
        final int h = this.h();
        int an = ahbz.an(this.j(), ah & h);
        if (an == 0) {
            return false;
        }
        final int aj = ahbz.aj(ah, h);
        int n;
        do {
            final int n2 = an - 1;
            n = this.l()[n2];
            if (ahbz.aj(n, h) == aj && aeda.v(o, this.c(n2))) {
                return true;
            }
        } while ((an = (n & h)) != 0);
        return false;
    }
    
    final Set d() {
        final Object c = this.c;
        if (c instanceof Set) {
            return (Set)c;
        }
        return null;
    }
    
    final void e() {
        this.b += 32;
    }
    
    final void f(final int n) {
        agot.v(true, (Object)"Expected size must be >= 0");
        this.b = aesy.x(n, 1, 1073741823);
    }
    
    final boolean g() {
        return this.c == null;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final Iterator iterator() {
        final Set d = this.d();
        if (d != null) {
            return d.iterator();
        }
        return new afav(this);
    }
    
    @Override
    public final boolean remove(final Object o) {
        if (this.g()) {
            return false;
        }
        final Set d = this.d();
        if (d != null) {
            return d.remove(o);
        }
        final int h = this.h();
        final int am = ahbz.am(o, null, h, this.j(), this.l(), this.m(), null);
        if (am != -1) {
            final Object j = this.j();
            final int[] l = this.l();
            final Object[] m = this.m();
            final int n = this.size() - 1;
            if (am < n) {
                final Object o2 = m[n];
                m[am] = o2;
                m[n] = null;
                l[am] = l[n];
                l[n] = 0;
                final int n2 = ahbz.ah(o2) & h;
                final int an = ahbz.an(j, n2);
                final int n3 = n + 1;
                int n4;
                if ((n4 = an) == n3) {
                    ahbz.ar(j, n2, am + 1);
                }
                else {
                    int n5;
                    int n6;
                    do {
                        n5 = n4 - 1;
                        n6 = l[n5];
                        n4 = (n6 & h);
                    } while (n4 != n3);
                    l[n5] = ahbz.ak(n6, am + 1, h);
                }
            }
            else {
                m[am] = null;
                l[am] = 0;
            }
            --this.e;
            this.e();
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        final Set d = this.d();
        int n;
        if (d != null) {
            n = d.size();
        }
        else {
            n = this.e;
        }
        return n;
    }
    
    @Override
    public final Object[] toArray() {
        if (this.g()) {
            return new Object[0];
        }
        final Set d = this.d();
        Object[] array;
        if (d != null) {
            array = d.toArray();
        }
        else {
            array = Arrays.copyOf(this.m(), this.e);
        }
        return array;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        if (this.g()) {
            if (array.length > 0) {
                array[0] = null;
            }
            return array;
        }
        final Set d = this.d();
        Object[] array2;
        if (d != null) {
            array2 = d.toArray(array);
        }
        else {
            final Object[] m = this.m();
            final int e = this.e;
            agot.C(0, e, m.length);
            final int length = array.length;
            if (length < e) {
                array2 = ajox.G(array, e);
            }
            else {
                array2 = array;
                if (length > e) {
                    array[e] = null;
                    array2 = array;
                }
            }
            System.arraycopy(m, 0, array2, 0, e);
        }
        return array2;
    }
}
