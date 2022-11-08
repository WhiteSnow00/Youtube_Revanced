import java.lang.ref.WeakReference;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxj
{
    private static adxj e;
    public final Object a;
    public final Handler b;
    public adxi c;
    public adxi d;
    
    private adxj() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new adxh(this));
    }
    
    public static adxj a() {
        if (adxj.e == null) {
            adxj.e = new adxj();
        }
        return adxj.e;
    }
    
    public final void b(final adxi adxi) {
        int a = adxi.a;
        if (a == -2) {
            return;
        }
        if (a <= 0) {
            if (a == -1) {
                a = 1500;
            }
            else {
                a = 2750;
            }
        }
        this.b.removeCallbacksAndMessages((Object)adxi);
        final Handler b = this.b;
        b.sendMessageDelayed(Message.obtain(b, 0, (Object)adxi), (long)a);
    }
    
    public final void c() {
        final adxi d = this.d;
        if (d != null) {
            this.c = d;
            this.d = null;
            final aepj aepj = (aepj)((WeakReference)d.c).get();
            if (aepj != null) {
                adxd.b.sendMessage(adxd.b.obtainMessage(0, aepj.a));
                return;
            }
            this.c = null;
        }
    }
    
    public final boolean d(final adxi adxi, final int n) {
        final aepj aepj = (aepj)((WeakReference)adxi.c).get();
        if (aepj != null) {
            this.b.removeCallbacksAndMessages((Object)adxi);
            adxd.b.sendMessage(adxd.b.obtainMessage(1, n, 0, aepj.a));
            return true;
        }
        return false;
    }
    
    public final void e(final aepj aepj) {
        synchronized (this.a) {
            if (this.g(aepj)) {
                final adxi c = this.c;
                if (!c.b) {
                    c.b = true;
                    this.b.removeCallbacksAndMessages((Object)c);
                }
            }
        }
    }
    
    public final void f(final aepj aepj) {
        synchronized (this.a) {
            if (this.g(aepj)) {
                final adxi c = this.c;
                if (c.b) {
                    c.b = false;
                    this.b(c);
                }
            }
        }
    }
    
    public final boolean g(final aepj aepj) {
        final adxi c = this.c;
        return c != null && c.a(aepj);
    }
    
    public final boolean h(final aepj aepj) {
        final adxi d = this.d;
        return d != null && d.a(aepj);
    }
}
