import java.io.IOException;
import java.io.File;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqk extends adpt
{
    private final zoa a;
    private final alff b;
    private final adno c;
    private final adnd d;
    private final adgg f;
    private final adhf g;
    
    public adqk(final arzb arzb, final zoa a, final alff b, final adhf g, final adno c, final adgg f, final adnd d, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(arzb, apki.k, d, f, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.g = g;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.c;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.ag) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(String s, admj builder, final adoj adoj) {
        final znz d = this.a.d(adoj.e);
        if (d == null) {
            throw admc.a(apkh.r);
        }
        if ((adoj.b & 0x20) != 0x0) {
            akwi akwi;
            if ((akwi = adoj.j) == null) {
                akwi = akwi.a;
            }
            builder = (admj)((ahcz)akwi).toBuilder();
        }
        else {
            final ahcr builder2 = ((ahcz)akwi.a).createBuilder();
            final ahcr builder3 = ((ahcz)akwe.a).createBuilder();
            adon adon;
            if ((adon = adoj.i) == null) {
                adon = adon.a;
            }
            if (adon.c.isEmpty()) {
                throw new AssertionError((Object)"Metadata update with empty title");
            }
            adon adon2;
            if ((adon2 = adoj.i) == null) {
                adon2 = adon.a;
            }
            s = adon2.c;
            builder3.copyOnWrite();
            final akwe akwe = (akwe)builder3.instance;
            s.getClass();
            akwe.b |= 0x1;
            akwe.c = s;
            builder2.copyOnWrite();
            final akwi akwi2 = (akwi)builder2.instance;
            final akwe g = (akwe)builder3.build();
            g.getClass();
            akwi2.g = g;
            akwi2.b |= 0x40;
            final ahcr builder4 = ((ahcz)akvq.a).createBuilder();
            adon adon3;
            if ((adon3 = adoj.i) == null) {
                adon3 = adon.a;
            }
            s = adon3.d;
            builder4.copyOnWrite();
            final akvq akvq = (akvq)builder4.instance;
            s.getClass();
            akvq.b |= 0x1;
            akvq.c = s;
            builder2.copyOnWrite();
            final akwi akwi3 = (akwi)builder2.instance;
            final akvq h = (akvq)builder4.build();
            h.getClass();
            akwi3.h = h;
            akwi3.b |= 0x80;
            final ahcr builder5 = ((ahcz)akvz.a).createBuilder();
            final adom a = adom.a;
            adon adon4;
            if ((adon4 = adoj.i) == null) {
                adon4 = adon.a;
            }
            adom adom;
            if ((adom = adom.a(adon4.e)) == null) {
                adom = adom.a;
            }
            final int ordinal = adom.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        builder5.copyOnWrite();
                        final akvz akvz = (akvz)builder5.instance;
                        akvz.c = 2;
                        akvz.b |= 0x1;
                    }
                }
                else {
                    builder5.copyOnWrite();
                    final akvz akvz2 = (akvz)builder5.instance;
                    akvz2.c = 1;
                    akvz2.b |= 0x1;
                }
            }
            else {
                builder5.copyOnWrite();
                final akvz akvz3 = (akvz)builder5.instance;
                akvz3.c = 0;
                akvz3.b |= 0x1;
            }
            builder2.copyOnWrite();
            final akwi akwi4 = (akwi)builder2.instance;
            final akvz i = (akvz)builder5.build();
            i.getClass();
            akwi4.i = i;
            akwi4.b |= 0x100;
            final ahcr builder6 = ((ahcz)akwc.a).createBuilder();
            adon adon5;
            if ((adon5 = adoj.i) == null) {
                adon5 = adon.a;
            }
            final ahdp f = adon5.f;
            builder6.copyOnWrite();
            final akwc akwc = (akwc)builder6.instance;
            final ahdp b = akwc.b;
            if (!b.c()) {
                akwc.b = ahcz.mutableCopy(b);
            }
            ahbc.addAll((Iterable)f, (List)akwc.b);
            builder2.copyOnWrite();
            final akwi akwi5 = (akwi)builder2.instance;
            final akwc l = (akwc)builder6.build();
            l.getClass();
            akwi5.l = l;
            akwi5.b |= 0x800;
            adon adon6;
            if ((adon6 = adoj.i) == null) {
                adon6 = adon.a;
            }
            builder = (admj)builder2;
            if ((adon6.b & 0x8) != 0x0) {
                final ahcr builder7 = ((ahcz)akvv.a).createBuilder();
                adon adon7;
                if ((adon7 = adoj.i) == null) {
                    adon7 = adon.a;
                }
                adol adol;
                if ((adol = adon7.g) == null) {
                    adol = adol.a;
                }
                final double b2 = adol.b;
                builder7.copyOnWrite();
                final akvv akvv = (akvv)builder7.instance;
                akvv.b |= 0x1;
                akvv.c = b2;
                adon adon8;
                if ((adon8 = adoj.i) == null) {
                    adon8 = adon.a;
                }
                adol adol2;
                if ((adol2 = adon8.g) == null) {
                    adol2 = adol.a;
                }
                final double c = adol2.c;
                builder7.copyOnWrite();
                final akvv akvv2 = (akvv)builder7.instance;
                akvv2.b |= 0x2;
                akvv2.d = c;
                adon adon9;
                if ((adon9 = adoj.i) == null) {
                    adon9 = adon.a;
                }
                adol adol3;
                if ((adol3 = adon9.g) == null) {
                    adol3 = adol.a;
                }
                final String d2 = adol3.d;
                builder7.copyOnWrite();
                final akvv akvv3 = (akvv)builder7.instance;
                d2.getClass();
                akvv3.b |= 0x8;
                akvv3.f = d2;
                adon adon10;
                if ((adon10 = adoj.i) == null) {
                    adon10 = adon.a;
                }
                adol adol4;
                if ((adol4 = adon10.g) == null) {
                    adol4 = adol.a;
                }
                final String e = adol4.e;
                builder7.copyOnWrite();
                final akvv akvv4 = (akvv)builder7.instance;
                e.getClass();
                akvv4.b |= 0x4;
                akvv4.e = e;
                builder2.copyOnWrite();
                final akwi akwi6 = (akwi)builder2.instance;
                final akvv o = (akvv)builder7.build();
                o.getClass();
                akwi6.o = o;
                akwi6.b |= 0x40000;
                builder = (admj)builder2;
            }
        }
        final String ac = adoj.ac;
        ((ahcr)builder).copyOnWrite();
        final akwi akwi7 = (akwi)((ahcr)builder).instance;
        ac.getClass();
        akwi7.b |= 0x2;
        akwi7.f = ac;
        final boolean q = adoj.q;
        Object o2 = null;
        final Object o3 = null;
        if (q) {
            final ahcr builder8 = ((ahcz)akwg.a).createBuilder();
            builder8.copyOnWrite();
            final akwg akwg = (akwg)builder8.instance;
            akwg.c = 3;
            akwg.b |= 0x1;
            try {
                final int b3 = adoj.b;
                byte[] array;
                if ((b3 & 0x2000) != 0x0) {
                    array = afqz.d(new File(adoj.p));
                }
                else if ((b3 & 0x1000) != 0x0) {
                    array = adoj.o.I();
                }
                else {
                    array = null;
                }
                if (array == null) {
                    throw new IOException("Custom thumbnail not present in UploadJobProto.");
                }
                final ahcr builder9 = ((ahcz)akvl.a).createBuilder();
                final ahbt x = ahbt.x(array);
                builder9.copyOnWrite();
                final akvl akvl = (akvl)builder9.instance;
                akvl.c = 1;
                akvl.d = x;
                builder9.copyOnWrite();
                final akvl akvl2 = (akvl)builder9.instance;
                akvl2.g = 1;
                akvl2.b |= 0x40;
                builder9.copyOnWrite();
                final akvl akvl3 = (akvl)builder9.instance;
                akvl3.h = 1;
                akvl3.b |= 0x80;
                if ((adoj.b & 0x8000) != 0x0) {
                    final long r = adoj.r;
                    builder9.copyOnWrite();
                    final akvl akvl4 = (akvl)builder9.instance;
                    akvl4.b |= 0x10;
                    akvl4.e = r;
                }
                if ((adoj.b & 0x10000) != 0x0) {
                    final boolean s2 = adoj.s;
                    builder9.copyOnWrite();
                    final akvl akvl5 = (akvl)builder9.instance;
                    akvl5.b |= 0x20;
                    akvl5.f = s2;
                }
                final akvl e2 = (akvl)builder9.build();
                builder8.copyOnWrite();
                final akwg akwg2 = (akwg)builder8.instance;
                e2.getClass();
                akwg2.e = e2;
                akwg2.b |= 0x4;
                o2 = o3;
            }
            catch (final IOException ex) {
                o2 = new adqj(ex);
            }
            ((ahcr)builder).copyOnWrite();
            final akwi akwi8 = (akwi)((ahcr)builder).instance;
            final akwg s3 = (akwg)builder8.build();
            s3.getClass();
            akwi8.s = s3;
            akwi8.b |= 0x2000000;
        }
        final adhf g2 = this.g;
        final byte[] b4 = vby.b;
        final Object e3 = g2.e;
        final vuq vuq = new vuq(g2.c, d, (ahcr)builder, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vls)vuq).k(b4);
        final akwj akwj = (akwj)((vnt)e3).d((vmz)vuq);
        if (o2 == null) {
            if ((akwj.b & 0x4) != 0x0) {
                akwm akwm;
                if ((akwm = akwj.d) == null) {
                    akwm = akwm.a;
                }
                final int bh = adzw.bh(akwm.c);
                if (bh != 0) {
                    if (bh != 1) {
                        return afxr.l(((adrh)this).t(this.e.m(apkh.e), true));
                    }
                }
                return afxr.l(((adrh)this).t(this.e.n(), true));
            }
            return afxr.l(((adrh)this).t(this.e.m(apkh.e), true));
        }
        throw o2;
    }
    
    public final asme f() {
        return adqi.a;
    }
    
    public final String g() {
        return "SaveMetadataTask";
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x1) != 0x0 && (adoj.c & 0x200000) != 0x0 && (b & 0x10) != 0x0;
    }
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof vnz) {
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.ag) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).t(e.H(e2, adog, (List)this.b.k, this.f), b);
        }
        if (t instanceof adqj) {
            this.f.D("Failed to set custom thumbnail.", t.getCause());
            final adnd d = this.d;
            final String k = adoj.k;
            final String e3 = adoj.e;
            final apkf az = apkf.aZ;
            apke apke;
            if ((apke = apke.b(adoj.m)) == null) {
                apke = apke.a;
            }
            d.d(k, e3, az, apke);
            return ((adrh)this).t(this.e.m(apkh.aC), b);
        }
        return super.w(t, adoj, b);
    }
}
