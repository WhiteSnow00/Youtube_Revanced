import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chs extends Animation
{
    final SwipeRefreshLayout a;
    
    public chs(final SwipeRefreshLayout a) {
        this.a = a;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        final SwipeRefreshLayout a = this.a;
        final boolean j = a.j;
        final int g = a.g;
        final int abs = Math.abs(a.f);
        final SwipeRefreshLayout a2 = this.a;
        final int e = a2.e;
        this.a.l(e + (int)((g - abs - e) * n) - a2.d.getTop());
        this.a.h.c(1.0f - n);
    }
}
