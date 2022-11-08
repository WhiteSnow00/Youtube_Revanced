// 
// Decompiled by Procyon v0.6.0
// 

final class atff extends athd implements ashq
{
    private static final long serialVersionUID = 187782011903685568L;
    asic a;
    
    public atff(final aujp aujp) {
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
}
