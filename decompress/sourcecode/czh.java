import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Iterator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;
import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public class czh extends ValueAnimator
{
    public final Set a;
    private final Set b;
    
    public czh() {
        this.b = new CopyOnWriteArraySet();
        this.a = new CopyOnWriteArraySet();
    }
    
    final void a(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((Animator$AnimatorListener)iterator.next()).onAnimationEnd((Animator)this, b);
        }
    }
    
    public final void addListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.a.add(animator$AnimatorListener);
    }
    
    public final void addUpdateListener(final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        this.b.add(valueAnimator$AnimatorUpdateListener);
    }
    
    public final void b() {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((ValueAnimator$AnimatorUpdateListener)iterator.next()).onAnimationUpdate((ValueAnimator)this);
        }
    }
    
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }
    
    public final void removeAllListeners() {
        this.a.clear();
    }
    
    public final void removeAllUpdateListeners() {
        this.b.clear();
    }
    
    public final void removeListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.a.remove(animator$AnimatorListener);
    }
    
    public final void removeUpdateListener(final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        this.b.remove(valueAnimator$AnimatorUpdateListener);
    }
    
    public final ValueAnimator setDuration(final long n) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
    
    public final void setInterpolator(final TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }
    
    public final void setStartDelay(final long n) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
