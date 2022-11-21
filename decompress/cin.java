import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class cin extends AnimatorListenerAdapter
{
    final abi a;
    final ciq b;
    
    public cin(final ciq b, final abi a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((abp)this.a).remove((Object)animator);
        this.b.j.remove(animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.j.add(animator);
    }
}
