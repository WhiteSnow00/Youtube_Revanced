import java.util.Collections;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afuc extends AbstractList implements RandomAccess, Serializable
{
    private static final long serialVersionUID = 0L;
    public final int[] a;
    public final int b;
    public final int c;
    
    public afuc(final int[] a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return o instanceof Integer && afxr.D(this.a, (int)o, this.b, this.c) != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof afuc)) {
            return super.equals(o);
        }
        final afuc afuc = (afuc)o;
        final int size = this.size();
        if (afuc.size() == size) {
            for (int i = 0; i < size; ++i) {
                if (this.a[this.b + i] != afuc.a[afuc.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final /* bridge */ Object get(final int n) {
        adme.ab(n, this.size());
        return this.a[this.b + n];
    }
    
    @Override
    public final int hashCode() {
        int i = this.b;
        int n = 1;
        while (i < this.c) {
            n = n * 31 + this.a[i];
            ++i;
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (o instanceof Integer) {
            final int d = afxr.D(this.a, (int)o, this.b, this.c);
            if (d >= 0) {
                return d - this.b;
            }
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return false;
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        if (o instanceof Integer) {
            final int[] a = this.a;
            final int intValue = (int)o;
            final int b = this.b;
            int i = this.c - 1;
            while (true) {
                while (i >= b) {
                    if (a[i] == intValue) {
                        if (i >= 0) {
                            return i - this.b;
                        }
                        return -1;
                    }
                    else {
                        --i;
                    }
                }
                i = -1;
                continue;
            }
        }
        return -1;
    }
    
    @Override
    public final /* bridge */ Object set(int n, final Object o) {
        final Integer n2 = (Integer)o;
        adme.ab(n, this.size());
        final int[] a = this.a;
        n += this.b;
        final int n3 = a[n];
        n2.getClass();
        a[n] = n2;
        return n3;
    }
    
    @Override
    public final int size() {
        return this.c - this.b;
    }
    
    @Override
    public final List subList(final int n, final int n2) {
        adme.S(n, n2, this.size());
        if (n == n2) {
            return Collections.emptyList();
        }
        final int[] a = this.a;
        final int b = this.b;
        return new afuc(a, n + b, b + n2);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.size() * 5);
        sb.append('[');
        sb.append(this.a[this.b]);
        int b = this.b;
        while (++b < this.c) {
            sb.append(", ");
            sb.append(this.a[b]);
        }
        sb.append(']');
        return sb.toString();
    }
}
