// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupcompat.view;

import android.view.View$MeasureSpec;
import android.view.View;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{
    private static final aeby d;
    private boolean a;
    private int b;
    private int c;
    
    static {
        d = new aeby("ButtonBarLayout");
    }
    
    public ButtonBarLayout(final Context context) {
        super(context);
        this.a = false;
    }
    
    public ButtonBarLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = false;
    }
    
    private final void a(final boolean b) {
        if (this.a == b) {
            return;
        }
        this.a = b;
        final int childCount = this.getChildCount();
        final int n = 0;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            int n4;
            int n5;
            if (b) {
                child.setTag(2131431826, (Object)layoutParams.weight);
                layoutParams.weight = 0.0f;
                layoutParams.leftMargin = 0;
                n4 = n2;
                n5 = n3;
            }
            else {
                final Float n6 = (Float)child.getTag(2131431826);
                if (n6 != null) {
                    layoutParams.weight = n6;
                }
                else {
                    n2 = 1;
                }
                n4 = n2;
                n5 = n3;
                if (b(child)) {
                    n5 = n3 + 1;
                    n4 = n2;
                }
            }
            child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            ++i;
            n2 = n4;
            n3 = n5;
        }
        this.setOrientation((int)(b ? 1 : 0));
        int n7 = childCount;
        if (n2 != 0) {
            ButtonBarLayout.d.e("Reorder the FooterActionButtons in the container");
            final ArrayList list = new ArrayList();
            if (n3 <= 1) {
                list.addAll(Collections.nCopies(3, (Object)null));
            }
            int n8 = 0;
            int j;
            while (true) {
                j = n;
                if (n8 >= childCount) {
                    break;
                }
                final View child2 = this.getChildAt(n8);
                if (n3 <= 1) {
                    if (b(child2)) {
                        list.set(2, child2);
                    }
                    else if (!(child2 instanceof FooterActionButton)) {
                        list.set(1, child2);
                    }
                    else {
                        list.set(0, child2);
                    }
                }
                else if (!(child2 instanceof FooterActionButton)) {
                    list.add(1, child2);
                }
                else {
                    list.add(this.getChildAt(n8));
                }
                ++n8;
            }
            while (j < childCount) {
                final View view = (View)list.get(j);
                if (view != null) {
                    this.bringChildToFront(view);
                }
                ++j;
            }
        }
        else {
            while (--n7 >= 0) {
                this.bringChildToFront(this.getChildAt(n7));
            }
        }
        if ((b ? 1 : 0) != 0) {
            this.setHorizontalGravity(17);
            this.b = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            this.c = paddingRight;
            final int max = Math.max(this.b, paddingRight);
            this.setPadding(max, this.getPaddingTop(), max, this.getPaddingBottom());
            return;
        }
        this.setPadding(this.b, this.getPaddingTop(), this.c, this.getPaddingBottom());
    }
    
    private static final boolean b(final View view) {
        return view instanceof FooterActionButton && ((FooterActionButton)view).b;
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        int i = 0;
        this.a(false);
        int measureSpec;
        boolean b;
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            b = true;
        }
        else {
            measureSpec = n;
            b = false;
        }
        super.onMeasure(measureSpec, n2);
        final Context context = this.getContext();
        final int childCount = this.getChildCount();
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n4 = n3;
            if (child instanceof FooterActionButton) {
                n4 = n3;
                if (((FooterActionButton)child).b) {
                    n4 = n3 + 1;
                }
            }
            ++i;
            n3 = n4;
        }
        Label_0180: {
            Label_0174: {
                if (n3 == 2) {
                    if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600 && aedd.n(context)) {
                        break Label_0174;
                    }
                }
                if (this.getMeasuredWidth() > size) {
                    this.a(true);
                    break Label_0180;
                }
            }
            if (!b) {
                return;
            }
        }
        super.onMeasure(n, n2);
    }
}
