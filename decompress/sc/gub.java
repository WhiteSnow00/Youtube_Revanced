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

public class gub extends LiveCreationActivity
{
    private boolean a;
    
    public gub() {
        this.a = false;
        this.addOnContextAvailableListener((rc)new qn(this, 14));
    }
    
    public final void d() {
        if (!this.a) {
            this.a = true;
            final Object ar = this.aR();
            final MainLiveCreationActivity mainLiveCreationActivity = (MainLiveCreationActivity)this;
            final esp esp = (esp)ar;
            mainLiveCreationActivity.g = (View)esp.eP.a();
            mainLiveCreationActivity.h = (Handler)esp.b.G.a();
            mainLiveCreationActivity.i = (Executor)esp.b.r.a();
            mainLiveCreationActivity.j = (tgd)esp.b.h.a();
            mainLiveCreationActivity.k = (wqm)esp.ba();
            mainLiveCreationActivity.l = (wqi)esp.en.a();
            mainLiveCreationActivity.m = (zmf)esp.b.aC.a();
            mainLiveCreationActivity.n = (zmt)esp.b.pz.a();
            mainLiveCreationActivity.o = (wyw)esp.eQ.a();
            mainLiveCreationActivity.ap = (sqq)esp.eR.a();
            mainLiveCreationActivity.p = (rgs)esp.cT.a();
            mainLiveCreationActivity.q = (riq)esp.b.aC.a();
            xmm.ar((LiveCreationActivity)mainLiveCreationActivity, esp.eS.a());
            mainLiveCreationActivity.r = (wlx)esp.dX.a();
            mainLiveCreationActivity.s = (oby)esp.b.e.a();
            mainLiveCreationActivity.t = wji.e();
            mainLiveCreationActivity.u = esp.b.l();
            mainLiveCreationActivity.am = (xib)esp.eT.a();
            mainLiveCreationActivity.ao = (adfs)esp.b.a.Q.a();
            mainLiveCreationActivity.v = (ScheduledExecutorService)esp.b.r.a();
            mainLiveCreationActivity.w = (wxx)esp.b.aw.a();
            mainLiveCreationActivity.x = arlr.b(esp.eU);
            mainLiveCreationActivity.y = esp.ap();
            final xmm xmm = (xmm)esp.b.a.dl.a();
            mainLiveCreationActivity.al = (adpp)esp.b.lm.a();
            final zis zis = (zis)esp.b.a.dM.a();
            mainLiveCreationActivity.z = (SharedPreferences)esp.b.d.a();
            mainLiveCreationActivity.A = (acuq)esp.b.a.bl.a();
            final rlc rlc = (rlc)esp.b.a.dC.a();
            mainLiveCreationActivity.aj = new acuw();
            mainLiveCreationActivity.as = (aeea)esp.b.a.dO.a();
            mainLiveCreationActivity.ak = (qqr)esp.b.a.dN.a();
            mainLiveCreationActivity.at = (pvh)esp.eY.a();
            mainLiveCreationActivity.ar = (aeea)esp.b.kb.a();
            mainLiveCreationActivity.aq = esp.Am();
            mainLiveCreationActivity.B = (otk)esp.b.fR.a();
            mainLiveCreationActivity.C = esp.as();
            mainLiveCreationActivity.bm((rgs)esp.cT.a());
            mainLiveCreationActivity.a = (gbc)esp.aS.a();
            mainLiveCreationActivity.b = (acwt)esp.V.a();
            mainLiveCreationActivity.c = (trc)esp.b.dj.a();
        }
    }
}
