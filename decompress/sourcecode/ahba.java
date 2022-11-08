import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.Map;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahba implements ahbp
{
    private final MessageLite a;
    private final boolean b;
    private final aeda c;
    
    private ahba(final aeda c, final MessageLite a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.c = c;
        this.b = (a instanceof agzd);
        this.a = a;
    }
    
    static ahba c(final aeda aeda, final ahbz ahbz, final MessageLite messageLite) {
        return new ahba(aeda, messageLite, null, null, null, null, null, null);
    }
    
    public final int a(final Object o) {
        final ahcc al = aeda.aL(o);
        int e = al.e;
        int i = 0;
        if (e == -1) {
            e = 0;
            for (int j = 0; j < al.b; ++j) {
                final int n = al.c[j];
                final agyc agyc = (agyc)al.d[j];
                final int ac = agym.ac(1);
                e += ac + ac + agym.ad(2, ahco.a(n)) + agym.I(3, agyc);
            }
            al.e = e;
        }
        int n2 = e;
        if (this.b) {
            final agyv k = ahbz.j(o);
            int n3 = 0;
            while (i < k.b.a()) {
                n3 += k.c(k.b.f(i));
                ++i;
            }
            final Iterator iterator = k.b.c().iterator();
            while (iterator.hasNext()) {
                n3 += k.c((Map.Entry)iterator.next());
            }
            n2 = e + n3;
        }
        return n2;
    }
    
    public final int b(final Object o) {
        int hashCode = aeda.aL(o).hashCode();
        if (this.b) {
            hashCode = hashCode * 53 + ahbz.j(o).hashCode();
        }
        return hashCode;
    }
    
    public final Object e() {
        final MessageLite a = this.a;
        if (a instanceof agzi) {
            return ((agzi)a).newMutableInstance();
        }
        return a.newBuilderForType().buildPartial();
    }
    
    public final void f(final Object o) {
        aeda.aO(o);
        ahbz.m(o);
    }
    
    public final void g(final Object o, final Object o2) {
        ahbq.D(o, o2);
        if (this.b) {
            ahbq.B(o, o2);
        }
    }
    
    public final void h(final Object o, final ahbk ahbk, final ExtensionRegistryLite extensionRegistryLite) {
        final aeda c = this.c;
        final Object an = aeda.aN(o);
        final agyv k = ahbz.k(o);
        try {
        Label_0238_Outer:
            while (ahbk.c() != Integer.MAX_VALUE) {
                final int b = ((agyi)ahbk).b;
                if (b == ahco.a) {
                    agzg b2 = null;
                    agyc o2 = null;
                    int i = 0;
                    while (true) {
                        while (ahbk.c() != Integer.MAX_VALUE) {
                            final int b3 = ((agyi)ahbk).b;
                            if (b3 == ahco.c) {
                                i = ahbk.i();
                                b2 = extensionRegistryLite.b(this.a, i);
                            }
                            else if (b3 == ahco.d) {
                                if (b2 != null) {
                                    ahbz.l(ahbk, (Object)b2, extensionRegistryLite, k);
                                }
                                else {
                                    o2 = ahbk.o();
                                }
                            }
                            else {
                                if (ahbk.P()) {
                                    continue Label_0238_Outer;
                                }
                                if (((agyi)ahbk).b != ahco.b) {
                                    throw ahab.b();
                                }
                                if (o2 == null) {
                                    continue Label_0238_Outer;
                                }
                                if (b2 != null) {
                                    final ahaw builderForType = b2.c.newBuilderForType();
                                    final agyh l = o2.l();
                                    builderForType.mergeFrom(l, extensionRegistryLite);
                                    k.n(b2.d, (Object)builderForType.buildPartial());
                                    l.B(0);
                                    continue Label_0238_Outer;
                                }
                                aeda.aJ(an, i, o2);
                                continue Label_0238_Outer;
                            }
                        }
                        continue;
                    }
                }
                boolean b5;
                if (ahco.b(b) == 2) {
                    final agzg b4 = extensionRegistryLite.b(this.a, ahco.a(b));
                    if (b4 != null) {
                        ahbz.l(ahbk, (Object)b4, extensionRegistryLite, k);
                        continue;
                    }
                    b5 = c.aI(an, ahbk);
                }
                else {
                    b5 = ahbk.P();
                }
                if (!b5) {
                    break;
                }
            }
            aeda.aM(o, (ahcc)an);
        }
        finally {
            aeda.aM(o, (ahcc)an);
            while (true) {}
        }
    }
    
    public final void i(final Object o, final byte[] array, int i, final int n, final agxq agxq) {
        final agzi agzi = (agzi)o;
        ahcc unknownFields;
        if ((unknownFields = agzi.unknownFields) == ahcc.a) {
            unknownFields = ahcc.c();
            agzi.unknownFields = unknownFields;
        }
        final agyv e = ((agzd)o).e();
        agzg agzg = null;
        while (i < n) {
            i = ahbz.H(array, i, agxq);
            final int a = agxq.a;
            if (a != ahco.a) {
                if (ahco.b(a) == 2) {
                    agzg = agxq.d.b(this.a, ahco.a(a));
                    if (agzg != null) {
                        i = ahbz.t(ahbh.a.a((Class)agzg.c.getClass()), array, i, n, agxq);
                        e.n(agzg.d, agxq.c);
                    }
                    else {
                        i = ahbz.G(a, array, i, n, unknownFields, agxq);
                    }
                }
                else {
                    i = ahbz.N(a, array, i, n, agxq);
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
                    i = ahbz.H(array, i, agxq);
                    final int a3 = agxq.a;
                    final int b = ahco.b(a3);
                    final int a4 = ahco.a(a3);
                    if (a4 != 2) {
                        if (a4 == 3) {
                            if (agzg != null) {
                                i = ahbz.t(ahbh.a.a((Class)agzg.c.getClass()), array, i, n, agxq);
                                e.n(agzg.d, agxq.c);
                                continue;
                            }
                            if (b == 2) {
                                i = ahbz.q(array, i, agxq);
                                o2 = agxq.c;
                                continue;
                            }
                        }
                    }
                    else if (b == 0) {
                        i = ahbz.H(array, i, agxq);
                        a2 = agxq.a;
                        agzg = agxq.d.b(this.a, a2);
                        continue;
                    }
                    n2 = i;
                    if (a3 == ahco.b) {
                        break;
                    }
                    i = ahbz.N(a3, array, i, n, agxq);
                }
                if (o2 != null) {
                    unknownFields.g(ahco.c(a2, 2), o2);
                }
                i = n2;
            }
        }
        if (i == n) {
            return;
        }
        throw ahab.g();
    }
    
    public final boolean j(final Object o, final Object o2) {
        return aeda.aL(o).equals(aeda.aL(o2)) && (!this.b || ahbz.j(o).equals((Object)ahbz.j(o2)));
    }
    
    public final boolean k(final Object o) {
        return ahbz.j(o).j();
    }
    
    public final void l(final Object o, final aglk aglk) {
        final Iterator e = ahbz.j(o).e();
        while (e.hasNext()) {
            final Map.Entry<agzf, V> entry = e.next();
            final agzf agzf = entry.getKey();
            if (agzf.a() != ahcn.i || agzf.d || agzf.e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ahae) {
                aglk.m(agzf.b, (Object)((ahae)entry).a.getValue().a());
            }
            else {
                aglk.m(agzf.b, entry.getValue());
            }
        }
        final ahcc al = aeda.aL(o);
        for (int i = 0; i < al.b; ++i) {
            aglk.m(ahco.a(al.c[i]), al.d[i]);
        }
    }
}
