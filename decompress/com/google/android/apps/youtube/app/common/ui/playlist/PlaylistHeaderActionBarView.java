// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.playlist;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class PlaylistHeaderActionBarView extends ViewGroup
{
    private static final giy b;
    int a;
    private boolean c;
    private View d;
    private int e;
    
    static {
        b = new giy(0, 0);
    }
    
    public PlaylistHeaderActionBarView(final Context context) {
        super(context);
        this.a(context, null);
    }
    
    public PlaylistHeaderActionBarView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set);
    }
    
    public PlaylistHeaderActionBarView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context, set);
    }
    
    public PlaylistHeaderActionBarView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a(context, set);
    }
    
    private final void a(final Context context, final AttributeSet set) {
        this.e = tpe.aZ(this.getResources().getDisplayMetrics(), 8);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gjg.a);
        this.a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    private final giy b(final View view, int n, int n2) {
        if (view != null && view.getVisibility() != 8) {
            this.measureChildWithMargins(view, n, 0, n2, 0);
            final giz giz = (giz)view.getLayoutParams();
            final int measuredWidth = view.getMeasuredWidth();
            n2 = 0;
            if (giz != null) {
                n = giz.leftMargin + giz.rightMargin;
            }
            else {
                n = 0;
            }
            final int measuredHeight = view.getMeasuredHeight();
            if (giz != null) {
                n2 = giz.topMargin + giz.bottomMargin;
            }
            return new giy(measuredWidth + n, measuredHeight + n2);
        }
        return PlaylistHeaderActionBarView.b;
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof giz;
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new giz();
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new giz(this.getContext(), set);
    }
    
    protected final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new giz(viewGroup$LayoutParams);
    }
    
    protected final void onLayout(final boolean b, int f, int n, int n2, int n3) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int n4 = n3 - n - this.getPaddingBottom();
        final int n5 = n2 - f - this.getPaddingRight();
        f = anb.f((View)this);
        final View d = this.d;
        final int n6 = 0;
        n2 = 1;
        if (f != 1) {
            n2 = 0;
        }
        int i = n6;
        n = paddingLeft;
        f = n5;
        n3 = n4;
        if (d != null) {
            i = n6;
            n = paddingLeft;
            f = n5;
            n3 = n4;
            if (d.getVisibility() != 8) {
                i = n6;
                n = paddingLeft;
                f = n5;
                n3 = n4;
                if (this.c) {
                    final giz giz = (giz)this.d.getLayoutParams();
                    n3 = n4 - giz.bottomMargin;
                    final int n7 = n3 - this.d.getMeasuredHeight();
                    final int topMargin = giz.topMargin;
                    final int e = this.e;
                    if (n2 != 0) {
                        n = n5 - giz.rightMargin;
                        f = n - this.d.getMeasuredWidth();
                    }
                    else {
                        f = paddingLeft + giz.leftMargin;
                        n = this.d.getMeasuredWidth() + f;
                    }
                    this.d.layout(f, n7, n, n3);
                    n3 = n7 - topMargin - e;
                    f = n5;
                    n = paddingLeft;
                    i = n6;
                }
            }
        }
        while (i < this.getChildCount()) {
            final View child = this.getChildAt(i);
            int n8 = n;
            int n9 = f;
            Label_0442: {
                if (child.getVisibility() != 8) {
                    if (child == this.d) {
                        n8 = n;
                        n9 = f;
                        if (this.c) {
                            break Label_0442;
                        }
                    }
                    final giz giz2 = (giz)child.getLayoutParams();
                    final int measuredHeight = child.getMeasuredHeight();
                    final int n10 = (n3 - paddingTop - measuredHeight) / 2 + paddingTop + giz2.topMargin - giz2.bottomMargin;
                    int n11;
                    int n12;
                    if (n2 != 0) {
                        n11 = f - giz2.rightMargin;
                        n12 = n11 - child.getMeasuredWidth();
                        f = n12 - giz2.leftMargin;
                    }
                    else {
                        n12 = giz2.leftMargin + n;
                        n = child.getMeasuredWidth() + n12;
                        final int rightMargin = giz2.rightMargin;
                        n11 = n;
                        n += rightMargin;
                    }
                    child.layout(n12, n10, n11, measuredHeight + n10);
                    n9 = f;
                    n8 = n;
                }
            }
            ++i;
            n = n8;
            f = n9;
        }
    }
    
    protected final void onMeasure(int n, int i) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int paddingRight = this.getPaddingRight();
        final int paddingBottom = this.getPaddingBottom();
        final int n2 = View$MeasureSpec.getSize(n) - paddingLeft - paddingRight;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final giy b = this.b(this.d, measureSpec, measureSpec2);
        i = 0;
        int n3 = 0;
        n = 0;
        while (i < this.getChildCount()) {
            final View child = this.getChildAt(i);
            int max = n3;
            int n4 = n;
            if (child != this.d) {
                final giy b2 = this.b(child, measureSpec, measureSpec2);
                n4 = n + b2.a;
                max = Math.max(n3, b2.b);
            }
            ++i;
            n3 = max;
            n = n4;
        }
        final View d = this.d;
        if (d != null && d.getVisibility() != 8 && n2 < b.a + n) {
            i = n3 + this.e + b.b;
            this.c = true;
        }
        else {
            i = Math.max(n3, b.b);
            this.c = false;
        }
        this.setMeasuredDimension(Math.min(n2, n + b.a) + (paddingLeft + paddingRight), i + (paddingTop + paddingBottom));
    }
    
    public final void onViewAdded(final View d) {
        super.onViewAdded(d);
        if (d == null) {
            return;
        }
        if (d.getId() == this.a) {
            this.d = d;
        }
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        if (view.getId() == this.a) {
            this.d = null;
        }
    }
}
