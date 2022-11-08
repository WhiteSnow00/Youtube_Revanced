import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asuu extends asgy
{
    final Future a;
    
    public asuu(final Future a) {
        this.a = a;
    }
    
    protected final void ah(final asgz asgz) {
        final asic a = arxj.a();
        asgz.d(a);
        if (!a.tx()) {
            try {
                final Object b = ((aftm)this.a).b;
                if (!a.tx()) {
                    if (b == null) {
                        asgz.tu();
                        return;
                    }
                    asgz.tp(b);
                }
            }
            finally {
                final Throwable t;
                Throwable cause = t;
                if (t instanceof ExecutionException) {
                    cause = t.getCause();
                }
                asey.d(cause);
                if (!a.tx()) {
                    asgz.b(cause);
                }
            }
        }
    }
}
