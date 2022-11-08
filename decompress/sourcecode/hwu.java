import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hwu extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hwu() {
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
        this.r();
    }
    
    public final Object aR() {
        return this.q().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.o();
        this.r();
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
    
    public final aenz q() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void r() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hwg hwg = (hwg)this;
            final eso eso = (eso)ar;
            ((ggh)hwg).av = arjc.b(eso.a.iG);
            ((ggh)hwg).az = (uyf)eso.a.w.a();
            ((ggh)hwg).aw = eso.aO.e();
            ((ggh)hwg).ax = eso.aO.i();
            ((ggh)hwg).ay = (ggs)eso.aO.D.a();
            hwg.a = (tny)eso.a.it.a();
            hwg.b = (tdz)eso.a.h.a();
            hwg.al = (hmb)eso.X.a();
            hwg.c = (zki)eso.a.aC.a();
            hwg.d = (aceo)eso.a.jh.a();
            hwg.e = (vsc)eso.a.a.aF.a();
            hwg.ae = (vax)eso.aO.k.a();
            hwg.am = (aeby)eso.d.a();
            hwg.an = (aeby)eso.a.jW.a();
            hwg.af = arjc.b(eso.aO.W);
        }
    }
}
