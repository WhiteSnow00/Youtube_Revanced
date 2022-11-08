import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class ije extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public ije() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void q() {
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
        this.q();
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.q();
        this.p();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.q();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
    
    public final aenz o() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void p() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final ijd ijd = (ijd)this;
            final eso eso = (eso)ar;
            ((ggh)ijd).av = arjc.b(eso.a.iG);
            ((ggh)ijd).az = (uyf)eso.a.w.a();
            ((ggh)ijd).aw = eso.aO.e();
            ((ggh)ijd).ax = eso.aO.i();
            ((ggh)ijd).ay = (ggs)eso.aO.D.a();
            ijd.a = (tdz)eso.a.h.a();
            ijd.b = (thh)eso.a.P.a();
            ijd.c = (abll)eso.aO.aa.a();
            ijd.ak = (zzu)eso.a.el.a();
            final eqv a = eso.a;
            final atjj lv = a.lv;
            final esk ao = eso.aO;
            ijd.an = new ljk(lv, ao.c, a.h, a.v, eso.ae, eso.af, a.a.aR, eso.ag, ao.m, ao.ab, eso.ah, a.el, (char[])null);
            ijd.d = (iko)eso.a.a.aX.a();
            ijd.e = (fmd)eso.a.lz.a();
            ijd.ae = arjc.b(eso.aO.W);
            ijd.ao = (e)eso.a.a.aY.a();
            ijd.af = eso.aO.f();
            ijd.al = (uyi)eso.a.lv.a();
            ijd.am = (uyi)eso.a.jf.a();
        }
    }
}
