import java.util.concurrent.ThreadFactory;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocp
{
    public static final int[] a;
    
    static {
        "ranchu".equals(Build.HARDWARE);
        a = new int[] { 19, 16, 13, 10, 0, -2, -4, -5, -6, -8 };
    }
    
    public static ThreadFactory a(final int n, final ThreadFactory threadFactory) {
        return new oco(n, threadFactory);
    }
}
