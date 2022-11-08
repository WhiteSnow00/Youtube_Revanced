import java.io.IOException;
import java.io.File;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admt extends admd
{
    private final zki a;
    private final albc b;
    private final adjz c;
    private final adjo d;
    private final adcr f;
    private final addr g;
    
    public admt(final arud arud, final zki a, final albc b, final addr g, final adjz c, final adcr f, final adjo d, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arud, apfs.k, d, f, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.g = g;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public final adkb a(final adku adku) {
        return (adkb)this.c;
    }
    
    public final adkr b(final adku adku) {
        adkr adkr;
        if ((adkr = adku.ag) == null) {
            adkr = adkr.a;
        }
        return adkr;
    }
    
    public final ListenableFuture d(String f, adit builder, final adku adku) {
        final zkh d = this.a.d(adku.e);
        if (d == null) {
            throw adim.a(apfr.r);
        }
        if ((adku.b & 0x20) != 0x0) {
            aksf aksf;
            if ((aksf = adku.j) == null) {
                aksf = aksf.a;
            }
            builder = (adit)((agzi)aksf).toBuilder();
        }
        else {
            final agza builder2 = ((agzi)aksf.a).createBuilder();
            final agza builder3 = ((agzi)aksa.a).createBuilder();
            adky adky;
            if ((adky = adku.i) == null) {
                adky = adky.a;
            }
            if (adky.c.isEmpty()) {
                throw new AssertionError((Object)"Metadata update with empty title");
            }
            adky adky2;
            if ((adky2 = adku.i) == null) {
                adky2 = adky.a;
            }
            final String c = adky2.c;
            builder3.copyOnWrite();
            final aksa aksa = (aksa)builder3.instance;
            c.getClass();
            aksa.b |= 0x1;
            aksa.c = c;
            builder2.copyOnWrite();
            final aksf aksf2 = (aksf)builder2.instance;
            final aksa g = (aksa)builder3.build();
            g.getClass();
            aksf2.g = g;
            aksf2.b |= 0x40;
            final agza builder4 = ((agzi)akrm.a).createBuilder();
            adky adky3;
            if ((adky3 = adku.i) == null) {
                adky3 = adky.a;
            }
            f = adky3.d;
            builder4.copyOnWrite();
            final akrm akrm = (akrm)builder4.instance;
            f.getClass();
            akrm.b |= 0x1;
            akrm.c = f;
            builder2.copyOnWrite();
            final aksf aksf3 = (aksf)builder2.instance;
            final akrm h = (akrm)builder4.build();
            h.getClass();
            aksf3.h = h;
            aksf3.b |= 0x80;
            final agza builder5 = ((agzi)akrv.a).createBuilder();
            final adkx a = adkx.a;
            adky adky4;
            if ((adky4 = adku.i) == null) {
                adky4 = adky.a;
            }
            adkx adkx;
            if ((adkx = adkx.a(adky4.e)) == null) {
                adkx = adkx.a;
            }
            final int ordinal = adkx.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        builder5.copyOnWrite();
                        final akrv akrv = (akrv)builder5.instance;
                        akrv.c = 2;
                        akrv.b |= 0x1;
                    }
                }
                else {
                    builder5.copyOnWrite();
                    final akrv akrv2 = (akrv)builder5.instance;
                    akrv2.c = 1;
                    akrv2.b |= 0x1;
                }
            }
            else {
                builder5.copyOnWrite();
                final akrv akrv3 = (akrv)builder5.instance;
                akrv3.c = 0;
                akrv3.b |= 0x1;
            }
            builder2.copyOnWrite();
            final aksf aksf4 = (aksf)builder2.instance;
            final akrv i = (akrv)builder5.build();
            i.getClass();
            aksf4.i = i;
            aksf4.b |= 0x100;
            final agza builder6 = ((agzi)akry.a).createBuilder();
            adky adky5;
            if ((adky5 = adku.i) == null) {
                adky5 = adky.a;
            }
            final agzy f2 = adky5.f;
            builder6.copyOnWrite();
            final akry akry = (akry)builder6.instance;
            final agzy b = akry.b;
            if (!b.c()) {
                akry.b = agzi.mutableCopy(b);
            }
            agxl.addAll((Iterable)f2, (List)akry.b);
            builder2.copyOnWrite();
            final aksf aksf5 = (aksf)builder2.instance;
            final akry l = (akry)builder6.build();
            l.getClass();
            aksf5.l = l;
            aksf5.b |= 0x800;
            adky adky6;
            if ((adky6 = adku.i) == null) {
                adky6 = adky.a;
            }
            builder = (adit)builder2;
            if ((adky6.b & 0x8) != 0x0) {
                final agza builder7 = ((agzi)akrr.a).createBuilder();
                adky adky7;
                if ((adky7 = adku.i) == null) {
                    adky7 = adky.a;
                }
                adkw adkw;
                if ((adkw = adky7.g) == null) {
                    adkw = adkw.a;
                }
                final double b2 = adkw.b;
                builder7.copyOnWrite();
                final akrr akrr = (akrr)builder7.instance;
                akrr.b |= 0x1;
                akrr.c = b2;
                adky adky8;
                if ((adky8 = adku.i) == null) {
                    adky8 = adky.a;
                }
                adkw adkw2;
                if ((adkw2 = adky8.g) == null) {
                    adkw2 = adkw.a;
                }
                final double c2 = adkw2.c;
                builder7.copyOnWrite();
                final akrr akrr2 = (akrr)builder7.instance;
                akrr2.b |= 0x2;
                akrr2.d = c2;
                adky adky9;
                if ((adky9 = adku.i) == null) {
                    adky9 = adky.a;
                }
                adkw adkw3;
                if ((adkw3 = adky9.g) == null) {
                    adkw3 = adkw.a;
                }
                f = adkw3.d;
                builder7.copyOnWrite();
                final akrr akrr3 = (akrr)builder7.instance;
                f.getClass();
                akrr3.b |= 0x8;
                akrr3.f = f;
                adky adky10;
                if ((adky10 = adku.i) == null) {
                    adky10 = adky.a;
                }
                adkw adkw4;
                if ((adkw4 = adky10.g) == null) {
                    adkw4 = adkw.a;
                }
                final String e = adkw4.e;
                builder7.copyOnWrite();
                final akrr akrr4 = (akrr)builder7.instance;
                e.getClass();
                akrr4.b |= 0x4;
                akrr4.e = e;
                builder2.copyOnWrite();
                final aksf aksf6 = (aksf)builder2.instance;
                final akrr o = (akrr)builder7.build();
                o.getClass();
                aksf6.o = o;
                aksf6.b |= 0x40000;
                builder = (adit)builder2;
            }
        }
        f = adku.ac;
        ((agza)builder).copyOnWrite();
        final aksf aksf7 = (aksf)((agza)builder).instance;
        f.getClass();
        aksf7.b |= 0x2;
        aksf7.f = f;
        final boolean q = adku.q;
        Object o2 = null;
        final Object o3 = null;
        if (q) {
            final agza builder8 = ((agzi)aksc.a).createBuilder();
            builder8.copyOnWrite();
            final aksc aksc = (aksc)builder8.instance;
            aksc.c = 3;
            aksc.b |= 0x1;
            try {
                final int b3 = adku.b;
                byte[] array;
                if ((b3 & 0x2000) != 0x0) {
                    array = afnj.d(new File(adku.p));
                }
                else if ((b3 & 0x1000) != 0x0) {
                    array = adku.o.I();
                }
                else {
                    array = null;
                }
                if (array == null) {
                    throw new IOException("Custom thumbnail not present in UploadJobProto.");
                }
                final agza builder9 = ((agzi)akrh.a).createBuilder();
                final agyc x = agyc.x(array);
                builder9.copyOnWrite();
                final akrh akrh = (akrh)builder9.instance;
                akrh.c = 1;
                akrh.d = x;
                builder9.copyOnWrite();
                final akrh akrh2 = (akrh)builder9.instance;
                akrh2.g = 1;
                akrh2.b |= 0x40;
                builder9.copyOnWrite();
                final akrh akrh3 = (akrh)builder9.instance;
                akrh3.h = 1;
                akrh3.b |= 0x80;
                if ((adku.b & 0x8000) != 0x0) {
                    final long r = adku.r;
                    builder9.copyOnWrite();
                    final akrh akrh4 = (akrh)builder9.instance;
                    akrh4.b |= 0x10;
                    akrh4.e = r;
                }
                if ((adku.b & 0x10000) != 0x0) {
                    final boolean s = adku.s;
                    builder9.copyOnWrite();
                    final akrh akrh5 = (akrh)builder9.instance;
                    akrh5.b |= 0x20;
                    akrh5.f = s;
                }
                final akrh e2 = (akrh)builder9.build();
                builder8.copyOnWrite();
                final aksc aksc2 = (aksc)builder8.instance;
                e2.getClass();
                aksc2.e = e2;
                aksc2.b |= 0x4;
                o2 = o3;
            }
            catch (final IOException ex) {
                o2 = new adms(ex);
            }
            ((agza)builder).copyOnWrite();
            final aksf aksf8 = (aksf)((agza)builder).instance;
            final aksc s2 = (aksc)builder8.build();
            s2.getClass();
            aksf8.s = s2;
            aksf8.b |= 0x2000000;
        }
        final addr g2 = this.g;
        final byte[] b4 = uyp.b;
        final Object e3 = g2.e;
        final vre vre = new vre(g2.c, d, (agza)builder, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vii)vre).k(b4);
        final aksg aksg = (aksg)((vkh)e3).d((vjn)vre);
        if (o2 == null) {
            if ((aksg.b & 0x4) != 0x0) {
                aksj aksj;
                if ((aksj = aksg.d) == null) {
                    aksj = aksj.a;
                }
                final int p3 = alhb.p(aksj.c);
                if (p3 != 0) {
                    if (p3 != 1) {
                        return afva.m(((adnr)this).t(this.e.s(apfr.e), true));
                    }
                }
                return afva.m(((adnr)this).t(this.e.t(), true));
            }
            return afva.m(((adnr)this).t(this.e.s(apfr.e), true));
        }
        throw o2;
    }
    
    public final asit f() {
        return (asit)adhq.u;
    }
    
    public final String g() {
        return "SaveMetadataTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adku adku) {
        final int b = adku.b;
        return (b & 0x1) != 0x0 && (adku.c & 0x200000) != 0x0 && (b & 0x10) != 0x0;
    }
    
    public final adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof vkn) {
            final adcr e = this.e;
            final apfr e2 = apfr.e;
            adkr adkr;
            if ((adkr = adku.ag) == null) {
                adkr = adkr.a;
            }
            adkr.getClass();
            return ((adnr)this).t(e.I(e2, adkr, (List)this.b.k, this.f), b);
        }
        if (t instanceof adms) {
            this.f.k("Failed to set custom thumbnail.", t.getCause());
            final adjo d = this.d;
            final String k = adku.k;
            final String e3 = adku.e;
            final apfp ay = apfp.aY;
            apfo apfo;
            if ((apfo = apfo.b(adku.m)) == null) {
                apfo = apfo.a;
            }
            d.d(k, e3, ay, apfo);
            return ((adnr)this).t(this.e.s(apfr.aC), b);
        }
        return super.w(t, adku, b);
    }
}
