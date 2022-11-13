import android.graphics.PointF;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvx extends czs
{
    public Path a;
    private final czs o;
    
    public cvx(final ctv ctv, final czs o) {
        super(ctv, (Object)o.b, (Object)o.c, o.d, o.e, o.f, o.g, o.h);
        this.o = o;
        this.a();
    }
    
    public final void a() {
        final Object c = this.c;
        int n2;
        final int n = n2 = 0;
        if (c != null) {
            final Object b = this.b;
            n2 = n;
            if (b != null) {
                n2 = n;
                if (((PointF)b).equals(((PointF)c).x, ((PointF)this.c).y)) {
                    n2 = 1;
                }
            }
        }
        final Object b2 = this.b;
        if (b2 != null) {
            final Object c2 = this.c;
            if (c2 != null && n2 == 0) {
                final PointF pointF = (PointF)b2;
                final PointF pointF2 = (PointF)c2;
                final czs o = this.o;
                this.a = czr.f(pointF, pointF2, o.m, o.n);
            }
        }
    }
}
