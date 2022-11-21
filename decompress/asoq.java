import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asoq extends AtomicReference implements Runnable, asjz, asln
{
    private static final long serialVersionUID = 465972761105851022L;
    final asjz a;
    final long b;
    final TimeUnit c;
    final askz d;
    Throwable e;
    
    public asoq(final asjz a, final long b, final TimeUnit c, final askz d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable e) {
        this.e = e;
        asmr.h(this, this.d.c(this, 0L, this.c));
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void run() {
        final Throwable e = this.e;
        this.e = null;
        if (e != null) {
            this.a.b(e);
            return;
        }
        this.a.tw();
    }
    
    @Override
    public final void tw() {
        asmr.h(this, this.d.c(this, this.b, this.c));
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
