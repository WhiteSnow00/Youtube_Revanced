import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbd extends AtomicReference implements asku
{
    private static final long serialVersionUID = -4823716997131257941L;
    final atbe a;
    final int b;
    
    public atbd(final atbe a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atbe a = this.a;
        if (atle.e(a.h, t)) {
            a.a();
            a.c();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.d(this.b, o);
    }
    
    @Override
    public final void tw() {
        final atbe a = this.a;
        final int b = this.b;
        synchronized (a) {
            final Object[] d = a.d;
            if (d == null) {
                return;
            }
            final boolean b2 = d[b] == null;
            if (b2 || ++a.j == d.length) {
                a.g = true;
            }
            monitorexit(a);
            if (b2) {
                a.a();
            }
            a.c();
        }
    }
}
