import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eki extends ekg
{
    public eki() {
        this.a.add(ekr.c);
        this.a.add(ekr.l);
        this.a.add(ekr.m);
        this.a.add(ekr.n);
        this.a.add(ekr.t);
        this.a.add(ekr.p);
        this.a.add(ekr.u);
        this.a.add(ekr.z);
        this.a.add(ekr.P);
        this.a.add(ekr.ac);
        this.a.add(ekr.af);
        this.a.add(ekr.ai);
        this.a.add(ekr.aj);
    }
    
    private static eka c(final hyx hyx, List subList) {
        epf.w(ekr.z, 2, (List)subList);
        final eka w = hyx.w((eka)subList.get(0));
        final eka w2 = hyx.w((eka)subList.get(1));
        if (w2 instanceof ejq) {
            final List m = ((ejq)w2).m();
            final ArrayList list = new ArrayList();
            if (subList.size() > 2) {
                subList = subList.subList(2, subList.size());
            }
            else {
                subList = list;
            }
            return (eka)new ejz(w.i(), m, (List)subList, hyx, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", ((ejq)w2).getClass().getCanonicalName()));
    }
    
    public final eka a(String s, final hyx hyx, final List list) {
        final ekr a = ekr.a;
        final int ordinal = epf.r(s).ordinal();
        if (ordinal != 2) {
            if (ordinal == 15) {
                epf.u(ekr.m, 0, list);
                return eka.h;
            }
            if (ordinal == 25) {
                return c(hyx, list);
            }
            if (ordinal != 41) {
                if (ordinal == 54) {
                    return (eka)new ejq(list);
                }
                if (ordinal != 57) {
                    if (ordinal != 19) {
                        if (ordinal == 20) {
                            epf.w(ekr.u, 2, list);
                            final eka c = c(hyx, list);
                            s = ((eju)c).d;
                            if (s == null) {
                                hyx.B("", c);
                            }
                            else {
                                hyx.B(s, c);
                            }
                            return c;
                        }
                        if (ordinal != 60) {
                            if (ordinal == 61) {
                                epf.u(ekr.aj, 3, list);
                                eka eka;
                                if (hyx.w(list.get(0)).g()) {
                                    eka = hyx.w(list.get(1));
                                }
                                else {
                                    eka = hyx.w(list.get(2));
                                }
                                return eka;
                            }
                            switch (ordinal) {
                                default: {
                                    return super.b(s);
                                }
                                case 12: {
                                    epf.u(ekr.m, 0, list);
                                    return eka.i;
                                }
                                case 11: {
                                    return hyx.K().x(new ejq(list));
                                }
                                case 13: {
                                    break;
                                }
                            }
                        }
                        else {
                            epf.u(ekr.ai, 3, list);
                            final eka w = hyx.w(list.get(0));
                            final eka w2 = hyx.w(list.get(1));
                            final eka w3 = hyx.w(list.get(2));
                            if (!(w2 instanceof ejq)) {
                                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                            }
                            if (w3 instanceof ejq) {
                                final ejq ejq = (ejq)w2;
                                final ejq ejq2 = (ejq)w3;
                                int i = 0;
                                int n = 0;
                                while (i < ejq.c()) {
                                    if (n == 0 && !w.equals(hyx.w(ejq.e(i)))) {
                                        n = 0;
                                    }
                                    else {
                                        final eka w4 = hyx.w(ejq2.e(i));
                                        if (w4 instanceof ejs) {
                                            final eka eka2 = w4;
                                            if (((ejs)w4).b.equals("break")) {
                                                return eka.f;
                                            }
                                            return eka2;
                                        }
                                        else {
                                            n = 1;
                                        }
                                    }
                                    ++i;
                                }
                                if (ejq.c() + 1 == ejq2.c()) {
                                    final eka w5 = hyx.w(ejq2.e(ejq.c()));
                                    if (w5 instanceof ejs) {
                                        final String b = ((ejs)w5).b;
                                        eka eka2 = w5;
                                        if (b.equals("return")) {
                                            return eka2;
                                        }
                                        eka2 = w5;
                                        if (b.equals("continue")) {
                                            return eka2;
                                        }
                                    }
                                }
                                return eka.f;
                            }
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                    }
                    eka eka3;
                    if (list.isEmpty()) {
                        eka3 = eka.f;
                    }
                    else {
                        final eka w6 = hyx.w(list.get(0));
                        if (w6 instanceof ejq) {
                            eka3 = hyx.x((ejq)w6);
                        }
                        else {
                            eka3 = eka.f;
                        }
                    }
                    return eka3;
                }
                Object j;
                if (list.isEmpty()) {
                    j = eka.j;
                }
                else {
                    epf.u(ekr.af, 1, list);
                    j = new ejs("return", hyx.w(list.get(0)));
                }
                return (eka)j;
            }
            else {
                epf.w(ekr.P, 2, list);
                final eka w7 = hyx.w(list.get(0));
                final eka w8 = hyx.w(list.get(1));
                Object w9;
                if (list.size() > 2) {
                    w9 = hyx.w(list.get(2));
                }
                else {
                    w9 = null;
                }
                eka eka4 = eka.f;
                if (w7.g()) {
                    eka4 = hyx.x((ejq)w8);
                }
                else if (w9 != null) {
                    eka4 = hyx.x((ejq)w9);
                }
                if (eka4 instanceof ejs) {
                    return eka4;
                }
                return eka.f;
            }
        }
        else {
            epf.u(ekr.c, 3, list);
            final eka w10 = hyx.w(list.get(0));
            s = hyx.w(list.get(1)).i();
            final eka w11 = hyx.w(list.get(2));
            if (!(w11 instanceof ejq)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", ((ejq)w11).getClass().getCanonicalName()));
            }
            if (!s.isEmpty()) {
                return w10.lA(s, hyx, ((ejq)w11).m());
            }
            throw new IllegalArgumentException("Function name for apply is undefined");
        }
    }
}
