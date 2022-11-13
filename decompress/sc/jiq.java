import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jiq extends jih implements arln
{
    private ContextWrapper bg;
    private boolean bh;
    private volatile aepz bi;
    private final Object bj;
    private boolean bk;
    
    public jiq() {
        this.bj = new Object();
        this.bk = false;
    }
    
    private final void bv() {
        if (this.bg == null) {
            this.bg = aepz.c(super.nT(), (br)this);
            this.bh = aqsz.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper bg = this.bg;
        boolean b = true;
        if (bg != null) {
            b = (arlc.d((Context)bg) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.bv();
        this.q();
    }
    
    public final Object aR() {
        return this.p().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.p();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.bv();
        this.q();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.bh) {
            return null;
        }
        this.bv();
        return (Context)this.bg;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aepz.d(aa, (br)this));
    }
    
    public final aepz p() {
        if (this.bi == null) {
            synchronized (this.bj) {
                if (this.bi == null) {
                    this.bi = new aepz((br)this, true);
                }
            }
        }
        return this.bi;
    }
    
    protected final void q() {
        if (!this.bk) {
            this.bk = true;
            final Object ar = this.aR();
            final jiq jiq = this;
            final esr esr = (esr)ar;
            ((ggq)jiq).av = arlr.b(esr.a.iK);
            ((ggq)jiq).az = (vaf)esr.a.w.a();
            ((ggq)jiq).aw = esr.aN.e();
            ((ggq)jiq).ax = esr.aN.i();
            ((ggq)jiq).ay = (ghb)esr.aN.C.a();
            final eqy a = esr.a;
            final era a2 = a.a;
            jiq.a = a2.bg;
            jiq.b = a2.bh;
            jiq.c = (Executor)a.r.a();
            jiq.d = (Executor)esr.a.g.a();
            jiq.aZ = (blu)esr.a.a.r.a();
            jiq.aY = esr.aN.aU();
            jiq.e = (xao)esr.a.cB.a();
            jiq.aP = (vaf)esr.a.w.a();
            final SharedPreferences sharedPreferences = (SharedPreferences)esr.a.d.a();
            jiq.aW = (arwh)esr.a.v.a();
            jiq.ae = esr.aN.d();
            jiq.af = (acyp)esr.a.a.bi.a();
            jiq.ag = (zmf)esr.a.aC.a();
            jiq.ah = esr.aN.s();
            jiq.ai = (acwn)esr.aN.O.a();
            jiq.ba = esr.aF();
            jiq.bc = (aujg)esr.a.a.p.a();
            jiq.aX = esr.aD();
            jiq.bd = esr.a.a.hc();
            jiq.aj = (adia)esr.a.ey.a();
            jiq.ak = (vcy)esr.aN.k.a();
            jiq.al = (acgs)esr.a.jl.a();
            jiq.aQ = (vai)esr.a.a.m.a();
            jiq.am = esr.aN.h();
            jiq.aR = (vai)esr.a.a.q.a();
            final eqy a3 = esr.a;
            jiq.an = a3.eJ;
            jiq.aS = (vai)a3.ik.a();
            jiq.aT = esr.a.a.gE();
            jiq.aU = new vai((vaf)esr.a.w.a(), (arwh)esr.a.v.a(), (byte[])null, (byte[])null);
            jiq.be = (aeea)esr.d.a();
            jiq.bb = (e)esr.a.a.bu.a();
            jiq.aM = (wyv)esr.aN.j.a();
            jiq.aN = (acps)esr.aN.Q.a();
            jiq.aO = (adgc)esr.a.a.g.a();
            jiq.bf = (aeea)esr.a.kb.a();
        }
    }
}
