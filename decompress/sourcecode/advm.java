import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class advm extends AnimatorListenerAdapter
{
    final /* synthetic */ advo a;
    
    public advm(final advo a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        final advo a = this.a;
        final cju h = a.h;
        if (h != null) {
            h.b((Drawable)a.j);
        }
    }
}
