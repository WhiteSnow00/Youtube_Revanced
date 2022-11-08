// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.view.View$MeasureSpec;
import android.view.View;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;

public class SlimMetadataScrollableButtonContainerLayout extends ViewGroup
{
    private int a;
    private int b;
    private List c;
    
    public SlimMetadataScrollableButtonContainerLayout(final Context context) {
        super(context);
        this.a(context);
    }
    
    public SlimMetadataScrollableButtonContainerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public SlimMetadataScrollableButtonContainerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    private final void a(final Context context) {
        this.setHorizontalScrollBarEnabled(false);
        this.c = new ArrayList();
        this.a = context.getResources().getDimensionPixelSize(2131169770);
        this.b = context.getResources().getDimensionPixelSize(2131169771);
    }
    
    protected final void onLayout(final boolean b, int n, final int n2, int n3, int i) {
        n = ana.f((View)this);
        int paddingLeft = this.getPaddingLeft();
        n3 = 1;
        if (n == 1) {
            n = this.c.size();
            n3 = -1;
            --n;
        }
        else {
            n = 0;
        }
        View view;
        int measuredWidth;
        int n4;
        for (i = 0; i < this.c.size(); ++i, paddingLeft = n4) {
            view = this.c.get(i * n3 + n);
            measuredWidth = view.getMeasuredWidth();
            if (view.getMeasuredHeight() == 0) {
                measuredWidth = 0;
            }
            n4 = measuredWidth + paddingLeft;
            view.layout(paddingLeft, n2, n4, view.getMeasuredHeight() + n2);
        }
    }
    
    protected final void onMeasure(int paddingBottom, int paddingTop) {
        final double n = View$MeasureSpec.getSize(paddingBottom) - this.getPaddingEnd() - this.getPaddingStart();
        final double n2 = this.b;
        Double.isNaN(n);
        Double.isNaN(n2);
        if (Math.floor(n / n2) >= this.c.size()) {
            final double n3 = this.c.size();
            Double.isNaN(n);
            Double.isNaN(n3);
            paddingBottom = (int)Math.floor(Math.min(n / n3, this.a));
        }
        else {
            final double n4 = this.getPaddingEnd();
            Double.isNaN(n);
            Double.isNaN(n4);
            final double n5 = n + n4;
            final double n6 = this.b;
            Double.isNaN(n6);
            paddingBottom = (int)Math.round(n5 / (Math.floor(n5 / n6 - 0.5) + 0.5));
        }
        final int size = this.c.size();
        int i = 0;
        int n7 = 0;
        int n8 = 0;
        while (i < size) {
            final View view = this.c.get(i);
            view.measure(View$MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824), paddingTop);
            final int max = Math.max(n8, view.getMeasuredHeight());
            int measuredWidth;
            if (view.getMeasuredHeight() != 0) {
                measuredWidth = view.getMeasuredWidth();
            }
            else {
                measuredWidth = 0;
            }
            n7 += measuredWidth;
            ++i;
            n8 = max;
        }
        paddingTop = this.getPaddingTop();
        paddingBottom = this.getPaddingBottom();
        this.setMeasuredDimension(n7 + (this.getPaddingLeft() + this.getPaddingRight()), n8 + (paddingTop + paddingBottom));
    }
    
    public final void onViewAdded(final View view) {
        this.c.add(view);
    }
    
    public final void onViewRemoved(final View view) {
        this.c.remove(view);
    }
}
