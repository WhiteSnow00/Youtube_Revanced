import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxw extends AnimatorListenerAdapter
{
    final /* synthetic */ jxx a;
    
    public jxw(final jxx a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a();
    }
}
