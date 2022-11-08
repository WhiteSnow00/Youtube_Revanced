import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvt extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = -2187421758664251153L;
    final asgz a;
    final asvs b;
    
    public asvt(final asgz a) {
        this.a = a;
        this.b = new asvs(this);
    }
    
    public final void b(final Throwable t) {
        asjg.b(this.b);
        if (this.getAndSet(asjg.a) != asjg.a) {
            this.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    final void c() {
        if (asjg.b(this)) {
            this.a.tu();
        }
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
        asjg.b(this.b);
    }
    
    public final void tp(final Object o) {
        asjg.b(this.b);
        if (this.getAndSet(asjg.a) != asjg.a) {
            this.a.tp(o);
        }
    }
    
    public final void tu() {
        asjg.b(this.b);
        if (this.getAndSet(asjg.a) != asjg.a) {
            this.a.tu();
        }
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
