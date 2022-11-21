import android.animation.Animator;
import android.view.ViewGroup$LayoutParams;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeig extends AnimatorListenerAdapter
{
    final ViewGroup$LayoutParams a;
    final int b;
    final aeih c;
    
    public aeig(final aeih c, final ViewGroup$LayoutParams a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.c.b.setAlpha(1.0f);
        this.c.b.setTranslationX(0.0f);
        this.a.height = this.b;
        this.c.b.setLayoutParams(this.a);
    }
}
