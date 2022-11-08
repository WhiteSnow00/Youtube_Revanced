import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afug extends afst
{
    public ListenableFuture a;
    public ScheduledFuture b;
    
    public afug(final ListenableFuture a) {
        a.getClass();
        this.a = a;
    }
    
    protected final void b() {
        ((afrl)this).k((Future)this.a);
        final ScheduledFuture b = this.b;
        if (b != null) {
            b.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
    
    protected final String ns() {
        final ListenableFuture a = this.a;
        final ScheduledFuture b = this.b;
        if (a != null) {
            final String string = a.toString();
            final StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(string);
            sb.append("]");
            String s2;
            final String s = s2 = sb.toString();
            if (b != null) {
                final long delay = b.getDelay(TimeUnit.MILLISECONDS);
                s2 = s;
                if (delay > 0L) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s);
                    sb2.append(", remaining delay=[");
                    sb2.append(delay);
                    sb2.append(" ms]");
                    s2 = sb2.toString();
                }
            }
            return s2;
        }
        return null;
    }
}
