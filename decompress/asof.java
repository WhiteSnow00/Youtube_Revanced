import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asof implements asjz
{
    final AtomicReference a;
    final asjz b;
    
    public asof(final AtomicReference a, final asjz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this.a, asln);
    }
    
    @Override
    public final void tw() {
        this.b.tw();
    }
}
