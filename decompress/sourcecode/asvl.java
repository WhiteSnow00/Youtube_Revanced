import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvl extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asjk a;
    final asgz b;
    
    public asvl(final asgz b) {
        this.b = b;
        this.a = new asjk();
    }
    
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
        asjg.b(this.a);
    }
    
    public final void tp(final Object o) {
        this.b.tp(o);
    }
    
    public final void tu() {
        this.b.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
