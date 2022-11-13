import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class arcs implements Animation$AnimationListener
{
    final arct a;
    
    public arcs(final arct a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        this.a.setVisibility(8);
        ((ViewGroup)this.a.getParent()).removeView((View)this.a);
        final Runnable c = this.a.c;
        if (c != null) {
            c.run();
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}
