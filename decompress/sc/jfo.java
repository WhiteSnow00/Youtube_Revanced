import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jfo extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arlc ag;
    private final Object ah;
    private boolean ai;
    
    public jfo() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aK() {
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
        this.aK();
        this.aM();
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
    
    protected final void aM() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final jfn jfn = (jfn)this;
            final ess ess = (ess)ar;
            jfn.ae = (vcy)ess.ak.F.a();
            jfn.aq = (ziy)ess.ak.U.a();
            jfn.ao = (cya)ess.ak.aX.a();
            final atke f = ess.ak.F;
            final eqy b = ess.b;
            jfn.ap = new aln(f, b.jL, b.ka, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            jfn.af = (vuf)ess.b.a.aF.a();
            jfn.ag = (tqd)ess.b.ix.a();
            jfn.ah = (tgd)ess.b.h.a();
            jfn.an = (vai)ess.b.ka.a();
        }
    }
    
    public final Object aR() {
        return this.aL().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q(this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aL();
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.aK();
        this.aM();
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
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
