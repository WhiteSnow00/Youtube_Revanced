import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Map;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgc implements ovo
{
    public static final int a = 0;
    private static final String b = "acgc";
    private final ove c;
    private final AtomicInteger d;
    private Optional e;
    private final vbs f;
    
    public acgc(final vbs f, final Map map, final ove c) {
        this.f = f;
        this.c = c;
        this.e = Optional.empty();
        this.d = new AtomicInteger();
        if (!f.aa()) {
            return;
        }
        this.e = Collection$_EL.stream((Collection)((afgm)map).e()).map((Function)acdy.c).filter((Predicate)acey.c).findFirst();
    }
    
    private static void d(final acet acet, final xbe xbe) {
        ((oui)acet).d((oum)new acfy(acet, xbe, 0));
    }
    
    private static void e(final acet acet, final xbe xbe, final boolean b) {
        ((oui)acet).H((out)new acfx(acet, b, xbe));
    }
    
    private static boolean f(final long n, final int n2) {
        return (n & (long)(n2 - 1)) > 0L;
    }
    
    public final ahci a() {
        return alya.b;
    }
    
    public final void b(final dta dta, final oua oua, final String s, final Object o, final ouu ouu, final otr otr) {
        final alya alya = (alya)o;
        if (!(ouu instanceof acet)) {
            tut.l("Missing YouTube element builder!");
            return;
        }
        final acet h = (acet)ouu;
        final boolean ry = ((ahcu)alya).ry((ahci)alxz.a);
        alxw b;
        if (ry) {
            b = (alxw)((ahcu)alya).rx((ahci)alxz.a);
        }
        else {
            b = alxw.b;
        }
        final boolean ad = this.f.ad();
        wzy wzy;
        if (ry) {
            wzy = new wzy(b);
        }
        else {
            wzy = new wzy(alya.c);
        }
        if (ry) {
            long c;
            if ((b.c & 0x2) != 0x0) {
                aprx aprx;
                if ((aprx = b.e) == null) {
                    aprx = aprx.a;
                }
                c = aprx.c;
            }
            else {
                c = 0L;
            }
            if (this.f.aa() && (b.c & 0x40) != 0x0) {
                Optional optional;
                if (this.e.isEmpty()) {
                    optional = Optional.empty();
                }
                else {
                    final AtomicReference x = oua.x;
                    if (x == null) {
                        optional = Optional.empty();
                    }
                    else {
                        final via a = ots.a();
                        a.h = h;
                        a.g(oua);
                        a.b = oua.u;
                        final ots f = a.f();
                        final aefs aefs = (aefs)this.e.get();
                        final ahcr builder = ((ahcz)ajxw.a).createBuilder();
                        builder.copyOnWrite();
                        final ajxw ajxw = (ajxw)builder.instance;
                        b.getClass();
                        ajxw.d = b;
                        ajxw.c |= 0x1;
                        final oor q = aefs.Q(builder.build(), f);
                        if (q == null) {
                            optional = Optional.empty();
                        }
                        else {
                            final String b2 = acgc.b;
                            final int incrementAndGet = this.d.incrementAndGet();
                            final StringBuilder sb = new StringBuilder();
                            sb.append(b2);
                            sb.append(incrementAndGet);
                            optional = Optional.of((Object)new opx(x, (List)Arrays.asList(q), sb.toString(), this.c, oua, 431803212, false));
                        }
                    }
                }
                if (c > 0L) {
                    if (f(c, 5)) {
                        h.getClass();
                        optional.ifPresent((Consumer)new aaqr(h, 17));
                    }
                    if (f(c, 9)) {
                        h.getClass();
                        optional.ifPresent((Consumer)new aaqr(h, 18));
                    }
                    h.getClass();
                    optional.ifPresent((Consumer)new aaqr(h, 19));
                }
                else {
                    h.getClass();
                    optional.ifPresent((Consumer)new aaqr(h, 17));
                    optional.ifPresent((Consumer)new aaqr(h, 18));
                    optional.ifPresent((Consumer)new aaqr(h, 19));
                }
                if (!this.f.f(45373088L)) {
                    return;
                }
            }
            if (c <= 0L) {
                e(h, (xbe)wzy, ad);
                d(h, (xbe)wzy);
                return;
            }
            if (f(c, 5)) {
                e(h, (xbe)wzy, ad);
            }
            if (f(c, 9)) {
                d(h, (xbe)wzy);
            }
        }
        else {
            e(h, (xbe)wzy, ad);
            if (this.f.f(45363296L)) {
                if (ouu.g() && !alya.d) {
                    ((oui)h).G((oup)new acfz(h, (xbe)wzy));
                }
                if (ouu.e() && !alya.e) {
                    ((oui)h).h((ouk)new acga(h, (xbe)wzy));
                }
                if (ouu.f() && !alya.f) {
                    ((oui)h).F((oun)new acgb(h, (xbe)wzy));
                }
            }
        }
    }
    
    public final void c(final ouu ouu) {
        throw null;
    }
}
