import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.Queue;
import java.util.logging.Logger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ased implements Executor, Runnable
{
    private static final Logger b;
    private static final asea c;
    public volatile int a;
    private final Executor d;
    private final Queue e;
    
    static {
        b = Logger.getLogger(ased.class.getName());
        asec c2 = null;
        try {
            final aseb aseb = new aseb((AtomicIntegerFieldUpdater)AtomicIntegerFieldUpdater.newUpdater(ased.class, "a"));
        }
        finally {
            final Throwable t;
            ased.b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", t);
            c2 = new asec();
        }
        c = (asea)c2;
    }
    
    public ased(final Executor d) {
        this.e = new ConcurrentLinkedQueue();
        this.a = 0;
        d.getClass();
        this.d = d;
    }
    
    private final void a(final Runnable runnable) {
        if (ased.c.a(this)) {
            try {
                this.d.execute(this);
            }
            finally {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                ased.c.b(this);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        final Queue e = this.e;
        runnable.getClass();
        e.add(runnable);
        this.a(runnable);
    }
    
    @Override
    public final void run() {
        try {
            while (this.d == this.d) {
                final Runnable runnable = this.e.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                }
                catch (final RuntimeException ex) {
                    final Logger b = ased.b;
                    final Level severe = Level.SEVERE;
                    final String string = runnable.toString();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Exception while executing runnable ");
                    sb.append(string);
                    b.logp(severe, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), ex);
                }
            }
            ased.c.b(this);
            if (!this.e.isEmpty()) {
                this.a(null);
            }
        }
        finally {
            ased.c.b(this);
            while (true) {}
        }
    }
}
