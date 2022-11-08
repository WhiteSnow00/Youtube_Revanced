import android.os.Message;
import java.util.concurrent.TimeUnit;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class ashz extends asho
{
    private final Handler b;
    
    public ashz(final Handler b) {
        this.b = b;
    }
    
    public final ashn a() {
        return (ashn)new ashx(this.b);
    }
    
    public final asic c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit != null) {
            final Runnable q = aulo.q(runnable);
            final Handler b = this.b;
            final ashy ashy = new ashy(b, q);
            this.b.sendMessageDelayed(Message.obtain(b, (Runnable)ashy), timeUnit.toMillis(n));
            return (asic)ashy;
        }
        throw new NullPointerException("unit == null");
    }
}
