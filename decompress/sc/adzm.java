import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzm extends adyf
{
    private static float ch(final float n) {
        final double n2 = n;
        Double.isNaN(n2);
        return (float)(1.0 - Math.cos(n2 * 3.141592653589793 / 2.0));
    }
    
    private static float ci(final float n) {
        final double n2 = n;
        Double.isNaN(n2);
        return (float)Math.sin(n2 * 3.141592653589793 / 2.0);
    }
    
    public final void s(final TabLayout tabLayout, final View view, final View view2, float n, final Drawable drawable) {
        final RectF r = r(tabLayout, view);
        final RectF r2 = r(tabLayout, view2);
        float n2;
        if (r.left < r2.left) {
            n2 = ch(n);
            n = ci(n);
        }
        else {
            n2 = ci(n);
            n = ch(n);
        }
        drawable.setBounds(adsf.c((int)r.left, (int)r2.left, n2), drawable.getBounds().top, adsf.c((int)r.right, (int)r2.right, n), drawable.getBounds().bottom);
    }
}
