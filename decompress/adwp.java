import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwp implements ValueAnimator$AnimatorUpdateListener
{
    final float a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final Matrix h;
    final adww i;
    
    public adwp(final adww i, final float a, final float b, final float c, final float d, final float e, final float f, final float g, final Matrix h) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        this.i.B.setAlpha(adtw.b(this.a, this.b, 0.0f, 0.2f, floatValue));
        this.i.B.setScaleX(adtw.a(this.c, this.d, floatValue));
        this.i.B.setScaleY(adtw.a(this.e, this.d, floatValue));
        final adww i = this.i;
        final float f = this.f;
        final float g = this.g;
        i.y = adtw.a(f, g, floatValue);
        i.d(adtw.a(f, g, floatValue), this.h);
        this.i.B.setImageMatrix(this.h);
    }
}
