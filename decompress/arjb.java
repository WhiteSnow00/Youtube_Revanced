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

public final class arjb implements arjc
{
    private static final Logger e;
    final Set a;
    final Set b;
    final HashMap c;
    final HashMap d;
    private arjd f;
    
    static {
        e = Logger.getLogger(arjb.class.getName());
    }
    
    public arjb() {
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
    
    protected static long b(final ariy ariy) {
        final List e = ariy.e();
        if (e.size() > 0) {
            final Iterator iterator = e.iterator();
            double n = 0.0;
            while (iterator.hasNext()) {
                n += ((ariu)iterator.next()).b;
            }
            final double n2 = (double)ariy.j().b;
            Double.isNaN(n2);
            return Math.round(n * n2);
        }
        return ariy.a();
    }
    
    public static final long d(final ariv ariv) {
        long n = ariv.d.iterator().next().j().b;
        final Iterator iterator = ariv.d.iterator();
        while (iterator.hasNext()) {
            n = a(((ariy)iterator.next()).j().b, n);
        }
        return n;
    }
    
    @Override
    public final dqd c(final ariv ariv) {
        if (this.f == null) {
            this.f = new arjd(ariv);
        }
        final Logger e = arjb.e;
        final Level fine = Level.FINE;
        final String concat = "Creating movie ".concat(ariv.toString());
        String s = "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder";
        e.logp(fine, "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder", "build", concat);
        final Iterator iterator = ariv.d.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final ariy ariy = (ariy)iterator.next();
            final List l = ariy.l();
            final List list = this.c.put(ariy, l);
            final int size = l.size();
            final long[] array = new long[size];
            while (i < size) {
                array[i] = l.get(i).a();
                ++i;
            }
            this.d.put(ariy, array);
        }
        Object o = new ariq();
        final LinkedList list2 = new LinkedList();
        list2.add("isom");
        list2.add("iso2");
        list2.add("avc1");
        ((ariq)o).w((dpy)new dqi("isom", 0L, (List)list2));
        final HashMap hashMap = new HashMap();
        final Iterator iterator2 = ariv.d.iterator();
        while (true) {
            int j = 0;
            if (!iterator2.hasNext()) {
                break;
            }
            final ariy ariy2 = (ariy)iterator2.next();
            final arjd f = this.f;
            final Iterator iterator3 = ((ariv)f.b).d.iterator();
            double n = 0.0;
            while (iterator3.hasNext()) {
                final ariy ariy3 = (ariy)iterator3.next();
                final double n2 = (double)(ariy3.a() / ariy3.j().b);
                if (n >= n2) {
                    continue;
                }
                n = n2;
            }
            final int a = f.a;
            int min;
            if ((min = Math.min((int)Math.ceil(n / 2.0) - 1, ariy2.l().size())) <= 0) {
                min = 1;
            }
            final long[] array2 = new long[min];
            Arrays.fill(array2, -1L);
            array2[0] = 1L;
            final long[] m = ariy2.m();
            final int length = m.length;
            int n3 = 0;
            long n4 = 0L;
            while (j < length) {
                final long n5 = m[j];
                final long n6 = n4 / ariy2.j().b;
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
                    n13 = ariy2.l().size();
                }
                else {
                    n13 = array2[n12] - 1L;
                }
                array3[n10] = aqvs.o(n13 - (n11 - 1L));
            }
            hashMap.put(ariy2, array3);
        }
        Object o2 = new dqq();
        final dqr dqr = new dqr();
        dqr.k(ariv.c);
        dqr.m(ariv.b);
        dqr.d = ariv.a;
        final long d = d(ariv);
        final Iterator iterator4 = ariv.d.iterator();
        long n14 = 0L;
        while (iterator4.hasNext()) {
            final ariy ariy4 = (ariy)iterator4.next();
            final long n15 = b(ariy4) * d / ariy4.j().b;
            if (n15 <= n14) {
                continue;
            }
            n14 = n15;
        }
        dqr.l(n14);
        dqr.c = d;
        final Iterator iterator5 = ariv.d.iterator();
        long i2 = 0L;
        while (iterator5.hasNext()) {
            final ariy ariy5 = (ariy)iterator5.next();
            if (i2 < ariy5.j().i) {
                i2 = ariy5.j().i;
            }
        }
        dqr.e = i2 + 1L;
        ((ariq)o2).w((dpy)dqr);
        final Iterator iterator6 = ariv.d.iterator();
        arjb arjb = this;
        Iterator iterator16;
        ariq ariq4;
        String s4;
        for (Iterator iterator7 = iterator6; iterator7.hasNext(); iterator7 = iterator16, s = s4, o = ariq4) {
            final ariy ariy6 = (ariy)iterator7.next();
            final drj drj = new drj();
            final drk drk = new drk();
            drk.m(true);
            drk.n(true);
            ((ario)drk).r = (((ario)drk).r() | 0x4);
            ((ario)drk).r = (((ario)drk).r() | 0x8);
            drk.e = ariy6.j().e;
            ariy6.j();
            drk.c = 0;
            drk.k(ariy6.j().d);
            drk.l(b(ariy6) * d(ariv) / ariy6.j().b);
            drk.g = ariy6.j().g;
            drk.f = ariy6.j().f;
            drk.b = ariy6.j().j;
            drk.o(ariy6.j().c);
            drk.a = ariy6.j().i;
            drk.d = ariy6.j().h;
            ((ariq)drj).w((dpy)drk);
            ariy6.e();
            Iterator iterator10;
            String s2;
            ariq ariq2;
            ariq ariq3;
            if (ariy6.e().size() > 0) {
                final dqh dqh = new dqh();
                final ArrayList a3 = new ArrayList();
                final Iterator iterator8 = ariy6.e().iterator();
                int q = 0;
                while (iterator8.hasNext()) {
                    final ariu ariu = (ariu)iterator8.next();
                    final double b = ariu.b;
                    long n16 = ariv.d.iterator().next().j().b;
                    final Iterator iterator9 = ariv.d.iterator();
                    while (iterator9.hasNext()) {
                        n16 = ariv.a(((ariy)iterator9.next()).j().b, n16);
                    }
                    final double n17 = (double)n16;
                    Double.isNaN(n17);
                    final long round = Math.round(b * n17);
                    final long n18 = ariu.c * ariy6.j().b / ariu.a;
                    if (round >= 4294967296L || n18 > 2147483647L) {
                        q = 1;
                    }
                    a3.add(new dqg(dqh, round, n18, ariu.d));
                }
                final ariq ariq = (ariq)o2;
                iterator10 = iterator7;
                s2 = s;
                dqh.a = a3;
                ((ario)dqh).q = q;
                ariq2 = new arin((byte[])null);
                ariq2.w((dpy)dqh);
                ariq3 = ariq;
            }
            else {
                final Iterator iterator11 = iterator7;
                s2 = s;
                ariq2 = null;
                ariq3 = (ariq)o2;
                iterator10 = iterator11;
            }
            ((ariq)drj).w((dpy)ariq2);
            final dqn dqn = new dqn();
            ((ariq)drj).w((dpy)dqn);
            final dqo dqo = new dqo();
            dqo.a = ariy6.j().d;
            dqo.b = ariy6.j().c;
            dqo.d = ariy6.a();
            dqo.c = ariy6.j().b;
            dqo.e = ariy6.j().a;
            ((ariq)dqn).w((dpy)dqo);
            final dql dql = new dql();
            ((ariq)dqn).w((dpy)dql);
            dql.a = ariy6.k();
            final dqp dqp = new dqp();
            if (ariy6.k().equals("vide")) {
                ((ariq)dqp).w((dpy)new drn());
            }
            else if (ariy6.k().equals("soun")) {
                ((ariq)dqp).w((dpy)new dra());
            }
            else if (ariy6.k().equals("text")) {
                ((ariq)dqp).w((dpy)new dqs());
            }
            else if (ariy6.k().equals("subt")) {
                ((ariq)dqp).w((dpy)new drf());
            }
            else if (ariy6.k().equals("hint")) {
                ((ariq)dqp).w((dpy)new dqm());
            }
            else if (ariy6.k().equals("sbtl")) {
                ((ariq)dqp).w((dpy)new dqs());
            }
            final arin arin = new arin();
            final dqf dqf = new dqf();
            arin.w((dpy)dqf);
            final dqe dqe = new dqe();
            ((ario)dqe).r = 1;
            ((ariq)dqf).w((dpy)dqe);
            ((ariq)dqp).w((dpy)arin);
            final dqx dqx = new dqx();
            ((ariq)dqx).w((dpy)ariy6.i());
            final ArrayList b2 = new ArrayList();
            final long[] m2 = ariy6.m();
            final int length2 = m2.length;
            drh drh = null;
            for (final long n20 : m2) {
                if (drh != null && drh.b == n20) {
                    ++drh.a;
                }
                else {
                    drh = new drh(1L, n20);
                    b2.add(drh);
                }
            }
            final dri dri = new dri();
            dri.b = b2;
            ((ariq)dqx).w((dpy)dri);
            final List d2 = ariy6.d();
            if (d2 != null && !d2.isEmpty()) {
                final dqc dqc = new dqc();
                dqc.a = d2;
                ((ariq)dqx).w((dpy)dqc);
            }
            final long[] h = ariy6.h();
            if (h != null && h.length > 0) {
                final drg drg = new drg();
                drg.a = h;
                ((ariq)dqx).w((dpy)drg);
            }
            if (ariy6.f() != null && !ariy6.f().isEmpty()) {
                final dqu dqu = new dqu();
                dqu.a = ariy6.f();
                ((ariq)dqx).w((dpy)dqu);
            }
            final int[] array4 = (int[])hashMap.get(ariy6);
            final dqz dqz = new dqz();
            dqz.a = new LinkedList();
            long n21 = -2147483648L;
            int n22 = 0;
            final dpy dpy = (dpy)dqp;
            while (n22 < array4.length) {
                final long n23 = array4[n22];
                if (n21 != n23) {
                    dqz.a.add(new dqy((long)(n22 + 1), n23, 1L));
                    n21 = array4[n22];
                }
                ++n22;
            }
            ((ariq)dqx).w((dpy)dqz);
            final dqw dqw = new dqw();
            arjb = this;
            dqw.a = arjb.d.get(ariy6);
            ((ariq)dqx).w((dpy)dqw);
            final int[] array5 = (int[])hashMap.get(ariy6);
            final drb drb = new drb();
            arjb.a.add(drb);
            final long[] a4 = new long[array5.length];
            final Logger e2 = arjb.e;
            final boolean loggable = e2.isLoggable(Level.FINE);
            final String s3 = "Calculating chunk offsets for track_";
            if (loggable) {
                final Level fine2 = Level.FINE;
                final long i3 = ariy6.j().i;
                final StringBuilder sb = new StringBuilder(56);
                sb.append("Calculating chunk offsets for track_");
                sb.append(i3);
                e2.logp(fine2, s2, "createStco", sb.toString());
            }
            int n24 = 0;
            long n25 = 0L;
            while (n24 < array5.length) {
                final Logger e3 = arjb.e;
                if (e3.isLoggable(Level.FINER)) {
                    final Level finer = Level.FINER;
                    final long i4 = ariy6.j().i;
                    final StringBuilder sb2 = new StringBuilder(74);
                    sb2.append(s3);
                    sb2.append(i4);
                    sb2.append(" chunk ");
                    sb2.append(n24);
                    e3.logp(finer, s2, "createStco", sb2.toString());
                }
                final Iterator iterator12 = ariv.d.iterator();
                arjb arjb2 = arjb;
                final Iterator iterator13 = iterator12;
                while (iterator13.hasNext()) {
                    final ariy ariy7 = (ariy)iterator13.next();
                    final Logger e4 = arjb.e;
                    if (e4.isLoggable(Level.FINEST)) {
                        final Level finest = Level.FINEST;
                        final long i5 = ariy7.j().i;
                        final StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Adding offsets of track_");
                        sb3.append(i5);
                        e4.logp(finest, s2, "createStco", sb3.toString());
                    }
                    final int[] array6 = (int[])hashMap.get(ariy7);
                    int n26 = 0;
                    long n27 = 0L;
                    while (n26 < n24) {
                        n27 += array6[n26];
                        ++n26;
                    }
                    if (ariy7 == ariy6) {
                        a4[n24] = n25;
                    }
                    for (int o3 = aqvs.o(n27); o3 < array6[n24] + n27; ++o3) {
                        n25 += ((long[])this.d.get(ariy7))[o3];
                    }
                    arjb2 = this;
                }
                ++n24;
                arjb = arjb2;
            }
            drb.a = a4;
            ((ariq)dqx).w((dpy)drb);
            final HashMap hashMap2 = new HashMap();
            for (final Map.Entry<arkh, V> entry : ariy6.g().entrySet()) {
                final String a5 = entry.getKey().a();
                List list3;
                if ((list3 = (List)hashMap2.get(a5)) == null) {
                    list3 = new ArrayList();
                    hashMap2.put(a5, list3);
                }
                list3.add(entry.getKey());
            }
            for (final Map.Entry<K, List> entry2 : hashMap2.entrySet()) {
                final arkl arkl = new arkl();
                final String a6 = (String)entry2.getKey();
                arkl.a = entry2.getValue();
                final arkn arkn = new arkn();
                arkn.a = a6;
                arkm arkm = null;
                for (int n28 = 0; n28 < ariy6.l().size(); ++n28) {
                    int n29 = 0;
                    int n30 = 0;
                    while (n29 < entry2.getValue().size()) {
                        if (Arrays.binarySearch((long[])ariy6.g().get(entry2.getValue().get(n29)), n28) >= 0) {
                            n30 = n29 + 1;
                        }
                        ++n29;
                    }
                    if (arkm != null && arkm.b == n30) {
                        ++arkm.a;
                    }
                    else {
                        arkm = new arkm(1L, n30);
                        arkn.b.add(arkm);
                    }
                }
                ((ariq)dqx).w((dpy)arkl);
                ((ariq)dqx).w((dpy)arkn);
            }
            if (ariy6 instanceof arjm) {
                final arjm arjm = (arjm)ariy6;
                final int[] array7 = (int[])hashMap.get(ariy6);
                final arld arld = new arld();
                arld.d = "cenc";
                ((ario)arld).r = 1;
                final List n31 = arjm.n();
                if (arjm.o()) {
                    final int size2 = n31.size();
                    final short[] array8 = new short[size2];
                    for (int n32 = 0; n32 < size2; ++n32) {
                        array8[n32] = (short)((arlx)n31.get(n32)).a();
                    }
                    arld.b = Arrays.copyOf(array8, size2);
                }
                else {
                    arld.a = 8;
                    arld.c = arjm.l().size();
                }
                int n33 = 8;
                final arlc arlc = new arlc();
                final arjo arjo = new arjo();
                if (arjm.o()) {
                    ((ario)arjo).r = (((ario)arjo).r() | 0x2);
                }
                else {
                    ((ario)arjo).r = (((ario)arjo).r() & 0xFFFFFD);
                }
                arjo.d = n31;
                final long b3 = ((arim)arjo).b();
                int n34;
                if (arjo.k()) {
                    final int length3 = arjo.c.length;
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
                        n35 += ((arlx)n31.get(n37)).a();
                    }
                    ++n36;
                }
                arlc.a = a7;
                ((ariq)dqx).w((dpy)arld);
                ((ariq)dqx).w((dpy)arlc);
                ((ariq)dqx).w((dpy)arjo);
                arjb.b.add(arlc);
            }
            if (ariy6.b() != null) {
                ((ariq)dqx).w((dpy)ariy6.b());
            }
            ((ariq)dpy).w((dpy)dqx);
            ((ariq)dqn).w(dpy);
            ariq3.w((dpy)drj);
            iterator16 = iterator10;
            ariq4 = (ariq)o;
            s4 = s2;
            o2 = ariq3;
        }
        ((ariq)o).w((dpy)o2);
        final Iterator iterator17 = arky.c(o2, "trak/mdia/minf/stbl/stsz", false).iterator();
        long n39 = 0L;
        while (iterator17.hasNext()) {
            final long[] a8 = ((dqw)iterator17.next()).a;
            final int length4 = a8.length;
            int n40 = 0;
            long n41 = 0L;
            while (n40 < length4) {
                n41 += a8[n40];
                ++n40;
            }
            n39 += n41;
        }
        Object c = new arja(this, ariv, hashMap, n39);
        ((ariq)o).w((dpy)c);
        long n42 = 16L;
        while (c instanceof dpy) {
            final dpy dpy2 = (dpy)c;
            for (final dpy dpy3 : dpy2.c().i()) {
                if (c == dpy3) {
                    break;
                }
                n42 += dpy3.b();
            }
            c = dpy2.c();
        }
        final Iterator iterator19 = arjb.a.iterator();
        while (iterator19.hasNext()) {
            final long[] a9 = ((drb)iterator19.next()).a;
            for (int n43 = 0; n43 < a9.length; ++n43) {
                a9[n43] += n42;
            }
        }
        for (final arlc arlc2 : arjb.b) {
            long n44 = ((arim)arlc2).b() + 44L;
            Object o4 = arlc2;
            while (true) {
                final dqd c2 = ((dpy)o4).c();
                for (final dpy dpy4 : c2.i()) {
                    if (dpy4 == o4) {
                        break;
                    }
                    n44 += dpy4.b();
                }
                if (!(c2 instanceof dpy)) {
                    break;
                }
                o4 = c2;
            }
            final long[] a10 = arlc2.a;
            for (int n45 = 0; n45 < a10.length; ++n45) {
                a10[n45] += n44;
            }
            arlc2.a = a10;
        }
        return (dqd)o;
    }
}
