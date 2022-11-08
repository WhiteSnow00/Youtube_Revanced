import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jzh extends adrr implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile aenz ag;
    private final Object ah;
    private boolean ai;
    
    public jzh() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aK() {
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
        this.aK();
        this.aM();
    }
    
    public final aenz aL() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new aenz((br)this, true);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aM() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final jzf jzf = (jzf)this;
            final eso eso = (eso)ar;
            final Context context = (Context)eso.aO.c.a();
            final ioe ioe = (ioe)eso.I.a();
            final wwu wwu = (wwu)eso.aO.j.a();
            final esk ao = eso.aO;
            jzf.ai = new lll(context, ioe, wwu, ao.R, (acpn)ao.T.a(), (osx)eso.a.a.aE.a(), arjc.b(eso.aO.C), eso.c, (byte[])null);
            final ghb v = ((ghi)((arix)((aeoe)eso.aO.g.a()).a()).aR()).v();
            v.getClass();
            jzf.ae = v;
            jzf.af = (vax)eso.aO.k.a();
        }
    }
    
    public final Object aR() {
        return this.aL().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
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
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)aenz.d(nj, (br)this));
    }
}
