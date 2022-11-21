// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class AlertDialogLayout extends mu
{
    public AlertDialogLayout(final Context context) {
        super(context);
    }
    
    public AlertDialogLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private static int a(final View view) {
        final int g = anc.g(view);
        if (g > 0) {
            return g;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
    
    protected final void onLayout(final boolean b, int n, int intrinsicHeight, int i, int gravity) {
        final int n2 = i - n;
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingRight2 = this.getPaddingRight();
        n = this.getMeasuredHeight();
        final int childCount = this.getChildCount();
        final int gravity2 = this.getGravity();
        i = (gravity2 & 0x70);
        if (i != 16) {
            if (i != 80) {
                n = this.getPaddingTop();
            }
            else {
                n = this.getPaddingTop() + gravity - intrinsicHeight - n;
            }
        }
        else {
            n = this.getPaddingTop() + (gravity - intrinsicHeight - n) / 2;
        }
        final Drawable dividerDrawable = this.getDividerDrawable();
        i = 0;
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        }
        else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        while (i < childCount) {
            final View child = this.getChildAt(i);
            gravity = n;
            if (child != null) {
                gravity = n;
                if (child.getVisibility() != 8) {
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    final mt mt = (mt)child.getLayoutParams();
                    if ((gravity = mt.gravity) < 0) {
                        gravity = (gravity2 & 0x800007);
                    }
                    gravity = (Gravity.getAbsoluteGravity(gravity, anc.f((View)this)) & 0x7);
                    Label_0304: {
                        int n3;
                        if (gravity != 1) {
                            if (gravity != 5) {
                                gravity = mt.leftMargin + paddingLeft;
                                break Label_0304;
                            }
                            gravity = n2 - paddingRight - measuredWidth;
                            n3 = mt.rightMargin;
                        }
                        else {
                            gravity = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + mt.leftMargin;
                            n3 = mt.rightMargin;
                        }
                        gravity -= n3;
                    }
                    int n4 = n;
                    if (this.hasDividerBeforeChildAt(i)) {
                        n4 = n + intrinsicHeight;
                    }
                    n = n4 + mt.topMargin;
                    child.layout(gravity, n, measuredWidth + gravity, n + measuredHeight);
                    gravity = n + (measuredHeight + mt.bottomMargin);
                }
            }
            ++i;
            n = gravity;
        }
    }
    
    protected final void onMeasure(int i, final int n) {
        final int childCount = this.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        View view4;
        View view5;
        View view6;
        for (int j = 0; j < childCount; ++j, view = view4, view2 = view5, view3 = view6) {
            final View child = this.getChildAt(j);
            view4 = view;
            view5 = view2;
            view6 = view3;
            if (child.getVisibility() != 8) {
                final int id = child.getId();
                if (id == 2131432136) {
                    view4 = child;
                    view5 = view2;
                    view6 = view3;
                }
                else if (id == 2131427918) {
                    view4 = view;
                    view5 = child;
                    view6 = view3;
                }
                else {
                    if ((id != 2131428425 && id != 2131428566) || view3 != null) {
                        super.onMeasure(i, n);
                        return;
                    }
                    view4 = view;
                    view5 = view2;
                    view6 = child;
                }
            }
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(i);
        int n2 = this.getPaddingTop() + this.getPaddingBottom();
        int n3;
        if (view != null) {
            view.measure(i, 0);
            n2 += view.getMeasuredHeight();
            n3 = View.combineMeasuredStates(0, view.getMeasuredState());
        }
        else {
            n3 = 0;
        }
        int a;
        int n4;
        if (view2 != null) {
            view2.measure(i, 0);
            a = a(view2);
            n4 = view2.getMeasuredHeight() - a;
            n2 += a;
            n3 = View.combineMeasuredStates(n3, view2.getMeasuredState());
        }
        else {
            a = 0;
            n4 = 0;
        }
        int measuredHeight;
        if (view3 != null) {
            int measureSpec;
            if (mode == 0) {
                measureSpec = 0;
            }
            else {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n2), mode);
            }
            view3.measure(i, measureSpec);
            measuredHeight = view3.getMeasuredHeight();
            n2 += measuredHeight;
            n3 = View.combineMeasuredStates(n3, view3.getMeasuredState());
        }
        else {
            measuredHeight = 0;
        }
        final int n5 = size - n2;
        int n6 = n3;
        int n7 = n5;
        int n8 = n2;
        if (view2 != null) {
            final int min = Math.min(n5, n4);
            int n9 = n5;
            int n10 = a;
            if (min > 0) {
                n9 = n5 - min;
                n10 = a + min;
            }
            view2.measure(i, View$MeasureSpec.makeMeasureSpec(n10, 1073741824));
            n8 = n2 - a + view2.getMeasuredHeight();
            final int combineMeasuredStates = View.combineMeasuredStates(n3, view2.getMeasuredState());
            n7 = n9;
            n6 = combineMeasuredStates;
        }
        int combineMeasuredStates2 = n6;
        int n11 = n8;
        if (view3 != null) {
            combineMeasuredStates2 = n6;
            n11 = n8;
            if (n7 > 0) {
                view3.measure(i, View$MeasureSpec.makeMeasureSpec(measuredHeight + n7, mode));
                n11 = n8 - measuredHeight + view3.getMeasuredHeight();
                combineMeasuredStates2 = View.combineMeasuredStates(n6, view3.getMeasuredState());
            }
        }
        int k = 0;
        int n12 = 0;
        while (k < childCount) {
            final View child2 = this.getChildAt(k);
            int max = n12;
            if (child2.getVisibility() != 8) {
                max = Math.max(n12, child2.getMeasuredWidth());
            }
            ++k;
            n12 = max;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(n12 + (this.getPaddingLeft() + this.getPaddingRight()), i, combineMeasuredStates2), View.resolveSizeAndState(n11, n, 0));
        if (mode2 != 1073741824) {
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
            View child3;
            mt mt;
            int height;
            for (i = 0; i < childCount; ++i) {
                child3 = this.getChildAt(i);
                if (child3.getVisibility() != 8) {
                    mt = (mt)child3.getLayoutParams();
                    if (mt.width == -1) {
                        height = mt.height;
                        mt.height = child3.getMeasuredHeight();
                        this.measureChildWithMargins(child3, measureSpec2, 0, n, 0);
                        mt.height = height;
                    }
                }
            }
        }
    }
}
