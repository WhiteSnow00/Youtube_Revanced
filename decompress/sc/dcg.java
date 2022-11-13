import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcg
{
    public final dng a;
    public final akr b;
    public final dml c;
    public final cyb d;
    public final eab e;
    public final eab f;
    public final bhv g;
    public final bhv h;
    private final ded i;
    private final bhv j;
    
    public dcg() {
        this.f = new eab((byte[])null, (byte[])null);
        this.a = new dng();
        final akr a = dpo.a((akr)new akt(20), (dpk)new dhe(2), (dpn)new dpj());
        this.b = a;
        this.c = new dml(a);
        this.h = new bhv(null, null, (byte[])null, null);
        this.e = new eab((byte[])null);
        this.g = new bhv(null, (byte[])null);
        this.i = new ded();
        this.d = new cyb();
        this.j = new bhv((byte[])null, null, null);
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
    
    public final dea a(final Object o) {
        return this.i.a(o);
    }
    
    public final List b() {
        final List q = this.j.q();
        if (!q.isEmpty()) {
            return q;
        }
        throw new dcc();
    }
    
    public final List c(final Object o) {
        final List g = this.c.g((Class)o.getClass());
        if (g.isEmpty()) {
            throw new dcd(o);
        }
        final int size = g.size();
        Object emptyList = Collections.emptyList();
        int n = 1;
        Object o2;
        int n2;
        for (int i = 0; i < size; ++i, emptyList = o2, n = n2) {
            final dij dij = g.get(i);
            o2 = emptyList;
            n2 = n;
            if (dij.a(o)) {
                if (n != 0) {
                    emptyList = new ArrayList<dij>(size - i);
                }
                ((List<dij>)emptyList).add(dij);
                n2 = 0;
                o2 = emptyList;
            }
        }
        if (!((List)emptyList).isEmpty()) {
            return (List)emptyList;
        }
        throw new dcd(o, g);
    }
    
    public final void d(final Class clazz, final ddc ddc) {
        this.h.t(clazz, ddc);
    }
    
    public final void e(final Class clazz, final dds dds) {
        this.g.p(clazz, dds);
    }
    
    public final void f(final Class clazz, final Class clazz2, final ddr ddr) {
        this.h("legacy_append", clazz, clazz2, ddr);
    }
    
    public final void g(final Class clazz, final Class clazz2, final dik dik) {
        this.c.h(clazz, clazz2, dik);
    }
    
    public final void h(final String s, final Class clazz, final Class clazz2, final ddr ddr) {
        this.e.f(s, ddr, clazz, clazz2);
    }
    
    public final void i(final Class clazz, final Class clazz2, final ddr ddr) {
        this.e.h(ddr, clazz, clazz2);
    }
    
    public final void j(final Class clazz, final Class clazz2, final dik dik) {
        this.c.i(clazz, clazz2, dik);
    }
    
    public final void k(final dde dde) {
        this.j.r(dde);
    }
    
    public final void l(final ddz ddz) {
        this.i.b(ddz);
    }
    
    public final void m(final Class clazz, final Class clazz2, final dlu dlu) {
        this.d.c(clazz, clazz2, dlu);
    }
    
    public final void n(final Class clazz, final Class clazz2, final dik dik) {
        this.c.j(clazz, clazz2, dik);
    }
}
