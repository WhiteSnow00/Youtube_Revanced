import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebe extends adzw
{
    private static float cm(final float n) {
        final double n2 = n;
        Double.isNaN(n2);
        return (float)(1.0 - Math.cos(n2 * 3.141592653589793 / 2.0));
    }
    
    private static float cn(final float n) {
        final double n2 = n;
        Double.isNaN(n2);
        return (float)Math.sin(n2 * 3.141592653589793 / 2.0);
    }
    
    public final void k(final TabLayout tabLayout, final View view, final View view2, float n, final Drawable drawable) {
        final RectF j = j(tabLayout, view);
        final RectF i = j(tabLayout, view2);
        float cm2;
        if (j.left < i.left) {
            final float cm = cm(n);
            final float cn = cn(n);
            n = cm;
            cm2 = cn;
        }
        else {
            final float cn2 = cn(n);
            cm2 = cm(n);
            n = cn2;
        }
        drawable.setBounds(adtw.c((int)j.left, (int)i.left, n), drawable.getBounds().top, adtw.c((int)j.right, (int)i.right, cm2), drawable.getBounds().bottom);
    }
}
