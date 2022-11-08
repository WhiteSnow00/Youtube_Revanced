import java.util.logging.Level;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class arsc implements Runnable
{
    final arsa a;
    public final arsg b;
    private final Executor c;
    
    public arsc(final Executor c, final arsa a, final arsg b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    final void a() {
        try {
            this.c.execute(this);
        }
        finally {
            final Throwable t;
            arsg.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", t);
        }
    }
    
    @Override
    public final void run() {
        this.a.a(this.b);
    }
}
