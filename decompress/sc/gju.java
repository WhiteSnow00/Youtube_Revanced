import java.util.Iterator;
import java.util.function.ToIntFunction;
import j$.util.Comparator$_CC;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import j$.util.Optional;
import android.support.v7.widget.RecyclerView;
import java.util.Map;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gju
{
    public final int a;
    public final WeakHashMap b;
    public final gjr c;
    public tre d;
    private final WeakReference e;
    private final WeakReference f;
    private final WeakReference g;
    
    public gju(final View view, final gjm gjm, final gjr c) {
        this.e = new WeakReference((T)view);
        this.f = new WeakReference((T)gjm.l());
        this.a = gjm.k();
        this.g = new WeakReference((T)gjm);
        this.c = c;
        this.b = new WeakHashMap();
    }
    
    private static boolean d(final View view, final Map map) {
        return map.containsKey(view) && map.get(view) == 2;
    }
    
    private static boolean e(final View view, final Map map) {
        return (map.containsKey(view) && map.get(view) == 1) || d(view, map);
    }
    
    public final int a(View aa) {
        final RecyclerView recyclerView = (RecyclerView)this.f.get();
        if (aa == null || recyclerView == null) {
            return -1;
        }
        final nw n = recyclerView.n;
        if (n == null) {
            return -1;
        }
        aa = n.aA(aa);
        if (aa == null) {
            return -1;
        }
        return recyclerView.c(aa);
    }
    
    public final Optional b(final boolean b) {
        if (this.d == null) {
            this.d = new tre();
        }
        final View view = (View)this.e.get();
        if (view == null) {
            return Optional.empty();
        }
        final List list = (List)Collection$_EL.stream((Collection)new HashSet(this.b.keySet())).filter((Predicate)new fqn(this.b, 9)).map((Function)new gjs(this, view, 0)).filter((Predicate)fqo.p).collect(Collectors.toCollection((Supplier)fdi.g));
        final WeakHashMap b2 = this.b;
        final gjr c = this.c;
        final gjm gjm = (gjm)this.g.get();
        int j;
        if (gjm == null) {
            j = -1;
        }
        else {
            j = gjm.j();
        }
        int n;
        if (this.a == 1) {
            n = view.getHeight();
        }
        else {
            n = view.getWidth();
        }
        Optional optional;
        if (!list.isEmpty() && n > 0) {
            final Optional empty = Optional.empty();
            final boolean present = c.c.isPresent();
            final gjt gjt = null;
            gjt c2 = null;
            if (present) {
                final gjq gjq = (gjq)c.c.get();
                final float b3 = c.b;
                adkp.H(list.isEmpty() ^ true);
                for (final gjt gjt2 : list) {
                    final float d = gjt2.d;
                    if (d < b3) {
                        b2.put(gjt2.a, 0);
                    }
                    else {
                        float n2 = d;
                        if (!b) {
                            n2 = d;
                            if (d(gjt2.a, b2)) {
                                n2 = d + gjq.a;
                            }
                        }
                        float n3 = n2;
                        if (gjt2.b == j) {
                            n3 = n2 + gjq.b;
                        }
                        float d2;
                        if (c2 == null) {
                            d2 = 0.0f;
                        }
                        else {
                            d2 = c2.d;
                        }
                        final float n4 = n3 - d2;
                        Label_0546: {
                            if (n4 >= 0.0f) {
                                if (n4 <= gjq.c) {
                                    final int c3 = gjt2.c;
                                    if (c3 < 0) {
                                        break Label_0546;
                                    }
                                    int c4;
                                    if (c2 == null) {
                                        c4 = 0;
                                    }
                                    else {
                                        c4 = c2.c;
                                    }
                                    if (c3 >= c4) {
                                        break Label_0546;
                                    }
                                }
                                if (c2 != null) {
                                    final View a = gjt2.a;
                                    final View a2 = c2.a;
                                    if (a != a2) {
                                        b2.put(a2, 0);
                                    }
                                }
                                final qfz a3 = gjt.a();
                                a3.d(gjt2.b);
                                a3.e(gjt2.a);
                                a3.g(gjt2.d);
                                a3.f(gjt2.c);
                                a3.g(n3);
                                c2 = a3.c();
                                continue;
                            }
                        }
                        b2.put(gjt2.a, 0);
                    }
                }
                if (c2 != null && !e(c2.a, b2)) {
                    b2.put(c2.a, 1);
                }
                optional = Optional.ofNullable((Object)c2).map((Function)ggb.u);
            }
            else {
                optional = empty;
                if (c.d.isPresent()) {
                    final List list2 = (List)Collection$_EL.stream((Collection)list).sorted(Comparator$_CC.comparingInt((ToIntFunction)gwo.b)).collect(Collectors.toCollection((Supplier)fdi.g));
                    final gjo gjo = (gjo)c.d.get();
                    final float b4 = c.b;
                    adkp.H(list2.isEmpty() ^ true);
                    final float a4 = gjo.a;
                    boolean b6 = false;
                    Label_0738: {
                        if (a4 >= 0.0f && a4 <= 1.0f) {
                            final float b5 = gjo.b;
                            if (b5 >= 0.0f && b5 <= 1.0f) {
                                b6 = true;
                                break Label_0738;
                            }
                        }
                        b6 = false;
                    }
                    adkp.I(b6, "Invalid selectable region start and end values.");
                    final float a5 = gjo.a;
                    final float n5 = (float)n;
                    final float b7 = gjo.b;
                    final Iterator iterator2 = list2.iterator();
                    gjt gjt3 = gjt;
                    while (iterator2.hasNext()) {
                        final gjt gjt4 = (gjt)iterator2.next();
                        if (gjt4.d < b4) {
                            b2.put(gjt4.a, 0);
                        }
                        else if (gjt4.c > n5 * b7) {
                            b2.put(gjt4.a, 0);
                        }
                        else if (!d(gjt4.a, b2) && gjt4.c < a5 * n5) {
                            b2.put(gjt4.a, 0);
                        }
                        else {
                            if (d(gjt4.a, b2)) {
                                if (gjt3 != null) {
                                    if (gjt3.d == 1.0f) {
                                        b2.put(gjt4.a, 0);
                                        continue;
                                    }
                                    b2.put(gjt3.a, 0);
                                    adkp.H(d(gjt4.a, b2));
                                }
                            }
                            else if (gjt3 != null) {
                                final float d3 = gjt4.d;
                                if (d3 < b4 || gjt3.d >= d3) {
                                    b2.put(gjt4.a, 0);
                                    continue;
                                }
                                b2.put(gjt3.a, 0);
                                b2.put(gjt4.a, 1);
                            }
                            else {
                                if (gjt4.d < b4) {
                                    b2.put(gjt4.a, 0);
                                    continue;
                                }
                                b2.put(gjt4.a, 1);
                            }
                            gjt3 = gjt4;
                        }
                    }
                    optional = Optional.ofNullable((Object)gjt3).map((Function)gnx.b);
                }
            }
        }
        else {
            optional = Optional.empty();
        }
        return optional;
    }
    
    public final void c(final View view) {
        tbi.f();
        if (this.b.containsKey(view) && e(view, this.b)) {
            final String a = this.c.a;
            view.toString();
            this.b.put(view, 0);
        }
    }
}
