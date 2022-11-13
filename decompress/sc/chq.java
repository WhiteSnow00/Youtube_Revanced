import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Animation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chq extends Animation
{
    final SwipeRefreshLayout a;
    
    public chq(final SwipeRefreshLayout a) {
        this.a = a;
    }
    
    public final void applyTransformation(final float n, final Transformation transformation) {
        this.a.lz(n);
    }
}
