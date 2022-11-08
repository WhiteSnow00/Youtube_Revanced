import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.b;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class etj extends wxf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public etj() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void r() {
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
        this.r();
        this.d();
    }
    
    public final arin a() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected final void d() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final etm etm = (etm)this;
            final esp esp = (esp)ar;
            final bu bu = (bu)esp.al.l.a();
            final alm alm = (alm)esp.c.a();
            final vax vax = (vax)esp.al.E.a();
            final aceo aceo = (aceo)esp.b.jh.a();
            etm.a = (wwv)esp.b.iG.a();
            final acng acng = (acng)esp.b.jH.a();
            esp.b.x();
            final b b = (b)esp.al.a.o.a();
            final auip auip = (auip)esp.al.bH.a();
            final zhb zhb = (zhb)esp.al.T.a();
            final uyi uyi = (uyi)esp.b.jV.a();
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.r();
        this.d();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.r();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
}
