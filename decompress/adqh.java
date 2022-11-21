import android.util.Pair;
import android.text.TextUtils;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqh extends adpt
{
    private final zoa a;
    private final alff b;
    private final adnb c;
    private final adno d;
    private final adgg f;
    
    public adqh(final arzb arzb, final zoa a, final alff b, final adnb c, final adno d, final adgg f, final adnd adnd, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(arzb, apki.l, adnd, f, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    public final adnq a(final adoj adoj) {
        return (adnq)this.d;
    }
    
    public final adog b(final adoj adoj) {
        adog adog;
        if ((adog = adoj.R) == null) {
            adog = adog.a;
        }
        return adog;
    }
    
    public final ListenableFuture d(String c, final admj admj, final adoj adoj) {
        final ahcr builder = alep.a.createBuilder();
        final String k = adoj.k;
        builder.copyOnWrite();
        final alep alep = (alep)builder.instance;
        k.getClass();
        alep.b |= 0x2;
        alep.d = k;
        adoh adoh;
        if ((adoh = adoh.a(adoj.l)) == null) {
            adoh = adoh.a;
        }
        final int w = adgg.w(adoh);
        builder.copyOnWrite();
        final alep alep2 = (alep)builder.instance;
        alep2.e = w - 1;
        alep2.b |= 0x4;
        final boolean au = adoj.au;
        builder.copyOnWrite();
        final alep alep3 = (alep)builder.instance;
        alep3.b |= 0x20;
        alep3.g = au;
        if ((adoj.c & 0x80000) != 0x0) {
            appc f;
            if ((f = adoj.aa) == null) {
                f = appc.a;
            }
            builder.copyOnWrite();
            final alep alep4 = (alep)builder.instance;
            f.getClass();
            alep4.f = f;
            alep4.b |= 0x10;
        }
        if (adoj.av) {
            final String i = adoj.k;
            final ahcr builder2 = amoc.a.createBuilder();
            afbh afbh;
            if (!admb.e(i)) {
                afbh = afag.a;
            }
            else {
                afbh = afbh.k(admb.a.h(i).get(1));
            }
            c = (String)afbh.c();
            builder2.copyOnWrite();
            final amoc amoc = (amoc)builder2.instance;
            amoc.b |= 0x1;
            amoc.c = c;
            afbh afbh2;
            if (!admb.e(i)) {
                afbh2 = afag.a;
            }
            else {
                afbh2 = afbh.k(Integer.parseInt(admb.a.h(i).get(2)));
            }
            final int intValue = (int)afbh2.c();
            builder2.copyOnWrite();
            final amoc amoc2 = (amoc)builder2.instance;
            amoc2.b |= 0x2;
            amoc2.d = intValue;
            final amoc h = (amoc)builder2.build();
            builder.copyOnWrite();
            final alep alep5 = (alep)builder.instance;
            h.getClass();
            alep5.h = h;
            alep5.b |= 0x40;
        }
        final alep alep6 = (alep)builder.build();
        final znz d = this.a.d(adoj.e);
        if (d == null) {
            throw admc.a(apkh.r);
        }
        final adnb c2 = this.c;
        final vnt g = c2.g;
        final admx admx = new admx(c2.c, d, alep6.toBuilder(), null, null, null, null, null, null);
        ((vls)admx).i();
        ((vls)admx).l = vbv.b(c2.i);
        final aleq aleq = (aleq)g.d((vmz)admx);
        int dr;
        if ((dr = aqvq.dR(aleq.e)) == 0) {
            dr = 1;
        }
        if (--dr != 1) {
            if (dr == 2) {
                return afxr.l(((adrh)this).t(this.e.m(apkh.e), true));
            }
            if (dr != 3) {
                this.f.C("RegisterVideoTask Unknown registerVideo response status.");
                return afxr.l(((adrh)this).t(this.e.m(apkh.a), true));
            }
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.R) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return afxr.l(((adrh)this).t(e.H(e2, adog, (List)this.b.h, this.f), true));
        }
        else {
            afbh afbh3 = null;
            Label_0806: {
                if ((aleq.b & 0x2) != 0x0) {
                    aler aler;
                    if ((aler = aleq.f) == null) {
                        aler = aler.a;
                    }
                    if (aler.b == 64128279) {
                        final String d2 = aleq.d;
                        aler aler2;
                        if ((aler2 = aleq.f) == null) {
                            aler2 = aler.a;
                        }
                        apkk a;
                        if (aler2.b == 64128279) {
                            a = (apkk)aler2.c;
                        }
                        else {
                            a = apkk.a;
                        }
                        final aowm o = adgg.o(a);
                        if (adgg.r(a) && !TextUtils.isEmpty((CharSequence)d2) && o != null && !o.d.isEmpty()) {
                            afbh3 = afbh.k(new Pair((Object)d2, (Object)o));
                            break Label_0806;
                        }
                        afbh3 = afag.a;
                        break Label_0806;
                    }
                }
                afbh3 = afag.a;
            }
            if (afbh3.h()) {
                return afxr.l(((adrh)this).u(this.e.n(), true, (asmi)new achd(this, afbh3, 4)));
            }
            this.f.C("RegisterVideoTask Invalid registerVideoResponse.");
            return afxr.l(((adrh)this).t(this.e.m(apkh.e), true));
        }
    }
    
    public final asme f() {
        return adqi.b;
    }
    
    public final String g() {
        return "RegisterVideoTask";
    }
    
    public final boolean i() {
        return true;
    }
    
    public final boolean j(final adoj adoj) {
        return (adoj.b & 0x1) != 0x0;
    }
    
    public final admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof vnz) {
            final adgg e = this.e;
            final apkh e2 = apkh.e;
            adog adog;
            if ((adog = adoj.R) == null) {
                adog = adog.a;
            }
            adog.getClass();
            return ((adrh)this).t(e.H(e2, adog, (List)this.b.h, this.f), b);
        }
        return super.w(t, adoj, b);
    }
}
