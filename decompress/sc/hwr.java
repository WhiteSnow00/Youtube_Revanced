import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hwr extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arlc ag;
    private final Object ah;
    private boolean ai;
    
    public hwr() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aM() {
        if (this.ae == null) {
            this.ae = arlc.e(super.nT(), (br)this);
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
        this.aM();
        this.aL();
    }
    
    public final arlc aK() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arlc((br)this);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aL() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final hxm hxm = (hxm)this;
            final ess ess = (ess)ar;
            hxm.ah = ess.ak.aD();
            hxm.ai = (acgs)ess.b.jl.a();
            hxm.ak = (xnt)ess.b.iG.a();
            hxm.al = (abpq)ess.ak.k.a();
            hxm.am = (abpl)ess.ak.bU.a();
            hxm.an = (tgd)ess.b.h.a();
            hxm.ao = (ida)ess.ak.R.a();
            hxm.ap = (abnl)ess.ak.cM.a();
            hxm.aq = (kui)ess.ak.R.a();
            hxm.ar = (lag)ess.ak.t.a();
            hxm.aE = (vaf)ess.b.w.a();
            hxm.as = (gbu)ess.ak.aT.a();
            hxm.aA = (tqd)ess.b.ix.a();
            hxm.aB = (wyw)ess.b.iK.a();
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q(this, super.getDefaultViewModelProviderFactory());
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
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
