import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgc extends AtomicReference implements asif
{
    private static final long serialVersionUID = 3323743579927613702L;
    final atgb a;
    final int b;
    
    public atgc(final atgb a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.a(t, this.b);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this, asir);
    }
    
    @Override
    public final void ts(Object a) {
        final atgb a2 = this.a;
        a2.d[this.b] = a;
        if (a2.decrementAndGet() == 0) {
            try {
                a = a2.b.a((Object)a2.d);
                askk.b(a, "The zipper returned a null value");
                a2.a.ts(a);
            }
            finally {
                final Throwable t;
                asgz.c(t);
                a2.a.b(t);
            }
        }
    }
}
