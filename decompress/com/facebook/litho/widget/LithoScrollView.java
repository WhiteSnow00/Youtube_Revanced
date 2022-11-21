// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.litho.widget;

import android.graphics.Canvas;
import android.view.MotionEvent;
import java.util.List;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.core.widget.NestedScrollView;

public class LithoScrollView extends NestedScrollView implements duz
{
    public final dvx d;
    public ViewTreeObserver$OnPreDrawListener e;
    public boolean f;
    public eby g;
    public aunx h;
    private ema i;
    
    public LithoScrollView(final Context context) {
        this(context, null);
    }
    
    public LithoScrollView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LithoScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.addView((View)(this.d = new dvx(context)));
    }
    
    public final void a(final List list) {
        list.add(this.d);
    }
    
    public final void c(final int n) {
        super.c(n);
        final eby g = this.g;
        if (g != null) {
            g.d();
        }
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return super.dispatchNestedFling(n, n2, true);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final ema i = this.i;
        if (i != null) {
            i.k((View)this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final eby g = this.g;
        if (g != null) {
            g.a((View)this);
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    protected final void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        if (this.f) {
            this.d.t();
        }
        final aunx h = this.h;
        if (h != null) {
            h.a = this.getScrollY();
        }
        final eby g = this.g;
        if (g != null) {
            g.b((View)this);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        final eby g = this.g;
        if (g != null) {
            g.c((View)this, motionEvent);
        }
        return onTouchEvent;
    }
    
    public final ema p() {
        return this.i;
    }
    
    public final void q(final ema i) {
        this.i = i;
    }
}
