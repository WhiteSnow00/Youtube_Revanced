import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekn extends ekg
{
    public ekn() {
        this.a.add(ekr.A);
        this.a.add(ekr.B);
        this.a.add(ekr.C);
        this.a.add(ekr.D);
        this.a.add(ekr.E);
        this.a.add(ekr.F);
        this.a.add(ekr.G);
        this.a.add(ekr.an);
    }
    
    private static eka c(final ekm ekm, final Iterator iterator, final eka eka) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                final eka x = ekm.a((eka)iterator.next()).x((ejq)eka);
                if (x instanceof ejs) {
                    final ejs ejs = (ejs)x;
                    if ("break".equals(ejs.b)) {
                        return eka.f;
                    }
                    if ("return".equals(ejs.b)) {
                        return (eka)ejs;
                    }
                    continue;
                }
            }
        }
        return eka.f;
    }
    
    private static eka d(final ekm ekm, final eka eka, final eka eka2) {
        return c(ekm, eka.l(), eka2);
    }
    
    private static eka e(final ekm ekm, final eka eka, final eka eka2) {
        if (eka instanceof Iterable) {
            return c(ekm, ((Iterable)eka).iterator(), eka2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }
    
    public final eka a(String s, final hyx hyx, final List list) {
        final ekr a = ekr.a;
        final int ordinal = epf.r(s).ordinal();
        if (ordinal == 65) {
            epf.u(ekr.an, 4, list);
            final eka eka = list.get(0);
            final eka eka2 = list.get(1);
            final eka eka3 = list.get(2);
            final eka w = hyx.w(list.get(3));
            if (hyx.w(eka3).g()) {
                final eka x = hyx.x((ejq)w);
                if (x instanceof ejs) {
                    Object o = x;
                    if ("break".equals(((ejs)o).b)) {
                        o = eka.f;
                        return (eka)o;
                    }
                    if ("return".equals(((ejs)o).b)) {
                        return (eka)o;
                    }
                }
            }
            while (hyx.w(eka).g()) {
                final eka x2 = hyx.x((ejq)w);
                if (x2 instanceof ejs) {
                    Object o = x2;
                    if ("break".equals(((ejs)o).b)) {
                        o = eka.f;
                        return (eka)o;
                    }
                    if ("return".equals(((ejs)o).b)) {
                        return (eka)o;
                    }
                }
                hyx.w(eka2);
            }
            Object o = eka.f;
            return (eka)o;
        }
        switch (ordinal) {
            default: {
                return super.b(s);
            }
            case 32: {
                epf.u(ekr.G, 3, list);
                if (list.get(0) instanceof ekd) {
                    return e((ekm)new ekl(hyx, list.get(0).i(), 0, null, null, null, null, null), hyx.w(list.get(1)), hyx.w(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            }
            case 31: {
                epf.u(ekr.F, 3, list);
                if (list.get(0) instanceof ekd) {
                    return e((ekm)new ekl(hyx, list.get(0).i(), 1, null, null, null, null, null), hyx.w(list.get(1)), hyx.w(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            }
            case 30: {
                epf.u(ekr.E, 3, list);
                if (list.get(0) instanceof ekd) {
                    s = list.get(0).i();
                    return e((ekm)new ekl(hyx, s, 2, null, null, null, null, null), hyx.w(list.get(1)), hyx.w(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            }
            case 29: {
                epf.u(ekr.D, 4, list);
                final eka w2 = hyx.w(list.get(0));
                if (w2 instanceof ejq) {
                    final ejq ejq = (ejq)w2;
                    final eka eka4 = list.get(1);
                    final eka eka5 = list.get(2);
                    final eka w3 = hyx.w(list.get(3));
                    final hyx k = hyx.K();
                    int n = 0;
                    hyx hyx2;
                    while (true) {
                        hyx2 = k;
                        if (n >= ejq.c()) {
                            break;
                        }
                        s = ejq.e(n).i();
                        k.B(s, hyx.y(s));
                        ++n;
                    }
                    while (hyx.w(eka4).g()) {
                        final eka x3 = hyx.x((ejq)w3);
                        Label_0570: {
                            if (x3 instanceof ejs) {
                                final ejs ejs = (ejs)x3;
                                Object o2;
                                if ("break".equals(ejs.b)) {
                                    o2 = eka.f;
                                }
                                else {
                                    if (!"return".equals(ejs.b)) {
                                        break Label_0570;
                                    }
                                    o2 = ejs;
                                }
                                return (eka)o2;
                            }
                        }
                        final hyx i = hyx.K();
                        for (int j = 0; j < ejq.c(); ++j) {
                            final String l = ejq.e(j).i();
                            i.B(l, hyx2.y(l));
                        }
                        i.w(eka5);
                        hyx2 = i;
                    }
                    Object o2 = eka.f;
                    return (eka)o2;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            }
            case 28: {
                epf.u(ekr.C, 3, list);
                if (list.get(0) instanceof ekd) {
                    s = list.get(0).i();
                    return d((ekm)new ekl(hyx, s, 0, null, null, null, null, null), hyx.w(list.get(1)), hyx.w(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            }
            case 27: {
                epf.u(ekr.B, 3, list);
                if (list.get(0) instanceof ekd) {
                    s = list.get(0).i();
                    return d((ekm)new ekl(hyx, s, 1, null, null, null, null, null), hyx.w(list.get(1)), hyx.w(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            }
            case 26: {
                epf.u(ekr.A, 3, list);
                if (list.get(0) instanceof ekd) {
                    return d((ekm)new ekl(hyx, list.get(0).i(), 2, null, null, null, null, null), hyx.w(list.get(1)), hyx.w(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            }
        }
    }
}
