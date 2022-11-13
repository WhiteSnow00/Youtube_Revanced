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

class jhl extends jih implements arln
{
    private ContextWrapper bg;
    private boolean bh;
    private volatile arlc bi;
    private final Object bj;
    private boolean bk;
    
    public jhl() {
        this.bj = new Object();
        this.bk = false;
    }
    
    private final void bv() {
        if (this.bg == null) {
            this.bg = arlc.e(super.nT(), (br)this);
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
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
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
        return aa.cloneInContext((Context)arlc.f(aa, (br)this));
    }
    
    public final arlc p() {
        if (this.bi == null) {
            synchronized (this.bj) {
                if (this.bi == null) {
                    this.bi = new arlc((br)this);
                }
            }
        }
        return this.bi;
    }
    
    protected final void q() {
        if (!this.bk) {
            this.bk = true;
            final Object ar = this.aR();
            final jhl jhl = this;
            final ess ess = (ess)ar;
            ((ggq)jhl).av = arlr.b(ess.b.iK);
            ((ggq)jhl).az = (vaf)ess.b.w.a();
            ((ggq)jhl).aw = (gae)ess.ak.cl.a();
            ((ggq)jhl).ax = (ggr)ess.ak.Q.a();
            ((ggq)jhl).ay = (ghb)ess.ak.i.a();
            final eqy b = ess.b;
            final era a = b.a;
            jhl.a = a.bg;
            jhl.b = a.bh;
            jhl.c = (Executor)b.r.a();
            jhl.d = (Executor)ess.b.g.a();
            jhl.aZ = (blu)ess.b.a.r.a();
            jhl.aY = (skt)ess.ak.ci.a();
            jhl.e = (xao)ess.b.cB.a();
            jhl.aP = (vaf)ess.b.w.a();
            final SharedPreferences sharedPreferences = (SharedPreferences)ess.b.d.a();
            jhl.aW = (arwh)ess.b.v.a();
            jhl.ae = (fjv)ess.ak.z.a();
            jhl.af = (acyp)ess.b.a.bi.a();
            jhl.ag = (zmf)ess.b.aC.a();
            jhl.ah = (jxy)ess.ak.co.a();
            jhl.ai = (acwn)ess.ak.aB.a();
            jhl.ba = ess.ak.zn();
            jhl.bc = (aujg)ess.b.a.p.a();
            jhl.aX = ess.ak.yk();
            jhl.bd = ess.b.a.hc();
            jhl.aj = (adia)ess.b.ey.a();
            jhl.ak = (vcy)ess.ak.F.a();
            jhl.al = (acgs)ess.b.jl.a();
            jhl.aQ = (vai)ess.b.a.m.a();
            jhl.am = (gec)ess.ak.eM.a();
            jhl.aR = (vai)ess.b.a.q.a();
            final eqy b2 = ess.b;
            jhl.an = b2.eJ;
            jhl.aS = (vai)b2.ik.a();
            jhl.aT = ess.b.a.gE();
            jhl.aU = new vai((vaf)ess.b.w.a(), (arwh)ess.b.v.a(), (byte[])null, (byte[])null);
            jhl.be = (aeea)ess.ak.ao.a();
            jhl.bb = (e)ess.b.a.bu.a();
            jhl.aM = (wyv)ess.ak.o.a();
            jhl.aN = (acps)ess.ak.Y.a();
            jhl.aO = (adgc)ess.b.a.g.a();
            jhl.bf = (aeea)ess.b.kb.a();
        }
    }
}
