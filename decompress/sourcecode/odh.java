import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import android.os.Build;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

final class odh
{
    private static final boolean a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean a2 = false;
        if (sdk_INT >= 29) {
            final String[] supported_32_BIT_ABIS = Build.SUPPORTED_32_BIT_ABIS;
            final int length = supported_32_BIT_ABIS.length;
            int n = 0;
            while (true) {
                a2 = a2;
                if (n >= length) {
                    break;
                }
                if (Build.CPU_ABI.equals(supported_32_BIT_ABIS[n])) {
                    a2 = true;
                    break;
                }
                ++n;
            }
        }
        a = a2;
    }
    
    public static Object a(final Future future, long n, final TimeUnit timeUnit) {
        Label_0056: {
            if (odh.a && !(future instanceof afrl) && !(future instanceof odg)) {
                if (TimeUnit.NANOSECONDS.convert(n, timeUnit) > 2147483647999999999L) {
                    if (!future.isDone()) {
                        break Label_0056;
                    }
                }
            }
            future.get(n, timeUnit);
        }
        final long nanos = timeUnit.toNanos(n);
        final long nanoTime = System.nanoTime();
        n = nanos;
        try {
            return future.get(Math.min(n, 2147483647999999999L), TimeUnit.NANOSECONDS);
        }
        catch (final TimeoutException ex) {
            n = nanoTime + nanos - System.nanoTime();
            return future.get(Math.min(n, 2147483647999999999L), TimeUnit.NANOSECONDS);
        }
    }
    
    public static RunnableScheduledFuture b(final RunnableScheduledFuture runnableScheduledFuture) {
        if (odh.a) {
            return new odg(runnableScheduledFuture);
        }
        return runnableScheduledFuture;
    }
}
