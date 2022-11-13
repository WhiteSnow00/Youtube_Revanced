import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class ipq extends ipj implements arln
{
    private boolean ae;
    private volatile arlc af;
    private final Object ag;
    private boolean ah;
    private ContextWrapper e;
    
    public ipq() {
        this.ag = new Object();
        this.ah = false;
    }
    
    private final void q() {
        if (this.e == null) {
            this.e = arlc.e(super.nT(), (br)this);
            this.ae = aqsz.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper e = this.e;
        boolean b = true;
        if (e != null) {
            b = (arlc.d((Context)e) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.q();
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.o();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.q();
        this.p();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.ae) {
            return null;
        }
        this.q();
        return (Context)this.e;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arlc.f(aa, (br)this));
    }
    
    public final arlc o() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new arlc((br)this);
                }
            }
        }
        return this.af;
    }
    
    protected final void p() {
        if (!this.ah) {
            this.ah = true;
            final Object ar = this.aR();
            final ipq ipq = this;
            final ess ess = (ess)ar;
            ((ggq)ipq).av = arlr.b(ess.b.iK);
            ((ggq)ipq).az = (vaf)ess.b.w.a();
            ((ggq)ipq).aw = (gae)ess.ak.cl.a();
            ((ggq)ipq).ax = (ggr)ess.ak.Q.a();
            ((ggq)ipq).ay = (ghb)ess.ak.i.a();
            final atke q = ess.Q;
            final eqy b = ess.b;
            final atke h = b.h;
            final era a = b.a;
            ipq.a = new ipd(q, h, a.aX, a.bb, b.lC, a.bd, b.bp, b.r, b.g, a.bf, b.lF, ess.g, b.w, b.er, b.e, b.aC, b.jj);
            ipq.b = (gae)ess.ak.cm.a();
            final epu a2 = ess.ak.a;
            ipq.c = (fzi)ips.k((vcy)a2.aC.F.a(), (Context)a2.aC.d.a());
            ipq.d = (vai)ess.b.ik.a();
        }
    }
}
