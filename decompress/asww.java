import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asww extends AtomicReference implements asho
{
    private static final long serialVersionUID = 3323743579927613702L;
    final aswv a;
    final int b;
    
    public asww(final aswv a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t, this.b);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void ts(Object a) {
        final aswv a2 = this.a;
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
    
    @Override
    public final void tx() {
        final aswv a = this.a;
        final int b = this.b;
        if (a.getAndSet(0) > 0) {
            a.a(b);
            a.a.tx();
        }
    }
}
