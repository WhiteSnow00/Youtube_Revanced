import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcj extends AnimatorListenerAdapter
{
    final zfc a;
    
    public adcj(final zfc a, final byte[] array) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((adcp)this.a.a).am.a(adcn.c);
    }
}
