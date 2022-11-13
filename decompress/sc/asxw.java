import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxw extends AtomicReference implements ashy
{
    private static final long serialVersionUID = -1185974347409665484L;
    final asxv a;
    final int b;
    final ashy c;
    boolean d;
    
    public asxw(final asxv a, final int b, final ashy c) {
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
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.d) {
            this.c.tu(o);
            return;
        }
        if (this.a.a(this.b)) {
            this.d = true;
            this.c.tu(o);
            return;
        }
        this.get().dispose();
    }
    
    @Override
    public final void tx() {
        if (this.d) {
            this.c.tx();
            return;
        }
        if (this.a.a(this.b)) {
            this.d = true;
            this.c.tx();
        }
    }
}
