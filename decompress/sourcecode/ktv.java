import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ktv extends acqj implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arin ag;
    private final Object ah;
    private boolean ai;
    
    public ktv() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aM() {
        if (this.ae == null) {
            this.ae = arin.e(super.nT(), (br)this);
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
        this.aM();
        this.aQ();
    }
    
    public final arin aK() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = this.aL();
                }
            }
        }
        return this.ag;
    }
    
    protected arin aL() {
        throw null;
    }
    
    protected final void aQ() {
        if (!this.ai) {
            this.ai = true;
            this.aR();
            final kug kug = (kug)this;
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.aM();
        this.aQ();
    }
    
    public Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aM();
        return (Context)this.ae;
    }
    
    public LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
