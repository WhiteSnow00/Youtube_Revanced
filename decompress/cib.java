import android.graphics.PointF;
import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cib extends Property
{
    public cib(final Class clazz) {
        super(clazz, "bottomRight");
    }
    
    public final /* bridge */ Object get(final Object o) {
        final View view = (View)o;
        return null;
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        final PointF pointF = (PointF)o2;
        cjh.b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
