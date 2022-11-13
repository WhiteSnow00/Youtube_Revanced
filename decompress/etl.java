import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class etl extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aepz ag;
    private final Object ah;
    private boolean ai;
    
    public etl() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aK() {
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
        this.aK();
        this.aS();
    }
    
    protected aepz aL() {
        throw null;
    }
    
    public final aepz aQ() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = this.aL();
                }
            }
        }
        return this.ag;
    }
    
    public final Object aR() {
        return this.aQ().aR();
    }
    
    protected final void aS() {
        if (!this.ai) {
            this.ai = true;
            this.aR();
            final eti eti = (eti)this;
        }
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aQ();
    }
    
    @Override
    public void lP(final Context context) {
        super.lP(context);
        this.aK();
        this.aS();
    }
    
    public Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aK();
        return (Context)this.ae;
    }
    
    @Override
    public LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)aepz.d(nj, (br)this));
    }
}
