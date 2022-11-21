import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afxw implements ThreadFactory
{
    final ThreadFactory a;
    final String b;
    final AtomicLong c;
    final Boolean d;
    final Integer e;
    
    public afxw(final ThreadFactory a, final String b, final AtomicLong c, final Boolean d, final Integer e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.a.newThread(runnable);
        final String b = this.b;
        if (b != null) {
            final AtomicLong c = this.c;
            c.getClass();
            thread.setName(arxs.i(b, c.getAndIncrement()));
        }
        final Boolean d = this.d;
        if (d != null) {
            thread.setDaemon(d);
        }
        final Integer e = this.e;
        if (e != null) {
            thread.setPriority(e);
        }
        return thread;
    }
}
