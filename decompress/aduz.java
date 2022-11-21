import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aduz implements ValueAnimator$AnimatorUpdateListener
{
    final Object a;
    private final int b;
    
    public aduz(final adum a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aduz(final aeax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aduz(final BottomSheetBehavior a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aduz(final TabLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aduz(final TextInputLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.b) {
            default: {
                ((TextInputLayout)this.a).o.r((float)valueAnimator.getAnimatedValue());
                return;
            }
            case 6: {
                ((TabLayout)this.a).scrollTo((int)valueAnimator.getAnimatedValue(), 0);
                return;
            }
            case 5: {
                final int intValue = (int)valueAnimator.getAnimatedValue();
                final String c = aeax.c;
                ((aeax)this.a).k.setTranslationY((float)intValue);
                return;
            }
            case 4: {
                final int intValue2 = (int)valueAnimator.getAnimatedValue();
                final String c2 = aeax.c;
                ((aeax)this.a).k.setTranslationY((float)intValue2);
                return;
            }
            case 3: {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                ((aeax)this.a).k.setScaleX(floatValue);
                ((aeax)this.a).k.setScaleY(floatValue);
                return;
            }
            case 2: {
                ((aeax)this.a).k.setAlpha((float)valueAnimator.getAnimatedValue());
                return;
            }
            case 1: {
                ((adum)this.a).k((int)valueAnimator.getAnimatedValue());
                return;
            }
            case 0: {
                final float floatValue2 = (float)valueAnimator.getAnimatedValue();
                final adzz d = ((BottomSheetBehavior)this.a).d;
                if (d != null) {
                    d.p(floatValue2);
                }
            }
        }
    }
}
