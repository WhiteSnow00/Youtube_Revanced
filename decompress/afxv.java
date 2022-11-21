import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Logger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxv implements Executor
{
    public static final Logger a;
    public final Deque b;
    public long c;
    public int d;
    private final Executor e;
    private final aenw f;
    
    static {
        a = Logger.getLogger(afxv.class.getName());
    }
    
    public afxv(final Executor e) {
        this.b = new ArrayDeque();
        this.d = 1;
        this.c = 0L;
        this.f = new aenw(this, 2);
        e.getClass();
        this.e = e;
    }
    
    @Override
    public final void execute(final Runnable error) {
        error.getClass();
        synchronized (this.b) {
            final int d = this.d;
            if (d != 4) {
                if (d != 3) {
                    final long c = this.c;
                    final int n = 0;
                    final afxu afxu = new afxu((Runnable)error, 0);
                    this.b.add(afxu);
                    this.d = 2;
                    monitorexit(this.b);
                    try {
                        this.e.execute((Runnable)this.f);
                        if (this.d != 2) {
                            return;
                        }
                        synchronized (this.b) {
                            if (this.c == c && this.d == 2) {
                                this.d = 3;
                            }
                            return;
                        }
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex) {}
                    final Deque b = this.b;
                    synchronized (this.b) {
                        final int d2 = this.d;
                        Label_0188: {
                            if (d2 != 1) {
                                final int n2 = n;
                                if (d2 != 2) {
                                    break Label_0188;
                                }
                            }
                            int n2 = n;
                            if (this.b.removeLastOccurrence(afxu)) {
                                n2 = 1;
                            }
                        }
                        int n2;
                        if (error instanceof RejectedExecutionException && n2 == 0) {
                            return;
                        }
                        throw error;
                    }
                }
            }
            this.b.add(error);
        }
    }
    
    @Override
    public final String toString() {
        final int identityHashCode = System.identityHashCode(this);
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
