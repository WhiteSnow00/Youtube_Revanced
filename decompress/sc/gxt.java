import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class gxt extends AnimatorListenerAdapter
{
    final YouTubeTextView a;
    
    public gxt(final YouTubeTextView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.animate().setStartDelay(1000L).alpha(0.0f).setDuration(67L).setListener((Animator$AnimatorListener)null);
    }
}
