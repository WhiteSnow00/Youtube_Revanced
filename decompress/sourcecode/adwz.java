import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwz implements Handler$Callback
{
    public adwz() {
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what == 0) {
            final adxd adxd = (adxd)message.obj;
            if (adxd.k.getParent() == null) {
                final ViewGroup$LayoutParams layoutParams = adxd.k.getLayoutParams();
                if (layoutParams instanceof aej) {
                    final aej aej = (aej)layoutParams;
                    BaseTransientBottomBar$Behavior u;
                    if ((u = adxd.u) == null) {
                        u = new BaseTransientBottomBar$Behavior();
                    }
                    u.l.a = adxd.v;
                    u.z(new aepj(adxd));
                    aej.b((aeh)u);
                    aej.g = 80;
                }
                final adxc k = adxd.k;
                final ViewGroup i = adxd.i;
                k.g = true;
                i.addView((View)k);
                k.g = false;
                final int r = adxd.r;
                adxd.k.setVisibility(4);
            }
            if (ana.ao((View)adxd.k)) {
                adxd.i();
            }
            else {
                adxd.s = true;
            }
            return true;
        }
        if (what != 1) {
            return false;
        }
        final adxd adxd2 = (adxd)message.obj;
        final int arg1 = message.arg1;
        if (adxd2.k() && adxd2.k.getVisibility() == 0) {
            if (adxd2.k.c == 1) {
                final ValueAnimator c = adxd2.c(1.0f, 0.0f);
                c.setDuration((long)adxd2.e);
                c.addListener((Animator$AnimatorListener)new adww(adxd2, arg1));
                c.start();
            }
            else {
                final ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[] { 0, adxd2.b() });
                valueAnimator.setInterpolator(adxd2.g);
                valueAnimator.setDuration((long)adxd2.f);
                valueAnimator.addListener((Animator$AnimatorListener)new adwy(adxd2, arg1));
                valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adrg(adxd2, 5));
                valueAnimator.start();
            }
        }
        else {
            adxd2.f(arg1);
        }
        return true;
    }
}
