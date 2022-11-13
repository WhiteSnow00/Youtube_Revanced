import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswk extends AtomicReference implements asho
{
    private static final long serialVersionUID = 8663801314800248617L;
    final asho a;
    
    public aswk(final asho a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void ts(final Object o) {
        this.a.ts(o);
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
