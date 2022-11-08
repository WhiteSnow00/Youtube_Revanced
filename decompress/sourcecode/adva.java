import java.util.Iterator;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adva extends AnimatorListenerAdapter
{
    final /* synthetic */ advd a;
    
    public adva(final advd a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        super.onAnimationStart(animator);
        final advd a = this.a;
        final List f = a.f;
        if (f != null && !a.g) {
            final Iterator iterator = f.iterator();
            while (iterator.hasNext()) {
                ((cju)iterator.next()).c((Drawable)a);
            }
        }
    }
}
