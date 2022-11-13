import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbm implements Future, dbf, dbe
{
    private boolean a;
    private Object b;
    private dbj c;
    
    private dbm() {
        this.a = false;
    }
    
    public static dbm c() {
        return new dbm();
    }
    
    private final Object d(final Long n) {
        monitorenter(this);
        try {
            if (this.c != null) {
                throw new ExecutionException(this.c);
            }
            if (this.a) {
                final Object b = this.b;
                monitorexit(this);
                return b;
            }
            if (n == null) {
                while (!this.isDone()) {
                    this.wait(0L);
                }
            }
            else if (n > 0L) {
                for (long n2 = SystemClock.uptimeMillis(), n3 = n + n2; !this.isDone() && n2 < n3; n2 = SystemClock.uptimeMillis()) {
                    this.wait(n3 - n2);
                }
            }
            if (this.c != null) {
                throw new ExecutionException(this.c);
            }
            if (this.a) {
                final Object b2 = this.b;
                monitorexit(this);
                return b2;
            }
            throw new TimeoutException();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void a(final dbj c) {
        synchronized (this) {
            this.c = c;
            this.notifyAll();
        }
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        monitorenter(this);
        monitorexit(this);
        return false;
    }
    
    @Override
    public final Object get() {
        try {
            return this.d(null);
        }
        catch (final TimeoutException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.d(TimeUnit.MILLISECONDS.convert(n, timeUnit));
    }
    
    @Override
    public final boolean isCancelled() {
        return false;
    }
    
    @Override
    public final boolean isDone() {
        synchronized (this) {
            return this.a || this.c != null;
        }
    }
    
    @Override
    public final void mX(final Object b) {
        synchronized (this) {
            this.a = true;
            this.b = b;
            this.notifyAll();
        }
    }
}
