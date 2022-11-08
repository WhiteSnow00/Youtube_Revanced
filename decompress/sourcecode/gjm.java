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

public final class gjm
{
    public final int a;
    public final WeakHashMap b;
    public final gjj c;
    public toz d;
    private final WeakReference e;
    private final WeakReference f;
    private final WeakReference g;
    
    public gjm(final View view, final gje gje, final gjj c) {
        this.e = new WeakReference((T)view);
        this.f = new WeakReference((T)gje.l());
        this.a = gje.k();
        this.g = new WeakReference((T)gje);
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
            this.d = new toz();
        }
        final View view = (View)this.e.get();
        if (view == null) {
            return Optional.empty();
        }
        final List list = (List)Collection$_EL.stream((Collection)new HashSet(this.b.keySet())).filter((Predicate)new fqe(this.b, 9)).map((Function)new gjk(this, view, 0)).filter((Predicate)fqf.p).collect(Collectors.toCollection((Supplier)fde.g));
        final WeakHashMap b2 = this.b;
        final gjj c = this.c;
        final gje gje = (gje)this.g.get();
        int j;
        if (gje == null) {
            j = -1;
        }
        else {
            j = gje.j();
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
            final gjl gjl = null;
            gjl c2 = null;
            if (present) {
                final gji gji = (gji)c.c.get();
                final float b3 = c.b;
                agot.u(list.isEmpty() ^ true);
                for (final gjl gjl2 : list) {
                    final float d = gjl2.d;
                    if (d < b3) {
                        b2.put(gjl2.a, 0);
                    }
                    else {
                        float n2 = d;
                        if (!b) {
                            n2 = d;
                            if (d(gjl2.a, b2)) {
                                n2 = d + gji.a;
                            }
                        }
                        float n3 = n2;
                        if (gjl2.b == j) {
                            n3 = n2 + gji.b;
                        }
                        float d2;
                        if (c2 == null) {
                            d2 = 0.0f;
                        }
                        else {
                            d2 = c2.d;
                        }
                        final float n4 = n3 - d2;
                        Label_0537: {
                            if (n4 >= 0.0f) {
                                if (n4 <= gji.c) {
                                    final int c3 = gjl2.c;
                                    if (c3 < 0) {
                                        break Label_0537;
                                    }
                                    int c4;
                                    if (c2 == null) {
                                        c4 = 0;
                                    }
                                    else {
                                        c4 = c2.c;
                                    }
                                    if (c3 >= c4) {
                                        break Label_0537;
                                    }
                                }
                                if (c2 != null) {
                                    final View a = gjl2.a;
                                    final View a2 = c2.a;
                                    if (a != a2) {
                                        b2.put(a2, 0);
                                    }
                                }
                                final qeo a3 = gjl.a();
                                a3.d(gjl2.b);
                                a3.e(gjl2.a);
                                a3.g(gjl2.d);
                                a3.f(gjl2.c);
                                a3.g(n3);
                                c2 = a3.c();
                                continue;
                            }
                        }
                        b2.put(gjl2.a, 0);
                    }
                }
                if (c2 != null && !e(c2.a, b2)) {
                    b2.put(c2.a, 1);
                }
                optional = Optional.ofNullable((Object)c2).map((Function)gfu.u);
            }
            else {
                optional = empty;
                if (c.d.isPresent()) {
                    final List list2 = (List)Collection$_EL.stream((Collection)list).sorted(Comparator$_CC.comparingInt((ToIntFunction)gvy.b)).collect(Collectors.toCollection((Supplier)fde.g));
                    final gjg gjg = (gjg)c.d.get();
                    final float b4 = c.b;
                    agot.u(list2.isEmpty() ^ true);
                    final float a4 = gjg.a;
                    boolean b6 = false;
                    Label_0727: {
                        if (a4 >= 0.0f && a4 <= 1.0f) {
                            final float b5 = gjg.b;
                            if (b5 >= 0.0f && b5 <= 1.0f) {
                                b6 = true;
                                break Label_0727;
                            }
                        }
                        b6 = false;
                    }
                    agot.v(b6, (Object)"Invalid selectable region start and end values.");
                    final float n5 = (float)n;
                    final float a5 = gjg.a;
                    final float b7 = gjg.b;
                    final Iterator iterator2 = list2.iterator();
                    gjl gjl3 = gjl;
                    while (iterator2.hasNext()) {
                        final gjl gjl4 = (gjl)iterator2.next();
                        if (gjl4.d < b4) {
                            b2.put(gjl4.a, 0);
                        }
                        else if (gjl4.c > n5 * b7) {
                            b2.put(gjl4.a, 0);
                        }
                        else if (!d(gjl4.a, b2) && gjl4.c < a5 * n5) {
                            b2.put(gjl4.a, 0);
                        }
                        else {
                            if (d(gjl4.a, b2)) {
                                if (gjl3 != null) {
                                    if (gjl3.d == 1.0f) {
                                        b2.put(gjl4.a, 0);
                                        continue;
                                    }
                                    b2.put(gjl3.a, 0);
                                    agot.u(d(gjl4.a, b2));
                                }
                            }
                            else if (gjl3 != null) {
                                final float d3 = gjl4.d;
                                if (d3 < b4 || gjl3.d >= d3) {
                                    b2.put(gjl4.a, 0);
                                    continue;
                                }
                                b2.put(gjl3.a, 0);
                                b2.put(gjl4.a, 1);
                            }
                            else {
                                if (gjl4.d < b4) {
                                    b2.put(gjl4.a, 0);
                                    continue;
                                }
                                b2.put(gjl4.a, 1);
                            }
                            gjl3 = gjl4;
                        }
                    }
                    optional = Optional.ofNullable((Object)gjl3).map((Function)gnq.b);
                }
            }
        }
        else {
            optional = Optional.empty();
        }
        return optional;
    }
    
    public final void c(final View view) {
        szc.f();
        if (this.b.containsKey(view) && e(view, this.b)) {
            final String a = this.c.a;
            view.toString();
            this.b.put(view, 0);
        }
    }
}
