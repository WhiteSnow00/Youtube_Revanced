import android.view.View;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtu
{
    public static Paint a;
    public static Paint b;
    public static Rect c;
    public static Paint d;
    public static Paint e;
    
    public static int a(final Resources resources, final int n) {
        return (int)(n * resources.getDisplayMetrics().density + 0.5f);
    }
    
    public static void b(final Canvas canvas, final Paint paint, final int n, final int n2, final int n3, final int n4, final int n5) {
        e(canvas, paint, n, n2, n + n3, n2 + d((float)n4) * n5);
        e(canvas, paint, n, n2, n + n5 * d((float)n3), n2 + n4);
    }
    
    public static boolean c(final View view) {
        return dvz.c(view) != null || dvz.e(view) != null || dvz.f(view) != null;
    }
    
    private static int d(final float n) {
        if (n >= 0.0f) {
            return 1;
        }
        return -1;
    }
    
    private static void e(final Canvas canvas, final Paint paint, int n, final int n2, final int n3, final int n4) {
        int n5;
        if (n > n3) {
            n5 = n3;
        }
        else {
            n5 = n;
        }
        int n6;
        if (n2 > n4) {
            n6 = n4;
        }
        else {
            n6 = n2;
        }
        int n7 = n;
        if (n <= n3) {
            n7 = n3;
        }
        if ((n = n2) <= n4) {
            n = n4;
        }
        canvas.drawRect((float)n5, (float)n6, (float)n7, (float)n, paint);
    }
}
