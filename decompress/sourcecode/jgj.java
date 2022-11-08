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

class jgj extends jhf implements ariy
{
    private ContextWrapper bf;
    private boolean bg;
    private volatile arin bh;
    private final Object bi;
    private boolean bj;
    
    public jgj() {
        this.bi = new Object();
        this.bj = false;
    }
    
    private final void bw() {
        if (this.bf == null) {
            this.bf = arin.e(super.nT(), (br)this);
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
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
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
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
    
    public final arin q() {
        if (this.bh == null) {
            synchronized (this.bi) {
                if (this.bh == null) {
                    this.bh = new arin((br)this);
                }
            }
        }
        return this.bh;
    }
    
    protected final void r() {
        if (!this.bj) {
            this.bj = true;
            final Object ar = this.aR();
            final jgj jgj = this;
            final esp esp = (esp)ar;
            ((ggh)jgj).av = arjc.b(esp.b.iG);
            ((ggh)jgj).az = (uyf)esp.b.w.a();
            ((ggh)jgj).aw = (fzw)esp.al.cj.a();
            ((ggh)jgj).ax = (ggi)esp.al.P.a();
            ((ggh)jgj).ay = (ggs)esp.al.i.a();
            final eqv b = esp.b;
            final eqx a = b.a;
            jgj.a = a.bg;
            jgj.b = a.bh;
            jgj.c = (Executor)b.r.a();
            jgj.d = (Executor)esp.b.g.a();
            jgj.aY = (blt)esp.b.a.r.a();
            jgj.aX = (sin)esp.al.cg.a();
            jgj.e = (wyo)esp.b.cB.a();
            jgj.aP = (uyf)esp.b.w.a();
            final SharedPreferences sharedPreferences = (SharedPreferences)esp.b.d.a();
            jgj.aV = (arud)esp.b.v.a();
            jgj.ae = (fjp)esp.al.z.a();
            jgj.af = (acwn)esp.b.a.bi.a();
            jgj.ag = (zki)esp.b.aC.a();
            jgj.ah = (jww)esp.al.cm.a();
            jgj.ai = (acuj)esp.al.az.a();
            jgj.aZ = esp.al.zo();
            jgj.bb = (auip)esp.b.a.p.a();
            jgj.aW = esp.al.yh();
            jgj.bc = esp.b.a.hd();
            jgj.aj = (adfy)esp.b.ew.a();
            jgj.ak = (vax)esp.al.E.a();
            jgj.al = (aceo)esp.b.jh.a();
            jgj.aQ = (uyi)esp.b.a.m.a();
            jgj.am = (gdu)esp.al.eL.a();
            jgj.aR = (uyi)esp.b.a.q.a();
            final eqv b2 = esp.b;
            jgj.an = b2.eG;
            jgj.aS = b2.xY();
            jgj.aT = esp.b.a.gG();
            jgj.bd = (aeby)esp.al.am.a();
            jgj.ba = (e)esp.b.a.bu.a();
            jgj.aM = (wwu)esp.al.o.a();
            jgj.aN = (acno)esp.al.X.a();
            jgj.aO = (adea)esp.b.a.g.a();
            jgj.be = (aeby)esp.b.jW.a();
        }
    }
}
