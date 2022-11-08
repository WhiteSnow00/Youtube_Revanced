import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class kzm extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener
{
    public final ValueAnimator a;
    public boolean b;
    final /* synthetic */ kzn c;
    private final float d;
    private final kzh e;
    
    public kzm(final kzn c, final long duration, final float d, final kzh e) {
        this.c = c;
        this.d = d;
        this.e = e;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        (this.a = ofFloat).setDuration(duration);
        Label_0103: {
            int b;
            if ((b = c.b) == 128) {
                if (c.c == 2) {
                    break Label_0103;
                }
                b = 128;
            }
            final int c2 = c.c;
            if (b != 32 || c2 != 2) {
                Object interpolator;
                if (d > 0.0f) {
                    interpolator = new DecelerateInterpolator();
                }
                else {
                    interpolator = new fyf();
                }
                ofFloat.setInterpolator((TimeInterpolator)interpolator);
                return;
            }
        }
        ofFloat.setInterpolator((TimeInterpolator)apb.c(0.05f, 0.0f, 0.0f, 1.0f));
    }
    
    private final void a() {
        if (this.b) {
            return;
        }
        final kzh e = this.e;
        if (e != null) {
            final int c = this.c.c;
            if (e.b) {
                if (c != 128) {
                    if (c != 256) {
                        e.c.h.m(blt.Q(c));
                    }
                    else {
                        e.a.k();
                    }
                }
                else {
                    e.a.l();
                }
            }
            else {
                e.c.h.m(blt.Q(c));
            }
            e.c.b.b.tr((Object)0);
        }
        final kzn c2 = this.c;
        c2.f = null;
        c2.e.tr((Object)false);
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a();
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        if (this.b) {
            return;
        }
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        final float d = this.d;
        this.c.d(d + (1.0f - d) * floatValue);
    }
}
