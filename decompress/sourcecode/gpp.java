import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class gpp extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public gpp() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void q() {
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
        this.q();
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
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
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
    
    public final arin o() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    protected final void p() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final gpq gpq = (gpq)this;
            final esp esp = (esp)ar;
            ((ggh)gpq).av = arjc.b(esp.b.iG);
            ((ggh)gpq).az = (uyf)esp.b.w.a();
            ((ggh)gpq).aw = (fzw)esp.al.cj.a();
            ((ggh)gpq).ax = (ggi)esp.al.P.a();
            ((ggh)gpq).ay = (ggs)esp.al.i.a();
            gpq.d = (aejr)esp.al.gV.a();
            gpq.a = (zki)esp.b.aC.a();
            gpq.b = (acvg)esp.b.a.df.a();
            gpq.c = (vax)esp.al.E.a();
        }
    }
}
