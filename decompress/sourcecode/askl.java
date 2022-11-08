import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class askl extends AtomicReference implements ashq, asic
{
    private static final long serialVersionUID = -7012088219455310787L;
    final asix a;
    final asix b;
    
    public askl(final asix a, final asix b) {
        this.a = a;
        this.b = b;
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
    
    public final boolean tx() {
        return this.get() == asjg.a;
    }
}
