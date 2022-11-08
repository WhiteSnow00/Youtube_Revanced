import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslf extends AtomicReference implements Runnable, asgo, asic
{
    private static final long serialVersionUID = 465972761105851022L;
    final asgo a;
    final long b;
    final TimeUnit c;
    final asho d;
    Throwable e;
    
    public aslf(final asgo a, final long b, final TimeUnit c, final asho d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void b(final Throwable e) {
        this.e = e;
        asjg.h(this, this.d.c((Runnable)this, 0L, this.c));
    }
    
    public final void d(final asic asic) {
        if (asjg.f(this, asic)) {
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    @Override
    public final void run() {
        final Throwable e = this.e;
        this.e = null;
        if (e != null) {
            this.a.b(e);
            return;
        }
        this.a.tu();
    }
    
    public final void tu() {
        asjg.h(this, this.d.c((Runnable)this, this.b, this.c));
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
