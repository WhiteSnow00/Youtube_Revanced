import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.SortedSet;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afhk extends affy implements Set
{
    private transient afgh a;
    
    static int d(int highestOneBit) {
        final int max = Math.max(highestOneBit, 2);
        if (max < 751619276) {
            highestOneBit = Integer.highestOneBit(max - 1);
            double n;
            do {
                highestOneBit += highestOneBit;
                n = highestOneBit;
                Double.isNaN(n);
            } while (n * 0.7 < max);
            return highestOneBit;
        }
        adme.L(max < 1073741824, "collection too large");
        return 1073741824;
    }
    
    public static afhi i() {
        return new afhi();
    }
    
    public static afhi j(final int n) {
        adzw.H(n, "expectedSize");
        return new afhi(n);
    }
    
    public static afhk n(int n, final Object... array) {
        if (n == 0) {
            return (afhk)afkg.a;
        }
        if (n == 1) {
            final Object o = array[0];
            o.getClass();
            return s(o);
        }
        final int d = d(n);
        final Object[] array2 = new Object[d];
        final int n2 = d - 1;
        int i = 0;
        int n3 = 0;
        int n4 = 0;
        while (i < n) {
            final Object o2 = array[i];
            aewr.j(o2, i);
            final int hashCode = o2.hashCode();
            int t = aegu.t(hashCode);
            int n6;
            int n7;
            while (true) {
                final int n5 = t & n2;
                final Object o3 = array2[n5];
                if (o3 == null) {
                    array2[n5] = (array[n4] = o2);
                    n6 = n3 + hashCode;
                    n7 = n4 + 1;
                    break;
                }
                n6 = n3;
                n7 = n4;
                if (o3.equals(o2)) {
                    break;
                }
                ++t;
            }
            ++i;
            n3 = n6;
            n4 = n7;
        }
        Arrays.fill(array, n4, n, null);
        if (n4 == 1) {
            final Object o4 = array[0];
            o4.getClass();
            return (afhk)new afkw(o4);
        }
        n = d / 2;
        if (d(n4) < n) {
            return n(n4, array);
        }
        Object[] copy = array;
        if (y(n4, array.length)) {
            copy = Arrays.copyOf(array, n4);
        }
        return (afhk)new afkg(copy, n3, array2, n2, n4);
    }
    
    public static afhk o(final Iterable iterable) {
        Object o;
        if (iterable instanceof Collection) {
            o = p((Collection)iterable);
        }
        else {
            final Iterator iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                o = afkg.a;
            }
            else {
                final Object next = iterator.next();
                if (!iterator.hasNext()) {
                    o = s(next);
                }
                else {
                    final afhi afhi = new afhi();
                    afhi.h(next);
                    afhi.k(iterator);
                    o = afhi.g();
                }
            }
        }
        return (afhk)o;
    }
    
    public static afhk p(final Collection collection) {
        if (collection instanceof afhk && !(collection instanceof SortedSet)) {
            final afhk afhk = (afhk)collection;
            if (!afhk.l()) {
                return afhk;
            }
        }
        final Object[] array = collection.toArray();
        return n(array.length, array);
    }
    
    public static afhk q(final Object[] array) {
        final int length = array.length;
        if (length == 0) {
            return (afhk)afkg.a;
        }
        if (length != 1) {
            return n(length, (Object[])array.clone());
        }
        return s(array[0]);
    }
    
    public static afhk r() {
        return (afhk)afkg.a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public static afhk s(final Object o) {
        return (afhk)new afkw(o);
    }
    
    public static afhk t(final Object o, final Object o2) {
        return n(2, o, o2);
    }
    
    public static afhk u(final Object o, final Object o2, final Object o3) {
        return n(3, o, o2, o3);
    }
    
    public static afhk v(final Object o, final Object o2, final Object o3, final Object o4) {
        return n(4, o, o2, o3, o4);
    }
    
    public static afhk w(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return n(5, o, o2, o3, o4, o5);
    }
    
    @SafeVarargs
    public static afhk x(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object... array) {
        adme.L(true, "the total number of elements must fit in an int");
        final int length = array.length;
        final int n = length + 6;
        final Object[] array2 = new Object[n];
        array2[0] = o;
        array2[1] = o2;
        array2[2] = o3;
        array2[3] = o4;
        array2[4] = o5;
        array2[5] = o6;
        System.arraycopy(array, 0, array2, 6, length);
        return n(n, array2);
    }
    
    public static boolean y(final int n, final int n2) {
        return n < (n2 >> 1) + (n2 >> 2);
    }
    
    public boolean a() {
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || ((!(o instanceof afhk) || !this.a() || !((afhk)o).a() || this.hashCode() == o.hashCode()) && agra.P((Set)this, o));
    }
    
    @Override
    public afgh g() {
        afgh a;
        if ((a = this.a) == null) {
            a = this.h();
            this.a = a;
        }
        return a;
    }
    
    public afgh h() {
        return afgh.i(this.toArray());
    }
    
    @Override
    public int hashCode() {
        return agra.F((Set)this);
    }
    
    @Override
    public /* bridge */ Iterator iterator() {
        return (Iterator)this.k();
    }
    
    @Override
    public abstract aflu k();
    
    @Override
    Object writeReplace() {
        return new afhj(this.toArray());
    }
}
