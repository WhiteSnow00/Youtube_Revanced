import android.graphics.PointF;
import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyi implements czd
{
    public static final cyi a;
    public static final cyi b;
    public static final cyi c;
    public static final cyi d;
    public static final cyi e;
    public static final cyi f;
    private final int g;
    
    static {
        f = new cyi(5);
        e = new cyi(4);
        d = new cyi(3);
        c = new cyi(2);
        b = new cyi(1);
        a = new cyi(0);
    }
    
    private cyi(final int g) {
        this.g = g;
    }
    
    @Override
    public final Object a(final czg czg, final float n) {
        final int g = this.g;
        if (g == 0) {
            return cyo.a(czg) * n;
        }
        boolean b = false;
        final int n2 = 0;
        if (g == 1) {
            if (czg.q() == 1) {
                b = true;
            }
            if (b) {
                czg.h();
            }
            final double a = czg.a();
            final double a2 = czg.a();
            final double a3 = czg.a();
            double a4;
            if (czg.q() == 7) {
                a4 = czg.a();
            }
            else {
                a4 = 1.0;
            }
            if (b) {
                czg.j();
            }
            double n3 = a4;
            double n4 = a;
            double n5 = a2;
            double n6 = a3;
            if (a <= 1.0) {
                n3 = a4;
                n4 = a;
                n5 = a2;
                n6 = a3;
                if (a2 <= 1.0) {
                    n3 = a4;
                    n4 = a;
                    n5 = a2;
                    n6 = a3;
                    if (a3 <= 1.0) {
                        final double n7 = a * 255.0;
                        final double n8 = a2 * 255.0;
                        final double n9 = a3 * 255.0;
                        n3 = a4;
                        n4 = n7;
                        n5 = n8;
                        n6 = n9;
                        if (a4 <= 1.0) {
                            n3 = a4 * 255.0;
                            n6 = n9;
                            n5 = n8;
                            n4 = n7;
                        }
                    }
                }
            }
            return Color.argb((int)n3, (int)n4, (int)n5, (int)n6);
        }
        if (g == 2) {
            return Math.round(cyo.a(czg) * n);
        }
        if (g == 3) {
            return cyo.c(czg, n);
        }
        if (g != 4) {
            int n10 = n2;
            if (czg.q() == 1) {
                n10 = 1;
            }
            if (n10 != 0) {
                czg.h();
            }
            final float n11 = (float)czg.a();
            final float n12 = (float)czg.a();
            while (czg.o()) {
                czg.n();
            }
            if (n10 != 0) {
                czg.j();
            }
            return new czu(n11 / 100.0f * n, n12 / 100.0f * n);
        }
        final int q = czg.q();
        PointF pointF;
        if (q == 1) {
            pointF = cyo.c(czg, n);
        }
        else if (q == 3) {
            pointF = cyo.c(czg, n);
        }
        else {
            if (q != 7) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(cix.d(q)));
            }
            final PointF pointF2 = new PointF((float)czg.a() * n, (float)czg.a() * n);
            while (czg.o()) {
                czg.n();
            }
            pointF = pointF2;
        }
        return pointF;
    }
}
