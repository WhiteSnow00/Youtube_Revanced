import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqy extends atrl implements Runnable
{
    private static volatile Thread _thread;
    public static final atqy c;
    private static volatile int debugStatus;
    private static final long g;
    
    static {
        atrk.o((atrk)(c = new atqy()));
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
    
    private atqy() {
    }
    
    private final Thread q() {
        synchronized (this) {
            final Thread thread = atqy._thread;
            if (thread == null) {
                final Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                (atqy._thread = thread2).setDaemon(true);
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
            atqy.debugStatus = 3;
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
            atqy.debugStatus = 1;
            this.notifyAll();
            return true;
        }
    }
    
    private static final boolean t() {
        final int debugStatus = atqy.debugStatus;
        return debugStatus == 2 || debugStatus == 3;
    }
    
    protected final Thread c() {
        Thread thread;
        if ((thread = atqy._thread) == null) {
            thread = this.q();
        }
        return thread;
    }
    
    @Override
    public final void f(final Runnable runnable) {
        if (atqy.debugStatus != 4) {
            super.f(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
    
    @Override
    public final void g() {
        atqy.debugStatus = 4;
        super.g();
    }
    
    @Override
    public final void run() {
        final ThreadLocal a = atsq.a;
        atsq.a.set(this);
        try {
            if (!this.s()) {
                atqy._thread = null;
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
                        n3 = atqy.g + nanoTime;
                    }
                    final long n4 = n3 - nanoTime;
                    if (n4 <= 0L) {
                        atqy._thread = null;
                        this.r();
                        if (!this.p()) {
                            this.c();
                        }
                        return;
                    }
                    n2 = aryu.h(Long.MAX_VALUE, n4);
                }
                else {
                    n3 = Long.MAX_VALUE;
                }
                n = n3;
                if (n2 > 0L) {
                    if (t()) {
                        atqy._thread = null;
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
            atqy._thread = null;
            this.r();
            Label_0217: {
                if (this.p()) {
                    break Label_0217;
                }
                this.c();
                break Label_0217;
            }
            while (true) {}
        }
    }
}
