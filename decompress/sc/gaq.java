import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gaq implements ValueAnimator$AnimatorUpdateListener
{
    public final BottomUiContainer a;
    public final View b;
    public final int c;
    
    public gaq(final BottomUiContainer a, final View b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final BottomUiContainer a = this.a;
        a.k(a.c(this.b, this.c));
    }
}
