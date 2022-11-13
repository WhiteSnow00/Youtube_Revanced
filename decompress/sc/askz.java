import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class askz extends AtomicReference implements ashd, asir, asjm
{
    private static final long serialVersionUID = -4361286194466301354L;
    final asjm a;
    final asjg b;
    
    public askz(final asjg b) {
        this.a = this;
        this.b = b;
    }
    
    public askz(final asjm a, final asjg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final /* bridge */ void a(final Object o) {
        atqx.j((Throwable)new asjb((Throwable)o));
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            this.a.a(t);
        }
        finally {
            asgz.c(t);
            atqx.j(t);
        }
        this.lazySet(asjv.a);
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
    public final String toString() {
        return String.valueOf(this.b);
    }
    
    @Override
    public final void tx() {
        try {
            this.b.a();
        }
        finally {
            final Throwable t;
            asgz.c(t);
            atqx.j(t);
        }
        this.lazySet(asjv.a);
    }
}
