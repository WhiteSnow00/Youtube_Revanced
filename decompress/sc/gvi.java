import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class gvi extends adtt implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arlc ag;
    private final Object ah;
    private boolean ai;
    
    public gvi() {
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
            final gvm gvm = (gvm)this;
            final ess ess = (ess)ar;
            final eqy b = ess.b;
            gvm.ao = new blu(b.jk, b.g, ess.ak.o, b.a.ep, b.cB, (byte[])null);
            gvm.ae = (ReelBrowseFragmentToolbarController)ess.d.a();
            gvm.ar = new fzw((gdh)ess.ak.eK.a(), (wyv)ess.ak.o.a());
            gvm.af = (ReelBrowseFragmentFeedController)ess.e.a();
            gvm.aq = (fzw)ess.f.a();
            gvm.ag = (Context)ess.ak.W.a();
            gvm.ah = (wyv)ess.ak.o.a();
            gvm.an = (arwh)ess.b.v.a();
            gvm.am = (vai)ess.ak.fg.a();
            gvm.aj = (tqf)ess.ak.n.a();
            gvm.ap = (msr)ess.g.a();
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
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}