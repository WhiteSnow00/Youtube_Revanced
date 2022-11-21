import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;
import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adps implements Runnable
{
    public final Object a;
    private final int b;
    
    public adps(final adnx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adqg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adqq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adqq a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adrc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adrl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adsx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final advf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final adyi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final aeax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final aebu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final aecb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final aehf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final TextInputLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adps(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final View peekDecorView = ((aehf)this.a).b.peekDecorView();
                if (peekDecorView != null) {
                    aehg.a(peekDecorView);
                    return;
                }
                final aehf aehf = (aehf)this.a;
                if (--aehf.c >= 0) {
                    aehf.a.post(aehf.d);
                    return;
                }
                aehg.a.d("Cannot get decor view of window: ".concat(String.valueOf(String.valueOf(((aehf)this.a).b))));
                return;
            }
            case 19: {
                ((TextInputLayout)this.a).c.requestLayout();
                return;
            }
            case 18: {
                final aece b = ((TextInputLayout)this.a).b;
                b.d.performClick();
                b.d.jumpDrawablesToCurrentState();
                return;
            }
            case 17: {
                final aecb aecb = (aecb)this.a;
                final boolean popupShowing = aecb.a.isPopupShowing();
                aecb.k(popupShowing);
                aecb.c = popupShowing;
                return;
            }
            case 16: {
                ((aebu)this.a).f(true);
                return;
            }
            case 15: {
                final aeaw k = ((aeax)this.a).k;
                if (k == null) {
                    return;
                }
                if (k.getParent() != null) {
                    ((aeax)this.a).k.setVisibility(0);
                }
                final aeax aeax = (aeax)this.a;
                if (aeax.k.c == 1) {
                    final ValueAnimator c = aeax.c(new float[] { 0.0f, 1.0f });
                    final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
                    ofFloat.setInterpolator(aeax.h);
                    ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aduz(aeax, 3));
                    final AnimatorSet set = new AnimatorSet();
                    set.playTogether(new Animator[] { (Animator)c, (Animator)ofFloat });
                    set.setDuration((long)aeax.d);
                    set.addListener((Animator$AnimatorListener)new aeav(aeax));
                    set.start();
                    return;
                }
                final int b2 = aeax.b();
                aeax.k.setTranslationY((float)b2);
                final ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[] { b2, 0 });
                valueAnimator.setInterpolator(aeax.g);
                valueAnimator.setDuration((long)aeax.f);
                valueAnimator.addListener((Animator$AnimatorListener)new aear(aeax));
                valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aduz(aeax, 4));
                valueAnimator.start();
                return;
            }
            case 14: {
                ((aeax)this.a).f(3);
                return;
            }
            case 13: {
                final aeax aeax2 = (aeax)this.a;
                if (aeax2.k != null) {
                    final Context j = aeax2.j;
                    if (j != null) {
                        final WindowManager windowManager = (WindowManager)j.getSystemService("window");
                        final DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                        final int heightPixels = displayMetrics.heightPixels;
                        final Object a = this.a;
                        final int[] array = new int[2];
                        final aeax aeax3 = (aeax)a;
                        aeax3.k.getLocationOnScreen(array);
                        final int n = array[1];
                        final int height = aeax3.k.getHeight();
                        final int n2 = (int)((aeax)this.a).k.getTranslationY();
                        final aeax aeax4 = (aeax)this.a;
                        final int q = aeax4.q;
                        final int n3 = heightPixels - (n + height) + n2;
                        if (n3 < q) {
                            final ViewGroup$LayoutParams layoutParams = aeax4.k.getLayoutParams();
                            if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
                                Log.w(aeax.c, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                                return;
                            }
                            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                            viewGroup$MarginLayoutParams.bottomMargin += ((aeax)this.a).q - n3;
                            ((aeax)this.a).k.requestLayout();
                        }
                    }
                }
                return;
            }
            case 12: {
                final adyi adyi = (adyi)this.a;
                ((adyw)adyi.getCurrentDrawable()).h(false, false, true);
                if ((adyi.b() == null || !adyi.b().isVisible()) && (adyi.c() == null || !adyi.c().isVisible())) {
                    adyi.setVisibility(4);
                }
                ((adyi)this.a).e = -1L;
                return;
            }
            case 11: {
                ((adyi)this.a).e();
                return;
            }
            case 10: {
                final advf advf = (advf)this.a;
                advf.b = false;
                final aqj a2 = advf.c.A;
                if (a2 != null && a2.n()) {
                    final advf advf2 = (advf)this.a;
                    advf2.a(advf2.a);
                    return;
                }
                final advf advf3 = (advf)this.a;
                final BottomSheetBehavior c2 = advf3.c;
                if (c2.z == 2) {
                    c2.J(advf3.a);
                }
                return;
            }
            case 9: {
                ((adsx)this.a).j();
                return;
            }
            case 8: {
                ((adsx)this.a).k();
                return;
            }
            case 7: {
                ((adsx)this.a).l();
                return;
            }
            case 6: {
                final Object a3 = this.a;
                try {
                    ((Runnable)a3).run();
                }
                catch (final RuntimeException ex) {
                    adst.e(ex);
                }
            }
            case 5: {
                ((adrl)this.a).a();
                return;
            }
            case 4: {
                final adrc adrc = (adrc)this.a;
                adrc.c.d(adrc.a);
                return;
            }
            case 3: {
                ((adqq)this.a).a.p();
                return;
            }
            case 2: {
                ((adqg)this.a).a.p();
                return;
            }
            case 1: {
                final adnx adnx = (adnx)this.a;
                adnx.F();
                adnx.E();
                return;
            }
            case 0: {
                ((adqq)this.a).a.p();
            }
        }
    }
}
