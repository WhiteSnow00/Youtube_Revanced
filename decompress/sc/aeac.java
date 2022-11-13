import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.animation.TimeInterpolator;
import android.widget.EditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeac extends aean
{
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View$OnClickListener j;
    private final View$OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;
    
    public aeac(final aeam aeam) {
        super(aeam);
        this.j = (View$OnClickListener)new acun(this, 14);
        this.k = (View$OnFocusChangeListener)new gcc(this, 12);
        this.b = adds.D(aeam.getContext(), 2130969949, 100);
        this.c = adds.D(aeam.getContext(), 2130969949, 150);
        this.d = adds.I(aeam.getContext(), 2130969958, adsf.a);
        this.i = adds.I(aeam.getContext(), 2130969956, adsf.d);
    }
    
    private final ValueAnimator m(final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(this.d);
        ofFloat.setDuration((long)this.b);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adzz(this, 2));
        return ofFloat;
    }
    
    public final int a() {
        return 2132017709;
    }
    
    public final int b() {
        return 2131232329;
    }
    
    public final View$OnClickListener c() {
        return this.j;
    }
    
    public final View$OnFocusChangeListener d() {
        return this.k;
    }
    
    public final View$OnFocusChangeListener e() {
        return this.k;
    }
    
    public final void f(final boolean b) {
        final boolean s = this.f.s();
        if (b) {
            if (!this.l.isRunning()) {
                this.m.cancel();
                this.l.start();
                if (s) {
                    this.l.end();
                }
            }
        }
        else {
            this.l.cancel();
            this.m.start();
            if (!s) {
                this.m.end();
            }
        }
    }
    
    public final void g(final EditText a) {
        this.a = a;
        this.e.n(this.k());
    }
    
    public final void h(final boolean b) {
        if (this.f.h == null) {
            return;
        }
        this.f(b);
    }
    
    public final void i() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
        ofFloat.setInterpolator(this.i);
        ofFloat.setDuration((long)this.c);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adzz(this, 0));
        (this.l = new AnimatorSet()).playTogether(new Animator[] { (Animator)ofFloat, (Animator)this.m(0.0f, 1.0f) });
        this.l.addListener((Animator$AnimatorListener)new aeaa(this));
        (this.m = this.m(1.0f, 0.0f)).addListener((Animator$AnimatorListener)new aeab(this));
    }
    
    public final void j() {
        final EditText a = this.a;
        if (a != null) {
            a.post((Runnable)new adme(this, 17));
        }
    }
    
    public final boolean k() {
        final EditText a = this.a;
        return a != null && (a.hasFocus() || this.h.hasFocus()) && this.a.getText().length() > 0;
    }
    
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        this.f(this.k());
    }
}
