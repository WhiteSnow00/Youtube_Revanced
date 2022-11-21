import android.graphics.PointF;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class chz extends Property
{
    public chz(final Class clazz) {
        super(clazz, "topLeft");
    }
    
    public final /* bridge */ Object get(final Object o) {
        final cig cig = (cig)o;
        return null;
    }
    
    public final void set(final Object o, final Object o2) {
        final cig cig = (cig)o;
        final PointF pointF = (PointF)o2;
        cig.a = Math.round(pointF.x);
        cig.b = Math.round(pointF.y);
        final int e = cig.e + 1;
        cig.e = e;
        if (e == cig.f) {
            cig.a();
        }
    }
}
