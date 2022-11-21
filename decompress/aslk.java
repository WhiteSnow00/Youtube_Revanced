import android.os.Message;
import java.util.concurrent.TimeUnit;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslk extends askz
{
    private final Handler b;
    
    public aslk(final Handler b) {
        this.b = b;
    }
    
    @Override
    public final asky a() {
        return (asky)new asli(this.b);
    }
    
    @Override
    public final asln c(Runnable v, final long n, final TimeUnit timeUnit) {
        if (v == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit != null) {
            v = aqvq.v(v);
            final Handler b = this.b;
            final aslj aslj = new aslj(b, v);
            this.b.sendMessageDelayed(Message.obtain(b, (Runnable)aslj), timeUnit.toMillis(n));
            return aslj;
        }
        throw new NullPointerException("unit == null");
    }
}
