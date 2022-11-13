import android.view.animation.Animation;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doo implements dol
{
    private final int a;
    
    public doo(final int a) {
        this.a = a;
    }
    
    public final boolean a(final Object o, final dok dok) {
        if (this.a != 0) {
            final View o2 = dok.o();
            final int a = oss.a;
            o2.clearAnimation();
            final Animation loadAnimation = AnimationUtils.loadAnimation(o2.getContext(), 2130772038);
            loadAnimation.setAnimationListener((Animation$AnimationListener)new osp(o2));
            o2.startAnimation(loadAnimation);
            return false;
        }
        final View o3 = dok.o();
        o3.clearAnimation();
        o3.startAnimation(AnimationUtils.loadAnimation(o3.getContext(), 2130772039));
        return false;
    }
}
