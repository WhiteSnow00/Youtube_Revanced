import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class acdv extends actz implements aroh
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arnw ag;
    private final Object ah;
    private boolean ai;
    
    public acdv() {
        this.ah = new Object();
        this.ai = false;
    }
    
    private final void aM() {
        if (this.ae == null) {
            this.ae = arnw.e(super.nQ(), (br)this);
            this.af = areq.C(super.nQ());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arnw.d((Context)ae) == activity && b);
        }
        areq.v(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aM();
        this.aL();
    }
    
    public final arnw aK() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new arnw((br)this);
                }
            }
        }
        return this.ag;
    }
    
    protected final void aL() {
        if (!this.ai) {
            this.ai = true;
            final Object ar = this.aR();
            final aceb aceb = (aceb)this;
            final esu esu = (esu)ar;
            aceb.ae = (ojl)esu.ak.ch.a();
            aceb.af = esu.b.bt;
            aceb.al = (vbs)esu.ak.cO.a();
            aceb.am = (vbs)esu.b.jq.a();
            aceb.ap = (aheu)esu.ak.aD.a();
            aceb.an = (vbs)esu.b.cI.a();
            aceb.ai = arol.b(esu.ak.B);
            final ove ove = (ove)esu.ak.D.a();
            aceb.aj = esu.ak.ar;
        }
    }
    
    @Override
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avs getDefaultViewModelProviderFactory() {
        return areq.A((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final /* bridge */ arog lC() {
        return this.aK();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.aM();
        this.aL();
    }
    
    public final Context nQ() {
        if (super.nQ() == null && !this.af) {
            return null;
        }
        this.aM();
        return (Context)this.ae;
    }
    
    public final LayoutInflater ng(final Bundle bundle) {
        final LayoutInflater ng = super.ng(bundle);
        return ng.cloneInContext((Context)arnw.f(ng, (br)this));
    }
}
