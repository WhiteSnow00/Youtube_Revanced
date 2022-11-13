// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.loading;

import android.widget.TextView;
import android.widget.ProgressBar;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.content.Context;

public class SpecificNetworkErrorViewLoadingFrameLayout extends fjx
{
    public final Context a;
    public fkb b;
    public fka c;
    public FrameLayout d;
    public fjz e;
    public wyw f;
    public int g;
    public tjm h;
    public vai i;
    public ajb j;
    private fkb k;
    
    public SpecificNetworkErrorViewLoadingFrameLayout(final Context context) {
        this(context, 2131624774, 2131624776, 2131624773);
    }
    
    public SpecificNetworkErrorViewLoadingFrameLayout(final Context a, final int n, final int n2) {
        super(a);
        this.g = 0;
        a.getClass();
        this.a = a;
        this.k(n2);
        this.j(n);
        this.d();
    }
    
    public SpecificNetworkErrorViewLoadingFrameLayout(final Context context, final int n, final int n2, final int n3) {
        this(context, n, n2);
        this.i(n3);
    }
    
    public SpecificNetworkErrorViewLoadingFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SpecificNetworkErrorViewLoadingFrameLayout(final Context a, final AttributeSet set, final int n) {
        super(a, set, n);
        this.g = 0;
        a.getClass();
        this.a = a;
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes(set, fjy.a, n, 0);
        this.k(obtainStyledAttributes.getResourceId(2, 2131624776));
        this.i(obtainStyledAttributes.getResourceId(0, 2131624773));
        this.j(obtainStyledAttributes.getResourceId(1, 2131624774));
        this.d();
        obtainStyledAttributes.recycle();
        final tjm h = this.h;
        h.getClass();
        this.f(h.p() ^ true);
    }
    
    private final void i(final int n) {
        this.b = new fkb(this, 4, n, 2131428856);
    }
    
    private final void j(final int n) {
        this.c = new fka(this, n);
    }
    
    private final void k(final int n) {
        this.k = new fkb(this, 1, n, 0);
    }
    
    private static boolean l(final int n) {
        return n == 1 || n == 6;
    }
    
    public final void d() {
        this.addView((View)(this.d = (FrameLayout)LayoutInflater.from(this.getContext()).inflate(2131624772, (ViewGroup)this, false)));
        final ajb j = this.j;
        final FrameLayout d = this.d;
        final bu bu = (bu)((atke)j.b).a();
        bu.getClass();
        final fmr fmr = (fmr)((atke)j.a).a();
        fmr.getClass();
        final ziy ziy = (ziy)((atke)j.c).a();
        ziy.getClass();
        d.getClass();
        this.e = (fjz)new ioe(bu, fmr, ziy, d, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void e() {
        this.g(2);
    }
    
    public final void f(final boolean b) {
        tbi.f();
        if (b) {
            this.g(6);
            return;
        }
        this.g(1);
    }
    
    public final void g(final int g) {
        if (this.g != g) {
            int visibility;
            if (g == 2) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).setVisibility(visibility);
            }
            final fkb k = this.k;
            k.getClass();
            k.f(g);
            final wyw f = this.f;
            if (f != null) {
                if (this.i.X()) {
                    final wyt wyt = new wyt(xaa.c(147758));
                    if (l(g)) {
                        f.l((wzz)wyt);
                    }
                    else if (l(this.g)) {
                        f.o((wzz)wyt, (alhi)null);
                    }
                }
            }
            final fka c = this.c;
            c.getClass();
            c.f(g);
            if (g != 5) {
                if (g != 6) {
                    final FrameLayout d = this.d;
                    d.getClass();
                    d.setVisibility(8);
                }
                else {
                    final fjz e = this.e;
                    e.getClass();
                    final ioe ioe = (ioe)e;
                    ioe.f(true, (wyw)null);
                    final ProgressBar h = ioe.h;
                    if (h != null) {
                        h.setVisibility(0);
                    }
                    final TextView g2 = ioe.g;
                    if (g2 != null) {
                        g2.setVisibility(8);
                    }
                    final FrameLayout d2 = this.d;
                    d2.getClass();
                    d2.setVisibility(0);
                }
            }
            else {
                final FrameLayout d3 = this.d;
                d3.getClass();
                d3.setVisibility(0);
                final fjz e2 = this.e;
                e2.getClass();
                final wyw f2 = this.f;
                f2.getClass();
                e2.a(f2);
            }
            final fkb b = this.b;
            if (b != null) {
                b.f(g);
            }
            this.g = g;
        }
    }
    
    public final void h(final pvh pvh) {
        final fka c = this.c;
        c.getClass();
        c.b = pvh;
        final fjz e = this.e;
        if (e != null) {
            ((ioe)e).k = pvh;
        }
    }
}
