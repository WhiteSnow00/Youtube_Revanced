import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gon implements ackp
{
    public final int a;
    
    public gon(final int a) {
        this.a = a;
    }
    
    public final void r(final acko acko, final Object o) {
        final int a = this.a;
        final int c = goq.c;
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)alphaAnimation).setDuration((long)a);
        acko.a().startAnimation((Animation)alphaAnimation);
    }
}
