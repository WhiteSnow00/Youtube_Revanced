// 
// Decompiled by Procyon v0.6.0
// 

final class aswd extends askm implements asgz
{
    private static final long serialVersionUID = 7603343402964826922L;
    asic c;
    
    public aswd(final ashj ashj) {
        super(ashj);
    }
    
    public final void b(final Throwable t) {
        this.g(t);
    }
    
    public final void d(final asic c) {
        if (asjg.g(this.c, c)) {
            this.c = c;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        super.dispose();
        this.c.dispose();
    }
    
    public final void tp(final Object o) {
        this.f(o);
    }
    
    public final void tu() {
        if ((this.get() & 0x36) != 0x0) {
            return;
        }
        this.lazySet(2);
        super.a.tu();
    }
}
