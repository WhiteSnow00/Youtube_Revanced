// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.presenter;

import java.util.Set;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.view.ViewStub;
import java.util.List;
import android.content.Context;
import android.widget.FrameLayout;

public final class TimeRangeView extends FrameLayout
{
    public final Context a;
    public int b;
    public int c;
    public List d;
    public anxy e;
    public aejr f;
    public aejr g;
    private final ViewStub h;
    private final ViewStub i;
    
    public TimeRangeView(final Context context) {
        this(context, null);
    }
    
    public TimeRangeView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TimeRangeView(final Context a, final AttributeSet set, final int n) {
        super(a, set, n);
        this.d = new ArrayList();
        this.a = a;
        this.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2));
        inflate(a, 2131625632, (ViewGroup)this);
        this.h = (ViewStub)this.findViewById(2131429702);
        this.i = (ViewStub)this.findViewById(2131432251);
    }
    
    public final int a() {
        final aejr f = this.f;
        f.getClass();
        return f.b;
    }
    
    public final int b() {
        final aejr g = this.g;
        g.getClass();
        return g.b;
    }
    
    public final boolean c(final anxy e, final int n) {
        this.b = 2;
        this.c = 1;
        this.e = e;
        final List u = kgk.u(e);
        this.d = u;
        if (u.size() != 2) {
            return false;
        }
        final ViewStub h = this.h;
        if (h != null) {
            final aejr f = new aejr(this.a, h, (anyf)this.d.get(0));
            this.f = f;
            if (n >= 0) {
                ((Set<aclm>)f.d).add(new aclm(this, n));
            }
        }
        final ViewStub i = this.i;
        if (i != null) {
            this.g = new aejr(this.a, i, (anyf)this.d.get(1));
        }
        return true;
    }
    
    public final void d(final anxy anxy) {
        final List u = kgk.u(anxy);
        this.d = u;
        if (u.size() != this.b) {
            return;
        }
        final Context a = this.a;
        a.getClass();
        final aejr f = this.f;
        if (f != null) {
            f.f(a, (anyf)this.d.get(0));
        }
        final aejr g = this.g;
        if (g != null) {
            g.f(this.a, (anyf)this.d.get(this.c));
        }
    }
}
