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
    public final acqb l;
    
    public BaseTransientBottomBar$Behavior() {
        this.l = new acqb((SwipeDismissBehavior)this);
    }
    
    public boolean qK(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        final acqb l = this.l;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                adzl.a().f((afhd)l.a);
            }
        }
        else if (coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
            adzl.a().e((afhd)l.a);
        }
        return super.qK(coordinatorLayout, view, motionEvent);
    }
    
    public boolean w(final View view) {
        return view instanceof adze;
    }
}
