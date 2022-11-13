import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdr implements ValueAnimator$AnimatorUpdateListener
{
    public final jds a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    
    public jdr(final jds a, final float b, final float c, final int d, final int e, final int f, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final jds a = this.a;
        final float b = this.b;
        final float c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        a.t(b + (c - b) * floatValue, (int)(d + (e - d) * floatValue), (int)(f + (g - f) * floatValue), false, true);
    }
}
