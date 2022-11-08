import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgr extends afea
{
    static final afgr c;
    final transient afcr d;
    
    static {
        c = new afgr(afcr.q(), (Comparator)affw.a);
    }
    
    public afgr(final afcr d, final Comparator comparator) {
        super(comparator);
        this.d = d;
    }
    
    public final afea B(final Object o, final boolean b) {
        return this.K(0, this.I(o, b));
    }
    
    public final afea D(final Object o, final boolean b, final Object o2, final boolean b2) {
        return this.F(o, b).B(o2, b2);
    }
    
    public final afea F(final Object o, final boolean b) {
        return this.K(this.J(o, b), this.size());
    }
    
    public final afie H() {
        return (afie)this.d.a().D();
    }
    
    final int I(final Object o, final boolean b) {
        final afcr d = this.d;
        o.getClass();
        final int binarySearch = Collections.binarySearch((List<?>)d, o, super.a);
        if (binarySearch >= 0) {
            int n = binarySearch;
            if (b) {
                n = binarySearch + 1;
            }
            return n;
        }
        return ~binarySearch;
    }
    
    final int J(final Object o, final boolean b) {
        final afcr d = this.d;
        o.getClass();
        final int binarySearch = Collections.binarySearch((List<?>)d, o, super.a);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (b) {
            return binarySearch;
        }
        return binarySearch + 1;
    }
    
    final afgr K(final int n, final int n2) {
        int n3 = n;
        if (n == 0) {
            if (n2 == this.size()) {
                return this;
            }
            n3 = 0;
        }
        if (n3 < n2) {
            return new afgr(this.d.b(n3, n2), this.a);
        }
        return G(this.a);
    }
    
    public final int c(final Object[] array, final int n) {
        return ((afci)this.d).c(array, n);
    }
    
    public final Object ceiling(final Object o) {
        final int j = this.J(o, true);
        if (j == this.size()) {
            return null;
        }
        return this.d.get(j);
    }
    
    public final boolean contains(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            if (Collections.binarySearch((List<?>)this.d, o, this.a) >= 0) {
                return true;
            }
            return false;
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    public final boolean containsAll(final Collection collection) {
        Collection i = collection;
        if (collection instanceof affr) {
            i = ((affr)collection).i();
        }
        Label_0146: {
            if (!aesy.h(super.a, (Iterable)i) || i.size() <= 1) {
                break Label_0146;
            }
            final afie k = this.k();
            final Iterator iterator = i.iterator();
            if (!((Iterator)k).hasNext()) {
                return false;
            }
            Object o = iterator.next();
            Object o2 = ((Iterator)k).next();
            try {
                while (true) {
                    final int b = this.b(o2, o);
                    if (b < 0) {
                        if (!((Iterator)k).hasNext()) {
                            return false;
                        }
                        o2 = ((Iterator)k).next();
                    }
                    else {
                        if (b != 0) {
                            return false;
                        }
                        if (!iterator.hasNext()) {
                            return true;
                        }
                        o = iterator.next();
                    }
                }
                return super.containsAll(i);
            }
            catch (final NullPointerException | ClassCastException ex) {
                return false;
            }
        }
    }
    
    public final int e() {
        return ((afci)this.d).e();
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.size() != set.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        if (aesy.h(this.a, (Iterable)set)) {
            final Iterator iterator = set.iterator();
            try {
                final afie k = this.k();
                while (((Iterator)k).hasNext()) {
                    final Object next = ((Iterator)k).next();
                    final Object next2 = iterator.next();
                    if (next2 == null || this.b(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            }
            catch (final ClassCastException | NoSuchElementException ex) {
                return false;
            }
        }
        return this.containsAll(set);
    }
    
    public final int f() {
        return ((afci)this.d).f();
    }
    
    public final Object first() {
        if (!this.isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }
    
    public final Object floor(final Object o) {
        final int n = this.I(o, true) - 1;
        if (n == -1) {
            return null;
        }
        return this.d.get(n);
    }
    
    public final afcr g() {
        return this.d;
    }
    
    public final Object higher(final Object o) {
        final int j = this.J(o, false);
        if (j == this.size()) {
            return null;
        }
        return this.d.get(j);
    }
    
    public final afie k() {
        return (afie)this.d.D();
    }
    
    public final boolean l() {
        return this.d.l();
    }
    
    public final Object last() {
        if (!this.isEmpty()) {
            return this.d.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }
    
    public final Object lower(final Object o) {
        final int n = this.I(o, false) - 1;
        if (n == -1) {
            return null;
        }
        return this.d.get(n);
    }
    
    public final Object[] m() {
        return ((afci)this.d).m();
    }
    
    public final int size() {
        return this.d.size();
    }
    
    public final afea z() {
        final Comparator<Object> reverseOrder = Collections.reverseOrder((Comparator<Object>)this.a);
        afgr g;
        if (this.isEmpty()) {
            g = G((Comparator)reverseOrder);
        }
        else {
            g = new afgr(this.d.a(), reverseOrder);
        }
        return g;
    }
}
