import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cig extends cjq
{
    public cig() {
    }
    
    public cig(final int p) {
        super.p = p;
    }
    
    private static float J(final ciy ciy, final float n) {
        if (ciy != null) {
            final Float n2 = ciy.a.get("android:fade:transitionAlpha");
            if (n2 != null) {
                return n2;
            }
        }
        return n;
    }
    
    private final Animator K(final View view, final float n, final float n2) {
        if (n == n2) {
            return null;
        }
        cjd.c(view, n);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, cjd.a, new float[] { n2 });
        ofFloat.addListener((Animator$AnimatorListener)new cif(view));
        ((cim)this).w((cil)new cie(view));
        return (Animator)ofFloat;
    }
    
    public final void c(final ciy ciy) {
        cjq.I(ciy);
        ciy.a.put("android:fade:transitionAlpha", cjd.a(ciy.b));
    }
    
    public final Animator e(final View view, final ciy ciy) {
        final float n = 0.0f;
        float j = J(ciy, 0.0f);
        if (j == 1.0f) {
            j = n;
        }
        return this.K(view, j, 1.0f);
    }
    
    public final Animator f(final View view, final ciy ciy) {
        final ciu b = cjd.b;
        return this.K(view, J(ciy, 1.0f), 0.0f);
    }
}
