import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class fxy extends AnimatorListenerAdapter
{
    final /* synthetic */ HeightTransitionLayout a;
    
    public fxy(final HeightTransitionLayout a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a(-1);
    }
}
