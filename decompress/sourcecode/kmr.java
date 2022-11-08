import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.app.ui.presenter.dismissal.DismissalFollowUpDialogFragmentController;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class kmr extends bi implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aenz ag;
    private final Object ah;
    private boolean ai;
    
    public kmr() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aM() {
        if (this.ae == null) {
            this.ae = aenz.c(super.nT(), (br)this);
            this.af = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arin.d((Context)ae) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aM();
        this.aL();
    }
    
    public final aenz aK() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new aenz((br)this, true);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aL() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final kmj kmj = (kmj)this;
            final eso eso = (eso)ar;
            final Context context = (Context)eso.aO.c.a();
            final giz giz = (giz)eso.aO.X.a();
            final tdz tdz = (tdz)eso.a.h.a();
            final kmn kmn = new kmn((Context)eso.aO.c.a(), (acno)eso.aO.R.a());
            final DismissalFollowUpDialogFragmentController v = ((kmq)((arix)((aeoe)eso.aO.g.a()).a()).aR()).V();
            v.getClass();
            kmj.ae = new kmm(context, giz, tdz, kmn, v, (uyi)eso.a.jV.a());
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
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
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)aenz.d(nj, (br)this));
    }
}
