// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.text.Layout;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.TimeInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;

public class SnackbarContentLayout extends LinearLayout implements adzg
{
    public TextView a;
    public Button b;
    public int c;
    private final TimeInterpolator d;
    
    public SnackbarContentLayout(final Context context) {
        this(context, null);
    }
    
    public SnackbarContentLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = adds.I(context, 2130969956, adsf.b);
    }
    
    private final boolean c(final int orientation, final int n, final int n2) {
        boolean b;
        if (orientation != this.getOrientation()) {
            this.setOrientation(orientation);
            b = true;
        }
        else {
            b = false;
        }
        if (this.a.getPaddingTop() == n && this.a.getPaddingBottom() == n2) {
            return b;
        }
        final TextView a = this.a;
        if (anb.ar((View)a)) {
            anb.ab((View)a, anb.j((View)a), n, anb.i((View)a), n2);
        }
        else {
            ((View)a).setPadding(((View)a).getPaddingLeft(), n, ((View)a).getPaddingRight(), n2);
        }
        return true;
    }
    
    public final void a(final int n, final int n2) {
        this.a.setAlpha(0.0f);
        final ViewPropertyAnimator alpha = this.a.animate().alpha(1.0f);
        final long n3 = n2;
        final ViewPropertyAnimator setInterpolator = alpha.setDuration(n3).setInterpolator(this.d);
        final long n4 = n;
        setInterpolator.setStartDelay(n4).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(n3).setInterpolator(this.d).setStartDelay(n4).start();
        }
    }
    
    public final void b(final int n) {
        this.a.setAlpha(1.0f);
        final ViewPropertyAnimator alpha = this.a.animate().alpha(0.0f);
        final long n2 = n;
        alpha.setDuration(n2).setInterpolator(this.d).setStartDelay(0L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(n2).setInterpolator(this.d).setStartDelay(0L).start();
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131431601);
        this.b = (Button)this.findViewById(2131431598);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166284);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131166283);
        final Layout layout = this.a.getLayout();
        final boolean b = layout != null && layout.getLineCount() > 1;
        if (b && this.c > 0 && this.b.getMeasuredWidth() > this.c) {
            if (!this.c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        }
        else {
            if (!b) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!this.c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(n, n2);
    }
}
