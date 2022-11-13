import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.Queue;
import java.util.logging.Logger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfk implements Executor, Runnable
{
    private static final Logger b;
    private static final asfh c;
    public volatile int a;
    private final Executor d;
    private final Queue e;
    
    static {
        b = Logger.getLogger(asfk.class.getName());
        asfj c2 = null;
        try {
            final asfi asfi = new asfi(AtomicIntegerFieldUpdater.newUpdater(asfk.class, "a"));
        }
        finally {
            final Throwable t;
            asfk.b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", t);
            c2 = new asfj();
        }
        c = c2;
    }
    
    public asfk(final Executor d) {
        this.e = new ConcurrentLinkedQueue();
        this.a = 0;
        d.getClass();
        this.d = d;
    }
    
    private final void a(final Runnable runnable) {
        if (asfk.c.a(this)) {
            try {
                this.d.execute(this);
            }
            finally {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                asfk.c.b(this);
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
                    final Logger b = asfk.b;
                    final Level severe = Level.SEVERE;
                    final String string = runnable.toString();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Exception while executing runnable ");
                    sb.append(string);
                    b.logp(severe, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), ex);
                }
            }
            asfk.c.b(this);
            if (!this.e.isEmpty()) {
                this.a(null);
            }
        }
        finally {
            asfk.c.b(this);
            while (true) {}
        }
    }
}
