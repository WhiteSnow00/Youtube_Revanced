import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspc extends AtomicReference implements asjz, asln
{
    private static final long serialVersionUID = 251330541679988317L;
    final aspd a;
    
    public aspc(final aspd a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aspd a = this.a;
        a.e.d(this);
        if (!a.c) {
            a.f.ts();
            a.e.dispose();
            if (!atle.e(a.d, t)) {
                aqvq.w(t);
                return;
            }
            if (a.getAndSet(0) > 0) {
                a.a.b(atle.d(a.d));
            }
        }
        else {
            if (!atle.e(a.d, t)) {
                aqvq.w(t);
                return;
            }
            if (a.decrementAndGet() == 0) {
                a.a.b(atle.d(a.d));
                return;
            }
            if (a.b != Integer.MAX_VALUE) {
                a.f.e(1L);
            }
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
    public final void tw() {
        final aspd a = this.a;
        a.e.d(this);
        if (a.decrementAndGet() != 0) {
            if (a.b != Integer.MAX_VALUE) {
                a.f.e(1L);
            }
            return;
        }
        final Throwable t = a.d.get();
        if (t != null) {
            a.a.b(t);
            return;
        }
        a.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
