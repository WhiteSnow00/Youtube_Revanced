// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{
    private final boolean a;
    private boolean b;
    private int c;
    
    public ButtonBarLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gm.k);
        anc.M((View)this, context, gm.k, set, obtainStyledAttributes, 0, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, true);
        this.a = boolean1;
        obtainStyledAttributes.recycle();
        if (this.getOrientation() == 1) {
            this.b(boolean1);
        }
    }
    
    private final int a(int i) {
        while (i < this.getChildCount()) {
            if (this.getChildAt(i).getVisibility() == 0) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    private final void b(final boolean b) {
        if (this.b != b && (!b || this.a)) {
            this.setOrientation((int)((this.b = b) ? 1 : 0));
            int gravity;
            if (!b) {
                gravity = 80;
            }
            else {
                gravity = 8388613;
            }
            this.setGravity(gravity);
            final View viewById = this.findViewById(2131431623);
            if (viewById != null) {
                int visibility;
                if (!b) {
                    visibility = 4;
                }
                else {
                    visibility = 8;
                }
                viewById.setVisibility(visibility);
            }
            for (int i = this.getChildCount() - 2; i >= 0; --i) {
                this.bringChildToFront(this.getChildAt(i));
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        if (this.a) {
            if (size > this.c && this.b) {
                this.b(false);
            }
            this.c = size;
        }
        int measureSpec;
        boolean b;
        if (!this.b && View$MeasureSpec.getMode(n) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            b = true;
        }
        else {
            measureSpec = n;
            b = false;
        }
        super.onMeasure(measureSpec, n2);
        Label_0122: {
            if (this.a && !this.b && (this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
                this.b(true);
            }
            else if (!b) {
                break Label_0122;
            }
            super.onMeasure(n, n2);
        }
        final int a = this.a(0);
        int minimumHeight = 0;
        Label_0240: {
            if (a >= 0) {
                final View child = this.getChildAt(a);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
                final int n3 = this.getPaddingTop() + child.getMeasuredHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
                int paddingBottom;
                if (this.b) {
                    final int a2 = this.a(a + 1);
                    minimumHeight = n3;
                    if (a2 < 0) {
                        break Label_0240;
                    }
                    paddingBottom = this.getChildAt(a2).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f);
                }
                else {
                    paddingBottom = this.getPaddingBottom();
                }
                minimumHeight = n3 + paddingBottom;
            }
            else {
                minimumHeight = 0;
            }
        }
        if (anc.g((View)this) != minimumHeight) {
            this.setMinimumHeight(minimumHeight);
            if (n2 == 0) {
                super.onMeasure(n, 0);
            }
        }
    }
}
