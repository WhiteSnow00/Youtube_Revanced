import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class adac extends bi implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arin ag;
    private final Object ah;
    private boolean ai;
    
    public adac() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private void aM() {
        if (this.ae == null) {
            this.ae = arin.e(super.nT(), (br)this);
            this.af = aqqn.s(super.nT());
        }
    }
    
    public void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arin.d((Context)ae) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aM();
        this.aK();
    }
    
    public void aK() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final adam adam = (adam)this;
            final esp esp = (esp)ar;
            adam.ao = (adbj)esp.b.a.ev.a();
            adam.aG = (adbl)esp.b.a.ew.a();
            adam.ap = arjc.b(esp.al.a.E);
            adam.aq = arjc.b(esp.al.a.F);
            adam.ar = (Handler)esp.b.G.a();
            adam.as = (Executor)esp.b.g.a();
            adam.aJ = (aeby)esp.al.bp.a();
            adam.at = (wwv)esp.b.iG.a();
            adam.au = (tny)esp.b.it.a();
            adam.av = (tdz)esp.b.h.a();
            adam.aw = (ScheduledExecutorService)esp.b.r.a();
            adam.ax = (aftr)esp.b.E.a();
            adam.ay = (aceo)esp.b.jh.a();
            adam.az = (vmt)esp.b.a.cT.a();
            adam.aA = (daw)esp.b.fr.a();
            adam.aB = (SharedPreferences)esp.b.d.a();
            adam.aI = (aeby)esp.al.am.a();
            adam.aH = (aeby)esp.al.S.a();
            adam.aC = (vax)esp.al.E.a();
            adam.aD = (oas)esp.b.e.a();
            adam.aF = (uyf)esp.b.w.a();
            adam.aE = esp.al.a.j();
            final aeby aeby = (aeby)esp.b.jW.a();
        }
    }
    
    public final arin aL() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arin((br)this);
                }
            }
        }
        return this.ag;
    }
    
    public final Object aR() {
        return this.aL().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.aM();
        this.aK();
    }
    
    public Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aM();
        return (Context)this.ae;
    }
    
    public LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
