import android.graphics.PointF;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cia extends Property
{
    public cia(final Class clazz) {
        super(clazz, "bottomRight");
    }
    
    public final /* bridge */ Object get(final Object o) {
        final cig cig = (cig)o;
        return null;
    }
    
    public final void set(final Object o, final Object o2) {
        final cig cig = (cig)o;
        final PointF pointF = (PointF)o2;
        cig.c = Math.round(pointF.x);
        cig.d = Math.round(pointF.y);
        final int f = cig.f + 1;
        cig.f = f;
        if (cig.e == f) {
            cig.a();
        }
    }
}
