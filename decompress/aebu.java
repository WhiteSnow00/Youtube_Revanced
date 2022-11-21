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

public final class aebu extends aecf
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
    
    public aebu(final aece aece) {
        super(aece);
        this.j = (View$OnClickListener)new acvy(this, 13);
        this.k = (View$OnFocusChangeListener)new gci(this, 12);
        this.b = adfe.v(aece.getContext(), 2130969947, 100);
        this.c = adfe.v(aece.getContext(), 2130969947, 150);
        this.d = adfe.A(aece.getContext(), 2130969956, adtw.a);
        this.i = adfe.A(aece.getContext(), 2130969954, adtw.d);
    }
    
    private final ValueAnimator m(final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(this.d);
        ofFloat.setDuration((long)this.b);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aebr(this, 2));
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
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aebr(this, 0));
        (this.l = new AnimatorSet()).playTogether(new Animator[] { (Animator)ofFloat, (Animator)this.m(0.0f, 1.0f) });
        this.l.addListener((Animator$AnimatorListener)new aebs(this));
        (this.m = this.m(1.0f, 0.0f)).addListener((Animator$AnimatorListener)new aebt(this));
    }
    
    public final void j() {
        final EditText a = this.a;
        if (a != null) {
            a.post((Runnable)new adps(this, 16));
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
