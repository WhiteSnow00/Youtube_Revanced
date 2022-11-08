import android.util.Log;
import android.graphics.Color;
import android.os.Build$VERSION;
import android.util.StateSet;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advx
{
    static final String a;
    private static final int[] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    
    static {
        c = new int[] { 16842919 };
        d = new int[] { 16842908 };
        e = new int[] { 16842913, 16842919 };
        f = new int[] { 16842913 };
        g = new int[] { 16842910, 16842919 };
        a = "advx";
    }
    
    private advx() {
    }
    
    public static ColorStateList a(final ColorStateList list) {
        final int[] f = advx.f;
        final int c = c(list, advx.e);
        final int[] d = advx.d;
        return new ColorStateList(new int[][] { f, d, StateSet.NOTHING }, new int[] { c, c(list, d), c(list, advx.c) });
    }
    
    public static ColorStateList b(final ColorStateList list) {
        if (list != null) {
            if (Build$VERSION.SDK_INT <= 27 && Color.alpha(list.getDefaultColor()) == 0 && Color.alpha(list.getColorForState(advx.g, 0)) != 0) {
                Log.w(advx.a, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return list;
        }
        return ColorStateList.valueOf(0);
    }
    
    private static int c(final ColorStateList list, final int[] array) {
        int colorForState;
        if (list != null) {
            colorForState = list.getColorForState(array, list.getDefaultColor());
        }
        else {
            colorForState = 0;
        }
        final int alpha = Color.alpha(colorForState);
        return ahy.f(colorForState, Math.min(alpha + alpha, 255));
    }
}
