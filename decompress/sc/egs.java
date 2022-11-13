import android.view.View;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egs extends egj
{
    public static final egs a;
    
    static {
        a = new egs();
    }
    
    private egs() {
    }
    
    public static void a(final ajb ajb) {
        final egr egr = (egr)ajb.a;
        egd.a();
        final ArrayList list = new ArrayList();
        for (final Map.Entry<K, egq> entry : egr.a.entrySet()) {
            final egq egq = entry.getValue();
            if (egq.a) {
                egq.a = false;
            }
            else {
                list.add(entry.getKey());
            }
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            final String s = (String)list.get(i);
            final egq egq2 = egr.a.get(s);
            if (egq2 != null) {
                final dun e = egq2.e;
                final dun f = egq2.f;
                final dun d = egq2.d;
                if (e != null) {
                    epf.O(e, (Object)egr.f);
                }
                if (egq2.b()) {
                    egq2.a(false);
                    if (f != null) {
                        epf.P(f);
                    }
                }
                if (d != null) {
                    epf.Q(d, 0, 0, 0, 0, 0.0f, 0.0f);
                }
                egq2.b = false;
            }
            egr.a.remove(s);
        }
        final epf a = egd.a;
        egr.b.setEmpty();
    }
    
    public static void c(final ajb ajb, final Rect rect, final boolean b) {
        final egr egr = (egr)ajb.a;
        try {
            egd.a();
            final Rect b2 = ((egr)ajb.a).b;
            egr egr3;
            if (rect != null && (b || !b2.equals((Object)rect))) {
                final boolean b3 = rect.isEmpty() ^ true;
                final egr egr2 = (egr)ajb.a;
                final int size = egr2.c.size();
                final Rect rect2 = new Rect();
                for (int i = 0; i < size; ++i) {
                    final egt egt = egr2.c.get(i);
                    final String b4 = egt.b;
                    egd.a();
                    final Rect c = egt.c;
                    boolean setIntersect;
                    if (egp.a) {
                        setIntersect = b3;
                    }
                    else {
                        setIntersect = rect2.setIntersect(c, rect);
                    }
                    boolean b5;
                    if (egp.a) {
                        b5 = b3;
                    }
                    else {
                        b5 = (setIntersect && rect2.equals((Object)c));
                    }
                    final String a = egt.a;
                    egq egq = egr2.a.get(a);
                    if (egq != null) {
                        egq.b = b5;
                    }
                    final dun h = egt.h;
                    final dun k = egt.k;
                    final dun l = egt.l;
                    final dun m = egt.m;
                    final dun j = egt.j;
                    final dun n = egt.n;
                    boolean b6;
                    if (setIntersect) {
                        final float f = egt.f;
                        final float g = egt.g;
                        b6 = true;
                    }
                    else {
                        b6 = false;
                    }
                    if (egq != null) {
                        egq.f = l;
                        egq.e = j;
                        if (!b6) {
                            final dun e = egq.e;
                            if (e != null) {
                                epf.O(e, (Object)egr2.f);
                            }
                            if (n != null) {
                                epf.Q(n, 0, 0, 0, 0, 0.0f, 0.0f);
                            }
                            if (egq.b()) {
                                egq.a(false);
                                final dun f2 = egq.f;
                                if (f2 != null) {
                                    epf.P(f2);
                                }
                            }
                            egr2.a.remove(a);
                            egq = null;
                        }
                        else {
                            egq.a = b;
                        }
                    }
                    if (b6) {
                        egq egq2;
                        if ((egq2 = egq) == null) {
                            final String a2 = egt.a;
                            final egq egq3 = new egq(j, l, n);
                            egq3.a = b;
                            egq3.b = b5;
                            egr2.a.put(a, egq3);
                            egq2 = egq3;
                            if (h != null) {
                                Object l2;
                                if (egt.d) {
                                    l2 = ((wvl)ajb.c).l(egt.e);
                                }
                                else {
                                    l2 = null;
                                }
                                final efx e2 = ajb.e();
                                egd.a();
                                if (epf.e == null) {
                                    epf.e = new dxq();
                                }
                                final dxq e3 = epf.e;
                                e3.a = l2;
                                e3.b = (View)e2;
                                View c2;
                                if (l2 instanceof View) {
                                    c2 = (View)l2;
                                }
                                else {
                                    c2 = null;
                                }
                                e3.c = c2;
                                h.toString();
                                h.d(new Object[] { epf.e });
                                final dxq e4 = epf.e;
                                e4.a = null;
                                e4.c = null;
                                e4.b = null;
                                final epf a3 = egd.a;
                                egq2 = egq3;
                            }
                        }
                        Label_0843: {
                            if (k != null || l != null) {
                                final efx f3 = f(ajb);
                                Label_0681: {
                                    if (f3 != null) {
                                        final View view = (View)f3.getParent();
                                        if (view != null) {
                                            final int n2 = view.getWidth() * view.getHeight() / 2;
                                            final int e5 = e(c);
                                            final int e6 = e(rect2);
                                            if (e5 >= n2) {
                                                if (e6 < n2) {
                                                    break Label_0681;
                                                }
                                            }
                                            else if (!c.equals((Object)rect2)) {
                                                break Label_0681;
                                            }
                                            if (egq2.b()) {
                                                break Label_0843;
                                            }
                                            egq2.a(true);
                                            if (k != null) {
                                                if (epf.g == null) {
                                                    epf.g = new duq();
                                                }
                                                k.toString();
                                                k.d(new Object[] { epf.g });
                                            }
                                            break Label_0843;
                                        }
                                    }
                                }
                                if (egq2.b()) {
                                    egq2.a(false);
                                    if (l != null) {
                                        epf.P(l);
                                    }
                                }
                            }
                        }
                        if (m != null && !egq2.c()) {
                            if (c.top == rect2.top) {
                                egq2.c |= 0x4;
                            }
                            if (c.bottom == rect2.bottom) {
                                egq2.c |= 0x10;
                            }
                            if (c.left == rect2.left) {
                                egq2.c |= 0x2;
                            }
                            if (c.right == rect2.right) {
                                egq2.c |= 0x8;
                            }
                            if (egq2.c()) {
                                if (epf.h == null) {
                                    epf.h = new dur();
                                }
                                m.toString();
                                m.d(new Object[] { epf.h });
                            }
                        }
                        if (n != null) {
                            final int n3 = rect2.right - rect2.left;
                            final int n4 = rect2.bottom - rect2.top;
                            epf.Q(n, rect2.top, rect2.left, n3, n4, n3 * 100.0f / c.width(), n4 * 100.0f / c.height());
                        }
                    }
                    final epf a4 = egd.a;
                }
                final Iterator iterator = egr2.d.iterator();
                while (iterator.hasNext()) {
                    epf.X(((wvl)ajb.c).l((long)iterator.next()));
                }
                egr3 = egr;
                if (b) {
                    a(ajb);
                    egr3 = egr;
                }
            }
            else {
                b2.toString();
                egr3 = egr;
            }
            final epf a5 = egd.a;
            if (rect != null) {
                egr3.b.set(rect);
            }
        }
        finally {
            final epf a6 = egd.a;
            while (true) {}
        }
    }
    
    public static boolean d(final ajb ajb) {
        final efx f = f(ajb);
        return f != null && f.hasTransientState();
    }
    
    private static int e(final Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }
    
    private static efx f(final ajb ajb) {
        final efx f = ((egr)ajb.a).f;
        if (f == null) {
            return ajb.e();
        }
        return f;
    }
    
    public final /* bridge */ Object b() {
        return new egr();
    }
}
