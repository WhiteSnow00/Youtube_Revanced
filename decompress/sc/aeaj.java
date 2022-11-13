import android.view.accessibility.AccessibilityEvent;
import android.widget.Spinner;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.AutoCompleteTextView$OnDismissListener;
import android.view.View$OnTouchListener;
import android.widget.EditText;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.accessibility.AccessibilityManager;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.widget.AutoCompleteTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeaj extends aean
{
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View$OnClickListener l;
    private final View$OnFocusChangeListener m;
    private final aoj n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;
    
    public aeaj(final aeam aeam) {
        super(aeam);
        this.l = (View$OnClickListener)new acun(this, 15);
        this.m = (View$OnFocusChangeListener)new gcc(this, 13);
        this.n = (aoj)new aeag(this);
        this.p = Long.MAX_VALUE;
        this.j = adds.D(aeam.getContext(), 2130969949, 67);
        this.i = adds.D(aeam.getContext(), 2130969949, 50);
        this.k = adds.I(aeam.getContext(), 2130969958, adsf.a);
    }
    
    private final ValueAnimator z(final int n, final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(this.k);
        ofFloat.setDuration((long)n);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adzz(this, 3));
        return ofFloat;
    }
    
    public final aoj A() {
        return this.n;
    }
    
    public final int a() {
        return 2132018035;
    }
    
    public final int b() {
        return 2131232326;
    }
    
    public final View$OnClickListener c() {
        return this.l;
    }
    
    public final View$OnFocusChangeListener d() {
        return this.m;
    }
    
    public final void g(final EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            (this.a = (AutoCompleteTextView)editText).setOnTouchListener((View$OnTouchListener)new acti(this, 3));
            this.a.setOnDismissListener((AutoCompleteTextView$OnDismissListener)new aeah(this));
            this.a.setThreshold(0);
            this.e.b.n((Drawable)null);
            if (!adyf.q(editText) && this.q.isTouchExplorationEnabled()) {
                anb.X((View)this.h, 2);
            }
            this.e.n(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
    
    public final void i() {
        this.d = this.z(this.j, 0.0f, 1.0f);
        (this.r = this.z(this.i, 1.0f, 0.0f)).addListener((Animator$AnimatorListener)new aeai(this));
        this.q = (AccessibilityManager)this.g.getSystemService("accessibility");
    }
    
    public final void j() {
        final AutoCompleteTextView a = this.a;
        if (a != null) {
            a.setOnTouchListener((View$OnTouchListener)null);
            this.a.setOnDismissListener((AutoCompleteTextView$OnDismissListener)null);
        }
    }
    
    public final void k(final boolean o) {
        if (this.o != o) {
            this.o = o;
            this.d.cancel();
            this.r.start();
        }
    }
    
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && adyf.q((EditText)this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post((Runnable)new adme(this, 18));
    }
    
    public final void m() {
        if (this.a == null) {
            return;
        }
        if (this.p()) {
            this.c = false;
        }
        if (this.c) {
            this.c = false;
            return;
        }
        this.k(this.o ^ true);
        if (this.o) {
            this.a.requestFocus();
            this.a.showDropDown();
            return;
        }
        this.a.dismissDropDown();
    }
    
    public final void n() {
        this.c = true;
        this.p = System.currentTimeMillis();
    }
    
    public final boolean o(final int n) {
        return n != 0;
    }
    
    public final boolean p() {
        final long n = System.currentTimeMillis() - this.p;
        return n < 0L || n > 300L;
    }
    
    public final boolean q() {
        return true;
    }
    
    public final boolean r() {
        return this.b;
    }
    
    public final boolean s() {
        return true;
    }
    
    public final boolean t() {
        return this.o;
    }
    
    public final boolean u() {
        return true;
    }
    
    public final void v(final aom aom) {
        if (!adyf.q((EditText)this.a)) {
            aom.q(Spinner.class.getName());
        }
        if (aom.a.isShowingHintText()) {
            aom.A(null);
        }
    }
    
    public final void w(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.q.isEnabled() && !adyf.q((EditText)this.a)) {
            this.m();
            this.n();
        }
    }
}