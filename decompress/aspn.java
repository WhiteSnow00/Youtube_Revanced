import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspn extends AtomicReference implements Runnable, asjz, asln
{
    private static final long serialVersionUID = 7000911171163930287L;
    final asjz a;
    final asmv b;
    final askb c;
    
    public aspn(final asjz a, final askb c) {
        this.a = a;
        this.c = c;
        this.b = new asmv();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
        asmr.b(this.b);
    }
    
    @Override
    public final void run() {
        this.c.Y(this);
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
