import java.util.Locale;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnh
{
    public static final Object a;
    public long b;
    mng c;
    Runnable d;
    private final long e;
    private final Handler f;
    
    static {
        new mnb("RequestTracker");
        a = new Object();
    }
    
    public mnh(final long e) {
        this.e = e;
        this.b = -1L;
        this.f = new aeke(Looper.getMainLooper(), (byte[])null);
    }
    
    private final void g(final int n, final Object o) {
        synchronized (mnh.a) {
            final mng c = this.c;
            if (c != null) {
                c.a(this.b, n, o);
            }
            this.b = -1L;
            this.c = null;
            synchronized (mnh.a) {
                final Runnable d = this.d;
                if (d == null) {
                    monitorexit(mnh.a);
                }
                else {
                    this.f.removeCallbacks(d);
                    this.d = null;
                }
            }
        }
    }
    
    public final void a(final long b, final mng c) {
        synchronized (mnh.a) {
            final mng c2 = this.c;
            final long b2 = this.b;
            this.b = b;
            this.c = c;
            monitorexit(mnh.a);
            if (c2 != null) {
                c2.b(b2);
            }
            synchronized (mnh.a) {
                final Runnable d = this.d;
                if (d != null) {
                    this.f.removeCallbacks(d);
                }
                final mkn d2 = new mkn(this, 3);
                this.d = d2;
                this.f.postDelayed((Runnable)d2, this.e);
            }
        }
    }
    
    public final boolean b() {
        synchronized (mnh.a) {
            return this.b != -1L;
        }
    }
    
    public final boolean c(final long n) {
        synchronized (mnh.a) {
            final long b = this.b;
            boolean b2 = false;
            if (b != -1L) {
                b2 = b2;
                if (b == n) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    public final void d(final int n) {
        synchronized (mnh.a) {
            if (this.b != -1L) {
                String.format(Locale.ROOT, "clearing request %d", this.b);
                this.g(n, null);
            }
        }
    }
    
    public final void e(final long n, final int n2) {
        this.f(n, n2, null);
    }
    
    public final void f(final long n, final int n2, final Object o) {
        synchronized (mnh.a) {
            final long b = this.b;
            if (b != -1L && b == n) {
                String.format(Locale.ROOT, "request %d completed", n);
                this.g(n2, o);
            }
        }
    }
}
