// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.app;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView
{
    public final int a;
    public final int b;
    
    public AlertController$RecycleListView(final Context context) {
        this(context, null);
    }
    
    public AlertController$RecycleListView(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gm.t);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
