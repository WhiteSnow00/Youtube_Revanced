import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewPropertyAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anj
{
    public static ViewPropertyAnimator a(final ViewPropertyAnimator viewPropertyAnimator, final ValueAnimator$AnimatorUpdateListener updateListener) {
        return viewPropertyAnimator.setUpdateListener(updateListener);
    }
}
