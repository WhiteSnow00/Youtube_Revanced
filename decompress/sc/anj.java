import android.view.ViewPropertyAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anj
{
    public static ViewPropertyAnimator a(final ViewPropertyAnimator viewPropertyAnimator, final Runnable runnable) {
        return viewPropertyAnimator.withEndAction(runnable);
    }
    
    public static ViewPropertyAnimator b(final ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.withLayer();
    }
    
    static ViewPropertyAnimator c(final ViewPropertyAnimator viewPropertyAnimator, final Runnable runnable) {
        return viewPropertyAnimator.withStartAction(runnable);
    }
}
