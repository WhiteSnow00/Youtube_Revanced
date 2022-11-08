import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmc extends AtomicReference implements Runnable, asgo, asic
{
    private static final long serialVersionUID = 7000911171163930287L;
    final asgo a;
    final asjk b;
    final asgq c;
    
    public asmc(final asgo a, final asgq c) {
        this.a = a;
        this.c = c;
        this.b = new asjk();
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
        asjg.b(this.b);
    }
    
    @Override
    public final void run() {
        this.c.Y((asgo)this);
    }
    
    public final void tu() {
        this.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
