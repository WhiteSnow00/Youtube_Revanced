// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.items;

import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.CompoundButton$OnCheckedChangeListener;

public class ExpandableSwitchItem extends SwitchItem implements CompoundButton$OnCheckedChangeListener, View$OnClickListener
{
    public boolean a;
    
    public ExpandableSwitchItem() {
        this.a = false;
        new aeft(this);
    }
    
    public ExpandableSwitchItem(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = false;
        new aeft(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aefr.e);
        obtainStyledAttributes.getText(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.getInt(7, 48);
        obtainStyledAttributes.recycle();
    }
    
    protected final int b() {
        return 2131625567;
    }
    
    public final void c(final boolean a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        ((AbstractItemHierarchy)this).a(0);
    }
    
    public final void onClick(final View view) {
        this.c(this.a ^ true);
    }
}
