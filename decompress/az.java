import android.view.animation.Animation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class az implements Animation$AnimationListener
{
    final dd a;
    final ViewGroup b;
    final View c;
    final bb d;
    
    public az(final dd a, final ViewGroup b, final View c, final bb d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        this.b.post((Runnable)new be(this, 1));
        if (cl.W(2)) {
            new StringBuilder("Animation from operation ").append(this.a);
        }
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        if (cl.W(2)) {
            new StringBuilder("Animation from operation ").append(this.a);
        }
    }
}
