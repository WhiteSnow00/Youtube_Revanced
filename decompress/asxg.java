import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxg extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = -6076952298809384986L;
    final asmi a;
    final asmi b;
    final asmc c;
    
    public asxg(final asmi a, final asmi b, final asmc c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.lazySet(asmr.a);
        try {
            this.b.a(t);
        }
        finally {
            final Throwable t2;
            asjv.a(t2);
            aqvq.w((Throwable)new aslv(new Throwable[] { t, t2 }));
        }
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tr(final Object o) {
        this.lazySet(asmr.a);
        try {
            this.a.a(o);
        }
        finally {
            final Throwable t;
            asjv.a(t);
            aqvq.w(t);
        }
    }
    
    @Override
    public final void tw() {
        this.lazySet(asmr.a);
        try {
            this.c.a();
        }
        finally {
            final Throwable t;
            asjv.a(t);
            aqvq.w(t);
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
