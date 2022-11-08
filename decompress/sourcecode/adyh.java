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

public final class adyh extends adyl
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
    private final aoi n;
    private boolean o;
    private long p;
    private AccessibilityManager q;
    private ValueAnimator r;
    
    public adyh(final adyk adyk) {
        super(adyk);
        this.l = (View$OnClickListener)new acsj(this, 14);
        this.m = (View$OnFocusChangeListener)new gbv(this, 13);
        this.n = (aoi)new adye(this);
        this.p = Long.MAX_VALUE;
        this.j = adwd.j(adyk.getContext(), 2130969949, 67);
        this.i = adwd.j(adyk.getContext(), 2130969949, 50);
        this.k = adwd.o(adyk.getContext(), 2130969958, adqd.a);
    }
    
    private final ValueAnimator z(final int n, final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(this.k);
        ofFloat.setDuration((long)n);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adxx(this, 3));
        return ofFloat;
    }
    
    public final aoi A() {
        return this.n;
    }
    
    public final int a() {
        return 2132018034;
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
            (this.a = (AutoCompleteTextView)editText).setOnTouchListener((View$OnTouchListener)new acrd(this, 3));
            this.a.setOnDismissListener((AutoCompleteTextView$OnDismissListener)new adyf(this));
            this.a.setThreshold(0);
            this.e.b.n((Drawable)null);
            if (!adwd.Y(editText) && this.q.isTouchExplorationEnabled()) {
                ana.X((View)this.h, 2);
            }
            this.e.n(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
    
    public final void i() {
        this.d = this.z(this.j, 0.0f, 1.0f);
        (this.r = this.z(this.i, 1.0f, 0.0f)).addListener((Animator$AnimatorListener)new adyg(this));
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
        if (this.q.isTouchExplorationEnabled() && adwd.Y((EditText)this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post((Runnable)new admc(this, 17));
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
    
    public final void v(final aol aol) {
        if (!adwd.Y((EditText)this.a)) {
            aol.q((CharSequence)Spinner.class.getName());
        }
        if (aol.a.isShowingHintText()) {
            aol.A((CharSequence)null);
        }
    }
    
    public final void w(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.q.isEnabled() && !adwd.Y((EditText)this.a)) {
            this.m();
            this.n();
        }
    }
}
