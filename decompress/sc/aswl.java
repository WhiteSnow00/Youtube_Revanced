import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswl extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = -5955289211445418871L;
    final asho a;
    final aswm b;
    final ashq c;
    final aswk d;
    
    public aswl(final asho a, final ashq c) {
        this.a = a;
        this.b = new aswm(this);
        this.c = c;
        this.d = new aswk(a);
    }
    
    @Override
    public final void b(final Throwable t) {
        asjv.b((AtomicReference)this.b);
        if (this.getAndSet(asjv.a) != asjv.a) {
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    public final void c() {
        if (asjv.b((AtomicReference)this)) {
            final ashq c = this.c;
            if (c == null) {
                this.a.b(new TimeoutException());
                return;
            }
            c.ag(this.d);
        }
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
        asjv.b((AtomicReference)this.b);
        final aswk d = this.d;
        if (d != null) {
            asjv.b((AtomicReference)d);
        }
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        asjv.b((AtomicReference)this.b);
        if (this.getAndSet(asjv.a) != asjv.a) {
            this.a.ts(o);
        }
    }
    
    @Override
    public final void tx() {
        asjv.b((AtomicReference)this.b);
        if (this.getAndSet(asjv.a) != asjv.a) {
            this.a.tx();
        }
    }
}
