import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.widget.LinearLayout;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxr implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;
    
    public adxr(final adxs c, final View a, final View b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adxr(final AppBarLayout$BaseBehavior b, final CoordinatorLayout a, final AppBarLayout c, final int d) {
        this.d = d;
        this.b = b;
        this.a = (View)a;
        this.c = (LinearLayout)c;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.d != 0) {
            ((adqv)this.b).H((CoordinatorLayout)this.a, (View)this.c, (int)valueAnimator.getAnimatedValue());
            return;
        }
        ((adxs)this.c).c(this.a, (View)this.b, valueAnimator.getAnimatedFraction());
    }
}
