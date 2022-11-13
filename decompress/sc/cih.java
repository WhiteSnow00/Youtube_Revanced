import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cih extends cjr
{
    public cih() {
    }
    
    public cih(final int p) {
        super.p = p;
    }
    
    private static float J(final ciz ciz, final float n) {
        if (ciz != null) {
            final Float n2 = ciz.a.get("android:fade:transitionAlpha");
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
        cje.c(view, n);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, cje.a, new float[] { n2 });
        ofFloat.addListener((Animator$AnimatorListener)new cig(view));
        ((cin)this).w((cim)new cif(view));
        return (Animator)ofFloat;
    }
    
    public final void c(final ciz ciz) {
        cjr.I(ciz);
        ciz.a.put("android:fade:transitionAlpha", cje.a(ciz.b));
    }
    
    public final Animator e(final View view, final ciz ciz) {
        final float n = 0.0f;
        float j = J(ciz, 0.0f);
        if (j == 1.0f) {
            j = n;
        }
        return this.K(view, j, 1.0f);
    }
    
    public final Animator f(final View view, final ciz ciz) {
        final civ b = cje.b;
        return this.K(view, J(ciz, 1.0f), 0.0f);
    }
}
