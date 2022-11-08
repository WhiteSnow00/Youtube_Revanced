import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ktx extends acpo implements ariy
{
    private ContextWrapper ae;
    private volatile arin af;
    private final Object ag;
    private boolean ah;
    
    public ktx() {
        this.ag = new Object();
        this.ah = false;
    }
    
    private final void aQ() {
        if (this.ae == null) {
            this.ae = arin.e(super.nT(), (br)this);
            aqqn.s(super.nT());
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
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new arin((br)this);
                }
            }
        }
        return this.af;
    }
    
    protected final void aP() {
        if (!this.ah) {
            this.ah = true;
            final Object ar = this.aR();
            final kum kum = (kum)this;
            final esp esp = (esp)ar;
            kum.ai = (aja)esp.al.aS.a();
            kum.ah = (abpj)esp.b.eb.a();
            kum.ae = (wwu)esp.al.o.a();
            kum.af = (Context)esp.al.V.a();
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
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
