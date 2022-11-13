import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxh extends asht
{
    final asht a;
    final asjr b;
    
    public asxh(final asht a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void f(final ashy ashy) {
        final asht a = this.a;
        final asjr b = this.b;
        if (a instanceof Callable) {
            final Callable callable = (Callable)a;
            try {
                final Object call = callable.call();
                ashq ashq;
                if (call != null) {
                    ashq = (ashq)b.a(call);
                    askk.b((Object)ashq, "The mapper returned a null MaybeSource");
                }
                else {
                    ashq = null;
                }
                if (ashq == null) {
                    asjw.d(ashy);
                    return;
                }
                ashq.ag(aswt.a(ashy));
                return;
            }
            finally {
                final Throwable t;
                asgz.c(t);
                asjw.g(t, ashy);
                return;
            }
        }
        a.aP((ashy)new asxg(ashy, b));
    }
}
