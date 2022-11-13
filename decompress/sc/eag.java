import java.util.ListIterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eag extends dzt
{
    public static final int r = 0;
    @dyi(a = 5)
    @dyj(a = dyk.a)
    public List m;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    public Boolean n;
    public dun o;
    public dun p;
    public dun q;
    
    public eag() {
        super("DataDiffSection");
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dzt)o);
    }
    
    public final boolean f(final dzt dzt) {
        if (this == dzt) {
            return true;
        }
        if (dzt != null && this.getClass() == dzt.getClass()) {
            final eag eag = (eag)dzt;
            final List m = this.m;
            Label_0062: {
                if (m != null) {
                    if (m.equals(eag.m)) {
                        break Label_0062;
                    }
                }
                else if (eag.m == null) {
                    break Label_0062;
                }
                return false;
            }
            final Boolean n = this.n;
            if (n != null) {
                if (n.equals(eag.n)) {
                    return true;
                }
            }
            else if (eag.n == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final boolean j() {
        return true;
    }
    
    protected final void m(final dzu dzu, final dzo dzo, final dzt dzt, final dzt dzt2) {
        final eag eag = (eag)dzt;
        final eag eag2 = (eag)dzt2;
        Object m;
        if (eag == null) {
            m = null;
        }
        else {
            m = eag.m;
        }
        final dub dub = new dub(m, (Object)eag2.m);
        final dub dub2 = new dub((Object)null, (Object)null);
        final dub dub3 = new dub((Object)null, (Object)null);
        Object n;
        if (eag == null) {
            n = null;
        }
        else {
            n = eag.n;
        }
        final Object b = new dub(n, (Object)eag2.n).b;
        if (b == null || !(boolean)b) {
            final List list = (List)dub.a;
            final List list2 = (List)dub.b;
            dun q;
            if (dzu.t() == null) {
                q = null;
            }
            else {
                q = ((eag)dzu.t()).q;
            }
            final cya cya = new cya(q);
            final cya cya2 = new cya(dzo);
            final eah eah = new eah(dzu, (List)dub.a, (List)dub.b);
            final msr q2 = ((dsx)dzu).q();
            dwk e;
            if (q2 == null) {
                e = null;
            }
            else {
                e = bkv.e((dsx)dzu, q2, q2.r((dsx)dzu, 12));
            }
            Label_0408: {
                if (list2 != null) {
                    final Object b2 = dub3.b;
                    boolean b3;
                    if (b2 == null) {
                        b3 = dyp.a;
                    }
                    else {
                        b3 = (boolean)b2;
                    }
                    if (b3) {
                        final ListIterator listIterator = list2.listIterator();
                        while (listIterator.hasNext()) {
                            final int nextIndex = listIterator.nextIndex();
                            final Object next = listIterator.next();
                            final ListIterator listIterator2 = list2.listIterator(nextIndex + 1);
                            while (listIterator2.hasNext()) {
                                if (eah.f(next, listIterator2.next())) {
                                    final String simpleName = next.getClass().getSimpleName();
                                    final int identityHashCode = System.identityHashCode(next);
                                    final StringBuilder sb = new StringBuilder("Detected duplicates in data passed to DataDiffSection. Read more here: https://bit.ly/2WPviOR, type: ");
                                    sb.append(simpleName);
                                    sb.append(", hash: ");
                                    sb.append(identityHashCode);
                                    coz.d(2, "sections_duplicate_item", sb.toString());
                                    break Label_0408;
                                }
                            }
                        }
                    }
                }
            }
            final Object b4 = dub2.b;
            final gz b5 = hc.b((gy)eah, b4 == null || (boolean)b4);
            if (e != null) {
                msr.u(e);
            }
            final eee eee = new eee(list, list2, cya, cya2, (byte[])null, (byte[])null);
            b5.a((hd)eee);
            final List c = eee.c;
            if (c != null && c.size() != eee.e.size()) {
                final StringBuilder sb2 = new StringBuilder("Inconsistent size between mPlaceholders(");
                sb2.append(eee.e.size());
                sb2.append(") and mNextData(");
                sb2.append(eee.c.size());
                sb2.append("); mOperations: [");
                for (int size = eee.d.size(), i = 0; i < size; ++i) {
                    final eed eed = eee.d.get(i);
                    sb2.append("[type=");
                    sb2.append(eed.a);
                    sb2.append(", index=");
                    sb2.append(eed.b);
                    sb2.append(", toIndex=");
                    sb2.append(eed.c);
                    if (eed.d != null) {
                        sb2.append(", count=");
                        sb2.append(eed.d.size());
                    }
                    sb2.append("], ");
                }
                sb2.append("]; mNextData: [");
                for (int size2 = eee.c.size(), j = 0; j < size2; ++j) {
                    sb2.append("[");
                    sb2.append(eee.c.get(j));
                    sb2.append("], ");
                }
                sb2.append("]");
                coz.d(2, "RecyclerBinderUpdateCallback:InconsistentSize", sb2.toString());
                eee.d.clear();
                eee.f.clear();
                eee.e.clear();
                final ArrayList list3 = new ArrayList();
                for (int k = 0; k < eee.a; ++k) {
                    list3.add(new dub(eee.b.get(k), (Object)null));
                }
                eee.f.addAll(list3);
                eee.d.add(new eed(2, 0, eee.a, (List)null, (List)list3));
                final int size3 = eee.c.size();
                final ArrayList list4 = new ArrayList(size3);
                final ArrayList list5 = new ArrayList<dub>(size3);
                for (int l = 0; l < size3; ++l) {
                    final Object value = eee.c.get(l);
                    list4.add(l, (Object)new tqv(eee.h.m(value, l), false));
                    list5.add(new dub((Object)null, value));
                }
                eee.e.addAll(list4);
                eee.f.addAll(list5);
                eee.d.add(new eed(0, 0, -1, (List)list4, (List)list5));
            }
            else {
                for (int size4 = eee.e.size(), n2 = 0; n2 < size4; ++n2) {
                    if (((tqv)eee.e.get(n2)).a) {
                        final Object value2 = eee.c.get(n2);
                        eee.e.get(n2).b = eee.h.m(value2, n2);
                        eee.f.get(n2).b = value2;
                    }
                }
            }
            final cya g = eee.g;
            final List d = eee.d;
            for (int size5 = d.size(), n3 = 0; n3 < size5; ++n3) {
                final eed eed2 = d.get(n3);
                final List d2 = eed2.d;
                final List e2 = eed2.e;
                int size6;
                if (d2 == null) {
                    size6 = 1;
                }
                else {
                    size6 = d2.size();
                }
                final int a = eed2.a;
                if (a != 0) {
                    if (a != 1) {
                        if (a != 2) {
                            ((dzo)g.a).f(dzm.a(eed2.b, eed2.c, ((dub)e2.get(0)).b));
                        }
                        else {
                            final int c2 = eed2.c;
                            if (c2 == 1) {
                                ((dzo)g.a).g(eed2.b, ((dub)e2.get(0)).a);
                            }
                            else {
                                ((dzo)g.a).f(dzm.b(-3, eed2.b, c2, dzm.a, cya.l(e2), null));
                            }
                        }
                    }
                    else if (size6 == 1) {
                        ((dzo)g.a).q(eed2.b, (eei)d2.get(0).b, ((dsx)dzu).p(), ((dub)e2.get(0)).a, ((dub)e2.get(0)).b);
                    }
                    else {
                        ((dzo)g.a).f(dzm.b(-2, eed2.b, size6, dzo.o(cya.j(size6, d2), ((dsx)dzu).p()), cya.l(e2), cya.k(e2)));
                    }
                }
                else if (size6 == 1) {
                    ((dzo)g.a).p(eed2.b, (eei)d2.get(0).b, ((dsx)dzu).p(), ((dub)e2.get(0)).b);
                }
                else {
                    final List j2 = cya.j(size6, d2);
                    final Object a2 = g.a;
                    final int b6 = eed2.b;
                    final cya p4 = ((dsx)dzu).p();
                    final List k2 = cya.k(e2);
                    final dzo dzo2 = (dzo)a2;
                    if (dzo2.c != null) {
                        for (int size7 = j2.size(), n4 = 0; n4 < size7; ++n4) {
                            ((eei)j2.get(n4)).p((Object)((dzt)dzo2.c).k);
                        }
                    }
                    dzo2.f(dzm.b(-1, b6, size6, dzo.o(j2, p4), null, k2));
                }
            }
        }
    }
}
