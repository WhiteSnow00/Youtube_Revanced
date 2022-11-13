import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmg extends AtomicReference implements ashd, asir
{
    private static final long serialVersionUID = 251330541679988317L;
    final asmh a;
    
    public asmg(final asmh a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asmh a = this.a;
        a.e.d((asir)this);
        if (!a.c) {
            a.f.tt();
            a.e.dispose();
            if (!atih.e((AtomicReference)a.d, t)) {
                atqx.j(t);
                return;
            }
            if (a.getAndSet(0) > 0) {
                a.a.b(atih.d((AtomicReference)a.d));
            }
        }
        else {
            if (!atih.e((AtomicReference)a.d, t)) {
                atqx.j(t);
                return;
            }
            if (a.decrementAndGet() == 0) {
                a.a.b(atih.d((AtomicReference)a.d));
                return;
            }
            if (a.b != Integer.MAX_VALUE) {
                a.f.e(1L);
            }
        }
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void tx() {
        final asmh a = this.a;
        a.e.d((asir)this);
        if (a.decrementAndGet() != 0) {
            if (a.b != Integer.MAX_VALUE) {
                a.f.e(1L);
            }
            return;
        }
        final Throwable t = (Throwable)a.d.get();
        if (t != null) {
            a.a.b(t);
            return;
        }
        a.a.tx();
    }
}
