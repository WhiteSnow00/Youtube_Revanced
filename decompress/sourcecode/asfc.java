import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfc
{
    public static final asfc a;
    public final arxi[] b;
    private final AtomicBoolean c;
    
    static {
        a = new asfc(new arxi[0], null, null, null);
    }
    
    public asfc(final arxi[] b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = new AtomicBoolean(false);
        this.b = b;
    }
    
    public static asfc m(final List list) {
        if (list.isEmpty()) {
            return asfc.a;
        }
        final int size = list.size();
        final arxi[] array = new arxi[size];
        for (int i = 0; i < size; ++i) {
            array[i] = ((arvg)list.get(i)).a();
        }
        return new asfc(array, null, null, null);
    }
    
    public static asfc n(final arxi[] array) {
        final asfc asfc = new asfc(array, null, null, null);
        for (final arxi arxi : array) {}
        return asfc;
    }
    
    public final void a() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void b() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void c(final long n) {
        final arxi[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].p(n);
        }
    }
    
    public final void d() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void e() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void f() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void g() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void h() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void i() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void j() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void k() {
        for (final arxi arxi : this.b) {}
    }
    
    public final void l() {
        final AtomicBoolean c = this.c;
        int i = 0;
        if (c.compareAndSet(false, true)) {
            for (arxi[] b = this.b; i < b.length; ++i) {
                final arxi arxi = b[i];
            }
        }
    }
}
