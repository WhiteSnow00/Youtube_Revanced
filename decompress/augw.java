import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class augw implements Executor
{
    public final Executor a;
    public final Runnable b;
    public final ArrayDeque c;
    public boolean d;
    
    public augw(final Executor a) {
        this.b = new augg(this, 11);
        this.c = new ArrayDeque();
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            }
            catch (final RejectedExecutionException ex) {
                this.c.removeLast();
            }
        }
    }
}
