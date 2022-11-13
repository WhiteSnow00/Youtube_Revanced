import android.view.LayoutInflater;
import android.os.Bundle;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hxv extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aepz ag;
    private final Object ah;
    private boolean ai;
    
    public hxv() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aM() {
        if (this.ae == null) {
            this.ae = aepz.c(super.nT(), (br)this);
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
        this.aL();
    }
    
    public final aepz aK() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new aepz((br)this, true);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aL() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final hyb hyb = (hyb)this;
            final esr esr = (esr)ar;
            hyb.af = (vcy)esr.aN.k.a();
            hyb.ag = (zmf)esr.a.aC.a();
            hyb.ah = (zmt)esr.a.pz.a();
            hyb.ai = (wyv)esr.aN.j.a();
            esr.h();
            hyb.ax = vvq.j((Context)esr.a.c.a(), (zlv)esr.a.gy.a());
            final tgd tgd = (tgd)esr.a.h.a();
            hyb.aj = (tqd)esr.a.ix.a();
            hyb.ak = esr.Y;
            final esn an = esr.aN;
            hyb.aw = new ziy(an.c, an.k, esr.a.a.aG, esr.Z, esr.aa, (char[])null, (byte[])null, (byte[])null);
            final esn an2 = esr.aN;
            hyb.av = new vbs(an2.c, an2.k, esr.a.a.aH, esr.aa, (short[])null, (byte[])null);
            hyb.ay = (mdp)esr.a.a.aH.a();
            hyb.aA = new aujg(esr.aN.c, esr.ab, esr.ac, (byte[])null, (char[])null, (byte[])null, (byte[])null, (byte[])null);
            final hya p = ((lix)((arlm)((aeqe)esr.aN.g.a()).a()).aR()).P();
            p.getClass();
            hyb.al = p;
            hyb.aB = (aeea)esr.d.a();
            hyb.au = (fzw)esr.a.a.Y.a();
            hyb.az = new mdp((byte[])null, (char[])null);
            hyb.am = (Executor)esr.a.g.a();
            hyb.aC = (aeea)esr.a.kb.a();
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aK();
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.aM();
        this.aL();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aM();
        return (Context)this.ae;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)aepz.d(nj, (br)this));
    }
}
