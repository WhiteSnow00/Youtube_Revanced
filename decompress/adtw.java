import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtw
{
    public static final TimeInterpolator a;
    public static final TimeInterpolator b;
    public static final TimeInterpolator c;
    public static final TimeInterpolator d;
    public static final TimeInterpolator e;
    
    static {
        a = (TimeInterpolator)new LinearInterpolator();
        b = (TimeInterpolator)new atu();
        c = (TimeInterpolator)new att();
        d = (TimeInterpolator)new atv();
        e = (TimeInterpolator)new DecelerateInterpolator();
    }
    
    public static float a(final float n, final float n2, final float n3) {
        return n + n3 * (n2 - n);
    }
    
    public static float b(final float n, final float n2, final float n3, final float n4, final float n5) {
        if (n5 <= n3) {
            return n;
        }
        if (n5 >= n4) {
            return n2;
        }
        return n + (n5 - n3) / (n4 - n3) * (n2 - n);
    }
    
    public static int c(final int n, final int n2, final float n3) {
        return n + Math.round(n3 * (n2 - n));
    }
}
