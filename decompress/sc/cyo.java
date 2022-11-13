import java.util.ArrayList;
import java.util.List;
import android.graphics.PointF;
import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyo
{
    private static final eab a;
    
    static {
        a = eab.y("x", "y");
    }
    
    static float a(final czg czg) {
        final int q = czg.q();
        final int n = q - 1;
        if (n == 0) {
            czg.h();
            final float n2 = (float)czg.a();
            while (czg.o()) {
                czg.n();
            }
            czg.j();
            return n2;
        }
        if (n == 6) {
            return (float)czg.a();
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(cix.d(q)));
    }
    
    static int b(final czg czg) {
        czg.h();
        final double a = czg.a();
        final double a2 = czg.a();
        final double a3 = czg.a();
        while (czg.o()) {
            czg.n();
        }
        final int n = (int)(a3 * 255.0);
        final int n2 = (int)(a2 * 255.0);
        final int n3 = (int)(a * 255.0);
        czg.j();
        return Color.argb(255, n3, n2, n);
    }
    
    static PointF c(final czg czg, final float n) {
        final int n2 = czg.q() - 1;
        if (n2 == 0) {
            czg.h();
            final float n3 = (float)czg.a();
            final float n4 = (float)czg.a();
            while (czg.q() != 2) {
                czg.n();
            }
            czg.j();
            return new PointF(n3 * n, n4 * n);
        }
        if (n2 == 2) {
            czg.i();
            float a = 0.0f;
            float a2 = 0.0f;
            while (czg.o()) {
                final int r = czg.r(cyo.a);
                if (r != 0) {
                    if (r != 1) {
                        czg.m();
                        czg.n();
                    }
                    else {
                        a2 = a(czg);
                    }
                }
                else {
                    a = a(czg);
                }
            }
            czg.k();
            return new PointF(a * n, a2 * n);
        }
        if (n2 == 6) {
            final float n5 = (float)czg.a();
            final float n6 = (float)czg.a();
            while (czg.o()) {
                czg.n();
            }
            return new PointF(n5 * n, n6 * n);
        }
        throw new IllegalArgumentException("Unknown point starts with ".concat(cix.d(czg.q())));
    }
    
    static List d(final czg czg, final float n) {
        final ArrayList list = new ArrayList();
        czg.h();
        while (czg.q() == 1) {
            czg.h();
            list.add(c(czg, n));
            czg.j();
        }
        czg.j();
        return list;
    }
}
