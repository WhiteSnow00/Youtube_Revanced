import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asvj extends ashn
{
    final Future a;
    
    public asvj(final Future a) {
        this.a = a;
    }
    
    protected final void ah(final asho asho) {
        final asir c = asfn.c();
        asho.d(c);
        if (!c.tA()) {
            try {
                final Object b = ((afvn)this.a).b;
                if (!c.tA()) {
                    if (b == null) {
                        asho.tx();
                        return;
                    }
                    asho.ts(b);
                }
            }
            finally {
                final Throwable t;
                Throwable cause = t;
                if (t instanceof ExecutionException) {
                    cause = t.getCause();
                }
                asgz.c(cause);
                if (!c.tA()) {
                    asho.b(cause);
                }
            }
        }
    }
}
