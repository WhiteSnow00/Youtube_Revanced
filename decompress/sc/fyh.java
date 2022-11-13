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

public final class fyh extends cin
{
    public static final int p = 0;
    
    public final Animator a(final ViewGroup viewGroup, final ciz ciz, final ciz ciz2) {
        if (ciz == null || ciz2 == null) {
            return null;
        }
        final int intValue = ciz.a.get("heightTransition:height");
        final int intValue2 = ciz2.a.get("heightTransition:height");
        if (intValue == intValue2) {
            return null;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout)ciz2.b;
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { intValue, intValue2 });
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(heightTransitionLayout, 7));
        ofInt.addListener((Animator$AnimatorListener)new fyg(heightTransitionLayout));
        return (Animator)ofInt;
    }
    
    public final void b(final ciz ciz) {
        final View b = ciz.b;
        if (!(b instanceof HeightTransitionLayout)) {
            return;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout)b;
        ciz.a.put("heightTransition:height", heightTransitionLayout.a);
        heightTransitionLayout.a(-1);
    }
    
    public final void c(final ciz ciz) {
        final View b = ciz.b;
        if (!(b instanceof HeightTransitionLayout)) {
            return;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout)b;
        ciz.a.put("heightTransition:height", heightTransitionLayout.getHeight());
        heightTransitionLayout.a(heightTransitionLayout.getHeight());
    }
}
