import android.animation.Animator;
import android.widget.ImageView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jwc extends AnimatorListenerAdapter
{
    final /* synthetic */ ImageView a;
    
    public jwc(final ImageView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(8);
    }
}
