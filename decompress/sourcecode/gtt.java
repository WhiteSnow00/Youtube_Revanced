import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public class gtt extends LiveCreationActivity
{
    private boolean a;
    
    public gtt() {
        this.a = false;
        this.addOnContextAvailableListener((rc)new qn(this, 14));
    }
    
    public final void d() {
        if (!this.a) {
            this.a = true;
            final Object ar = this.aR();
            final MainLiveCreationActivity mainLiveCreationActivity = (MainLiveCreationActivity)this;
            final esm esm = (esm)ar;
            mainLiveCreationActivity.g = (View)esm.eO.a();
            mainLiveCreationActivity.h = (Handler)esm.b.G.a();
            mainLiveCreationActivity.i = (Executor)esm.b.r.a();
            mainLiveCreationActivity.j = (tdz)esm.b.h.a();
            mainLiveCreationActivity.k = (wom)esm.aX();
            mainLiveCreationActivity.l = (wog)esm.el.a();
            mainLiveCreationActivity.m = (zki)esm.b.aC.a();
            mainLiveCreationActivity.n = (zkw)esm.b.py.a();
            mainLiveCreationActivity.o = (wwv)esm.eP.a();
            mainLiveCreationActivity.ao = (tdg)esm.eQ.a();
            mainLiveCreationActivity.p = (req)esm.cR.a();
            mainLiveCreationActivity.q = (rgm)esm.b.aC.a();
            xkm.aF((LiveCreationActivity)mainLiveCreationActivity, esm.eR.a());
            mainLiveCreationActivity.r = (wjx)esm.dV.a();
            mainLiveCreationActivity.s = (oas)esm.b.e.a();
            mainLiveCreationActivity.t = wgv.e();
            mainLiveCreationActivity.u = esm.b.k();
            mainLiveCreationActivity.as = (adcr)esm.eS.a();
            mainLiveCreationActivity.am = (addr)esm.b.a.Q.a();
            mainLiveCreationActivity.v = (ScheduledExecutorService)esm.b.r.a();
            mainLiveCreationActivity.w = (wvu)esm.b.aw.a();
            mainLiveCreationActivity.x = arjc.b(esm.eT);
            mainLiveCreationActivity.y = esm.ao();
            final xkm xkm = (xkm)esm.b.a.dk.a();
            mainLiveCreationActivity.ak = (adno)esm.b.li.a();
            final zgv zgv = (zgv)esm.b.a.dM.a();
            mainLiveCreationActivity.z = (SharedPreferences)esm.b.d.a();
            mainLiveCreationActivity.A = (acsm)esm.b.a.bl.a();
            final riy riy = (riy)esm.b.a.dC.a();
            mainLiveCreationActivity.aj = new acss();
            mainLiveCreationActivity.ar = (adcr)esm.b.a.dO.a();
            mainLiveCreationActivity.al = (aagm)esm.b.a.dN.a();
            mainLiveCreationActivity.at = (qpt)esm.eX.a();
            mainLiveCreationActivity.ap = (aeby)esm.b.jW.a();
            mainLiveCreationActivity.aq = esm.Am();
            mainLiveCreationActivity.B = (osb)esm.b.fO.a();
            mainLiveCreationActivity.C = esm.au();
            mainLiveCreationActivity.bl((req)esm.cR.a());
            mainLiveCreationActivity.a = (gau)esm.aQ.a();
            mainLiveCreationActivity.b = (acup)esm.U.a();
            mainLiveCreationActivity.c = (tox)esm.b.dj.a();
        }
    }
}
