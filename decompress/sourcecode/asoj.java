import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class asoj extends athd implements asgw
{
    private static final long serialVersionUID = 4066607327284737757L;
    final Object a;
    final boolean b;
    aujq c;
    long d;
    boolean e;
    
    public asoj(final aujp aujp, final Object a, final boolean b) {
        super(aujp);
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.e) {
            aulo.r(t);
            return;
        }
        this.e = true;
        this.f.b(t);
    }
    
    public final void f(final aujq c) {
        if (athh.i(this.c, c)) {
            this.c = c;
            this.f.f((aujq)this);
            c.e(Long.MAX_VALUE);
        }
    }
    
    public final void tq() {
        super.tq();
        this.c.tq();
    }
    
    public final void tr(final Object o) {
        if (this.e) {
            return;
        }
        final long d = this.d;
        if (d == 0L) {
            this.e = true;
            this.c.tq();
            this.g(o);
            return;
        }
        this.d = d + 1L;
    }
    
    public final void tu() {
        if (!this.e) {
            this.e = true;
            final Object a = this.a;
            if (a == null) {
                if (this.b) {
                    this.f.b((Throwable)new NoSuchElementException());
                    return;
                }
                this.f.tu();
            }
            else {
                this.g(a);
            }
        }
    }
}
