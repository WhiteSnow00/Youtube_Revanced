import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asst extends AtomicReference implements asgw
{
    private static final long serialVersionUID = 3837284832786408377L;
    final assu a;
    final long b;
    final int c;
    volatile aske d;
    volatile boolean e;
    int f;
    
    public asst(final assu a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        final assu a = this.a;
        if (this.b == a.l && athp.e(a.g, t)) {
            final boolean e = a.e;
            a.i.tq();
            a.f = true;
            this.e = true;
            a.g();
            return;
        }
        aulo.r(t);
    }
    
    public final void f(final aujq aujq) {
        if (athh.g(this, aujq)) {
            if (aujq instanceof askb) {
                final askb askb = (askb)aujq;
                final int ts = askb.ts(7);
                if (ts == 1) {
                    this.f = 1;
                    this.d = (aske)askb;
                    this.e = true;
                    this.a.g();
                    return;
                }
                if (ts == 2) {
                    this.f = 2;
                    this.d = (aske)askb;
                    aujq.e((long)this.c);
                    return;
                }
            }
            this.d = (aske)new atfo(this.c);
            aujq.e((long)this.c);
        }
    }
    
    public final void tr(final Object o) {
        final assu a = this.a;
        if (this.b == a.l) {
            if (this.f == 0 && !this.d.j(o)) {
                this.b((Throwable)new asil("Queue full?!"));
                return;
            }
            a.g();
        }
    }
    
    public final void tu() {
        final assu a = this.a;
        if (this.b == a.l) {
            this.e = true;
            a.g();
        }
    }
}
