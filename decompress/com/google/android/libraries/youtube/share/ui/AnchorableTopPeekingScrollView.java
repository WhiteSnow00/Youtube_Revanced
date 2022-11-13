// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.share.ui;

import android.view.View;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;

public class AnchorableTopPeekingScrollView extends TopPeekingScrollView
{
    public boolean n;
    public int o;
    public int p;
    
    public AnchorableTopPeekingScrollView(final Context context) {
        this(context, null);
    }
    
    public AnchorableTopPeekingScrollView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AnchorableTopPeekingScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void i(final boolean b) {
        boolean n = b;
        if (this.n && !(n = b)) {
            n = false;
            this.b(this.p = 0, super.k);
            this.c(0);
        }
        this.n = n;
    }
    
    @Override
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return !this.n && super.onInterceptTouchEvent(motionEvent);
    }
    
    @Override
    protected final void onLayout(final boolean b, int n, final int n2, int measuredWidth, final int n3) {
        if (this.n) {
            if (this.getChildCount() > 0) {
                final View child = this.getChildAt(0);
                n = measuredWidth - n;
                measuredWidth = child.getMeasuredWidth();
                child.layout((n - measuredWidth) / 2, n2 + super.k, (n - child.getMeasuredWidth()) / 2 + child.getMeasuredWidth(), n3);
            }
            return;
        }
        super.onLayout(b, n, n2, measuredWidth, n3);
    }
    
    @Override
    protected final void onMeasure(int n, int k) {
        super.onMeasure(n, k);
        final int measuredHeight = this.getMeasuredHeight();
        this.o = measuredHeight;
        if (this.n) {
            n = this.p;
            if (n != 0) {
                k = super.k;
                n = Math.min(n + (k + k) - measuredHeight, k);
                this.b(n, n);
                if (this.j.isFinished()) {
                    this.a(n);
                }
            }
        }
    }
    
    @Override
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return !this.n && super.onTouchEvent(motionEvent);
    }
}
