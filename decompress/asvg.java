import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asvg extends ashn implements Callable
{
    final Callable a;
    
    public asvg(final Callable a) {
        this.a = a;
    }
    
    protected final void ah(final asho asho) {
        final asir c = asfn.c();
        asho.d(c);
        if (!c.tA()) {
            try {
                final Object call = this.a.call();
                if (!c.tA()) {
                    if (call == null) {
                        asho.tx();
                        return;
                    }
                    asho.ts(call);
                }
            }
            finally {
                final Throwable t;
                asgz.c(t);
                if (!c.tA()) {
                    asho.b(t);
                    return;
                }
                atqx.j(t);
            }
        }
    }
    
    public final Object call() {
        return this.a.call();
    }
}
