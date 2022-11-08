import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaa implements Executor
{
    public final Deque a;
    public long b;
    public int c;
    private final Executor d;
    private final uy e;
    
    public aaa(final Executor d) {
        this.a = new ArrayDeque();
        this.e = new uy(this, 7);
        this.c = 1;
        this.b = 0L;
        this.d = d;
    }
    
    @Override
    public final void execute(final Runnable error) {
        aff.k((Object)error);
        synchronized (this.a) {
            final int c = this.c;
            if (c != 4) {
                if (c != 3) {
                    final long b = this.b;
                    final uy uy = new uy((Runnable)error, 6);
                    this.a.add(uy);
                    this.c = 2;
                    monitorexit(this.a);
                    try {
                        this.d.execute((Runnable)this.e);
                        if (this.c != 2) {
                            return;
                        }
                        synchronized (this.a) {
                            if (this.b == b && this.c == 2) {
                                this.c = 3;
                            }
                            return;
                        }
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex) {}
                    final Deque a = this.a;
                    synchronized (this.a) {
                        final int c2 = this.c;
                        final int n = 0;
                        Label_0184: {
                            if (c2 != 1) {
                                final int n2 = n;
                                if (c2 != 2) {
                                    break Label_0184;
                                }
                            }
                            int n2 = n;
                            if (this.a.removeLastOccurrence(uy)) {
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
            this.a.add(error);
        }
    }
}
