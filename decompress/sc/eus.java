import java.util.List;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eus implements euj, eui, uwn
{
    public final Activity a;
    public final aezp b;
    public final euv c;
    public final ScheduledExecutorService d;
    public aezp e;
    public euy f;
    public aezp g;
    public final qdw h;
    private final euk i;
    private final uve j;
    private final Executor k;
    private final acql l;
    private aezp m;
    private boolean n;
    
    public eus(final euk i, final Activity a, final qdw h, final euv c, final acql l, final wyw wyw, final uve j, final Executor k, final ScheduledExecutorService d, final rpz rpz, final rpy rpy, final siq siq, final vcy vcy, final arwh arwh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.i = i;
        this.h = h;
        this.a = a;
        this.c = c;
        this.l = l;
        this.d = d;
        this.j = j;
        this.k = k;
        if (a.getWindow() != null) {
            this.b = aezp.k((Object)new euw(a, h, c, wyw, rpz, rpy, siq, vcy, k, arwh, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        }
        else {
            qdw.w((shm)null, "[DefaultLastMileDelivery] Received an activity without a window (will not be able to show LastMileDelivery)");
            this.b = (aezp)aeyo.a;
        }
        (this.f = new euy()).e(tpe.bo((Context)a));
        this.n = false;
        final aeyo a2 = aeyo.a;
        this.m = (aezp)a2;
        this.g = (aezp)a2;
        this.e = (aezp)a2;
    }
    
    public final void a(final ahve ahve) {
        this.g = aezp.k((Object)ahve);
        this.i.n((euj)this);
        if (!this.n) {
            this.j.E().i((uwn)this);
            this.n = true;
        }
        this.c();
        this.d();
        final euv c = this.c;
        if (!c.a.h()) {
            final qdw h = c.h;
            qdw.w((shm)null, "[LastMileDeliveryExternallyManagedSlotAdapter] received command to show LastMileDelivery outside of an ad experience(without an available companion).");
            return;
        }
        final qcy g = c.g;
        final shm shm = (shm)c.a.c();
        final ahlp ahlp = (ahlp)c.c.f();
        final String r = ((eg)g.c).R(ahpc.aN, shm.a);
        c.b = aezp.k((Object)sfw.d(r, ahpc.aN, 4, afeq.q(), afeq.q(), afeq.q(), aezp.j((Object)ahlp), aezp.k((Object)((ggj)g.d).d(shm, r, ahpc.aN, 4, ahlp)), sdl.a));
        ((rpn)c).h((shm)c.a.c(), (sfw)c.b.c(), sfr.a);
        ((rpn)c).i((shm)c.a.c(), (sfw)c.b.c(), sfr.a);
        c.d = true;
    }
    
    public final void c() {
        (this.f = new euy()).e(tpe.bo((Context)this.a));
        final euy f = this.f;
        final boolean p = this.i.p();
        final eux a = f.a;
        if (a.b != p) {
            a.b = p;
            a.a();
        }
        if (this.f.b()) {
            this.m = this.i.l();
        }
        this.f.d(this.i.o());
        if (this.i.m().h()) {
            this.f.f((abjv)this.i.m().c());
        }
        if (this.m.h() && this.j.w()) {
            final String h = this.j.h();
            final euy f2 = this.f;
            boolean b = false;
            if (h != null) {
                b = b;
                if (((List)this.m.e((Object)afeq.q())).contains(h)) {
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
        final abjv a = this.f.a();
        final int g = this.f.g();
        final boolean inMultiWindowMode = this.l.isInMultiWindowMode();
        final boolean bq = tpe.bq((Context)this.a);
        int n2;
        final int n = n2 = 0;
        if (bq) {
            n2 = n;
            if (a != abjv.c) {
                n2 = n;
                if (this.f.c()) {
                    n2 = 1;
                }
            }
        }
        if (g == 1 || inMultiWindowMode || n2 != 0) {
            if (((euw)this.b.c()).g) {
                this.k.execute(aeun.h((Runnable)new esl(this, 5)));
            }
            return;
        }
        if (!this.g.h()) {
            return;
        }
        if (a != abjv.a && a != abjv.c) {
            qdw.r("[DefaultLastMileDelivery] Unable to show ovleray for invalid player visibility state: ".concat(String.valueOf(String.valueOf(a))));
            return;
        }
        this.k.execute(aeun.h((Runnable)new eur(this, a)));
        if (g == 2) {
            final euw euw = (euw)this.b.c();
            aeck aeck;
            if (qdw.L(euw.j)) {
                if (!euw.h.h()) {
                    return;
                }
                aeck = adyf.v((String)null, ((ahve)euw.h.c()).c);
            }
            else {
                if (!euw.a.h()) {
                    return;
                }
                aeck = adyf.v((String)euw.a.c(), (String)null);
            }
            ((aece)euw.k.a).a(aeck, (aecj)euw, 2);
            return;
        }
        final euw euw2 = (euw)this.b.c();
        aeck aeck2;
        if (qdw.L(euw2.j)) {
            if (!euw2.h.h()) {
                return;
            }
            aeck2 = adyf.v((String)null, ((ahve)euw2.h.c()).c);
        }
        else {
            if (!euw2.a.h()) {
                return;
            }
            aeck2 = adyf.v((String)euw2.a.c(), (String)null);
        }
        ((aece)euw2.k.a).a(aeck2, (aecj)euw2, 1);
    }
    
    public final void pA(final uux uux) {
        final int g = this.f.g();
        final boolean b = false;
        if (uux != null && uux.B() != null) {
            final ajpq b2 = uux.B();
            if (b2 != null) {
                final String z = vdh.z(b2);
                final euy f = this.f;
                boolean b3 = b;
                if (z != null) {
                    b3 = b;
                    if (((List)this.m.e((Object)afeq.q())).contains(z)) {
                        b3 = true;
                    }
                }
                f.h(b3);
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
