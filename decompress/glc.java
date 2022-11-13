import j$.util.Optional;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glc implements aezf
{
    public static final glc a;
    public static final glc b;
    public static final glc c;
    public static final glc d;
    public static final glc e;
    public static final glc f;
    public static final glc g;
    public static final glc h;
    public static final glc i;
    public static final glc j;
    public static final glc k;
    public static final glc l;
    public static final glc m;
    public static final glc n;
    public static final glc o;
    public static final glc p;
    public static final glc q;
    public static final glc r;
    public static final glc s;
    public static final glc t;
    private final int u;
    
    static {
        t = new glc(20);
        s = new glc(19);
        r = new glc(18);
        q = new glc(17);
        p = new glc(16);
        o = new glc(15);
        n = new glc(14);
        m = new glc(13);
        l = new glc(12);
        k = new glc(11);
        j = new glc(10);
        i = new glc(9);
        h = new glc(8);
        g = new glc(7);
        f = new glc(6);
        e = new glc(5);
        d = new glc(3);
        c = new glc(2);
        b = new glc(1);
        a = new glc(0);
    }
    
    public glc(final int u) {
        this.u = u;
    }
    
    public final Object apply(final Object o) {
        switch (this.u) {
            default: {
                final ahaz builder = ((ahbh)o).toBuilder();
                builder.copyOnWrite();
                final adnr adnr = (adnr)builder.instance;
                adnr.b &= 0xFFFFFFFE;
                adnr.c = adnr.a.c;
                builder.copyOnWrite();
                final adnr adnr2 = (adnr)builder.instance;
                adnr2.b &= 0xFFFFFFFD;
                adnr2.d = adnr.a.d;
                return builder.build();
            }
            case 19: {
                final ahaz builder2 = ((ahbh)o).toBuilder();
                builder2.copyOnWrite();
                ((hsz)builder2.instance).b = true;
                return builder2.build();
            }
            case 18: {
                final aplf d = (aplf)o;
                final int g = hjw.g;
                final ahaz builder3 = ((ahbh)akqk.a).createBuilder();
                if (d != null) {
                    builder3.copyOnWrite();
                    final akqk akqk = (akqk)builder3.instance;
                    akqk.d = d;
                    akqk.b |= 0x2;
                }
                return builder3;
            }
            case 17: {
                final uie uie = (uie)o;
                final int ay = hig.ay;
                final ahaz builder4 = ((ahbh)uie).toBuilder();
                builder4.copyOnWrite();
                ((uie)builder4.instance).n = true;
                return builder4.build();
            }
            case 16: {
                final ahaz builder5 = ((ahbh)o).toBuilder();
                builder5.copyOnWrite();
                ((hec)builder5.instance).c = heb.a(2);
                return builder5.build();
            }
            case 15: {
                final hec hec = (hec)o;
                final afeq a = hcd.a;
                final ahaz builder6 = ((ahbh)hec).toBuilder();
                builder6.copyOnWrite();
                ((hec)builder6.instance).b = true;
                return builder6.build();
            }
            case 14: {
                return ((azh)o).g();
            }
            case 13: {
                return ((azh)o).p();
            }
            case 12: {
                return ((azh)o).o();
            }
            case 11: {
                return afeq.n(agpc.R((Iterable)o, (aezs)bbu.u));
            }
            case 10: {
                return ((abqh)o).v();
            }
            case 9: {
                return ((abxa)o).J();
            }
            case 8: {
                final Exception ex = (Exception)o;
                return false;
            }
            case 7: {
                final oac oac = (oac)o;
                return true;
            }
            case 6: {
                final ahfl ahfl = (ahfl)o;
                return ahfl.a;
            }
            case 5: {
                final tqt tqt = (tqt)o;
                tqt.f((afft)afiq.a);
                return tqt;
            }
            case 4: {
                final Optional optional = (Optional)o;
                Optional optional2;
                if (optional.isEmpty()) {
                    optional2 = Optional.empty();
                }
                else {
                    final vfn vfn = (vfn)optional.get();
                    if (vfn instanceof apys) {
                        optional2 = Optional.of((Object)fex.x((apys)vfn));
                    }
                    else if (vfn instanceof amar) {
                        optional2 = Optional.of((Object)fex.w((amar)vfn));
                    }
                    else {
                        optional2 = Optional.empty();
                    }
                }
                return optional2;
            }
            case 3: {
                return ((abxa)o).C();
            }
            case 2: {
                return ((abqh)o).v();
            }
            case 1: {
                return ((gkw)o).f;
            }
            case 0: {
                return ((gkw)o).e;
            }
        }
    }
}
