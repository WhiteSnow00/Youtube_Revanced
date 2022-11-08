import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gc implements Executor
{
    final Queue a;
    final Executor b;
    Runnable c;
    private final Object d;
    
    public gc(final Executor b) {
        this.d = new Object();
        this.a = new ArrayDeque();
        this.b = b;
    }
    
    public final void a() {
        synchronized (this.d) {
            final Runnable c = this.a.poll();
            this.c = c;
            if (c != null) {
                this.b.execute(c);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.d) {
            this.a.add(new da(this, runnable, 3));
            if (this.c == null) {
                this.a();
            }
        }
    }
}
