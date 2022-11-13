import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdv implements ashy
{
    final atdu a;
    final atgh b;
    volatile boolean c;
    Throwable d;
    final AtomicReference e;
    
    public atdv(final atdu a, final int n) {
        this.e = new AtomicReference();
        this.a = a;
        this.b = new atgh(n);
    }
    
    @Override
    public final void b(final Throwable d) {
        this.d = d;
        this.c = true;
        this.a.d();
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.e, asir);
    }
    
    @Override
    public final void tu(final Object o) {
        this.b.j(o);
        this.a.d();
    }
    
    @Override
    public final void tx() {
        this.c = true;
        this.a.d();
    }
}
