import android.os.Message;
import java.util.concurrent.TimeUnit;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class asio extends asid
{
    private final Handler b;
    
    public asio(final Handler b) {
        this.b = b;
    }
    
    @Override
    public final asic a() {
        return new asim(this.b);
    }
    
    @Override
    public final asir c(Runnable i, final long n, final TimeUnit timeUnit) {
        if (i == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit != null) {
            i = atqx.i(i);
            final Handler b = this.b;
            final asin asin = new asin(b, i);
            this.b.sendMessageDelayed(Message.obtain(b, (Runnable)asin), timeUnit.toMillis(n));
            return asin;
        }
        throw new NullPointerException("unit == null");
    }
}
