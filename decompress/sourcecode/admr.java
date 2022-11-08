import android.util.Pair;
import android.text.TextUtils;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admr extends admd
{
    private final zki a;
    private final albc b;
    private final adjl c;
    private final adjz d;
    private final adcr f;
    
    public admr(final arud arud, final zki a, final albc b, final adjl c, final adjz d, final adcr f, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3) {
        super(arud, apfs.l, adjo, f, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    public final adkb a(final adku adku) {
        return (adkb)this.d;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.R) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(String k, final adit adit, final adku adku) {
        final agza builder = ((agzi)alam.a).createBuilder();
        k = adku.k;
        builder.copyOnWrite();
        final alam alam = (alam)builder.instance;
        k.getClass();
        alam.b |= 0x2;
        alam.d = k;
        adks adks;
        if ((adks = adks.a(adku.l)) == null) {
            adks = adks.a;
        }
        final int c = adcr.C(adks);
        builder.copyOnWrite();
        final alam alam2 = (alam)builder.instance;
        alam2.e = c - 1;
        alam2.b |= 0x4;
        final boolean au = adku.au;
        builder.copyOnWrite();
        final alam alam3 = (alam)builder.instance;
        alam3.b |= 0x20;
        alam3.g = au;
        if ((adku.c & 0x80000) != 0x0) {
            apkm f;
            if ((f = adku.aa) == null) {
                f = apkm.a;
            }
            builder.copyOnWrite();
            final alam alam4 = (alam)builder.instance;
            f.getClass();
            alam4.f = f;
            alam4.b |= 0x10;
        }
        if (adku.av) {
            final String i = adku.k;
            final agza builder2 = ((agzi)amjt.a).createBuilder();
            aexq aexq;
            if (!adil.e(i)) {
                aexq = aewp.a;
            }
            else {
                aexq = aexq.k((Object)adil.a.h((CharSequence)i).get(1));
            }
            final String c2 = (String)aexq.c();
            builder2.copyOnWrite();
            final amjt amjt = (amjt)builder2.instance;
            amjt.b |= 0x1;
            amjt.c = c2;
            aexq aexq2;
            if (!adil.e(i)) {
                aexq2 = aewp.a;
            }
            else {
                aexq2 = aexq.k((Object)Integer.parseInt(adil.a.h((CharSequence)i).get(2)));
            }
            final int intValue = (int)aexq2.c();
            builder2.copyOnWrite();
            final amjt amjt2 = (amjt)builder2.instance;
            amjt2.b |= 0x2;
            amjt2.d = intValue;
            final amjt h = (amjt)builder2.build();
            builder.copyOnWrite();
            final alam alam5 = (alam)builder.instance;
            h.getClass();
            alam5.h = h;
            alam5.b |= 0x40;
        }
        final alam alam6 = (alam)builder.build();
        final zkh d = this.a.d(adku.e);
        if (d == null) {
            throw adim.a(apfr.r);
        }
        final adjl c3 = this.c;
        final vkh g = c3.g;
        final adjh adjh = new adjh(c3.c, d, ((agzi)alam6).toBuilder(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vii)adjh).i();
        ((vii)adjh).l = uym.b(c3.i);
        final alan alan = (alan)g.d((vjn)adjh);
        int g2;
        if ((g2 = alhb.g(alan.e)) == 0) {
            g2 = 1;
        }
        if (--g2 != 1) {
            if (g2 == 2) {
                return afva.m(((adnr)this).t(this.e.s(apfr.e), true));
            }
            if (g2 != 3) {
                this.f.j("RegisterVideoTask Unknown registerVideo response status.");
                return afva.m(((adnr)this).t(this.e.s(apfr.a), true));
            }
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.R) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return afva.m(((adnr)this).t(e.I(e2, adkr, (List)this.b.h, this.f), true));
        }
        else {
            aexq aexq3 = null;
            Label_0804: {
                if ((alan.b & 0x2) != 0x0) {
                    alao alao;
                    if ((alao = alan.f) == null) {
                        alao = alao.a;
                    }
                    if (alao.b == 64128279) {
                        final String d2 = alan.d;
                        alao alao2;
                        if ((alao2 = alan.f) == null) {
                            alao2 = alao.a;
                        }
                        apfu a;
                        if (alao2.b == 64128279) {
                            a = (apfu)alao2.c;
                        }
                        else {
                            a = apfu.a;
                        }
                        final aorx u = adcr.u(a);
                        if (adcr.x(a) && !TextUtils.isEmpty((CharSequence)d2) && u != null && !u.d.isEmpty()) {
                            aexq3 = aexq.k((Object)new Pair((Object)d2, (Object)u));
                            break Label_0804;
                        }
                        aexq3 = aewp.a;
                        break Label_0804;
                    }
                }
                aexq3 = aewp.a;
            }
            if (aexq3.h()) {
                return afva.m(((adnr)this).u(this.e.t(), true, (asix)new uqp(this, aexq3, 19)));
            }
            this.f.j("RegisterVideoTask Invalid registerVideoResponse.");
            return afva.m(((adnr)this).t(this.e.s(apfr.e), true));
        }
    }
    
    public final asit f() {
        return (asit)adhq.t;
    }
    
    public final String g() {
        return "RegisterVideoTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        return (adku.b & 0x1) != 0x0;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof vkn) {
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.R) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return ((adnr)this).t(e.I(e2, adkr, (List)this.b.h, this.f), b);
        }
        return super.w(t, adku, b);
    }
}
