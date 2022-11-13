import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswh extends AtomicReference implements asho
{
    private static final long serialVersionUID = -1266041316834525931L;
    final aswi a;
    
    public aswh(final aswi a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aswi a = this.a;
        if (asjv.b((AtomicReference)a)) {
            a.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void ts(final Object o) {
        this.a.c();
    }
    
    @Override
    public final void tx() {
        this.a.c();
    }
}
