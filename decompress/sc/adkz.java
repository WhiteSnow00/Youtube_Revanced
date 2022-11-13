// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adkz implements adkx
{
    private final adlp a;
    
    public adkz(final adlp a) {
        this.a = a;
    }
    
    @Override
    public final admv a(final admv admv) {
        final admv b = this.b(admv);
        if (admv == null) {
            return b;
        }
        if (!admv.aj) {
            final afeq a = adkq.a;
            admu admu;
            if ((admu = admu.a(admv.ad)) == null) {
                admu = admu.a;
            }
            if (!a.contains((Object)admu)) {
                if (!admv.ai) {
                    if (b == null) {
                        this.a.e(admv.k, admv.e, apht.C);
                    }
                    else if (b.aj && (!b.w || b.x)) {
                        final adlp a2 = this.a;
                        final String k = b.k;
                        final String e = b.e;
                        aphw aphw;
                        if ((aphw = aphw.b(b.ak)) == null) {
                            aphw = aphw.a;
                        }
                        aphv aphv;
                        if ((aphv = aphv.b(b.al)) == null) {
                            aphv = aphv.a;
                        }
                        final aphc a3 = aphd.a();
                        final apht e2 = apht.E;
                        ((ahaz)a3).copyOnWrite();
                        aphd.d((aphd)a3.instance, e2);
                        final ahaz builder = ((ahbh)aphe.a).createBuilder();
                        builder.copyOnWrite();
                        final aphe aphe = (aphe)builder.instance;
                        k.getClass();
                        aphe.b |= 0x1;
                        aphe.c = k;
                        ((ahaz)a3).copyOnWrite();
                        aphd.c((aphd)a3.instance, (aphe)builder.build());
                        ((ahaz)a3).copyOnWrite();
                        aphd.e((aphd)a3.instance, aphw);
                        ((ahaz)a3).copyOnWrite();
                        aphd.f((aphd)a3.instance, aphv);
                        final aphd aphd = (aphd)((ahaz)a3).build();
                        final aknr d = aknt.d();
                        ((ahaz)d).copyOnWrite();
                        aknt.ar((aknt)d.instance, aphd);
                        a2.b(e, (aknt)((ahaz)d).build());
                    }
                    else {
                        final afeq a4 = adkq.a;
                        admu admu2;
                        if ((admu2 = admu.a(b.ad)) == null) {
                            admu2 = admu.a;
                        }
                        if (a4.contains((Object)admu2)) {
                            final adlp a5 = this.a;
                            final String i = admv.k;
                            final String e3 = admv.e;
                            final aphc a6 = aphd.a();
                            final apht f = apht.F;
                            ((ahaz)a6).copyOnWrite();
                            aphd.d((aphd)a6.instance, f);
                            final ahaz builder2 = ((ahbh)aphe.a).createBuilder();
                            builder2.copyOnWrite();
                            final aphe aphe2 = (aphe)builder2.instance;
                            i.getClass();
                            aphe2.b |= 0x1;
                            aphe2.c = i;
                            ((ahaz)a6).copyOnWrite();
                            aphd.c((aphd)a6.instance, (aphe)builder2.build());
                            final aphd aphd2 = (aphd)((ahaz)a6).build();
                            final aknr d2 = aknt.d();
                            ((ahaz)d2).copyOnWrite();
                            aknt.ar((aknt)d2.instance, aphd2);
                            a5.b(e3, (aknt)((ahaz)d2).build());
                        }
                        else if (b.ai && (!b.w || b.x)) {
                            this.a.f(admv.k, admv.e, aphu.b);
                        }
                    }
                }
            }
        }
        return b;
    }
    
    public abstract admv b(final admv p0);
}
