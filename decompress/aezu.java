import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class aezu extends afco
{
    public aezu() {
    }
    
    @Override
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
