import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyx implements czd
{
    public static final cyx a;
    private static final eab b;
    
    static {
        a = new cyx();
        b = eab.y("c", "v", "i", "o");
    }
    
    private cyx() {
    }
    
    @Override
    public final /* bridge */ Object a(final czg czg, final float n) {
        final int q = czg.q();
        int i = 1;
        if (q == 1) {
            czg.h();
        }
        czg.i();
        List d = null;
        List<PointF> d2 = null;
        List<PointF> d3 = null;
        boolean p2 = false;
        while (czg.o()) {
            final int r = czg.r(cyx.b);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        if (r != 3) {
                            czg.m();
                            czg.n();
                        }
                        else {
                            d3 = cyo.d(czg, n);
                        }
                    }
                    else {
                        d2 = cyo.d(czg, n);
                    }
                }
                else {
                    d = cyo.d(czg, n);
                }
            }
            else {
                p2 = czg.p();
            }
        }
        czg.k();
        if (czg.q() == 2) {
            czg.j();
        }
        if (d != null && d2 != null && d3 != null) {
            cxi cxi;
            if (d.isEmpty()) {
                cxi = new cxi(new PointF(), false, Collections.emptyList());
            }
            else {
                final int size = d.size();
                final PointF pointF = (PointF)d.get(0);
                final ArrayList list = new ArrayList(size);
                while (i < size) {
                    final PointF pointF2 = (PointF)d.get(i);
                    final int n2 = i - 1;
                    list.add((Object)new ajb(czm.f((PointF)d.get(n2), d3.get(n2)), czm.f(pointF2, d2.get(i)), pointF2));
                    ++i;
                }
                if (p2) {
                    final PointF pointF3 = (PointF)d.get(0);
                    final int n3 = size - 1;
                    list.add((Object)new ajb(czm.f((PointF)d.get(n3), d3.get(n3)), czm.f(pointF3, d2.get(0)), pointF3));
                }
                cxi = new cxi(pointF, p2, list);
            }
            return cxi;
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
