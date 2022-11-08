import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class joi extends ceh implements ariy
{
    private ContextWrapper af;
    private boolean ag;
    private volatile arin ah;
    private final Object aj;
    private boolean ak;
    
    public joi() {
        this.aj = new Object();
        this.ak = false;
    }
    
    private final void aU() {
        if (this.af == null) {
            this.af = arin.e(super.nT(), (br)this);
            this.ag = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper af = this.af;
        boolean b = true;
        if (af != null) {
            b = (arin.d((Context)af) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aU();
        this.aT();
    }
    
    public final Object aR() {
        return this.aS().aR();
    }
    
    public final arin aS() {
        if (this.ah == null) {
            synchronized (this.aj) {
                if (this.ah == null) {
                    this.ah = new arin((br)this);
                }
            }
        }
        return this.ah;
    }
    
    protected final void aT() {
        if (!this.ak) {
            this.ak = true;
            ((joh)this).af = ((esp)this.aR()).al.bn;
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
        if (super.nT() == null && !this.ag) {
            return null;
        }
        this.aU();
        return (Context)this.af;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
