import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ktz extends acpo implements ariy
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arin ag;
    private final Object ah;
    private boolean ai;
    
    public ktz() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aQ() {
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
        this.aQ();
        this.aP();
    }
    
    public final arin aO() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arin((br)this);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aP() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final kuq kuq = (kuq)this;
            final esp esp = (esp)ar;
            kuq.ak = (arud)esp.b.v.a();
            kuq.ae = (wwu)esp.al.o.a();
            kuq.af = (isi)esp.al.bz.a();
            kuq.ag = (isk)esp.al.bA.a();
            kuq.ah = (zjy)esp.b.gv.a();
            kuq.ai = (zki)esp.b.aC.a();
            esp.b.xu();
        }
    }
    
    public final Object aR() {
        return this.aO().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
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
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
