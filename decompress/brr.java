import android.os.SystemClock;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brr implements brs
{
    public static final yrd d;
    public static final yrd e;
    public final ExecutorService a;
    public brn b;
    public IOException c;
    
    static {
        d = new yrd(2, -9223372036854775807L, (short[])null);
        e = new yrd(3, -9223372036854775807L, (short[])null);
    }
    
    public brr(final String s) {
        this.a = baz.W("ExoPlayer:Loader:".concat(s));
    }
    
    public static yrd i(final boolean b, final long n) {
        return new yrd((int)(b ? 1 : 0), n, (short[])null);
    }
    
    @Override
    public final void a() {
        this.d(Integer.MIN_VALUE);
    }
    
    public final void b() {
        final brn b = this.b;
        bad.c(b);
        b.a(false);
    }
    
    public final void c() {
        this.c = null;
    }
    
    public final void d(final int n) {
        final IOException c = this.c;
        if (c == null) {
            final brn b = this.b;
            if (b != null) {
                int a;
                if ((a = n) == Integer.MIN_VALUE) {
                    a = b.a;
                }
                final IOException b2 = b.b;
                if (b2 != null) {
                    if (b.c > a) {
                        throw b2;
                    }
                }
            }
            return;
        }
        throw c;
    }
    
    public final void e(final brp brp) {
        final brn b = this.b;
        if (b != null) {
            b.a(true);
        }
        if (brp != null) {
            this.a.execute((Runnable)new sp(brp, 3));
        }
        this.a.shutdown();
    }
    
    public final boolean f() {
        return this.c != null;
    }
    
    public final boolean g() {
        return this.b != null;
    }
    
    public final void h(final bro bro, final brm brm, final int n) {
        final Looper myLooper = Looper.myLooper();
        bad.c(myLooper);
        this.c = null;
        new brn(this, myLooper, bro, brm, n, SystemClock.elapsedRealtime()).b(0L);
    }
}
