import java.util.List;
import java.util.concurrent.Executor;
import java.util.Iterator;
import android.text.TextUtils;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpr extends adpt
{
    public final adhd a;
    private final zoa b;
    private final alff c;
    private final adnb d;
    private final adno f;
    private final adgg g;
    private final aheu h;
    private final aheu i;
    
    public adpr(final arzb arzb, final zoa b, final alff c, final adnb d, final adhd a, final aheu h, final aheu i, final adno f, final adgg g, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(arzb, apki.r, adnd, g, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.h = h;
        this.i = i;
        this.g = g;
        this.f = f;
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.f;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.Q) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(final String s, final admj admj, final adoj adoj) {
        final znz d = this.b.d(adoj.e);
        if (d == null) {
            throw admc.a(apkh.r);
        }
        final ahcr builder = ((ahcz)alei.a).createBuilder();
        final String k = adoj.k;
        builder.copyOnWrite();
        final alei alei = (alei)builder.instance;
        k.getClass();
        alei.b |= 0x4;
        alei.e = k;
        final int d2 = adoj.d;
        final apkx apkx = null;
        adof adof;
        if ((d2 & 0x80) != 0x0) {
            if ((adof = adoj.at) == null) {
                adof = adof.a;
            }
        }
        else {
            adof = null;
        }
        final aior u = aheu.u(adof);
        if (u != null) {
            builder.copyOnWrite();
            final alei alei2 = (alei)builder.instance;
            alei2.g = u;
            alei2.b |= 0x10;
        }
        final ahcr builder2 = alem.a.createBuilder();
        final ahcr builder3 = alel.a.createBuilder();
        builder3.copyOnWrite();
        final alel alel = (alel)builder3.instance;
        alel.b |= 0x1;
        alel.c = true;
        builder2.copyOnWrite();
        final alem alem = (alem)builder2.instance;
        final alel d3 = (alel)builder3.build();
        d3.getClass();
        alem.d = d3;
        alem.b |= 0x20;
        final ahcr builder4 = ((ahcz)akvy.a).createBuilder();
        builder4.copyOnWrite();
        final akvy akvy = (akvy)builder4.instance;
        akvy.c = 0;
        akvy.b |= 0x1;
        builder2.copyOnWrite();
        final alem alem2 = (alem)builder2.instance;
        final akvy c = (akvy)builder4.build();
        c.getClass();
        alem2.c = c;
        alem2.b |= 0x4;
        builder.copyOnWrite();
        final alei alei3 = (alei)builder.instance;
        final alem h = (alem)builder2.build();
        h.getClass();
        alei3.h = h;
        alei3.b |= 0x80;
        final Uri parse = Uri.parse(adoj.f);
        apks d4;
        if (this.i.t(parse)) {
            d4 = this.i.r(parse, adoj.L, adoj.ap);
        }
        else {
            final aheu h2 = this.h;
            int z;
            if ((z = adme.z(adoj.v)) == 0) {
                z = 1;
            }
            d4 = h2.q(adoj, z, parse, (adou)null).h(adoj.L, adoj.ap);
        }
        builder.copyOnWrite();
        final alei alei4 = (alei)builder.instance;
        d4.getClass();
        alei4.d = d4;
        alei4.b |= 0x2;
        adoh adoh;
        if ((adoh = adoh.a(adoj.l)) == null) {
            adoh = adoh.a;
        }
        final int w = adgg.w(adoh);
        builder.copyOnWrite();
        final alei alei5 = (alei)builder.instance;
        alei5.f = w - 1;
        alei5.b |= 0x8;
        if ((adoj.d & 0x800) != 0x0) {
            apre i;
            if ((i = adoj.aw) == null) {
                i = apre.a;
            }
            builder.copyOnWrite();
            final alei alei6 = (alei)builder.instance;
            i.getClass();
            alei6.i = i;
            alei6.b |= 0x200;
        }
        if ((adoj.d & 0x1000) != 0x0) {
            final String ax = adoj.ax;
            builder.copyOnWrite();
            final alei alei7 = (alei)builder.instance;
            ax.getClass();
            alei7.b |= 0x1000;
            alei7.j = ax;
        }
        final adnb d5 = this.d;
        final admu admu = new admu(d5.c, d, ((ahcz)builder.build()).toBuilder(), null, null, null, null, null, null);
        ((vls)admu).i();
        final alej alej = (alej)d5.e.d((vmz)admu);
        alek alek;
        if ((alek = alej.d) == null) {
            alek = alek.a;
        }
        if (alek.b != 64128279) {
            this.g.C("CreateVideoTask UploadFeedbackItem not populated");
            return afxr.l(((adrh)this).t(this.e.m(apkh.ag), true));
        }
        alek alek2;
        if ((alek2 = alej.d) == null) {
            alek2 = alek.a;
        }
        apkk a;
        if (alek2.b == 64128279) {
            a = (apkk)alek2.c;
        }
        else {
            a = apkk.a;
        }
        final String c2 = alej.c;
        final boolean r = adgg.r(a);
        final Iterator<Object> iterator = ((List<Object>)a.d).iterator();
        while (true) {
            apkm apkm;
            do {
                final apkx apkx2 = apkx;
                if (!iterator.hasNext()) {
                    final aowm o = adgg.o(a);
                    adog adog;
                    if (o != null && !o.d.isEmpty()) {
                        if (TextUtils.isEmpty((CharSequence)c2)) {
                            this.g.C("CreateVideoTask video id not populated");
                            adog = this.e.m(apkh.ah);
                        }
                        else if (!r) {
                            this.g.C("CreateVideoTask video registration failed");
                            adog = this.e.m(apkh.aj);
                        }
                        else {
                            adog = this.e.n();
                        }
                    }
                    else {
                        this.g.C("CreateVideoTask feedback continuation not populated");
                        adog = this.e.m(apkh.ai);
                    }
                    return afxr.l(((adrh)this).u(adog, true, (asmi)new kwh(this, o, c2, apkx2, 4)));
                }
                apkm = iterator.next();
            } while ((apkm.b & 0x20) == 0x0);
            apkx apkx2;
            if ((apkx2 = apkm.d) == null) {
                apkx2 = apkx.a;
            }
            continue;
        }
    }
    
    public final ListenableFuture e(final String s, final admj admj) {
        return afxr.q((afvp)new jmi(this, s, admj, 15), afwd.a);
    }
    
    public final asme f() {
        return adlg.q;
    }
    
    public final String g() {
        return "CreateVideoTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        final int b = adoj.b;
        return (b & 0x1) != 0x0 && (b & 0x40) != 0x0 && (adoj.c & 0x80) != 0x0;
    }
    
    public final boolean k() {
        return true;
    }
    
    public final adnq l() {
        return (adnq)this.f;
    }
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof vnz) {
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.Q) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).t(e.H(e2, adog, (List)this.c.i, this.g), b);
        }
        return super.w(t, adoj, b);
    }
}
