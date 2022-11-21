import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asnv extends AtomicReference implements asjz, asln, asmi
{
    private static final long serialVersionUID = -4361286194466301354L;
    final asmi a;
    final asmc b;
    
    public asnv(final asmc b) {
        this.a = this;
        this.b = b;
    }
    
    public asnv(final asmi a, final asmc b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final /* bridge */ void a(final Object o) {
        aqvq.w((Throwable)new aslx((Throwable)o));
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            this.a.a(t);
        }
        finally {
            asjv.a(t);
            aqvq.w(t);
        }
        this.lazySet(asmr.a);
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
    public final String toString() {
        return String.valueOf(this.b);
    }
    
    @Override
    public final void tw() {
        try {
            this.b.a();
        }
        finally {
            final Throwable t;
            asjv.a(t);
            aqvq.w(t);
        }
        this.lazySet(asmr.a);
    }
    
    @Override
    public final boolean tz() {
        return this.get() == asmr.a;
    }
}
