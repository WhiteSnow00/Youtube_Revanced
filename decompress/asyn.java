import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyn extends AtomicReference implements Runnable, askk, asln
{
    private static final long serialVersionUID = 8571289934935992137L;
    final askk a;
    final askz b;
    Object c;
    Throwable d;
    
    public asyn(final askk a, final askz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable d) {
        this.d = d;
        asmr.h(this, this.b.f(this));
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
        final Throwable d = this.d;
        if (d != null) {
            this.d = null;
            this.a.b(d);
            return;
        }
        final Object c = this.c;
        if (c != null) {
            this.c = null;
            this.a.tr(c);
            return;
        }
        this.a.tw();
    }
    
    @Override
    public final void tr(final Object c) {
        this.c = c;
        asmr.h(this, this.b.f(this));
    }
    
    @Override
    public final void tw() {
        asmr.h(this, this.b.f(this));
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
