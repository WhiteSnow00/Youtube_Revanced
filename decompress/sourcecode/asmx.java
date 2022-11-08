// 
// Decompiled by Procyon v0.6.0
// 

final class asmx extends athd implements asgw
{
    private static final long serialVersionUID = -3589550218733891694L;
    final asis a;
    final Object b;
    aujq c;
    boolean d;
    
    public asmx(final aujp aujp, final Object b, final asis a) {
        super(aujp);
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.d) {
            aulo.r(t);
            return;
        }
        this.d = true;
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
        if (this.d) {
            return;
        }
        try {
            this.a.a(this.b, o);
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.c.tq();
            this.b(t);
        }
    }
    
    public final void tu() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.g(this.b);
    }
}
