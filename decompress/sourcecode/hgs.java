import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hgs extends wxf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public hgs() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = arin.e(super.nT(), (br)this);
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
        this.s();
    }
    
    public final Object aR() {
        return this.r().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.s();
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
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
    
    public final arin r() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    protected final void s() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hhi hhi = (hhi)this;
            final esp esp = (esp)ar;
            hhi.c = (wwv)esp.b.iG.a();
            hhi.aD = (arud)esp.b.v.a();
            hhi.aA = (uyf)esp.b.w.a();
            hhi.d = arjc.b(esp.al.eT);
            hhi.e = esp.e();
            hhi.aC = (aagm)esp.b.a.ar.a();
            hhi.aE = (avt)esp.b.a.cj.a();
            hhi.ae = (uqq)esp.al.a.p.a();
            hhi.af = (Executor)esp.b.g.a();
            hhi.ag = esp.al.a.l();
            hhi.aF = (aeby)esp.b.jW.a();
            hhi.ah = esp.b();
            hhi.aB = (uyi)esp.b.jV.a();
            final auip auip = (auip)esp.b.a.aq.a();
        }
    }
}
