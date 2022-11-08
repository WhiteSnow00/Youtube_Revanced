import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nac
{
    public static final int a;
    
    static {
        int a2;
        if (Build$VERSION.SDK_INT >= 31) {
            a2 = 33554432;
        }
        else {
            a2 = 0;
        }
        a = a2;
    }
    
    public static PendingIntent a(final Context context, final Intent intent, final int n) {
        return PendingIntent.getActivity(context, 0, intent, n);
    }
    
    public static PendingIntent b(final Context context, final Intent intent, final int n) {
        return PendingIntent.getBroadcast(context, 0, intent, n);
    }
}
