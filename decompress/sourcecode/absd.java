import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.graphics.Rect;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class absd extends ViewGroup
{
    private final asib a;
    public final Rect j;
    public toa k;
    public Runnable l;
    public View m;
    
    public absd(final Context context) {
        this(context, null);
    }
    
    public absd(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new asib();
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.j = new Rect();
    }
    
    private static int f(final int n) {
        return (int)(n / 1.777f);
    }
    
    private static int g(final int n) {
        return (int)(n * 1.777f);
    }
    
    protected static final boolean l(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return !(viewGroup$LayoutParams instanceof absc) || ((absc)viewGroup$LayoutParams).a;
    }
    
    protected List a() {
        final ArrayList list = new ArrayList();
        final toa k = this.k;
        if (k != null) {
            list.add(k.c().al((asix)new abpy(this, 20)));
        }
        return list;
    }
    
    public void c(final absb... array) {
        for (int i = 0; i < array.length; ++i) {
            final absb absb = array[i];
            final View md = absb.md();
            if (md == null) {
                final String value = String.valueOf(absb);
                final StringBuilder sb = new StringBuilder("Overlay ");
                sb.append(value);
                sb.append(" does not provide a View and LayoutParams");
                throw new IllegalArgumentException(sb.toString());
            }
            this.sc(absb, md);
        }
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof absc;
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new absc(-2, -2, true);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new absc(viewGroup$LayoutParams);
    }
    
    public final void i(final toa k) {
        k.getClass();
        this.k = k;
    }
    
    public final void k(final View m) {
        agot.E(this.m == null, (Object)"videoView has already been set");
        this.addView(this.m = m, 0, (ViewGroup$LayoutParams)new absc(-2, -2, false));
    }
    
    protected void mh(final View view, final Rect rect, int n, int right, int left, int top) {
        left -= n;
        top -= right;
        final int left2 = rect.left;
        right = rect.right;
        final int top2 = rect.top;
        final int bottom = rect.bottom;
        final boolean l = l(view.getLayoutParams());
        n = left;
        if (l) {
            n = left - left2 - right;
        }
        right = top;
        if (l) {
            right = top - top2 - bottom;
        }
        final int min = Math.min(view.getMeasuredWidth(), n);
        final int min2 = Math.min(view.getMeasuredHeight(), right);
        top = 0;
        if (l) {
            left = rect.left;
        }
        else {
            left = 0;
        }
        if (l) {
            top = rect.top;
        }
        n = left + (n - min) / 2;
        right = top + (right - min2) / 2;
        view.layout(n, right, min + n, min2 + right);
    }
    
    protected void mi(final View view, final Rect rect, int n, int measureSpec) {
        final int n2 = rect.left + rect.right;
        final int n3 = rect.top + rect.bottom;
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        measureSpec = View$MeasureSpec.makeMeasureSpec(measureSpec, 1073741824);
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        final boolean l = l(layoutParams);
        n = n2;
        if (!l) {
            n = 0;
        }
        final int childMeasureSpec = getChildMeasureSpec(measureSpec2, n, layoutParams.width);
        n = n3;
        if (!l) {
            n = 0;
        }
        view.measure(childMeasureSpec, getChildMeasureSpec(measureSpec, n, layoutParams.height));
    }
    
    protected final void onAttachedToWindow() {
        this.a.b();
        final List a = this.a();
        if (!a.isEmpty()) {
            this.a.f((asic[])a.toArray(new asic[a.size()]));
        }
        super.onAttachedToWindow();
    }
    
    protected final void onDetachedFromWindow() {
        this.a.b();
        super.onDetachedFromWindow();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (b || child.getVisibility() != 8) {
                this.mh(child, this.j, n, n2, n3, n4);
            }
        }
    }
    
    protected void onMeasure(int i, int resolveSize) {
        final int mode = View$MeasureSpec.getMode(i);
        final int mode2 = View$MeasureSpec.getMode(resolveSize);
        int n = View$MeasureSpec.getSize(i);
        final int size = View$MeasureSpec.getSize(resolveSize);
        final int n2 = 0;
        int n3 = mode;
        int f = 0;
        Label_0161: {
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    f = size;
                    break Label_0161;
                }
                n3 = 1073741824;
            }
            Label_0154: {
                if (n3 != 1073741824) {
                    if (n3 != Integer.MIN_VALUE || mode2 != 0) {
                        if (mode2 != 1073741824) {
                            if (mode2 != Integer.MIN_VALUE || n3 != 0) {
                                if (n3 != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
                                    n = 0;
                                    f = 0;
                                    break Label_0161;
                                }
                                if (size >= n / 1.777f) {
                                    break Label_0154;
                                }
                            }
                        }
                        n = g(size);
                        f = size;
                        break Label_0161;
                    }
                }
            }
            f = f(n);
        }
        final int resolveSize2 = resolveSize(n, i);
        resolveSize = resolveSize(f, resolveSize);
        for (i = n2; i < this.getChildCount(); ++i) {
            this.mi(this.getChildAt(i), this.j, resolveSize2, resolveSize);
        }
        this.setMeasuredDimension(resolveSize2, resolveSize);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final Runnable l = this.l;
        if (l != null) {
            l.run();
        }
        return super.onTouchEvent(motionEvent);
    }
    
    protected void sc(final absb absb, final View view) {
        this.addView(view, absb.a());
    }
}
