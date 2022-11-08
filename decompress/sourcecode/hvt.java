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

class hvt extends hvp
{
    private ContextWrapper cV;
    private boolean cW;
    private boolean cX;
    
    public hvt() {
        this.cX = false;
    }
    
    private final void bZ() {
        if (this.cV == null) {
            this.cV = arin.e(super.nT(), (br)this);
            this.cW = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper cv = this.cV;
        boolean b = true;
        if (cv != null) {
            b = (arin.d((Context)cv) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.bZ();
        ((hvs)this).bY();
    }
    
    protected final void bY() {
        if (!this.cX) {
            this.cX = true;
            final Object ar = ((hvs)this).aR();
            final hvt hvt = this;
            final esp esp = (esp)ar;
            ((ggh)hvt).av = arjc.b(esp.b.iG);
            ((ggh)hvt).az = (uyf)esp.b.w.a();
            ((ggh)hvt).aw = (fzw)esp.al.cj.a();
            ((ggh)hvt).ax = (ggi)esp.al.P.a();
            ((ggh)hvt).ay = (ggs)esp.al.i.a();
            hvt.af = (gdu)esp.al.eL.a();
            hvt.an = (tku)esp.b.eA.a();
            hvt.aq = arjc.b(esp.al.cn);
            hvt.ar = (jwb)esp.al.co.a();
            hvt.aH = (gkl)esp.b.lw.a();
            hvt.cv = (sin)esp.al.cg.a();
            hvt.aJ = (vlq)esp.b.jg.a();
            hvt.aK = (hyh)esp.b.lD.a();
            hvt.aL = arjc.b(esp.b.jD);
            hvt.aM = (aceo)esp.b.jh.a();
            hvt.aN = (tny)esp.b.it.a();
            hvt.aO = (oas)esp.b.e.a();
            hvt.aP = esp.al.fy;
            hvt.aQ = (tdz)esp.b.h.a();
            hvt.aR = (acno)esp.al.X.a();
            hvt.aS = (zpa)esp.b.jJ.a();
            hvt.aT = (Handler)esp.b.G.a();
            final eqv b = esp.b;
            hvt.aU = b.jk;
            final aafi aafi = (aafi)b.ki.a();
            hvt.aV = (zoz)esp.b.ka.a();
            hvt.aW = (AppTabsBar)esp.al.cf.a();
            hvt.cQ = esp.aO();
            hvt.cw = esp.at();
            hvt.co = esp.aj();
            hvt.cz = esp.ax();
            hvt.ct = esp.as();
            hvt.cO = esp.aM();
            hvt.cP = esp.aN();
            hvt.aX = esp.m();
            hvt.cJ = esp.aE();
            hvt.cI = esp.aD();
            hvt.aY = (krh)esp.al.ae.a();
            hvt.cN = esp.aL();
            hvt.cA = esp.al.yH();
            hvt.aZ = (vax)esp.al.E.a();
            hvt.ba = esp.al.ci;
            hvt.bb = (jws)esp.J.a();
            hvt.cB = (e)esp.al.bZ.a();
            hvt.cE = esp.aB();
            hvt.cC = esp.aA();
            hvt.cx = esp.au();
            hvt.bc = (toi)esp.b.ir.a();
            hvt.cF = (mck)esp.b.a.aG.a();
            hvt.cd = (uyf)esp.b.w.a();
            hvt.cr = (arud)esp.b.v.a();
            hvt.cu = esp.ar();
            hvt.bd = (InlinePlaybackLifecycleController)esp.al.y.a();
            hvt.cy = (hyr)esp.al.aW();
            hvt.be = (acpn)esp.al.dx.a();
            hvt.bf = (ActiveStateScrollSelectionController)esp.al.cs.a();
            hvt.bg = (acpn)esp.al.fI.a();
            hvt.bh = (jzu)esp.al.fK.a();
            hvt.bi = (jzu)esp.al.fJ.a();
            hvt.bj = (MdxTvFoundForSignInListener)esp.al.fi.a();
            hvt.cT = (adcr)esp.b.eO.a();
            hvt.cR = (aeby)esp.al.am.a();
            hvt.cs = esp.ap();
            hvt.cM = esp.aJ();
            hvt.bk = (acuj)esp.al.az.a();
            hvt.bl = (iko)esp.b.a.aX.a();
            hvt.bm = (fmd)esp.b.lz.a();
            hvt.bn = (wvu)esp.b.aw.a();
            hvt.bo = esp.al.gB;
            hvt.bp = (ScheduledExecutorService)esp.b.r.a();
            hvt.bq = (Executor)esp.b.g.a();
            hvt.br = (asho)esp.b.dO.a();
            hvt.cL = (fzo)esp.K.a();
            hvt.bs = (gcy)esp.al.dq.a();
            hvt.bt = (gcy)esp.al.eJ.a();
            hvt.bu = (gcy)esp.al.eK.a();
            hvt.bv = (gde)esp.L.a();
            final eqv b2 = esp.b;
            hvt.bw = b2.fW;
            hvt.bx = b2.P;
            hvt.ce = (feb)esp.al.eI.a();
            hvt.cq = (blt)esp.b.lB.a();
            hvt.by = Optional.empty();
            final esm al = esp.al;
            hvt.bz = al.cN;
            hvt.bA = (kra)al.aj.a();
            hvt.bB = (wyo)esp.b.cB.a();
            hvt.cH = (bhu)esp.b.a.ep.a();
            hvt.bC = (LayerableFilterEntityController)esp.al.fm.a();
            hvt.cK = (bx)esp.al.cO.a();
            hvt.bD = (jxj)esp.M.a();
            hvt.cD = (maw)esp.N.a();
            hvt.bE = (jyn)esp.O.a();
            hvt.bF = (osx)esp.b.a.et.a();
            hvt.bG = (acmc)esp.al.fM.a();
            hvt.cp = (adcr)esp.b.ic.a();
            hvt.bH = (adfy)esp.b.ew.a();
            hvt.bI = (gko)esp.b.fo.a();
            hvt.cS = hvr.j();
            hvt.bJ = (utk)esp.al.O.a();
            hvt.bK = (jzg)esp.al.dw.a();
            hvt.bL = arjc.b(esp.al.cD);
            hvt.cf = (uyi)esp.b.jE.a();
            hvt.cg = esp.b.xY();
            hvt.ch = (uyi)esp.b.jb.a();
            hvt.ci = esp.A();
            hvt.bM = (trw)esp.b.ds.a();
            hvt.bN = (HomePageMonitor)esp.al.eM.a();
            hvt.bO = (PageMonitor)esp.al.eN.a();
            hvt.bP = (tmd)esp.b.I.a();
            hvt.bQ = (tlq)esp.b.m.a();
            hvt.cj = esp.b.xM();
            hvt.ck = (uyi)esp.b.dQ.a();
            hvt.cl = esp.b.xK();
            hvt.cm = (uyi)esp.b.jV.a();
            hvt.cn = (uyi)esp.b.fp.a();
            hvt.bR = esp.b.gk;
            hvt.cG = (aeim)esp.al.aB.a();
            hvt.bS = arjc.b(esp.al.A);
            hvt.bT = (acae)esp.al.an.a();
            hvt.cb = (vjz)esp.b.fs.a();
            ((hvw)hvt).cY = (fzo)esp.b.jo.a();
            ((hvw)hvt).cV = (fml)esp.b.jn.a();
            ((hvw)hvt).cW = arjc.b(esp.al.fk);
        }
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.bZ();
        ((hvs)this).bY();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.cW) {
            return null;
        }
        this.bZ();
        return (Context)this.cV;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arin.f(nj, (br)this));
    }
}
