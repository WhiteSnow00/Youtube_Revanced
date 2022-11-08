import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asur extends asgy implements Callable
{
    final Callable a;
    
    public asur(final Callable a) {
        this.a = a;
    }
    
    protected final void ah(final asgz asgz) {
        final asic a = arxj.a();
        asgz.d(a);
        if (!a.tx()) {
            try {
                final Object call = this.a.call();
                if (!a.tx()) {
                    if (call == null) {
                        asgz.tu();
                        return;
                    }
                    asgz.tp(call);
                }
            }
            finally {
                final Throwable t;
                asey.d(t);
                if (!a.tx()) {
                    asgz.b(t);
                    return;
                }
                aulo.r(t);
            }
        }
    }
    
    public final Object call() {
        return this.a.call();
    }
}
