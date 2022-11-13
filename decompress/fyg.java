import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class fyg extends AnimatorListenerAdapter
{
    final HeightTransitionLayout a;
    
    public fyg(final HeightTransitionLayout a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a(-1);
    }
}
