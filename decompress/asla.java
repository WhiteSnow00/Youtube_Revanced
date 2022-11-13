import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asla extends AtomicReference implements asif, asir
{
    private static final long serialVersionUID = -7012088219455310787L;
    final asjm a;
    final asjm b;
    
    public asla(final asjm a, final asjm b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.lazySet(asjv.a);
        try {
            this.b.a(t);
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            atqx.j((Throwable)new asiz(new Throwable[] { t, t2 }));
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
        return this.get() == asjv.a;
    }
    
    @Override
    public final void ts(final Object o) {
        this.lazySet(asjv.a);
        try {
            this.a.a(o);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            atqx.j(t);
        }
    }
}
