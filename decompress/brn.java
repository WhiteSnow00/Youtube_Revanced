import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import android.os.Looper;
import java.io.IOException;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class brn extends Handler implements Runnable
{
    public final int a;
    public IOException b;
    public int c;
    final brr d;
    private final bro e;
    private final long f;
    private brm g;
    private Thread h;
    private boolean i;
    private volatile boolean j;
    
    public brn(final brr d, final Looper looper, final bro e, final brm g, final int a, final long f) {
        this.d = d;
        super(looper);
        this.e = e;
        this.g = g;
        this.a = a;
        this.f = f;
    }
    
    private final void c() {
        this.b = null;
        final brr d = this.d;
        final ExecutorService a = d.a;
        final brn b = d.b;
        bad.b(b);
        a.execute(b);
    }
    
    private final void d() {
        this.d.b = null;
    }
    
    public final void a(final boolean j) {
        this.j = j;
        this.b = null;
        Label_0072: {
            if (this.hasMessages(0)) {
                this.i = true;
                this.removeMessages(0);
                if (!j) {
                    this.sendEmptyMessage(1);
                    break Label_0072;
                }
                break Label_0072;
            }
            synchronized (this) {
                this.i = true;
                this.e.a();
                final Thread h = this.h;
                if (h != null) {
                    h.interrupt();
                }
                monitorexit(this);
                if (j) {
                    this.d();
                    SystemClock.elapsedRealtime();
                    final brm g = this.g;
                    bad.b(g);
                    g.lb(this.e, true);
                    this.g = null;
                }
            }
        }
    }
    
    public final void b(final long n) {
        bad.f(this.d.b == null);
        this.d.b = this;
        if (n > 0L) {
            this.sendEmptyMessageDelayed(0, n);
            return;
        }
        this.c();
    }
    
    public final void handleMessage(final Message message) {
        if (this.j) {
            return;
        }
        if (message.what == 0) {
            this.c();
            return;
        }
        if (message.what != 3) {
            this.d();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long f = this.f;
            final brm g = this.g;
            bad.b(g);
            if (this.i) {
                g.lb(this.e, false);
                return;
            }
            final int what = message.what;
            if (what != 1) {
                if (what == 2) {
                    final IOException b = (IOException)message.obj;
                    this.b = b;
                    final int c = this.c + 1;
                    this.c = c;
                    final yrd kz = g.kZ(this.e, b, c);
                    final int b2 = kz.b;
                    if (b2 == 3) {
                        this.d.c = this.b;
                        return;
                    }
                    if (b2 != 2) {
                        if (b2 == 1) {
                            this.c = 1;
                        }
                        long a;
                        if ((a = kz.a) == -9223372036854775807L) {
                            a = Math.min((this.c - 1) * 1000, 5000);
                        }
                        this.b(a);
                    }
                }
                return;
            }
            try {
                g.kY(this.e, elapsedRealtime, elapsedRealtime - f);
                return;
            }
            catch (final RuntimeException ex) {
                baq.b("LoadTask", "Unexpected exception handling load completed", ex);
                this.d.c = new brq(ex);
                return;
            }
        }
        throw (Error)message.obj;
    }
    
    public final void run() {
        try {
            synchronized (this) {
                final boolean i = this.i;
                this.h = Thread.currentThread();
                monitorexit(this);
                if (i ^ true) {
                    this.e.getClass().getSimpleName();
                    final int a = baz.a;
                    try {
                        this.e.b();
                    }
                    finally {}
                }
                synchronized (this) {
                    this.h = null;
                    Thread.interrupted();
                    monitorexit(this);
                    if (!this.j) {
                        this.sendEmptyMessage(1);
                    }
                }
            }
        }
        catch (final Error error) {
            if (!this.j) {
                baq.b("LoadTask", "Unexpected error loading stream", error);
                this.obtainMessage(3, (Object)error).sendToTarget();
            }
            throw error;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            if (!this.j) {
                baq.b("LoadTask", "OutOfMemory error loading stream", outOfMemoryError);
                this.obtainMessage(2, (Object)new brq(outOfMemoryError)).sendToTarget();
            }
        }
        catch (final Exception ex) {
            if (!this.j) {
                baq.b("LoadTask", "Unexpected exception loading stream", ex);
                this.obtainMessage(2, (Object)new brq(ex)).sendToTarget();
            }
        }
        catch (final IOException ex2) {
            if (!this.j) {
                this.obtainMessage(2, (Object)ex2).sendToTarget();
            }
        }
    }
}
