import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbg implements Runnable
{
    private static final Logger a;
    private final Runnable b;
    
    static {
        a = Logger.getLogger(asbg.class.getName());
    }
    
    public asbg(final Runnable b) {
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            this.b.run();
        }
        finally {
            final Throwable t;
            asbg.a.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.b.toString()), t);
            aeyv.e(t);
            throw new AssertionError((Object)t);
        }
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("LogExceptionRunnable(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
