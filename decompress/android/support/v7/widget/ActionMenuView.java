// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.content.res.Configuration;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.view.accessibility.AccessibilityEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;

public class ActionMenuView extends mu implements im, jc
{
    public in a;
    public boolean b;
    public ju c;
    public il d;
    public oqz e;
    private Context f;
    private int g;
    private iz h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    
    public ActionMenuView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(final Context f, final AttributeSet set) {
        super(f, set);
        this.setBaselineAligned(false);
        final float density = f.getResources().getDisplayMetrics().density;
        this.k = (int)(56.0f * density);
        this.l = (int)(density * 4.0f);
        this.f = f;
        this.g = 0;
    }
    
    public static final jx k() {
        final jx jx = new jx();
        jx.gravity = 16;
        return jx;
    }
    
    public static final jx l(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            jx jx;
            if (viewGroup$LayoutParams instanceof jx) {
                jx = new jx((jx)viewGroup$LayoutParams);
            }
            else {
                jx = new jx(viewGroup$LayoutParams);
            }
            if (jx.gravity <= 0) {
                jx.gravity = 16;
            }
            return jx;
        }
        return k();
    }
    
    public final void a(final in a) {
        this.a = a;
    }
    
    public final boolean b(final ip ip) {
        return this.a.z((MenuItem)ip, 0);
    }
    
    public final jx c(final AttributeSet set) {
        return new jx(this.getContext(), set);
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof jx;
    }
    
    public final Menu d() {
        if (this.a == null) {
            final Context context = this.getContext();
            (this.a = new in(context)).p((il)new jy(this, 0));
            (this.c = new ju(context)).r();
            final ju c = this.c;
            Object h;
            if ((h = this.h) == null) {
                h = new jw();
            }
            ((id)c).e = (iz)h;
            this.a.h((ja)this.c, this.f);
            this.c.k(this);
        }
        return (Menu)this.a;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public final void e() {
        final ju c = this.c;
        if (c != null) {
            c.p();
        }
    }
    
    public final void f(final iz h, final il d) {
        this.h = h;
        this.d = d;
    }
    
    public final void g(final int g) {
        if (this.g != g) {
            if ((this.g = g) == 0) {
                this.f = this.getContext();
                return;
            }
            this.f = (Context)new ContextThemeWrapper(this.getContext(), g);
        }
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)k();
    }
    
    protected final /* bridge */ mt generateDefaultLayoutParams() {
        return (mt)k();
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)this.c(set);
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)l(viewGroup$LayoutParams);
    }
    
    public final /* bridge */ mt generateLayoutParams(final AttributeSet set) {
        return (mt)this.c(set);
    }
    
    protected final /* bridge */ mt generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (mt)l(viewGroup$LayoutParams);
    }
    
    public final void h(final ju c) {
        (this.c = c).k(this);
    }
    
    protected final boolean i(final int n) {
        final boolean b = false;
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        boolean c = b;
        if (n < this.getChildCount()) {
            c = b;
            if (child instanceof jv) {
                c = ((jv)child).c();
            }
        }
        if (n > 0 && child2 instanceof jv) {
            return ((jv)child2).d() | c;
        }
        return c;
    }
    
    public final boolean j() {
        final ju c = this.c;
        return c != null && c.m();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final ju c = this.c;
        if (c != null) {
            ((id)c).j();
            if (this.c.m()) {
                this.c.l();
                this.c.o();
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e();
    }
    
    protected final void onLayout(final boolean b, int n, int i, int n2, int paddingLeft) {
        if (!this.i) {
            super.onLayout(b, n, i, n2, paddingLeft);
            return;
        }
        final int childCount = this.getChildCount();
        final int dividerWidth = this.getDividerWidth();
        final int n3 = n2 - n;
        int n4 = n3 - this.getPaddingRight() - this.getPaddingLeft();
        final boolean b2 = qc.b((View)this);
        int n5 = 0;
        int n6 = 0;
        n2 = 0;
        int n7;
        while (true) {
            n7 = (paddingLeft - i) / 2;
            if (n5 >= childCount) {
                break;
            }
            final View child = this.getChildAt(n5);
            n = n4;
            int n8 = n6;
            int n9 = n2;
            if (child.getVisibility() != 8) {
                final jx jx = (jx)child.getLayoutParams();
                if (jx.a) {
                    final int n10 = n = child.getMeasuredWidth();
                    if (this.i(n5)) {
                        n = n10 + dividerWidth;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n11;
                    int n12;
                    if (b2) {
                        n11 = this.getPaddingLeft() + jx.leftMargin;
                        n12 = n11 + n;
                    }
                    else {
                        n12 = this.getWidth() - this.getPaddingRight() - jx.rightMargin;
                        n11 = n12 - n;
                    }
                    final int n13 = n7 - measuredHeight / 2;
                    child.layout(n11, n13, n12, measuredHeight + n13);
                    n = n4 - n;
                    n8 = 1;
                    n9 = n2;
                }
                else {
                    n = n4 - (child.getMeasuredWidth() + jx.leftMargin + jx.rightMargin);
                    this.i(n5);
                    n9 = n2 + 1;
                    n8 = n6;
                }
            }
            ++n5;
            n4 = n;
            n6 = n8;
            n2 = n9;
        }
        if ((n = childCount) == 1) {
            if (n6 == 0) {
                final View child2 = this.getChildAt(0);
                i = child2.getMeasuredWidth();
                n = child2.getMeasuredHeight();
                final int n14 = n3 / 2;
                n2 = i / 2;
                paddingLeft = n7 - n / 2;
                n2 = n14 - n2;
                child2.layout(n2, paddingLeft, i + n2, n + paddingLeft);
                return;
            }
            n = 1;
        }
        i = n2 - (n6 ^ 0x1);
        if (i > 0) {
            i = n4 / i;
        }
        else {
            i = 0;
        }
        final int max = Math.max(0, i);
        if (b2) {
            paddingLeft = this.getWidth() - this.getPaddingRight();
            View child3;
            jx jx2;
            int n15;
            int measuredWidth;
            for (i = 0; i < n; ++i, paddingLeft = n2) {
                child3 = this.getChildAt(i);
                jx2 = (jx)child3.getLayoutParams();
                n2 = paddingLeft;
                if (child3.getVisibility() != 8) {
                    n2 = paddingLeft;
                    if (!jx2.a) {
                        n15 = paddingLeft - jx2.rightMargin;
                        measuredWidth = child3.getMeasuredWidth();
                        n2 = child3.getMeasuredHeight();
                        paddingLeft = n7 - n2 / 2;
                        child3.layout(n15 - measuredWidth, paddingLeft, n15, n2 + paddingLeft);
                        n2 = n15 - (measuredWidth + jx2.leftMargin + max);
                    }
                }
            }
        }
        else {
            paddingLeft = this.getPaddingLeft();
            View child4;
            jx jx3;
            int n16;
            int measuredWidth2;
            for (i = 0; i < n; ++i, paddingLeft = n2) {
                child4 = this.getChildAt(i);
                jx3 = (jx)child4.getLayoutParams();
                n2 = paddingLeft;
                if (child4.getVisibility() != 8) {
                    n2 = paddingLeft;
                    if (!jx3.a) {
                        n16 = paddingLeft + jx3.leftMargin;
                        measuredWidth2 = child4.getMeasuredWidth();
                        n2 = child4.getMeasuredHeight();
                        paddingLeft = n7 - n2 / 2;
                        child4.layout(n16, paddingLeft, n16 + measuredWidth2, n2 + paddingLeft);
                        n2 = n16 + (measuredWidth2 + jx3.rightMargin + max);
                    }
                }
            }
        }
    }
    
    protected final void onMeasure(int i, int k) {
        final boolean j = this.i;
        int l;
        if (View$MeasureSpec.getMode(i) == 1073741824) {
            l = 1;
        }
        else {
            l = 0;
        }
        this.i = (l != 0);
        if ((j ? 1 : 0) != l) {
            this.j = 0;
        }
        final int size = View$MeasureSpec.getSize(i);
        if (this.i) {
            final in a = this.a;
            if (a != null && size != this.j) {
                this.j = size;
                a.l(true);
            }
        }
        final int childCount = this.getChildCount();
        if (!this.i || childCount <= 0) {
            for (int n = 0; n < childCount; ++n) {
                final jx jx = (jx)this.getChildAt(n).getLayoutParams();
                jx.rightMargin = 0;
                jx.leftMargin = 0;
            }
            super.onMeasure(i, k);
            return;
        }
        final int mode = View$MeasureSpec.getMode(k);
        final int size2 = View$MeasureSpec.getSize(i);
        final int size3 = View$MeasureSpec.getSize(k);
        final int paddingLeft = this.getPaddingLeft();
        i = this.getPaddingRight();
        final int n2 = this.getPaddingTop() + this.getPaddingBottom();
        final int childMeasureSpec = getChildMeasureSpec(k, n2, -2);
        final int n3 = size2 - (paddingLeft + i);
        k = this.k;
        i = n3 / k;
        if (i == 0) {
            this.setMeasuredDimension(n3, 0);
            return;
        }
        final int n4 = k + n3 % k / i;
        final int childCount2 = this.getChildCount();
        int n5 = 0;
        k = 0;
        int n6 = 0;
        boolean b = false;
        long n7 = 0L;
        int max = 0;
        int max2 = 0;
        while (n6 < childCount2) {
            final View child = this.getChildAt(n6);
            if (child.getVisibility() != 8) {
                final boolean b2 = child instanceof ActionMenuItemView;
                if (b2) {
                    final int m = this.l;
                    child.setPadding(m, 0, m, 0);
                }
                final jx jx2 = (jx)child.getLayoutParams();
                jx2.f = false;
                jx2.c = 0;
                jx2.b = 0;
                jx2.d = false;
                jx2.leftMargin = 0;
                jx2.rightMargin = 0;
                jx2.e = (b2 && ((ActionMenuItemView)child).b());
                int n8;
                if (!jx2.a) {
                    n8 = i;
                }
                else {
                    n8 = 1;
                }
                final jx jx3 = (jx)child.getLayoutParams();
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(childMeasureSpec) - n2, View$MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView;
                if (b2) {
                    actionMenuItemView = (ActionMenuItemView)child;
                }
                else {
                    actionMenuItemView = null;
                }
                final boolean b3 = actionMenuItemView != null && actionMenuItemView.b();
                int b4;
                if (n8 > 0 && (!b3 || n8 >= 2)) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(n8 * n4, Integer.MIN_VALUE), measureSpec);
                    final int measuredWidth = child.getMeasuredWidth();
                    int n10;
                    final int n9 = n10 = measuredWidth / n4;
                    if (measuredWidth % n4 != 0) {
                        n10 = n9 + 1;
                    }
                    b4 = n10;
                    if (b3 && (b4 = n10) < 2) {
                        b4 = 2;
                    }
                }
                else {
                    b4 = 0;
                }
                jx3.d = (!jx3.a && b3);
                jx3.b = b4;
                child.measure(View$MeasureSpec.makeMeasureSpec(b4 * n4, 1073741824), measureSpec);
                max = Math.max(max, b4);
                int n11 = k;
                if (jx2.d) {
                    n11 = k + 1;
                }
                b |= jx2.a;
                i -= b4;
                max2 = Math.max(max2, child.getMeasuredHeight());
                long n12 = n7;
                if (b4 == 1) {
                    n12 = (n7 | (long)(1 << n6));
                }
                ++n5;
                n7 = n12;
                k = n11;
            }
            ++n6;
        }
        final int n13 = max2;
        boolean b5;
        int n14;
        if (b && n5 == 2) {
            b5 = true;
            n14 = 2;
        }
        else {
            b5 = false;
            n14 = n5;
        }
        final int n15 = 0;
        final int n16 = k;
        int n17 = i;
        i = n15;
        k = n13;
        while (true) {
            while (n16 > 0 && n17 > 0) {
                int n18 = Integer.MAX_VALUE;
                int n19 = 0;
                int n20 = 0;
                long n21 = 0L;
                while (n20 < childCount2) {
                    final jx jx4 = (jx)this.getChildAt(n20).getLayoutParams();
                    int n22;
                    int n23;
                    long n24;
                    if (!jx4.d) {
                        n22 = n18;
                        n23 = n19;
                        n24 = n21;
                    }
                    else {
                        final int b6 = jx4.b;
                        if (b6 < n18) {
                            n24 = 1L << n20;
                            n23 = 1;
                            n22 = b6;
                        }
                        else {
                            n22 = n18;
                            n23 = n19;
                            n24 = n21;
                            if (b6 == n18) {
                                n23 = n19 + 1;
                                n24 = (n21 | 1L << n20);
                                n22 = n18;
                            }
                        }
                    }
                    ++n20;
                    n18 = n22;
                    n19 = n23;
                    n21 = n24;
                }
                n7 |= n21;
                if (n19 > n17) {
                    boolean b7;
                    if (!b && n14 == 1) {
                        b7 = true;
                        n14 = 1;
                    }
                    else {
                        b7 = false;
                    }
                    if (n17 > 0 && n7 != 0L && (n17 < n14 - 1 || b7 || max > 1)) {
                        float n26;
                        final float n25 = n26 = (float)Long.bitCount(n7);
                        if (!b7) {
                            float n27 = n25;
                            if ((n7 & 0x1L) != 0x0L) {
                                n27 = n25;
                                if (!((jx)this.getChildAt(0).getLayoutParams()).e) {
                                    n27 = n25 - 0.5f;
                                }
                            }
                            final int n28 = childCount2 - 1;
                            n26 = n27;
                            if ((n7 & (long)(1 << n28)) != 0x0L) {
                                n26 = n27;
                                if (!((jx)this.getChildAt(n28).getLayoutParams()).e) {
                                    n26 = n27 - 0.5f;
                                }
                            }
                        }
                        int n29;
                        if (n26 > 0.0f) {
                            n29 = (int)(n17 * n4 / n26);
                        }
                        else {
                            n29 = 0;
                        }
                        final int n30 = 0;
                        int n31 = i;
                        View child2;
                        jx jx5;
                        for (i = n30; i < childCount2; ++i) {
                            if ((n7 & (long)(1 << i)) != 0x0L) {
                                child2 = this.getChildAt(i);
                                jx5 = (jx)child2.getLayoutParams();
                                if (child2 instanceof ActionMenuItemView) {
                                    jx5.c = n29;
                                    jx5.f = true;
                                    if (i == 0) {
                                        if (!jx5.e) {
                                            jx5.leftMargin = -n29 / 2;
                                        }
                                        i = 0;
                                    }
                                }
                                else if (jx5.a) {
                                    jx5.c = n29;
                                    jx5.f = true;
                                    jx5.rightMargin = -n29 / 2;
                                }
                                else {
                                    if (i != 0) {
                                        jx5.leftMargin = n29 / 2;
                                    }
                                    if (i != childCount2 - 1) {
                                        jx5.rightMargin = n29 / 2;
                                    }
                                    continue;
                                }
                                n31 = 1;
                            }
                        }
                        i = n31;
                    }
                    if (i != 0) {
                        View child3;
                        jx jx6;
                        for (i = 0; i < childCount2; ++i) {
                            child3 = this.getChildAt(i);
                            jx6 = (jx)child3.getLayoutParams();
                            if (jx6.f) {
                                child3.measure(View$MeasureSpec.makeMeasureSpec(jx6.b * n4 + jx6.c, 1073741824), childMeasureSpec);
                            }
                        }
                    }
                    if (mode == 1073741824) {
                        k = size3;
                    }
                    this.setMeasuredDimension(n3, k);
                    return;
                }
                i = 0;
                int n32 = n17;
                while (i < childCount2) {
                    final View child4 = this.getChildAt(i);
                    final jx jx7 = (jx)child4.getLayoutParams();
                    final long n33 = 1 << i;
                    if ((n21 & n33) == 0x0L) {
                        long n34 = n7;
                        if (jx7.b == n18 + 1) {
                            n34 = (n7 | n33);
                        }
                        n7 = n34;
                    }
                    else {
                        int n35 = n32;
                        if (b5) {
                            n35 = n32;
                            if (jx7.e && (n35 = n32) == 1) {
                                final int l2 = this.l;
                                child4.setPadding(l2 + n4, 0, l2, 0);
                                n35 = 1;
                            }
                        }
                        ++jx7.b;
                        jx7.f = true;
                        n32 = n35 - 1;
                    }
                    ++i;
                }
                i = 1;
                n17 = n32;
            }
            continue;
        }
    }
}
