import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmr extends AtomicReference implements Runnable, ashd, asir
{
    private static final long serialVersionUID = 7000911171163930287L;
    final ashd a;
    final asjz b;
    final ashf c;
    
    public asmr(final ashd a, final ashf c) {
        this.a = a;
        this.c = c;
        this.b = new asjz();
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
    public final void dispose() {
        asjv.b((AtomicReference)this);
        asjv.b((AtomicReference)this.b);
    }
    
    @Override
    public final void run() {
        this.c.Y(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
