import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cho extends Animation
{
    final int a;
    final int b;
    final SwipeRefreshLayout c;
    
    public cho(final SwipeRefreshLayout c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        final chl h = this.c.h;
        final int a = this.a;
        h.setAlpha((int)(a + (this.b - a) * n));
    }
}
