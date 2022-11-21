import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.Map;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class aher implements ahfg
{
    private final MessageLite a;
    private final boolean b;
    private final adzw c;
    
    private aher(final adzw c, final MessageLite a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = (a instanceof ahcu);
        this.a = a;
    }
    
    static aher c(final adzw adzw, final agsk agsk, final MessageLite messageLite) {
        return new aher(adzw, messageLite, null, null, null, null);
    }
    
    public final int a(final Object o) {
        final ahfs au = adzw.aU(o);
        final int e = au.e;
        int i = 0;
        int e2 = e;
        if (e == -1) {
            e2 = 0;
            for (int j = 0; j < au.b; ++j) {
                final int a = ahge.a(au.c[j]);
                final int k = ahcd.I(3, (ahbt)au.d[j]);
                final int ac = ahcd.ac(1);
                e2 += ac + ac + ahcd.ad(2, a) + k;
            }
            au.e = e2;
        }
        int n = e2;
        if (this.b) {
            final ahcm p = agsk.p(o);
            int n2 = 0;
            while (i < p.b.a()) {
                n2 += p.c(p.b.f(i));
                ++i;
            }
            final Iterator iterator = p.b.c().iterator();
            while (iterator.hasNext()) {
                n2 += p.c((Map.Entry)iterator.next());
            }
            n = e2 + n2;
        }
        return n;
    }
    
    public final int b(final Object o) {
        int hashCode = adzw.aU(o).hashCode();
        if (this.b) {
            hashCode = hashCode * 53 + agsk.p(o).hashCode();
        }
        return hashCode;
    }
    
    public final Object e() {
        final MessageLite a = this.a;
        if (a instanceof ahcz) {
            return ((ahcz)a).newMutableInstance();
        }
        return a.newBuilderForType().buildPartial();
    }
    
    public final void f(final Object o) {
        adzw.aX(o);
        agsk.s(o);
    }
    
    public final void g(final Object o, final Object o2) {
        ahfh.D(o, o2);
        if (this.b) {
            ahfh.B(o, o2);
        }
    }
    
    public final void h(final Object o, final ahfb ahfb, final ExtensionRegistryLite extensionRegistryLite) {
        final adzw c = this.c;
        final Object aw = adzw.aW(o);
        final ahcm q = agsk.q(o);
        try {
        Label_0238_Outer:
            while (ahfb.c() != Integer.MAX_VALUE) {
                final int b = ((ahbz)ahfb).b;
                if (b == ahge.a) {
                    ahcx b2 = null;
                    ahbt o2 = null;
                    int i = 0;
                    while (true) {
                        while (ahfb.c() != Integer.MAX_VALUE) {
                            final int b3 = ((ahbz)ahfb).b;
                            if (b3 == ahge.c) {
                                i = ahfb.i();
                                b2 = extensionRegistryLite.b(this.a, i);
                            }
                            else if (b3 == ahge.d) {
                                if (b2 != null) {
                                    agsk.r(ahfb, (Object)b2, extensionRegistryLite, q);
                                }
                                else {
                                    o2 = ahfb.o();
                                }
                            }
                            else {
                                if (ahfb.P()) {
                                    continue Label_0238_Outer;
                                }
                                if (((ahbz)ahfb).b != ahge.b) {
                                    throw ahds.b();
                                }
                                if (o2 == null) {
                                    continue Label_0238_Outer;
                                }
                                if (b2 != null) {
                                    final ahen builderForType = b2.c.newBuilderForType();
                                    final ahby l = o2.l();
                                    builderForType.mergeFrom(l, extensionRegistryLite);
                                    q.n(b2.d, (Object)builderForType.buildPartial());
                                    l.B(0);
                                    continue Label_0238_Outer;
                                }
                                adzw.aS(aw, i, o2);
                                continue Label_0238_Outer;
                            }
                        }
                        continue;
                    }
                }
                boolean b5;
                if (ahge.b(b) == 2) {
                    final ahcx b4 = extensionRegistryLite.b(this.a, ahge.a(b));
                    if (b4 != null) {
                        agsk.r(ahfb, (Object)b4, extensionRegistryLite, q);
                        continue;
                    }
                    b5 = c.aR(aw, ahfb);
                }
                else {
                    b5 = ahfb.P();
                }
                if (!b5) {
                    break;
                }
            }
            adzw.aV(o, (ahfs)aw);
        }
        finally {
            adzw.aV(o, (ahfs)aw);
            while (true) {}
        }
    }
    
    public final void i(final Object o, final byte[] array, int i, final int n, final ahbh ahbh) {
        final ahcz ahcz = (ahcz)o;
        ahfs unknownFields;
        if ((unknownFields = ahcz.unknownFields) == ahfs.a) {
            unknownFields = ahfs.c();
            ahcz.unknownFields = unknownFields;
        }
        final ahcm e = ((ahcu)o).e();
        ahcx ahcx = null;
        while (i < n) {
            i = agsk.O(array, i, ahbh);
            final int a = ahbh.a;
            if (a != ahge.a) {
                if (ahge.b(a) == 2) {
                    ahcx = ahbh.d.b(this.a, ahge.a(a));
                    if (ahcx != null) {
                        i = agsk.A(ahey.a.a((Class)ahcx.c.getClass()), array, i, n, ahbh);
                        e.n(ahcx.d, ahbh.c);
                    }
                    else {
                        i = agsk.N(a, array, i, n, unknownFields, ahbh);
                    }
                }
                else {
                    i = agsk.U(a, array, i, n, ahbh);
                }
            }
            else {
                int a2 = 0;
                Object o2 = null;
                int n2;
                while (true) {
                    n2 = i;
                    if (i >= n) {
                        break;
                    }
                    i = agsk.O(array, i, ahbh);
                    final int a3 = ahbh.a;
                    final int a4 = ahge.a(a3);
                    final int b = ahge.b(a3);
                    if (a4 != 2) {
                        if (a4 == 3) {
                            if (ahcx != null) {
                                i = agsk.A(ahey.a.a((Class)ahcx.c.getClass()), array, i, n, ahbh);
                                e.n(ahcx.d, ahbh.c);
                                continue;
                            }
                            if (b == 2) {
                                i = agsk.x(array, i, ahbh);
                                o2 = ahbh.c;
                                continue;
                            }
                        }
                    }
                    else if (b == 0) {
                        i = agsk.O(array, i, ahbh);
                        a2 = ahbh.a;
                        ahcx = ahbh.d.b(this.a, a2);
                        continue;
                    }
                    n2 = i;
                    if (a3 == ahge.b) {
                        break;
                    }
                    i = agsk.U(a3, array, i, n, ahbh);
                }
                if (o2 != null) {
                    unknownFields.g(ahge.c(a2, 2), o2);
                }
                i = n2;
            }
        }
        if (i == n) {
            return;
        }
        throw ahds.g();
    }
    
    public final boolean j(final Object o, final Object o2) {
        return adzw.aU(o).equals(adzw.aU(o2)) && (!this.b || agsk.p(o).equals((Object)agsk.p(o2)));
    }
    
    public final boolean k(final Object o) {
        return agsk.p(o).j();
    }
    
    public final void l(final Object o, final agpd agpd) {
        final Iterator e = agsk.p(o).e();
        while (e.hasNext()) {
            final Map.Entry<ahcw, V> entry = e.next();
            final ahcw ahcw = entry.getKey();
            if (ahcw.a() != ahgd.i || ahcw.d || ahcw.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ahdv) {
                agpd.o(ahcw.b, ((ahdv)entry).a.getValue().a());
            }
            else {
                agpd.o(ahcw.b, entry.getValue());
            }
        }
        final ahfs au = adzw.aU(o);
        for (int i = 0; i < au.b; ++i) {
            agpd.o(ahge.a(au.c[i]), au.d[i]);
        }
    }
}
