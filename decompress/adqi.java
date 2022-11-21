// 
// Decompiled by Procyon v0.6.0
// 

public final class adqi implements asme
{
    public static final adqi a;
    public static final adqi b;
    public static final adqi c;
    public static final adqi d;
    public static final adqi e;
    public static final adqi f;
    private final int g;
    
    static {
        f = new adqi(5);
        e = new adqi(4);
        d = new adqi(3);
        c = new adqi(2);
        b = new adqi(1);
        a = new adqi(0);
    }
    
    private adqi(final int g) {
        this.g = g;
    }
    
    @Override
    public final Object a(final Object o, final Object o2) {
        final int g = this.g;
        if (g == 0) {
            final ahcr ahcr = (ahcr)o;
            final adog ag = (adog)o2;
            ahcr.copyOnWrite();
            final adoj adoj = (adoj)ahcr.instance;
            final adoj a = adoj.a;
            ag.getClass();
            adoj.ag = ag;
            adoj.c |= 0x2000000;
            return ahcr;
        }
        if (g == 1) {
            final ahcr ahcr2 = (ahcr)o;
            final adog r = (adog)o2;
            ahcr2.copyOnWrite();
            final adoj adoj2 = (adoj)ahcr2.instance;
            final adoj a2 = adoj.a;
            r.getClass();
            adoj2.R = r;
            adoj2.c |= 0x2000;
            return ahcr2;
        }
        if (g == 2) {
            final ahcr ahcr3 = (ahcr)o;
            final adog n = (adog)o2;
            ahcr3.copyOnWrite();
            final adoj adoj3 = (adoj)ahcr3.instance;
            final adoj a3 = adoj.a;
            n.getClass();
            adoj3.N = n;
            adoj3.c |= 0x200;
            return ahcr3;
        }
        if (g == 3) {
            final ahcr ahcr4 = (ahcr)o;
            final adog an = (adog)o2;
            ahcr4.copyOnWrite();
            final adoj adoj4 = (adoj)ahcr4.instance;
            final adoj a4 = adoj.a;
            an.getClass();
            adoj4.an = an;
            adoj4.d |= 0x1;
            return ahcr4;
        }
        if (g != 4) {
            final ahcr ahcr5 = (ahcr)o;
            final adog p2 = (adog)o2;
            ahcr5.copyOnWrite();
            final adoj adoj5 = (adoj)ahcr5.instance;
            final adoj a5 = adoj.a;
            p2.getClass();
            adoj5.P = p2;
            adoj5.c |= 0x800;
            return ahcr5;
        }
        final ahcr ahcr6 = (ahcr)o;
        final adog ae = (adog)o2;
        ahcr6.copyOnWrite();
        final adoj adoj6 = (adoj)ahcr6.instance;
        final adoj a6 = adoj.a;
        ae.getClass();
        adoj6.ae = ae;
        adoj6.c |= 0x800000;
        return ahcr6;
    }
}
