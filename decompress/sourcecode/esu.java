import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.player.overlay.SizeAdjustableOverlayWrapperLayout;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import java.util.Set;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.PlayerRotationLatencyLoggerController;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import android.content.Context;
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

public final class esu implements fjw, fph, fpi, fpr, ges, gev, gtl, ibw, iuy, ixl, jtq, kqw, krf, lbh, lbv, qtm, qtz, uio, zdx, ariw
{
    private final eqv a;
    private atjj b;
    private final esm c;
    
    public esu() {
    }
    
    public esu(final eqv a, final esm c) {
        this.a = a;
        this.c = c;
        this.b = arjj.b((atjj)new era(c));
    }
    
    public final void a(final CameraView cameraView) {
        cameraView.A = new uhy();
        cameraView.g = (umo)this.c.eV.a();
        cameraView.B = new avt((aagm)this.a.a.eF.a(), (byte[])null);
        cameraView.C = (auip)this.a.a.aq.a();
        cameraView.z = (ulg)this.a.a.au.a();
    }
    
    public final void b(final EditLocation editLocation) {
        editLocation.b = (wwv)this.a.iG.a();
        editLocation.d = (zhb)this.c.T.a();
    }
    
    public final void c(final EditablePhotoView editablePhotoView) {
        editablePhotoView.q = ((quf)((alm)this.c.a.c.a()).h((Class)quf.class)).d;
        editablePhotoView.u = (phq)this.a.a.ay.a();
    }
    
    public final void d(final FullscreenEngagementPanelCoordinatorLayout fullscreenEngagementPanelCoordinatorLayout) {
        final uyi uyi = new uyi((uyf)this.a.w.a(), (arud)this.a.v.a(), (byte[])null, (byte[])null);
        fullscreenEngagementPanelCoordinatorLayout.j = aesy.A(uyi.h(45354827L));
        fullscreenEngagementPanelCoordinatorLayout.i = aesy.A(uyi.h(45354760L));
    }
    
    public final void e(final FullscreenErrorView fullscreenErrorView) {
        fullscreenErrorView.g = (phq)this.a.a.aw.a();
        fullscreenErrorView.h = (phq)this.a.a.ay.a();
    }
    
    public final void f(final InlinePlayerOverlayLayout inlinePlayerOverlayLayout) {
        inlinePlayerOverlayLayout.g = (ViewGroup)this.c.aT.a();
    }
    
    public final void g(final foz foz) {
        foz.A = (arud)this.a.v.a();
        foz.a = (Set)afdu.t((Object)this.c.cx.a(), (Object)this.c.fj.a());
        final Context context = (Context)this.c.d.a();
        final uyf uyf = (uyf)this.a.w.a();
        foz.b = new fpa(context);
        foz.c = (fpc)this.c.a.am.a();
        foz.d = (jbg)this.c.bu.a();
        foz.e = new aayi((oas)this.a.e.a(), (aays)this.c.ax.a());
        foz.x = this.a.xR();
        foz.y = (uyi)this.a.fQ.a();
        foz.f = (jai)this.c.aE.a();
        foz.B = this.c.yU();
        foz.g = (gko)this.a.fo.a();
        foz.z = this.c.bh();
    }
    
    public final void h(final MainRtlAwareViewPager mainRtlAwareViewPager) {
        mainRtlAwareViewPager.h = (ashj)this.a.a.eE.a();
    }
    
    public final void i(final NextGenWatchContainerLayout nextGenWatchContainerLayout) {
        nextGenWatchContainerLayout.d = (kzd)this.c.t.a();
        nextGenWatchContainerLayout.g = (uyi)this.a.dQ.a();
    }
    
    public final void j(final NextGenWatchLayout nextGenWatchLayout) {
        nextGenWatchLayout.a = (lbn)this.c.aH.a();
        nextGenWatchLayout.b = (lcf)this.c.w.a();
        nextGenWatchLayout.c = (lbb)this.c.bV.a();
        nextGenWatchLayout.d = (UpForFullController)this.c.fl.a();
        nextGenWatchLayout.e = (utk)this.c.N.a();
        nextGenWatchLayout.q = (hob)this.c.au.a();
        nextGenWatchLayout.f = (lbz)this.c.a.an.a();
        nextGenWatchLayout.w = new c(this.c.N, (char[])null);
        nextGenWatchLayout.g = (iye)this.c.aF.a();
        nextGenWatchLayout.x = (qpt)this.b.a();
        final esm c = this.c;
        nextGenWatchLayout.h = new kzj(c.aH, c.w, c.bV, c.fl, c.af, c.a.ao, c.au, c.bE, this.a.fQ, c.dn, c.ac, c.bW, c.aa, c.as);
        nextGenWatchLayout.i = (jai)this.c.aE.a();
        nextGenWatchLayout.j = (PlayerRotationLatencyLoggerController)this.c.dn.a();
        nextGenWatchLayout.r = (lfh)this.c.bW.a();
        nextGenWatchLayout.v = new c((Set)afdu.t((Object)this.c.a.aq.a(), (Object)this.c.a.ar.a()));
        nextGenWatchLayout.u = (a)this.c.as.a();
        nextGenWatchLayout.s = (a)this.c.a.ap.a();
        ((Boolean)this.c.aD.a()).booleanValue();
        nextGenWatchLayout.a.i((kyy)nextGenWatchLayout);
        nextGenWatchLayout.b.a((lce)new lix(nextGenWatchLayout, 1));
    }
    
    public final void k(final SizeAdjustableOverlayWrapperLayout sizeAdjustableOverlayWrapperLayout) {
        sizeAdjustableOverlayWrapperLayout.a = (jcu)this.c.aI.a();
    }
    
    public final void l(final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout) {
        final epr a = this.c.a;
        final esm as = a.as;
        specificNetworkErrorViewLoadingFrameLayout.j = new aja(as.l, a.a.jn, as.T, null, (char[])null);
        specificNetworkErrorViewLoadingFrameLayout.h = (thh)this.a.P.a();
        specificNetworkErrorViewLoadingFrameLayout.i = new uyi((uyf)this.a.w.a(), (arud)this.a.v.a(), (byte[])null, (byte[])null);
    }
    
    public final void m(final SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        swipeToContainerFrameLayout.j = (uyf)this.a.w.a();
        final atje a = (atje)this.a.a.eE.a();
        a.getClass();
        swipeToContainerFrameLayout.a = (ashe)a;
        swipeToContainerFrameLayout.b = arjc.b(this.a.d);
        swipeToContainerFrameLayout.k = (uyi)this.a.fp.a();
    }
    
    public final void n(final gtn gtn) {
        final esm c = this.c;
        gtn.aa = c.eo;
        gtn.ab = c.ep;
    }
    
    public final void o(final fos fos) {
        fos.h = (fzo)this.c.aA.a();
        fos.a = (afts)this.a.ey.a();
        fos.g = (uyi)this.a.fQ.a();
    }
    
    public final void p() {
    }
    
    public final void q() {
    }
    
    public final void r() {
    }
    
    public final void s() {
    }
}
