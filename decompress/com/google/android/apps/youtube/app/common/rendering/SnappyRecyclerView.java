// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.rendering;

import android.view.MotionEvent;
import android.app.Activity;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class SnappyRecyclerView extends RecyclerView
{
    public aukv aa;
    
    public SnappyRecyclerView(final Context context) {
        super(context);
    }
    
    public SnappyRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public SnappyRecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final boolean aq(final int n, final int n2) {
        final nw n3 = super.n;
        if (n3 instanceof frf) {
            this.aj(((frf)n3).b(n, n2));
            return true;
        }
        return super.aq(n, n2);
    }
    
    protected final void onAttachedToWindow() {
        if (this.getContext() instanceof Activity) {
            final Activity activity = (Activity)this.getContext();
            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                activity.getWindow().getDecorView().requestLayout();
            }
        }
        super.onAttachedToWindow();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final aukv aa = this.aa;
        if (aa != null) {
            aa.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        final nw n = super.n;
        if (n instanceof frf && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && super.F == 0) {
            this.aj(((frf)n).a());
        }
        return onTouchEvent;
    }
}
