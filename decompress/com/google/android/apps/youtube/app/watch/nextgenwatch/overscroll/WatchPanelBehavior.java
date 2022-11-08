// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;

public class WatchPanelBehavior extends aeh implements kzr
{
    public final atig a;
    private final FlexyBehavior b;
    private final kzi c;
    private final int d;
    private final atid e;
    private final atid f;
    private final atid g;
    private final asgt h;
    private final asgt i;
    private final asgt j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    
    public WatchPanelBehavior(final Context context, final FlexyBehavior b, final kzi c) {
        this.b = b;
        this.c = c;
        final atid ad = atid.aD();
        this.e = ad;
        final atid ae = atid.aE((Object)0);
        this.f = ae;
        this.a = atig.aD();
        this.g = atid.aD();
        this.h = ((asgt)ad).B((asjd)kbz.q).L((asjc)kus.s);
        final asgt ad2 = ((asgt)ae).p().ax().aD();
        this.j = ad2;
        this.i = ad2.L((asjc)kus.t).Y((asjc)new kpm(this, 14)).ax().aD();
        this.d = kyp.b(context);
    }
    
    private static int x(final int n) {
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 1;
    }
    
    public final asgt b() {
        return (asgt)this.g;
    }
    
    public final asgt e() {
        return this.j;
    }
    
    public final asgt f() {
        return this.i;
    }
    
    public final asgt g() {
        return this.h;
    }
    
    public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, final View view2, float abs, final float n, final boolean b) {
        if (this.k && this.b.i(coordinatorLayout, view, view2, abs, n, b)) {
            return true;
        }
        abs = Math.abs(n);
        if (n < 0.0f && abs > this.d && this.w()) {
            this.g.tr((Object)1);
            return true;
        }
        return false;
    }
    
    public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2) {
        if (this.k) {
            this.b.j(coordinatorLayout, view, view2, n, n2);
        }
        return false;
    }
    
    public final boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int m, final int n) {
        final boolean l = this.b.l(coordinatorLayout, view, view2, view3, m, n);
        this.k = l;
        this.m = m;
        final boolean i = m == 2;
        this.l = i;
        this.n = 0;
        return i || l;
    }
    
    public final void qC(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        final boolean l = this.l;
        final Integer value = 0;
        if (l) {
            if (this.w()) {
                this.g.tr((Object)value);
            }
            this.e.tr((Object)value);
            this.f.tr((Object)x(0));
            this.m = 0;
            this.l = false;
        }
        if (this.k) {
            this.b.qC(coordinatorLayout, view, view2, n);
            this.k = false;
        }
    }
    
    public final void sm(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int[] array, final int n3) {
        if (this.l && this.w()) {
            if (n2 > 0) {
                final kzn f = this.c.f;
                kzu d;
                if (f == null) {
                    d = null;
                }
                else {
                    d = f.d;
                }
                if (d == null) {
                    return;
                }
                final int top = d.c.top;
                this.a.tr((Object)(-n2));
                if (d.c.top == top && n3 == 0) {
                    this.n += n2;
                }
                array[1] += n2;
            }
            else if (n2 < 0) {
                final int n4 = this.n;
                if (n4 > 0) {
                    this.n = n4 + n2;
                    array[1] += n2;
                }
            }
        }
        if (this.k) {
            this.b.sm(coordinatorLayout, view, view2, n - array[0], n2 - array[1], array, n3);
        }
    }
    
    public final void sn(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (this.k) {
            this.b.sn(coordinatorLayout, view, view2, n, n2, n3 - array[0], n4 - array[1], n5, array);
        }
        n = n4 - array[1];
        if (this.l) {
            if (n < 0) {
                this.f.tr((Object)x(this.m));
                this.e.tr((Object)4);
                this.a.tr((Object)(-n));
                array[1] += n;
                return;
            }
            if (n == 0 && !this.w()) {
                this.l = false;
            }
        }
    }
    
    public final boolean w() {
        final Integer n = (Integer)this.f.aF();
        return n != null && !n.equals(0);
    }
}
