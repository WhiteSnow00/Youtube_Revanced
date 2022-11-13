import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekh extends ekg
{
    public ekh() {
        this.a.add(ekr.x);
        this.a.add(ekr.L);
        this.a.add(ekr.M);
        this.a.add(ekr.N);
        this.a.add(ekr.O);
        this.a.add(ekr.Q);
        this.a.add(ekr.R);
        this.a.add(ekr.W);
    }
    
    private static boolean c(final eka eka, final eka eka2) {
        if (eka.getClass().equals(eka2.getClass())) {
            if (eka instanceof eke || eka instanceof ejy) {
                return true;
            }
            if (eka instanceof ejt) {
                if (!Double.isNaN(eka.h())) {
                    if (!Double.isNaN(eka2.h())) {
                        if (eka.h() == (double)eka2.h()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (eka instanceof ekd) {
                return eka.i().equals(eka2.i());
            }
            if (eka instanceof ejr) {
                return eka.g().equals(eka2.g());
            }
            return eka == eka2;
        }
        else {
            if ((eka instanceof eke || eka instanceof ejy) && (eka2 instanceof eke || eka2 instanceof ejy)) {
                return true;
            }
            final boolean b = eka instanceof ejt;
            if (b && eka2 instanceof ekd) {
                return c(eka, (eka)new ejt(eka2.h()));
            }
            final boolean b2 = eka instanceof ekd;
            if (b2 && eka2 instanceof ejt) {
                return c((eka)new ejt(eka.h()), eka2);
            }
            if (eka instanceof ejr) {
                return c((eka)new ejt(eka.h()), eka2);
            }
            if (eka2 instanceof ejr) {
                return c(eka, (eka)new ejt(eka2.h()));
            }
            if ((!b2 && !b) || !(eka2 instanceof ejw)) {
                return eka instanceof ejw && (eka2 instanceof ekd || eka2 instanceof ejt) && c((eka)new ekd(eka.i()), eka2);
            }
            final ekd ekd = new ekd(eka2.i());
            try {
                return c(eka, (eka)ekd);
            }
            finally {}
        }
    }
    
    private static boolean d(eka o, final eka eka) {
        Object o2 = o;
        if (o instanceof ejw) {
            o2 = new ekd(((eka)o).i());
        }
        o = eka;
        if (eka instanceof ejw) {
            o = new ekd(eka.i());
        }
        if (o2 instanceof ekd && o instanceof ekd) {
            return ((eka)o2).i().compareTo(((eka)o).i()) < 0;
        }
        final double doubleValue = ((eka)o2).h();
        final double doubleValue2 = ((eka)o).h();
        if (!Double.isNaN(doubleValue)) {
            if (!Double.isNaN(doubleValue2)) {
                if ((doubleValue == 0.0 && doubleValue2 == 0.0) || (doubleValue == 0.0 && doubleValue2 == 0.0)) {
                    return false;
                }
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean e(eka o, final eka eka) {
        Object o2 = o;
        if (o instanceof ejw) {
            o2 = new ekd(((eka)o).i());
        }
        o = eka;
        if (eka instanceof ejw) {
            o = new ekd(eka.i());
        }
        return ((o2 instanceof ekd && o instanceof ekd) || (!Double.isNaN(((eka)o2).h()) && !Double.isNaN(((eka)o).h()))) && !d((eka)o, (eka)o2);
    }
    
    public final eka a(final String s, final hyx hyx, final List list) {
        epf.u(epf.r(s), 2, list);
        final eka w = hyx.w(list.get(0));
        final eka w2 = hyx.w(list.get(1));
        final ekr a = ekr.a;
        final int ordinal = epf.r(s).ordinal();
        boolean b = false;
        Label_0209: {
            if (ordinal != 23) {
                boolean b2 = false;
                if (ordinal != 48) {
                    if (ordinal == 42) {
                        b = d(w, w2);
                        break Label_0209;
                    }
                    if (ordinal == 43) {
                        b = e(w, w2);
                        break Label_0209;
                    }
                    switch (ordinal) {
                        default: {
                            return super.b(s);
                        }
                        case 40: {
                            b2 = epf.A(w, w2);
                            break;
                        }
                        case 39: {
                            b = epf.A(w, w2);
                            break Label_0209;
                        }
                        case 38: {
                            b = e(w2, w);
                            break Label_0209;
                        }
                        case 37: {
                            b = d(w2, w);
                            break Label_0209;
                        }
                    }
                }
                else {
                    b2 = c(w, w2);
                }
                b = (b2 ^ true);
            }
            else {
                b = c(w, w2);
            }
        }
        eka eka;
        if (b) {
            eka = eka.k;
        }
        else {
            eka = eka.l;
        }
        return eka;
    }
}
