import java.util.List;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqf extends adpt
{
    private final zoa a;
    private final adnb b;
    private final adno c;
    private final alff d;
    private final adgg f;
    private final aheu g;
    private final aheu h;
    
    public adqf(final arzb arzb, final zoa a, final adnb b, final adno c, final adgg f, final aheu g, final aheu h, final alff d, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(arzb, apki.m, adnd, f, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.g = g;
        this.h = h;
        this.d = d;
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.c;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.ao) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(String ac, final admj admj, final adoj adoj) {
        final znz d = this.a.d(adoj.e);
        if (d == null) {
            throw admc.a(apkh.r);
        }
        final ahcr builder = alen.a.createBuilder();
        final String k = adoj.k;
        builder.copyOnWrite();
        final alen alen = (alen)builder.instance;
        k.getClass();
        alen.b |= 0x2;
        alen.d = k;
        ac = adoj.ac;
        builder.copyOnWrite();
        final alen alen2 = (alen)builder.instance;
        ac.getClass();
        alen2.b |= 0x4;
        alen2.e = ac;
        adof adof;
        if ((adoj.d & 0x80) != 0x0) {
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
            final alen alen3 = (alen)builder.instance;
            alen3.g = u;
            alen3.b |= 0x20;
        }
        final Uri parse = Uri.parse(adoj.f);
        apks f;
        if (this.h.t(parse)) {
            f = this.h.r(parse, adoj.L, adoj.ap);
        }
        else {
            final aheu g = this.g;
            int z;
            if ((z = adme.z(adoj.v)) == 0) {
                z = 1;
            }
            f = g.q(adoj, z, parse, (adou)null).h(adoj.L, adoj.ap);
        }
        builder.copyOnWrite();
        final alen alen4 = (alen)builder.instance;
        f.getClass();
        alen4.f = f;
        alen4.b |= 0x8;
        final adnb b = this.b;
        final alen alen5 = (alen)builder.build();
        final vnt h = b.h;
        final admw admw = new admw(b.c, d, alen5.toBuilder(), null, null, null, null, null, null);
        ((vls)admw).l = vbv.b(b.i);
        ((vls)admw).i();
        int ds;
        if ((ds = aqvq.dS(((aleo)h.d((vmz)admw)).c)) == 0) {
            ds = 1;
        }
        if (--ds == 1) {
            return afxr.l(((adrh)this).t(this.e.n(), true));
        }
        if (ds == 2) {
            return afxr.l(((adrh)this).t(this.e.m(apkh.e), true));
        }
        if (ds != 3) {
            this.f.C("ProcessVideoTaskUnknown processVideo response status.");
            return afxr.l(((adrh)this).t(this.e.m(apkh.a), true));
        }
        final adgg e = this.e;
        final apkh e2 = apkh.e;
        adog adog;
        if ((adog = adoj.ao) == null) {
            adog = adog.a;
        }
        adog.getClass();
        return afxr.l(((adrh)this).t(e.H(e2, adog, (List)this.d.o, this.f), true));
    }
    
    public final asme f() {
        return adlg.u;
    }
    
    public final String g() {
        return "ProcessVideoTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        final int c = adoj.c;
        boolean b2;
        final boolean b = b2 = false;
        if ((0x200000 & c) != 0x0) {
            b2 = b;
            if ((c & 0x80) != 0x0) {
                b2 = b;
                if ((c & 0x40) != 0x0) {
                    adoh adoh;
                    if ((adoh = adoh.a(adoj.l)) == null) {
                        adoh = adoh.a;
                    }
                    if (adoh == adoh.d) {
                        adog adog;
                        if ((adog = adoj.S) == null) {
                            adog = adog.a;
                        }
                        final int y = adme.y(adog.c);
                        if (y == 0) {
                            b2 = b;
                        }
                        else {
                            if (y == 2) {
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
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof vnz) {
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.ao) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).t(e.H(e2, adog, (List)this.d.o, this.f), b);
        }
        return super.w(t, adoj, b);
    }
}
