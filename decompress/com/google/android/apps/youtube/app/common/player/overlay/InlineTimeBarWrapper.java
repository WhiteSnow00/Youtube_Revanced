// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.player.overlay;

import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public final class InlineTimeBarWrapper extends for implements atjj
{
    public final foz a;
    
    public InlineTimeBarWrapper(final Context context) {
        this(context, null);
    }
    
    public InlineTimeBarWrapper(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public InlineTimeBarWrapper(final Context context, final AttributeSet set, int int1) {
        super(context, set, int1);
        final foz a = new foz(context, set);
        this.a = a;
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, fpq.b, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            int1 = obtainStyledAttributes.getInt(0, -1);
            if (int1 != -1) {
                a.u(int1);
            }
        }
        else {
            a.u(2);
        }
        obtainStyledAttributes.recycle();
        this.addView((View)a);
    }
    
    public final boolean isImportantForAccessibility() {
        return true;
    }
    
    protected final void onLayout(final boolean b, int max, final int n, int n2, final int n3) {
        final int n4 = n2 - max;
        final int n5 = n3 - n;
        if (n4 != 0) {
            if (n5 != 0) {
                int paddingLeft = this.getPaddingLeft();
                n2 = this.getPaddingRight();
                final int n6 = 0;
                n2 = Math.max(0, n4 - n2);
                final int b2 = this.a.b();
                final int n7 = n5 - b2;
                if (!this.a.D()) {
                    final foz a = this.a;
                    if (a.o == null) {
                        a.o = new toz();
                    }
                    toz.c(a.o, a.n, gow.c((View)a, a.n));
                    final Rect a2 = a.o.a;
                    if (a2.width() > 0) {
                        paddingLeft = a2.left - max;
                        n2 = a2.right - max;
                    }
                    max = a2.top - n + (a2.height() - b2) / 2;
                }
                else {
                    max = n7;
                }
                this.a.h.set(0, 0, n2 - paddingLeft, b2);
                if (this.a.D()) {
                    this.a.layout(0, Math.max(0, n7), n4, n5);
                    return;
                }
                if (max > n3) {
                    max = n6;
                }
                else {
                    max = Math.max(0, max);
                }
                this.a.layout(paddingLeft, max, n2, b2 + max);
            }
        }
    }
    
    protected final void onMeasure(final int n, int size) {
        final int size2 = View$MeasureSpec.getSize(n);
        final int n2 = size = View$MeasureSpec.getSize(size);
        if (this.a.D()) {
            size = n2 + Math.round((this.a.b() - this.a.j) / 2.0f);
        }
        this.a.measure(n, View$MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.setMeasuredDimension(size2, size);
    }
}
