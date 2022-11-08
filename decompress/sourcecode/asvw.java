import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvw extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = -5955289211445418871L;
    final asgz a;
    final asvx b;
    final ashb c;
    final asvv d;
    
    public asvw(final asgz a, final ashb c) {
        this.a = a;
        this.b = new asvx(this);
        this.c = c;
        this.d = new asvv(a);
    }
    
    public final void b(final Throwable t) {
        asjg.b(this.b);
        if (this.getAndSet(asjg.a) != asjg.a) {
            this.a.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void c() {
        if (asjg.b(this)) {
            final ashb c = this.c;
            if (c == null) {
                this.a.b((Throwable)new TimeoutException());
                return;
            }
            c.ag((asgz)this.d);
        }
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
        asjg.b(this.b);
        final asvv d = this.d;
        if (d != null) {
            asjg.b(d);
        }
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
