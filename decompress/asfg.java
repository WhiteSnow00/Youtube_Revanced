import java.util.logging.Level;
import java.util.ArrayDeque;
import java.util.logging.Logger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class asfg implements Executor
{
    private static final Logger a;
    private boolean b;
    private ArrayDeque c;
    
    static {
        a = Logger.getLogger(asfg.class.getName());
    }
    
    public asfg() {
    }
    
    private final void a() {
        while (true) {
            final Runnable runnable = this.c.poll();
            if (runnable == null) {
                break;
            }
            try {
                runnable.run();
            }
            finally {
                final Throwable t;
                asfg.a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), t);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        if (!this.b) {
            this.b = true;
            try {
                runnable.run();
                if (this.c != null) {
                    this.a();
                }
                this.b = false;
                return;
            }
            finally {
                try {
                    final Logger a = asfg.a;
                    final Level severe = Level.SEVERE;
                    final String string = runnable.toString();
                    final StringBuilder sb = new StringBuilder("Exception while executing runnable ");
                    sb.append(string);
                    final Throwable t;
                    a.logp(severe, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb.toString(), t);
                    if (this.c != null) {
                        this.a();
                    }
                    this.b = false;
                    return;
                }
                finally {
                    if (this.c != null) {
                        this.a();
                    }
                    this.b = false;
                }
            }
        }
        if (this.c == null) {
            this.c = new ArrayDeque(4);
        }
        this.c.add(runnable);
    }
}
