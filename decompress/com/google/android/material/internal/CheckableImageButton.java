// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.os.Parcelable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import android.support.v7.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable
{
    private static final int[] d;
    public boolean a;
    public boolean b;
    public boolean c;
    
    static {
        d = new int[] { 16842912 };
    }
    
    public CheckableImageButton(final Context context) {
        this(context, null);
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969559);
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = true;
        this.c = true;
        anb.N((View)this, (akw)new advk(this));
    }
    
    public final void a(final boolean b) {
        if (this.b != b) {
            this.b = b;
            this.sendAccessibilityEvent(0);
        }
    }
    
    public final boolean isChecked() {
        return this.a;
    }
    
    public final int[] onCreateDrawableState(final int n) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(n + 1), CheckableImageButton.d);
        }
        return super.onCreateDrawableState(n);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof CheckableImageButton$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final CheckableImageButton$SavedState checkableImageButton$SavedState = (CheckableImageButton$SavedState)parcelable;
        super.onRestoreInstanceState(checkableImageButton$SavedState.d);
        this.setChecked(checkableImageButton$SavedState.a);
    }
    
    protected final Parcelable onSaveInstanceState() {
        final CheckableImageButton$SavedState checkableImageButton$SavedState = new CheckableImageButton$SavedState(super.onSaveInstanceState());
        checkableImageButton$SavedState.a = this.a;
        return (Parcelable)checkableImageButton$SavedState;
    }
    
    public final void setChecked(final boolean a) {
        if (this.b && this.a != a) {
            this.a = a;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(2048);
        }
    }
    
    public final void setPressed(final boolean pressed) {
        if (this.c) {
            super.setPressed(pressed);
        }
    }
    
    public final void toggle() {
        this.setChecked(this.a ^ true);
    }
}
