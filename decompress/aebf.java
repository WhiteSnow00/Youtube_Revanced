import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebf extends adzw
{
    public final void k(final TabLayout tabLayout, View view, final View view2, float n, final Drawable drawable) {
        if (n >= 0.5f) {
            view = view2;
        }
        final RectF j = j(tabLayout, view);
        if (n < 0.5f) {
            n = adtw.b(1.0f, 0.0f, 0.0f, 0.5f, n);
        }
        else {
            n = adtw.b(0.0f, 1.0f, 0.5f, 1.0f, n);
        }
        drawable.setBounds((int)j.left, drawable.getBounds().top, (int)j.right, drawable.getBounds().bottom);
        drawable.setAlpha((int)(n * 255.0f));
    }
}
