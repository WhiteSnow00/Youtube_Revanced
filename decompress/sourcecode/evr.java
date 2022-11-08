import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class evr extends ewb
{
    private boolean m;
    
    public evr() {
        this.m = false;
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 9));
    }
    
    public final void d() {
        if (!this.m) {
            this.m = true;
            final Object ar = ((evk)this).aR();
            final Shell_UrlActivity shell_UrlActivity = (Shell_UrlActivity)this;
            final esm esm = (esm)ar;
            final eqv b = esm.b;
            ((evt)shell_UrlActivity).a = b.a.cl;
            ((evt)shell_UrlActivity).b = (Handler)b.G.a();
            ((evt)shell_UrlActivity).k = (arud)esm.b.v.a();
            final vdq vdq = (vdq)esm.b.H.a();
            ((evt)shell_UrlActivity).c = aexq.k((Object)esm.c);
            final oas oas = (oas)esm.b.e.a();
            ((evt)shell_UrlActivity).d = (tmd)esm.b.I.a();
            ((evt)shell_UrlActivity).e = (ewl)esm.b.ie.a();
            ((evt)shell_UrlActivity).f = (tmf)esm.b.bS.a();
            final eqv b2 = esm.b;
            ((evt)shell_UrlActivity).g = b2.a.cm;
            ((evt)shell_UrlActivity).i = (uyf)b2.w.a();
            final uyi uyi = (uyi)esm.b.fp.a();
            final tlq tlq = (tlq)esm.b.m.a();
            ((evt)shell_UrlActivity).j = (uyi)esm.b.jO.a();
            ((evt)shell_UrlActivity).h = esm.b.jT;
        }
    }
}
