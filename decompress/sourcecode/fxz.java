import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;
import android.animation.Animator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxz extends cim
{
    public final Animator a(final ViewGroup viewGroup, final ciy ciy, final ciy ciy2) {
        if (ciy == null || ciy2 == null) {
            return null;
        }
        final int intValue = ciy.a.get("heightTransition:height");
        final int intValue2 = ciy2.a.get("heightTransition:height");
        if (intValue == intValue2) {
            return null;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout)ciy2.b;
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { intValue, intValue2 });
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(heightTransitionLayout, 7));
        ofInt.addListener((Animator$AnimatorListener)new fxy(heightTransitionLayout));
        return (Animator)ofInt;
    }
    
    public final void b(final ciy ciy) {
        final View b = ciy.b;
        if (!(b instanceof HeightTransitionLayout)) {
            return;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout)b;
        ciy.a.put("heightTransition:height", heightTransitionLayout.a);
        heightTransitionLayout.a(-1);
    }
    
    public final void c(final ciy ciy) {
        final View b = ciy.b;
        if (!(b instanceof HeightTransitionLayout)) {
            return;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout)b;
        ciy.a.put("heightTransition:height", heightTransitionLayout.getHeight());
        heightTransitionLayout.a(heightTransitionLayout.getHeight());
    }
}
