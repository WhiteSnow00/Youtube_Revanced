// 
// Decompiled by Procyon v0.6.0
// 

public final class asyr extends asht
{
    final ashv a;
    
    public asyr(final ashv a) {
        this.a = a;
    }
    
    protected final void f(final ashy ashy) {
        final asyp asyp = new asyp(ashy);
        ashy.d(asyp);
        try {
            this.a.a((ashu)asyp);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            asyp.b(t);
        }
    }
}
