// 
// Decompiled by Procyon v0.6.0
// 

final class asux implements asif, asir
{
    final asho a;
    final asjs b;
    asir c;
    
    public asux(final asho a, final asjs b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir c) {
        if (asjv.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        final asir c = this.c;
        this.c = (asir)asjv.a;
        c.dispose();
    }
    
    @Override
    public final boolean tA() {
        return this.c.tA();
    }
    
    @Override
    public final void ts(final Object o) {
        try {
            if (this.b.a(o)) {
                this.a.ts(o);
                return;
            }
            this.a.tx();
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.a.b(t);
        }
    }
}
