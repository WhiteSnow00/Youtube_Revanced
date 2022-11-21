// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.red.presenter;

import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import android.widget.TextView;
import android.view.ViewGroup;

public class CompactYpcOfferModuleView extends ViewGroup
{
    public TextView a;
    public TextView b;
    public TextView c;
    private HashMap d;
    private int e;
    
    public CompactYpcOfferModuleView(final Context context) {
        super(context);
        this.a();
    }
    
    public CompactYpcOfferModuleView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a();
    }
    
    public CompactYpcOfferModuleView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a();
    }
    
    public CompactYpcOfferModuleView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a();
    }
    
    private final void a() {
        inflate(this.getContext(), 2131624268, (ViewGroup)this);
        this.a = (TextView)this.findViewById(2131432096);
        this.b = (TextView)this.findViewById(2131431823);
        this.c = (TextView)this.findViewById(2131427916);
        this.e = tqf.aZ(this.getResources().getDisplayMetrics(), 8);
        this.d = new HashMap();
    }
    
    private final void b(final View view, final int n, final int n2, final int n3, final int n4) {
        if (!this.d.containsKey(view)) {
            this.d.put(view, new Rect());
        }
        this.d.get(view).set(n, n2, n3, n4);
    }
    
    protected final void onLayout(final boolean b, final int n, int i, final int n2, int left) {
        int childCount;
        View child;
        Rect rect;
        int n3;
        int right;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                rect = this.d.get(child);
                if (anc.f((View)this) == 1) {
                    n3 = n2 - n;
                    left = n3 - rect.right;
                    right = n3 - rect.left;
                }
                else {
                    left = rect.left;
                    right = rect.right;
                }
                child.layout(left, rect.top, right, rect.bottom);
            }
        }
    }
    
    protected final void onMeasure(int measuredHeight, int n) {
        final int paddingLeft = this.getPaddingLeft();
        int paddingTop = this.getPaddingTop();
        final int paddingRight = this.getPaddingRight();
        final int paddingBottom = this.getPaddingBottom();
        final int n2 = View$MeasureSpec.getSize(measuredHeight) - paddingLeft - paddingRight;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        this.d.clear();
        if (this.a.getVisibility() != 8) {
            this.a.measure(measureSpec, measureSpec2);
            final TextView a = this.a;
            this.b((View)a, paddingLeft, paddingTop, paddingLeft + a.getMeasuredWidth(), paddingTop + this.a.getMeasuredHeight());
            measuredHeight = this.a.getMeasuredHeight();
            n = Math.max(0, this.a.getMeasuredWidth());
            measuredHeight += paddingTop;
        }
        else {
            measuredHeight = paddingTop;
            n = 0;
        }
        if (this.b.getVisibility() != 8) {
            this.b.measure(measureSpec, measureSpec2);
            final TextView b = this.b;
            this.b((View)b, paddingLeft, measuredHeight, paddingLeft + b.getMeasuredWidth(), measuredHeight + this.b.getMeasuredHeight());
            measuredHeight += this.b.getMeasuredHeight();
            n = Math.max(n, this.b.getMeasuredWidth());
        }
        int n3 = measuredHeight;
        if (this.c.getVisibility() != 8) {
            this.c.measure(measureSpec2, measureSpec2);
            final int measuredWidth = this.c.getMeasuredWidth();
            final int e = this.e;
            if (n + measuredWidth + e >= n2) {
                paddingTop = measuredHeight + e;
                n = paddingLeft;
            }
            else {
                n = paddingLeft + n2 - this.c.getMeasuredWidth();
            }
            final TextView c = this.c;
            this.b((View)c, n, paddingTop, n + c.getMeasuredWidth(), paddingTop + this.c.getMeasuredHeight());
            n3 = measuredHeight;
            if (this.c.getMeasuredHeight() + paddingTop > measuredHeight) {
                n3 = paddingTop + this.c.getMeasuredHeight();
            }
        }
        this.setMeasuredDimension(n2 + paddingLeft + paddingRight, n3 + paddingBottom);
    }
}
