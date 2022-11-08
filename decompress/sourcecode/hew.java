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

class hew extends br implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hew() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = aenz.c(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    @Override
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.a();
        this.aP();
    }
    
    public final aenz aO() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void aP() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hek hek = (hek)this;
            final eso eso = (eso)ar;
            hek.am = (gxs)eso.M.a();
            hek.an = (wwv)eso.h.a();
            hek.aF = (avt)eso.i.a();
            hek.ao = (ucr)eso.L.a();
            hek.ap = hbm.i();
            hek.aD = eso.aE();
            hek.aq = (Executor)eso.a.g.a();
            hek.ar = eso.aO.K();
            hek.aE = eso.aO.be();
            hek.aH = (auip)eso.a.a.aq.a();
            hek.as = (tzg)eso.aO.J.a();
            hek.at = (tzz)eso.aO.N.a();
            hek.az = eso.aO.aQ();
            hek.aA = (aagm)eso.a.a.aA.a();
            hek.aB = (agmd)eso.P.a();
            hek.au = (hfd)eso.a();
            final AccountId accountId = (AccountId)eso.aM.c.a();
            hek.aL = (qpt)eso.O.a();
            hek.aJ = (qpt)eso.R.a();
            hek.aI = (qpt)eso.S.a();
            hek.aK = (qpt)eso.Q.a();
        }
    }
    
    public final Object aR() {
        return this.aO().aR();
    }
    
    @Override
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.aP();
    }
    
    @Override
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = this.aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
}
