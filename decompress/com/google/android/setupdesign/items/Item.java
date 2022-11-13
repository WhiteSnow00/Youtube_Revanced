// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.items;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class Item extends AbstractItem
{
    public Item() {
    }
    
    public Item(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aefr.m);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(4);
        obtainStyledAttributes.getText(5);
        obtainStyledAttributes.getText(6);
        obtainStyledAttributes.getResourceId(2, this.b());
        obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.getInt(7, 16);
        obtainStyledAttributes.recycle();
    }
    
    protected int b() {
        return 2131625565;
    }
}
