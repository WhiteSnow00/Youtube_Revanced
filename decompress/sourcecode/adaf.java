import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adaf extends AnimatorListenerAdapter
{
    final /* synthetic */ zdj a;
    
    public adaf(final zdj a, final byte[] array) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((adam)this.a.a).am.a(adak.c);
    }
}
