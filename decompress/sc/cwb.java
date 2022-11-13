import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwb extends cvr
{
    private final cxi e;
    private final Path f;
    
    public cwb(final List list) {
        super(list);
        this.e = new cxi();
        this.f = new Path();
    }
    
    public final /* bridge */ Object f(final czs czs, final float n) {
        final cxi cxi = (cxi)czs.b;
        final cxi cxi2 = (cxi)czs.c;
        final cxi e = this.e;
        if (e.b == null) {
            e.b = new PointF();
        }
        final boolean c = cxi.c;
        boolean c2 = true;
        if (!c) {
            c2 = (cxi2.c && c2);
        }
        e.c = c2;
        if (cxi.a.size() != cxi2.a.size()) {
            final int size = cxi.a.size();
            final int size2 = cxi2.a.size();
            final StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(size);
            sb.append("\tShape 2: ");
            sb.append(size2);
            czk.a(sb.toString());
        }
        final int min = Math.min(cxi.a.size(), cxi2.a.size());
        if (e.a.size() < min) {
            for (int i = e.a.size(); i < min; ++i) {
                e.a.add(new ajb());
            }
        }
        else if (e.a.size() > min) {
            int size3 = e.a.size();
            while (--size3 >= min) {
                final List a = e.a;
                a.remove(a.size() - 1);
            }
        }
        final PointF b = cxi.b;
        final PointF b2 = cxi2.b;
        final float c3 = czm.c(b.x, b2.x, n);
        final float c4 = czm.c(b.y, b2.y, n);
        if (e.b == null) {
            e.b = new PointF();
        }
        e.b.set(c3, c4);
        int size4 = e.a.size();
        while (--size4 >= 0) {
            final ajb ajb = cxi.a.get(size4);
            final ajb ajb2 = cxi2.a.get(size4);
            final Object b3 = ajb.b;
            final Object c5 = ajb.c;
            final Object a2 = ajb.a;
            final Object b4 = ajb2.b;
            final Object c6 = ajb2.c;
            final Object a3 = ajb2.a;
            final ajb ajb3 = e.a.get(size4);
            final PointF pointF = (PointF)b3;
            final float x = pointF.x;
            final PointF pointF2 = (PointF)b4;
            ((PointF)ajb3.b).set(czm.c(x, pointF2.x, n), czm.c(pointF.y, pointF2.y, n));
            final ajb ajb4 = e.a.get(size4);
            final PointF pointF3 = (PointF)c5;
            final float x2 = pointF3.x;
            final PointF pointF4 = (PointF)c6;
            ((PointF)ajb4.c).set(czm.c(x2, pointF4.x, n), czm.c(pointF3.y, pointF4.y, n));
            final ajb ajb5 = e.a.get(size4);
            final PointF pointF5 = (PointF)a2;
            final float x3 = pointF5.x;
            final PointF pointF6 = (PointF)a3;
            ((PointF)ajb5.a).set(czm.c(x3, pointF6.x, n), czm.c(pointF5.y, pointF6.y, n));
        }
        czm.g(this.e, this.f);
        return this.f;
    }
}
