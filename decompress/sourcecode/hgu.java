import java.util.concurrent.Executor;
import android.os.Handler;
import java.io.File;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hgu extends uqx implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public hgu() {
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
        this.o();
    }
    
    public final Object aR() {
        return this.nO().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.n();
        this.o();
    }
    
    public final arin nO() {
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
    
    protected final void o() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hid hid = (hid)this;
            final esp esp = (esp)ar;
            ((uqx)hid).aA = (File)esp.b.bZ.a();
            ((uqx)hid).aW = esp.al.zM();
            ((uqx)hid).aV = (arud)esp.b.v.a();
            ((uqx)hid).aB = (aceo)esp.b.jh.a();
            ((uqx)hid).aC = esp.al.a.q;
            ((uqx)hid).aY = (aeby)esp.b.jW.a();
            ((uqx)hid).aD = (urd)esp.h.a();
            hid.av = (uyf)esp.b.w.a();
            hid.e = (adfy)esp.b.ew.a();
            hid.ae = (wwv)esp.b.iG.a();
            hid.af = esp.a();
            hid.ag = new hin((Context)esp.al.d.a());
            hid.ah = (hil)esp.i.a();
            hid.ai = new hhy((zki)esp.b.aC.a(), (vax)esp.al.E.a(), (Handler)esp.b.G.a(), (adil)esp.b.kZ.a(), esp.aI(), new uoo((wvu)esp.b.aw.a()), (adno)esp.b.li.a(), esp.al.am(), (avt)esp.b.a.cj.a(), (rgm)esp.b.aC.a(), (aceo)esp.b.jh.a(), (gko)esp.b.fo.a(), (aagm)esp.b.a.ar.a(), esp.b(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            hid.aj = new hiy((Context)esp.al.d.a(), new hix((Context)esp.al.d.a(), (aceo)esp.b.jh.a(), (acng)esp.b.jH.a(), (vax)esp.al.E.a()));
            hid.ak = new hhr();
            hid.al = new hhp();
            hid.am = new hip();
            hid.an = new hia();
            final avt avt = (avt)esp.b.a.cj.a();
            final acng acng = (acng)esp.b.jH.a();
            final Handler handler = (Handler)esp.b.G.a();
            final br a = esp.a;
            final eqv b = esp.b;
            hid.ao = new hje(avt, acng, handler, new adwm(a, (Context)b.qg.a, (Handler)b.G.a(), (Executor)esp.b.r.a(), (ufk)esp.j.a(), esp.f(), esp.ai(), esp.h(), esp.j(), esp.e(), esp.k(), (byte[])null), (ufk)esp.j.a(), esp.g(), (hil)esp.i.a(), (byte[])null, (byte[])null, (byte[])null);
            hid.ap = esp.g();
            hid.ax = (avt)esp.b.a.cj.a();
            hid.aq = esp.k;
            hid.ar = esp.l;
            hid.as = esp.m;
            hid.at = esp.n;
            hid.au = esp.al.a.s;
            hid.aw = (uyi)esp.b.jV.a();
        }
    }
}
