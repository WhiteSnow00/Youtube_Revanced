import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jll extends bi implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arin ag;
    private final Object ah;
    private boolean ai;
    
    public jll() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aM() {
        if (this.ae == null) {
            this.ae = arin.e(super.nT(), (br)this);
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
    
    public final arin aK() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arin((br)this);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aL() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final jmd jmd = (jmd)this;
            final esp esp = (esp)ar;
            jmd.ar = (cxz)esp.b.a.aP.a();
            jmd.ae = (vax)esp.al.E.a();
            jmd.af = (zki)esp.b.aC.a();
            jmd.ag = (wvu)esp.b.aw.a();
            jmd.aq = (adbp)esp.al.fA.a();
            jmd.ao = (uyi)esp.b.jV.a();
            jmd.ap = (zhb)esp.al.T.a();
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
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
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
