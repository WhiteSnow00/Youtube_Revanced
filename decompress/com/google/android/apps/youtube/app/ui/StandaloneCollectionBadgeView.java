// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import android.widget.TextView;
import android.view.ViewGroup;

public class StandaloneCollectionBadgeView extends ViewGroup
{
    private TextView a;
    private TextView b;
    private HashMap c;
    private int d;
    
    public StandaloneCollectionBadgeView(final Context context) {
        super(context);
    }
    
    public StandaloneCollectionBadgeView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public StandaloneCollectionBadgeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public StandaloneCollectionBadgeView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    private final void a(final View view, final int n, final int n2) {
        if (!this.c.containsKey(view)) {
            this.c.put(view, new jvq(n, n2));
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131428266);
        this.b = (TextView)this.findViewById(2131428267);
        this.c = new HashMap();
        this.d = tmy.aZ(this.getResources().getDisplayMetrics(), 8);
    }
    
    protected final void onLayout(final boolean b, int i, final int n, int a, final int n2) {
        final int childCount = this.getChildCount();
        final int n3 = a - i;
        View child;
        jvq jvq;
        int b2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8 && this.c.containsKey(child)) {
                jvq = this.c.get(child);
                if (ana.f((View)this) == 1) {
                    a = n3 - jvq.b;
                    b2 = n3 - jvq.a;
                }
                else {
                    a = jvq.a;
                    b2 = jvq.b;
                }
                child.layout(a, 0, b2, n2 - n);
            }
        }
    }
    
    protected final void onMeasure(int measuredHeight, int measuredWidth) {
        super.onMeasure(measuredHeight, measuredWidth);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int paddingRight = this.getPaddingRight();
        final int paddingBottom = this.getPaddingBottom();
        final int n = this.getMeasuredWidth() - paddingLeft - paddingRight;
        this.c.clear();
        int visibility = this.b.getVisibility();
        final int n2 = 0;
        int n3;
        if (visibility == 0) {
            this.measureChild((View)this.b, View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = this.b.getMeasuredHeight();
            measuredWidth = this.b.getMeasuredWidth();
            n3 = Math.max(0, this.b.getMeasuredWidth()) + this.d;
            visibility = 0;
        }
        else {
            measuredHeight = 0;
            measuredWidth = 0;
            n3 = 0;
        }
        int measuredHeight2;
        int measuredWidth2;
        if (this.a.getVisibility() == 0) {
            this.measureChild((View)this.a, View$MeasureSpec.makeMeasureSpec(n - n3, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight2 = this.a.getMeasuredHeight();
            measuredWidth2 = this.a.getMeasuredWidth();
            this.a((View)this.a, paddingLeft, paddingLeft + measuredWidth2);
        }
        else {
            measuredHeight2 = 0;
            measuredWidth2 = 0;
        }
        if (visibility == 0) {
            int d = n2;
            if (this.a.getVisibility() == 0) {
                d = this.d;
            }
            final int n4 = paddingLeft + measuredWidth2 + d;
            final TextView b = this.b;
            this.a((View)b, n4, b.getMeasuredWidth() + n4);
        }
        this.setMeasuredDimension(measuredWidth + measuredWidth2 + paddingLeft + paddingRight, Math.max(measuredHeight, measuredHeight2) + paddingTop + paddingBottom);
    }
}
