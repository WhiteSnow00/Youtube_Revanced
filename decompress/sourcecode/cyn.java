import java.util.ArrayList;
import java.util.List;
import android.graphics.PointF;
import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyn
{
    private static final eaa a;
    
    static {
        a = eaa.y("x", "y");
    }
    
    static float a(final czf czf) {
        final int q = czf.q();
        final int n = q - 1;
        if (n == 0) {
            czf.h();
            final float n2 = (float)czf.a();
            while (czf.o()) {
                czf.n();
            }
            czf.j();
            return n2;
        }
        if (n == 6) {
            return (float)czf.a();
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(ciw.d(q)));
    }
    
    static int b(final czf czf) {
        czf.h();
        final int n = (int)(czf.a() * 255.0);
        final int n2 = (int)(czf.a() * 255.0);
        final int n3 = (int)(czf.a() * 255.0);
        while (czf.o()) {
            czf.n();
        }
        czf.j();
        return Color.argb(255, n, n2, n3);
    }
    
    static PointF c(final czf czf, final float n) {
        final int n2 = czf.q() - 1;
        if (n2 == 0) {
            czf.h();
            final float n3 = (float)czf.a();
            final float n4 = (float)czf.a();
            while (czf.q() != 2) {
                czf.n();
            }
            czf.j();
            return new PointF(n3 * n, n4 * n);
        }
        if (n2 == 2) {
            czf.i();
            float a = 0.0f;
            float a2 = 0.0f;
            while (czf.o()) {
                final int r = czf.r(cyn.a);
                if (r != 0) {
                    if (r != 1) {
                        czf.m();
                        czf.n();
                    }
                    else {
                        a2 = a(czf);
                    }
                }
                else {
                    a = a(czf);
                }
            }
            czf.k();
            return new PointF(a * n, a2 * n);
        }
        if (n2 == 6) {
            final float n5 = (float)czf.a();
            final float n6 = (float)czf.a();
            while (czf.o()) {
                czf.n();
            }
            return new PointF(n5 * n, n6 * n);
        }
        throw new IllegalArgumentException("Unknown point starts with ".concat(ciw.d(czf.q())));
    }
    
    static List d(final czf czf, final float n) {
        final ArrayList list = new ArrayList();
        czf.h();
        while (czf.q() == 1) {
            czf.h();
            list.add(c(czf, n));
            czf.j();
        }
        czf.j();
        return list;
    }
}
