import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hex extends wxf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hex() {
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
        this.r();
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final aenz d() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.r();
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
    
    protected final void r() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hfl hfl = (hfl)this;
            final eso eso = (eso)ar;
            hfl.av = (Context)eso.aO.L.a();
            hfl.ax = (hfp)eso.T.a();
            hfl.ay = (wwv)eso.h.a();
            hfl.aN = (avt)eso.i.a();
            hfl.az = (ucr)eso.L.a();
            hfl.aA = hbm.i();
            hfl.aB = new her((Context)eso.aO.c.a(), (abns)new eqp(eso.a.a.a).a(), (tzg)eso.aO.J.a());
            hfl.aC = (Executor)eso.a.g.a();
            hfl.aD = (ucs)eso.aO.O.a();
            hfl.aK = eso.aO.aQ();
            hfl.aL = (aagm)eso.a.a.aA.a();
            hfl.aM = (agmd)eso.P.a();
            hfl.aE = (hfd)eso.a();
            hfl.aF = new hff((abjm)eso.a.iA.a(), (Executor)eso.a.r.a(), (abke)eso.a.fX.a(), (yls)eso.a.fa.a());
            hfl.aG = new hfv((aceo)eso.a.jh.a(), (Executor)eso.a.r.a(), (hjp)eso.r.a());
            hfl.aH = (gko)eso.a.fo.a();
            hfl.aI = (tzz)eso.aO.N.a();
            hfl.aO = (aeby)eso.a.jW.a();
            hfl.aR = (qpt)eso.Q.a();
        }
    }
}
