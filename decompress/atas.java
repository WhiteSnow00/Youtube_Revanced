import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atas extends AtomicReference implements asku
{
    private static final long serialVersionUID = -1185974347409665484L;
    final atar a;
    final int b;
    final asku c;
    boolean d;
    
    public atas(final atar a, final int b, final asku c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d) {
            this.c.b(t);
            return;
        }
        if (this.a.a(this.b)) {
            this.d = true;
            this.c.b(t);
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
        if (this.d) {
            this.c.tt(o);
            return;
        }
        if (this.a.a(this.b)) {
            this.d = true;
            this.c.tt(o);
            return;
        }
        this.get().dispose();
    }
    
    @Override
    public final void tw() {
        if (this.d) {
            this.c.tw();
            return;
        }
        if (this.a.a(this.b)) {
            this.d = true;
            this.c.tw();
        }
    }
}
