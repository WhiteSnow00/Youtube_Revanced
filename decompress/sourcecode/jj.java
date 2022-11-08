import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.content.res.Configuration;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.support.v7.widget.ActionMenuView;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jj extends ViewGroup
{
    protected final ji a;
    public final Context b;
    public ActionMenuView c;
    public jt d;
    public int e;
    protected bx f;
    private boolean g;
    private boolean h;
    
    jj(final Context context) {
        this(context, null);
    }
    
    public jj(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public jj(final Context b, final AttributeSet set, final int n) {
        super(b, set, n);
        this.a = new ji(this);
        final TypedValue typedValue = new TypedValue();
        if (b.getTheme().resolveAttribute(2130968583, typedValue, true) && typedValue.resourceId != 0) {
            this.b = (Context)new ContextThemeWrapper(b, typedValue.resourceId);
            return;
        }
        this.b = b;
    }
    
    public static int a(int n, final int n2, final boolean b) {
        if (b) {
            n -= n2;
        }
        else {
            n += n2;
        }
        return n;
    }
    
    public static final int e(final View view, final int n, final int n2) {
        view.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), n2);
        return Math.max(0, n - view.getMeasuredWidth());
    }
    
    public static final int f(final View view, final int n, int n2, final int n3, final boolean b) {
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        n2 += (n3 - measuredHeight) / 2;
        if (b) {
            view.layout(n - measuredWidth, n2, n, measuredHeight + n2);
            return -measuredWidth;
        }
        view.layout(n, n2, n + measuredWidth, measuredHeight + n2);
        return measuredWidth;
    }
    
    public void c(final int n) {
        throw null;
    }
    
    public final bx g(final int n, final long n2) {
        final bx f = this.f;
        if (f != null) {
            f.n();
        }
        if (n == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            final bx ab = ana.aB((View)this);
            ab.p(1.0f);
            ab.q(n2);
            final ji a = this.a;
            a.d(ab, 0);
            ab.s(a);
            return ab;
        }
        final bx ab2 = ana.aB((View)this);
        ab2.p(0.0f);
        ab2.q(n2);
        final ji a2 = this.a;
        a2.d(ab2, n);
        ab2.s(a2);
        return ab2;
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, gl.a, 2130968586, 0);
        this.c(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        final jt d = this.d;
        if (d != null) {
            d.k = fm.e(d.b);
            final im c = d.c;
            if (c != null) {
                c.l(true);
            }
        }
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 9;
        int n2 = actionMasked;
        if (actionMasked == 9) {
            this.h = false;
            n2 = 9;
        }
        if (!this.h) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (n2 == 9) {
                n2 = n;
                if (!onHoverEvent) {
                    this.h = true;
                    n2 = n;
                }
            }
        }
        if (n2 == 10 || n2 == 3) {
            this.h = false;
        }
        return true;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.g = false;
            actionMasked = 0;
        }
        int n = actionMasked;
        if (!this.g) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if ((n = actionMasked) == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                n = 0;
            }
        }
        if (n == 1 || n == 3) {
            this.g = false;
        }
        return true;
    }
    
    public final void setVisibility(final int visibility) {
        if (visibility != this.getVisibility()) {
            final bx f = this.f;
            if (f != null) {
                f.n();
            }
            super.setVisibility(visibility);
        }
    }
}
