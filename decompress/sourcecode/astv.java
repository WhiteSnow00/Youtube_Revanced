import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class astv extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = -6076952298809384986L;
    final asix a;
    final asix b;
    final asir c;
    
    public astv(final asix a, final asix b, final asir c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        this.lazySet(asjg.a);
        try {
            this.b.a((Object)t);
        }
        finally {
            final Throwable t2;
            asey.d(t2);
            aulo.r((Throwable)new asik(new Throwable[] { t, t2 }));
        }
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tp(final Object o) {
        this.lazySet(asjg.a);
        try {
            this.a.a(o);
        }
        finally {
            final Throwable t;
            asey.d(t);
            aulo.r(t);
        }
    }
    
    public final void tu() {
        this.lazySet(asjg.a);
        try {
            this.c.a();
        }
        finally {
            final Throwable t;
            asey.d(t);
            aulo.r(t);
        }
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
