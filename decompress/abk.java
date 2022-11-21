import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abk implements Collection, Set
{
    Object[] a;
    public int b;
    private int[] c;
    
    public abk() {
        this(0);
    }
    
    public abk(final int n) {
        if (n == 0) {
            this.c = abr.a;
            this.a = abr.c;
        }
        else {
            this.h(n);
        }
        this.b = 0;
    }
    
    public abk(final abk abk) {
        this();
        final int b = abk.b;
        this.c(this.b + b);
        final int b2 = this.b;
        int i = 0;
        if (b2 == 0) {
            if (b > 0) {
                System.arraycopy(abk.c, 0, this.c, 0, b);
                System.arraycopy(abk.a, 0, this.a, 0, b);
                if (this.b == 0) {
                    this.b = b;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }
        else {
            while (i < b) {
                this.add(abk.b(i));
                ++i;
            }
        }
    }
    
    public abk(final Collection collection) {
        this();
        if (collection != null) {
            this.addAll(collection);
        }
    }
    
    private final int e(int a) {
        try {
            a = abr.a(this.c, this.b, a);
            return a;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    private final int f(final Object o, final int n) {
        final int b = this.b;
        if (b == 0) {
            return -1;
        }
        int e = this.e(n);
        if (e < 0) {
            return e;
        }
        if (o.equals(this.a[e])) {
            return e;
        }
        int n2;
        for (n2 = e + 1; n2 < b && this.c[n2] == n; ++n2) {
            if (o.equals(this.a[n2])) {
                return n2;
            }
        }
        --e;
        while (e >= 0 && this.c[e] == n) {
            if (o.equals(this.a[e])) {
                return e;
            }
            --e;
        }
        return ~n2;
    }
    
    private final int g() {
        final int b = this.b;
        if (b == 0) {
            return -1;
        }
        int e = this.e(0);
        if (e < 0) {
            return e;
        }
        if (this.a[e] == null) {
            return e;
        }
        int n;
        for (n = e + 1; n < b && this.c[n] == 0; ++n) {
            if (this.a[n] == null) {
                return n;
            }
        }
        --e;
        while (e >= 0 && this.c[e] == 0) {
            if (this.a[e] == null) {
                return e;
            }
            --e;
        }
        return ~n;
    }
    
    private final void h(final int n) {
        this.c = new int[n];
        this.a = new Object[n];
    }
    
    public final int a(final Object o) {
        int n;
        if (o == null) {
            n = this.g();
        }
        else {
            n = this.f(o, o.hashCode());
        }
        return n;
    }
    
    @Override
    public final boolean add(final Object o) {
        final int b = this.b;
        int n;
        int hashCode;
        if (o == null) {
            n = this.g();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.f(o, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int[] c = this.c;
        final int length = c.length;
        if (b >= length) {
            int n3 = 8;
            if (b >= 8) {
                n3 = (b >> 1) + b;
            }
            else if (b < 4) {
                n3 = 4;
            }
            final Object[] a = this.a;
            this.h(n3);
            if (b != this.b) {
                throw new ConcurrentModificationException();
            }
            final int[] c2 = this.c;
            if (c2.length > 0) {
                System.arraycopy(c, 0, c2, 0, length);
                System.arraycopy(a, 0, this.a, 0, a.length);
            }
        }
        if (n2 < b) {
            final int[] c3 = this.c;
            final int n4 = n2 + 1;
            final int n5 = b - n2;
            System.arraycopy(c3, n2, c3, n4, n5);
            final Object[] a2 = this.a;
            System.arraycopy(a2, n2, a2, n4, n5);
        }
        final int b2 = this.b;
        if (b == b2) {
            final int[] c4 = this.c;
            if (n2 < c4.length) {
                c4[n2] = hashCode;
                this.a[n2] = o;
                this.b = b2 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.c(this.b + collection.size());
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.add(iterator.next());
        }
        return b;
    }
    
    public final Object b(final int n) {
        return this.a[n];
    }
    
    public final void c(int b) {
        final int b2 = this.b;
        final int[] c = this.c;
        if (c.length < b) {
            final Object[] a = this.a;
            this.h(b);
            b = this.b;
            if (b > 0) {
                System.arraycopy(c, 0, this.c, 0, b);
                System.arraycopy(a, 0, this.a, 0, this.b);
            }
        }
        if (this.b == b2) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void clear() {
        if (this.b != 0) {
            this.c = abr.a;
            this.a = abr.c;
            this.b = 0;
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a(o) >= 0;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final void d(final int n) {
        final int b = this.b;
        final Object[] a = this.a;
        final Object o = a[n];
        if (b <= 1) {
            this.clear();
            return;
        }
        final int b2 = b - 1;
        final int[] c = this.c;
        final int length = c.length;
        int n2 = 8;
        if (length > 8 && b < length / 3) {
            if (b > 8) {
                n2 = b + (b >> 1);
            }
            this.h(n2);
            if (n > 0) {
                System.arraycopy(c, 0, this.c, 0, n);
                System.arraycopy(a, 0, this.a, 0, n);
            }
            if (n < b2) {
                final int n3 = n + 1;
                final int[] c2 = this.c;
                final int n4 = b2 - n;
                System.arraycopy(c, n3, c2, n, n4);
                System.arraycopy(a, n3, this.a, n, n4);
            }
        }
        else {
            if (n < b2) {
                final int n5 = n + 1;
                final int n6 = b2 - n;
                System.arraycopy(c, n5, c, n, n6);
                final Object[] a2 = this.a;
                System.arraycopy(a2, n5, a2, n, n6);
            }
            this.a[b2] = null;
        }
        if (b == this.b) {
            this.b = b2;
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.b != set.size()) {
            return false;
        }
        int i = 0;
        try {
            while (i < this.b) {
                if (!set.contains(this.b(i))) {
                    return false;
                }
                ++i;
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final int[] c = this.c;
        final int b = this.b;
        int i = 0;
        int n = 0;
        while (i < b) {
            n += c[i];
            ++i;
        }
        return n;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.b <= 0;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new abj(this);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int a = this.a(o);
        if (a >= 0) {
            this.d(a);
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        int i = this.b - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.a[i])) {
                this.d(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    @Override
    public final int size() {
        return this.b;
    }
    
    @Override
    public final Object[] toArray() {
        final int b = this.b;
        final Object[] array = new Object[b];
        System.arraycopy(this.a, 0, array, 0, b);
        return array;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        Object[] array2 = array;
        if (array.length < this.b) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, array2, 0, this.b);
        final int length = array2.length;
        final int b = this.b;
        if (length > b) {
            array2[b] = null;
        }
        return array2;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i = 0; i < this.b; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object b = this.b(i);
            if (b != this) {
                sb.append(b);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
