import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqd extends atqq implements Runnable
{
    private static volatile Thread _thread;
    public static final atqd c;
    private static volatile int debugStatus;
    private static final long g;
    
    static {
        atqp.o((atqp)(c = new atqd()));
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        Long n;
        try {
            n = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (final SecurityException ex) {
            n = 1000L;
        }
        g = milliseconds.toNanos(n);
    }
    
    private atqd() {
    }
    
    private final Thread q() {
        synchronized (this) {
            final Thread thread = atqd._thread;
            if (thread == null) {
                final Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                (atqd._thread = thread2).setDaemon(true);
                thread2.start();
                return thread2;
            }
            return thread;
        }
    }
    
    private final void r() {
        synchronized (this) {
            if (!t()) {
                return;
            }
            atqd.debugStatus = 3;
            super.e.c((Object)null);
            super.f.c((Object)null);
            this.notifyAll();
        }
    }
    
    private final boolean s() {
        synchronized (this) {
            if (t()) {
                return false;
            }
            atqd.debugStatus = 1;
            this.notifyAll();
            return true;
        }
    }
    
    private static final boolean t() {
        final int debugStatus = atqd.debugStatus;
        return debugStatus == 2 || debugStatus == 3;
    }
    
    protected final Thread c() {
        Thread thread;
        if ((thread = atqd._thread) == null) {
            thread = this.q();
        }
        return thread;
    }
    
    @Override
    public final void f(final Runnable runnable) {
        if (atqd.debugStatus != 4) {
            super.f(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
    
    @Override
    public final void g() {
        atqd.debugStatus = 4;
        super.g();
    }
    
    @Override
    public final void run() {
        final ThreadLocal a = atrv.a;
        atrv.a.set(this);
        try {
            if (!this.s()) {
                atqd._thread = null;
                this.r();
                if (!this.p()) {
                    this.c();
                }
                return;
            }
            long n = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long n2 = this.h();
                long n3;
                if (n2 == Long.MAX_VALUE) {
                    final long nanoTime = System.nanoTime();
                    n3 = n;
                    if (n == Long.MAX_VALUE) {
                        n3 = atqd.g + nanoTime;
                    }
                    final long n4 = n3 - nanoTime;
                    if (n4 <= 0L) {
                        atqd._thread = null;
                        this.r();
                        if (!this.p()) {
                            this.c();
                        }
                        return;
                    }
                    n2 = atnp.g(Long.MAX_VALUE, n4);
                }
                else {
                    n3 = Long.MAX_VALUE;
                }
                n = n3;
                if (n2 > 0L) {
                    if (t()) {
                        atqd._thread = null;
                        this.r();
                        if (!this.p()) {
                            this.c();
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, n2);
                    n = n3;
                }
            }
        }
        finally {
            atqd._thread = null;
            this.r();
            Label_0215: {
                if (this.p()) {
                    break Label_0215;
                }
                this.c();
                break Label_0215;
            }
            while (true) {}
        }
    }
}
