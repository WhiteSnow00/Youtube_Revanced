import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hce extends uez implements arln
{
    private ContextWrapper a;
    private boolean b;
    private volatile aepz c;
    private final Object d;
    private boolean e;
    
    public hce() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = aepz.c(super.nT(), (br)this);
            this.b = aqsz.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arlc.d((Context)a) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.a();
        this.bh();
    }
    
    public final Object aR() {
        return this.bg().aR();
    }
    
    public final aepz bg() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aepz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void bh() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hcd hcd = (hcd)this;
            final esr esr = (esr)ar;
            final eqy a = esr.a;
            final esu al = esr.aL;
            final eso am = esr.aM;
            ((uez)hcd).aF = (uew)new eri(a, esr.aN, 0);
            hcd.d = (Executor)a.g.a();
            hcd.e = esr.aN.J();
            hcd.ae = (gkx)esr.a.fr.a();
            hcd.aC = (aujg)esr.a.a.ar.a();
            hcd.af = (vcy)esr.aN.k.a();
            hcd.ag = (hdp)new hdq((br)((arlt)esr.b).a, (AccountId)esr.aL.c.a());
            hcd.ah = (hgv)esr.aN.R();
            hcd.az = esr.aN.ag();
            hcd.ai = (wyw)esr.h.a();
            hcd.aE = (aeea)esr.i.a();
            hcd.aj = esr.aN.K();
            hcd.aA = (qqr)esr.a.a.aA.a();
            hcd.ak = (ubi)esr.aN.I.a();
            hcd.al = (ueu)esr.aN.N.a();
            hcd.am = (ucb)esr.aN.M.a();
            final hcb g = ((gvr)((arlm)((aeqe)esr.aN.g.a()).a()).aR()).G();
            g.getClass();
            hcd.an = g;
            hcd.aB = esr.aN.bg();
            hcd.ao = (AccountId)esr.aL.c.a();
            hcd.ap = (han)esr.aN.l();
            hcd.aD = (aeea)esr.a.kb.a();
            hcd.aq = (Context)esr.aN.K.a();
        }
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.bg();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.bh();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aepz.d(aa, (br)this));
    }
}
