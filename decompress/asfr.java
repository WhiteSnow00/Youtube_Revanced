import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfr
{
    private final AtomicBoolean a;
    private final arva[] b;
    
    static {
        new asfr(new arva[0], null, null);
    }
    
    public asfr(final arva[] b, final byte[] array, final byte[] array2) {
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    public static asfr m(final arva[] array) {
        final asfr asfr = new asfr(array, null, null);
        for (int i = 0; i < array.length; ++i) {
            final arva arva = array[i];
        }
        return asfr;
    }
    
    public final void a() {
        for (final arva arva : this.b) {}
    }
    
    public final void b() {
        for (final arva arva : this.b) {}
    }
    
    public final void c(final long n) {
        final arva[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].f(n);
        }
    }
    
    public final void d() {
        for (final arva arva : this.b) {}
    }
    
    public final void e() {
        for (final arva arva : this.b) {}
    }
    
    public final void f() {
        for (final arva arva : this.b) {}
    }
    
    public final void g() {
        for (final arva arva : this.b) {}
    }
    
    public final void h() {
        for (final arva arva : this.b) {}
    }
    
    public final void i() {
        for (final arva arva : this.b) {}
    }
    
    public final void j() {
        for (final arva arva : this.b) {}
    }
    
    public final void k() {
        for (final arva arva : this.b) {}
    }
    
    public final void l() {
        final AtomicBoolean a = this.a;
        int i = 0;
        if (a.compareAndSet(false, true)) {
            for (arva[] b = this.b; i < b.length; ++i) {
                final arva arva = b[i];
            }
        }
    }
}
