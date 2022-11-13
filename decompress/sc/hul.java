import com.google.android.gms.common.Feature;
import java.util.concurrent.Executor;
import java.io.IOException;
import java.util.concurrent.Future;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hul implements afty
{
    public final Object a;
    private final int b;
    
    public hul(final admv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final afty a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final ListenableFuture a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final gru a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final hun a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final ilc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final kra a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final mzl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final pie a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final pip a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final qdu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final qff a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final qqk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hul(final qqn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ListenableFuture a() {
        final int b = this.b;
        final boolean b2 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final qqn qqn = (qqn)a;
                final Uri uri = (Uri)afwm.u((Future)qqn.a);
                ListenableFuture listenableFuture;
                try {
                    listenableFuture = afwm.m(((qqn)a).b(uri));
                }
                catch (final IOException ex) {
                    final qqj qqj = new qqj(qqn, 2);
                    if (!(ex instanceof qog) && !(ex.getCause() instanceof qog)) {
                        listenableFuture = aftq.f(qqn.c.a(ex, (qpq)qqj), aeun.d((aftz)new pln(qqn, 10)), qqn.b);
                    }
                    else {
                        listenableFuture = afwm.l((Throwable)ex);
                    }
                }
                return listenableFuture;
            }
            case 19: {
                final qqn qqn2 = (qqn)this.a;
                return afwm.n(aftq.f(qqn2.a, aeun.d((aftz)new pln(qqn2, 9)), qqn2.b));
            }
            case 18: {
                final qqk qqk = (qqk)this.a;
                return aftq.e(afwm.n(qqk.b), (aezf)new lly((qpv)qqk.d, (Runnable)new qrd(qqk, 1), 16), (Executor)afum.a);
            }
            case 17: {
                return ((qff)this.a).c();
            }
            case 16: {
                return qdu.d((qdu)this.a);
            }
            case 15: {
                return ((qdu)this.a).ae();
            }
            case 14: {
                return afnd.q((ListenableFuture)this.a, (aezf)new pjv(3), (Executor)afum.a);
            }
            case 13: {
                return afnd.q(((afty)this.a).a(), (aezf)pjv.b, (Executor)afum.a);
            }
            case 12: {
                return afnd.q(((afty)this.a).a(), (aezf)pjv.c, (Executor)afum.a);
            }
            case 11: {
                return afnd.q(((afty)this.a).a(), (aezf)pjv.a, (Executor)afum.a);
            }
            case 10: {
                return ((pip)this.a).a();
            }
            case 9: {
                final Object a2 = this.a;
                final int a3 = pjs.a;
                final plc d = plc.d(afvn.a);
                final pie pie = (pie)a2;
                return (ListenableFuture)d.f((aftz)new phk(pie, 12), pie.j).f((aftz)new phk(pie, 13), pie.j).f((aftz)new phk(pie, 14), pie.j);
            }
            case 8: {
                final Object a4 = this.a;
                final int a5 = pjs.a;
                final pie pie2 = (pie)a4;
                return (ListenableFuture)plc.d(pie2.e()).f((aftz)new phk(pie2, 18), (Executor)afum.a).f((aftz)new phk(pie2, 19), pie2.j);
            }
            case 7: {
                final mzl mzl = (mzl)this.a;
                final mzc c = mzl.c;
                final mtj b3 = mtk.b();
                b3.a = (mtd)new mjb(3);
                b3.b = new Feature[] { mzb.a };
                b3.b();
                b3.c = 13801;
                return aftq.f(afsw.e(aftq.e((ListenableFuture)afvk.m(nbr.v(((mqw)c).t(b3.a()))), (aezf)lll.j, mzl.b), (Class)Exception.class, (aezf)lll.k, mzl.b), (aftz)new ila(mzl, 20), mzl.b);
            }
            case 6: {
                final mzl mzl2 = (mzl)this.a;
                return afwm.r((afty)new hul(mzl2, 7), mzl2.b);
            }
            case 5: {
                final kra kra = (kra)this.a;
                return ((aabo)kra.b.a()).a().l().h(kra.s);
            }
            case 4: {
                return afwm.m((Object)adds.ag((admv)this.a));
            }
            case 3: {
                return afwm.m((Object)((ilc)this.a).f.a());
            }
            case 2: {
                return afwm.m((Object)((ilc)this.a).f.a());
            }
            case 1: {
                return afwm.m((Object)((gru)this.a).a.a());
            }
            case 0: {
                final hun hun = (hun)this.a;
                boolean b4 = b2;
                if (hun.B.size() == 1) {
                    b4 = b2;
                    if (hun.v((adop)hun.B.get(0))) {
                        b4 = true;
                    }
                }
                return afwm.m((Object)b4);
            }
        }
    }
}
