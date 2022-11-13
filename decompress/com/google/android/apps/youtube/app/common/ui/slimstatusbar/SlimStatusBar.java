// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.slimstatusbar;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.FrameLayout;

public class SlimStatusBar extends FrameLayout
{
    public TextView a;
    
    public SlimStatusBar(final Context context) {
        super(context);
    }
    
    public SlimStatusBar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public SlimStatusBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public SlimStatusBar(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public final void a(final int text) {
        final TextView a = this.a;
        if (a != null) {
            a.setText(text);
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131431953);
    }
}
