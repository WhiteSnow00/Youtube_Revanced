// 
// Decompiled by Procyon v0.6.0
// 

final class asws extends aslb implements asho
{
    private static final long serialVersionUID = 7603343402964826922L;
    asir c;
    
    public asws(final ashy ashy) {
        super(ashy);
    }
    
    public final void b(final Throwable t) {
        this.g(t);
    }
    
    public final void d(final asir c) {
        if (asjv.g(this.c, c)) {
            this.c = c;
            this.a.d((asir)this);
        }
    }
    
    public final void dispose() {
        super.dispose();
        this.c.dispose();
    }
    
    public final void ts(final Object o) {
        this.f(o);
    }
    
    public final void tx() {
        if ((this.get() & 0x36) != 0x0) {
            return;
        }
        this.lazySet(2);
        super.a.tx();
    }
}
