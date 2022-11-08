import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asws extends ashe
{
    final ashe a;
    final asjc b;
    
    public asws(final ashe a, final asjc b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void f(final ashj ashj) {
        final ashe a = this.a;
        final asjc b = this.b;
        if (a instanceof Callable) {
            final Callable callable = (Callable)a;
            try {
                final Object call = callable.call();
                ashb ashb;
                if (call != null) {
                    ashb = (ashb)b.a(call);
                    asjv.b((Object)ashb, "The mapper returned a null MaybeSource");
                }
                else {
                    ashb = null;
                }
                if (ashb == null) {
                    asjh.d(ashj);
                    return;
                }
                ashb.ag(aswe.a(ashj));
                return;
            }
            finally {
                final Throwable t;
                asey.d(t);
                asjh.g(t, ashj);
                return;
            }
        }
        a.aJ((ashj)new aswr(ashj, b));
    }
}
