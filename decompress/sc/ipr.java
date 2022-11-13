import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class ipr extends ipj implements arln
{
    private boolean ae;
    private volatile aepz af;
    private final Object ag;
    private boolean ah;
    private ContextWrapper e;
    
    public ipr() {
        this.ag = new Object();
        this.ah = false;
    }
    
    private final void q() {
        if (this.e == null) {
            this.e = aepz.c(super.nT(), (br)this);
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
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
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
        return aa.cloneInContext((Context)aepz.d(aa, (br)this));
    }
    
    public final aepz o() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new aepz((br)this, true);
                }
            }
        }
        return this.af;
    }
    
    protected final void p() {
        if (!this.ah) {
            this.ah = true;
            final Object ar = this.aR();
            final ipr ipr = this;
            final esr esr = (esr)ar;
            ((ggq)ipr).av = arlr.b(esr.a.iK);
            ((ggq)ipr).az = (vaf)esr.a.w.a();
            ((ggq)ipr).aw = esr.aN.e();
            ((ggq)ipr).ax = esr.aN.i();
            ((ggq)ipr).ay = (ghb)esr.aN.C.a();
            final atke ah = esr.ah;
            final eqy a = esr.a;
            final atke h = a.h;
            final era a2 = a.a;
            ipr.a = new ipd(ah, h, a2.aX, a2.bb, a.lC, a2.bd, a.bp, a.r, a.g, a2.bf, a.lF, esr.y, a.w, a.er, a.e, a.aC, a.jj);
            ipr.b = esr.aN.f();
            final esn an = esr.aN;
            ipr.c = (fzi)ips.k((vcy)an.k.a(), (Context)an.c.a());
            ipr.d = (vai)esr.a.ik.a();
        }
    }
}
