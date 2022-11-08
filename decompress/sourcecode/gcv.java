import android.view.animation.Animation;
import android.view.View;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class gcv implements Animation$AnimationListener
{
    final /* synthetic */ View a;
    final /* synthetic */ gcw b;
    
    public gcv(final gcw b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        final View a = this.a;
        if (a != null) {
            a.setVisibility(8);
        }
        this.b.b = false;
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        this.b.b = true;
    }
}
