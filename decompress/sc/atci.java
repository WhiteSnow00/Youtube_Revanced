import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atci extends asht
{
    final Object a;
    final asjr b;
    
    public atci(final Object a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    public final void f(final ashy ashy) {
        try {
            final ashw ashw = (ashw)this.b.a(this.a);
            askk.b((Object)ashw, "The mapper returned a null ObservableSource");
            if (ashw instanceof Callable) {
                try {
                    final Object call = ((Callable<Object>)ashw).call();
                    if (call == null) {
                        asjw.d(ashy);
                        return;
                    }
                    final atch atch = new atch(ashy, call);
                    ashy.d((asir)atch);
                    atch.run();
                    return;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    asjw.g(t, ashy);
                    return;
                }
            }
            ashw.aP(ashy);
        }
        finally {
            final Throwable t2;
            asjw.g(t2, ashy);
        }
    }
}
