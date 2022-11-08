import java.util.concurrent.TimeoutException;
import android.os.SystemClock;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfp
{
    public final bfo a;
    public final azl b;
    public int c;
    public Object d;
    public Looper e;
    public final int f;
    public long g;
    public boolean h;
    public boolean i;
    private final bfn j;
    private boolean k;
    private boolean l;
    private boolean m;
    
    public bfp(final bfn j, final bfo a, final azl b, final int f, final Looper e) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = -9223372036854775807L;
        this.h = true;
    }
    
    public final void a(final boolean b) {
        synchronized (this) {
            this.k |= b;
            this.l = true;
            this.notifyAll();
        }
    }
    
    public final boolean b() {
        synchronized (this) {
            return this.m;
        }
    }
    
    public final void c(final long n) {
        monitorenter(this);
        try {
            dk.h(this.i);
            dk.h(this.e.getThread() != Thread.currentThread());
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            long n2 = n;
            while (!this.l) {
                if (n2 <= 0L) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                this.wait(n2);
                n2 = elapsedRealtime + n - SystemClock.elapsedRealtime();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d() {
        synchronized (this) {
            dk.h(this.i);
            this.m = true;
            this.a(false);
        }
    }
    
    public final void e() {
        dk.h(this.i ^ true);
        if (this.g == -9223372036854775807L) {
            dk.f(this.h);
        }
        this.i = true;
        this.j.d(this);
    }
    
    public final void f(final Object d) {
        dk.h(this.i ^ true);
        this.d = d;
    }
    
    public final void g(final int c) {
        dk.h(this.i ^ true);
        this.c = c;
    }
}
