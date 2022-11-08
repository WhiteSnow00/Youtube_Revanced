// 
// Decompiled by Procyon v0.6.0
// 

final class atfh extends askm implements ashq
{
    private static final long serialVersionUID = 3786543492451018833L;
    asic c;
    
    public atfh(final ashj ashj) {
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
}
