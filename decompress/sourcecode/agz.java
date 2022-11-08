import android.os.Handler;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agz
{
    public static ComponentName a(final Context context, final Intent intent) {
        return context.startForegroundService(intent);
    }
    
    static Intent b(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, String concat, final Handler handler, final int n) {
        if ((n & 0x4) == 0x0 || concat != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, concat, handler, n & 0x1);
        }
        concat = String.valueOf(context.getPackageName()).concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        if (te.c(context, concat) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, concat, handler);
        }
        final StringBuilder sb = new StringBuilder("Permission ");
        sb.append(concat);
        sb.append(" is required by your application to receive broadcasts, please add it to your manifest");
        throw new RuntimeException(sb.toString());
    }
}
