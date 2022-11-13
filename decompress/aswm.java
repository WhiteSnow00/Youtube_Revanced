import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswm extends AtomicReference implements asho
{
    private static final long serialVersionUID = 8663801314800248617L;
    final aswl a;
    
    public aswm(final aswl a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aswl a = this.a;
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
