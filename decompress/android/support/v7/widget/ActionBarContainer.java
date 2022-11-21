// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout
{
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public boolean d;
    public boolean e;
    private boolean f;
    private View g;
    private View h;
    private int i;
    
    public ActionBarContainer(final Context context) {
        this(context, null);
    }
    
    public ActionBarContainer(final Context context, final AttributeSet set) {
        super(context, set);
        anc.Q((View)this, (Drawable)new jl(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gm.a);
        final boolean b = false;
        this.a = obtainStyledAttributes.getDrawable(0);
        this.b = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (this.getId() == 2131431640) {
            this.d = true;
            this.c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        boolean willNotDraw = false;
        Label_0131: {
            if (this.d) {
                willNotDraw = b;
                if (this.c != null) {
                    break Label_0131;
                }
            }
            else {
                willNotDraw = b;
                if (this.a != null) {
                    break Label_0131;
                }
                willNotDraw = b;
                if (this.b != null) {
                    break Label_0131;
                }
            }
            willNotDraw = true;
        }
        this.setWillNotDraw(willNotDraw);
    }
    
    public final void a(final boolean f) {
        this.f = f;
        int descendantFocusability;
        if (!f) {
            descendantFocusability = 262144;
        }
        else {
            descendantFocusability = 393216;
        }
        this.setDescendantFocusability(descendantFocusability);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable a = this.a;
        if (a != null && a.isStateful()) {
            this.a.setState(this.getDrawableState());
        }
        final Drawable b = this.b;
        if (b != null && b.isStateful()) {
            this.b.setState(this.getDrawableState());
        }
        final Drawable c = this.c;
        if (c != null && c.isStateful()) {
            this.c.setState(this.getDrawableState());
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable a = this.a;
        if (a != null) {
            a.jumpToCurrentState();
        }
        final Drawable b = this.b;
        if (b != null) {
            b.jumpToCurrentState();
        }
        final Drawable c = this.c;
        if (c != null) {
            c.jumpToCurrentState();
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = this.findViewById(2131427444);
        this.h = this.findViewById(2131427466);
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }
    
    public final void onLayout(final boolean b, int n, int visibility, final int n2, final int n3) {
        super.onLayout(b, n, visibility, n2, n3);
        if (this.d) {
            final Drawable c = this.c;
            if (c == null) {
                return;
            }
            c.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
        }
        else {
            if (this.a != null) {
                visibility = this.g.getVisibility();
                n = 1;
                if (visibility == 0) {
                    this.a.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
                }
                else {
                    final View h = this.h;
                    if (h != null && h.getVisibility() == 0) {
                        this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                    }
                    else {
                        this.a.setBounds(0, 0, 0, 0);
                    }
                }
            }
            else {
                n = 0;
            }
            this.e = false;
            if (n == 0) {
                return;
            }
        }
        this.invalidate();
    }
    
    public final void onMeasure(final int n, final int n2) {
        int measureSpec = n2;
        if (this.g == null) {
            measureSpec = n2;
            if (View$MeasureSpec.getMode(n2) == Integer.MIN_VALUE) {
                final int i = this.i;
                measureSpec = n2;
                if (i >= 0) {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(i, View$MeasureSpec.getSize(n2)), Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(n, measureSpec);
        if (this.g == null) {
            return;
        }
        View$MeasureSpec.getMode(measureSpec);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final Drawable a = this.a;
        final boolean b = visibility == 0;
        if (a != null) {
            a.setVisible(b, false);
        }
        final Drawable b2 = this.b;
        if (b2 != null) {
            b2.setVisible(b, false);
        }
        final Drawable c = this.c;
        if (c != null) {
            c.setVisible(b, false);
        }
    }
    
    public final ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    public final ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        if (n != 0) {
            return super.startActionModeForChild(view, actionMode$Callback, n);
        }
        return null;
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return (drawable == this.a && !this.d) || (drawable == this.c && this.d) || super.verifyDrawable(drawable);
    }
}
