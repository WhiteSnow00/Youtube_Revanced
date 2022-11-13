import android.graphics.Path;
import java.util.List;
import android.graphics.PathMeasure;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvy extends cvw
{
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private cvx h;
    
    public cvy(final List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }
    
    public final Object f(final czs czs, final float n) {
        final cvx h = (cvx)czs;
        final Path a = h.a;
        PointF e;
        if (a == null) {
            e = (PointF)czs.b;
        }
        else {
            final czt d = this.d;
            if (d != null) {
                final float g = h.g;
                h.h.floatValue();
                final PointF pointF = (PointF)h.b;
                final PointF pointF2 = (PointF)h.c;
                this.c();
                e = (PointF)d.a();
                if (e != null) {
                    return e;
                }
            }
            if (this.h != h) {
                this.g.setPath(a, false);
                this.h = h;
            }
            final PathMeasure g2 = this.g;
            g2.getPosTan(n * g2.getLength(), this.f, (float[])null);
            final PointF e2 = this.e;
            final float[] f = this.f;
            e2.set(f[0], f[1]);
            e = this.e;
        }
        return e;
    }
}
