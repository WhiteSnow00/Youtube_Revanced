import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslj implements ashd
{
    final AtomicReference a;
    final ashd b;
    
    public aslj(final AtomicReference a, final ashd b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h(this.a, asir);
    }
    
    @Override
    public final void tx() {
        this.b.tx();
    }
}
