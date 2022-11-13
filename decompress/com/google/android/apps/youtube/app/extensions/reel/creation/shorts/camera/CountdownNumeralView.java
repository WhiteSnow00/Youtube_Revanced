// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.widget.ViewSwitcher$ViewFactory;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextSwitcher;

public class CountdownNumeralView extends TextSwitcher
{
    public int a;
    public boolean b;
    
    public CountdownNumeralView(final Context context, final AttributeSet set) {
        super(context, set);
        final acan d = acan.d(0);
        this.setInAnimation(this.getContext(), 2130772020);
        this.setFactory((ViewSwitcher$ViewFactory)new gvz(context, d));
        this.b = false;
    }
    
    public final void a() {
        this.setText((CharSequence)"");
        this.setVisibility(4);
        this.b = false;
    }
}
