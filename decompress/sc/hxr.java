import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hxr extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aepz ag;
    private final Object ah;
    private boolean ai;
    
    public hxr() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aK() {
        if (this.ae == null) {
            this.ae = aepz.c(super.nT(), (br)this);
            this.af = aqsz.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arlc.d((Context)ae) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aK();
        this.aQ();
    }
    
    public final aepz aP() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new aepz((br)this, true);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aQ() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final hxa hxa = (hxa)this;
            final esr esr = (esr)ar;
            hxa.ao = (wyw)esr.a.iK.a();
            hxa.av = (fzw)esr.a.a.Y.a();
            final eqy a = esr.a;
            hxa.aw = new qcy(a.a.aF, a.ix, esr.d, esr.r, a.h, a.bp, esr.T, (byte[])null, (byte[])null);
            final esn an = esr.aN;
            final gkv x = ((liw)((arlm)((aeqe)an.g.a()).a()).aR()).x();
            x.getClass();
            final vai vai = (vai)an.b.ka.a();
            tvr ap;
            if (vai.aU() && vai.aV()) {
                ap = mft.H(x, 2132084306, 2132084308);
            }
            else {
                ap = mft.H(x, 2132084305, 2132084307);
            }
            hxa.ap = ap;
            hxa.au = new fzw(esr.aN.O(), (vcy)esr.aN.k.a());
            hxa.aq = (tgd)esr.a.h.a();
            hxa.ar = (gbc)esr.U.a();
            hxa.as = (gbu)esr.V.a();
            hxa.at = (vai)esr.a.ka.a();
            hxa.ax = esr.aN.bk();
        }
    }
    
    public final Object aR() {
        return this.aP().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aP();
    }
    
    @Override
    public void lP(final Context context) {
        super.lP(context);
        this.aK();
        this.aQ();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aK();
        return (Context)this.ae;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)aepz.d(nj, (br)this));
    }
}
