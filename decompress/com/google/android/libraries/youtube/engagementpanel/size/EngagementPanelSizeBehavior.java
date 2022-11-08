// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.engagementpanel.size;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.m;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.View;

public class EngagementPanelSizeBehavior extends aeh implements uwl
{
    private final int a;
    private final uvk b;
    private final uvz c;
    private uvy d;
    private final atig e;
    private final atid f;
    private final asgt g;
    private final atig h;
    private boolean i;
    private View j;
    private final xpn k;
    
    public EngagementPanelSizeBehavior(final Context context, final xpn k, final uvk b, final uvz c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.k = k;
        this.c = c;
        this.e = atig.aD();
        final atid ae = atid.aE((Object)false);
        this.f = ae;
        this.h = atig.aD();
        this.a = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 32;
        this.g = ((asgt)ae).p().w((asix)new m(20)).j((asgx)kwc.h);
    }
    
    private final boolean y() {
        final Boolean b = (Boolean)this.f.aF();
        return b != null && b;
    }
    
    public final uwj a() {
        return uwj.b;
    }
    
    public final asgt c() {
        return this.g;
    }
    
    public final asgt d() {
        return (asgt)this.h;
    }
    
    public final asgt e() {
        return asgt.z();
    }
    
    public final asgt f() {
        return (asgt)this.e;
    }
    
    public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, final View view2, float abs, final float n, final boolean b) {
        if (!this.i) {
            return false;
        }
        abs = Math.abs(n);
        if (n <= 0.0f && abs >= this.a && this.y()) {
            this.h.tr((Object)uwk.c);
            this.f.tr((Object)false);
            return true;
        }
        return false;
    }
    
    public final boolean l(final CoordinatorLayout coordinatorLayout, View j, final View view, final View view2, final int n, int n2) {
        final Object d = this.k.d;
        final boolean b = false;
        final boolean b2 = false;
        boolean i;
        if (d == null) {
            i = b;
        }
        else {
            j = this.j;
            if (j != null && j != view) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            final uvy d2 = this.d;
            i = b;
            if (d2 != null) {
                i = b;
                if (d2.t != uwc.c) {
                    i = b;
                    if (this.b.e()) {
                        i = b;
                        if (!((utd)d).r()) {
                            i = b;
                            if (((utd)d).J()) {
                                i = b;
                                if (n2 != 0) {
                                    i = b2;
                                    if (n == 2) {
                                        i = true;
                                    }
                                    this.i = i;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i;
    }
    
    public final void qC(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
        this.x();
    }
    
    public final void sm(final CoordinatorLayout coordinatorLayout, final View view, final View view2, int n, final int n2, final int[] array, final int n3) {
        if (!this.i) {
            return;
        }
        final uvy d = this.d;
        if (n2 > 0 && this.y() && d != null) {
            n = d.r;
            this.e.tr((Object)(-n2));
            n = Math.max(0, Math.min(n2, -(d.r - n)));
            if (n > 0) {
                array[1] += n;
            }
        }
    }
    
    public final void sn(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (!this.i) {
            return;
        }
        if (n4 < 0) {
            this.f.tr((Object)true);
            this.e.tr((Object)(-n4));
            array[1] += n4;
            final uvy d = this.d;
            d.getClass();
            if (d.r > this.c.b().bottom) {
                this.x();
            }
        }
        else if (n4 == 0 && !this.y()) {
            this.i = false;
        }
    }
    
    public final void w(final uvy d, final View j) {
        this.d = d;
        this.j = j;
    }
    
    public final void x() {
        if (this.y()) {
            this.h.tr((Object)uwk.a);
            this.f.tr((Object)false);
        }
        this.i = false;
    }
}
