// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.graphics.Canvas;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import java.util.List;
import android.widget.FrameLayout;

public final class FragmentContainerView extends FrameLayout
{
    public boolean a;
    private final List b;
    private final List c;
    private View$OnApplyWindowInsetsListener d;
    
    public FragmentContainerView(final Context context) {
        context.getClass();
        super(context);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
    }
    
    public FragmentContainerView(final Context context, final AttributeSet set) {
        context.getClass();
        this(context, set, 0, 4, null);
    }
    
    public FragmentContainerView(final Context context, final AttributeSet set, final int n) {
        context.getClass();
        super(context, set, n);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        if (set != null) {
            final String classAttribute = set.getClassAttribute();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ar.b, 0, 0);
            String string;
            String s;
            if (classAttribute == null) {
                string = obtainStyledAttributes.getString(0);
                s = "android:name";
            }
            else {
                s = "class";
                string = classAttribute;
            }
            obtainStyledAttributes.recycle();
            if (string != null) {
                if (!this.isInEditMode()) {
                    final StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
                    sb.append(s);
                    sb.append("=\"");
                    sb.append(string);
                    sb.append('\"');
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
        }
    }
    
    public FragmentContainerView(final Context context, final AttributeSet set, int n, final int n2, final atqv atqv) {
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        this(context, set, n);
    }
    
    public FragmentContainerView(final Context context, final AttributeSet set, final cl cl) {
        context.getClass();
        set.getClass();
        cl.getClass();
        super(context, set);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        final String classAttribute = set.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ar.b, 0, 0);
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final String string2 = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        final int id = this.getId();
        final br e = cl.e(id);
        if (string != null && e == null) {
            if (id == -1) {
                String concat;
                if (string2 != null) {
                    concat = " with tag ".concat(string2);
                }
                else {
                    concat = "";
                }
                final StringBuilder sb = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb.append(string);
                sb.append(concat);
                throw new IllegalStateException(sb.toString());
            }
            final by h = cl.h();
            context.getClassLoader();
            final br c = h.c(string);
            c.getClass();
            c.aD();
            final ct i = cl.i();
            i.z();
            c.N = (ViewGroup)this;
            i.r(((ViewGroup)this).getId(), c, string2);
            i.e();
        }
        for (final msg msg : cl.a.d()) {
            final br br = (br)msg.b;
            if (br.E == this.getId()) {
                final View o = br.O;
                if (o == null || o.getParent() != null) {
                    continue;
                }
                br.N = (ViewGroup)this;
                msg.d();
            }
        }
    }
    
    private final void a(final View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        view.getClass();
        final Object tag = view.getTag(2131429085);
        br br;
        if (tag instanceof br) {
            br = (br)tag;
        }
        else {
            br = null;
        }
        if (br != null) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final WindowInsets dispatchApplyWindowInsets(final WindowInsets windowInsets) {
        windowInsets.getClass();
        final aoc o = aoc.o(windowInsets);
        final View$OnApplyWindowInsetsListener d = this.d;
        aoc aoc;
        if (d != null) {
            final WindowInsets onApplyWindowInsets = d.onApplyWindowInsets((View)this, windowInsets);
            onApplyWindowInsets.getClass();
            aoc = aoc.o(onApplyWindowInsets);
        }
        else {
            aoc = anc.x((View)this, o);
        }
        aoc.getClass();
        if (!aoc.t()) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                anc.v(this.getChildAt(i), aoc);
            }
        }
        return windowInsets;
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        canvas.getClass();
        if (this.a) {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    protected final boolean drawChild(final Canvas canvas, final View view, final long n) {
        canvas.getClass();
        view.getClass();
        return (!this.a || this.b.isEmpty() || !this.b.contains(view)) && super.drawChild(canvas, view, n);
    }
    
    public final void endViewTransition(final View view) {
        view.getClass();
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }
    
    public final void removeAllViewsInLayout() {
        int childCount = this.getChildCount();
        while (--childCount >= 0) {
            final View child = this.getChildAt(childCount);
            child.getClass();
            this.a(child);
        }
        super.removeAllViewsInLayout();
    }
    
    public final void removeView(final View view) {
        view.getClass();
        this.a(view);
        super.removeView(view);
    }
    
    public final void removeViewAt(final int n) {
        final View child = this.getChildAt(n);
        child.getClass();
        this.a(child);
        super.removeViewAt(n);
    }
    
    public final void removeViewInLayout(final View view) {
        view.getClass();
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public final void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = this.getChildAt(i);
            child.getClass();
            this.a(child);
        }
        super.removeViews(n, n2);
    }
    
    public final void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = this.getChildAt(i);
            child.getClass();
            this.a(child);
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public final void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public final void setOnApplyWindowInsetsListener(final View$OnApplyWindowInsetsListener d) {
        d.getClass();
        this.d = d;
    }
    
    public final void startViewTransition(final View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}
