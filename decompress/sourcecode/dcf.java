import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcf
{
    public final dnf a;
    public final akq b;
    public final dmk c;
    public final cya d;
    public final eaa e;
    public final eaa f;
    public final bhu g;
    public final bhu h;
    private final dec i;
    private final bhu j;
    
    public dcf() {
        this.f = new eaa((byte[])null, (byte[])null);
        this.a = new dnf();
        final akq a = dpn.a((akq)new aks(20), (dpj)new dhd(2), (dpm)new dpi());
        this.b = a;
        this.c = new dmk(a);
        this.h = new bhu((byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.e = new eaa((byte[])null);
        this.g = new bhu((byte[])null, (byte[])null);
        this.i = new dec();
        this.d = new cya();
        this.j = new bhu((byte[])null, (byte[])null, (byte[])null);
        final List<String> list = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        final ArrayList list2 = new ArrayList(list.size());
        list2.add((Object)"legacy_prepend_all");
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add((Object)iterator.next());
        }
        list2.add((Object)"legacy_append");
        this.e.g(list2);
    }
    
    public final ddz a(final Object o) {
        return this.i.a(o);
    }
    
    public final List b() {
        final List q = this.j.q();
        if (!q.isEmpty()) {
            return q;
        }
        throw new dcb();
    }
    
    public final List c(final Object o) {
        final List g = this.c.g((Class)o.getClass());
        if (g.isEmpty()) {
            throw new dcc(o);
        }
        final int size = g.size();
        Object emptyList = Collections.emptyList();
        int n = 1;
        Object o2;
        int n2;
        for (int i = 0; i < size; ++i, emptyList = o2, n = n2) {
            final dii dii = g.get(i);
            o2 = emptyList;
            n2 = n;
            if (dii.a(o)) {
                if (n != 0) {
                    emptyList = new ArrayList<dii>(size - i);
                }
                ((List<dii>)emptyList).add(dii);
                n2 = 0;
                o2 = emptyList;
            }
        }
        if (!((List)emptyList).isEmpty()) {
            return (List)emptyList;
        }
        throw new dcc(o, g);
    }
    
    public final void d(final Class clazz, final ddb ddb) {
        this.h.t(clazz, ddb);
    }
    
    public final void e(final Class clazz, final ddr ddr) {
        this.g.p(clazz, ddr);
    }
    
    public final void f(final Class clazz, final Class clazz2, final ddq ddq) {
        this.h("legacy_append", clazz, clazz2, ddq);
    }
    
    public final void g(final Class clazz, final Class clazz2, final dij dij) {
        this.c.h(clazz, clazz2, dij);
    }
    
    public final void h(final String s, final Class clazz, final Class clazz2, final ddq ddq) {
        this.e.f(s, ddq, clazz, clazz2);
    }
    
    public final void i(final Class clazz, final Class clazz2, final ddq ddq) {
        this.e.h(ddq, clazz, clazz2);
    }
    
    public final void j(final Class clazz, final Class clazz2, final dij dij) {
        this.c.i(clazz, clazz2, dij);
    }
    
    public final void k(final ddd ddd) {
        this.j.r(ddd);
    }
    
    public final void l(final ddy ddy) {
        this.i.b(ddy);
    }
    
    public final void m(final Class clazz, final Class clazz2, final dlt dlt) {
        this.d.c(clazz, clazz2, dlt);
    }
    
    public final void n(final Class clazz, final Class clazz2, final dij dij) {
        this.c.j(clazz, clazz2, dij);
    }
}
