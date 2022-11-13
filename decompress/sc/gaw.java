import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gaw extends AnimatorListenerAdapter
{
    final View a;
    final int b;
    final BottomUiContainer c;
    
    public gaw(final BottomUiContainer c, final View a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final BottomUiContainer c = this.c;
        c.k(c.c(this.a, this.b));
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final BottomUiContainer c = this.c;
        c.k(c.c(this.a, this.b));
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        final BottomUiContainer c = this.c;
        c.k(c.c(this.a, this.b));
    }
    
    public final void onAnimationStart(final Animator animator) {
        final BottomUiContainer c = this.c;
        c.k(c.c(this.a, this.b));
    }
}
