import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PageMonitor;
import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxTvFoundForSignInListener;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hvs extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public hvs() {
        this.d = new Object();
        this.e = false;
    }
    
    private void o() {
        if (this.a == null) {
            this.a = arin.e(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    public void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.o();
        this.bY();
    }
    
    public final Object aR() {
        return this.bX().aR();
    }
    
    public final arin bX() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    protected void bY() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hvp hvp = (hvp)this;
            final esp esp = (esp)ar;
            ((ggh)hvp).av = arjc.b(esp.b.iG);
            ((ggh)hvp).az = (uyf)esp.b.w.a();
            ((ggh)hvp).aw = (fzw)esp.al.cj.a();
            ((ggh)hvp).ax = (ggi)esp.al.P.a();
            ((ggh)hvp).ay = (ggs)esp.al.i.a();
            hvp.af = (gdu)esp.al.eL.a();
            hvp.an = (tku)esp.b.eA.a();
            hvp.aq = arjc.b(esp.al.cn);
            hvp.ar = (jwb)esp.al.co.a();
            hvp.aH = (gkl)esp.b.lw.a();
            hvp.cv = (sin)esp.al.cg.a();
            hvp.aJ = (vlq)esp.b.jg.a();
            hvp.aK = (hyh)esp.b.lD.a();
            hvp.aL = arjc.b(esp.b.jD);
            hvp.aM = (aceo)esp.b.jh.a();
            hvp.aN = (tny)esp.b.it.a();
            hvp.aO = (oas)esp.b.e.a();
            hvp.aP = esp.al.fy;
            hvp.aQ = (tdz)esp.b.h.a();
            hvp.aR = (acno)esp.al.X.a();
            hvp.aS = (zpa)esp.b.jJ.a();
            hvp.aT = (Handler)esp.b.G.a();
            final eqv b = esp.b;
            hvp.aU = b.jk;
            final aafi aafi = (aafi)b.ki.a();
            hvp.aV = (zoz)esp.b.ka.a();
            hvp.aW = (AppTabsBar)esp.al.cf.a();
            hvp.cQ = esp.aO();
            hvp.cw = esp.at();
            hvp.co = esp.aj();
            hvp.cz = esp.ax();
            hvp.ct = esp.as();
            hvp.cO = esp.aM();
            hvp.cP = esp.aN();
            hvp.aX = esp.m();
            hvp.cJ = esp.aE();
            hvp.cI = esp.aD();
            hvp.aY = (krh)esp.al.ae.a();
            hvp.cN = esp.aL();
            hvp.cA = esp.al.yH();
            hvp.aZ = (vax)esp.al.E.a();
            hvp.ba = esp.al.ci;
            hvp.bb = (jws)esp.J.a();
            hvp.cB = (e)esp.al.bZ.a();
            hvp.cE = esp.aB();
            hvp.cC = esp.aA();
            hvp.cx = esp.au();
            hvp.bc = (toi)esp.b.ir.a();
            hvp.cF = (mck)esp.b.a.aG.a();
            hvp.cd = (uyf)esp.b.w.a();
            hvp.cr = (arud)esp.b.v.a();
            hvp.cu = esp.ar();
            hvp.bd = (InlinePlaybackLifecycleController)esp.al.y.a();
            hvp.cy = (hyr)esp.al.aW();
            hvp.be = (acpn)esp.al.dx.a();
            hvp.bf = (ActiveStateScrollSelectionController)esp.al.cs.a();
            hvp.bg = (acpn)esp.al.fI.a();
            hvp.bh = (jzu)esp.al.fK.a();
            hvp.bi = (jzu)esp.al.fJ.a();
            hvp.bj = (MdxTvFoundForSignInListener)esp.al.fi.a();
            hvp.cT = (adcr)esp.b.eO.a();
            hvp.cR = (aeby)esp.al.am.a();
            hvp.cs = esp.ap();
            hvp.cM = esp.aJ();
            hvp.bk = (acuj)esp.al.az.a();
            hvp.bl = (iko)esp.b.a.aX.a();
            hvp.bm = (fmd)esp.b.lz.a();
            hvp.bn = (wvu)esp.b.aw.a();
            hvp.bo = esp.al.gB;
            hvp.bp = (ScheduledExecutorService)esp.b.r.a();
            hvp.bq = (Executor)esp.b.g.a();
            hvp.br = (asho)esp.b.dO.a();
            hvp.cL = (fzo)esp.K.a();
            hvp.bs = (gcy)esp.al.dq.a();
            hvp.bt = (gcy)esp.al.eJ.a();
            hvp.bu = (gcy)esp.al.eK.a();
            hvp.bv = (gde)esp.L.a();
            final eqv b2 = esp.b;
            hvp.bw = b2.fW;
            hvp.bx = b2.P;
            hvp.ce = (feb)esp.al.eI.a();
            hvp.cq = (blt)esp.b.lB.a();
            hvp.by = Optional.empty();
            final esm al = esp.al;
            hvp.bz = al.cN;
            hvp.bA = (kra)al.aj.a();
            hvp.bB = (wyo)esp.b.cB.a();
            hvp.cH = (bhu)esp.b.a.ep.a();
            hvp.bC = (LayerableFilterEntityController)esp.al.fm.a();
            hvp.cK = (bx)esp.al.cO.a();
            hvp.bD = (jxj)esp.M.a();
            hvp.cD = (maw)esp.N.a();
            hvp.bE = (jyn)esp.O.a();
            hvp.bF = (osx)esp.b.a.et.a();
            hvp.bG = (acmc)esp.al.fM.a();
            hvp.cp = (adcr)esp.b.ic.a();
            hvp.bH = (adfy)esp.b.ew.a();
            hvp.bI = (gko)esp.b.fo.a();
            hvp.cS = hvr.j();
            hvp.bJ = (utk)esp.al.O.a();
            hvp.bK = (jzg)esp.al.dw.a();
            hvp.bL = arjc.b(esp.al.cD);
            hvp.cf = (uyi)esp.b.jE.a();
            hvp.cg = esp.b.xY();
            hvp.ch = (uyi)esp.b.jb.a();
            hvp.ci = esp.A();
            hvp.bM = (trw)esp.b.ds.a();
            hvp.bN = (HomePageMonitor)esp.al.eM.a();
            hvp.bO = (PageMonitor)esp.al.eN.a();
            hvp.bP = (tmd)esp.b.I.a();
            hvp.bQ = (tlq)esp.b.m.a();
            hvp.cj = esp.b.xM();
            hvp.ck = (uyi)esp.b.dQ.a();
            hvp.cl = esp.b.xK();
            hvp.cm = (uyi)esp.b.jV.a();
            hvp.cn = (uyi)esp.b.fp.a();
            hvp.bR = esp.b.gk;
            hvp.cG = (aeim)esp.al.aB.a();
            hvp.bS = arjc.b(esp.al.A);
            hvp.bT = (acae)esp.al.an.a();
            hvp.cb = (vjz)esp.b.fs.a();
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.o();
        this.bY();
    }
    
    public Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.o();
        return (Context)this.a;
    }
    
    public LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
}
