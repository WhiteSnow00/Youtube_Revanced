// 
// Decompiled by Procyon v0.6.0
// 

final class atfz extends aslb implements asif
{
    private static final long serialVersionUID = 3786543492451018833L;
    asir c;
    
    public atfz(final ashy ashy) {
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
}
