import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atfh extends asie
{
    final Callable a;
    
    public atfh(final Callable a) {
        this.a = a;
    }
    
    protected final void af(final asif asif) {
        final asir c = asfn.c();
        asif.d(c);
        if (c.tA()) {
            return;
        }
        try {
            final Object call = this.a.call();
            askk.b(call, "The callable returned a null value");
            if (!c.tA()) {
                asif.ts(call);
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            if (!c.tA()) {
                asif.b(t);
                return;
            }
            atqx.j(t);
        }
    }
}
