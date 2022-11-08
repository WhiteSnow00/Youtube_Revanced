import java.util.Set;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import j$.util.Optional;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import android.os.Handler;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hkx extends hni implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public hkx() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
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
        this.a();
        this.nV();
    }
    
    public final Object aR() {
        return this.nU().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.a();
        this.nV();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    public final arin nU() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    protected final void nV() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hoa hoa = (hoa)this;
            final esp esp = (esp)ar;
            final aaca aaca = (aaca)esp.b.pU.a();
            hoa.bX = (hyr)esp.b.pX.a();
            hoa.ch = (fzo)esp.b.jR.a();
            hoa.cg = (fzo)esp.b.jS.a();
            hoa.d = (hmk)esp.s.a();
            hoa.e = (hlh)esp.al.dG.a();
            hoa.ae = (hlk)esp.al.dp.a();
            hoa.bW = (hyr)esp.b.pK.a();
            hoa.af = (hrf)esp.b.a.er.a();
            hoa.ca = (hyr)esp.al.a.t.a();
            hoa.ag = (ReelPlaybackErrorLogger)esp.al.a.u.a();
            hoa.ah = new hmo((hqa)esp.al.du.a(), (aagm)esp.b.a.es.a(), (wwu)esp.al.o.a(), (hqd)esp.p.a(), null);
            final esm al = esp.al;
            final atjj d = al.d;
            final eqv b = esp.b;
            hoa.ai = new hql(d, b.jh, al.cP, al.o, esp.v, esp.p, esp.w, esp.x, esp.z, b.v, b.id);
            final Context context = (Context)esp.al.d.a();
            final Executor executor = (Executor)esp.b.g.a();
            final abno abno = (abno)esp.al.cP.a();
            final esm al2 = esp.al;
            final eg eg = new eg(al2.aC, al2.an, al2.o, (short[])null);
            final vyn vyn = (vyn)esp.al.bf.a();
            final vxg vxg = (vxg)esp.al.bq.a();
            final esm al3 = esp.al;
            final abhr abhr = new abhr(al3.d, al3.a.w, al3.am, al3.o, al3.A, al3.C, esp.b.cF, al3.ap, al3.bg, esp.A, esp.B, (byte[])null);
            final esm al4 = esp.al;
            hoa.cb = new ljk(context, executor, abno, eg, vyn, vxg, abhr, al4.aC, (acae)al4.an.a(), (fyt)esp.al.bI.a(), new fzo((Context)esp.al.d.a(), (afts)esp.b.ey.a()), (utk)esp.al.O.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            final eqv b2 = esp.b;
            hoa.cc = new hyr(b2.a.dP, (byte[])null);
            hoa.aj = (hmm)b2.jQ.a();
            hoa.ak = (hok)esp.t.a();
            hoa.al = (hlx)esp.u.a();
            hoa.am = (hqa)esp.al.du.a();
            hoa.an = (hmq)esp.q.a();
            hoa.ao = (hpd)esp.o.a();
            final hqe hqe = (hqe)esp.r.a();
            hoa.ap = new hms((wwu)esp.al.o.a(), (hqd)esp.p.a(), (hqe)esp.r.a());
            hoa.cf = new fzo(esp.al.du, esp.p, (char[])null, (byte[])null);
            hoa.aq = (hlf)esp.b.a.dP.a();
            hoa.bY = (hyr)esp.y.a();
            hoa.bZ = (cca)esp.b.lF.a();
            hoa.ar = (abno)esp.al.cP.a();
            final abit bo = ((abns)esp.al.a.a.mv.a()).bO();
            bo.getClass();
            hoa.bO = bo;
            ((abns)esp.al.a.a.mv.a()).e().getClass();
            hoa.as = esp.al.a.o();
            hoa.at = (abns)esp.b.mv.a();
            hoa.au = (oas)esp.b.e.a();
            hoa.av = (tdz)esp.b.h.a();
            hoa.aw = (aceo)esp.b.jh.a();
            hoa.ax = (hjp)esp.al.fc.a();
            hoa.ay = (vax)esp.al.E.a();
            hoa.az = (zki)esp.b.aC.a();
            hoa.aA = (zkw)esp.b.py.a();
            hoa.aB = (tny)esp.b.it.a();
            hoa.aC = (fno)esp.al.x.a();
            hoa.aD = (wwu)esp.al.o.a();
            hoa.aE = (aawb)esp.b.iH.a();
            hoa.aF = arjc.b(esp.b.fo);
            final Context context2 = (Context)esp.al.V.a();
            hoa.aG = (Handler)esp.b.G.a();
            hoa.aH = (hpb)esp.C.a();
            hoa.aI = (hpc)esp.D.a();
            hoa.aJ = (SubtitlesOverlayPresenter)esp.E.a();
            hoa.aK = (abbo)esp.al.a.x.a();
            hoa.aL = arjc.b(esp.F);
            hoa.aM = arjc.b(esp.G);
            hoa.aN = arjc.b(esp.al.bo);
            hoa.aO = arjc.b(esp.al.a.y);
            final tqy tqy = (tqy)esp.b.dJ.a();
            hoa.aP = (thh)esp.b.P.a();
            final yzo yzo = (yzo)esp.b.dK.a();
            hoa.bT = esp.al.xK();
            esp.b.a.gQ();
            final zgv zgv = (zgv)esp.b.bj.a();
            hoa.bP = (uyf)esp.b.w.a();
            hoa.bU = (arud)esp.b.v.a();
            hoa.bQ = (uyi)esp.b.jN.a();
            hoa.bR = (uyi)esp.al.dl.a();
            hoa.bS = (uyi)esp.b.dP.a();
            final aeyr aeyr = (aeyr)esp.b.fb.a();
            hoa.cd = (acnx)esp.b.a.cY.a();
            hoa.ci = (aeby)esp.al.dB.a();
            hoa.aQ = (Set)afdu.s((Object)esp.al.a.u.a());
            hoa.aR = (tku)esp.b.ge.a();
            hoa.ce = (mrm)esp.g.a();
            hoa.aS = (toa)esp.al.n.a();
            final gkt gkt = (gkt)esp.b.a.cw.a();
            hoa.aT = (acuj)esp.al.az.a();
            hoa.aU = (utk)esp.al.O.a();
            hoa.aV = (acup)esp.H.a();
            hoa.aW = (fjp)esp.al.z.a();
            hoa.aX = (Optional)esp.al.r.a();
            hoa.bV = new abcr((vbq)esp.b.bp.a(), (zki)esp.b.aC.a(), (mrm)esp.g.a(), (uyi)esp.b.jU.a(), (aeby)esp.b.ji.a(), null, null, null, null);
            hoa.aY = (gau)esp.al.aQ.a();
            final uyi uyi = (uyi)esp.al.cE.a();
            hoa.aZ = (adfy)esp.b.ew.a();
            hoa.ba = (hod)esp.I.a();
            hoa.bb = (asho)esp.b.dO.a();
            hoa.bc = (fjz)esp.b.id.a();
            hoa.bd = (PipPlayerObserver)esp.al.s.a();
            hoa.be = (abrx)esp.al.ca.a();
        }
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = this.aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
}
