import java.util.ListIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afgh extends affy implements List, RandomAccess
{
    private static final aflv a;
    
    static {
        a = new afgd(afjx.a, 0);
    }
    
    @SafeVarargs
    public static afgh A(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object... array) {
        adme.L(true, "the total number of elements must fit in an int");
        final int length = array.length;
        final Object[] array2 = new Object[length + 12];
        array2[0] = o;
        array2[1] = o2;
        array2[2] = o3;
        array2[3] = o4;
        array2[4] = o5;
        array2[5] = o6;
        array2[6] = o7;
        array2[7] = o8;
        array2[8] = o9;
        array2[9] = o10;
        array2[10] = o11;
        array2[11] = o12;
        System.arraycopy(array, 0, array2, 12, length);
        return F(array2);
    }
    
    public static afgh B(final Iterable iterable) {
        final Comparable[] array = (Comparable[])agpx.at(iterable, new Comparable[0]);
        aewr.k((Object[])array);
        Arrays.sort(array);
        return i(array);
    }
    
    public static afgh C(final Comparator comparator, final Iterable iterable) {
        comparator.getClass();
        final Object[] ar = agpx.ar(iterable);
        aewr.k(ar);
        Arrays.sort(ar, comparator);
        return i(ar);
    }
    
    private static afgh F(final Object... array) {
        aewr.k(array);
        return i(array);
    }
    
    public static afgc d() {
        return new afgc();
    }
    
    public static afgc h(final int n) {
        adzw.H(n, "expectedSize");
        return new afgc(n);
    }
    
    static afgh i(final Object[] array) {
        return j(array, array.length);
    }
    
    static afgh j(final Object[] array, final int n) {
        if (n == 0) {
            return afjx.a;
        }
        return (afgh)new afjx(array, n);
    }
    
    public static afgh n(final Iterable iterable) {
        iterable.getClass();
        afgh afgh;
        if (iterable instanceof Collection) {
            afgh = o((Collection)iterable);
        }
        else {
            final Iterator iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                afgh = afjx.a;
            }
            else {
                final Object next = iterator.next();
                if (!iterator.hasNext()) {
                    afgh = r(next);
                }
                else {
                    final afgc afgc = new afgc();
                    afgc.h(next);
                    afgc.k(iterator);
                    afgh = afgc.g();
                }
            }
        }
        return afgh;
    }
    
    public static afgh o(final Collection collection) {
        if (collection instanceof affy) {
            afgh afgh2;
            final afgh afgh = afgh2 = ((affy)collection).g();
            if (afgh.l()) {
                afgh2 = i(afgh.toArray());
            }
            return afgh2;
        }
        return F(collection.toArray());
    }
    
    public static afgh p(final Object[] array) {
        afgh afgh;
        if (array.length == 0) {
            afgh = afjx.a;
        }
        else {
            afgh = F((Object[])array.clone());
        }
        return afgh;
    }
    
    public static afgh q() {
        return afjx.a;
    }
    
    public static afgh r(final Object o) {
        return F(o);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public static afgh s(final Object o, final Object o2) {
        return F(o, o2);
    }
    
    public static afgh t(final Object o, final Object o2, final Object o3) {
        return F(o, o2, o3);
    }
    
    public static afgh u(final Object o, final Object o2, final Object o3, final Object o4) {
        return F(o, o2, o3, o4);
    }
    
    public static afgh v(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return F(o, o2, o3, o4, o5);
    }
    
    public static afgh w(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
        return F(o, o2, o3, o4, o5, o6);
    }
    
    public static afgh x(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7) {
        return F(o, o2, o3, o4, o5, o6, o7);
    }
    
    public static afgh y(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8) {
        return F(o, o2, o3, o4, o5, o6, o7, o8);
    }
    
    public static afgh z(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10) {
        return F(o, o2, o3, o4, o5, o6, o7, o8, o9, o10);
    }
    
    public final aflv D() {
        return this.E(0);
    }
    
    public final aflv E(final int n) {
        adme.ac(n, this.size());
        if (this.isEmpty()) {
            return afgh.a;
        }
        return new afgd(this, n);
    }
    
    public afgh a() {
        if (this.size() <= 1) {
            return this;
        }
        return new afge(this);
    }
    
    @Deprecated
    @Override
    public final void add(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public afgh b(final int n, int n2) {
        adme.S(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return afjx.a;
        }
        return new afgg(this, n, n2);
    }
    
    @Override
    public int c(final Object[] array, final int n) {
        final int size = this.size();
        for (int i = 0; i < size; ++i) {
            array[n + i] = this.get(i);
        }
        return n + size;
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return agpx.T(this, o);
    }
    
    @Deprecated
    @Override
    public final afgh g() {
        return this;
    }
    
    @Override
    public final int hashCode() {
        final int size = this.size();
        int i = 0;
        int n = 1;
        while (i < size) {
            n = n * 31 + this.get(i).hashCode();
            ++i;
        }
        return n;
    }
    
    @Override
    public int indexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        final int size = this.size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)this.D();
    }
    
    @Override
    public final aflu k() {
        return (aflu)this.D();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        int n2 = this.size() - 1;
        int n3;
        while (true) {
            n3 = n;
            if (n2 < 0) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            --n2;
        }
        return n3;
    }
    
    @Override
    public final /* bridge */ ListIterator listIterator() {
        return (ListIterator)this.D();
    }
    
    @Override
    public final /* bridge */ ListIterator listIterator(final int n) {
        return (ListIterator)this.E(n);
    }
    
    @Deprecated
    @Override
    public final Object remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final Object set(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public /* bridge */ List subList(final int n, final int n2) {
        return this.b(n, n2);
    }
    
    @Override
    Object writeReplace() {
        return new afgf(this.toArray());
    }
}
