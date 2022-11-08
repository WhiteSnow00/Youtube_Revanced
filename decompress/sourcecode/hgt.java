import android.view.LayoutInflater;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hgt extends ucx implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public hgt() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void n() {
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
        this.n();
        this.d();
    }
    
    public final Object aR() {
        return this.nN().aR();
    }
    
    protected final void d() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hhl hhl = (hhl)this;
            final esp esp = (esp)ar;
            final eqv b = esp.b;
            final esn ak = esp.ak;
            ((ucx)hhl).aF = (ucu)new erf(b, esp.al, 1);
            hhl.b = (Handler)b.G.a();
            hhl.ar = (uyf)esp.b.w.a();
            hhl.c = (vax)esp.al.E.a();
            final aaca aaca = (aaca)esp.b.a.R.a();
            final zki zki = (zki)esp.b.aC.a();
            final hiz hiz = (hiz)hjp.c(esp.a, (Class)hiz.class);
            hiz.getClass();
            hhl.d = new hja(aaca, zki, hiz, (aftr)esp.b.q.a(), (byte[])null, (byte[])null, (byte[])null);
            hhl.e = esp.al.ap();
            hhl.ae = esp.al.ao();
            hhl.af = esp.al.ao();
            hhl.ag = new umr((ujg)esp.al.eU.a());
            hhl.au = (aagm)esp.b.a.ar.a();
            hhl.ah = esp.d();
            hhl.ai = esp.i();
            hhl.aj = (gko)esp.b.fo.a();
            hhl.as = new acss();
            hhl.av = esp.aH();
            hhl.aw = (aeby)esp.b.jW.a();
            hhl.at = (uyi)esp.b.jV.a();
            final auip auip = (auip)esp.b.a.aq.a();
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.n();
        this.d();
    }
    
    public final arin nN() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.n();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
}
