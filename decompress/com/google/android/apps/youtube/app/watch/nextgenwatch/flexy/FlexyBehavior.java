// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import java.util.Set;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewConfiguration;
import android.content.Context;

public class FlexyBehavior extends aeh
{
    public boolean a;
    public boolean b;
    private final int c;
    private final kxm d;
    private final kxi e;
    private final mri f;
    
    public FlexyBehavior(final Context context, final kxm d, final kxi e, final lgl lgl) {
        this.a = true;
        this.b = false;
        this.d = d;
        this.e = e;
        this.f = new mri(this, d);
        int c;
        if (lgl.a) {
            c = kyp.b(context);
        }
        else {
            c = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }
        this.c = c;
    }
    
    private final boolean A() {
        return this.y() < this.w();
    }
    
    private final boolean B() {
        return this.y() > this.x();
    }
    
    private final int w() {
        return this.e.a();
    }
    
    private final int x() {
        return this.e.b();
    }
    
    private final int y() {
        return this.e.c();
    }
    
    private final void z(final boolean b) {
        final boolean b2 = this.b;
        int n = 1;
        if (!b) {
            n = ((this.A() && n) ? 1 : 0);
        }
        this.b = (((b2 ? 1 : 0) | n) != 0x0);
    }
    
    public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2, final boolean b) {
        if (Math.abs(n2) < this.c) {
            return false;
        }
        if (n2 > 0.0f && this.B()) {
            this.d.h(1, true);
            return true;
        }
        return false;
    }
    
    public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2) {
        this.z(n2 < 0.0f);
        return false;
    }
    
    public final boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int n2) {
        final mri f = this.f;
        final RecyclerView c = kyp.c(view3);
        if (c != null) {
            final nw n3 = c.n;
            if (n3 instanceof OverScrollLinearLayoutManager) {
                final Set c2 = ((OverScrollLinearLayoutManager)n3).c;
                f.getClass();
                c2.add(f);
            }
        }
        final boolean b = false;
        this.a = false;
        boolean b2 = b;
        if (!this.e.f()) {
            b2 = b;
            if ((n & 0x2) == 0x2) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void qC(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        this.a = true;
    }
    
    public final void sm(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int min, final int n, final int[] array, final int n2) {
        final boolean b = n > 0;
        if (b && this.B()) {
            min = Math.min(Math.max(0, this.y() - this.x()), n);
            array[1] = min;
            this.e.e(this.y() - min);
            if (coordinatorLayout.getParent() != null) {
                coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.z(b);
    }
    
    public final void sn(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int min, final int n, final int n2, final int n3, final int n4, final int[] array) {
        if (n3 < 0 && this.A()) {
            min = Math.min(Math.max(0, this.w() - this.y()), Math.abs(n3));
            this.e.e(this.y() + min);
            if (coordinatorLayout.getParent() != null) {
                coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
            array[1] += n3;
        }
    }
}
