import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
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

public final class adme implements Runnable
{
    public final Object a;
    private final int b;
    
    public adme(final admj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final ador a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adpb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adpb a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adpn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adpw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adrh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adto a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adwr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final adzf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final aeac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final aeaj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final TextInputLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adme(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((TextInputLayout)this.a).c.requestLayout();
                return;
            }
            case 19: {
                final aeam b = ((TextInputLayout)this.a).b;
                b.d.performClick();
                b.d.jumpDrawablesToCurrentState();
                return;
            }
            case 18: {
                final aeaj aeaj = (aeaj)this.a;
                final boolean popupShowing = aeaj.a.isPopupShowing();
                aeaj.k(popupShowing);
                aeaj.c = popupShowing;
                return;
            }
            case 17: {
                ((aeac)this.a).f(true);
                return;
            }
            case 16: {
                final adze k = ((adzf)this.a).k;
                if (k == null) {
                    return;
                }
                if (k.getParent() != null) {
                    ((adzf)this.a).k.setVisibility(0);
                }
                final adzf adzf = (adzf)this.a;
                if (adzf.k.c == 1) {
                    final ValueAnimator c = adzf.c(new float[] { 0.0f, 1.0f });
                    final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
                    ofFloat.setInterpolator(adzf.h);
                    ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adti(adzf, 3));
                    final AnimatorSet set = new AnimatorSet();
                    set.playTogether(new Animator[] { (Animator)c, (Animator)ofFloat });
                    set.setDuration((long)adzf.d);
                    set.addListener((Animator$AnimatorListener)new adzd(adzf));
                    set.start();
                    return;
                }
                final int b2 = adzf.b();
                adzf.k.setTranslationY((float)b2);
                final ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(new int[] { b2, 0 });
                valueAnimator.setInterpolator(adzf.g);
                valueAnimator.setDuration((long)adzf.f);
                valueAnimator.addListener((Animator$AnimatorListener)new adyz(adzf));
                valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adti(adzf, 4));
                valueAnimator.start();
                return;
            }
            case 15: {
                ((adzf)this.a).f(3);
                return;
            }
            case 14: {
                final adzf adzf2 = (adzf)this.a;
                if (adzf2.k != null) {
                    final Context j = adzf2.j;
                    if (j != null) {
                        final WindowManager windowManager = (WindowManager)j.getSystemService("window");
                        final DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                        final int heightPixels = displayMetrics.heightPixels;
                        final Object a = this.a;
                        final int[] array = new int[2];
                        final adzf adzf3 = (adzf)a;
                        adzf3.k.getLocationOnScreen(array);
                        final int n = array[1];
                        final int height = adzf3.k.getHeight();
                        final int n2 = (int)((adzf)this.a).k.getTranslationY();
                        final adzf adzf4 = (adzf)this.a;
                        final int q = adzf4.q;
                        final int n3 = heightPixels - (n + height) + n2;
                        if (n3 < q) {
                            final ViewGroup$LayoutParams layoutParams = adzf4.k.getLayoutParams();
                            if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
                                Log.w(adzf.c, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                                return;
                            }
                            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                            viewGroup$MarginLayoutParams.bottomMargin += ((adzf)this.a).q - n3;
                            ((adzf)this.a).k.requestLayout();
                        }
                    }
                }
                return;
            }
            case 13: {
                final adwr adwr = (adwr)this.a;
                ((adxf)adwr.getCurrentDrawable()).h(false, false, true);
                if ((adwr.b() == null || !adwr.b().isVisible()) && (adwr.c() == null || !adwr.c().isVisible())) {
                    adwr.setVisibility(4);
                }
                ((adwr)this.a).e = -1L;
                return;
            }
            case 12: {
                ((adwr)this.a).e();
                return;
            }
            case 11: {
                final adto adto = (adto)this.a;
                adto.b = false;
                final aqi a2 = adto.c.A;
                if (a2 != null && a2.n()) {
                    final adto adto2 = (adto)this.a;
                    adto2.a(adto2.a);
                    return;
                }
                final adto adto3 = (adto)this.a;
                final BottomSheetBehavior c2 = adto3.c;
                if (c2.z == 2) {
                    c2.I(adto3.a);
                }
                return;
            }
            case 10: {
                ((adrh)this.a).j();
                return;
            }
            case 9: {
                ((adrh)this.a).k();
                return;
            }
            case 8: {
                ((adrh)this.a).l();
                return;
            }
            case 7: {
                final Object a3 = this.a;
                try {
                    ((Runnable)a3).run();
                }
                catch (final RuntimeException ex) {
                    adrd.e((Throwable)ex);
                }
            }
            case 6: {
                ((adpw)this.a).a();
                return;
            }
            case 5: {
                final adpn adpn = (adpn)this.a;
                adpn.c.d(adpn.a);
                return;
            }
            case 4: {
                ((adpb)this.a).a.h();
                return;
            }
            case 3: {
                ((ador)this.a).a.h();
                return;
            }
            case 2: {
                ((adpb)this.a).a.h();
                return;
            }
            case 1: {
                final Object a4 = this.a;
                synchronized (((admj)a4).l) {
                    ((admj)a4).w();
                }
            }
            case 0: {
                final admj admj = (admj)this.a;
                admj.F();
                admj.E();
            }
        }
    }
}
