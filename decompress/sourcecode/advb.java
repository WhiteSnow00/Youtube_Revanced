import java.util.Iterator;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class advb extends AnimatorListenerAdapter
{
    final /* synthetic */ advd a;
    
    public advb(final advd a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        advd.i(this.a);
        final advd a = this.a;
        final List f = a.f;
        if (f != null && !a.g) {
            final Iterator iterator = f.iterator();
            while (iterator.hasNext()) {
                ((cju)iterator.next()).b((Drawable)a);
            }
        }
    }
}
