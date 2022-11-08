import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jpf extends ced implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arin ag;
    private final Object ah;
    private boolean aj;
    
    public jpf() {
        this.ah = new Object();
        this.aj = false;
    }
    
    private final void aU() {
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
        this.aU();
        this.aT();
    }
    
    public final Object aR() {
        return this.aS().aR();
    }
    
    public final arin aS() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arin((br)this);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aT() {
        if (!this.aj) {
            this.aj = true;
            final Object ar = this.aR();
            final jos jos = (jos)this;
            final esp esp = (esp)ar;
            jos.ah = (gmq)esp.b.a.dT.a();
            jos.aj = (tku)esp.b.eA.a();
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.aU();
        this.aT();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.af) {
            return null;
        }
        this.aU();
        return (Context)this.ae;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
