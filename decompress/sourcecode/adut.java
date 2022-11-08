import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adut extends AnimatorListenerAdapter
{
    final /* synthetic */ aduw a;
    
    public adut(final aduw a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        final aduw a = this.a;
        final cju i = a.i;
        if (i != null) {
            i.b((Drawable)a.j);
        }
    }
}
