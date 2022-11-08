import java.util.List;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eup implements eug, euf, uut
{
    public final Activity a;
    public final aexq b;
    public final eus c;
    public final ScheduledExecutorService d;
    public aexq e;
    public euv f;
    public aexq g;
    public final qcv h;
    private final euh i;
    private final utk j;
    private final Executor k;
    private final acoh l;
    private aexq m;
    private boolean n;
    
    public eup(final euh i, final Activity a, final qcv h, final eus c, final acoh l, final wwv wwv, final utk j, final Executor k, final ScheduledExecutorService d, final rnv rnv, final rnu rnu, final sgl sgl, final vax vax, final arud arud, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = i;
        this.h = h;
        this.a = a;
        this.c = c;
        this.l = l;
        this.d = d;
        this.j = j;
        this.k = k;
        if (a.getWindow() != null) {
            this.b = aexq.k((Object)new eut(a, h, c, wwv, rnv, rnu, sgl, vax, k, arud, null, null, null, null));
        }
        else {
            qcv.A((sfh)null, "[DefaultLastMileDelivery] Received an activity without a window (will not be able to show LastMileDelivery)");
            this.b = aewp.a;
        }
        (this.f = new euv()).e(tmy.bo((Context)a));
        this.n = false;
        final aewp a2 = aewp.a;
        this.m = a2;
        this.g = a2;
        this.e = a2;
    }
    
    public final void a(final ahtg ahtg) {
        this.g = aexq.k((Object)ahtg);
        this.i.n(this);
        if (!this.n) {
            this.j.E().i((uut)this);
            this.n = true;
        }
        this.c();
        this.d();
        final eus c = this.c;
        if (!c.a.h()) {
            final qcv h = c.h;
            qcv.A((sfh)null, "[LastMileDeliveryExternallyManagedSlotAdapter] received command to show LastMileDelivery outside of an ad experience(without an available companion).");
            return;
        }
        final qbo g = c.g;
        final sfh sfh = (sfh)c.a.c();
        final ahjr ahjr = (ahjr)c.c.f();
        final String ag = ((eg)g.c).ag(ahne.aM, sfh.a);
        c.b = aexq.k((Object)sdr.d(ag, ahne.aM, 4, afcr.q(), afcr.q(), afcr.q(), aexq.j((Object)ahjr), aexq.k((Object)((ggc)g.d).d(sfh, ag, ahne.aM, 4, ahjr)), sbg.a));
        c.h((sfh)c.a.c(), (sdr)c.b.c(), sdm.a);
        c.i((sfh)c.a.c(), (sdr)c.b.c(), sdm.a);
        c.d = true;
    }
    
    public final void c() {
        (this.f = new euv()).e(tmy.bo((Context)this.a));
        final euv f = this.f;
        final boolean p = this.i.p();
        final euu a = f.a;
        if (a.b != p) {
            a.b = p;
            a.a();
        }
        if (this.f.b()) {
            this.m = this.i.l();
        }
        this.f.d(this.i.o());
        if (this.i.m().h()) {
            this.f.f((abid)this.i.m().c());
        }
        if (this.m.h() && this.j.w()) {
            final String h = this.j.h();
            final euv f2 = this.f;
            boolean b = false;
            if (h != null) {
                b = b;
                if (((List)this.m.e((Object)afcr.q())).contains(h)) {
                    b = true;
                }
            }
            f2.h(b);
        }
    }
    
    public final void d() {
        if (!this.b.h()) {
            return;
        }
        final abid a = this.f.a();
        final int g = this.f.g();
        final boolean inMultiWindowMode = this.l.isInMultiWindowMode();
        final boolean bq = tmy.bq((Context)this.a);
        int n2;
        final int n = n2 = 0;
        if (bq) {
            n2 = n;
            if (a != abid.c) {
                n2 = n;
                if (this.f.c()) {
                    n2 = 1;
                }
            }
        }
        if (g == 1 || inMultiWindowMode || n2 != 0) {
            if (((eut)this.b.c()).g) {
                this.k.execute(aesm.h((Runnable)new esi(this, 6)));
            }
            return;
        }
        if (!this.g.h()) {
            return;
        }
        if (a != abid.a && a != abid.c) {
            qcv.v("[DefaultLastMileDelivery] Unable to show ovleray for invalid player visibility state: ".concat(String.valueOf(String.valueOf(a))));
            return;
        }
        this.k.execute(aesm.h((Runnable)new euo(this, a)));
        if (g == 2) {
            final eut eut = (eut)this.b.c();
            aeai aeai;
            if (qcv.P(eut.j)) {
                if (!eut.h.h()) {
                    return;
                }
                aeai = adwd.P((String)null, ((ahtg)eut.h.c()).c);
            }
            else {
                if (!eut.a.h()) {
                    return;
                }
                aeai = adwd.P((String)eut.a.c(), (String)null);
            }
            ((aeac)eut.k.a).a(aeai, eut, 2);
            return;
        }
        final eut eut2 = (eut)this.b.c();
        aeai aeai2;
        if (qcv.P(eut2.j)) {
            if (!eut2.h.h()) {
                return;
            }
            aeai2 = adwd.P((String)null, ((ahtg)eut2.h.c()).c);
        }
        else {
            if (!eut2.a.h()) {
                return;
            }
            aeai2 = adwd.P((String)eut2.a.c(), (String)null);
        }
        ((aeac)eut2.k.a).a(aeai2, eut2, 1);
    }
    
    public final void pw(final utd utd) {
        final int g = this.f.g();
        final boolean b = false;
        if (utd != null && utd.C() != null) {
            final ajnl c = utd.C();
            if (c != null) {
                final String w = vem.w(c);
                final euv f = this.f;
                boolean b2 = b;
                if (w != null) {
                    b2 = b;
                    if (((List)this.m.e((Object)afcr.q())).contains(w)) {
                        b2 = true;
                    }
                }
                f.h(b2);
            }
        }
        else {
            this.f.h(false);
        }
        if (g == this.f.g()) {
            return;
        }
        this.d();
    }
}
