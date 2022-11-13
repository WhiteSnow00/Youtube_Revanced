import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aba extends Drawable
{
    private static final double a;
    
    static {
        a = Math.cos(Math.toRadians(45.0));
    }
    
    public static float a(final float n, final float n2, final boolean b) {
        float n3 = n;
        if (b) {
            final double n4 = n;
            final double a = aba.a;
            final double n5 = n2;
            Double.isNaN(n5);
            Double.isNaN(n4);
            n3 = (float)(n4 + (1.0 - a) * n5);
        }
        return n3;
    }
    
    public static float b(float n, final float n2, final boolean b) {
        final float n3 = n *= 1.5f;
        if (b) {
            final double a = aba.a;
            final double n4 = n2;
            final double n5 = n3;
            Double.isNaN(n4);
            Double.isNaN(n5);
            n = (float)(n5 + (1.0 - a) * n4);
        }
        return n;
    }
    
    public final void draw(final Canvas canvas) {
        throw null;
    }
    
    public final int getOpacity() {
        throw null;
    }
    
    public final boolean getPadding(final Rect rect) {
        throw null;
    }
    
    public final boolean isStateful() {
        throw null;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        throw null;
    }
    
    protected final boolean onStateChange(final int[] array) {
        throw null;
    }
    
    public final void setAlpha(final int n) {
        throw null;
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        throw null;
    }
}
