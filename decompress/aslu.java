import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslu extends AtomicReference implements Runnable, ashd, asir
{
    private static final long serialVersionUID = 465972761105851022L;
    final ashd a;
    final long b;
    final TimeUnit c;
    final asid d;
    Throwable e;
    
    public aslu(final ashd a, final long b, final TimeUnit c, final asid d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable e) {
        this.e = e;
        asjv.h((AtomicReference)this, this.d.c(this, 0L, this.c));
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f((AtomicReference)this, asir)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final void run() {
        final Throwable e = this.e;
        this.e = null;
        if (e != null) {
            this.a.b(e);
            return;
        }
        this.a.tx();
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void tx() {
        asjv.h((AtomicReference)this, this.d.c(this, this.b, this.c));
    }
}
