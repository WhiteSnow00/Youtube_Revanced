import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekq extends ekg
{
    public ekq() {
        this.a.add(ekr.d);
        this.a.add(ekr.o);
        this.a.add(ekr.r);
        this.a.add(ekr.s);
        this.a.add(ekr.y);
        this.a.add(ekr.H);
        this.a.add(ekr.J);
        this.a.add(ekr.K);
        this.a.add(ekr.X);
        this.a.add(ekr.ag);
        this.a.add(ekr.ak);
        this.a.add(ekr.al);
        this.a.add(ekr.am);
    }
    
    public final eka a(String s, final hyx hyx, final List list) {
        final ekr a = ekr.a;
        final int ordinal = epf.r(s).ordinal();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal == 24) {
                    epf.w(ekr.y, 1, list);
                    eka eka = eka.f;
                    for (int i = n2; i < list.size(); ++i) {
                        eka = hyx.w((eka)list.get(i));
                        if (eka instanceof ejs) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                    }
                    return eka;
                }
                if (ordinal != 33) {
                    if (ordinal == 49) {
                        epf.u(ekr.X, 0, list);
                        return eka.g;
                    }
                    if (ordinal != 58) {
                        if (ordinal == 17) {
                            ejq ejq;
                            if (list.isEmpty()) {
                                ejq = new ejq();
                            }
                            else {
                                final ejq ejq2 = new ejq();
                                final Iterator iterator = list.iterator();
                                int n4 = n;
                                while (true) {
                                    ejq = ejq2;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final eka w = hyx.w((eka)iterator.next());
                                    if (w instanceof ejs) {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                    ejq2.q(n4, w);
                                    ++n4;
                                }
                            }
                            return (eka)ejq;
                        }
                        if (ordinal == 18) {
                            ejx ejx;
                            if (list.isEmpty()) {
                                ejx = new ejx();
                            }
                            else {
                                if (list.size() % 2 != 0) {
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
                                }
                                final ejx ejx2 = new ejx();
                                while (true) {
                                    ejx = ejx2;
                                    if (n3 >= list.size() - 1) {
                                        break;
                                    }
                                    final eka w2 = hyx.w(list.get(n3));
                                    final eka w3 = hyx.w(list.get(n3 + 1));
                                    if (w2 instanceof ejs || w3 instanceof ejs) {
                                        throw new IllegalStateException("Failed to evaluate map entry");
                                    }
                                    ejx2.r(w2.i(), w3);
                                    n3 += 2;
                                }
                            }
                            return (eka)ejx;
                        }
                        if (ordinal == 35 || ordinal == 36) {
                            epf.u(ekr.K, 2, list);
                            final eka w4 = hyx.w(list.get(0));
                            final eka w5 = hyx.w(list.get(1));
                            Object o;
                            if (w4 instanceof ejq && epf.z(w5)) {
                                o = ((ejq)w4).e(w5.h().intValue());
                            }
                            else if (w4 instanceof ejw) {
                                o = ((ejw)w4).f(w5.i());
                            }
                            else {
                                if (w4 instanceof ekd) {
                                    if ("length".equals(w5.i())) {
                                        o = new ejt((double)w4.i().length());
                                        return (eka)o;
                                    }
                                    if (epf.z(w5) && w5.h() < w4.i().length()) {
                                        o = new ekd(String.valueOf(w4.i().charAt(w5.h().intValue())));
                                        return (eka)o;
                                    }
                                }
                                o = eka.f;
                            }
                            return (eka)o;
                        }
                        switch (ordinal) {
                            default: {
                                return super.b(s);
                            }
                            case 64: {
                                epf.w(ekr.am, 1, list);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    final eka w6 = hyx.w((eka)iterator2.next());
                                    if (!(w6 instanceof ekd)) {
                                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", w6.getClass().getCanonicalName()));
                                    }
                                    hyx.z(w6.i(), eka.f);
                                }
                                return eka.f;
                            }
                            case 63: {
                                epf.u(ekr.al, 0, list);
                                return eka.f;
                            }
                            case 62: {
                                epf.u(ekr.ak, 1, list);
                                final eka w7 = hyx.w(list.get(0));
                                if (w7 instanceof eke) {
                                    s = "undefined";
                                }
                                else if (w7 instanceof ejr) {
                                    s = "boolean";
                                }
                                else if (w7 instanceof ejt) {
                                    s = "number";
                                }
                                else if (w7 instanceof ekd) {
                                    s = "string";
                                }
                                else if (w7 instanceof ejz) {
                                    s = "function";
                                }
                                else {
                                    if (w7 instanceof ekb || w7 instanceof ejs) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", w7));
                                    }
                                    s = "object";
                                }
                                return (eka)new ekd(s);
                            }
                        }
                    }
                    else {
                        epf.u(ekr.ag, 3, list);
                        final eka w8 = hyx.w(list.get(0));
                        final eka w9 = hyx.w(list.get(1));
                        final eka w10 = hyx.w(list.get(2));
                        if (w8 != eka.f && w8 != eka.g) {
                            if (w8 instanceof ejq && w9 instanceof ejt) {
                                ((ejq)w8).q(w9.h().intValue(), w10);
                            }
                            else if (w8 instanceof ejw) {
                                ((ejw)w8).r(w9.i(), w10);
                            }
                            return w10;
                        }
                        throw new IllegalStateException(String.format("Can't set property %s of %s", w9.i(), w8.i()));
                    }
                }
                else {
                    epf.u(ekr.H, 1, list);
                    final eka w11 = hyx.w(list.get(0));
                    if (w11 instanceof ekd) {
                        return hyx.y(w11.i());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", w11.getClass().getCanonicalName()));
                }
            }
            else {
                epf.w(ekr.o, 2, list);
                if (list.size() % 2 == 0) {
                    for (int j = 0; j < list.size() - 1; j += 2) {
                        final eka w12 = hyx.w(list.get(j));
                        if (!(w12 instanceof ekd)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", w12.getClass().getCanonicalName()));
                        }
                        hyx.A(w12.i(), hyx.w(list.get(j + 1)));
                    }
                    return eka.f;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
            }
        }
        else {
            epf.u(ekr.d, 2, list);
            final eka w13 = hyx.w(list.get(0));
            if (!(w13 instanceof ekd)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", w13.getClass().getCanonicalName()));
            }
            if (hyx.C(w13.i())) {
                final eka w14 = hyx.w(list.get(1));
                hyx.B(w13.i(), w14);
                return w14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", w13.i()));
        }
    }
}
