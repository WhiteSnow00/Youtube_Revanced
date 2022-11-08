// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior
{
    public final acnx l;
    
    public BaseTransientBottomBar$Behavior() {
        this.l = new acnx((SwipeDismissBehavior)this);
    }
    
    public boolean qF(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        final acnx l = this.l;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                adxj.a().f((aepj)l.a);
            }
        }
        else if (coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
            adxj.a().e((aepj)l.a);
        }
        return super.qF(coordinatorLayout, view, motionEvent);
    }
    
    public boolean w(final View view) {
        return view instanceof adxc;
    }
}
