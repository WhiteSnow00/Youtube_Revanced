import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hwv extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hwv() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void o() {
        if (this.a == null) {
            this.a = aenz.c(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.o();
        this.aL();
    }
    
    public final aenz aK() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void aL() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hwl hwl = (hwl)this;
            final eso eso = (eso)ar;
            ((ggh)hwl).av = arjc.b(eso.a.iG);
            ((ggh)hwl).az = (uyf)eso.a.w.a();
            ((ggh)hwl).aw = eso.aO.e();
            ((ggh)hwl).ax = eso.aO.i();
            ((ggh)hwl).ay = (ggs)eso.aO.D.a();
            hwl.a = (zki)eso.a.aC.a();
            hwl.b = (vsc)eso.a.a.aF.a();
            hwl.ao = (aaca)eso.a.kf.a();
            hwl.c = (tny)eso.a.it.a();
            hwl.d = (tdz)eso.a.h.a();
            hwl.e = (aceo)eso.a.jh.a();
            hwl.ae = (vax)eso.aO.k.a();
            hwl.aq = (cxz)eso.Y.a();
            final atjj k = eso.aO.k;
            final eqv a = eso.a;
            hwl.ap = new aja(k, a.jH, a.jV, (byte[])null);
            eso.a.xu();
            hwl.as = (aeby)eso.a.jW.a();
            hwl.am = (uyi)eso.a.jV.a();
            hwl.an = (zhb)eso.s.a();
            hwl.af = eso.aO.O();
            hwl.ar = new aeby(new aeim(eso.a.iG, eso.aO.j, (byte[])null, (byte[])null), null, null, null);
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.o();
        this.aL();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.o();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
}
