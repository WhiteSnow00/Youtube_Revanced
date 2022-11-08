import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlz extends admd
{
    private final zki a;
    private final adjz b;
    private final albc c;
    private final adcr d;
    private final aaca f;
    
    public adlz(final arud arud, final zki a, final aaca f, final adjz b, final adcr d, final albc c, final adjo adjo, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.i, adjo, d, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.f = f;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final adkb a(final adku adku) {
        return (adkb)this.b;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.S) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(String b, final adit adit, final adku adku) {
        final zkh d = this.a.d(adku.e);
        if (d != null) {
            final agza builder = ((agzi)akkn.a).createBuilder();
            final String ac = adku.ac;
            builder.copyOnWrite();
            final akkn akkn = (akkn)builder.instance;
            ac.getClass();
            akkn.b |= 0x2;
            akkn.d = ac;
            final agzy t = adku.T;
            builder.copyOnWrite();
            final akkn akkn2 = (akkn)builder.instance;
            final agzy e = akkn2.e;
            if (!e.c()) {
                akkn2.e = agzi.mutableCopy(e);
            }
            agxl.addAll((Iterable)t, (List)akkn2.e);
            if (!adku.W.isEmpty()) {
                final agza builder2 = ((agzi)akkm.a).createBuilder();
                final String w = adku.W;
                builder2.copyOnWrite();
                final akkm akkm = (akkm)builder2.instance;
                w.getClass();
                akkm.b |= 0x1;
                akkm.c = w;
                builder.copyOnWrite();
                final akkn akkn3 = (akkn)builder.instance;
                final akkm g = (akkm)builder2.build();
                g.getClass();
                akkn3.g = g;
                akkn3.b |= 0x8;
            }
            if ((adku.c & 0x8000) != 0x0) {
                adkp adkp;
                if ((adkp = adku.V) == null) {
                    adkp = adkp.a;
                }
                if (!adkp.b.isEmpty()) {
                    final agza builder3 = ((agzi)akkq.a).createBuilder();
                    adkp adkp2;
                    if ((adkp2 = adku.V) == null) {
                        adkp2 = adkp.a;
                    }
                    b = adkp2.b;
                    builder3.copyOnWrite();
                    final akkq akkq = (akkq)builder3.instance;
                    b.getClass();
                    akkq.b |= 0x1;
                    akkq.c = b;
                    builder.copyOnWrite();
                    final akkn akkn4 = (akkn)builder.instance;
                    final akkq f = (akkq)builder3.build();
                    f.getClass();
                    akkn4.f = f;
                    akkn4.b |= 0x4;
                }
            }
            apfr apfr = apfr.a;
            final aaca f2 = this.f;
            final Object g2 = f2.g;
            final vss vss = new vss(f2.c, d, builder, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            ((vii)vss).l = uym.b((uyf)f2.e);
            ((vii)vss).i();
            final akko akko = (akko)((vkh)g2).d((vjn)vss);
            int cf;
            if ((cf = aqql.cf(akko.c)) == 0) {
                cf = 1;
            }
            int n = 0;
            Label_0535: {
                switch (cf - 1) {
                    default: {
                        this.d.j("CreateReelItemsTask Unknown createReelItems response status.");
                        apfr = apfr.e;
                        break;
                    }
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        apfr = apfr.e;
                        break;
                    }
                    case 2: {
                        apfr = apfr.e;
                        n = 3;
                        break Label_0535;
                    }
                    case 1: {
                        n = 2;
                        break Label_0535;
                    }
                }
                n = 4;
            }
            final ArrayList<String> list = new ArrayList<String>();
            for (final akkp akkp : akko.d) {
                final int c = akkp.c;
                final int cc = aqql.cc(c);
                Label_0623: {
                    if (cc != 0) {
                        if (cc == 2) {
                            break Label_0623;
                        }
                    }
                    final int cc2 = aqql.cc(c);
                    if (cc2 == 0 || cc2 != 4) {
                        continue;
                    }
                }
                list.add(akkp.b);
            }
            final String[] array = list.toArray(new String[0]);
            adkr adkr;
            if (n == 2) {
                adkr = this.e.t();
            }
            else if (n == 3) {
                final adcr e2 = this.e;
                adkr adkr2;
                if ((adkr2 = adku.S) == null) {
                    adkr2 = adkr.a;
                }
                adkr2.getClass();
                adkr = e2.I(apfr, adkr2, (List)this.c.n, this.d);
            }
            else {
                adkr = this.e.s(apfr);
            }
            return afva.m(((adnr)this).u(adkr, true, (asix)new adjm(array, 2)));
        }
        throw adim.a(apfr.r);
    }
    
    public final asit f() {
        return (asit)adhq.m;
    }
    
    public final String g() {
        return "CreateReelItemsTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adku adku) {
        return (adku.c & 0x200000) != 0x0;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof vkn) {
            final adcr d = this.d;
            adks adks;
            if ((adks = adks.a(adku.l)) == null) {
                adks = adks.a;
            }
            d.l("CreateReelItemsTask InnerTube service failed for", t, adks);
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.S) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return ((adnr)this).t(e.I(e2, adkr, (List)this.c.n, this.d), b);
        }
        return super.w(t, adku, b);
    }
}
