// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout implements Checkable
{
    private boolean a;
    
    public CheckableLinearLayout(final Context context) {
        super(context);
        this.a = false;
        this.setFocusable(true);
    }
    
    public CheckableLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = false;
        this.setFocusable(true);
    }
    
    public CheckableLinearLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = false;
        this.setFocusable(true);
    }
    
    public CheckableLinearLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = false;
        this.setFocusable(true);
    }
    
    public final boolean isChecked() {
        return this.a;
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(n + 1), new int[] { 16842912 });
        }
        return super.onCreateDrawableState(n);
    }
    
    public final void setChecked(final boolean a) {
        this.a = a;
        this.refreshDrawableState();
    }
    
    public final void toggle() {
        this.setChecked(this.a ^ true);
    }
}
