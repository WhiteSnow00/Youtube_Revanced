import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jho extends jhf implements ariy
{
    private ContextWrapper bf;
    private boolean bg;
    private volatile aenz bh;
    private final Object bi;
    private boolean bj;
    
    public jho() {
        this.bi = new Object();
        this.bj = false;
    }
    
    private final void bw() {
        if (this.bf == null) {
            this.bf = aenz.c(super.nT(), (br)this);
            this.bg = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper bf = this.bf;
        boolean b = true;
        if (bf != null) {
            b = (arin.d((Context)bf) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.bw();
        this.r();
    }
    
    public final Object aR() {
        return this.q().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.bw();
        this.r();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.bg) {
            return null;
        }
        this.bw();
        return (Context)this.bf;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
    
    public final aenz q() {
        if (this.bh == null) {
            synchronized (this.bi) {
                if (this.bh == null) {
                    this.bh = new aenz((br)this, true);
                }
            }
        }
        return this.bh;
    }
    
    protected final void r() {
        if (!this.bj) {
            this.bj = true;
            final Object ar = this.aR();
            final jho jho = this;
            final eso eso = (eso)ar;
            ((ggh)jho).av = arjc.b(eso.a.iG);
            ((ggh)jho).az = (uyf)eso.a.w.a();
            ((ggh)jho).aw = eso.aO.e();
            ((ggh)jho).ax = eso.aO.i();
            ((ggh)jho).ay = (ggs)eso.aO.D.a();
            final eqv a = eso.a;
            final eqx a2 = a.a;
            jho.a = a2.bg;
            jho.b = a2.bh;
            jho.c = (Executor)a.r.a();
            jho.d = (Executor)eso.a.g.a();
            jho.aY = (blt)eso.a.a.r.a();
            jho.aX = eso.aO.aR();
            jho.e = (wyo)eso.a.cB.a();
            jho.aP = (uyf)eso.a.w.a();
            final SharedPreferences sharedPreferences = (SharedPreferences)eso.a.d.a();
            jho.aV = (arud)eso.a.v.a();
            jho.ae = eso.aO.d();
            jho.af = (acwn)eso.a.a.bi.a();
            jho.ag = (zki)eso.a.aC.a();
            jho.ah = eso.aO.s();
            jho.ai = (acuj)eso.aO.P.a();
            jho.aZ = eso.aC();
            jho.bb = (auip)eso.a.a.p.a();
            jho.aW = eso.aA();
            jho.bc = eso.a.a.hd();
            jho.aj = (adfy)eso.a.ew.a();
            jho.ak = (vax)eso.aO.k.a();
            jho.al = (aceo)eso.a.jh.a();
            jho.aQ = (uyi)eso.a.a.m.a();
            jho.am = eso.aO.h();
            jho.aR = (uyi)eso.a.a.q.a();
            final eqv a3 = eso.a;
            jho.an = a3.eG;
            jho.aS = a3.xY();
            jho.aT = eso.a.a.gG();
            jho.bd = (aeby)eso.d.a();
            jho.ba = (e)eso.a.a.bu.a();
            jho.aM = (wwu)eso.aO.j.a();
            jho.aN = (acno)eso.aO.R.a();
            jho.aO = (adea)eso.a.a.g.a();
            jho.be = (aeby)eso.a.jW.a();
        }
    }
}
