import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;
import j$.util.stream.IntStream$_CC;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addz implements asjm
{
    public final ziy a;
    
    public addz(final ziy a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    @Override
    public final void a(Object c) {
        final ziy a = this.a;
        final tmh tmh = (tmh)c;
        if (((ArrayList)a.a).isEmpty()) {
            a.am(tmh);
            return;
        }
        if (Math.abs(tmh.b - ((ArrayList)a.a).get(0).b) >= ((vai)a.d).h(45371410L) * 1000L) {
            c = a.c;
            final Object a2 = a.a;
            final Object b = a.b;
            final boolean f = ((vai)a.d).f(45371413L);
            final long h = ((vai)a.d).h(45371414L);
            final long d = ((oby)b).d();
            final ahaz builder = ((ahbh)amqq.a).createBuilder();
            int f2 = ((List<tmh>)a2).get(0).a;
            int i = ((List<tmh>)a2).get(0).a;
            final Iterator<tmh> iterator = ((List<tmh>)a2).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final tmh tmh2 = iterator.next();
                f2 = Math.min(f2, tmh2.a);
                i = Math.max(i, tmh2.a);
                n += tmh2.a;
            }
            final long b2 = ((List<tmh>)a2).get(0).b;
            builder.copyOnWrite();
            final amqq amqq = (amqq)builder.instance;
            amqq.b |= 0x2;
            amqq.c = b2;
            final long b3 = ((tmh)agpc.V((Iterable)a2)).b;
            builder.copyOnWrite();
            final amqq amqq2 = (amqq)builder.instance;
            amqq2.b |= 0x4;
            amqq2.d = b3;
            final long e = ((List)a2).size();
            builder.copyOnWrite();
            final amqq amqq3 = (amqq)builder.instance;
            amqq3.b |= 0x8;
            amqq3.e = e;
            builder.copyOnWrite();
            final amqq amqq4 = (amqq)builder.instance;
            amqq4.b |= 0x10;
            amqq4.f = f2;
            builder.copyOnWrite();
            final amqq amqq5 = (amqq)builder.instance;
            amqq5.b |= 0x80;
            amqq5.i = i;
            final int g = n / ((List)a2).size();
            builder.copyOnWrite();
            final amqq amqq6 = (amqq)builder.instance;
            amqq6.b |= 0x20;
            amqq6.g = g;
            if (f || h > 0L) {
                final ArrayList list = new ArrayList();
                list.ensureCapacity(((List)a2).size());
                final Iterator<tmh> iterator2 = ((List<tmh>)a2).iterator();
                while (iterator2.hasNext()) {
                    list.add(iterator2.next().a);
                }
                if (f) {
                    adkp.I(true, (Object)"Quantile scale must be positive");
                    aeuz.o(1, 2);
                    final double[] ag = afsk.aG((Collection)list);
                    final int length = ag.length;
                    adkp.I(length > 0, (Object)"Cannot calculate quantiles of an empty dataset");
                    double n2;
                    if (aeuz.r(ag)) {
                        n2 = Double.NaN;
                    }
                    else {
                        final int n3 = length - 1;
                        final RoundingMode down = RoundingMode.DOWN;
                        final long n4 = n3;
                        final int n5 = (int)aeuz.y(n4, 2L, down);
                        aeuz.q(n5, ag, 0, n3);
                        final long n6 = n5;
                        final int n7 = (int)(n4 - (n6 + n6));
                        if (n7 == 0) {
                            n2 = ag[n5];
                        }
                        else {
                            final int n8 = n5 + 1;
                            aeuz.q(n8, ag, n8, n3);
                            n2 = aeuz.n(ag[n5], ag[n8], (double)n7, 2.0);
                        }
                    }
                    builder.copyOnWrite();
                    final amqq amqq7 = (amqq)builder.instance;
                    amqq7.b |= 0x40;
                    amqq7.h = (int)n2;
                }
                if (h > 0L) {
                    final int n9 = (int)h;
                    final afeq afeq = (afeq)IntStream$_CC.rangeClosed(0, n9).boxed().collect(afci.a);
                    adkp.I(n9 > 0, (Object)"Quantile scale must be positive");
                    final int[] j = afwm.J((Collection)afeq);
                    for (int length2 = j.length, k = 0; k < length2; ++k) {
                        aeuz.o(j[k], n9);
                    }
                    final int length3 = j.length;
                    adkp.I(length3 > 0, (Object)"Indexes must be a non empty array");
                    final double[] ag2 = afsk.aG((Collection)list);
                    adkp.I(ag2.length > 0, (Object)"Cannot calculate quantiles of an empty dataset");
                    Map<Object, Object> map;
                    if (aeuz.r(ag2)) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (int l = 0; l < length3; ++l) {
                            linkedHashMap.put(j[l], Double.NaN);
                        }
                        map = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
                    }
                    else {
                        final int[] array = new int[length3];
                        final int[] array2 = new int[length3];
                        final int[] array3 = new int[length3 + length3];
                        int n10 = 0;
                        int n11 = 0;
                        final int n12 = n9;
                        while (n11 < j.length) {
                            final long n13 = j[n11];
                            final int length4 = ag2.length;
                            final long n14 = n12;
                            final RoundingMode down2 = RoundingMode.DOWN;
                            final long n15 = n13 * (length4 - 1);
                            final int n16 = (int)aeuz.y(n15, n14, down2);
                            array[n11] = n16;
                            final int n17 = (int)(n15 - n16 * n14);
                            array2[n11] = n17;
                            array3[n10] = n16;
                            final int n18 = ++n10;
                            if (n17 != 0) {
                                array3[n18] = n16 + 1;
                                n10 = n18 + 1;
                            }
                            ++n11;
                        }
                        Arrays.sort(array3, 0, n10);
                        aeuz.p(array3, 0, n10 - 1, ag2, 0, ag2.length - 1);
                        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (int n19 = 0; n19 < j.length; ++n19) {
                            final int n20 = array[n19];
                            final int n21 = array2[n19];
                            if (n21 == 0) {
                                linkedHashMap2.put(j[n19], ag2[n20]);
                            }
                            else {
                                linkedHashMap2.put(j[n19], aeuz.n(ag2[n20], ag2[n20 + 1], (double)n21, (double)n12));
                            }
                        }
                        map = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap2);
                    }
                    for (int size = ((List)afeq).size(), n22 = 0; n22 < size; ++n22) {
                        final Double n23 = map.get(((List)afeq).get(n22));
                        if (n23 != null) {
                            final ahaz builder2 = ((ahbh)amqp.a).createBuilder();
                            final int intValue = n23.intValue();
                            builder2.copyOnWrite();
                            final amqp amqp = (amqp)builder2.instance;
                            amqp.b |= 0x1;
                            amqp.c = intValue;
                            builder.copyOnWrite();
                            final amqq amqq8 = (amqq)builder.instance;
                            final amqp amqp2 = (amqp)builder2.build();
                            amqp2.getClass();
                            final ahbx m = amqq8.j;
                            if (!m.c()) {
                                amqq8.j = ahbh.mutableCopy(m);
                            }
                            amqq8.j.add((Object)amqp2);
                        }
                    }
                }
            }
            final long d2 = ((oby)b).d();
            builder.copyOnWrite();
            final amqq amqq9 = (amqq)builder.instance;
            amqq9.b |= 0x100;
            amqq9.k = (int)(d2 - d);
            ((atiy)c).tu((Object)builder.build());
            a.am(tmh);
            return;
        }
        ((ArrayList)a.a).add(tmh);
        if (((vai)a.d).T() > 0L && ((ArrayList)a.a).size() >= ((vai)a.d).T() && !((ArrayList)a.a).isEmpty()) {
            if (((ArrayList)a.a).size() != 1) {
                ((ArrayList)a.a).remove(0);
            }
        }
    }
}
