import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class adsw implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ Matrix h;
    final /* synthetic */ adtd i;
    
    public adsw(final adtd i, final float a, final float b, final float c, final float d, final float e, final float f, final float g, final Matrix h) {
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
        this.i.B.setAlpha(adqd.b(this.a, this.b, 0.0f, 0.2f, floatValue));
        this.i.B.setScaleX(adqd.a(this.c, this.d, floatValue));
        this.i.B.setScaleY(adqd.a(this.e, this.d, floatValue));
        final adtd i = this.i;
        final float f = this.f;
        final float g = this.g;
        i.y = adqd.a(f, g, floatValue);
        i.d(adqd.a(f, g, floatValue), this.h);
        this.i.B.setImageMatrix(this.h);
    }
}
