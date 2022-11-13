// 
// Decompiled by Procyon v0.6.0
// 

final class asnm extends athv implements ashl
{
    private static final long serialVersionUID = -3589550218733891694L;
    final asjh a;
    final Object b;
    aukg c;
    boolean d;
    
    public asnm(final aukf aukf, final Object b, final asjh a) {
        super(aukf);
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.d) {
            atqx.j(t);
            return;
        }
        this.d = true;
        this.f.b(t);
    }
    
    public final void f(final aukg c) {
        if (athz.i(this.c, c)) {
            this.c = c;
            this.f.f((aukg)this);
            c.e(Long.MAX_VALUE);
        }
    }
    
    public final void tt() {
        super.tt();
        this.c.tt();
    }
    
    public final void tu(final Object o) {
        if (this.d) {
            return;
        }
        try {
            this.a.a(this.b, o);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.c.tt();
            this.b(t);
        }
    }
    
    public final void tx() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.g(this.b);
    }
}
