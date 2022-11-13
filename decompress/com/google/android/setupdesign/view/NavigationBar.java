// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.widget.Button;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.graphics.Color;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class NavigationBar extends LinearLayout implements View$OnClickListener
{
    public NavigationBar(final Context context) {
        super(a(context));
        this.b();
    }
    
    public NavigationBar(final Context context, final AttributeSet set) {
        super(a(context), set);
        this.b();
    }
    
    public NavigationBar(final Context context, final AttributeSet set, final int n) {
        super(a(context), set, n);
        this.b();
    }
    
    private static Context a(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[] { 2130970484, 16842800, 16842801 });
        int resourceId;
        if ((resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            final float[] array = new float[3];
            final float[] array2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), array);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), array2);
            if (array[2] > array2[2]) {
                resourceId = 2132083779;
            }
            else {
                resourceId = 2132083780;
            }
        }
        obtainStyledAttributes.recycle();
        return (Context)new ContextThemeWrapper(context, resourceId);
    }
    
    private final void b() {
        if (this.isInEditMode()) {
            return;
        }
        View.inflate(this.getContext(), 2131625579, (ViewGroup)this);
        final Button button = (Button)this.findViewById(2131431873);
        final Button button2 = (Button)this.findViewById(2131431871);
        final Button button3 = (Button)this.findViewById(2131431872);
    }
    
    public final void onClick(final View view) {
    }
}
