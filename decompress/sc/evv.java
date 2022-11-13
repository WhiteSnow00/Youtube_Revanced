import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class evv extends ewf
{
    private boolean m;
    
    public evv() {
        this.m = false;
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 9));
    }
    
    public final void d() {
        if (!this.m) {
            this.m = true;
            final Object ar = ((evo)this).aR();
            final Shell_UrlActivity shell_UrlActivity = (Shell_UrlActivity)this;
            final esp esp = (esp)ar;
            final eqy b = esp.b;
            ((evx)shell_UrlActivity).a = b.a.cm;
            ((evx)shell_UrlActivity).b = (Handler)b.G.a();
            ((evx)shell_UrlActivity).k = (arwh)esp.b.v.a();
            final vfr vfr = (vfr)esp.b.H.a();
            ((evx)shell_UrlActivity).c = aezp.k((Object)esp.c);
            final oby oby = (oby)esp.b.e.a();
            ((evx)shell_UrlActivity).d = (toj)esp.b.I.a();
            ((evx)shell_UrlActivity).e = (ewp)esp.b.ih.a();
            ((evx)shell_UrlActivity).f = (tol)esp.b.bS.a();
            final eqy b2 = esp.b;
            ((evx)shell_UrlActivity).g = b2.a.cn;
            ((evx)shell_UrlActivity).i = (vaf)b2.w.a();
            final vai vai = (vai)esp.b.fs.a();
            final tnu tnu = (tnu)esp.b.m.a();
            ((evx)shell_UrlActivity).j = (vai)esp.b.jS.a();
            ((evx)shell_UrlActivity).h = esp.b.jX;
        }
    }
}
