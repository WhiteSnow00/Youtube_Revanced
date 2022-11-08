import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslx extends AtomicReference implements Runnable, asgo, asic
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asgo a;
    final asho b;
    Throwable c;
    
    public aslx(final asgo a, final asho b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable c) {
        this.c = c;
        asjg.h(this, this.b.f((Runnable)this));
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
        final Throwable c = this.c;
        if (c != null) {
            this.c = null;
            this.a.b(c);
            return;
        }
        this.a.tu();
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
    
    public final void tu() {
        asjg.h(this, this.b.f((Runnable)this));
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
