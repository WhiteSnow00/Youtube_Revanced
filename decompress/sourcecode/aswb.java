// 
// Decompiled by Procyon v0.6.0
// 

final class aswb extends athd implements asgz
{
    private static final long serialVersionUID = 7603343402964826922L;
    asic a;
    
    public aswb(final aujp aujp) {
        super(aujp);
    }
    
    public final void b(final Throwable t) {
        this.f.b(t);
    }
    
    public final void d(final asic a) {
        if (asjg.g(this.a, a)) {
            this.a = a;
            this.f.f((aujq)this);
        }
    }
    
    public final void tp(final Object o) {
        this.g(o);
    }
    
    public final void tq() {
        super.tq();
        this.a.dispose();
    }
    
    public final void tu() {
        this.f.tu();
    }
}
