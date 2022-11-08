import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwy extends AnimatorListenerAdapter
{
    final /* synthetic */ int a;
    final /* synthetic */ adxd b;
    
    public adwy(final adxd b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.f(this.a);
    }
    
    public final void onAnimationStart(final Animator animator) {
        final adxd b = this.b;
        b.l.b(b.e);
    }
}
