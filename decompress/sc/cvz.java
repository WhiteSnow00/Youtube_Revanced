import java.util.List;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvz extends cvw
{
    private final PointF e;
    
    public cvz(final List list) {
        super(list);
        this.e = new PointF();
    }
    
    public final Object f(final czs czs, final float n) {
        return this.k(czs, n, n);
    }
    
    protected final /* bridge */ Object j(final czs czs, final float n, final float n2) {
        return this.k(czs, n, n2);
    }
    
    protected final PointF k(final czs czs, final float n, final float n2) {
        final Object b = czs.b;
        if (b != null) {
            final Object c = czs.c;
            if (c != null) {
                final PointF pointF = (PointF)b;
                final PointF pointF2 = (PointF)c;
                final czt d = this.d;
                if (d != null) {
                    final float g = czs.g;
                    czs.h.floatValue();
                    this.c();
                    final PointF pointF3 = (PointF)d.a();
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                this.e.set(pointF.x + n * (pointF2.x - pointF.x), pointF.y + n2 * (pointF2.y - pointF.y));
                return this.e;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
