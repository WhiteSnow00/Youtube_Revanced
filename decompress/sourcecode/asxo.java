import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxo extends ashp implements asjy
{
    final ashh a;
    final Callable b;
    final asis c;
    
    public asxo(final ashh a, final Callable b, final asis c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ashe a() {
        final asxm asxm = new asxm(this.a, this.b, this.c);
        final asjc l = aulo.l;
        return (ashe)asxm;
    }
    
    protected final void ae(final ashq ashq) {
        try {
            final Object call = this.b.call();
            asjv.b(call, "The initialSupplier returned a null value");
            this.a.aJ((ashj)new asxn(ashq, call, this.c, 0));
        }
        finally {
            final Throwable t;
            asjh.h(t, ashq);
        }
    }
}
