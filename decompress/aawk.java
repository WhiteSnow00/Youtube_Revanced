import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class aawk extends acrs implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arlc ag;
    private final Object ah;
    private boolean ai;
    
    public aawk() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aQ() {
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
        this.aQ();
        this.aP();
    }
    
    public final arlc aO() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arlc((br)this);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aP() {
        if (!this.ai) {
            this.ai = true;
            ((aawt)this).af = (tmx)((ess)this.aR()).b.a.ct.a();
        }
    }
    
    public final Object aR() {
        return this.aO().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aO();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.aQ();
        this.aP();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aQ();
        return (Context)this.ae;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
