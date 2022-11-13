import android.os.Message;
import java.util.concurrent.TimeUnit;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class asim extends asic
{
    private final Handler a;
    private volatile boolean b;
    
    public asim(final Handler a) {
        this.a = a;
    }
    
    @Override
    public final asir b(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.b) {
            return (asir)asjw.a;
        }
        final Runnable i = atqx.i(runnable);
        final Handler a = this.a;
        final asin asin = new asin(a, i);
        final Message obtain = Message.obtain(a, (Runnable)asin);
        obtain.obj = this;
        this.a.sendMessageDelayed(obtain, timeUnit.toMillis(n));
        if (this.b) {
            this.a.removeCallbacks((Runnable)asin);
            return (asir)asjw.a;
        }
        return asin;
    }
    
    @Override
    public final void dispose() {
        this.b = true;
        this.a.removeCallbacksAndMessages((Object)this);
    }
    
    @Override
    public final boolean tA() {
        return this.b;
    }
}
