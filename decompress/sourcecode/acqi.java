import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqi extends LinearLayout
{
    public acqi(final Context context) {
        super(context);
        this.setChildrenDrawingOrderEnabled(true);
    }
    
    protected final int getChildDrawingOrder(final int n, final int n2) {
        return n - n2 - 1;
    }
}
