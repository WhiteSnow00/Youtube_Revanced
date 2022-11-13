import java.util.Map;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argc extends arfz
{
    public List d;
    public dqs e;
    public List f;
    public List g;
    public List h;
    public argf i;
    public String j;
    public drb k;
    private long[] l;
    private long[] m;
    
    public argc(final String s, final drg drg, final dpt... array) {
        super(s);
        this.m = new long[0];
        this.i = new argf();
        this.k = null;
        final long a = drg.n().a;
        this.d = (List)new drv(drg, array);
        final dqu l = drg.l().n().l();
        this.j = drg.l().l().a;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.f.addAll(l.r().b);
        if (l.m() != null) {
            this.g.addAll(l.m().a);
        }
        if (l.n() != null) {
            this.h.addAll(l.n().a);
        }
        if (l.q() != null) {
            this.m = l.q().a;
        }
        String s2 = "subs";
        this.k = (drb)arie.a((arft)l, "subs");
        final ArrayList list = new ArrayList();
        list.addAll(((dpv)((arft)drg).m).c().j((Class)drm.class));
        this.e = l.o();
        final List j = ((arft)drg).m.j((Class)drl.class);
        if (j.size() > 0) {
            Iterator iterator = j.iterator();
            while (iterator.hasNext()) {
                Iterator iterator2 = ((arfw)iterator.next()).j((Class)dro.class).iterator();
                while (iterator2.hasNext()) {
                    final dro dro = (dro)iterator2.next();
                    if (dro.a == a) {
                        if (arie.b(((dpv)((arft)drg).m).c(), "/moof/traf/subs").size() > 0) {
                            this.k = new drb();
                        }
                        final LinkedList list2 = new LinkedList();
                        final int size = list.size();
                        int i = 0;
                        long n = 1L;
                        while (i < size) {
                            final Iterator iterator3 = ((arfw)list.get(i)).j((Class)drq.class).iterator();
                            Iterator iterator4 = iterator2;
                            Iterator iterator6 = null;
                            Iterator iterator7 = null;
                            String s3 = null;
                            for (Iterator iterator5 = iterator3; iterator5.hasNext(); iterator5 = iterator6, iterator = iterator7, s2 = s3) {
                                final drq drq = (drq)iterator5.next();
                                if (drq.l().a == a) {
                                    final drb drb = (drb)arie.a((arft)drq, s2);
                                    iterator6 = iterator5;
                                    iterator7 = iterator;
                                    s3 = s2;
                                    if (drb != null) {
                                        long n2 = n - 1L;
                                        final Iterator iterator8 = drb.a.iterator();
                                        while (true) {
                                            iterator6 = iterator5;
                                            iterator7 = iterator;
                                            s3 = s2;
                                            if (!iterator8.hasNext()) {
                                                break;
                                            }
                                            final dra dra = (dra)iterator8.next();
                                            final dra dra2 = new dra();
                                            dra2.b.addAll(dra.b);
                                            if (n2 != 0L) {
                                                dra2.a = n2 + dra.a;
                                            }
                                            else {
                                                dra2.a = dra.a;
                                            }
                                            this.k.a.add(dra2);
                                            n2 = 0L;
                                        }
                                    }
                                    Iterator iterator11;
                                    Iterator iterator12;
                                    for (Iterator iterator9 = ((arfw)drq).j((Class)drt.class).iterator(); iterator9.hasNext(); iterator9 = iterator12, iterator4 = iterator11) {
                                        final drt drt = (drt)iterator9.next();
                                        final drr k = ((drq)((arfs)drt).j).l();
                                        final Iterator iterator10 = drt.c.iterator();
                                        int n3 = 1;
                                        iterator11 = iterator4;
                                        iterator12 = iterator9;
                                        while (iterator10.hasNext()) {
                                            final drs drs = (drs)iterator10.next();
                                            Label_0901: {
                                                if (drt.n()) {
                                                    if (this.f.size() != 0) {
                                                        final List f = this.f;
                                                        if (((dre)f.get(f.size() - 1)).b == drs.a) {
                                                            final List f2 = this.f;
                                                            final dre dre = f2.get(f2.size() - 1);
                                                            ++dre.a;
                                                            break Label_0901;
                                                        }
                                                    }
                                                    this.f.add(new dre(1L, drs.a));
                                                }
                                                else if ((((arfu)k).r() & 0x8) != 0x0) {
                                                    this.f.add(new dre(1L, k.c));
                                                }
                                                else {
                                                    this.f.add(new dre(1L, dro.b));
                                                }
                                            }
                                            Label_1031: {
                                                if (drt.m()) {
                                                    if (this.g.size() != 0) {
                                                        final List g = this.g;
                                                        if (((dpy)g.get(g.size() - 1)).b == drs.d) {
                                                            final List g2 = this.g;
                                                            final dpy dpy = g2.get(g2.size() - 1);
                                                            ++dpy.a;
                                                            break Label_1031;
                                                        }
                                                    }
                                                    this.g.add(new dpy(1, aqsy.q(drs.d)));
                                                }
                                            }
                                            drn drn;
                                            if (drt.o()) {
                                                drn = drs.c;
                                            }
                                            else if (n3 != 0 && (((arfu)drt).r() & 0x4) == 0x4) {
                                                drn = drt.b;
                                            }
                                            else if ((((arfu)k).r() & 0x20) != 0x0) {
                                                drn = k.e;
                                            }
                                            else {
                                                drn = dro.d;
                                            }
                                            if (drn != null && !drn.a) {
                                                list2.add(n);
                                            }
                                            ++n;
                                            n3 = 0;
                                        }
                                    }
                                }
                            }
                            ++i;
                            iterator2 = iterator4;
                        }
                        final long[] m = this.m;
                        int length = m.length;
                        System.arraycopy(m, 0, this.m = new long[list2.size() + length], 0, length);
                        final Iterator iterator13 = list2.iterator();
                        while (iterator13.hasNext()) {
                            this.m[length] = (long)iterator13.next();
                            ++length;
                        }
                    }
                }
            }
            new ArrayList();
            new ArrayList();
            for (int size2 = list.size(), n4 = 0; n4 < size2; ++n4) {
                for (final drq drq2 : ((arfw)list.get(n4)).j((Class)drq.class)) {
                    if (drq2.l().a == a) {
                        final List b = arie.b((dqa)drq2, "sgpd");
                        final List b2 = arie.b((dqa)drq2, "sbgp");
                        final Map c = this.c;
                        n(b, b2, c);
                        this.c = c;
                    }
                }
            }
        }
        else {
            final List j2 = ((arfw)l).j((Class)arhr.class);
            final List j3 = ((arfw)l).j((Class)arht.class);
            final Map c2 = this.c;
            n(j2, j3, c2);
            this.c = c2;
        }
        this.l = drf.k(this.f);
        final dql m2 = drg.l().m();
        final drh n5 = drg.n();
        final argf i2 = this.i;
        i2.i = n5.a;
        i2.d = m2.a;
        i2.a = m2.e;
        i2.c = m2.b;
        i2.b = m2.c;
        i2.g = n5.g;
        i2.f = n5.f;
        i2.j = n5.b;
        i2.e = n5.e;
        final dqe dqe = (dqe)arie.a((arft)drg, "edts/elst");
        final dqo dqo = (dqo)arie.a((arft)drg, "../mvhd");
        if (dqe != null) {
            for (final dqd dqd : dqe.a) {
                final List b3 = this.b;
                final long c3 = dqd.c;
                final long c4 = m2.c;
                final double d = dqd.d;
                final double n6 = (double)dqd.b;
                final double n7 = (double)dqo.c;
                Double.isNaN(n6);
                Double.isNaN(n7);
                b3.add(new arga(c3, c4, d, n6 / n7));
            }
        }
    }
    
    private static final void n(final List list, final List list2, final Map map) {
        for (final arhr arhr : list) {
            final Iterator iterator2 = list2.iterator();
            boolean b = false;
            while (iterator2.hasNext()) {
                final arht arht = (arht)iterator2.next();
                if (arht.a.equals(arhr.a.get(0).a())) {
                    final Iterator iterator3 = arht.b.iterator();
                    int n = 0;
                    while (iterator3.hasNext()) {
                        final arhs arhs = (arhs)iterator3.next();
                        final int b2 = arhs.b;
                        if (b2 > 0) {
                            final arhn arhn = arhr.a.get(b2 - 1);
                            long[] array;
                            if ((array = map.get(arhn)) == null) {
                                array = new long[0];
                            }
                            final int q = aqsy.q(arhs.a);
                            final int length = array.length;
                            final long[] array2 = new long[q + length];
                            System.arraycopy(array, 0, array2, 0, length);
                            for (int n2 = 0; n2 < arhs.a; ++n2) {
                                array2[array.length + n2] = n + n2;
                            }
                            map.put(arhn, array2);
                        }
                        n += (int)arhs.a;
                    }
                    b = true;
                }
            }
            if (b) {
                continue;
            }
            final String a = arhr.a.get(0).a();
            final StringBuilder sb = new StringBuilder(a.length() + 37);
            sb.append("Could not find SampleToGroupBox for ");
            sb.append(a);
            sb.append(".");
            throw new RuntimeException(sb.toString());
        }
    }
    
    @Override
    public final drb b() {
        return this.k;
    }
    
    public final void close() {
        throw null;
    }
    
    @Override
    public final List d() {
        return this.g;
    }
    
    @Override
    public final List f() {
        return this.h;
    }
    
    @Override
    public final long[] h() {
        if (this.m.length == this.d.size()) {
            return null;
        }
        return this.m;
    }
    
    public final dqs i() {
        return this.e;
    }
    
    public final argf j() {
        return this.i;
    }
    
    public final String k() {
        return this.j;
    }
    
    public final List l() {
        return this.d;
    }
    
    public final long[] m() {
        synchronized (this) {
            return this.l;
        }
    }
}
