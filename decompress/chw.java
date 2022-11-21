import android.graphics.Path;
import android.os.Trace;

// 
// Decompiled by Procyon v0.6.0
// 

public class chw
{
    public static boolean a() {
        return Trace.isEnabled();
    }
    
    public static Path b(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(n, n2);
        path.lineTo(n3, n4);
        return path;
    }
    
    public static String c(final int n) {
        switch (n) {
            default: {
                return "null";
            }
            case 6: {
                return "CANCELLED";
            }
            case 5: {
                return "BLOCKED";
            }
            case 4: {
                return "FAILED";
            }
            case 3: {
                return "SUCCEEDED";
            }
            case 2: {
                return "RUNNING";
            }
            case 1: {
                return "ENQUEUED";
            }
        }
    }
    
    public static boolean d(final int n) {
        return n == 3 || n == 4 || n == 6;
    }
    
    public static void e(final int n) {
        if (n != 0) {
            return;
        }
        throw null;
    }
}
