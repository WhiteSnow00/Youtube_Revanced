import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmy implements asmn
{
    public static final abmy a;
    public static final abmy b;
    public static final abmy c;
    public static final abmy d;
    public static final abmy e;
    public static final abmy f;
    public static final abmy g;
    public static final abmy h;
    public static final abmy i;
    public static final abmy j;
    public static final abmy k;
    public static final abmy l;
    public static final abmy m;
    public static final abmy n;
    public static final abmy o;
    public static final abmy p;
    public static final abmy q;
    public static final abmy r;
    public static final abmy s;
    public static final abmy t;
    public static final abmy u;
    private final int v;
    
    static {
        u = new abmy(20);
        t = new abmy(19);
        s = new abmy(18);
        r = new abmy(17);
        q = new abmy(16);
        p = new abmy(15);
        o = new abmy(14);
        n = new abmy(13);
        m = new abmy(12);
        l = new abmy(11);
        k = new abmy(10);
        j = new abmy(9);
        i = new abmy(8);
        h = new abmy(7);
        g = new abmy(6);
        f = new abmy(5);
        e = new abmy(4);
        d = new abmy(3);
        c = new abmy(2);
        b = new abmy(1);
        a = new abmy(0);
    }
    
    private abmy(final int v) {
        this.v = v;
    }
    
    @Override
    public final Object a(final Object o) {
        final int v = this.v;
        final boolean b = false;
        Object o2 = null;
        switch (v) {
            default: {
                if ((o2 = ((adoj)o).j) == null) {
                    return akwi.a;
                }
                break;
            }
            case 19: {
                adok adok;
                if ((adok = ((adoj)o).t) == null) {
                    adok = adok.a;
                }
                return adok;
            }
            case 18: {
                adoc adoc;
                if ((adoc = ((adoj)o).u) == null) {
                    adoc = adoc.a;
                }
                return adoc;
            }
            case 17: {
                return ((adoj)o).ax;
            }
            case 16: {
                final ahcr ahcr = (ahcr)o;
                ahcr.copyOnWrite();
                final adoj adoj = (adoj)ahcr.instance;
                final adoj a = adoj.a;
                adoj.d &= 0xFFFFEFFF;
                adoj.ax = adoj.a.ax;
                return ahcr;
            }
            case 15: {
                apre apre;
                if ((apre = ((adoj)o).aw) == null) {
                    apre = apre.a;
                }
                return apre;
            }
            case 14: {
                return ((adoj)o).az;
            }
            case 13: {
                final adoj adoj2 = (adoj)o;
                final int t = adlk.t;
                final ahcr builder = adoj2.toBuilder();
                builder.copyOnWrite();
                final adoj adoj3 = (adoj)builder.instance;
                adoj3.b |= 0x4000;
                adoj3.q = false;
                return builder.build();
            }
            case 12: {
                return ((Optional)o).get();
            }
            case 11: {
                final int cu = tqf.cU((long)o);
                final int cx = tqf.cX(cu, tpl.c);
                final int cx2 = tqf.cX(cu, tpl.a);
                final int cx3 = tqf.cX(cu, tpl.d);
                final boolean n = tpl.n(cx3);
                final int n2 = 1;
                Optional optional;
                if (n) {
                    boolean b2 = b;
                    if (cx == 1) {
                        b2 = b;
                        if (cx2 == 3) {
                            b2 = b;
                            if (cx3 == 2) {
                                b2 = true;
                            }
                        }
                    }
                    optional = Optional.of((Object)b2);
                }
                else {
                    final boolean b3 = cx == 1 || !tpl.n(cx);
                    int n3 = n2;
                    if (cx2 != 3) {
                        if (!tpl.n(cx2)) {
                            n3 = n2;
                        }
                        else {
                            n3 = 0;
                        }
                    }
                    if (b3 && n3 != 0) {
                        optional = Optional.empty();
                    }
                    else {
                        optional = Optional.of((Object)false);
                    }
                }
                return optional;
            }
            case 10: {
                return ((adha)o).b;
            }
            case 9: {
                return ((ajvq)o).b;
            }
            case 8: {
                final vgv c = ((vhb)((afbi)o).a).c;
                c.getClass();
                return c;
            }
            case 7: {
                return ((aapc)o).c();
            }
            case 6: {
                return afbh.k(((aqtz)o).c);
            }
            case 5: {
                return ((aapv)o).a().q();
            }
            case 4: {
                return ((aapv)o).a().Y();
            }
            case 3: {
                return aamz.ad(o);
            }
            case 2: {
                final Throwable t2 = (Throwable)o;
                return Optional.empty();
            }
            case 1: {
                return ((adzx)o).a;
            }
            case 0: {
                o2 = Optional.of((Object)o);
                break;
            }
        }
        return o2;
    }
}
