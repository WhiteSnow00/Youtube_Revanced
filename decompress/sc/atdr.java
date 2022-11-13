import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdr extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = -312246233408980075L;
    final ashy a;
    final asji b;
    final AtomicReference c;
    final AtomicReference d;
    
    public atdr(final ashy a, final asji b) {
        this.c = new AtomicReference();
        this.d = new AtomicReference();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        asjv.b(this.d);
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.c, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.c);
        asjv.b(this.d);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.c.get());
    }
    
    @Override
    public final void tu(Object a) {
        final Object value = this.get();
        if (value != null) {
            try {
                a = this.b.a(a, value);
                askk.b(a, "The combiner returned a null value");
                this.a.tu(a);
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.dispose();
                this.a.b(t);
            }
        }
    }
    
    @Override
    public final void tx() {
        asjv.b(this.d);
        this.a.tx();
    }
}
