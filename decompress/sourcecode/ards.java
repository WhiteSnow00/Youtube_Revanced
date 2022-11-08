import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ards implements ardt
{
    private static final Logger e;
    final Set a;
    final Set b;
    final HashMap c;
    final HashMap d;
    private ardu f;
    
    static {
        e = Logger.getLogger(ards.class.getName());
    }
    
    public ards() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new HashMap();
    }
    
    public static long a(final long n, final long n2) {
        if (n2 == 0L) {
            return n;
        }
        return a(n2, n % n2);
    }
    
    protected static long b(final ardp ardp) {
        final List e = ardp.e();
        if (e.size() > 0) {
            final Iterator iterator = e.iterator();
            double n = 0.0;
            while (iterator.hasNext()) {
                n += ((ardl)iterator.next()).b;
            }
            final double n2 = (double)ardp.j().b;
            Double.isNaN(n2);
            return Math.round(n * n2);
        }
        return ardp.a();
    }
    
    public static final long d(final ardm ardm) {
        long n = ardm.d.iterator().next().j().b;
        final Iterator iterator = ardm.d.iterator();
        while (iterator.hasNext()) {
            n = a(((ardp)iterator.next()).j().b, n);
        }
        return n;
    }
    
    public final dpz c(final ardm ardm) {
        if (this.f == null) {
            this.f = new ardu(ardm);
        }
        final Logger e = ards.e;
        final Level fine = Level.FINE;
        final String concat = "Creating movie ".concat(ardm.toString());
        String s = "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder";
        e.logp(fine, "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder", "build", concat);
        final Iterator iterator = ardm.d.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final ardp ardp = (ardp)iterator.next();
            final List l = ardp.l();
            final List list = this.c.put(ardp, l);
            final int size = l.size();
            final long[] array = new long[size];
            while (i < size) {
                array[i] = l.get(i).a();
                ++i;
            }
            this.d.put(ardp, array);
        }
        final ardh ardh = new ardh();
        final LinkedList list2 = new LinkedList();
        list2.add("isom");
        list2.add("iso2");
        list2.add("avc1");
        ardh.w((dpu)new dqe("isom", 0L, (List)list2));
        final HashMap hashMap = new HashMap();
        final Iterator iterator2 = ardm.d.iterator();
        while (true) {
            int j = 0;
            if (!iterator2.hasNext()) {
                break;
            }
            final ardp ardp2 = (ardp)iterator2.next();
            final ardu f = this.f;
            final Iterator iterator3 = ((ardm)f.b).d.iterator();
            double n = 0.0;
            while (iterator3.hasNext()) {
                final ardp ardp3 = (ardp)iterator3.next();
                final double n2 = (double)(ardp3.a() / ardp3.j().b);
                double n3 = n;
                if (n < n2) {
                    n3 = n2;
                }
                n = n3;
            }
            final int a = f.a;
            int min;
            if ((min = Math.min((int)Math.ceil(n / 2.0) - 1, ardp2.l().size())) <= 0) {
                min = 1;
            }
            final long[] array2 = new long[min];
            Arrays.fill(array2, -1L);
            array2[0] = 1L;
            final long[] m = ardp2.m();
            final int length = m.length;
            int n4 = 0;
            long n5 = 0L;
            while (j < length) {
                final long n6 = m[j];
                final long n7 = n5 / ardp2.j().b;
                final int a2 = f.a;
                final int n8 = (int)(n7 / 2L) + 1;
                if (n8 >= min) {
                    break;
                }
                ++n4;
                array2[n8] = n4;
                n5 += n6;
                ++j;
            }
            long n9 = n4 + 1;
            for (int k = min - 1; k >= 0; --k) {
                final long n10 = array2[k];
                if (n10 == -1L) {
                    array2[k] = n9;
                }
                else {
                    n9 = n10;
                }
            }
            final int[] array3 = new int[min];
            int n13;
            for (int n11 = 0; n11 < min; n11 = n13) {
                final long n12 = array2[n11];
                n13 = n11 + 1;
                long n14;
                if (min == n13) {
                    n14 = ardp2.l().size();
                }
                else {
                    n14 = array2[n13] - 1L;
                }
                array3[n11] = aqqm.q(n14 - (n12 - 1L));
            }
            hashMap.put(ardp2, array3);
        }
        final dqm dqm = new dqm();
        final dqn dqn = new dqn();
        dqn.k(ardm.c);
        dqn.m(ardm.b);
        dqn.d = ardm.a;
        final long d = d(ardm);
        final Iterator iterator4 = ardm.d.iterator();
        long n15 = 0L;
        while (iterator4.hasNext()) {
            final ardp ardp4 = (ardp)iterator4.next();
            final long n16 = b(ardp4) * d / ardp4.j().b;
            long n17 = n15;
            if (n16 > n15) {
                n17 = n16;
            }
            n15 = n17;
        }
        dqn.l(n15);
        dqn.c = d;
        final Iterator iterator5 = ardm.d.iterator();
        long i2 = 0L;
        while (iterator5.hasNext()) {
            final ardp ardp5 = (ardp)iterator5.next();
            if (i2 < ardp5.j().i) {
                i2 = ardp5.j().i;
            }
        }
        dqn.e = i2 + 1L;
        ((ardh)dqm).w((dpu)dqn);
        Iterator iterator6 = ardm.d.iterator();
        Map map = hashMap;
        Object o = dqm;
        while (iterator6.hasNext()) {
            final ardp ardp6 = (ardp)iterator6.next();
            final drf drf = new drf();
            final drg drg = new drg();
            drg.m(true);
            drg.n(true);
            ((ardf)drg).r = (((ardf)drg).r() | 0x4);
            ((ardf)drg).r = (((ardf)drg).r() | 0x8);
            drg.e = ardp6.j().e;
            ardp6.j();
            drg.c = 0;
            drg.k(ardp6.j().d);
            drg.l(b(ardp6) * d(ardm) / ardp6.j().b);
            drg.g = ardp6.j().g;
            drg.f = ardp6.j().f;
            drg.b = ardp6.j().j;
            drg.o(ardp6.j().c);
            drg.a = ardp6.j().i;
            drg.d = ardp6.j().h;
            ((ardh)drf).w((dpu)drg);
            ardp6.e();
            String s2;
            ardh ardh2;
            Iterator iterator10;
            Object o2;
            Map map3;
            if (ardp6.e().size() > 0) {
                final dqd dqd = new dqd();
                final ArrayList a3 = new ArrayList();
                final Iterator iterator7 = ardp6.e().iterator();
                int q = 0;
                while (iterator7.hasNext()) {
                    final ardl ardl = (ardl)iterator7.next();
                    final double b = ardl.b;
                    long n18 = ardm.d.iterator().next().j().b;
                    final Iterator iterator8 = ardm.d.iterator();
                    while (iterator8.hasNext()) {
                        n18 = ardm.a(((ardp)iterator8.next()).j().b, n18);
                    }
                    final double n19 = (double)n18;
                    Double.isNaN(n19);
                    final long round = Math.round(b * n19);
                    final long n20 = ardl.c * ardp6.j().b / ardl.a;
                    if (round >= 4294967296L || n20 > 2147483647L) {
                        q = 1;
                    }
                    a3.add(new dqc(dqd, round, n20, ardl.d));
                }
                final Iterator iterator9 = iterator6;
                final Map map2 = map;
                s2 = s;
                dqd.a = a3;
                ((ardf)dqd).q = q;
                ardh2 = new arde((byte[])null);
                ardh2.w((dpu)dqd);
                iterator10 = iterator9;
                o2 = o;
                map3 = map2;
            }
            else {
                final Object o3 = o;
                final Iterator iterator11 = iterator6;
                ardh2 = null;
                map3 = map;
                s2 = s;
                o2 = o3;
                iterator10 = iterator11;
            }
            ((ardh)drf).w((dpu)ardh2);
            final dqj dqj = new dqj();
            ((ardh)drf).w((dpu)dqj);
            final dqk dqk = new dqk();
            dqk.a = ardp6.j().d;
            dqk.b = ardp6.j().c;
            dqk.d = ardp6.a();
            dqk.c = ardp6.j().b;
            dqk.e = ardp6.j().a;
            ((ardh)dqj).w((dpu)dqk);
            final dqh dqh = new dqh();
            ((ardh)dqj).w((dpu)dqh);
            dqh.a = ardp6.k();
            final dql dql = new dql();
            if (ardp6.k().equals("vide")) {
                ((ardh)dql).w((dpu)new drj());
            }
            else if (ardp6.k().equals("soun")) {
                ((ardh)dql).w((dpu)new dqw());
            }
            else if (ardp6.k().equals("text")) {
                ((ardh)dql).w((dpu)new dqo());
            }
            else if (ardp6.k().equals("subt")) {
                ((ardh)dql).w((dpu)new drb());
            }
            else if (ardp6.k().equals("hint")) {
                ((ardh)dql).w((dpu)new dqi());
            }
            else if (ardp6.k().equals("sbtl")) {
                ((ardh)dql).w((dpu)new dqo());
            }
            final arde arde = new arde();
            final dqb dqb = new dqb();
            arde.w((dpu)dqb);
            final dqa dqa = new dqa();
            ((ardf)dqa).r = 1;
            dqb.w((dpu)dqa);
            ((ardh)dql).w((dpu)arde);
            final dqt dqt = new dqt();
            ((ardh)dqt).w((dpu)ardp6.i());
            final ArrayList b2 = new ArrayList();
            final long[] m2 = ardp6.m();
            final int length2 = m2.length;
            drd drd = null;
            for (final long n22 : m2) {
                if (drd != null && drd.b == n22) {
                    ++drd.a;
                }
                else {
                    drd = new drd(1L, n22);
                    b2.add(drd);
                }
            }
            final dre dre = new dre();
            dre.b = b2;
            ((ardh)dqt).w((dpu)dre);
            final List d2 = ardp6.d();
            if (d2 != null && !d2.isEmpty()) {
                final dpy dpy = new dpy();
                dpy.a = d2;
                ((ardh)dqt).w((dpu)dpy);
            }
            final long[] h = ardp6.h();
            if (h != null && h.length > 0) {
                final drc drc = new drc();
                drc.a = h;
                ((ardh)dqt).w((dpu)drc);
            }
            if (ardp6.f() != null && !ardp6.f().isEmpty()) {
                final dqq dqq = new dqq();
                dqq.a = ardp6.f();
                ((ardh)dqt).w((dpu)dqq);
            }
            final int[] array4 = map3.get(ardp6);
            final dqv dqv = new dqv();
            dqv.a = new LinkedList();
            long n23 = -2147483648L;
            for (int n24 = 0; n24 < array4.length; ++n24) {
                final long n25 = array4[n24];
                if (n23 != n25) {
                    dqv.a.add(new dqu((long)(n24 + 1), n25, 1L));
                    n23 = array4[n24];
                }
            }
            ((ardh)dqt).w((dpu)dqv);
            final dqs dqs = new dqs();
            dqs.a = this.d.get(ardp6);
            ((ardh)dqt).w((dpu)dqs);
            final int[] array5 = map3.get(ardp6);
            final dqx dqx = new dqx();
            this.a.add(dqx);
            final long[] a4 = new long[array5.length];
            final Logger e2 = ards.e;
            final boolean loggable = e2.isLoggable(Level.FINE);
            final String s3 = "Calculating chunk offsets for track_";
            if (loggable) {
                final Level fine2 = Level.FINE;
                final long i3 = ardp6.j().i;
                final StringBuilder sb = new StringBuilder(56);
                sb.append("Calculating chunk offsets for track_");
                sb.append(i3);
                e2.logp(fine2, s2, "createStco", sb.toString());
            }
            int n26 = 0;
            long n27 = 0L;
            final ardh ardh3 = (ardh)dqj;
            while (n26 < array5.length) {
                final Logger e3 = ards.e;
                if (e3.isLoggable(Level.FINER)) {
                    final Level finer = Level.FINER;
                    final long i4 = ardp6.j().i;
                    final StringBuilder sb2 = new StringBuilder(74);
                    sb2.append(s3);
                    sb2.append(i4);
                    sb2.append(" chunk ");
                    sb2.append(n26);
                    e3.logp(finer, s2, "createStco", sb2.toString());
                }
                for (final ardp ardp7 : ardm.d) {
                    final Logger e4 = ards.e;
                    if (e4.isLoggable(Level.FINEST)) {
                        final Level finest = Level.FINEST;
                        final long i5 = ardp7.j().i;
                        final StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Adding offsets of track_");
                        sb3.append(i5);
                        e4.logp(finest, s2, "createStco", sb3.toString());
                    }
                    final int[] array6 = map3.get(ardp7);
                    int n28 = 0;
                    long n29 = 0L;
                    while (n28 < n26) {
                        n29 += array6[n28];
                        ++n28;
                    }
                    if (ardp7 == ardp6) {
                        a4[n26] = n27;
                    }
                    for (int q2 = aqqm.q(n29); q2 < array6[n26] + n29; ++q2) {
                        n27 += ((long[])this.d.get(ardp7))[q2];
                    }
                }
                ++n26;
            }
            dqx.a = a4;
            ((ardh)dqt).w((dpu)dqx);
            final HashMap hashMap2 = new HashMap();
            for (final Map.Entry<arey, V> entry : ardp6.g().entrySet()) {
                final String a5 = entry.getKey().a();
                List list3;
                if ((list3 = (List)hashMap2.get(a5)) == null) {
                    list3 = new ArrayList();
                    hashMap2.put(a5, list3);
                }
                list3.add(entry.getKey());
            }
            for (final Map.Entry<K, List> entry2 : hashMap2.entrySet()) {
                final arfc arfc = new arfc();
                final String a6 = (String)entry2.getKey();
                arfc.a = entry2.getValue();
                final arfe arfe = new arfe();
                arfe.a = a6;
                arfd arfd = null;
                for (int n30 = 0; n30 < ardp6.l().size(); ++n30) {
                    int n31 = 0;
                    int n32 = 0;
                    while (n31 < entry2.getValue().size()) {
                        if (Arrays.binarySearch((long[])ardp6.g().get(entry2.getValue().get(n31)), n30) >= 0) {
                            n32 = n31 + 1;
                        }
                        ++n31;
                    }
                    if (arfd != null && arfd.b == n32) {
                        ++arfd.a;
                    }
                    else {
                        arfd = new arfd(1L, n32);
                        arfe.b.add(arfd);
                    }
                }
                ((ardh)dqt).w((dpu)arfc);
                ((ardh)dqt).w((dpu)arfe);
            }
            if (ardp6 instanceof ared) {
                final ared ared = (ared)ardp6;
                final int[] array7 = map3.get(ardp6);
                final arfu arfu = new arfu();
                arfu.d = "cenc";
                ((ardf)arfu).r = 1;
                final List n33 = ared.n();
                if (ared.o()) {
                    final int size2 = n33.size();
                    final short[] array8 = new short[size2];
                    for (int n34 = 0; n34 < size2; ++n34) {
                        array8[n34] = (short)((argo)n33.get(n34)).a();
                    }
                    arfu.b = Arrays.copyOf(array8, size2);
                }
                else {
                    arfu.a = 8;
                    arfu.c = ared.l().size();
                }
                final arft arft = new arft();
                final aref aref = new aref();
                if (ared.o()) {
                    ((ardf)aref).r = (((ardf)aref).r() | 0x2);
                }
                else {
                    ((ardf)aref).r = (((ardf)aref).r() & 0xFFFFFD);
                }
                aref.d = n33;
                int n35;
                if (((ardd)aref).b() > 4294967296L) {
                    n35 = 16;
                }
                else {
                    n35 = 8;
                }
                int n36;
                if (aref.k()) {
                    final int length3 = aref.c.length;
                    n36 = 20;
                }
                else {
                    n36 = 0;
                }
                long n37 = n35 + n36 + 4;
                final long[] a7 = new long[array7.length];
                int n38 = 0;
                int n39 = 0;
                while (n38 < array7.length) {
                    a7[n38] = n37;
                    for (int n40 = 0; n40 < array7[n38]; ++n40, ++n39) {
                        n37 += ((argo)n33.get(n39)).a();
                    }
                    ++n38;
                }
                arft.a = a7;
                ((ardh)dqt).w((dpu)arfu);
                ((ardh)dqt).w((dpu)arft);
                ((ardh)dqt).w((dpu)aref);
                this.b.add(arft);
            }
            final Map map4 = map3;
            if (ardp6.b() != null) {
                ((ardh)dqt).w((dpu)ardp6.b());
            }
            ((ardh)dql).w((dpu)dqt);
            ardh3.w((dpu)dql);
            ((ardh)o2).w((dpu)drf);
            final String s4 = s2;
            o = o2;
            iterator6 = iterator10;
            map = map4;
            s = s4;
        }
        ardh.w((dpu)o);
        final Iterator iterator15 = arfp.c(o, "trak/mdia/minf/stbl/stsz", false).iterator();
        long n41 = 0L;
        while (iterator15.hasNext()) {
            final long[] a8 = ((dqs)iterator15.next()).a;
            final int length4 = a8.length;
            int n42 = 0;
            long n43 = 0L;
            while (n42 < length4) {
                n43 += a8[n42];
                ++n42;
            }
            n41 += n43;
        }
        Object c = new ardr(this, ardm, map, n41);
        ardh.w((dpu)c);
        long n44 = 16L;
        while (c instanceof dpu) {
            final dpu dpu = (dpu)c;
            for (final dpu dpu2 : dpu.c().i()) {
                if (c == dpu2) {
                    break;
                }
                n44 += dpu2.b();
            }
            c = dpu.c();
        }
        final Iterator iterator17 = this.a.iterator();
        while (iterator17.hasNext()) {
            final long[] a9 = ((dqx)iterator17.next()).a;
            for (int n45 = 0; n45 < a9.length; ++n45) {
                a9[n45] += n44;
            }
        }
        for (final arft arft2 : this.b) {
            long n46 = ((ardd)arft2).b() + 44L;
            Object o4 = arft2;
            while (true) {
                final dpz c2 = ((dpu)o4).c();
                for (final dpu dpu3 : c2.i()) {
                    if (dpu3 == o4) {
                        break;
                    }
                    n46 += dpu3.b();
                }
                if (!(c2 instanceof dpu)) {
                    break;
                }
                o4 = c2;
            }
            final long[] a10 = arft2.a;
            for (int n47 = 0; n47 < a10.length; ++n47) {
                a10[n47] += n46;
            }
            arft2.a = a10;
        }
        return (dpz)ardh;
    }
}
