import android.content.Intent;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnb
{
    public static final long a;
    public static final Object b;
    public static nmp c;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
        b = new Object();
    }
    
    public static void a(final Intent intent, final boolean b) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", b);
    }
    
    public static boolean b(final Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
