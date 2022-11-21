import android.os.Handler;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atpp
{
    public static Context a;
    
    public static boolean a(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static void b(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static Intent c(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, (String)null, (Handler)null, 4);
    }
}
