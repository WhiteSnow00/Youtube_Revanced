import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwx extends AnimatorListenerAdapter
{
    final /* synthetic */ adxd a;
    
    public adwx(final adxd a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.g();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final adxd a = this.a;
        final adxe l = a.l;
        final int f = a.f;
        final int d = a.d;
        l.a(f - d, d);
    }
}
