import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aslh extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = -7251123623727029452L;
    final asjm a;
    final asjm b;
    final asjg c;
    
    public aslh(final asjm a, final asjm b, final asjg c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.tA()) {
            this.lazySet(asjv.a);
            try {
                this.b.a(t);
                return;
            }
            finally {
                final Throwable t2;
                asgz.c(t2);
                atqx.j((Throwable)new asiz(new Throwable[] { t, t2 }));
                return;
            }
        }
        atqx.j(t);
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
    public final void tu(final Object o) {
        if (!this.tA()) {
            try {
                this.a.a(o);
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.get().dispose();
                this.b(t);
            }
        }
    }
    
    @Override
    public final void tx() {
        if (!this.tA()) {
            this.lazySet(asjv.a);
            try {
                this.c.a();
            }
            finally {
                final Throwable t;
                asgz.c(t);
                atqx.j(t);
            }
        }
    }
}
