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

class hwq extends hwl
{
    private ContextWrapper cV;
    private boolean cW;
    private boolean cX;
    
    public hwq() {
        this.cX = false;
    }
    
    private final void bZ() {
        if (this.cV == null) {
            this.cV = arlc.e(super.nT(), (br)this);
            this.cW = aqsz.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper cv = this.cV;
        boolean b = true;
        if (cv != null) {
            b = (arlc.d((Context)cv) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.bZ();
        this.bY();
    }
    
    protected final void bY() {
        if (!this.cX) {
            this.cX = true;
            final Object ar = this.aR();
            final hwq hwq = this;
            final ess ess = (ess)ar;
            ((ggq)hwq).av = arlr.b(ess.b.iK);
            ((ggq)hwq).az = (vaf)ess.b.w.a();
            ((ggq)hwq).aw = (gae)ess.ak.cl.a();
            ((ggq)hwq).ax = (ggr)ess.ak.Q.a();
            ((ggq)hwq).ay = (ghb)ess.ak.i.a();
            hwq.af = (gec)ess.ak.eM.a();
            hwq.an = (tmx)ess.b.eC.a();
            hwq.aq = arlr.b(ess.ak.cp);
            hwq.ar = (jxc)ess.ak.cq.a();
            hwq.aH = (gkt)ess.b.lz.a();
            hwq.cu = (skt)ess.ak.ci.a();
            hwq.aJ = (vnu)ess.b.jk.a();
            hwq.aK = (hzc)ess.b.lG.a();
            hwq.aL = arlr.b(ess.b.jH);
            hwq.aM = (acgs)ess.b.jl.a();
            hwq.aN = (tqd)ess.b.ix.a();
            hwq.aO = (oby)ess.b.e.a();
            hwq.aP = ess.ak.fA;
            hwq.aQ = (tgd)ess.b.h.a();
            hwq.aR = (acps)ess.ak.Y.a();
            hwq.aS = (zqt)ess.b.jN.a();
            hwq.aT = (Handler)ess.b.G.a();
            final eqy b = ess.b;
            hwq.aU = b.jo;
            final aahc aahc = (aahc)b.kn.a();
            hwq.aV = (zqs)ess.b.kf.a();
            hwq.aW = (AppTabsBar)ess.ak.ch.a();
            hwq.cP = ess.aM();
            hwq.cv = ess.at();
            hwq.cq = ess.al();
            hwq.cy = ess.ax();
            hwq.aX = ess.d();
            hwq.cN = ess.aK();
            hwq.cO = ess.aL();
            hwq.aY = ess.o();
            hwq.cI = ess.aE();
            hwq.cH = ess.aD();
            hwq.aZ = (ksi)ess.ak.af.a();
            hwq.cM = ess.aJ();
            hwq.cz = ess.ak.yD();
            hwq.ba = (vcy)ess.ak.F.a();
            hwq.bb = ess.ak.ck;
            hwq.bc = (jxu)ess.J.a();
            hwq.cC = (e)ess.ak.cb.a();
            hwq.cB = ess.aA();
            hwq.cA = ess.ay();
            hwq.cw = ess.au();
            hwq.bd = (tqn)ess.b.iv.a();
            hwq.cE = (mdp)ess.b.a.aG.a();
            hwq.cf = (vaf)ess.b.w.a();
            hwq.cs = (arwh)ess.b.v.a();
            hwq.ct = ess.as();
            hwq.be = (InlinePlaybackLifecycleController)ess.ak.y.a();
            hwq.cx = (hzn)ess.ak.aZ();
            hwq.bf = (acrr)ess.ak.dz.a();
            hwq.bg = (ActiveStateScrollSelectionController)ess.ak.cu.a();
            hwq.bh = (acrr)ess.ak.fK.a();
            hwq.bi = (kav)ess.ak.fM.a();
            hwq.bj = (kav)ess.ak.fL.a();
            hwq.bk = (MdxTvFoundForSignInListener)ess.ak.fj.a();
            hwq.cT = (aeea)ess.b.eR.a();
            hwq.cS = (aeea)ess.ak.ao.a();
            hwq.bl = ess.c();
            hwq.cL = ess.aI();
            hwq.bm = (acwn)ess.ak.aB.a();
            hwq.bn = (ilm)ess.b.a.aX.a();
            hwq.bo = (fmj)ess.b.lC.a();
            hwq.bp = (wxx)ess.b.aw.a();
            hwq.bq = ess.ak.gw;
            hwq.br = (ScheduledExecutorService)ess.b.r.a();
            hwq.bs = (Executor)ess.b.g.a();
            hwq.bt = (asid)ess.b.dP.a();
            hwq.cK = (fzw)ess.K.a();
            hwq.bu = (gdh)ess.ak.dr.a();
            hwq.bv = (gdh)ess.ak.eK.a();
            hwq.bw = (gdh)ess.ak.eL.a();
            hwq.bx = (gdn)ess.L.a();
            final eqy b2 = ess.b;
            hwq.by = b2.fZ;
            hwq.bz = b2.P;
            hwq.cg = (feh)ess.ak.eJ.a();
            hwq.cr = (blu)ess.b.lE.a();
            hwq.bA = Optional.empty();
            final esp ak = ess.ak;
            hwq.bB = ak.cP;
            hwq.bC = (ksb)ak.al.a();
            hwq.bD = (xao)ess.b.cB.a();
            hwq.cF = (bhv)ess.b.a.ep.a();
            hwq.bE = (LayerableFilterEntityController)ess.ak.fo.a();
            hwq.cJ = (bx)ess.ak.cQ.a();
            hwq.bF = (jyk)ess.M.a();
            hwq.cD = (mcb)ess.N.a();
            hwq.bG = (jzo)ess.O.a();
            hwq.bH = (oug)ess.b.a.et.a();
            hwq.bI = (acof)ess.ak.fO.a();
            hwq.cR = (aeea)ess.b.if.a();
            hwq.bJ = (adia)ess.b.ey.a();
            hwq.bK = (gkx)ess.b.fr.a();
            hwq.cQ = hwo.e();
            hwq.bL = (uve)ess.ak.P.a();
            hwq.bM = (kag)ess.ak.dy.a();
            hwq.bN = arlr.b(ess.ak.cF);
            hwq.ch = (vai)ess.b.jI.a();
            hwq.ci = (vai)ess.b.ik.a();
            hwq.cj = (vai)ess.b.jf.a();
            hwq.ck = ess.C();
            hwq.bO = (tua)ess.b.ds.a();
            hwq.bP = (HomePageMonitor)ess.ak.eN.a();
            hwq.bQ = (PageMonitor)ess.ak.eO.a();
            hwq.bR = (toj)ess.b.I.a();
            hwq.bS = (tnu)ess.b.m.a();
            hwq.cl = ess.b.xJ();
            hwq.cm = (vai)ess.b.dS.a();
            hwq.cn = ess.b.xH();
            hwq.co = (vai)ess.b.ka.a();
            hwq.cp = (vai)ess.b.fs.a();
            hwq.bT = ess.b.gn;
            hwq.cG = (aekp)ess.ak.aD.a();
            hwq.bU = arlr.b(ess.ak.B);
            hwq.bV = (accf)ess.ak.ap.a();
            hwq.cd = (vme)ess.b.fv.a();
            ((hwt)hwq).cY = (fzw)ess.b.js.a();
            ((hwt)hwq).cV = (fmr)ess.b.jr.a();
            ((hwt)hwq).cW = arlr.b(ess.ak.fm);
        }
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.bZ();
        this.bY();
    }
    
    @Override
    public final Context nT() {
        if (super.nT() == null && !this.cW) {
            return null;
        }
        this.bZ();
        return (Context)this.cV;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater nj = super.nj(bundle);
        return nj.cloneInContext((Context)arlc.f(nj, (br)this));
    }
}
