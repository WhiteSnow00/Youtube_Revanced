import android.graphics.PointF;
import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cid extends Property
{
    public cid(final Class clazz) {
        super(clazz, "position");
    }
    
    public final /* bridge */ Object get(final Object o) {
        final View view = (View)o;
        return null;
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        final PointF pointF = (PointF)o2;
        final int round = Math.round(pointF.x);
        final int round2 = Math.round(pointF.y);
        cjh.b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
