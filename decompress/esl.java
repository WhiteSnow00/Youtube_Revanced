import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import android.content.Intent;
import j$.util.Optional;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import android.util.Log;
import android.os.Bundle;
import com.google.android.apps.youtube.app.bedtime.DataReminderController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esl implements Runnable
{
    public final Object a;
    private final int b;
    
    public esl(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final blu a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final DataReminderController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final eus a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final euw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final evx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final evy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final ewp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esl(final exn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        boolean b2 = false;
        switch (b) {
            default: {
                final blu blu = (blu)this.a;
                final Object c = blu.c;
                final rkc rkc = (rkc)((atke)blu.d).a();
                try {
                    final Bundle call = ((Context)rkc.a).getContentResolver().call(rgb.a, "get_wind_down_state_promo_eligibility", (String)null, (Bundle)null);
                    if (call != null) {
                        if (call.getInt("eligibility", 0) == 1) {
                            b2 = true;
                        }
                    }
                }
                finally {
                    final Throwable t;
                    Log.w("WindDownApi", "Unexpected error calling Digital Wellbeing", t);
                }
                ((atjm)c).tu((Object)b2);
                return;
            }
            case 19: {
                final exn exn = (exn)this.a;
                exn.a.removeCallbacks(exn.b);
                exn.h();
                return;
            }
            case 18: {
                final DataReminderController dataReminderController = (DataReminderController)this.a;
                final arkg f = dataReminderController.f;
                final arkg g = dataReminderController.g;
                final asid h = dataReminderController.h;
                final msr msr = (msr)f.a();
                asht.p((ashw)msr.M(), (ashw)dataReminderController.e.j().ai(), (ashw)DataReminderController.j((fjv)dataReminderController.c.a()).ai(), (asjn)exk.a).af(dataReminderController.d).ay((ashw)((hze)g.a()).a(), (asji)exl.a).q(tpe.cl(msr.K())).af(h).aH((asjm)new erz(dataReminderController, 7));
                return;
            }
            case 17: {
                final ewp ewp = (ewp)this.a;
                if (!tok.l(ewp.c.b(tok.a))) {
                    ewp.k(2);
                }
                if (ewp.n.compareAndSet(false, true) && ewp.c.b(tok.a) == 3) {
                    ((fkf)ewp.m.a()).a();
                }
                return;
            }
            case 16: {
                final ewp ewp2 = (ewp)this.a;
                if (!tok.l(ewp2.c.b(tok.a))) {
                    ewp2.k(2);
                }
                if (ewp2.n.compareAndSet(false, true) && ewp2.c.b(tok.a) == 3) {
                    ((fkf)ewp2.m.a()).a();
                }
                return;
            }
            case 15: {
                YouTubeBackupAgent.e((Context)this.a);
                return;
            }
            case 14: {
                final evy evy = (evy)this.a;
                aoqn aoqn;
                if ((aoqn = evy.f.b().s) == null) {
                    aoqn = aoqn.a;
                }
                ahub ahub;
                if ((ahub = aoqn.g) == null) {
                    ahub = ahub.a;
                }
                final int aw = aefb.aw(ahub.n);
                if (aw != 0) {
                    if (aw != 1) {
                        return;
                    }
                }
                if (((tjm)evy.c.a()).o()) {
                    final hzc hzc = (hzc)evy.b.a();
                    final vaf n = hzc.n;
                    final atke g2 = hzc.g;
                    final atke h2 = hzc.h;
                    Optional optional;
                    if ((hzc.k.e(tnu.am) & 0x1L) != 0x0L) {
                        optional = Optional.of((Object)tlu.d);
                    }
                    else {
                        optional = Optional.empty();
                    }
                    final vnu vnu = (vnu)hzc.f.a();
                    final fzw q = hzc.q;
                    final vns g3 = vnu.g((tjh)new ffb((tgd)q.b, (toj)q.a));
                    hzc.r(g3, vdb.a("FEwhat_to_watch"), false, g2, h2, hzc.p, optional);
                    hzc.e((vkk)g3);
                }
                return;
            }
            case 13: {
                final evx evx = (evx)this.a;
                alxw alxw;
                if ((alxw = evx.k.f().e) == null) {
                    alxw = alxw.a;
                }
                if (alxw.ae) {
                    evx.l(true);
                    evx.k((Intent)((atke)((aezv)evx.c).a).a());
                    return;
                }
                if (!evx.l(false)) {
                    if (evx.m()) {
                        evx.overridePendingTransition(17432576, 17432577);
                        evx.finish();
                    }
                    return;
                }
                if (evx.g() == 0) {
                    evx.k(evx.h());
                    return;
                }
                evx.b.postDelayed((Runnable)new esl(evx, 10), (long)evx.g());
                return;
            }
            case 12: {
                final evx evx2 = (evx)this.a;
                final int e = evx2.e();
                evx2.f.f(tok.b, e);
                ((atjm)((avu)evx2.g.a()).a).tu((Object)new ewg(e));
                return;
            }
            case 11: {
                glb.c((Context)this.a);
                return;
            }
            case 10: {
                final evx evx3 = (evx)this.a;
                evx3.k(evx3.h());
                return;
            }
            case 9: {
                final euw euw = (euw)this.a;
                if (euw.h.h() && (((ahve)euw.h.c()).b & 0x800) != 0x0) {
                    aiqj aiqj;
                    if ((aiqj = ((ahve)euw.h.c()).i) == null) {
                        aiqj = aiqj.a;
                    }
                    if (((ahbc)aiqj).ry((ahaq)AppStoreEndpointOuterClass.appStoreEndpoint)) {
                        aiqj aiqj2;
                        if ((aiqj2 = ((ahve)euw.h.c()).i) == null) {
                            aiqj2 = aiqj.a;
                        }
                        final ahvd ahvd = (ahvd)((ahbc)aiqj2).rx((ahaq)AppStoreEndpointOuterClass.appStoreEndpoint);
                        tcg.e(euw.c, ahvd.b, ahvd.c);
                        euw.a();
                        return;
                    }
                }
                qdw.w((shm)null, "[LastMileDeliveryPresenter] Tried to show AlleyOop but command is absent or missing learn more.");
                return;
            }
            case 8: {
                final euw euw2 = (euw)this.a;
                if (euw2.h.h() && (((ahve)euw2.h.c()).b & 0x800) != 0x0) {
                    final vcy e2 = euw2.e;
                    aiqj aiqj3;
                    if ((aiqj3 = ((ahve)euw2.h.c()).i) == null) {
                        aiqj3 = aiqj.a;
                    }
                    e2.a(aiqj3);
                    return;
                }
                qdw.w((shm)null, "[LastMileDeliveryPresenter] Tried to show AlleyOop but command is absent or missing learn more.");
                return;
            }
            case 7: {
                final euw euw3 = (euw)this.a;
                if (euw3.h.h() && (((ahve)euw3.h.c()).b & 0x800) != 0x0) {
                    final vcy e3 = euw3.e;
                    aiqj aiqj4;
                    if ((aiqj4 = ((ahve)euw3.h.c()).i) == null) {
                        aiqj4 = aiqj.a;
                    }
                    e3.a(aiqj4);
                    return;
                }
                qdw.w((shm)null, "[LastMileDeliveryPresenter] Tried to show AlleyOop but command is absent or missing learn more.");
                return;
            }
            case 6: {
                final eus eus = (eus)this.a;
                if (eus.f.a() == abjv.c) {
                    final eux a = eus.f.a;
                    final int f2 = a.f;
                    if (f2 != 1 && f2 != 2) {
                        a.f = 2;
                        eus.d();
                    }
                }
                return;
            }
            case 5: {
                final aezp b3 = ((eus)this.a).b;
                if (b3.h()) {
                    ((euw)b3.c()).a();
                    return;
                }
                qdw.x("[DefaultLastMileDelivery] Unable to dismiss LMD when presenter is absent.");
                return;
            }
            case 4: {
                ((fmo)((esm)this.a).bu.a()).f();
                return;
            }
            case 3: {
                ((wxl)((esm)this.a).ad.a()).b();
                return;
            }
            case 2: {
                ((tcl)((esm)this.a).aa.a()).b();
                return;
            }
            case 1: {
                ((esm)this.a).e(true);
                return;
            }
            case 0: {
                ((wxx)((esm)this.a).az.a()).b();
            }
        }
    }
}
