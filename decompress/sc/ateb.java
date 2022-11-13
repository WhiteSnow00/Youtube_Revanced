import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ateb extends AtomicReference implements ashl
{
    private static final long serialVersionUID = 8410034718427740355L;
    final atec a;
    final int b;
    final int c;
    long d;
    volatile asks e;
    
    public ateb(final atec a, final int b) {
        this.a = a;
        this.b = b;
        this.c = b - (b >> 2);
    }
    
    public final void b(final Throwable t) {
        this.a.f(t);
    }
    
    final asks d() {
        asks e;
        if ((e = this.e) == null) {
            e = new atgg(this.b);
            this.e = e;
        }
        return e;
    }
    
    public final void f(final aukg aukg) {
        athz.k((AtomicReference)this, aukg, (long)this.b);
    }
    
    public final void tu(final Object o) {
        this.a.g(this, o);
    }
    
    public final void tx() {
        this.a.d();
    }
}
