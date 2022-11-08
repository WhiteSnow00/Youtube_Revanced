// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.util.DisplayMetrics;

public class FullscreenEngagementPanelCoordinatorLayout extends ivf
{
    public int i;
    public int j;
    private final DisplayMetrics k;
    private final int l;
    private final int m;
    
    public FullscreenEngagementPanelCoordinatorLayout(final Context context) {
        this(context, null);
    }
    
    public FullscreenEngagementPanelCoordinatorLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FullscreenEngagementPanelCoordinatorLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.k = context.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ixg.a);
        this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected final void onMeasure(int n, final int n2) {
        final long n3 = View$MeasureSpec.getSize(n);
        final long max = Math.max(n3 / 2L, View$MeasureSpec.getSize(n2));
        if ((n = tmy.aZ(this.k, this.i)) <= 0) {
            n = this.l;
        }
        final long n4 = n;
        if ((n = tmy.aZ(this.k, this.j)) <= 0) {
            n = this.m;
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec((int)tmy.aO(n3 - max, n4, (long)n), 1073741824), n2);
    }
}
