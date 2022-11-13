// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.content.res.TypedArray;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class AccessibilityLayerLayout extends FrameLayout
{
    public int a;
    public final int b;
    public View c;
    public View d;
    public View e;
    private boolean f;
    private boolean g;
    
    public AccessibilityLayerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = false;
        this.g = false;
        new tpb(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, tqs.a);
        this.a = obtainStyledAttributes.getResourceId(0, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.b = resourceId;
        obtainStyledAttributes.recycle();
        this.c = this.findViewById(this.a);
        this.d = this.findViewById(resourceId);
        anb.N((View)this, (akw)new tpa(this));
        anb.X((View)this, 1);
        this.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new tpc(this, 0));
    }
    
    public final void a() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (this.e(child)) {
                anb.X(child, 0);
            }
            else {
                anb.X(child, 4);
            }
        }
    }
    
    public final void b(final View c) {
        if (c != null && tpe.z((View)this, c)) {
            this.a = c.getId();
            this.c = c;
            this.c(true);
            return;
        }
        this.c(false);
    }
    
    public final void c(final boolean f) {
        this.getContext();
        this.f = f;
    }
    
    public final void d(final boolean g) {
        this.getContext();
        this.g = g;
    }
    
    public final boolean e(final View view) {
        if (view == null) {
            return false;
        }
        int childCount = this.getChildCount();
        View view2;
        while (true) {
            final int n = childCount - 1;
            if (n < 0) {
                view2 = null;
                break;
            }
            final View child = this.getChildAt(n);
            childCount = n;
            if (child.getVisibility() != 0) {
                continue;
            }
            childCount = n;
            if (child == this.e) {
                continue;
            }
            view2 = child;
            if (!this.g) {
                break;
            }
            childCount = n;
            if (child != this.d) {
                view2 = child;
                break;
            }
        }
        final boolean b = this.f && view == this.c;
        final boolean b2 = this.g && view == this.d;
        final View e = this.e;
        return view == view2 || b || b2 || view == e;
    }
}
