import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyt extends AnimatorListenerAdapter
{
    final /* synthetic */ kyu a;
    
    public kyt(final kyu a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final kyu a = this.a;
        a.d = 1.0f;
        ((kyq)a).L();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final kyu a = this.a;
        a.d = 0.01f;
        a.a();
    }
}
