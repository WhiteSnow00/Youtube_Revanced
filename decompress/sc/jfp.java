import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jfp extends bi implements arln
{
    private ContextWrapper ae;
    private boolean af;
    private volatile arlc ag;
    private final Object ah;
    private boolean ai;
    
    public jfp() {
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
            final jfr jfr = (jfr)this;
            final ess ess = (ess)ar;
            final epu a = ess.ak.a;
            final gkv gkv = (gkv)a.aC.bf.a();
            final vai vai = (vai)a.a.ka.a();
            tvr ae;
            if (vai.aU() && vai.aV()) {
                ae = mft.H(gkv, 2132084325, 2132084327);
            }
            else {
                ae = mft.H(gkv, 2132084324, 2132084326);
            }
            jfr.ae = ae;
            final eqy b = ess.b;
            final era a2 = b.a;
            final atke af = a2.aF;
            final atke ix = b.ix;
            final esp ak = ess.ak;
            jfr.ag = new lan(af, ix, ak.d, b.g, ak.U, ak.Y, ak.dz, ak.dC, b.h, a2.aE);
            jfr.af = (wyw)ess.b.iK.a();
            jfr.ah = (aeea)ess.ak.br.a();
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q(this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aK();
    }
    
    @Override
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
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
