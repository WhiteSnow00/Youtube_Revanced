import java.util.Collection;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

class affw extends affx
{
    Object[] a;
    int b;
    boolean c;
    
    public affw(final int n) {
        adzw.H(n, "initialCapacity");
        this.a = new Object[n];
        this.b = 0;
    }
    
    private final void g(final int n) {
        final Object[] a = this.a;
        final int length = a.length;
        if (length < n) {
            this.a = Arrays.copyOf(a, affx.f(length, n));
            this.c = false;
            return;
        }
        if (this.c) {
            this.a = a.clone();
            this.c = false;
        }
    }
    
    final void a(final Object[] array, final int n) {
        aewr.l(array, n);
        this.g(this.b + n);
        System.arraycopy(array, 0, this.a, this.b, n);
        this.b += n;
    }
    
    public final void b(final Object o) {
        o.getClass();
        this.g(this.b + 1);
        this.a[this.b++] = o;
    }
    
    @Override
    public /* bridge */ void c(final Object o) {
        throw null;
    }
    
    public final void d(final Object... array) {
        this.a(array, array.length);
    }
    
    @Override
    public final void e(final Iterable iterable) {
        if (iterable instanceof Collection) {
            final Collection collection = (Collection)iterable;
            this.g(this.b + collection.size());
            if (collection instanceof affy) {
                this.b = ((affy)collection).c(this.a, this.b);
                return;
            }
        }
        super.e(iterable);
    }
}
