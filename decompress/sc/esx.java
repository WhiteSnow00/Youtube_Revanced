import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.player.overlay.SizeAdjustableOverlayWrapperLayout;
import java.util.Set;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
import com.google.android.libraries.youtube.edit.camera.CameraView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esx implements fkc, fpo, fpp, fpy, gfa, gfd, gtu, ict, ivx, iyj, jus, krx, ksg, lci, lcw, quy, qvk, ukk, zfq, arll
{
    private final eqy a;
    private atke b;
    private final esp c;
    
    public esx() {
    }
    
    public esx(final eqy a, final esp c) {
        this.a = a;
        this.c = c;
        this.b = arly.b((atke)new erd(c));
    }
    
    public final void a(final CameraView cameraView) {
        cameraView.A = new ujz();
        cameraView.g = (uol)this.c.eW.a();
        cameraView.E = new aeea((qqr)this.a.a.eF.a());
        cameraView.B = (aujg)this.a.a.ar.a();
        cameraView.z = (unc)this.a.a.av.a();
    }
    
    public final void b(final EditLocation editLocation) {
        editLocation.b = (wyw)this.a.iK.a();
        editLocation.d = (ziy)this.c.U.a();
    }
    
    public final void c(final EditablePhotoView editablePhotoView) {
        editablePhotoView.q = ((qvq)((aln)this.c.a.i.a()).h((Class)qvq.class)).d;
        editablePhotoView.r = (pba)this.a.a.az.a();
    }
    
    public final void d(final FullscreenEngagementPanelCoordinatorLayout fullscreenEngagementPanelCoordinatorLayout) {
        final vai vai = new vai((vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
        fullscreenEngagementPanelCoordinatorLayout.j = afwm.G(vai.h(45354827L));
        fullscreenEngagementPanelCoordinatorLayout.i = afwm.G(vai.h(45354760L));
    }
    
    public final void e(final FullscreenErrorView fullscreenErrorView) {
        fullscreenErrorView.h = (pja)this.a.a.ax.a();
        fullscreenErrorView.d = (pba)this.a.a.az.a();
    }
    
    public final void f(final InlinePlayerOverlayLayout inlinePlayerOverlayLayout) {
        inlinePlayerOverlayLayout.g = (ViewGroup)this.c.aV.a();
    }
    
    public final void g(final fpe fpe) {
        fpe.z = (arwh)this.a.v.a();
        fpe.a = (Set)afft.t((Object)this.c.cz.a(), (Object)this.c.fl.a());
        fpe.b = (fpf)this.c.aX();
        fpe.c = (fpj)this.c.fk.a();
        fpe.d = (jcf)this.c.bw.a();
        fpe.e = new abaf((oby)this.a.e.a(), (abap)this.c.az.a());
        fpe.x = this.a.xO();
        fpe.f = (jbh)this.c.aG.a();
        fpe.A = this.c.yF();
        fpe.g = (gkx)this.a.fr.a();
        fpe.y = this.c.bm();
    }
    
    public final void h(final MainRtlAwareViewPager mainRtlAwareViewPager) {
        mainRtlAwareViewPager.h = (ashy)this.a.a.eE.a();
    }
    
    public final void i(final NextGenWatchContainerLayout nextGenWatchContainerLayout) {
        nextGenWatchContainerLayout.d = (lag)this.c.t.a();
        nextGenWatchContainerLayout.g = (vai)this.a.dS.a();
    }
    
    public final void j(final NextGenWatchLayout nextGenWatchLayout) {
        nextGenWatchLayout.a = (lco)this.c.aJ.a();
        nextGenWatchLayout.b = (ldg)this.c.w.a();
        nextGenWatchLayout.c = (lcc)this.c.bX.a();
        nextGenWatchLayout.d = (UpForFullController)this.c.fn.a();
        nextGenWatchLayout.e = (uve)this.c.O.a();
        nextGenWatchLayout.n = (hox)this.c.aw.a();
        nextGenWatchLayout.q = (lnv)this.c.a.ax.a();
        nextGenWatchLayout.u = new c(this.c.O, (byte[])null, (byte[])null);
        nextGenWatchLayout.f = (izd)this.c.aH.a();
        nextGenWatchLayout.w = (pvh)this.b.a();
        final esp c = this.c;
        nextGenWatchLayout.o = new php(c.aJ, c.w, c.bX, c.fn, c.ag, c.a.ay, c.aw, c.bG, this.a.fT, c.ad, c.bY, c.ab, c.au);
        nextGenWatchLayout.g = (jbh)this.c.aG.a();
        nextGenWatchLayout.p = (lgj)this.c.bY.a();
        nextGenWatchLayout.t = new c((Set)afft.t((Object)this.c.a.aA.a(), (Object)this.c.a.aB.a()));
        nextGenWatchLayout.s = (jki)this.c.au.a();
        nextGenWatchLayout.r = (jki)this.c.a.az.a();
        ((Boolean)this.c.aF.a()).booleanValue();
        nextGenWatchLayout.a.i((laa)nextGenWatchLayout);
        nextGenWatchLayout.b.a((ldf)new ljw(nextGenWatchLayout, 1));
    }
    
    public final void k(final SizeAdjustableOverlayWrapperLayout sizeAdjustableOverlayWrapperLayout) {
        sizeAdjustableOverlayWrapperLayout.a = (jdu)this.c.aK.a();
    }
    
    public final void l(final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout) {
        final epu a = this.c.a;
        final esp ac = a.aC;
        specificNetworkErrorViewLoadingFrameLayout.j = new ajb(ac.l, a.a.jr, ac.U, (byte[])null, (byte[])null);
        specificNetworkErrorViewLoadingFrameLayout.h = (tjm)this.a.P.a();
        specificNetworkErrorViewLoadingFrameLayout.i = new vai((vaf)this.a.w.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
    }
    
    public final void m(final SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        swipeToContainerFrameLayout.j = (vaf)this.a.w.a();
        final atjz a = (atjz)this.a.a.eE.a();
        a.getClass();
        swipeToContainerFrameLayout.a = (asht)a;
        swipeToContainerFrameLayout.b = arlr.b(this.a.d);
        swipeToContainerFrameLayout.k = (vai)this.a.fs.a();
    }
    
    public final void n(final gtw gtw) {
        gtw.aa = this.c.a.aw;
    }
    
    public final void o(final geo geo) {
        geo.b = (ViewGroup)this.c.aV.a();
    }
    
    public final void p(final fox fox) {
        fox.h = (fzw)this.c.aC.a();
        fox.a = (afvt)this.a.eA.a();
        fox.g = (vai)this.a.fT.a();
    }
    
    public final void q() {
    }
    
    public final void r() {
    }
    
    public final void s() {
    }
}
