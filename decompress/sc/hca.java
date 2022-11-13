import android.view.LayoutInflater;
import android.os.Bundle;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hca extends wzf implements arln
{
    private ContextWrapper a;
    private boolean b;
    private volatile aepz c;
    private final Object d;
    private boolean e;
    
    public hca() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = aepz.c(super.nT(), (br)this);
            this.b = aqsz.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arlc.d((Context)a) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.a();
        this.aM();
    }
    
    public final aepz aL() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aepz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void aM() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hbx hbx = (hbx)this;
            final esr esr = (esr)ar;
            hbx.a = (Executor)esr.a.r.a();
            hbx.b = (Executor)esr.a.g.a();
            hbx.c = (Context)esr.aN.K.a();
            hbx.d = esr.g();
            hbx.an = (aujg)esr.a.a.ar.a();
            hbx.al = (wyw)esr.h.a();
            hbx.ao = (aeea)esr.i.a();
            hbx.am = (ueu)esr.aN.N.a();
        }
    }
    
    public final Object aR() {
        return this.aL().aR();
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.aL();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.aM();
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
        return aa.cloneInContext((Context)aepz.d(aa, (br)this));
    }
}
