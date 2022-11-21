import android.graphics.PointF;
import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cic extends Property
{
    public cic(final Class clazz) {
        super(clazz, "topLeft");
    }
    
    public final /* bridge */ Object get(final Object o) {
        final View view = (View)o;
        return null;
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        final PointF pointF = (PointF)o2;
        cjh.b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}
