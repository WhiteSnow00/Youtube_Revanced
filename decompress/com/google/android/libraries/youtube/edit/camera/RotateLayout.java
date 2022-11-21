// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class RotateLayout extends ViewGroup
{
    private View a;
    
    public RotateLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.setBackgroundResource(17170445);
    }
    
    protected final void onFinishInflate() {
        (this.a = this.getChildAt(0)).setPivotX(0.0f);
        this.a.setPivotY(0.0f);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.a.layout(0, 0, n3 - n, n4 - n2);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.measureChild(this.a, n, n2);
        this.setMeasuredDimension(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        this.a.setTranslationX(0.0f);
        this.a.setTranslationY(0.0f);
        this.a.setRotation(0.0f);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
