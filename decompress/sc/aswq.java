// 
// Decompiled by Procyon v0.6.0
// 

final class aswq extends athv implements asho
{
    private static final long serialVersionUID = 7603343402964826922L;
    asir a;
    
    public aswq(final aukf aukf) {
        super(aukf);
    }
    
    public final void b(final Throwable t) {
        this.f.b(t);
    }
    
    public final void d(final asir a) {
        if (asjv.g(this.a, a)) {
            this.a = a;
            this.f.f((aukg)this);
        }
    }
    
    public final void ts(final Object o) {
        this.g(o);
    }
    
    public final void tt() {
        super.tt();
        this.a.dispose();
    }
    
    public final void tx() {
        this.f.tx();
    }
}
