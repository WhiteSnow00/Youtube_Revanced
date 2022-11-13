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

public final class argh implements argi
{
    private static final Logger e;
    final Set a;
    final Set b;
    final HashMap c;
    final HashMap d;
    private argj f;
    
    static {
        e = Logger.getLogger(argh.class.getName());
    }
    
    public argh() {
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
    
    protected static long b(final arge arge) {
        final List e = arge.e();
        if (e.size() > 0) {
            final Iterator iterator = e.iterator();
            double n = 0.0;
            while (iterator.hasNext()) {
                n += ((arga)iterator.next()).b;
            }
            final double n2 = (double)arge.j().b;
            Double.isNaN(n2);
            return Math.round(n * n2);
        }
        return arge.a();
    }
    
    public static final long d(final argb argb) {
        long n = argb.d.iterator().next().j().b;
        final Iterator iterator = argb.d.iterator();
        while (iterator.hasNext()) {
            n = a(((arge)iterator.next()).j().b, n);
        }
        return n;
    }
    
    public final dqa c(final argb argb) {
        if (this.f == null) {
            this.f = new argj(argb);
        }
        final Logger e = argh.e;
        final Level fine = Level.FINE;
        final String concat = "Creating movie ".concat(argb.toString());
        final String s = "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder";
        e.logp(fine, "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder", "build", concat);
        final Iterator iterator = argb.d.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final arge arge = (arge)iterator.next();
            final List l = arge.l();
            final List list = this.c.put(arge, l);
            final int size = l.size();
            final long[] array = new long[size];
            while (i < size) {
                array[i] = l.get(i).a();
                ++i;
            }
            this.d.put(arge, array);
        }
        final arfw arfw = new arfw();
        final LinkedList list2 = new LinkedList();
        list2.add("isom");
        list2.add("iso2");
        list2.add("avc1");
        arfw.w((dpv)new dqf("isom", 0L, (List)list2));
        final HashMap hashMap = new HashMap();
        final Iterator iterator2 = argb.d.iterator();
        while (true) {
            int j = 0;
            if (!iterator2.hasNext()) {
                break;
            }
            final arge arge2 = (arge)iterator2.next();
            final argj f = this.f;
            final Iterator iterator3 = ((argb)f.b).d.iterator();
            double n = 0.0;
            while (iterator3.hasNext()) {
                final arge arge3 = (arge)iterator3.next();
                final double n2 = (double)(arge3.a() / arge3.j().b);
                if (n >= n2) {
                    continue;
                }
                n = n2;
            }
            final int a = f.a;
            int min;
            if ((min = Math.min((int)Math.ceil(n / 2.0) - 1, arge2.l().size())) <= 0) {
                min = 1;
            }
            final long[] array2 = new long[min];
            Arrays.fill(array2, -1L);
            array2[0] = 1L;
            final long[] m = arge2.m();
            final int length = m.length;
            int n3 = 0;
            long n4 = 0L;
            while (j < length) {
                final long n5 = m[j];
                final long n6 = n4 / arge2.j().b;
                final int a2 = f.a;
                final int n7 = (int)(n6 / 2L) + 1;
                if (n7 >= min) {
                    break;
                }
                ++n3;
                array2[n7] = n3;
                n4 += n5;
                ++j;
            }
            int k = min - 1;
            long n8 = n3 + 1;
            while (k >= 0) {
                final long n9 = array2[k];
                if (n9 == -1L) {
                    array2[k] = n8;
                }
                else {
                    n8 = n9;
                }
                --k;
            }
            final int[] array3 = new int[min];
            int n12;
            for (int n10 = 0; n10 < min; n10 = n12) {
                final long n11 = array2[n10];
                n12 = n10 + 1;
                long n13;
                if (min == n12) {
                    n13 = arge2.l().size();
                }
                else {
                    n13 = array2[n12] - 1L;
                }
                array3[n10] = aqsy.q(n13 - (n11 - 1L));
            }
            hashMap.put(arge2, array3);
        }
        final dqn dqn = new dqn();
        final dqo dqo = new dqo();
        dqo.k(argb.c);
        dqo.m(argb.b);
        dqo.d = argb.a;
        final long d = d(argb);
        final Iterator iterator4 = argb.d.iterator();
        long n14 = 0L;
        while (iterator4.hasNext()) {
            final arge arge4 = (arge)iterator4.next();
            final long n15 = b(arge4) * d / arge4.j().b;
            if (n15 <= n14) {
                continue;
            }
            n14 = n15;
        }
        dqo.l(n14);
        dqo.c = d;
        final Iterator iterator5 = argb.d.iterator();
        long i2 = 0L;
        while (iterator5.hasNext()) {
            final arge arge5 = (arge)iterator5.next();
            if (i2 < arge5.j().i) {
                i2 = arge5.j().i;
            }
        }
        dqo.e = i2 + 1L;
        ((arfw)dqn).w((dpv)dqo);
        final Iterator iterator6 = argb.d.iterator();
        argh argh = this;
        final String s2 = s;
        final dpv dpv = (dpv)dqn;
        while (iterator6.hasNext()) {
            final arge arge6 = (arge)iterator6.next();
            final drg drg = new drg();
            final drh drh = new drh();
            drh.m(true);
            drh.n(true);
            ((arfu)drh).r = (((arfu)drh).r() | 0x4);
            ((arfu)drh).r = (((arfu)drh).r() | 0x8);
            drh.e = arge6.j().e;
            arge6.j();
            drh.c = 0;
            drh.k(arge6.j().d);
            drh.l(b(arge6) * d(argb) / arge6.j().b);
            drh.g = arge6.j().g;
            drh.f = arge6.j().f;
            drh.b = arge6.j().j;
            drh.o(arge6.j().c);
            drh.a = arge6.j().i;
            drh.d = arge6.j().h;
            ((arfw)drg).w((dpv)drh);
            arge6.e();
            arfw arfw2;
            if (arge6.e().size() > 0) {
                final dqe dqe = new dqe();
                final ArrayList a3 = new ArrayList();
                final Iterator iterator7 = arge6.e().iterator();
                int q = 0;
                while (iterator7.hasNext()) {
                    final arga arga = (arga)iterator7.next();
                    final double b = arga.b;
                    long n16 = argb.d.iterator().next().j().b;
                    final Iterator iterator8 = argb.d.iterator();
                    while (iterator8.hasNext()) {
                        n16 = argb.a(((arge)iterator8.next()).j().b, n16);
                    }
                    final double n17 = (double)n16;
                    Double.isNaN(n17);
                    final long round = Math.round(b * n17);
                    final long n18 = arga.c * arge6.j().b / arga.a;
                    if (round >= 4294967296L || n18 > 2147483647L) {
                        q = 1;
                    }
                    a3.add(new dqd(dqe, round, n18, arga.d));
                }
                dqe.a = a3;
                ((arfu)dqe).q = q;
                arfw2 = new arft((byte[])null);
                arfw2.w((dpv)dqe);
            }
            else {
                arfw2 = null;
            }
            ((arfw)drg).w((dpv)arfw2);
            final dqk dqk = new dqk();
            ((arfw)drg).w((dpv)dqk);
            final dql dql = new dql();
            dql.a = arge6.j().d;
            dql.b = arge6.j().c;
            dql.d = arge6.a();
            dql.c = arge6.j().b;
            dql.e = arge6.j().a;
            ((arfw)dqk).w((dpv)dql);
            final dqi dqi = new dqi();
            ((arfw)dqk).w((dpv)dqi);
            dqi.a = arge6.k();
            final dqm dqm = new dqm();
            if (arge6.k().equals("vide")) {
                ((arfw)dqm).w((dpv)new drk());
            }
            else if (arge6.k().equals("soun")) {
                ((arfw)dqm).w((dpv)new dqx());
            }
            else if (arge6.k().equals("text")) {
                ((arfw)dqm).w((dpv)new dqp());
            }
            else if (arge6.k().equals("subt")) {
                ((arfw)dqm).w((dpv)new drc());
            }
            else if (arge6.k().equals("hint")) {
                ((arfw)dqm).w((dpv)new dqj());
            }
            else if (arge6.k().equals("sbtl")) {
                ((arfw)dqm).w((dpv)new dqp());
            }
            final arft arft = new arft();
            final dqc dqc = new dqc();
            arft.w((dpv)dqc);
            final dqb dqb = new dqb();
            ((arfu)dqb).r = 1;
            ((arfw)dqc).w((dpv)dqb);
            ((arfw)dqm).w((dpv)arft);
            final dqu dqu = new dqu();
            ((arfw)dqu).w((dpv)arge6.i());
            final ArrayList b2 = new ArrayList();
            final long[] m2 = arge6.m();
            final int length2 = m2.length;
            dre dre = null;
            for (final long n20 : m2) {
                if (dre != null && dre.b == n20) {
                    ++dre.a;
                }
                else {
                    dre = new dre(1L, n20);
                    b2.add(dre);
                }
            }
            final drf drf = new drf();
            drf.b = b2;
            ((arfw)dqu).w((dpv)drf);
            final List d2 = arge6.d();
            if (d2 != null && !d2.isEmpty()) {
                final dpz dpz = new dpz();
                dpz.a = d2;
                ((arfw)dqu).w((dpv)dpz);
            }
            final long[] h = arge6.h();
            if (h != null && h.length > 0) {
                final drd drd = new drd();
                drd.a = h;
                ((arfw)dqu).w((dpv)drd);
            }
            if (arge6.f() != null && !arge6.f().isEmpty()) {
                final dqr dqr = new dqr();
                dqr.a = arge6.f();
                ((arfw)dqu).w((dpv)dqr);
            }
            final int[] array4 = (int[])hashMap.get(arge6);
            final dqw dqw = new dqw();
            dqw.a = new LinkedList();
            long n21 = -2147483648L;
            int n22 = 0;
            final dpv dpv2 = (dpv)dqm;
            while (n22 < array4.length) {
                final long n23 = array4[n22];
                if (n21 != n23) {
                    dqw.a.add(new dqv((long)(n22 + 1), n23, 1L));
                    n21 = array4[n22];
                }
                ++n22;
            }
            ((arfw)dqu).w((dpv)dqw);
            final dqt dqt = new dqt();
            argh = this;
            dqt.a = argh.d.get(arge6);
            ((arfw)dqu).w((dpv)dqt);
            final int[] array5 = (int[])hashMap.get(arge6);
            final dqy dqy = new dqy();
            argh.a.add(dqy);
            final long[] a4 = new long[array5.length];
            final Logger e2 = argh.e;
            final boolean loggable = e2.isLoggable(Level.FINE);
            final String s3 = "Calculating chunk offsets for track_";
            if (loggable) {
                final Level fine2 = Level.FINE;
                final long i3 = arge6.j().i;
                final StringBuilder sb = new StringBuilder(56);
                sb.append("Calculating chunk offsets for track_");
                sb.append(i3);
                e2.logp(fine2, s2, "createStco", sb.toString());
            }
            int n24 = 0;
            long n25 = 0L;
            while (n24 < array5.length) {
                final Logger e3 = argh.e;
                if (e3.isLoggable(Level.FINER)) {
                    final Level finer = Level.FINER;
                    final long i4 = arge6.j().i;
                    final StringBuilder sb2 = new StringBuilder(74);
                    sb2.append(s3);
                    sb2.append(i4);
                    sb2.append(" chunk ");
                    sb2.append(n24);
                    e3.logp(finer, s2, "createStco", sb2.toString());
                }
                final Iterator iterator9 = argb.d.iterator();
                argh argh2 = argh;
                final Iterator iterator10 = iterator9;
                while (iterator10.hasNext()) {
                    final arge arge7 = (arge)iterator10.next();
                    final Logger e4 = argh.e;
                    if (e4.isLoggable(Level.FINEST)) {
                        final Level finest = Level.FINEST;
                        final long i5 = arge7.j().i;
                        final StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Adding offsets of track_");
                        sb3.append(i5);
                        e4.logp(finest, s2, "createStco", sb3.toString());
                    }
                    final int[] array6 = (int[])hashMap.get(arge7);
                    int n26 = 0;
                    long n27 = 0L;
                    while (n26 < n24) {
                        n27 += array6[n26];
                        ++n26;
                    }
                    if (arge7 == arge6) {
                        a4[n24] = n25;
                    }
                    for (int q2 = aqsy.q(n27); q2 < array6[n24] + n27; ++q2) {
                        n25 += ((long[])this.d.get(arge7))[q2];
                    }
                    argh2 = this;
                }
                ++n24;
                argh = argh2;
            }
            dqy.a = a4;
            ((arfw)dqu).w((dpv)dqy);
            final HashMap hashMap2 = new HashMap();
            for (final Map.Entry<arhn, V> entry : arge6.g().entrySet()) {
                final String a5 = entry.getKey().a();
                List list3;
                if ((list3 = (List)hashMap2.get(a5)) == null) {
                    list3 = new ArrayList();
                    hashMap2.put(a5, list3);
                }
                list3.add(entry.getKey());
            }
            for (final Map.Entry<K, List> entry2 : hashMap2.entrySet()) {
                final arhr arhr = new arhr();
                final String a6 = (String)entry2.getKey();
                arhr.a = entry2.getValue();
                final arht arht = new arht();
                arht.a = a6;
                arhs arhs = null;
                for (int n28 = 0; n28 < arge6.l().size(); ++n28) {
                    int n29 = 0;
                    int n30 = 0;
                    while (n29 < entry2.getValue().size()) {
                        if (Arrays.binarySearch((long[])arge6.g().get(entry2.getValue().get(n29)), n28) >= 0) {
                            n30 = n29 + 1;
                        }
                        ++n29;
                    }
                    if (arhs != null && arhs.b == n30) {
                        ++arhs.a;
                    }
                    else {
                        arhs = new arhs(1L, n30);
                        arht.b.add(arhs);
                    }
                }
                ((arfw)dqu).w((dpv)arhr);
                ((arfw)dqu).w((dpv)arht);
            }
            if (arge6 instanceof args) {
                final args args = (args)arge6;
                final int[] array7 = (int[])hashMap.get(arge6);
                final arij arij = new arij();
                arij.d = "cenc";
                arij.r = 1;
                final List n31 = args.n();
                if (args.o()) {
                    final int size2 = n31.size();
                    final short[] array8 = new short[size2];
                    for (int n32 = 0; n32 < size2; ++n32) {
                        array8[n32] = (short)((arjd)n31.get(n32)).a();
                    }
                    arij.b = Arrays.copyOf(array8, size2);
                }
                else {
                    arij.a = 8;
                    arij.c = args.l().size();
                }
                int n33 = 8;
                final arii arii = new arii();
                final argu argu = new argu();
                if (args.o()) {
                    argu.r = (argu.r() | 0x2);
                }
                else {
                    argu.r = (argu.r() & 0xFFFFFD);
                }
                argu.d = n31;
                final long b3 = argu.b();
                int n34;
                if (argu.k()) {
                    final int length3 = argu.c.length;
                    n34 = 20;
                }
                else {
                    n34 = 0;
                }
                if (b3 > 4294967296L) {
                    n33 = 16;
                }
                final long[] a7 = new long[array7.length];
                long n35 = n33 + n34 + 4;
                int n36 = 0;
                int n37 = 0;
                while (n36 < array7.length) {
                    a7[n36] = n35;
                    for (int n38 = 0; n38 < array7[n36]; ++n38, ++n37) {
                        n35 += ((arjd)n31.get(n37)).a();
                    }
                    ++n36;
                }
                arii.a = a7;
                ((arfw)dqu).w((dpv)arij);
                ((arfw)dqu).w((dpv)arii);
                ((arfw)dqu).w((dpv)argu);
                argh.b.add(arii);
            }
            if (arge6.b() != null) {
                ((arfw)dqu).w((dpv)arge6.b());
            }
            ((arfw)dpv2).w((dpv)dqu);
            ((arfw)dqk).w(dpv2);
            ((arfw)dpv).w((dpv)drg);
        }
        arfw.w(dpv);
        final Iterator iterator13 = arie.c((Object)dpv, "trak/mdia/minf/stbl/stsz", false).iterator();
        long n39 = 0L;
        while (iterator13.hasNext()) {
            final long[] a8 = ((dqt)iterator13.next()).a;
            final int length4 = a8.length;
            int n40 = 0;
            long n41 = 0L;
            while (n40 < length4) {
                n41 += a8[n40];
                ++n40;
            }
            n39 += n41;
        }
        Object c = new argg(this, argb, (Map)hashMap, n39);
        arfw.w((dpv)c);
        long n42 = 16L;
        while (c instanceof dpv) {
            final dpv dpv3 = (dpv)c;
            for (final dpv dpv4 : dpv3.c().i()) {
                if (c == dpv4) {
                    break;
                }
                n42 += dpv4.b();
            }
            c = dpv3.c();
        }
        final Iterator iterator15 = argh.a.iterator();
        while (iterator15.hasNext()) {
            final long[] a9 = ((dqy)iterator15.next()).a;
            for (int n43 = 0; n43 < a9.length; ++n43) {
                a9[n43] += n42;
            }
        }
        for (final arii arii2 : argh.b) {
            long n44 = arii2.b() + 44L;
            Object o = arii2;
            while (true) {
                final dqa c2 = ((dpv)o).c();
                for (final dpv dpv5 : c2.i()) {
                    if (dpv5 == o) {
                        break;
                    }
                    n44 += dpv5.b();
                }
                if (!(c2 instanceof dpv)) {
                    break;
                }
                o = c2;
            }
            final long[] a10 = arii2.a;
            for (int n45 = 0; n45 < a10.length; ++n45) {
                a10[n45] += n44;
            }
            arii2.a = a10;
        }
        return (dqa)arfw;
    }
}
