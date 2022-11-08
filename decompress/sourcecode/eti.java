import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class eti extends bi implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aenz ag;
    private final Object ah;
    private boolean ai;
    
    public eti() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aK() {
        if (this.ae == null) {
            this.ae = aenz.c(super.nT(), (br)this);
            this.af = aqqn.s(super.nT());
        }
    }
    
    public void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arin.d((Context)ae) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aK();
        this.aS();
    }
    
    protected aenz aL() {
        throw null;
    }
    
    public final aenz aQ() {
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
            final etf etf = (etf)this;
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
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
    
    public LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)aenz.d(nj, (br)this));
    }
}
