import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpp extends adpt
{
    private final zoa a;
    private final adno b;
    private final alff c;
    private final aaft d;
    private final adgg f;
    
    public adpp(final arzb arzb, final zoa a, final aaft d, final adno b, final adgg f, final alff c, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arzb, apki.i, adnd, f, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.d = d;
        this.f = f;
        this.b = b;
        this.c = c;
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.b;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.S) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(String ac, final admj admj, final adoj adoj) {
        final znz d = this.a.d(adoj.e);
        if (d != null) {
            final ahcr builder = ((ahcz)akor.a).createBuilder();
            ac = adoj.ac;
            builder.copyOnWrite();
            final akor akor = (akor)builder.instance;
            ac.getClass();
            akor.b |= 0x2;
            akor.d = ac;
            final ahdp t = adoj.T;
            builder.copyOnWrite();
            final akor akor2 = (akor)builder.instance;
            final ahdp e = akor2.e;
            if (!e.c()) {
                akor2.e = ahcz.mutableCopy(e);
            }
            ahbc.addAll((Iterable)t, (List)akor2.e);
            if (!adoj.W.isEmpty()) {
                final ahcr builder2 = ((ahcz)akoq.a).createBuilder();
                final String w = adoj.W;
                builder2.copyOnWrite();
                final akoq akoq = (akoq)builder2.instance;
                w.getClass();
                akoq.b |= 0x1;
                akoq.c = w;
                builder.copyOnWrite();
                final akor akor3 = (akor)builder.instance;
                final akoq g = (akoq)builder2.build();
                g.getClass();
                akor3.g = g;
                akor3.b |= 0x8;
            }
            if ((adoj.c & 0x8000) != 0x0) {
                adoe adoe;
                if ((adoe = adoj.V) == null) {
                    adoe = adoe.a;
                }
                if (!adoe.b.isEmpty()) {
                    final ahcr builder3 = akou.a.createBuilder();
                    adoe adoe2;
                    if ((adoe2 = adoj.V) == null) {
                        adoe2 = adoe.a;
                    }
                    final String b = adoe2.b;
                    builder3.copyOnWrite();
                    final akou akou = (akou)builder3.instance;
                    b.getClass();
                    akou.b |= 0x1;
                    akou.c = b;
                    builder.copyOnWrite();
                    final akor akor4 = (akor)builder.instance;
                    final akou f = (akou)builder3.build();
                    f.getClass();
                    akor4.f = f;
                    akor4.b |= 0x4;
                }
            }
            apkh apkh = apkh.a;
            final aaft d2 = this.d;
            final Object g2 = d2.g;
            final vwd vwd = new vwd(d2.c, d, builder, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            ((vls)vwd).l = vbv.b((vbo)d2.e);
            ((vls)vwd).i();
            final akos akos = (akos)((vnt)g2).d((vmz)vwd);
            int by;
            if ((by = aqvq.bY(akos.c)) == 0) {
                by = 1;
            }
            int n = 0;
            Label_0535: {
                switch (by - 1) {
                    default: {
                        this.f.C("CreateReelItemsTask Unknown createReelItems response status.");
                        apkh = apkh.e;
                        break;
                    }
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        apkh = apkh.e;
                        break;
                    }
                    case 2: {
                        apkh = apkh.e;
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
            for (final akot akot : akos.d) {
                final int c = akot.c;
                final int bv = aqvq.bV(c);
                Label_0624: {
                    if (bv != 0) {
                        if (bv == 2) {
                            break Label_0624;
                        }
                    }
                    final int bv2 = aqvq.bV(c);
                    if (bv2 == 0 || bv2 != 4) {
                        continue;
                    }
                }
                list.add(akot.b);
            }
            final String[] array = list.toArray(new String[0]);
            adog adog;
            if (n == 2) {
                adog = this.e.n();
            }
            else if (n == 3) {
                final adgg e2 = this.e;
                adog adog2;
                if ((adog2 = adoj.S) == null) {
                    adog2 = adog.a;
                }
                adog2.getClass();
                adog = e2.H(apkh, adog2, (List)this.c.n, this.f);
            }
            else {
                adog = this.e.m(apkh);
            }
            return afxr.l(((adrh)this).u(adog, true, (asmi)new acbf(array, 14)));
        }
        throw admc.a(apkh.r);
    }
    
    public final asme f() {
        return adlg.o;
    }
    
    public final String g() {
        return "CreateReelItemsTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        return (adoj.c & 0x200000) != 0x0;
    }
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof vnz) {
            final adgg f = this.f;
            adoh adoh;
            if ((adoh = adoh.a(adoj.l)) == null) {
                adoh = adoh.a;
            }
            f.E("CreateReelItemsTask InnerTube service failed for", t, adoh);
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.S) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).t(e.H(e2, adog, (List)this.c.n, this.f), b);
        }
        return super.w(t, adoj, b);
    }
}
