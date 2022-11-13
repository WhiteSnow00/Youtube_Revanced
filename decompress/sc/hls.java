import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hls extends acsf implements arln
{
    private ContextWrapper ae;
    private volatile arlc af;
    private final Object ak;
    private boolean al;
    
    public hls() {
        this.ak = new Object();
        this.al = false;
    }
    
    private final void aQ() {
        if (this.ae == null) {
            this.ae = arlc.e(super.nT(), (br)this);
            aqsz.s(super.nT());
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
        this.aQ();
        this.aL();
    }
    
    public final arlc aK() {
        if (this.af == null) {
            synchronized (this.ak) {
                if (this.af == null) {
                    this.af = new arlc((br)this);
                }
            }
        }
        return this.af;
    }
    
    protected final void aL() {
        if (!this.al) {
            this.al = true;
            final Object ar = this.aR();
            final hmr hmr = (hmr)this;
            final ess ess = (ess)ar;
            hmr.ae = (Context)ess.ak.W.a();
            hmr.af = (itg)ess.ak.cS.a();
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aK();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.aQ();
        this.aL();
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
