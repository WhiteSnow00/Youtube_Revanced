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

public final class fyj extends cim
{
    private static final void e(final ciy ciy) {
        ciy.a.put("RotateTransition:rotation", ciy.b.getRotation());
    }
    
    public final Animator a(final ViewGroup viewGroup, final ciy ciy, final ciy ciy2) {
        Object ofObject;
        final Object o = ofObject = null;
        if (ciy != null) {
            if (ciy2 == null) {
                ofObject = o;
            }
            else {
                final View b = ciy2.b;
                final float floatValue = ciy.a.get("RotateTransition:rotation");
                final float floatValue2 = ciy2.a.get("RotateTransition:rotation");
                if (floatValue == floatValue2) {
                    return null;
                }
                b.setRotation(floatValue);
                ofObject = ValueAnimator.ofObject((TypeEvaluator)new FloatEvaluator(), new Object[] { floatValue, floatValue2 });
                final fyi fyi = new fyi(b, floatValue, floatValue2);
                ((ValueAnimator)ofObject).addUpdateListener((ValueAnimator$AnimatorUpdateListener)fyi);
                ((ValueAnimator)ofObject).addListener((Animator$AnimatorListener)fyi);
            }
        }
        return (Animator)ofObject;
    }
    
    public final void b(final ciy ciy) {
        e(ciy);
    }
    
    public final void c(final ciy ciy) {
        e(ciy);
    }
}
