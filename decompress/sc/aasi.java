import java.util.ArrayList;
import java.util.List;
import android.os.Handler;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasi extends HandlerThread
{
    public Handler a;
    public final List b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public final Runnable g;
    public volatile boolean h;
    public long i;
    public long j;
    public long k;
    public final Handler l;
    public final yzz m;
    public fon n;
    
    public aasi(final Handler l, final yzz m) {
        super("aasi");
        this.b = new ArrayList();
        this.c = -1L;
        this.d = 0L;
        this.n = null;
        this.e = 0L;
        this.f = false;
        this.h = false;
        this.i = 0L;
        this.j = System.currentTimeMillis();
        this.k = -1L;
        this.l = l;
        this.m = m;
        this.g = new aasg(this);
    }
    
    static byte a(final byte[] array, final byte b) {
        int n = 0;
        byte b2 = b;
        while (true) {
            final byte b3 = array[n];
            if (b3 == b || n >= 256) {
                break;
            }
            array[n] = b2;
            ++n;
            b2 = b3;
        }
        array[n] = b2;
        return (byte)n;
    }
    
    public final void b(final byte[] array, final long c) {
        long c2;
        if ((c2 = this.c) == -1L) {
            this.c = c;
            c2 = c;
        }
        this.d = c - c2;
        this.b.add(array);
    }
    
    public final void c(final long n) {
        final Handler a = this.a;
        if (a != null) {
            a.postDelayed(this.g, n);
        }
    }
    
    public final void start() {
        synchronized (this) {
            super.start();
            this.a = new Handler(this.getLooper());
            this.c(30000L);
        }
    }
}
