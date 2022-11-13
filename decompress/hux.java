import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hux implements asjr
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public hux(final asjr a, final asjr b, final asjr c, final asjr d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public hux(final fzw b, final String d, final vfp c, final fls a, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public hux(final iqb b, final ajhp c, final List d, final imt a, final int e) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public final Object a(Object o) {
        final int e = this.e;
        if (e == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final Object c = this.c;
            final Object d = this.d;
            final hvc hvc = (hvc)o;
            if (hvc instanceof hvf) {
                o = ((asjr)a).a((Object)hvc);
            }
            else if (hvc instanceof hvg) {
                o = ((asjr)b).a((Object)hvc);
            }
            else if (hvc instanceof hvd) {
                o = ((asjr)c).a((Object)hvc);
            }
            else {
                if (!(hvc instanceof hve)) {
                    throw new AssertionError((Object)"unrecognized arrow state type: ".concat(String.valueOf(String.valueOf(hvc))));
                }
                o = ((asjr)d).a((Object)hvc);
            }
            return o;
        }
        final int n = 1;
        if (e != 1) {
            final Object b2 = this.b;
            Object o2 = this.c;
            final Object d2 = this.d;
            final Object a2 = this.a;
            final afeq afeq = (afeq)o;
            final int n2 = 0;
            int i = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            boolean b3;
            boolean b4;
            while (true) {
                b3 = (n4 != 0);
                b4 = (n5 != 0);
                if (afeq.size() <= n3) {
                    break;
                }
                if (n4 != 0) {
                    b3 = (n4 != 0);
                    if (b4 = (n5 != 0)) {
                        break;
                    }
                }
                final vfn vfn = (vfn)afeq.get(n3);
                if (vfn instanceof apyn || vfn instanceof alzj) {
                    n4 = (true ? 1 : 0);
                }
                if (vfn instanceof apys || vfn instanceof amar) {
                    n5 = (true ? 1 : 0);
                }
                if (n4 && n5) {
                    b3 = (n4 != 0);
                    b4 = (n5 != 0);
                    break;
                }
                ++n3;
            }
            final boolean b5 = o2 == ajhp.b || (!b3 && o2 == ajhp.c) || (!b4 && o2 == ajhp.d);
            if (b5) {
                o2 = ajhp.b;
            }
            final boolean b6 = o2 == ajhp.d || b5;
            int n6 = n;
            if (o2 != ajhp.c) {
                if (b5) {
                    n6 = n;
                }
                else {
                    n6 = 0;
                }
            }
            final iqb iqb = (iqb)b2;
            if (iqb.f.ax()) {
                final int size = ((List)afeq).size();
                int n7 = 0;
                while (i < size) {
                    final vfn vfn2 = (vfn)((List)afeq).get(i);
                    final aeyo a3 = aeyo.a;
                    Object o3;
                    if (vfn2 instanceof amar && b6) {
                        o3 = iqb.b(iqh.a, aezp.k((Object)iqy.a(n7, (amar)vfn2)), (imt)a2);
                    }
                    else {
                        o3 = a3;
                        if (vfn2 instanceof alzj) {
                            o3 = a3;
                            if (n6 != 0) {
                                o3 = iqb.b(iqh.b, aezp.k((Object)iqt.a(n7, (alzj)vfn2)), (imt)a2);
                            }
                        }
                    }
                    int n8 = n7;
                    if (((aezp)o3).h()) {
                        ((List<Object>)d2).add(((aezp)o3).c());
                        n8 = n7 + 1;
                    }
                    ++i;
                    n7 = n8;
                }
            }
            else {
                for (int size2 = ((List)afeq).size(), j = n2; j < size2; ++j) {
                    final vfn vfn3 = (vfn)((List)afeq).get(j);
                    if (vfn3 instanceof apys && b6) {
                        final aezp b7 = iqb.b(iqh.a, aezp.j((Object)vfn3), (imt)a2);
                        if (b7.h()) {
                            ((List<Object>)d2).add(b7.c());
                            continue;
                        }
                    }
                    if (vfn3 instanceof apyn && n6 != 0) {
                        final aezp b8 = iqb.b(iqh.b, aezp.j((Object)vfn3), (imt)a2);
                        if (b8.h()) {
                            ((List<Object>)d2).add(b8.c());
                        }
                    }
                }
            }
            return new iqa(afeq.o((Collection)d2), (ajhp)o2, b4, b3);
        }
        final Object b9 = this.b;
        final Object d3 = this.d;
        final Object c2 = this.c;
        final Object a4 = this.a;
        ashn ashn;
        if (((afft)o).contains(d3)) {
            ashn = ashn.t();
        }
        else if (((vai)((fzw)b9).a).ax() ? (((fls)a4).b == 306) : (((fls)a4).b == 156)) {
            ashn = ((vfp)c2).f(glb.J((String)d3));
        }
        else {
            ashn = ((vfp)c2).f(((fls)a4).a);
        }
        return ashn;
    }
}
