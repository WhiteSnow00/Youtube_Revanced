import android.util.Log;
import android.os.PowerManager$WakeLock;
import android.content.Intent;
import android.util.SparseArray;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class att extends BroadcastReceiver
{
    public static final SparseArray a;
    public static int b;
    
    static {
        a = new SparseArray();
        att.b = 1;
    }
    
    public static void a(Intent a) {
        int n;
        if ((n = a.getIntExtra("androidx.contentpager.content.wakelockid", 0)) == 0) {
            n = a.getIntExtra("android.support.content.wakelockid", 0);
            if (n == 0) {
                return;
            }
        }
        a = (Intent)att.a;
        synchronized (a) {
            final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((SparseArray)a).get(n);
            if (powerManager$WakeLock != null) {
                powerManager$WakeLock.release();
                ((SparseArray)a).remove(n);
                return;
            }
            final StringBuilder sb = new StringBuilder("No active wake lock id #");
            sb.append(n);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
        }
    }
}
