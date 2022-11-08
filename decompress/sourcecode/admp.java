import java.util.List;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admp extends admd
{
    private final zki a;
    private final adjl b;
    private final adjz c;
    private final albc d;
    private final adcr f;
    private final aeim g;
    private final aeim h;
    
    public admp(final arud arud, final zki a, final adjl b, final adjz c, final adcr f, final aeim g, final aeim h, final albc d, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.m, adjo, f, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.g = g;
        this.h = h;
        this.d = d;
    }
    
    public final adkb a(final adku adku) {
        return (adkb)this.c;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.ao) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(String s, final adit adit, final adku adku) {
        final zkh d = this.a.d(adku.e);
        if (d == null) {
            throw adim.a(apfr.r);
        }
        final agza builder = ((agzi)alak.a).createBuilder();
        s = adku.k;
        builder.copyOnWrite();
        final alak alak = (alak)builder.instance;
        s.getClass();
        alak.b |= 0x2;
        alak.d = s;
        s = adku.ac;
        builder.copyOnWrite();
        final alak alak2 = (alak)builder.instance;
        s.getClass();
        alak2.b |= 0x4;
        alak2.e = s;
        adkq adkq;
        if ((adku.d & 0x80) != 0x0) {
            if ((adkq = adku.at) == null) {
                adkq = adkq.a;
            }
        }
        else {
            adkq = null;
        }
        final aila m = aeim.m(adkq);
        if (m != null) {
            builder.copyOnWrite();
            final alak alak3 = (alak)builder.instance;
            alak3.g = m;
            alak3.b |= 0x20;
        }
        final Uri parse = Uri.parse(adku.f);
        apgc f;
        if (this.h.l(parse)) {
            f = this.h.j(parse, adku.L, adku.ap);
        }
        else {
            final aeim g = this.g;
            int d2;
            if ((d2 = adio.D(adku.v)) == 0) {
                d2 = 1;
            }
            f = g.i(d2, parse, (adlf)null).h(adku.L, adku.ap);
        }
        builder.copyOnWrite();
        final alak alak4 = (alak)builder.instance;
        f.getClass();
        alak4.f = f;
        alak4.b |= 0x8;
        final adjl b = this.b;
        final alak alak5 = (alak)builder.build();
        final vkh h = b.h;
        final adjg adjg = new adjg(b.c, d, ((agzi)alak5).toBuilder(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vii)adjg).l = uym.b(b.i);
        ((vii)adjg).i();
        int h2;
        if ((h2 = alhb.h(((alal)h.d((vjn)adjg)).c)) == 0) {
            h2 = 1;
        }
        if (--h2 == 1) {
            return afva.m(((adnr)this).t(this.e.t(), true));
        }
        if (h2 == 2) {
            return afva.m(((adnr)this).t(this.e.s(apfr.e), true));
        }
        if (h2 != 3) {
            this.f.j("ProcessVideoTaskUnknown processVideo response status.");
            return afva.m(((adnr)this).t(this.e.s(apfr.a), true));
        }
        final adcr e = this.e;
        final apfr e2 = apfr.e;
        adkr adkr;
        if ((adkr = adku.ao) == null) {
            adkr = adkr.a;
        }
        adkr.getClass();
        return afva.m(((adnr)this).t(e.I(e2, adkr, (List)this.d.o, this.f), true));
    }
    
    public final asit f() {
        return (asit)adhq.s;
    }
    
    public final String g() {
        return "ProcessVideoTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        final int c = adku.c;
        boolean b2;
        final boolean b = b2 = false;
        if ((0x200000 & c) != 0x0) {
            b2 = b;
            if ((c & 0x80) != 0x0) {
                b2 = b;
                if ((c & 0x40) != 0x0) {
                    adks adks;
                    if ((adks = adks.a(adku.l)) == null) {
                        adks = adks.a;
                    }
                    if (adks == adks.d) {
                        adkr adkr;
                        if ((adkr = adku.S) == null) {
                            adkr = adkr.a;
                        }
                        final int c2 = adio.C(adkr.c);
                        if (c2 == 0) {
                            b2 = b;
                        }
                        else {
                            if (c2 == 2) {
                                return true;
                            }
                            b2 = b;
                        }
                    }
                    else {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof vkn) {
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.ao) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return ((adnr)this).t(e.I(e2, adkr, (List)this.d.o, this.f), b);
        }
        return super.w(t, adku, b);
    }
}
