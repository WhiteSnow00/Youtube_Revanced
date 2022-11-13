import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayk implements Animation$AnimationListener
{
    private final View a;
    private final int b;
    
    public aayk(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        if (this.b != 0) {
            this.a.setVisibility(4);
            return;
        }
        aayl.c((ViewGroup)this.a);
        this.a.setVisibility(8);
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        if (this.b != 0) {
            this.a.setVisibility(0);
        }
    }
}
