import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdj extends AtomicReference implements asgw
{
    private static final long serialVersionUID = 8410034718427740355L;
    final atdk a;
    final int b;
    final int c;
    long d;
    volatile askd e;
    
    public atdj(final atdk a, final int b) {
        this.a = a;
        this.b = b;
        this.c = b - (b >> 2);
    }
    
    public final void b(final Throwable t) {
        this.a.f(t);
    }
    
    final askd d() {
        Object e;
        if ((e = this.e) == null) {
            e = new atfo(this.b);
            this.e = (askd)e;
        }
        return (askd)e;
    }
    
    public final void f(final aujq aujq) {
        athh.k(this, aujq, this.b);
    }
    
    public final void tr(final Object o) {
        this.a.g(this, o);
    }
    
    public final void tu() {
        this.a.d();
    }
}
