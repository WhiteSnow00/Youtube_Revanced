// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.graphics.drawable.Drawable$ConstantState;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.CheckedTextView;

public class NavigationMenuItemView extends advo implements ja
{
    private static final int[] k;
    public int c;
    public boolean d;
    public boolean e;
    public final CheckedTextView f;
    public FrameLayout g;
    public io h;
    public ColorStateList i;
    public boolean j;
    private Drawable l;
    private final akw m;
    
    static {
        k = new int[] { 16842912 };
    }
    
    public NavigationMenuItemView(final Context context) {
        this(context, null);
    }
    
    public NavigationMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final advq m = new advq(this);
        this.m = m;
        ((mt)this).setOrientation(0);
        LayoutInflater.from(context).inflate(2131624344, (ViewGroup)this, true);
        this.c = context.getResources().getDimensionPixelSize(2131166268);
        final CheckedTextView f = (CheckedTextView)this.findViewById(2131428638);
        (this.f = f).setDuplicateParentStateEnabled(true);
        anb.N((View)f, m);
    }
    
    public final io a() {
        return this.h;
    }
    
    public final void b(Drawable l) {
        if (l != null) {
            Drawable mutate = l;
            if (this.j) {
                final Drawable$ConstantState constantState = l.getConstantState();
                if (constantState != null) {
                    l = constantState.newDrawable();
                }
                mutate = l.mutate();
                aiq.g(mutate, this.i);
            }
            final int c = this.c;
            mutate.setBounds(0, 0, c, c);
            l = mutate;
        }
        else if (this.d) {
            if (this.l == null) {
                l = ahv.f(this.getResources(), 2131232366, this.getContext().getTheme());
                if ((this.l = l) != null) {
                    final int c2 = this.c;
                    l.setBounds(0, 0, c2, c2);
                }
            }
            l = this.l;
        }
        apt.d((TextView)this.f, l, null, null, null);
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f(io h) {
        this.h = h;
        final int a = h.a;
        if (a > 0) {
            this.setId(a);
        }
        int visibility;
        if (!h.isVisible()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
        if (this.getBackground() == null) {
            final TypedValue typedValue = new TypedValue();
            StateListDrawable stateListDrawable;
            if (this.getContext().getTheme().resolveAttribute(2130969044, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(NavigationMenuItemView.k, (Drawable)new ColorDrawable(typedValue.data));
                stateListDrawable.addState(NavigationMenuItemView.EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
            }
            else {
                stateListDrawable = null;
            }
            anb.Q((View)this, (Drawable)stateListDrawable);
        }
        final boolean checkable = h.isCheckable();
        this.refreshDrawableState();
        if (this.e != checkable) {
            this.e = checkable;
            this.m.e((View)this.f, 2048);
        }
        final boolean checked = h.isChecked();
        this.refreshDrawableState();
        this.f.setChecked(checked);
        this.setEnabled(h.isEnabled());
        this.f.setText(h.d);
        this.b(h.getIcon());
        final View actionView = h.getActionView();
        if (actionView != null) {
            if (this.g == null) {
                this.g = (FrameLayout)((ViewStub)this.findViewById(2131428637)).inflate();
            }
            this.g.removeAllViews();
            this.g.addView(actionView);
        }
        this.setContentDescription(h.l);
        py.a((View)this, h.m);
        h = this.h;
        if (h.d == null && h.getIcon() == null && this.h.getActionView() != null) {
            this.f.setVisibility(8);
            final FrameLayout g = this.g;
            if (g != null) {
                final ms layoutParams = (ms)g.getLayoutParams();
                layoutParams.width = -1;
                this.g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        else {
            this.f.setVisibility(0);
            final FrameLayout g2 = this.g;
            if (g2 != null) {
                final ms layoutParams2 = (ms)g2.getLayoutParams();
                layoutParams2.width = -2;
                this.g.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        final io h = this.h;
        if (h != null && h.isCheckable() && h.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, NavigationMenuItemView.k);
        }
        return onCreateDrawableState;
    }
}
