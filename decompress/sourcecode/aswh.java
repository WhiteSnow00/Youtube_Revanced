import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswh extends AtomicReference implements asgz
{
    private static final long serialVersionUID = 3323743579927613702L;
    final aswg a;
    final int b;
    
    public aswh(final aswg a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t, this.b);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void tp(Object a) {
        final aswg a2 = this.a;
        a2.d[this.b] = a;
        if (a2.decrementAndGet() == 0) {
            try {
                a = a2.b.a((Object)a2.d);
                asjv.b(a, "The zipper returned a null value");
                a2.a.tp(a);
            }
            finally {
                final Throwable t;
                asey.d(t);
                a2.a.b(t);
            }
        }
    }
    
    public final void tu() {
        final aswg a = this.a;
        final int b = this.b;
        if (a.getAndSet(0) > 0) {
            a.a(b);
            a.a.tu();
        }
    }
}
