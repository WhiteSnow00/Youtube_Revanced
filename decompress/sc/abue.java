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

public class abue extends ViewGroup
{
    private final asiq a;
    public final Rect j;
    public tqf k;
    public Runnable l;
    public View m;
    
    public abue(final Context context) {
        this(context, null);
    }
    
    public abue(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new asiq();
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
        return !(viewGroup$LayoutParams instanceof abud) || ((abud)viewGroup$LayoutParams).a;
    }
    
    protected List a() {
        final ArrayList list = new ArrayList();
        final tqf k = this.k;
        if (k != null) {
            list.add(k.c().am(new absa(this, 5)));
        }
        return list;
    }
    
    public void c(final abuc... array) {
        for (int i = 0; i < array.length; ++i) {
            final abuc abuc = array[i];
            final View md = abuc.md();
            if (md == null) {
                final String value = String.valueOf(abuc);
                final StringBuilder sb = new StringBuilder("Overlay ");
                sb.append(value);
                sb.append(" does not provide a View and LayoutParams");
                throw new IllegalArgumentException(sb.toString());
            }
            this.si(abuc, md);
        }
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof abud;
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new abud(-2, -2, true);
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new abud(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new abud(viewGroup$LayoutParams);
    }
    
    public final void i(final tqf k) {
        k.getClass();
        this.k = k;
    }
    
    public final void k(final View m) {
        adkp.R(this.m == null, (Object)"videoView has already been set");
        this.addView(this.m = m, 0, (ViewGroup$LayoutParams)new abud(-2, -2, false));
    }
    
    protected void mh(final View view, final Rect rect, int n, int n2, int left, int n3) {
        left -= n;
        final int left2 = rect.left;
        final int right = rect.right;
        n2 = n3 - n2;
        final int top = rect.top;
        n3 = rect.bottom;
        final boolean l = l(view.getLayoutParams());
        n = left;
        if (l) {
            n = left - left2 - right;
        }
        if (l) {
            n2 = n2 - top - n3;
        }
        final int min = Math.min(view.getMeasuredWidth(), n);
        final int min2 = Math.min(view.getMeasuredHeight(), n2);
        n3 = 0;
        if (l) {
            left = rect.left;
        }
        else {
            left = 0;
        }
        if (l) {
            n3 = rect.top;
        }
        n = left + (n - min) / 2;
        n2 = n3 + (n2 - min2) / 2;
        view.layout(n, n2, min + n, min2 + n2);
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
            this.a.f((asir[])a.toArray(new asir[a.size()]));
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
        final int size = View$MeasureSpec.getSize(i);
        int n = View$MeasureSpec.getSize(resolveSize);
        final int n2 = 0;
        int n3 = mode;
        int g = 0;
        Label_0154: {
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    g = size;
                    break Label_0154;
                }
                n3 = 1073741824;
            }
            Label_0144: {
                if (n3 != 1073741824) {
                    if (n3 != Integer.MIN_VALUE || mode2 != 0) {
                        if (mode2 != 1073741824) {
                            if (mode2 != Integer.MIN_VALUE || n3 != 0) {
                                if (n3 != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
                                    g = 0;
                                    n = 0;
                                    break Label_0154;
                                }
                                if (n >= size / 1.777f) {
                                    break Label_0144;
                                }
                            }
                        }
                        g = g(n);
                        break Label_0154;
                    }
                }
            }
            n = f(size);
            g = size;
        }
        final int resolveSize2 = resolveSize(g, i);
        resolveSize = resolveSize(n, resolveSize);
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
    
    protected void si(final abuc abuc, final View view) {
        this.addView(view, abuc.a());
    }
}
