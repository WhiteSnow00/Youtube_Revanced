import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.b;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class etm extends wzf implements arln
{
    private ContextWrapper a;
    private boolean b;
    private volatile arlc c;
    private final Object d;
    private boolean e;
    
    public etm() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void r() {
        if (this.a == null) {
            this.a = arlc.e(super.nT(), (br)this);
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
        this.r();
        this.d();
    }
    
    public final arlc a() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arlc((br)this);
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
            final etp etp = (etp)this;
            final ess ess = (ess)ar;
            final bu bu = (bu)ess.ak.l.a();
            final aln aln = (aln)ess.c.a();
            final vcy vcy = (vcy)ess.ak.F.a();
            final acgs acgs = (acgs)ess.b.jl.a();
            etp.a = (wyw)ess.b.iK.a();
            final acpk acpk = (acpk)ess.b.jL.a();
            ess.b.y();
            final b b = (b)ess.ak.a.u.a();
            final aujg aujg = (aujg)ess.ak.bJ.a();
            final ziy ziy = (ziy)ess.ak.U.a();
            final vai vai = (vai)ess.b.ka.a();
        }
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
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
        return aa.cloneInContext((Context)arlc.f(aa, (br)this));
    }
}
