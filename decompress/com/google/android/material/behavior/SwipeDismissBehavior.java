// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior extends aei
{
    private boolean a;
    private final aqh b;
    public aqi e;
    public boolean f;
    public int g;
    public float h;
    public float i;
    public float j;
    public afhd k;
    
    public SwipeDismissBehavior() {
        this.g = 2;
        this.h = 0.5f;
        this.i = 0.0f;
        this.j = 0.5f;
        this.b = (aqh)new adtf(this);
    }
    
    public static float A(final float n) {
        return Math.min(Math.max(0.0f, n), 1.0f);
    }
    
    public boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        if (anb.d(view) == 0) {
            anb.X(view, 1);
            anb.K(view, 1048576);
            if (this.w(view)) {
                anb.av(view, aol.h, (apb)new adtg(this));
            }
        }
        return false;
    }
    
    public boolean m(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        if (this.e != null) {
            if (!this.f || motionEvent.getActionMasked() != 3) {
                this.e.f(motionEvent);
            }
            return true;
        }
        return false;
    }
    
    public boolean qK(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        boolean a = this.a;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.a = false;
            }
        }
        else {
            a = coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY());
            this.a = a;
        }
        if (a) {
            if (this.e == null) {
                this.e = aqi.b((ViewGroup)coordinatorLayout, this.b);
            }
            if (!this.f && this.e.k(motionEvent)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean w(final View view) {
        return true;
    }
    
    public void z(final afhd k) {
        this.k = k;
    }
}
