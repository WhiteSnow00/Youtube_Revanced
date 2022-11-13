import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.FloatEvaluator;
import android.animation.Animator;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyr extends cin
{
    private static final void e(final ciz ciz) {
        ciz.a.put("RotateTransition:rotation", ciz.b.getRotation());
    }
    
    public final Animator a(final ViewGroup viewGroup, final ciz ciz, final ciz ciz2) {
        Object ofObject;
        final Object o = ofObject = null;
        if (ciz != null) {
            if (ciz2 == null) {
                ofObject = o;
            }
            else {
                final View b = ciz2.b;
                final float floatValue = ciz.a.get("RotateTransition:rotation");
                final float floatValue2 = ciz2.a.get("RotateTransition:rotation");
                if (floatValue == floatValue2) {
                    return null;
                }
                b.setRotation(floatValue);
                ofObject = ValueAnimator.ofObject((TypeEvaluator)new FloatEvaluator(), new Object[] { floatValue, floatValue2 });
                final fyq fyq = new fyq(b, floatValue, floatValue2);
                ((ValueAnimator)ofObject).addUpdateListener((ValueAnimator$AnimatorUpdateListener)fyq);
                ((ValueAnimator)ofObject).addListener((Animator$AnimatorListener)fyq);
            }
        }
        return (Animator)ofObject;
    }
    
    public final void b(final ciz ciz) {
        e(ciz);
    }
    
    public final void c(final ciz ciz) {
        e(ciz);
    }
}
