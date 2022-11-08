import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jrk extends adam
{
    private boolean aK;
    private boolean aL;
    private ContextWrapper ae;
    
    public jrk() {
        this.aL = false;
    }
    
    private final void aP() {
        if (this.ae == null) {
            this.ae = arin.e(super.nT(), (br)this);
            this.aK = aqqn.s(super.nT());
        }
    }
    
    @Override
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper ae = this.ae;
        boolean b = true;
        if (ae != null) {
            b = (arin.d((Context)ae) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aP();
        this.aK();
    }
    
    @Override
    public final void aK() {
        if (!this.aL) {
            this.aL = true;
            final Object ar = this.aR();
            final jrj jrj = (jrj)this;
            final esp esp = (esp)ar;
            ((adam)jrj).ao = (adbj)esp.b.a.ev.a();
            ((adam)jrj).aG = (adbl)esp.b.a.ew.a();
            ((adam)jrj).ap = arjc.b(esp.al.a.E);
            ((adam)jrj).aq = arjc.b(esp.al.a.F);
            ((adam)jrj).ar = (Handler)esp.b.G.a();
            ((adam)jrj).as = (Executor)esp.b.g.a();
            ((adam)jrj).aJ = (aeby)esp.al.bp.a();
            ((adam)jrj).at = (wwv)esp.b.iG.a();
            ((adam)jrj).au = (tny)esp.b.it.a();
            ((adam)jrj).av = (tdz)esp.b.h.a();
            ((adam)jrj).aw = (ScheduledExecutorService)esp.b.r.a();
            ((adam)jrj).ax = (aftr)esp.b.E.a();
            ((adam)jrj).ay = (aceo)esp.b.jh.a();
            ((adam)jrj).az = (vmt)esp.b.a.cT.a();
            ((adam)jrj).aA = (daw)esp.b.fr.a();
            ((adam)jrj).aB = (SharedPreferences)esp.b.d.a();
            ((adam)jrj).aI = (aeby)esp.al.am.a();
            ((adam)jrj).aH = (aeby)esp.al.S.a();
            ((adam)jrj).aC = (vax)esp.al.E.a();
            ((adam)jrj).aD = (oas)esp.b.e.a();
            ((adam)jrj).aF = (uyf)esp.b.w.a();
            ((adam)jrj).aE = esp.al.a.j();
            final aeby aeby = (aeby)esp.b.jW.a();
            jrj.ae = (fzo)esp.b.a.Y.a();
        }
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.aP();
        this.aK();
    }
    
    @Override
    public final Context nT() {
        if (super.nT() == null && !this.aK) {
            return null;
        }
        this.aP();
        return (Context)this.ae;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
