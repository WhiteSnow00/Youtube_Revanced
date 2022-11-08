import android.view.LayoutInflater;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hev extends wxf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hev() {
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
        this.aN();
    }
    
    public final aenz aM() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void aN() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hef hef = (hef)this;
            hef.ar = hbm.i();
            final eso eso = (eso)ar;
            hef.as = (ucr)eso.L.a();
            hef.at = eso.aO.K();
            hef.aH = eso.aE();
            hef.au = (wwv)eso.h.a();
            hef.aJ = (avt)eso.i.a();
            hef.aI = eso.aO.be();
            hef.aD = eso.aO.aQ();
            hef.av = (hfd)eso.a();
            hef.aE = (aagm)eso.a.a.aA.a();
            final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)eso.a.r.a();
            hef.aF = (agmd)eso.P.a();
            hef.aw = (tzz)eso.aO.N.a();
            hef.ax = (tzg)eso.aO.J.a();
            hef.ay = (Executor)eso.a.g.a();
            hef.aM = (qpt)eso.O.a();
            hef.aL = (qpt)eso.Q.a();
        }
    }
    
    public final Object aR() {
        return this.aM().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.aN();
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
}
