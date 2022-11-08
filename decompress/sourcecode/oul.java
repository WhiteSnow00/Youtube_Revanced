import android.view.ViewConfiguration;
import android.content.Context;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oul
{
    public final PointF a;
    public final float b;
    public final float c;
    public final float d;
    public Boolean e;
    
    public oul(final Context context, final float c, final float d) {
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = new PointF();
        this.e = null;
        this.b = (float)scaledTouchSlop;
        this.c = c;
        this.d = d;
    }
}
