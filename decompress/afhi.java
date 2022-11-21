import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class afhi extends affw
{
    Object[] d;
    private int e;
    
    public afhi() {
        super(4);
    }
    
    public afhi(final int n) {
        super(n);
        this.d = new Object[afhk.d(n)];
    }
    
    @Override
    public /* bridge */ void c(final Object o) {
        this.h(o);
    }
    
    public afhk g() {
        final int b = this.b;
        if (b == 0) {
            return (afhk)afkg.a;
        }
        if (b != 1) {
            Object n;
            if (this.d != null && afhk.d(b) == this.d.length) {
                final int b2 = this.b;
                Object[] array2;
                final Object[] array = array2 = this.a;
                if (afhk.y(b2, array.length)) {
                    array2 = Arrays.copyOf(array, b2);
                }
                final int e = this.e;
                final Object[] d = this.d;
                n = new afkg(array2, e, d, d.length - 1, this.b);
            }
            else {
                n = afhk.n(this.b, this.a);
                this.b = ((AbstractCollection)n).size();
            }
            this.c = true;
            this.d = null;
            return (afhk)n;
        }
        final Object o = this.a[0];
        o.getClass();
        return afhk.s(o);
    }
    
    public final void h(final Object o) {
        o.getClass();
        if (this.d != null) {
            final int d = afhk.d(this.b);
            final Object[] d2 = this.d;
            final int length = d2.length;
            if (d <= length) {
                d2.getClass();
                final int hashCode = o.hashCode();
                int t = aegu.t(hashCode);
                while (true) {
                    final Object[] d3 = this.d;
                    t &= length - 1;
                    final Object o2 = d3[t];
                    if (o2 == null) {
                        d3[t] = o;
                        this.e += hashCode;
                        super.b(o);
                        return;
                    }
                    if (o2.equals(o)) {
                        return;
                    }
                    ++t;
                }
            }
        }
        this.d = null;
        super.b(o);
    }
    
    public final void i(final Object... array) {
        if (this.d != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.h(array[i]);
            }
            return;
        }
        super.d(array);
    }
    
    public final void j(final Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            final Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.h(iterator.next());
            }
            return;
        }
        super.e(iterable);
    }
    
    public final void k(final Iterator iterator) {
        iterator.getClass();
        while (iterator.hasNext()) {
            this.h(iterator.next());
        }
    }
    
    public final void l(final afhi afhi) {
        if (this.d != null) {
            for (int i = 0; i < afhi.b; ++i) {
                final Object o = afhi.a[i];
                o.getClass();
                this.h(o);
            }
            return;
        }
        this.a(afhi.a, afhi.b);
    }
}
