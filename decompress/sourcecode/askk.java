import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class askk extends AtomicReference implements asgo, asic, asix
{
    private static final long serialVersionUID = -4361286194466301354L;
    final asix a;
    final asir b;
    
    public askk(final asir b) {
        this.a = (asix)this;
        this.b = b;
    }
    
    public askk(final asix a, final asir b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        try {
            this.a.a((Object)t);
        }
        finally {
            asey.d(t);
            aulo.r(t);
        }
        this.lazySet(asjg.a);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.b);
    }
    
    public final void tu() {
        try {
            this.b.a();
        }
        finally {
            final Throwable t;
            asey.d(t);
            aulo.r(t);
        }
        this.lazySet(asjg.a);
    }
    
    public final boolean tx() {
        return this.get() == asjg.a;
    }
}
