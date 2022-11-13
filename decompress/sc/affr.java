import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class affr extends afef
{
    Object[] d;
    private int e;
    
    public affr() {
        super(4);
    }
    
    public affr(final int n) {
        super(n);
        this.d = new Object[afft.d(n)];
    }
    
    public /* bridge */ void c(final Object o) {
        this.h(o);
    }
    
    public afft g() {
        final int b = this.b;
        if (b == 0) {
            return afiq.a;
        }
        if (b != 1) {
            afft n;
            if (this.d != null && afft.d(b) == this.d.length) {
                final int b2 = this.b;
                Object[] array2;
                final Object[] array = array2 = this.a;
                if (afft.y(b2, array.length)) {
                    array2 = Arrays.copyOf(array, b2);
                }
                final int e = this.e;
                final Object[] d = this.d;
                n = new afiq(array2, e, d, d.length - 1, this.b);
            }
            else {
                n = afft.n(this.b, this.a);
                this.b = n.size();
            }
            this.c = true;
            this.d = null;
            return n;
        }
        final Object o = this.a[0];
        o.getClass();
        return afft.s(o);
    }
    
    public final void h(final Object o) {
        o.getClass();
        if (this.d != null) {
            final int d = afft.d(this.b);
            final Object[] d2 = this.d;
            final int length = d2.length;
            if (d <= length) {
                d2.getClass();
                final int hashCode = o.hashCode();
                int ag = agpc.ag(hashCode);
                while (true) {
                    final Object[] d3 = this.d;
                    ag &= length - 1;
                    final Object o2 = d3[ag];
                    if (o2 == null) {
                        d3[ag] = o;
                        this.e += hashCode;
                        super.b(o);
                        return;
                    }
                    if (o2.equals(o)) {
                        return;
                    }
                    ++ag;
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
    
    public final void l(final affr affr) {
        if (this.d != null) {
            for (int i = 0; i < affr.b; ++i) {
                final Object o = affr.a[i];
                o.getClass();
                this.h(o);
            }
            return;
        }
        this.a(affr.a, affr.b);
    }
}
