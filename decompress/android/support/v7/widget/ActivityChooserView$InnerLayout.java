// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout
{
    private static final int[] a;
    
    static {
        a = new int[] { 16842964 };
    }
    
    public ActivityChooserView$InnerLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final cdr v = cdr.v(context, set, ActivityChooserView$InnerLayout.a);
        this.setBackgroundDrawable(v.k(0));
        v.o();
    }
}
