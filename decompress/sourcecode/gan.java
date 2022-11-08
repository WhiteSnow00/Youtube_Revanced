import android.view.View;
import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gan extends AnimatorListenerAdapter
{
    boolean a;
    final /* synthetic */ BottomUiContainer b;
    
    public gan(final BottomUiContainer b) {
        this.b = b;
        this.a = false;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final BottomUiContainer b = this.b;
        b.k = null;
        b.l = null;
        if (!this.a) {
            b.q((View)null, (hez)null);
            this.b.i();
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        final BottomUiContainer b = this.b;
        b.k = b.j;
    }
}
