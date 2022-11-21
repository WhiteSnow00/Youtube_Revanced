// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.engagementpanel.size;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.View;

public class EngagementPanelSizeBehavior extends aej implements uzn
{
    private final int a;
    private final uym b;
    private final uxu c;
    private final uza d;
    private uyz e;
    private final atlv f;
    private final atls g;
    private final aske h;
    private final atlv i;
    private boolean j;
    private View k;
    
    public EngagementPanelSizeBehavior(final Context context, final uxu c, final uym b, final uza d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = atlv.aE();
        final atls af = atls.aF((Object)false);
        this.g = af;
        this.i = atlv.aE();
        this.a = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 32;
        this.h = ((aske)af).p().w((asmi)new m(19)).j((aski)kxn.h);
    }
    
    private final boolean z() {
        final Boolean b = (Boolean)this.g.aG();
        return b != null && b;
    }
    
    public final uzl a() {
        return uzl.b;
    }
    
    public final aske c() {
        return this.h;
    }
    
    public final aske d() {
        return (aske)this.i;
    }
    
    public final aske e() {
        return aske.z();
    }
    
    public final aske f() {
        return (aske)this.f;
    }
    
    public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, final View view2, float abs, final float n, final boolean b) {
        if (!this.j) {
            return false;
        }
        abs = Math.abs(n);
        if (n <= 0.0f && abs >= this.a && this.z()) {
            this.i.tt((Object)uzm.c);
            this.g.tt((Object)false);
            return true;
        }
        return false;
    }
    
    public final boolean l(final CoordinatorLayout coordinatorLayout, View k, final View view, final View view2, final int n, int n2) {
        final uwd d = this.c.d;
        final boolean b = false;
        final boolean b2 = false;
        boolean j;
        if (d == null) {
            j = b;
        }
        else {
            k = this.k;
            if (k != null && k != view) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            final uyz e = this.e;
            j = b;
            if (e != null) {
                j = b;
                if (e.t != uzf.c) {
                    j = b;
                    if (this.b.e()) {
                        j = b;
                        if (!d.r()) {
                            j = b;
                            if (d.I()) {
                                j = b;
                                if (n2 != 0) {
                                    j = b2;
                                    if (n == 2) {
                                        j = true;
                                    }
                                    this.j = j;
                                }
                            }
                        }
                    }
                }
            }
        }
        return j;
    }
    
    public final void qG(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        this.y();
    }
    
    public final void ss(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int n, final int n2, final int[] array, final int n3) {
        if (!this.j) {
            return;
        }
        final uyz e = this.e;
        if (n2 > 0 && this.z() && e != null) {
            n = e.r;
            this.f.tt((Object)(-n2));
            n = Math.max(0, Math.min(n2, -(e.r - n)));
            if (n > 0) {
                array[1] += n;
            }
        }
    }
    
    public final void st(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (!this.j) {
            return;
        }
        if (n4 < 0) {
            this.g.tt((Object)true);
            this.f.tt((Object)(-n4));
            array[1] += n4;
            final uyz e = this.e;
            e.getClass();
            if (e.r > this.d.b().bottom) {
                this.y();
            }
        }
        else if (n4 == 0 && !this.z()) {
            this.j = false;
        }
    }
    
    public final void x(final uyz e, final View k) {
        this.e = e;
        this.k = k;
    }
    
    public final void y() {
        if (this.z()) {
            this.i.tt((Object)uzm.a);
            this.g.tt((Object)false);
        }
        this.j = false;
    }
}
