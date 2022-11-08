// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.animation.Animator;
import java.util.Collection;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.View;

public class NextGenWatchContainerLayout extends lbd
{
    public View a;
    public View b;
    public View c;
    public kzd d;
    public final lbg e;
    public final lbf f;
    public uyi g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final afdu n;
    private final int o;
    private final List p;
    private boolean q;
    
    public NextGenWatchContainerLayout(final Context context) {
        this(context, null);
    }
    
    public NextGenWatchContainerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NextGenWatchContainerLayout(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public NextGenWatchContainerLayout(final Context context, final AttributeSet set, int resourceId, int resourceId2) {
        super(context, set, resourceId, resourceId2);
        this.p = new ArrayList();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lca.a);
        final boolean b = true;
        resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.h = resourceId;
        this.i = obtainStyledAttributes.getResourceId(0, 0);
        final int resourceId3 = obtainStyledAttributes.getResourceId(5, 0);
        this.j = resourceId3;
        final int resourceId4 = obtainStyledAttributes.getResourceId(4, 0);
        this.m = resourceId4;
        resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        this.k = resourceId2;
        final int resourceId5 = obtainStyledAttributes.getResourceId(3, 0);
        this.l = resourceId5;
        if (this.g.bH()) {
            this.n = afdu.u((Object)resourceId2, (Object)resourceId5, (Object)resourceId4);
        }
        else {
            this.n = afdu.t((Object)resourceId2, (Object)resourceId5);
        }
        obtainStyledAttributes.recycle();
        agot.D(resourceId != 0);
        agot.D(resourceId3 != 0 && b);
        final lbg e = new lbg(this);
        this.e = e;
        final kzd d = this.d;
        d.getClass();
        this.f = new lbf((kzf)d, e);
        this.o = agx.a(context, 2131102310);
    }
    
    private final void e() {
        if (this.c == null) {
            return;
        }
        if (this.q) {
            return;
        }
        this.bringChildToFront(this.a);
        final View b = this.b;
        if (b != null) {
            this.bringChildToFront(b);
        }
        this.bringChildToFront(this.c);
        this.q = true;
    }
    
    private final void f() {
        if (this.b == null) {
            return;
        }
        final Rect a = this.f.a();
        this.b.measure(View$MeasureSpec.makeMeasureSpec(a.width(), 1073741824), View$MeasureSpec.makeMeasureSpec(a.height(), 1073741824));
    }
    
    private static final void g(final View view, final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (view != null) {
            if (b || view.getVisibility() != 8) {
                view.layout(n, n2, n3, n4);
            }
        }
    }
    
    private static final void h(final View view, final boolean b, final int n, final int n2) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        int n3 = n;
        int n4 = n2;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            n3 = n + viewGroup$MarginLayoutParams.leftMargin;
            n4 = n2 + viewGroup$MarginLayoutParams.topMargin;
        }
        g(view, b, n3, n4, n3 + view.getMeasuredWidth(), n4 + view.getMeasuredHeight());
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams;
    }
    
    public final void d() {
        final boolean b = this.f.b();
        final boolean g = this.d.g();
        gej.c();
        final ArrayList list = new ArrayList(this.p);
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (this.n.contains((Object)((View)list.get(i)).getId())) {
                tmy.v((View)list.get(i), ((View)list.get(i)).getVisibility() != 8 && b);
            }
            else {
                tmy.v((View)list.get(i), b);
            }
        }
        tmy.v(this.a, g);
        final View b2 = this.b;
        if (b2 != null) {
            tmy.v(b2, g);
        }
        tmy.v(this.c, g);
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-2, -2);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e();
        this.d();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, int i, int n3) {
        final boolean b2 = this.f.b();
        n3 = 0;
        if (b2) {
            int size;
            for (size = this.p.size(), i = 0; i < size; ++i) {
                h(this.p.get(i), b, n, n2);
            }
        }
        Label_0094: {
            if (!this.d.g()) {
                i = n3;
                if (!this.e.b()) {
                    break Label_0094;
                }
            }
            i = 1;
        }
        if (i != 0) {
            final View a = this.a;
            g(a, b, n, n2, n + a.getMeasuredWidth(), n2 + this.a.getMeasuredHeight());
        }
        if (!this.e.b()) {
            float q;
            if (i != 0) {
                final lch a2 = this.f.a;
                if (a2 != null) {
                    q = ((lbn)a2).c().q();
                }
                else {
                    q = 0.0f;
                }
            }
            else {
                q = 1.0f;
            }
            this.a.setAlpha(q);
            if (i != 0) {
                final lch a3 = this.f.a;
                aexq aexq;
                if (a3 != null) {
                    aexq = ((lbn)a3).c().K();
                }
                else {
                    aexq = aewp.a;
                }
                i = (int)aexq.e((Object)this.o);
            }
            else {
                i = this.o;
            }
            this.a.setBackgroundColor(i);
        }
        if (this.d.g()) {
            h(this.c, b, n, n2);
        }
        if (this.b != null) {
            if (this.d.g()) {
                final Rect a4 = this.f.a();
                if (this.b.getMeasuredWidth() != a4.width() || this.b.getMeasuredHeight() != a4.height()) {
                    this.f();
                }
                g(this.b, b, a4.left, a4.top, a4.left + this.b.getMeasuredWidth(), a4.top + this.b.getMeasuredHeight());
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        View$MeasureSpec.getSize(n);
        View$MeasureSpec.getSize(n2);
        gej.c();
        this.d();
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            this.measureChildWithMargins((View)this.p.get(i), n, 0, n2, 0);
        }
        if (this.d.g()) {
            this.measureChild(this.a, n, n2);
            this.measureChildWithMargins(this.c, n, 0, n2, 0);
            this.f();
        }
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final lbg e = this.e;
        final Animator b = e.b;
        if (b == null) {
            return;
        }
        b.cancel();
        e.a();
    }
    
    public final void onViewAdded(final View c) {
        gej.b();
        super.onViewAdded(c);
        if (c == null) {
            return;
        }
        final int id = c.getId();
        if (this.h == id) {
            this.a = c;
        }
        else if (this.i == id) {
            this.b = c;
        }
        else if (this.j == id) {
            this.c = c;
            this.e();
        }
        else if (!this.p.contains(c)) {
            this.p.add(c);
        }
        this.q = false;
    }
    
    public final void onViewRemoved(final View view) {
        gej.b();
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        final int id = view.getId();
        if (this.h == id) {
            throw new IllegalStateException("Scrim view must not be removed.");
        }
        if (this.i == id) {
            throw new IllegalStateException("Player view must not be removed.");
        }
        if (this.j != id) {
            if (this.p.contains(view)) {
                this.p.remove(view);
            }
            return;
        }
        throw new IllegalStateException("Watch layout must not be removed.");
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
