import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyg extends asie implements askn
{
    final ashw a;
    final Callable b;
    final asjh c;
    
    public asyg(final ashw a, final Callable b, final asjh c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final asht a() {
        final asye asye = new asye(this.a, this.b, this.c);
        final asjr l = atqx.l;
        return (asht)asye;
    }
    
    protected final void af(final asif asif) {
        try {
            final Object call = this.b.call();
            askk.b(call, "The initialSupplier returned a null value");
            this.a.aP(new asyf(asif, call, this.c, 0));
        }
        finally {
            final Throwable t;
            asjw.h(t, asif);
        }
    }
}
