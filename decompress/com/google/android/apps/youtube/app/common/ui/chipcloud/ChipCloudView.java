// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.chipcloud;

import android.view.View$MeasureSpec;
import android.view.View;
import android.graphics.Rect;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;

public class ChipCloudView extends ViewGroup
{
    private List a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public ChipCloudView(final Context context) {
        super(context);
        this.c(context, null);
    }
    
    public ChipCloudView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c(context, set);
    }
    
    public ChipCloudView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c(context, set);
    }
    
    public ChipCloudView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c(context, set);
    }
    
    private final void c(final Context context, final AttributeSet set) {
        this.a = new ArrayList();
        this.b = 3;
        this.c = Integer.MAX_VALUE;
        TypedArray typedArray;
        try {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gcm.a, 0, 0);
            try {
                this.f = obtainStyledAttributes.getInteger(0, 0);
                this.d = tpe.aZ(context.getResources().getDisplayMetrics(), (int)obtainStyledAttributes.getDimension(2, 8.0f));
                this.e = tpe.aZ(context.getResources().getDisplayMetrics(), (int)obtainStyledAttributes.getDimension(1, 8.0f));
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                return;
            }
            finally {}
        }
        finally {
            typedArray = null;
        }
        if (typedArray != null) {
            typedArray.recycle();
        }
    }
    
    private final void d(int i, final int n, int n2) {
        if (i >= n) {
            return;
        }
        n2 -= this.a.get(n - 1).right;
        while (i < n) {
            final Rect rect = this.a.get(i);
            rect.set(rect.left + n2, rect.top, rect.right + n2, rect.bottom);
            ++i;
        }
    }
    
    private final boolean e() {
        return this.f == 8388613;
    }
    
    private static final void f(final View view, final int visibility) {
        if (view.getVisibility() != visibility) {
            view.setVisibility(visibility);
        }
    }
    
    public final void a(final int d, final int e) {
        if (this.d != d && this.e != e) {
            this.d = d;
            this.e = e;
            this.requestLayout();
        }
    }
    
    public final void b(final int b) {
        if (b != this.b) {
            this.b = b;
            this.requestLayout();
        }
    }
    
    protected final void onLayout(final boolean b, final int n, int n2, final int n3, int i) {
        final int childCount = this.getChildCount();
        final int size = this.a.size();
        n2 = 0;
        while (true) {
            i = size;
            if (n2 >= size) {
                break;
            }
            final View child = this.getChildAt(n2);
            f(child, 0);
            final Rect rect = this.a.get(n2);
            int left;
            if (anb.f((View)this) == 1) {
                i = n3 - n;
                left = i - rect.right;
                i -= rect.left;
            }
            else {
                left = rect.left;
                i = rect.right;
            }
            child.layout(left, rect.top, i, rect.bottom);
            ++n2;
        }
        while (i < childCount) {
            f(this.getChildAt(i), 8);
            ++i;
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        int size = View$MeasureSpec.getSize(n);
        if (View$MeasureSpec.getMode(n) == 0) {
            size = Integer.MAX_VALUE;
        }
        int min = Math.min(this.getChildCount(), this.c);
        int n22;
        if (this.b > 0) {
            final int n3 = size - this.getPaddingEnd();
            int paddingStart = this.getPaddingStart();
            int paddingTop = this.getPaddingTop();
            int n4 = paddingStart;
            int i = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            while (i < min) {
                final View child = this.getChildAt(i);
                int n14;
                int n20;
                int n21;
                if (child.getVisibility() != 8) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    int e;
                    if (n5 != 0) {
                        e = this.e;
                    }
                    else {
                        e = 0;
                    }
                    int d;
                    if (n6 > 0) {
                        d = this.d;
                    }
                    else {
                        d = 0;
                    }
                    final int n10 = 1;
                    int n11;
                    int n12;
                    int n15;
                    if (n4 + measuredWidth + e <= n3) {
                        n11 = n4 + e;
                        n12 = d + paddingTop;
                        final int n13 = n4 + (e + measuredWidth);
                        n5 = 1;
                        n14 = n6;
                        n15 = n13;
                    }
                    else {
                        if (n6 >= this.b - 1) {
                            min = i;
                            break;
                        }
                        final int n16 = paddingTop + (n8 + d);
                        n12 = n16 + this.d;
                        n14 = n6 + 1;
                        int n17;
                        if (n9 == i - 1) {
                            n17 = n10;
                        }
                        else {
                            n17 = 0;
                        }
                        if (this.e()) {
                            this.d(n9, i, n3);
                        }
                        n15 = paddingStart + measuredWidth + e;
                        n9 = i;
                        n8 = 0;
                        n11 = paddingStart;
                        n5 = n17;
                        paddingTop = n16;
                    }
                    final int max = Math.max(n7, n15);
                    final int max2 = Math.max(n8, measuredHeight);
                    int n18 = paddingStart;
                    int n19 = paddingTop;
                    if (this.a.size() <= i) {
                        int size2 = this.a.size();
                        while (true) {
                            n18 = paddingStart;
                            n19 = paddingTop;
                            if (size2 > i) {
                                break;
                            }
                            this.a.add(new Rect());
                            ++size2;
                        }
                    }
                    paddingStart = n18;
                    this.a.get(i).set(n11, n12, measuredWidth + n11, measuredHeight + n12);
                    paddingTop = n19;
                    n20 = n15;
                    n7 = max;
                    n21 = max2;
                }
                else {
                    n21 = n8;
                    n20 = n4;
                    n14 = n6;
                }
                ++i;
                n6 = n14;
                n4 = n20;
                n8 = n21;
            }
            if (this.e()) {
                this.d(n9, min, n3);
            }
            int paddingEnd;
            if (n6 <= 0) {
                paddingEnd = this.getPaddingEnd();
            }
            else {
                paddingEnd = 0;
            }
            size = paddingEnd + n7;
            int d2;
            if (n6 > 0) {
                d2 = this.d;
            }
            else {
                d2 = 0;
            }
            n22 = d2 + (paddingTop + n8);
        }
        else {
            n22 = 0;
        }
        int n23 = n22;
        if (min > 0) {
            n23 = n22 + this.getPaddingBottom();
        }
        int size3 = this.a.size();
        while (--size3 >= min) {
            this.a.remove(size3);
        }
        this.setMeasuredDimension(resolveSize(size, n), resolveSize(n23, n2));
    }
}
