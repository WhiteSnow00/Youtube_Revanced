import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chp extends Animation
{
    final SwipeRefreshLayout a;
    
    public chp(final SwipeRefreshLayout a) {
        this.a = a;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        this.a.c(n);
    }
}
