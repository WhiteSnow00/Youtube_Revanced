// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.ads;

import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.textfield.TextInputLayout;

public class BaselineAlignableTextInputLayout extends TextInputLayout
{
    public BaselineAlignableTextInputLayout(final Context context) {
        super(context);
    }
    
    public BaselineAlignableTextInputLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public BaselineAlignableTextInputLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public final int getBaseline() {
        final EditText c = super.c;
        if (c == null) {
            return super.getBaseline();
        }
        final ViewParent parent = c.getParent();
        if (parent instanceof FrameLayout) {
            final FrameLayout frameLayout = (FrameLayout)parent;
            if (frameLayout.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                return c.getBaseline() + ((LinearLayout$LayoutParams)frameLayout.getLayoutParams()).topMargin + this.getPaddingTop();
            }
        }
        return super.getBaseline();
    }
}
