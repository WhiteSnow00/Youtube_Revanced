import android.view.animation.Animation;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class don implements dok
{
    private final /* synthetic */ int a;
    
    public don(final int a) {
        this.a = a;
    }
    
    public final boolean a(final Object o, final doj doj) {
        if (this.a != 0) {
            final View o2 = doj.o();
            final int a = orj.a;
            o2.clearAnimation();
            final Animation loadAnimation = AnimationUtils.loadAnimation(o2.getContext(), 2130772038);
            loadAnimation.setAnimationListener((Animation$AnimationListener)new org(o2));
            o2.startAnimation(loadAnimation);
            return false;
        }
        final View o3 = doj.o();
        o3.clearAnimation();
        o3.startAnimation(AnimationUtils.loadAnimation(o3.getContext(), 2130772039));
        return false;
    }
}
