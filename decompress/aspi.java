import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspi extends AtomicReference implements Runnable, asjz, asln
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asjz a;
    final askz b;
    Throwable c;
    
    public aspi(final asjz a, final askz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable c) {
        this.c = c;
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
        final Throwable c = this.c;
        if (c != null) {
            this.c = null;
            this.a.b(c);
            return;
        }
        this.a.tw();
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
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
