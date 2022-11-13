import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class fwq extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aepz ag;
    private final Object ah;
    private boolean ai;
    
    public fwq() {
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
        this.aM();
    }
    
    public final aepz aL() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new aepz((br)this, true);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aM() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final fwn fwn = (fwn)this;
            final esr esr = (esr)ar;
            final esn an = esr.aN;
            fwn.ae = new ziy(an.c, an.k, esr.f, esr.g, esr.d, (int[])null);
            fwn.af = (aeea)esr.a.kb.a();
        }
    }
    
    public final Object aR() {
        return this.aL().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
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
        return nj.cloneInContext((Context)aepz.d(nj, (br)this));
    }
}
