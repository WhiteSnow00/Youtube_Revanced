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

class adcg extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arlc ag;
    private final Object ah;
    private boolean ai;
    
    public adcg() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private void aM() {
        if (this.ae == null) {
            this.ae = arlc.e(super.nT(), (br)this);
            this.af = aqsz.s(super.nT());
        }
    }
    
    public void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arlc.d((Context)ae) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aM();
        this.aK();
    }
    
    public void aK() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final adcp adcp = (adcp)this;
            final ess ess = (ess)ar;
            adcp.ao = (addm)ess.b.a.ev.a();
            adcp.aG = (addo)ess.b.a.ew.a();
            adcp.ap = arlr.b(ess.ak.a.K);
            adcp.aq = arlr.b(ess.ak.a.L);
            adcp.ar = (Handler)ess.b.G.a();
            adcp.as = (Executor)ess.b.g.a();
            adcp.aJ = (aeea)ess.ak.br.a();
            adcp.at = (wyw)ess.b.iK.a();
            adcp.au = (tqd)ess.b.ix.a();
            adcp.av = (tgd)ess.b.h.a();
            adcp.aw = (ScheduledExecutorService)ess.b.r.a();
            adcp.ax = (afvs)ess.b.E.a();
            adcp.ay = (acgs)ess.b.jl.a();
            adcp.az = (vox)ess.b.a.cU.a();
            adcp.aA = (dax)ess.b.fu.a();
            adcp.aB = (SharedPreferences)ess.b.d.a();
            adcp.aI = (aeea)ess.ak.ao.a();
            adcp.aH = (aeea)ess.ak.T.a();
            adcp.aC = (vcy)ess.ak.F.a();
            adcp.aD = (oby)ess.b.e.a();
            adcp.aF = (vaf)ess.b.w.a();
            adcp.aE = ess.ak.a.k();
            final aeea aeea = (aeea)ess.b.kb.a();
        }
    }
    
    public final arlc aL() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arlc((br)this);
                }
            }
        }
        return this.ag;
    }
    
    public final Object aR() {
        return this.aL().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aL();
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
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
