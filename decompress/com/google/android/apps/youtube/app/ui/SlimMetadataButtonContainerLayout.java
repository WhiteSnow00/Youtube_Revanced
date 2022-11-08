// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.view.View$MeasureSpec;
import android.view.View;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseIntArray;
import java.util.List;
import android.view.ViewGroup;

public class SlimMetadataButtonContainerLayout extends ViewGroup
{
    public int a;
    public boolean b;
    private int c;
    private boolean d;
    private List e;
    private SparseIntArray f;
    
    public SlimMetadataButtonContainerLayout(final Context context) {
        super(context);
        this.d(context);
    }
    
    public SlimMetadataButtonContainerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.d(context);
    }
    
    public SlimMetadataButtonContainerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d(context);
    }
    
    public SlimMetadataButtonContainerLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.d(context);
    }
    
    private final int b(final int n, final int n2) {
        int min = (this.e.size() + 1) / n2;
        if (n2 == 1 || this.d) {
            min = Math.min(this.e.size(), this.a);
        }
        int n3 = min;
        if (n >= n2 - (min * n2 - this.e.size())) {
            n3 = min;
            if (!this.d) {
                n3 = min - 1;
            }
        }
        return n3;
    }
    
    private final int c() {
        int n = this.e.size();
        if (this.d) {
            n = Math.min(n, this.a);
        }
        final int a = this.a;
        return (n + a - 1) / a;
    }
    
    private final void d(final Context context) {
        this.e = new ArrayList();
        this.f = new SparseIntArray();
        this.a = 5;
        this.c = context.getResources().getDimensionPixelSize(2131169770);
    }
    
    public final void a(final boolean d) {
        this.d = d;
        this.requestLayout();
    }
    
    protected final void onLayout(final boolean b, int n, int i, int paddingTop, int n2) {
        final int n3 = paddingTop - n;
        final int c = this.c();
        if (c == 0) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        paddingTop = this.getPaddingTop();
        i = 0;
        int n4 = 0;
        while (i < c) {
            n = (n3 - this.f.get(i)) / 2;
            n2 = this.b(i, c);
            if (this.d) {
                n2 = this.e.size();
            }
            int j = 0;
            int max = 0;
            while (j < n2) {
                final View view = this.e.get(n4);
                final int measuredWidth = view.getMeasuredWidth();
                final int measuredHeight = view.getMeasuredHeight();
                final int n5 = measuredWidth + n;
                int n6;
                if (ana.f((View)this) == 1) {
                    n6 = n3 - n;
                    n = n3 - n5;
                }
                else {
                    n6 = n5;
                }
                view.layout(n, paddingTop, n6, view.getMeasuredHeight() + paddingTop);
                max = Math.max(max, measuredHeight);
                ++n4;
                ++j;
                n = n5;
            }
            paddingTop += max;
            ++i;
        }
    }
    
    protected final void onMeasure(int n, int paddingBottom) {
        int n3;
        final int n2 = n3 = this.c * this.a;
        if (View$MeasureSpec.getMode(n) != 0) {
            n3 = View$MeasureSpec.getSize(n);
            if (this.b) {
                n3 = Math.min(n3, n2);
            }
            else if (this.e.size() <= 2) {
                n = this.c;
                n3 = n + n;
            }
        }
        final int c = this.c();
        if (c == 0) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        final int b = this.b(0, c);
        final int n4 = n = n3 / this.a;
        if (!this.b) {
            n = n4;
            if (b > 0) {
                n = n3 / Math.max(1, b);
            }
        }
        int i = 0;
        int max = 0;
        int n5 = 0;
        int n6 = 0;
        while (i < c) {
            final int b2 = this.b(i, c);
            int size;
            if (this.d) {
                size = this.e.size();
            }
            else {
                size = b2;
            }
            int j = 0;
            int n7 = 0;
            int n8 = 0;
            while (j < size) {
                final View view = this.e.get(n6);
                int visibility;
                if (j >= b2) {
                    visibility = 4;
                }
                else {
                    visibility = 0;
                }
                view.setVisibility(visibility);
                view.measure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), paddingBottom);
                int n9 = n7;
                int max2 = n8;
                if (j < b2) {
                    max2 = Math.max(n8, view.getMeasuredHeight());
                    n9 = n7 + view.getMeasuredWidth();
                }
                ++n6;
                ++j;
                n7 = n9;
                n8 = max2;
            }
            this.f.put(i, n7);
            n5 += n8;
            max = Math.max(max, n7);
            ++i;
        }
        n = this.getPaddingTop();
        paddingBottom = this.getPaddingBottom();
        this.setMeasuredDimension(max + (this.getPaddingLeft() + this.getPaddingRight()), n5 + (n + paddingBottom));
    }
    
    public final void onViewAdded(final View view) {
        this.e.add(view);
    }
    
    public final void onViewRemoved(final View view) {
        this.e.remove(view);
    }
}
