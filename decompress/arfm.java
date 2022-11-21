import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfm
{
    private static final Handler a;
    
    static {
        a = new Handler(Looper.getMainLooper());
    }
    
    public static void a(final Runnable runnable) {
        final Handler a = arfm.a;
        if (a.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        a.post(runnable);
    }
}
