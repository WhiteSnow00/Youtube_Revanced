import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszs extends AtomicReference implements askk
{
    private static final long serialVersionUID = 3323743579927613702L;
    final aszr a;
    final int b;
    
    public aszs(final aszr a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t, this.b);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tr(Object a) {
        final aszr a2 = this.a;
        a2.d[this.b] = a;
        if (a2.decrementAndGet() == 0) {
            try {
                a = a2.b.a(a2.d);
                asng.b(a, "The zipper returned a null value");
                a2.a.tr(a);
            }
            finally {
                final Throwable t;
                asjv.a(t);
                a2.a.b(t);
            }
        }
    }
    
    @Override
    public final void tw() {
        final aszr a = this.a;
        final int b = this.b;
        if (a.getAndSet(0) > 0) {
            a.a(b);
            a.a.tw();
        }
    }
}
