// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.items;

import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;

public class ButtonItem extends AbstractItem implements View$OnClickListener
{
    public ButtonItem() {
    }
    
    public ButtonItem(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aefr.c);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getText(3);
        obtainStyledAttributes.getResourceId(0, 2132083691);
        obtainStyledAttributes.recycle();
    }
    
    public final void onClick(final View view) {
    }
}
