import android.app.ActivityManager;
import android.content.Intent;
import android.content.Context;
import android.app.ActivityManager$RunningAppProcessInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakw
{
    private static final ActivityManager$RunningAppProcessInfo a;
    
    static {
        a = new ActivityManager$RunningAppProcessInfo();
    }
    
    public static boolean a(final Context context, final Intent intent) {
        final ActivityManager$RunningAppProcessInfo a = aakw.a;
        ActivityManager.getMyMemoryState(a);
        final int importance = a.importance;
        final boolean b = true;
        if (importance != 125) {
            aaky.a = (a.importance != 100 && a.importance != 200);
        }
        boolean b2;
        try {
            tqf.al(context, intent);
            b2 = b;
        }
        catch (final RuntimeException ex) {
            b2 = false;
        }
        return b2;
    }
}
