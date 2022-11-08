import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvc extends AtomicReference implements Runnable, asgz, asic
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asgz a;
    final asho b;
    Object c;
    Throwable d;
    
    public asvc(final asgz a, final asho b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable d) {
        this.d = d;
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
        final Throwable d = this.d;
        if (d != null) {
            this.d = null;
            this.a.b(d);
            return;
        }
        final Object c = this.c;
        if (c != null) {
            this.c = null;
            this.a.tp(c);
            return;
        }
        this.a.tu();
    }
    
    public final void tp(final Object c) {
        this.c = c;
        asjg.h(this, this.b.f((Runnable)this));
    }
    
    public final void tu() {
        asjg.h(this, this.b.f((Runnable)this));
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
