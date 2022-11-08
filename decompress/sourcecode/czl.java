import java.util.List;
import android.graphics.Path;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czl
{
    private static final PointF a;
    
    static {
        a = new PointF();
    }
    
    public static double a(final double n, final double n2, final double n3) {
        return n + n3 * (n2 - n);
    }
    
    public static float b(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n3, n));
    }
    
    public static float c(final float n, final float n2, final float n3) {
        return n + n3 * (n2 - n);
    }
    
    static int d(final float n, final float n2) {
        final int n3 = (int)n;
        final int n4 = (int)n2;
        int n6;
        final int n5 = n6 = n3 / n4;
        if ((n3 ^ n4) < 0) {
            n6 = n5;
            if (n3 % n4 != 0) {
                n6 = n5 - 1;
            }
        }
        return n3 - n4 * n6;
    }
    
    public static int e(final int n, final int n2, final float n3) {
        return (int)(n + n3 * (n2 - n));
    }
    
    public static PointF f(final PointF pointF, final PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
    
    public static void g(final cxh cxh, final Path path) {
        path.reset();
        final PointF b = cxh.b;
        path.moveTo(b.x, b.y);
        czl.a.set(b.x, b.y);
        for (int i = 0; i < cxh.a.size(); ++i) {
            final aja aja = cxh.a.get(i);
            final Object b2 = aja.b;
            final Object c = aja.c;
            final Object a = aja.a;
            final PointF a2 = czl.a;
            final PointF pointF = (PointF)b2;
            if (pointF.equals((Object)a2) && ((PointF)c).equals(a)) {
                final PointF pointF2 = (PointF)a;
                path.lineTo(pointF2.x, pointF2.y);
            }
            else {
                final float x = pointF.x;
                final float y = pointF.y;
                final PointF pointF3 = (PointF)c;
                final float x2 = pointF3.x;
                final float y2 = pointF3.y;
                final PointF pointF4 = (PointF)a;
                path.cubicTo(x, y, x2, y2, pointF4.x, pointF4.y);
            }
            final PointF pointF5 = (PointF)a;
            a2.set(pointF5.x, pointF5.y);
        }
        if (cxh.c) {
            path.close();
        }
    }
    
    public static void h(final cwi cwi, final int n, final List list, final cwi cwi2, final cvc cvc) {
        if (cwi.d(cvc.g(), n)) {
            list.add(cwi2.b(cvc.g()).c((cwj)cvc));
        }
    }
    
    public static boolean i(final float n, final float n2, final float n3) {
        return n >= n2 && n <= n3;
    }
    
    public static double j(final double n) {
        return Math.max(0.0, Math.min(1.0, n));
    }
    
    public static int k(final int n) {
        return Math.max(0, Math.min(255, n));
    }
}
