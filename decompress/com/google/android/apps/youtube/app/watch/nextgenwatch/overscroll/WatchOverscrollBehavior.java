// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;

public class WatchOverscrollBehavior extends aeh
{
    private final utk a;
    private final FlexyBehavior b;
    private boolean c;
    private boolean d;
    
    public WatchOverscrollBehavior(final utk a, final FlexyBehavior b) {
        this.a = a;
        this.b = b;
    }
    
    private final boolean w() {
        if (this.c) {
            final utk a = this.a;
            if (!a.g().u && a.g().t != uwc.a) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2, final boolean b) {
        return (this.w() && this.b.i(coordinatorLayout, view, view2, n, n2, b)) || (this.d && ((aeh)this.a.g().b).i(coordinatorLayout, view, view2, n, n2, b));
    }
    
    public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2) {
        if (this.w()) {
            this.b.j(coordinatorLayout, view, view2, n, n2);
        }
        return false;
    }
    
    public final boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int n2) {
        this.c = this.b.l(coordinatorLayout, view, view2, view3, n, n2);
        final boolean l = ((aeh)this.a.g().b).l(coordinatorLayout, view, view2, view3, n, n2);
        this.d = l;
        return this.c || l;
    }
    
    public final void qC(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        if (this.c) {
            this.b.qC(coordinatorLayout, view, view2, n);
            this.c = false;
        }
        if (this.d) {
            this.a.g().b.x();
            this.d = false;
        }
    }
    
    public final void sm(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int[] array, final int n3) {
        if (this.d) {
            ((aeh)this.a.g().b).sm(coordinatorLayout, view, view2, n - array[0], n2 - array[1], array, n3);
        }
        if (this.w()) {
            this.b.sm(coordinatorLayout, view, view2, n - array[0], n2 - array[1], array, n3);
        }
    }
    
    public final void sn(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (this.w()) {
            this.b.sn(coordinatorLayout, view, view2, n, n2, n3 - array[0], n4 - array[1], n5, array);
        }
        if (this.d) {
            ((aeh)this.a.g().b).sn(coordinatorLayout, view, view2, n, n2, n3 - array[0], n4 - array[1], n5, array);
        }
    }
}
