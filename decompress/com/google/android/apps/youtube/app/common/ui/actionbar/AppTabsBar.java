// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.widget.ImageView;
import android.content.res.ColorStateList;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;

public class AppTabsBar extends DefaultTabsBar
{
    private int c;
    private int d;
    
    public AppTabsBar(final Context context) {
        super(context);
    }
    
    public AppTabsBar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public AppTabsBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void d(final tqb b) {
        if (super.b != b) {
            super.b = b;
            this.invalidate();
        }
        this.e(this.c, this.d);
    }
    
    public final void e(final int c, final int d) {
        final tqb b = this.b;
        b.getClass();
        this.c = c;
        this.d = d;
        this.o(b.a(c, c, c, c, c, d));
    }
    
    protected final void f(final View view, final ColorStateList list) {
        super.f(view, list);
        if (view instanceof ImageView) {
            final tqb b = this.b;
            if (b != null) {
                final ImageView imageView = (ImageView)view;
                imageView.setImageDrawable(b.c(imageView.getDrawable(), list));
            }
        }
    }
}
