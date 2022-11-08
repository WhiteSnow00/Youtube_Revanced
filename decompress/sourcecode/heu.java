import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class heu extends wxf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public heu() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
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
        this.a();
        this.aK();
    }
    
    protected final void aK() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hea hea = (hea)this;
            hea.ar = hbm.i();
            final eso eso = (eso)ar;
            hea.as = new het((Context)eso.a.c.a(), eso.aK(), (Executor)eso.a.g.a(), null, null, null, null, null);
            hea.at = (ucr)eso.L.a();
            hea.au = eso.aO.K();
            hea.aG = eso.aE();
            hea.av = (gxs)eso.M.a();
            hea.aw = (wwv)eso.h.a();
            hea.aI = (avt)eso.i.a();
            hea.aH = eso.aO.be();
            hea.aC = eso.aO.af();
            hea.ax = (tzz)eso.aO.N.a();
            hea.aE = (aagm)eso.a.a.aA.a();
            hea.ay = (tzg)eso.aO.J.a();
            hea.az = (Executor)eso.a.g.a();
            hea.aA = (AccountId)eso.aM.c.a();
            hea.aL = (qpt)eso.O.a();
        }
    }
    
    public final Object aR() {
        return this.s().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.aK();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
    
    public final aenz s() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
}
