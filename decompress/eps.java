import java.util.concurrent.Callable;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import java.util.function.Supplier;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import com.google.android.apps.youtube.app.common.command.modal.ModalDialogController;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import android.support.constraint.ConstraintLayout;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.apps.youtube.app.player.controls.PreviousPaddleMenuItemController;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.player.overlay.DefaultInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.android.apps.youtube.app.watch.panel.ui.cinematics.WatchCinematicSettingsController;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import java.security.SecureRandom;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import com.google.android.apps.youtube.app.player.overlay.ChapterSeekOverlayController;
import com.google.android.libraries.youtube.rendering.logging.InteractionLoggingOverlayController$Observer;
import com.google.android.apps.youtube.app.common.util.NfcHelper;
import java.util.Collection;
import com.google.android.apps.youtube.app.wellness.youtubetime.YoutubeTimeTimerController;
import com.google.android.apps.youtube.app.player.overlay.ControlsOverlayAlwaysShownController;
import com.google.android.apps.youtube.app.watch.playback.MinimizedPlaybackPolicyController;
import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
import com.google.android.apps.youtube.app.common.ui.theme.elements.ThemeStoreLifecycleController;
import com.google.android.libraries.youtube.player.features.mediacontroller.VolumeControlsManager;
import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;
import com.google.android.apps.youtube.app.player.PlayerResponseServiceEndpointListener;
import com.google.android.apps.youtube.app.watch.engagementpanel.ShowPlaylistEngagementPanelOnUiReadyHandler;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watchwhile.pivotbar.impl.ShortsTargetedListener;
import com.google.android.libraries.youtube.common.lifecycle.initializable.LifecycleInitializableManager;
import com.google.android.apps.youtube.app.watchwhile.startup.StartupSignalStream;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.libraries.youtube.metadataeditor.thumbnail.ShortsEditThumbnailController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.comment.endpoint.ChangeCommentsMarkersVisibilityCommandHelper;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import com.google.android.libraries.youtube.account.verification.controller.PhoneVerificationController;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.ui.keyboardshortcuts.KeyboardShortcutsController;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.watchwhile.backnavigation.WatchWhileOnBackPressedEvaluator;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import java.util.Map;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.apps.tiktok.account.api.controller.KeepStateCallbacksHandler;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.common.csi.WatchUiActionLatencyLogger;
import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.bottomui.DefaultHatsController;
import com.google.android.apps.youtube.app.common.playerviewmodemonitor.DefaultPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import android.os.Handler;
import java.util.Set;
import j$.util.Optional;
import android.content.Context;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eps implements atke
{
    public final eqy a;
    public final esp b;
    private final int c;
    private final esq d;
    
    public eps(final eqy a, final esq d, final esp b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    private final Object b() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 99: {
                return ljm.q((vcy)esp.oW(this.b).a(), (vcy)eqy.lr(this.a).a(), (fxw)esp.gn(this.b).a());
            }
            case 98: {
                return new hth((acjd)eqy.mT(this.a).a(), eqy.pb(this.a));
            }
            case 97: {
                return afft.v((Object)esp.gN(this.b).a(), (Object)esp.wd(this.b).a(), (Object)esp.ou(this.b).a(), (Object)esp.gW(this.b).a());
            }
            case 96: {
                return lmb.d((Activity)esp.oz(this.b).a(), esp.jG(this.b));
            }
            case 95: {
                final affr j = afft.j(2);
                j.h((Object)era.ck(eqy.r(this.a)).a());
                j.j((Iterable)esp.gU(this.b).a());
                return j.g();
            }
            case 94: {
                return new fxw(esp.tE(this.b));
            }
            case 93: {
                return new fbb((fxw)esp.gn(this.b).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 92: {
                return new fjg((Activity)esp.oz(this.b).a(), (vgy)eqy.eL(this.a).a(), (fbb)esp.uz(this.b).a(), (LoggingUrlsPingController)esp.lT(this.b).a(), (acar)eqy.pE(this.a).a(), (wyv)esp.ow(this.b).a(), (Executor)eqy.fT(this.a).a(), (tov)era.fd(eqy.r(this.a)).a(), (arwh)eqy.qn(this.a).a(), null, null, null);
            }
            case 91: {
                return htj.c(esp.fb(this.b), (vcy)eqy.he(this.a).a());
            }
            case 90: {
                return ljm.v((Activity)esp.oz(this.b).a(), (hyx)era.aP(eqy.r(this.a)).a(), (ghe)esp.wl(this.b).a());
            }
            case 89: {
                return new hln((Activity)esp.oz(this.b).a(), (hyx)era.aP(eqy.r(this.a)).a(), esp.ft(this.b), 10, (byte[])null, (byte[])null, (byte[])null);
            }
            case 88: {
                return ufa.o((hln)esp.gv(this.b).a());
            }
            case 87: {
                return uzu.f((Activity)esp.oz(this.b).a(), esp.fq(this.b));
            }
            case 86: {
                return abzn.k();
            }
            case 85: {
                return abzn.d(esp.cR(this.b));
            }
            case 84: {
                return new oir();
            }
            case 83: {
                return oqc.p(aezp.k((Object)esp.cQ(this.b)), aezp.k((Object)eqy.pH(this.a).a()), arlr.b(era.aJ(eqy.r(this.a))));
            }
            case 82: {
                return ohv.u((mdp)era.bd(eqy.r(this.a)).a());
            }
            case 81: {
                return ohv.t((mdp)era.bd(eqy.r(this.a)).a());
            }
            case 80: {
                return ohv.s((mdp)era.bd(eqy.r(this.a)).a(), esp.ev(this.b));
            }
            case 79: {
                return adca.j();
            }
            case 78: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (char[])null, (byte[])null, (byte[])null);
            }
            case 77: {
                return sao.n((Context)esp.oz(this.b).a(), arlr.b(esp.wB(this.b)), srz.p());
            }
            case 76: {
                return new vyo(esp.cS(this.b), eqy.nz(this.a), arlr.b(esp.oU(this.b)), 1);
            }
            case 75: {
                final Map fg = esp.fg(this.b);
                final afft r = afft.r();
                final oum oum = (oum)esp.pv(this.b).a();
                Optional.of((Object)era.cZ(eqy.r(this.a)).a());
                final Optional of = Optional.of((Object)era.fZ(eqy.r(this.a)));
                final Optional of2 = Optional.of((Object)era.aq(eqy.r(this.a)).a());
                final asid er = esp.er(this.b);
                final atke jh = esp.jh(this.b);
                final Optional of3 = Optional.of((Object)era.b(eqy.r(this.a)));
                final pja yy = esp.yY(this.b);
                final esp b = this.b;
                return ooi.u(fg, (Set)r, oum, of, of2, er, jh, of3, yy, esp.pg(b), esp.pf(b));
            }
            case 74: {
                return ooi.t((oqh)esp.qQ(this.b).a(), (Optional)esp.qI(this.b).a(), Optional.of((Object)era.cZ(eqy.r(this.a)).a()), esp.hC(this.b).a(), esp.yY(this.b));
            }
            case 73: {
                return ooi.j(esp.eS(this.b), esp.eR(this.b), esp.eT(this.b), (oum)esp.pv(this.b).a(), aezp.k((Object)era.dz(eqy.r(this.a)).a()), aezp.k((Object)era.cZ(eqy.r(this.a)).a()));
            }
            case 72: {
                final Map fh = esp.fh(this.b);
                final Map fi = esp.fi(this.b);
                final afft r2 = afft.r();
                final oum oum2 = (oum)esp.pv(this.b).a();
                final aezp k = aezp.k((Object)eqy.pH(this.a).a());
                final int a = acdh.a;
                return ohv.b(fh, fi, (Set)r2, oum2, k, aezp.k((Object)true), aezp.k((Object)era.gb(eqy.r(this.a))), aezp.k((Object)era.gd(eqy.r(this.a))));
            }
            case 71: {
                return new omw((oud)esp.iP(this.b).a(), (byte[])null);
            }
            case 70: {
                return abzn.j((Context)esp.oz(this.b).a(), arlr.b(esp.wB(this.b)), arlr.b(esp.oU(this.b)), (oum)esp.pv(this.b).a(), (acvr)esp.pu(this.b).a(), (vai)eqy.vx(this.a).a(), (aekp)esp.gY(this.b).a(), esp.Ag(this.b), (vai)esp.uZ(this.b).a(), esp.zm(this.b), (aekp)esp.wM(this.b).a(), (acmr)eqy.hK(this.a).a(), Optional.of((Object)era.eh(eqy.r(this.a)).a()));
            }
            case 69: {
                return tny.d((tqf)esp.ia(this.b).a());
            }
            case 68: {
                return fqs.i();
            }
            case 67: {
                return gcn.f((Handler)eqy.sJ(this.a).a());
            }
            case 66: {
                return fpi.d((abpu)esp.qW(this.b).a());
            }
            case 65: {
                final esp b2 = this.b;
                final ldh f = ldi.f((fzw)era.fK(eqy.r(this.a)).a());
                esp.xt(b2, f);
                return f;
            }
            case 64: {
                return eyv.i((bu)esp.pI(this.b).a());
            }
            case 63: {
                return ips.c((cl)esp.rK(this.b).a());
            }
            case 62: {
                return ips.d((abpq)esp.ka(this.b).a(), esp.ef(this.b), (iri)esp.ip(this.b).a(), esp.wV(this.b));
            }
            case 61: {
                final esp b3 = this.b;
                final ldg b4 = ldi.b(esp.nZ(b3), esp.fU(b3));
                esp.xs(b3, b4);
                return b4;
            }
            case 60: {
                return ixz.p();
            }
            case 59: {
                return isz.k();
            }
            case 58: {
                return jbu.h((abpu)esp.qW(this.b).a(), (iuv)esp.hM(this.b).a(), (iyf)esp.tA(this.b).a(), (asid)eqy.fJ(this.a).a(), (asid)eqy.fU(this.a).a());
            }
            case 57: {
                return new lag(esp.fV(this.b));
            }
            case 56: {
                return lkh.d();
            }
            case 55: {
                return hoy.s((ghb)esp.il(this.b).a(), (vaf)eqy.pn(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 54: {
                return hoy.i(eqy.pn(this.a), (hpq)esp.wp(this.b).a());
            }
            case 53: {
                return ggm.h((Optional)esp.rl(this.b).a(), (asht)esp.qO(this.b).a());
            }
            case 52: {
                return new DefaultPlayerViewModeMonitor((PipPlayerObserver)esp.nJ(this.b).a(), (lag)esp.kf(this.b).a(), (ldg)esp.vI(this.b).a(), (fnt)esp.jU(this.b).a(), (InlinePlaybackLifecycleController)esp.kC(this.b).a(), (aawr)era.fB(eqy.r(this.a)).a(), (Optional)esp.rl(this.b).a());
            }
            case 51: {
                final esp b5 = this.b;
                return fqs.j(esp.it(b5), esp.nh(b5), esp.bi(), (Activity)esp.oz(this.b).a());
            }
            case 50: {
                return hoy.h(esp.il(this.b), (vaf)eqy.pn(this.a).a());
            }
            case 49: {
                return ljm.o((Activity)esp.oz(this.b).a());
            }
            case 48: {
                return hdz.g((Activity)esp.oz(this.b).a());
            }
            case 47: {
                return hlb.i((wyn)eqy.hP(this.a).a());
            }
            case 46: {
                final wyw wyw = (wyw)eqy.hP(this.a).a();
                hxp.c(wyw);
                return wyw;
            }
            case 45: {
                return hxp.d((wyw)esp.ov(this.b).a(), esp.eW(this.b), (Activity)esp.oz(this.b).a());
            }
            case 44: {
                return guc.k((Context)esp.oz(this.b).a(), era.v(eqy.r(this.a)), eqy.kE(this.a), guc.e(), esp.xI(this.b), (zmf)eqy.pK(this.a).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (xao)eqy.hS(this.a).a(), (wyv)esp.ow(this.b).a(), eqy.pn(this.a));
            }
            case 43: {
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final bu bu = (bu)esp.pI(this.b).a();
                final msr msr = (msr)esp.ox(this.b).a();
                final Map fj = esp.fj(this.b);
                final atke ow = esp.ow(this.b);
                hlb.k();
                return guc.r(vaf, arwh, bu, msr, fj, ow, (oby)eqy.gH(this.a).a(), (asid)eqy.fU(this.a).a());
            }
            case 42: {
                return hdz.n(esp.tj(this.b));
            }
            case 41: {
                return hlk.e((Activity)esp.oz(this.b).a(), esp.fz(this.b));
            }
            case 40: {
                return hlb.n((hof)esp.rm(this.b).a());
            }
            case 39: {
                return aerr.f((Activity)esp.oz(this.b).a());
            }
            case 38: {
                return thm.p(esp.bV(this.b));
            }
            case 37: {
                return tny.p((Activity)esp.oz(this.b).a(), (vai)eqy.lv(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 36: {
                return new gap((vaf)eqy.pn(this.a).a(), esp.Ac(this.b), (tqf)esp.ia(this.b).a(), esp.Ah(this.b), (ghb)esp.il(this.b).a(), (hzn)esp.eJ(this.b), (gkx)eqy.hv(this.a).a(), (cyb)esp.ti(this.b).a(), (vai)eqy.vx(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 35: {
                return lkh.e((gap)esp.gH(this.b).a(), (fjv)esp.ra(this.b).a(), (tqf)esp.ia(this.b).a(), (ashi)esp.sx(this.b).a(), esp.iT(this.b));
            }
            case 34: {
                return fuu.h((Activity)esp.oz(this.b).a(), esp.fk(this.b), esp.gH(this.b));
            }
            case 33: {
                final gbc gbc = (gbc)esp.oR(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final esp b6 = this.b;
                return new DefaultHatsController(gbc, vcy, esp.ra(b6), esp.nU(b6), esp.zK(b6), (abpu)esp.qW(this.b).a(), (wyv)esp.ow(this.b).a(), (skc)eqy.hr(this.a).a(), (Handler)eqy.sJ(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 32: {
                return new hzu((vwt)eqy.vY(this.a).a(), esp.cv(this.b), (vcy)esp.oW(this.b).a());
            }
            case 31: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final acgs acgs = (acgs)eqy.kr(this.a).a();
                final hzu hzu = (hzu)esp.vK(this.b).a();
                final hzv cv = esp.cv(this.b);
                final abpu abpu = (abpu)esp.qW(this.b).a();
                final rkc rkc = (rkc)eqy.hA(this.a).a();
                final rqs rqs = (rqs)eqy.ot(this.a).a();
                final man man = (man)eqy.hz(this.a).a();
                final smd smd = (smd)eqy.eC(this.a).a();
                final fzw fzw = (fzw)esp.hT(this.b).a();
                final rwt rwt = (rwt)era.aO(eqy.r(this.a)).a();
                final vgy vgy = (vgy)eqy.eL(this.a).a();
                final fzw fzw2 = (fzw)era.fK(eqy.r(this.a)).a();
                final aahc aahc = (aahc)eqy.rj(this.a).a();
                final fxh fxh = (fxh)esp.uY(this.b).a();
                final vcy vcy2 = (vcy)esp.oW(this.b).a();
                final fny fny = (fny)esp.nW(this.b).a();
                final blu blu = (blu)esp.ve(this.b).a();
                final fjv fjv = (fjv)esp.ra(this.b).a();
                final e yi = esp.yi(this.b);
                final wyw wyw2 = (wyw)esp.qe(this.b).a();
                final fzb fzb = (fzb)esp.vc(this.b).a();
                final ActiveStateScrollSelectionController activeStateScrollSelectionController = (ActiveStateScrollSelectionController)esp.gT(this.b).a();
                final iab iab = (iab)esp.lA(this.b).a();
                final lfm lfm = new lfm();
                final lfk ck = esp.cK(this.b);
                final aeea aeea = (aeea)esp.sZ(this.b).a();
                final blu ad = esp.Ad(this.b);
                final leu cj = esp.cJ(this.b);
                final jki yk = esp.yK(this.b);
                final esp b7 = this.b;
                final c ze = esp.zE(b7);
                final jki zk = esp.zk(b7);
                final fxw fxw = (fxw)esp.gn(this.b).a();
                final faz ck2 = esp.ck(this.b);
                final kzi kzi = (kzi)esp.pH(this.b).a();
                final vaf vaf2 = (vaf)eqy.pn(this.a).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                final elx elx = (elx)esp.os(this.b).a();
                final aeea aeea2 = (aeea)esp.iL(this.b).a();
                final c zf = esp.zf(this.b);
                final fzw fzw3 = (fzw)esp.vM(this.b).a();
                final ipd ipd = (ipd)esp.lZ(this.b).a();
                final AdsWebViewCacheController adsWebViewCacheController = (AdsWebViewCacheController)esp.gr(this.b).a();
                final esp b8 = this.b;
                return ldi.v(activity, tgd, hzu, cv, abpu, rkc, rqs, man, fzw, rwt, fzw2, aahc, fxh, vcy2, fny, blu, fjv, yi, wyw2, fzb, activeStateScrollSelectionController, iab, lfm, ck, aeea, ad, cj, yk, ze, zk, fxw, ck2, kzi, vaf2, arwh2, elx, aeea2, zf, fzw3, ipd, adsWebViewCacheController, esp.pi(b8), (uve)esp.sj(b8).a(), (jki)esp.jg(this.b).a(), (oug)era.ek(eqy.r(this.a)).a(), (jki)esp.vD(this.b).a(), esp.xH(this.b), (aaxx)eqy.iF(this.a).a(), (vai)esp.vZ(this.b).a(), (vai)eqy.wb(this.a).a(), (kxg)esp.vA(this.b).a(), (msr)esp.sk(this.b).a(), (msr)esp.sm(this.b).a(), (fkf)eqy.gG(this.a).a(), (tnu)eqy.fH(this.a).a(), (blu)esp.vQ(this.b).a(), (WatchUiActionLatencyLogger)esp.vX(this.b).a(), (lfz)esp.vt(this.b).a(), (asid)eqy.fU(this.a).a(), (elx)eqy.vz(this.a).a());
            }
            case 30: {
                final esp b9 = this.b;
                final atke ib = esp.iB(b9);
                final elx elx2 = (elx)esp.gi(b9).a();
                final fjv fjv2 = (fjv)esp.ra(this.b).a();
                final esp b10 = this.b;
                return lio.t(ib, elx2, fjv2, esp.nU(b10), (msr)esp.sk(b10).a(), (msr)esp.rW(this.b).a());
            }
            case 29: {
                return ljl.v((adet)eqy.nP(this.a).a());
            }
            case 28: {
                return fpi.h((abpu)esp.qW(this.b).a());
            }
            case 27: {
                final Activity activity2 = (Activity)esp.oz(this.b).a();
                final esp b11 = this.b;
                return lgr.m(activity2, esp.ka(b11), (lik)esp.tV(b11).a(), (lag)esp.kf(this.b).a(), (vaf)eqy.pn(this.a).a(), (agoe)esp.sh(this.b).a(), esp.cM(this.b), (lif)esp.ne(this.b).a(), (fjv)esp.ra(this.b).a(), (jki)esp.vD(this.b).a(), (FullscreenExitController)esp.jP(this.b).a(), (WatchEngagementPanelViewContainerController)esp.vB(this.b).a(), (msr)esp.ox(this.b).a(), (asid)eqy.fU(this.a).a(), (c)esp.ny(this.b).a(), (msr)esp.si(this.b).a(), (msr)esp.sk(this.b).a(), (msr)esp.rW(this.b).a(), (msr)esp.qX(this.b).a(), (vai)eqy.wc(this.a).a(), (fat)era.ac(eqy.r(this.a)).a(), (lac)esp.vH(this.b).a(), (ldc)esp.vk(this.b).a(), (vai)eqy.lg(this.a).a(), esp.nZ(this.b));
            }
            case 26: {
                return afft.s((Object)esp.zG(this.b));
            }
            case 25: {
                return gcn.j(esp.es(this.b));
            }
            case 24: {
                return new vda(1);
            }
            case 23: {
                return new aeea(esp.fS(this.b), (byte[])null);
            }
            case 22: {
                return eyv.h((Activity)esp.oz(this.b).a());
            }
            case 21: {
                final fa fa = (fa)esp.oF(this.b).a();
                final aeea aeea3 = (aeea)esp.hB(this.b).a();
                final arkg b12 = arlr.b(era.dK(eqy.r(this.a)));
                final arwh arwh3 = (arwh)eqy.qn(this.a).a();
                return gcn.v(fa, aeea3, b12, hup.v(), (vai)eqy.lv(this.a).a(), (vai)eqy.ky(this.a).a(), (Optional)esp.qM(this.b).a(), esp.tF(this.b), (fat)era.ac(eqy.r(this.a)).a());
            }
            case 20: {
                return eyv.j((Activity)esp.oz(this.b).a());
            }
            case 19: {
                final faq faq = (faq)esp.sA(this.b).a();
                final ghb ghb = (ghb)esp.il(this.b).a();
                final liq liq = (liq)esp.nd(this.b).a();
                final lag lag = (lag)esp.kf(this.b).a();
                final skt skt = (skt)esp.qH(this.b).a();
                final irg irg = (irg)esp.tZ(this.b).a();
                final blu blu2 = (blu)eqy.kz(this.a).a();
                final blu blu3 = (blu)esp.wa(this.b).a();
                final e e = (e)esp.ih(this.b).a();
                final lkc lkc = (lkc)esp.wh(this.b).a();
                final fxw fxw2 = (fxw)esp.gn(this.b).a();
                final arwh arwh4 = (arwh)eqy.qn(this.a).a();
                final esp b13 = this.b;
                final atke wn = esp.wn(b13);
                final atke wr = esp.wr(b13);
                final atke in = esp.in(b13);
                final eqy a2 = this.a;
                final atke nc = eqy.nc(a2);
                final atke le = eqy.lE(a2);
                final hzn r3 = hup.r();
                final blu blu4 = (blu)esp.kV(b13).a();
                final fzw v = hup.v();
                final ajb zp = eqy.zP(this.a);
                final aln gu = era.gU(eqy.r(this.a));
                final bx s = jex.s();
                final cya o = gcn.o();
                final esp b14 = this.b;
                return lkh.r(faq, ghb, liq, lag, skt, irg, blu2, blu3, e, lkc, fxw2, arwh4, wn, wr, in, nc, le, r3, blu4, v, zp, gu, s, o, esp.uQ(b14), (kkj)esp.wm(b14).a(), (vaf)eqy.pn(this.a).a(), esp.wW(this.b), esp.kk(this.b).a(), eqy.xI(this.a), (msr)esp.ox(this.b).a(), (vai)eqy.vx(this.a).a(), (vai)eqy.ky(this.a).a(), (vai)eqy.wb(this.a).a());
            }
            case 18: {
                return ljl.b((Activity)esp.oz(this.b).a(), esp.wl(this.b));
            }
            case 17: {
                return ljl.c((Optional)esp.qJ(this.b).a(), esp.ng(this.b));
            }
            case 16: {
                return lio.v((arwh)eqy.qn(this.a).a(), (ggr)esp.qL(this.b).a(), hup.v(), (fam)esp.wn(this.b).a());
            }
            case 15: {
                return hlb.q((arwh)eqy.qn(this.a).a());
            }
            case 14: {
                return guc.s((arwh)eqy.qn(this.a).a());
            }
            case 13: {
                return gvs.o((arwh)eqy.qn(this.a).a());
            }
            case 12: {
                return knk.m((Activity)esp.oz(this.b).a(), esp.fA(this.b), (arwh)eqy.qn(this.a).a());
            }
            case 11: {
                return new gjh((Context)esp.oz(this.b).a(), (jki)esp.rV(this.b).a(), null, null, null, null, null);
            }
            case 10: {
                return fei.p((tgd)eqy.jn(this.a).a(), (toj)eqy.uG(this.a).a(), (ffe)era.dr(eqy.r(this.a)).a());
            }
            case 9: {
                return adnu.c((aeqe)esp.pJ(this.b).a());
            }
            case 8: {
                return aezp.k((Object)esp.en(this.b));
            }
            case 7: {
                return adnu.o((aeqe)esp.pJ(this.b).a(), this.b.xR());
            }
            case 6: {
                return new KeepStateCallbacksHandler((aeqe)esp.pJ(this.b).a());
            }
            case 5: {
                return adnu.s((Set)afft.r());
            }
            case 4: {
                return adnu.t((aeqe)esp.pJ(this.b).a(), (aujg)esp.ge(this.b).a(), (KeepStateCallbacksHandler)esp.kP(this.b).a(), (ExtensionRegistryLite)era.dj(eqy.r(this.a)).a(), (agq)esp.uE(this.b).a());
            }
            case 3: {
                return adnu.h(esp.eo(this.b));
            }
            case 2: {
                return adnu.r((aeqe)esp.pJ(this.b).a(), esp.ey(this.b), (ActivityAccountState)esp.gj(this.b).a(), (aemh)esp.pN(this.b).a(), (aujg)esp.ge(this.b).a(), (KeepStateCallbacksHandler)esp.kP(this.b).a(), era.Z(eqy.r(this.a)).a(), (aejf)eqy.es(this.a).a(), (ExtensionRegistryLite)era.dj(eqy.r(this.a)).a(), aezp.k((Object)adnu.b()));
            }
            case 1: {
                final Activity bn = esp.bN(this.b);
                aerr.e(bn);
                return bn;
            }
            case 0: {
                return lnc.i((Context)eqy.ps(this.a).a());
            }
        }
    }
    
    private final Object c() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 199: {
                return fpi.i((abpu)esp.qW(this.b).a());
            }
            case 198: {
                return syt.o((Activity)esp.oz(this.b).a(), (msr)esp.ox(this.b).a());
            }
            case 197: {
                final hox m = gku.m((Activity)esp.oz(this.b).a(), (asht)esp.ot(this.b).a(), (msr)esp.ox(this.b).a(), (jki)esp.vD(this.b).a());
                esp.xG(m);
                return m;
            }
            case 196: {
                return fpi.p((tqf)esp.ia(this.b).a(), (hox)esp.jJ(this.b).a(), (lag)esp.kf(this.b).a());
            }
            case 195: {
                return kvu.o((uve)esp.sj(this.b).a());
            }
            case 194: {
                return kxz.o((vai)esp.vZ(this.b).a(), (vai)eqy.wc(this.a).a());
            }
            case 193: {
                return jbu.j();
            }
            case 192: {
                return isz.o((Context)esp.oz(this.b).a(), (jej)esp.vn(this.b).a(), (abhq)esp.rp(this.b).a(), (jki)esp.uU(this.b).a());
            }
            case 191: {
                return ivh.h(arlr.b(esp.sj(this.b)), (itt)esp.tk(this.b).a(), (vai)esp.vZ(this.b).a());
            }
            case 190: {
                final esp b = this.b;
                final FullscreenEngagementPanelOverlay u = ivh.u((Context)esp.oz(b).a(), (fjv)esp.ra(this.b).a(), (xnt)eqy.mi(this.a).a(), arlr.b(esp.sj(this.b)), (ixn)esp.nw(this.b).a(), (abpu)esp.qW(this.b).a(), arlr.b(esp.jg(this.b)), (vaf)eqy.pn(this.a).a(), (vai)esp.vZ(this.b).a(), (bhv)esp.wH(this.b).a(), (msr)esp.ox(this.b).a());
                esp.xi(b, u);
                return u;
            }
            case 189: {
                return new abgz((Context)esp.oz(this.b).a(), (tmx)eqy.oG(this.a).a());
            }
            case 188: {
                return ivh.e((aaor)eqy.wi(this.a).a());
            }
            case 187: {
                return new ixj((ixc)esp.mK(this.b).a(), (abgz)esp.sV(this.b).a(), (uwb)esp.jM(this.b).a(), (abuj)esp.kc(this.b).a(), (iyy)esp.vF(this.b).a(), (vai)eqy.wc(this.a).a(), (wyw)esp.qg(this.b).a(), (abpu)esp.qW(this.b).a());
            }
            case 186: {
                return new acqg();
            }
            case 185: {
                return isz.f((vwt)eqy.vY(this.a).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a());
            }
            case 184: {
                return ojw.r(eqy.zU(this.a), (oum)esp.pv(this.b).a(), aezp.k((Object)era.gc(eqy.r(this.a))), (Context)eqy.ps(this.a).a());
            }
            case 183: {
                return ojw.s(eqy.zU(this.a), esp.qh(this.b));
            }
            case 182: {
                return ooi.v(eqy.zU(this.a), esp.fu(this.b));
            }
            case 181: {
                final Context context = (Context)esp.oz(this.b).a();
                final Executor executor = (Executor)eqy.lf(this.a).a();
                final zlo zlo = (zlo)eqy.kB(this.a).a();
                final otk otk = (otk)eqy.jg(this.a).a();
                return abzn.n(executor, Optional.of((Object)eqy.qd(this.a).a()), (aeea)eqy.iZ(this.a).a());
            }
            case 180: {
                return new aclf();
            }
            case 179: {
                return ljk.f((vcy)esp.oW(this.b).a());
            }
            case 178: {
                return new aeea(esp.tn(this.b));
            }
            case 177: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final aeea aeea = (aeea)esp.sZ(this.b).a();
                final fuf xd = esp.xD(this.b);
                final fuf xc = esp.xC(this.b);
                final fuf xe = esp.xE(this.b);
                final accf accf = (accf)esp.iS(this.b).a();
                final omw omw = (omw)esp.wB(this.b).a();
                final oum oum = (oum)esp.pv(this.b).a();
                final acdp acdp = (acdp)eqy.jb(this.a).a();
                final vai vai = (vai)eqy.ja(this.a).a();
                final oug oug = (oug)era.ek(eqy.r(this.a)).a();
                final esp b2 = this.b;
                final abhm s = isz.s(context2, aeea, xd, xc, xe, accf, omw, acdp, vai, oug, esp.rt(b2), (wyw)esp.qg(b2).a(), (abhq)esp.rp(this.b).a(), (itn)esp.gw(this.b).a(), (tgd)eqy.jn(this.a).a(), (acqg)esp.lS(this.b).a());
                esp.bq(s);
                return s;
            }
            case 176: {
                return abaq.d();
            }
            case 175: {
                return new itq((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (abhq)esp.rp(this.b).a(), (abhm)esp.gx(this.b).a(), eqy.xN(this.a));
            }
            case 174: {
                return ixz.k();
            }
            case 173: {
                final esp b3 = this.b;
                final YouTubeControlsOverlay v = iyu.v((Context)esp.oz(b3).a(), (tsb)esp.sp(this.b).a(), (iyf)esp.tA(this.b).a(), (jdn)esp.iw(this.b).a(), (abho)esp.gz(this.b).a(), (abhm)esp.gx(this.b).a(), (ixj)esp.mL(this.b).a(), (wyw)esp.qf(this.b).a(), (elx)esp.gi(this.b).a(), (abgw)esp.rh(this.b).a(), arlr.b(esp.sj(this.b)), (iys)esp.uR(this.b).a(), esp.yg(this.b), esp.ez(this.b), (SuggestedActionsMainController)esp.uq(this.b).a(), (itt)esp.tk(this.b).a(), (jea)esp.rZ(this.b).a(), esp.wQ(this.b), (jed)esp.vl(this.b).a(), (jdz)esp.vf(this.b).a(), (iyt)esp.uS(this.b).a(), (jbt)esp.jO(this.b).a(), (uwb)esp.jM(this.b).a(), (iyb)esp.sU(this.b).a(), (abpu)esp.qW(this.b).a(), (asid)eqy.fU(this.a).a(), (vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (izd)esp.ws(this.b).a(), (abbf)era.fO(eqy.r(this.a)).a(), (acnc)esp.hW(this.b).a(), (ixc)esp.mK(this.b).a(), (jki)esp.vD(this.b).a(), (View[])esp.sB(this.b).a(), (lcd)esp.iI(this.b).a(), (iuz)esp.is(this.b).a(), (iuv)esp.hM(this.b).a(), (abpl)esp.jY(this.b).a(), (ivi)esp.iN(this.b).a(), esp.ew(this.b), esp.tD(this.b).a(), esp.cC(this.b), esp.yC(this.b), esp.zt(this.b), esp.cA(this.b), (iws)esp.kJ(this.b).a(), (jbh)esp.jv(this.b).a(), (jbd)esp.jt(this.b).a(), (jbb)esp.jr(this.b).a(), (vai)esp.vZ(this.b).a(), (vai)eqy.wc(this.a).a(), (ashi)esp.oT(this.b).a(), (jco)esp.kF(this.b).a(), (pvh)esp.nQ(this.b).a(), (jej)esp.vn(this.b).a(), (pvh)esp.gZ(this.b).a(), (vai)eqy.vx(this.a).a(), esp.wV(this.b), (jby)esp.nX(this.b).a(), (jki)esp.uU(this.b).a());
                esp.xw(b3, v);
                return v;
            }
            case 172: {
                return afft.s((Object)esp.wA(this.b).a());
            }
            case 171: {
                return new elx((int[])null);
            }
            case 170: {
                return ljl.q((xnt)eqy.mi(this.a).a());
            }
            case 169: {
                return new icy((bu)esp.pI(this.b).a(), (xnt)eqy.mi(this.a).a(), (skt)esp.rb(this.b).a(), (fjv)esp.ra(this.b).a(), null, null, null);
            }
            case 168: {
                return iby.q(esp.my(this.b).a());
            }
            case 167: {
                return ljm.b(esp.cO(this.b), (lki)esp.wj(this.b).a());
            }
            case 166: {
                return ljm.m((Activity)esp.oz(this.b).a(), (vai)eqy.lv(this.a).a(), (vai)eqy.lg(this.a).a());
            }
            case 165: {
                return ljm.n((ViewGroup)esp.rr(this.b).a());
            }
            case 164: {
                return lio.s(arlr.b(esp.ml(this.b)), arlr.b(esp.ra(this.b)), (vaf)eqy.pn(this.a).a());
            }
            case 163: {
                return new juv((tqf)esp.ia(this.b).a(), arlr.b(esp.kn(this.b)), arlr.b(esp.sb(this.b)));
            }
            case 162: {
                return lio.o((Activity)esp.oz(this.b).a());
            }
            case 161: {
                return tny.f((Activity)esp.oz(this.b).a());
            }
            case 160: {
                return tny.r((WindowInfoTrackerCallbackAdapter)esp.sy(this.b).a(), (Activity)esp.oz(this.b).a(), (msr)esp.ox(this.b).a(), (Executor)eqy.fT(this.a).a(), (asid)eqy.fU(this.a).a(), (asid)eqy.fJ(this.a).a());
            }
            case 159: {
                return tny.e((Activity)esp.oz(this.b).a());
            }
            case 158: {
                final trt trt = (trt)esp.pC(this.b).a();
                final esp b4 = this.b;
                return tny.q(trt, esp.wu(b4), (msr)esp.ox(b4).a());
            }
            case 157: {
                return kxz.t((trt)esp.jD(this.b).a(), (ashi)esp.sx(this.b).a());
            }
            case 156: {
                return ljk.b((Context)esp.oz(this.b).a(), (vai)eqy.wc(this.a).a());
            }
            case 155: {
                final ghv s2 = ggm.s((Activity)esp.oz(this.b).a(), (fxw)esp.gn(this.b).a(), (fjv)esp.ra(this.b).a(), (vaf)eqy.pn(this.a).a(), (zfw)esp.ik(this.b).a(), (tpz)esp.pr(this.b).a(), (abty)esp.qR(this.b).a(), (Handler)eqy.sJ(this.a).a(), (wyw)esp.qg(this.b).a(), (ghs)esp.nd(this.b).a(), (jki)esp.vD(this.b).a(), (acql)esp.qE(this.b).a(), (vai)eqy.wc(this.a).a(), esp.cL(this.b), (msr)esp.ox(this.b).a());
                esp.bI(s2);
                return s2;
            }
            case 154: {
                return ljl.u(esp.cN(this.b), (ghv)esp.wb(this.b).a(), (cl)esp.rK(this.b).a(), arlr.b(eqy.sp(this.a)), (geu)esp.kB(this.b).a(), (wyv)esp.ow(this.b).a(), (fjv)esp.ra(this.b).a(), (ghb)esp.il(this.b).a(), (fxw)esp.gn(this.b).a(), (tqf)esp.ia(this.b).a(), (fjs)esp.ml(this.b).a(), (zfw)esp.ik(this.b).a(), (szk)esp.mh(this.b).a(), (msr)esp.ox(this.b).a(), (abpq)esp.ka(this.b).a(), (abpu)esp.qW(this.b).a(), (vai)eqy.uY(this.a).a(), (WatchWhileOnBackPressedEvaluator)esp.sr(this.b).a());
            }
            case 153: {
                return wxn.s();
            }
            case 152: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (int[][])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 151: {
                return ggm.p(esp.cL(this.b), (msr)esp.ox(this.b).a(), (lag)esp.kf(this.b).a());
            }
            case 150: {
                return ljl.e((vjg)eqy.nX(this.a).a(), (abpu)esp.qW(this.b).a());
            }
            case 149: {
                return new skt((Activity)esp.oz(this.b).a());
            }
            case 148: {
                return new zfw((skt)esp.wt(this.b).a(), (abty)esp.qR(this.b).a(), (ghm)esp.jQ(this.b).a(), esp.cL(this.b), (byte[])null, (byte[])null);
            }
            case 147: {
                return gku.c((Activity)esp.oz(this.b).a(), (gkx)eqy.hv(this.a).a(), (vai)eqy.vx(this.a).a());
            }
            case 146: {
                return gvs.q(esp.zL(this.b), (gkx)eqy.hv(this.a).a());
            }
            case 145: {
                final Map fj = esp.fJ(this.b);
                final esp b5 = this.b;
                return acfd.k(fj, esp.pE(b5), (Activity)esp.oz(b5).a());
            }
            case 144: {
                final eqy a = this.a;
                final esp b6 = this.b;
                return knh.t(new mcb(a, b6, (byte[])null), (Context)esp.ut(b6).a());
            }
            case 143: {
                return knh.j((kni)esp.pl(this.b).a());
            }
            case 142: {
                return lio.m((acps)esp.pk(this.b).a());
            }
            case 141: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final acku acku = (acku)esp.re(this.b).a();
                final wyv wyv = (wyv)esp.ow(this.b).a();
                final fxw fxw = (fxw)esp.gn(this.b).a();
                final geu geu = (geu)esp.kB(this.b).a();
                final zfw zfw = (zfw)esp.ik(this.b).a();
                final aeea aeea2 = (aeea)eqy.iZ(this.a).a();
                return new glf(activity, acku, wyv, fxw, geu, zfw, null);
            }
            case 140: {
                return new gle((fxh)esp.uY(this.b).a(), (glf)esp.mh(this.b).a(), (fjt)esp.wn(this.b).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (kuf)esp.wn(this.b).a(), (aeea)esp.to(this.b).a(), (acwt)esp.sD(this.b).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 139: {
                return new ksl((Context)esp.oz(this.b).a(), (aln)eqy.np(this.a).a(), (acwi)esp.sD(this.b).a(), (fjt)esp.wn(this.b).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 138: {
                return new aeea((byte[])null, (char[])null, (char[])null);
            }
            case 137: {
                final esp b7 = this.b;
                final atke ow = esp.oW(b7);
                final eqy a2 = this.a;
                return new ziy(ow, eqy.kK(a2), esp.tn(b7), eqy.pn(a2), eqy.vx(a2), (byte[])null, (byte[])null, (char[])null);
            }
            case 136: {
                return actb.u(esp.zS(this.b), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 135: {
                return new elx();
            }
            case 134: {
                return new fxh((Handler)eqy.sJ(this.a).a(), (elx)esp.uX(this.b).a(), null);
            }
            case 133: {
                return new ksi((fxh)esp.uY(this.b).a(), (SharedPreferences)eqy.sp(this.a).a(), (acwi)esp.sD(this.b).a(), (fxw)esp.gn(this.b).a(), (ksl)esp.ns(this.b).a(), (gle)esp.mc(this.b).a());
            }
            case 132: {
                final fa fa = (fa)esp.oF(this.b).a();
                final esp b8 = this.b;
                final atke wl = esp.wl(b8);
                final atke wn = esp.wn(b8);
                final atke hc = esp.hc(b8);
                final atke rm = esp.rM(b8);
                final atke fb = era.fB(eqy.r(this.a));
                final elx elx = (elx)esp.gi(b8).a();
                final iri iri = (iri)esp.ip(this.b).a();
                final esp b9 = this.b;
                final atke tg = esp.tG(b9);
                final liq liq = (liq)esp.nd(b9).a();
                final esp b10 = this.b;
                return lkh.m(fa, wl, wn, hc, rm, fb, elx, iri, tg, liq, esp.nY(b10), (fjv)esp.ra(b10).a(), (e)esp.ih(this.b).a(), (ghb)esp.il(this.b).a(), (gii)esp.qP(this.b).a(), (dax)eqy.pb(this.a).a(), (xnx)eqy.ml(this.a).a(), (KeyboardShortcutsController)esp.kQ(this.b).a(), arlr.b(esp.mt(this.b)), (kcq)esp.rz(this.b).a());
            }
            case 131: {
                final esp b11 = this.b;
                final faq faq = (faq)esp.sA(b11).a();
                final esp b12 = this.b;
                final atke ql = esp.qL(b12);
                final atke wl2 = esp.wl(b12);
                final lki lki = (lki)esp.wj(b12).a();
                final gjl gjl = (gjl)esp.iv(this.b).a();
                final ActiveStateScrollSelectionController activeStateScrollSelectionController = (ActiveStateScrollSelectionController)esp.gK(this.b).a();
                final fjp fjp = (fjp)eqy.kN(this.a).a();
                final fxh fxh = (fxh)esp.uY(this.b).a();
                final liq liq2 = (liq)esp.nd(this.b).a();
                final fjv fjv = (fjv)esp.ra(this.b).a();
                final ghv ghv = (ghv)esp.wb(this.b).a();
                final irg irg = (irg)esp.tZ(this.b).a();
                final eqy a3 = this.a;
                final atke bx = era.bx(eqy.r(a3));
                final vaf vaf = (vaf)eqy.pn(a3).a();
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final gii gii = (gii)esp.qP(this.b).a();
                final atke fb2 = era.fB(eqy.r(this.a));
                final aeea aeea3 = (aeea)esp.iE(this.b).a();
                final vmb vmb = (vmb)eqy.tT(this.a).a();
                final abty abty = (abty)esp.qR(this.b).a();
                final e e = (e)esp.ih(this.b).a();
                final irv irv = (irv)esp.nZ(this.b).a();
                final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = (YouTubePlayerOverlaysLayout)esp.qZ(this.b).a();
                final irs irs = (irs)esp.nW(this.b).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final xnt xnt = (xnt)eqy.mi(this.a).a();
                final fom fom = (fom)esp.oj(this.b).a();
                final arkg b13 = arlr.b(esp.kA(this.b));
                final geu geu2 = (geu)esp.kB(this.b).a();
                final aaxx aaxx = (aaxx)eqy.iF(this.a).a();
                final aapf aapf = (aapf)era.fF(eqy.r(this.a)).a();
                final wyw wyw = (wyw)esp.qg(this.b).a();
                final kyb kyb = (kyb)esp.sn(this.b).a();
                final arkg b14 = arlr.b(esp.my(this.b));
                final iri iri2 = (iri)esp.ip(this.b).a();
                final esp b15 = this.b;
                final atke ge = esp.gE(b15);
                final Set fr = esp.fR(b15);
                final lkc lkc = (lkc)esp.wh(this.b).a();
                final abpu abpu = (abpu)esp.qW(this.b).a();
                final tqf tqf = (tqf)esp.ia(this.b).a();
                final qv qv = (qv)esp.oc(this.b).a();
                final esp b16 = this.b;
                final lkr s3 = lkh.s(faq, ql, wl2, lki, gjl, activeStateScrollSelectionController, fjp, fxh, liq2, fjv, ghv, irg, bx, vaf, arwh, gii, fb2, aeea3, vmb, abty, e, irv, youTubePlayerOverlaysLayout, irs, tgd, xnt, fom, b13, geu2, aaxx, aapf, wyw, kyb, b14, iri2, ge, fr, lkc, abpu, tqf, qv, esp.iC(b16), (lmp)esp.uw(b16).a(), (atjz)esp.qO(this.b).a(), gcn.o(), (abrj)eqy.jt(this.a).a(), era.eF(eqy.r(this.a)), (acql)esp.qE(this.b).a(), (liv)esp.cN(this.b), (kkj)esp.wm(this.b).a(), (oiu)esp.iT(this.b).a(), arlr.b(esp.jK(this.b)), (iuo)era.aU(eqy.r(this.a)).a(), (vai)eqy.wc(this.a).a(), (kvw)esp.hA(this.b).a(), arlr.b(esp.hx(this.b)), arlr.b(esp.qA(this.b)), arlr.b(eqy.rd(this.a)), arlr.b(esp.hz(this.b)), arlr.b(esp.hy(this.b)), (vai)eqy.lg(this.a).a(), (tok)eqy.uI(this.a).a(), (Optional)esp.rl(this.b).a(), esp.yv(this.b), (Optional)esp.qc(this.b).a(), (Optional)esp.qd(this.b).a());
                esp.xu(b11, s3);
                return s3;
            }
            case 130: {
                return ulu.q();
            }
            case 129: {
                return kvu.i(new cdo(this.a, this.b));
            }
            case 128: {
                return kvu.u((kwf)esp.oG(this.b).a(), (aeea)esp.jd(this.b).a());
            }
            case 127: {
                return ulu.r();
            }
            case 126: {
                final eqy a4 = this.a;
                final esp b17 = this.b;
                return kvu.v(new cdo(a4, b17), (aeea)esp.je(b17).a());
            }
            case 125: {
                return kvu.b(arlr.b(esp.sj(this.b)), arlr.b(esp.oH(this.b)), (fjv)esp.ra(this.b).a());
            }
            case 124: {
                return ulu.n((aun)esp.pI(this.b).a(), (uwx)esp.jc(this.b).a(), (vtu)era.cx(eqy.r(this.a)).a(), (Executor)eqy.fT(this.a).a(), (tqd)eqy.qe(this.a).a(), (uxa)esp.eD(this.b), kvu.g(), (vcy)esp.oW(this.b).a());
            }
            case 123: {
                return htj.s((abrj)esp.mY(this.b).a());
            }
            case 122: {
                return new fci((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), 11);
            }
            case 121: {
                return eyv.r();
            }
            case 120: {
                final fnv h = fmf.h((Activity)esp.oz(this.b).a(), (fnt)esp.jU(this.b).a(), (fkl)esp.nd(this.b).a());
                esp.bw(h);
                return h;
            }
            case 119: {
                return new AccessibilityStateReceiver((Context)esp.oz(this.b).a());
            }
            case 118: {
                return gcn.e((Context)esp.oz(this.b).a(), (xnt)eqy.mi(this.a).a(), (AccessibilityStateReceiver)esp.gb(this.b).a(), (fxw)esp.gn(this.b).a(), (tgd)eqy.jn(this.a).a(), (get)eqy.kI(this.a).a(), (fnv)esp.jI(this.b).a());
            }
            case 117: {
                return fbd.t(esp.et(this.b), (vgy)eqy.eL(this.a).a(), (fbb)esp.uz(this.b).a(), (Activity)esp.oz(this.b).a(), (rpa)eqy.hu(this.a).a(), (vai)eqy.gF(this.a).a(), esp.Aa(this.b), (geu)esp.kB(this.b).a());
            }
            case 116: {
                return hup.g((Activity)esp.oz(this.b).a());
            }
            case 115: {
                return htj.g((Activity)esp.oz(this.b).a());
            }
            case 114: {
                return rid.h((Activity)esp.oz(this.b).a(), esp.fl(this.b));
            }
            case 113: {
                return hup.i(esp.cu(this.b));
            }
            case 112: {
                return htj.h(esp.ct(this.b));
            }
            case 111: {
                return rid.g((Activity)esp.oz(this.b).a(), esp.fs(this.b));
            }
            case 110: {
                return rid.q(esp.yA(this.b));
            }
            case 109: {
                return rid.f(esp.bU(this.b), (vcy)esp.oW(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 108: {
                return rid.n((PhoneVerificationController)esp.nC(this.b).a());
            }
            case 107: {
                return tjp.J((adlp)era.ba(eqy.r(this.a)).a());
            }
            case 106: {
                return htj.m(esp.cs(this.b));
            }
            case 105: {
                return abzn.g((otc)esp.oU(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 104: {
                return htj.o(esp.eL(this.b));
            }
            case 103: {
                return new fdr((Context)esp.oz(this.b).a(), 18, (byte[])null);
            }
            case 102: {
                return new LoggingUrlsPingController(eqy.sK(this.a), new fja(), eqy.ab(this.a), (aahc)eqy.ta(this.a).a(), (Executor)eqy.oN(this.a).a(), (abpu)esp.qW(this.b).a(), (byte[])null);
            }
            case 101: {
                return knk.g((cl)esp.rK(this.b).a());
            }
            case 100: {
                return lio.b((zqj)eqy.kG(this.a).a());
            }
        }
    }
    
    private final Object d() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 1099: {
                return new gpx((adfs)this.a.a.dA.a(), (bu)this.b.l.a(), 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1098: {
                return new vae((wje)this.b.ed.a(), 14);
            }
            case 1097: {
                return new tag((zmf)this.a.aC.a(), (vwa)this.b.dW.a(), 4, (byte[])null, (byte[])null);
            }
            case 1096: {
                return new acqb();
            }
            case 1095: {
                final acqb acqb = (acqb)this.b.eb.a();
                acqb.getClass();
                return acqb;
            }
            case 1094: {
                return new hln((acbq)this.b.ca.a(), (vcy)this.b.F.a(), (acqb)this.b.ec.a(), 17, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1093: {
                return new fcl((Context)this.b.d.a(), (adfs)this.a.a.dz.a(), (wja)this.b.ea.a(), (vcy)this.b.F.a(), (Executor)this.a.g.a(), 20, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1092: {
                return new zfo((Context)this.b.d.a(), (arwh)this.a.v.a(), (byte[])null, (byte[])null);
            }
            case 1091: {
                return vkh.f((Context)this.a.c.a(), (zlv)this.a.gy.a());
            }
            case 1090: {
                return this.b.av().a((Context)this.b.d.a(), (wyw)this.b.dd.a());
            }
            case 1089: {
                return new wjq((Context)this.b.d.a(), (wlx)this.b.dX.a(), (wjr)this.b.dY.a(), (zgb)this.b.dZ.a(), this.b.ap(), (wjt)this.b.aw(), (wsd)this.b.aw(), (Executor)this.a.g.a(), (afvs)this.a.E.a(), (vcy)this.b.F.a(), (aeea)this.a.kb.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1088: {
                return new vae((wjj)this.b.aw(), 11);
            }
            case 1087: {
                return new vae((wjj)this.b.aw(), 13);
            }
            case 1086: {
                return wji.f((Activity)this.b.d.a());
            }
            case 1085: {
                return new vae((wjl)this.b.dV.a(), 15);
            }
            case 1084: {
                return fei.s((acmr)this.a.ev.a());
            }
            case 1083: {
                return fei.i((Activity)this.b.d.a());
            }
            case 1082: {
                return fei.h((Activity)this.b.d.a(), (acwb)this.b.aT.a(), (aebd)this.b.dR.a(), this.b.dS.a());
            }
            case 1081: {
                return fei.l(this.b.dT, (vaf)this.a.w.a());
            }
            case 1080: {
                return fcv.i((bu)this.b.l.a(), (gkx)this.a.fr.a());
            }
            case 1079: {
                return new gxn((vcy)this.b.F.a(), (abpq)this.a.ex.a(), (aujg)this.a.a.ar.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1078: {
                return new gnr((bu)this.b.l.a(), (Context)this.b.d.a(), (Executor)this.a.g.a(), (Executor)this.a.r.a(), this.b.xF(), (zmf)this.a.aC.a(), (vcy)this.b.F.a(), (wyv)this.b.o.a(), 3, null);
            }
            case 1077: {
                return new gvh((bu)this.b.l.a(), 3);
            }
            case 1076: {
                return new spw((uas)this.b.dQ.a(), 12);
            }
            case 1075: {
                return new uas((Activity)this.b.d.a(), (acpk)this.a.jL.a(), (Executor)this.a.g.a(), (vwa)this.b.aW(), (byte[])null, (byte[])null);
            }
            case 1074: {
                return new spw((uas)this.b.dQ.a(), 13);
            }
            case 1073: {
                return new udf((bu)this.b.l.a());
            }
            case 1072: {
                return srz.c((vcy)this.b.F.a());
            }
            case 1071: {
                return new spv((sur)this.b.dP.a(), this.b.xQ(), (bu)this.b.l.a(), (vwa)this.a.a.ch.a(), (tqd)this.a.ix.a(), (zmf)this.a.aC.a(), (aeea)this.a.jm.a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1070: {
                return new msr((tql)new ldk((msr)this.b.bA.a(), 4, (byte[])null, (byte[])null));
            }
            case 1069: {
                return new pvh(this);
            }
            case 1068: {
                return new grb(this.b.z(), this.b.zd(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1067: {
                return new spw((swk)this.a.a.dj.a(), 6);
            }
            case 1066: {
                return new spw(3);
            }
            case 1065: {
                return new hyt((bu)this.b.l.a(), 19);
            }
            case 1064: {
                return new hyt((ChangeCommentsMarkersVisibilityCommandHelper)this.b.dO.a(), 17);
            }
            case 1063: {
                return new ChangeCommentsMarkersVisibilityCommandHelper(this.b.F, (abpu)this.a.bt.a());
            }
            case 1062: {
                return new hyt((ChangeCommentsMarkersVisibilityCommandHelper)this.b.dO.a(), 16);
            }
            case 1061: {
                return new fec(3);
            }
            case 1060: {
                return this.b.za().z((fcm)gnv.b);
            }
            case 1059: {
                final bu bu = (bu)this.b.l.a();
                return mft.E((Activity)bu, (ljg)new ljd(bu, 1));
            }
            case 1058: {
                final bu bu2 = (bu)this.b.l.a();
                return mft.E((Activity)bu2, (ljg)new ljd(bu2, 0));
            }
            case 1057: {
                return this.b.za().z((fcm)gnv.c);
            }
            case 1056: {
                return new fdk((ggr)this.b.Q.a(), (tgd)this.a.h.a(), (ggn)ljf.a);
            }
            case 1055: {
                final bu bu3 = (bu)this.b.l.a();
                this.a.a.J();
                return mft.E((Activity)bu3, (ljg)new ljd(bu3, 3));
            }
            case 1054: {
                return new eyz((ggr)this.b.Q.a(), (tgd)this.a.h.a(), this.a.zQ(), 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1053: {
                return new fdk((ggr)this.b.Q.a(), (tgd)this.a.h.a(), (ggn)ljf.b);
            }
            case 1052: {
                return new eyz((Activity)this.b.d.a(), this.b.zZ(), (wyw)this.a.iK.a(), 13, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1051: {
                final Activity activity = (Activity)this.b.d.a();
                final vwa zz = this.b.zZ();
                final acwb acwb = (acwb)this.b.cU.a();
                final xmm xmm = (xmm)this.a.a.dl.a();
                final abpq abpq = (abpq)this.b.k.a();
                this.a.a.J();
                return new fca(activity, zz, acwb, abpq, 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1050: {
                Object o = this.b.dM.a();
                final eyz eyz = (eyz)this.b.dN.a();
                if (!GalleryActivity.f()) {
                    o = eyz;
                }
                ((fca)o).getClass();
                return o;
            }
            case 1049: {
                final bu bu4 = (bu)this.b.l.a();
                return mft.E((Activity)bu4, (ljg)new ljd(bu4, 2));
            }
            case 1048: {
                return new hyt((Context)this.b.l.a(), 1);
            }
            case 1047: {
                return this.b.za().z((fcm)gnv.d);
            }
            case 1046: {
                return new hyt((jcu)this.b.cw.a(), 6);
            }
            case 1045: {
                return fcv.p((ajb)this.b.dL.a());
            }
            case 1044: {
                return fei.n((aun)this.b.l.a(), this.b.bb());
            }
            case 1043: {
                return fcv.q((ajb)this.b.dL.a());
            }
            case 1042: {
                return fcv.c((tmx)this.a.a.cR.a(), (abkn)this.a.eB.a(), (vcy)this.b.F.a(), (wwv)this.a.fo.a());
            }
            case 1041: {
                return new ouf((vdr)this.a.bp.a(), (zmf)this.a.aC.a());
            }
            case 1040: {
                final esp b = this.b;
                return new abai(b.aQ, this.a.ex, b.dK);
            }
            case 1039: {
                return new aazw((abas)this.b.dJ.a(), 3);
            }
            case 1038: {
                final esp b2 = this.b;
                return fcv.g(b2.bD, (hof)b2.q.a());
            }
            case 1037: {
                return new gvh((hof)this.b.q.a(), 11);
            }
            case 1036: {
                return hlk.k();
            }
            case 1035: {
                return new fca(this.b.zB(), (zmf)this.a.aC.a(), this.b.F, (Executor)this.a.g.a(), 5, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1034: {
                return new fca(this.b.zB(), (zmf)this.a.aC.a(), this.b.F, (Executor)this.a.g.a(), 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1033: {
                return new abat((abap)this.b.az.a(), (vdr)this.a.bp.a(), (zmf)this.a.aC.a(), this.b.bc());
            }
            case 1032: {
                return new aazw((abas)this.b.dJ.a(), 2);
            }
            case 1031: {
                return new elx((char[])null, (char[])null);
            }
            case 1030: {
                return new arfk((oby)this.a.e.a());
            }
            case 1029: {
                final esp b3 = this.b;
                final atke y = b3.Y;
                final eqy a = this.a;
                final atke h = a.h;
                final atke ix = a.ix;
                final atke df = b3.dF;
                final atke bv = b3.bv;
                final era a2 = a.a;
                return new abqg(y, h, ix, df, bv, a2.di, b3.cY, a.w, b3.da, b3.cW, b3.cV, b3.dG, a2.dj, b3.cK, a.jm);
            }
            case 1028: {
                final esp b4 = this.b;
                final hmd hmd = new hmd((Context)b4.W.a(), (bu)this.b.l.a(), (tgd)this.a.h.a(), (wyv)this.b.o.a(), (tqd)this.a.ix.a(), (vnu)this.a.jk.a(), (acps)this.b.Y.a(), (abqg)this.b.dH.a(), (aeea)this.b.ao.a(), (arwh)this.a.v.a(), (vai)this.b.C.a(), (ashi)this.a.a.aC.a(), (ipd)this.b.dC.a(), (aeea)this.b.dD.a(), (oug)this.a.a.aE.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                b4.bl(hmd);
                return hmd;
            }
            case 1027: {
                return hlk.l((hmd)this.b.dI.a());
            }
            case 1026: {
                return eyv.o((avu)this.a.a.dh.a());
            }
            case 1025: {
                return new aazw((abaz)this.b.bV.a(), 4);
            }
            case 1024: {
                return new spw((uim)this.a.eM.a(), 15);
            }
            case 1023: {
                return new hln((tjm)this.a.P.a(), (jsp)this.a.iv.a(), (hsp)this.b.dE.a(), 2);
            }
            case 1022: {
                return acfd.v(this.b.aT());
            }
            case 1021: {
                return new cya(this.b.F);
            }
            case 1020: {
                return eoy.e((rqq)this.a.a.aD.a());
            }
            case 1019: {
                final esp b5 = this.b;
                final atke ao = b5.ao;
                final atke as = b5.as;
                final eqy a3 = this.a;
                return new ipd(ao, as, a3.h, a3.ix, a3.w, a3.v, b5.B, b5.D, a3.cv, a3.cF, b5.ar, a3.a.aC, b5.dA, b5.aL, b5.aq, b5.dB, a3.ka, (byte[])null);
            }
            case 1018: {
                return ((kni)this.b.X.a()).m();
            }
            case 1017: {
                return new hsp((cl)this.b.u.a(), (Context)this.b.W.a(), (vcy)this.b.F.a(), this.b.yn(), (wyv)this.b.o.a(), (acps)this.b.Y.a(), (acrr)this.b.dz.a(), (ipd)this.b.dC.a(), (vnu)this.a.jk.a(), (aeea)this.b.dD.a(), (oug)this.a.a.aE.a(), (vlf)this.a.fJ.a(), (zmf)this.a.aC.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1016: {
                return new gvh((hsp)this.b.dE.a(), 5);
            }
            case 1015: {
                return new spw((vwa)this.a.a.ch.a(), 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1014: {
                return new hyt((vwa)this.a.a.ch.a(), 20, null, null, null, null, null);
            }
            case 1013: {
                return new wyf((acmr)this.a.ev.a(), (byte[])null);
            }
            case 1012: {
                return new gvh((fzw)this.a.jW.a(), 14, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1011: {
                return new gvh((fzw)this.a.jW.a(), 13, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1010: {
                final zmf zmf = (zmf)this.a.aC.a();
                final era a4 = this.a.a;
                return new adbn(zmf, a4.df, (acxi)a4.dg.a(), 1);
            }
            case 1009: {
                return new tag((zmf)this.a.aC.a(), this.a.a.df, 0);
            }
            case 1008: {
                return new gnr((Activity)this.b.d.a(), (vcy)this.b.F.a(), this.b.xL(), (vdr)this.a.bp.a(), (tqd)this.a.ix.a(), (wyv)this.b.o.a(), (Executor)this.a.g.a(), 5, null);
            }
            case 1007: {
                return fbd.k((kag)this.b.dy.a());
            }
            case 1006: {
                return new kdt((Context)this.b.d.a(), (zlv)this.a.gy.a(), (zmf)this.a.aC.a());
            }
            case 1005: {
                final esp b6 = this.b;
                return new kag(b6.dx, (abpq)b6.k.a());
            }
            case 1004: {
                return fbd.j((kag)this.b.dy.a());
            }
            case 1003: {
                return new gvh((hsq)this.b.dw.a(), 8);
            }
            case 1002: {
                return new hqv((abpq)this.b.cR.a(), (fnt)this.b.x.a(), (cyb)this.b.aY(), (arwh)this.a.v.a(), (Optional)this.b.r.a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1001: {
                return new hsq((cl)this.b.u.a(), (Context)this.b.W.a(), (accf)this.b.ap.a(), (acbm)this.b.aE.a(), (vcy)this.b.F.a(), (hqv)this.b.dv.a(), (wyv)this.b.o.a(), Optional.of((Object)this.b.br.a()), ((Activity)this.b.d.a()) instanceof ReelWatchActivity, (vai)this.a.ka.a());
            }
            case 1000: {
                return new fcl((bu)this.b.l.a(), (tjm)this.a.P.a(), (jsp)this.a.iv.a(), (hsq)this.b.dw.a(), (vai)this.a.jZ.a(), 11);
            }
        }
    }
    
    private final Object e() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 1199: {
                return new sws((swr)esp.jn(this.b).a());
            }
            case 1198: {
                final Context context = (Context)esp.oz(this.b).a();
                final szk szk = (szk)esp.mh(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final wyw wyw = (wyw)eqy.hP(this.a).a();
                final tbh tbh = (tbh)era.aW(eqy.r(this.a)).a();
                final tbh tbh2 = (tbh)era.aV(eqy.r(this.a)).a();
                return new gnw(context, szk, vcy, wyw, esp.zb(this.b), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 1197: {
                return new swr(esp.Aa(this.b), (zmf)eqy.pK(this.a).a(), (wxx)eqy.tf(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1196: {
                return new syz((swr)esp.jn(this.b).a(), (szk)esp.mh(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 1195: {
                final Context context2 = (Context)esp.oz(this.b).a();
                return new hyt(esp.oW(this.b), 4);
            }
            case 1194: {
                return new hyt((vdr)eqy.kE(this.a).a(), 8);
            }
            case 1193: {
                return wap.n((tgd)eqy.jn(this.a).a());
            }
            case 1192: {
                return new fdr((Context)esp.oz(this.b).a(), 12);
            }
            case 1191: {
                return fdq.k((gbo)esp.ib(this.b).a());
            }
            case 1190: {
                return qxd.s((bu)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), esp.Aa(this.b), esp.cT(this.b), (arwh)eqy.qn(this.a).a());
            }
            case 1189: {
                return new fec(9);
            }
            case 1188: {
                return new gnm((Activity)esp.oz(this.b).a(), (tgd)eqy.jn(this.a).a(), (adfq)era.fx(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 1187: {
                return hxp.u((skt)esp.qH(this.b).a(), (fmr)eqy.lE(this.a).a(), hup.v(), eqy.zP(this.a), hxp.o());
            }
            case 1186: {
                return gku.n((bu)esp.pI(this.b).a(), (vnu)eqy.gk(this.a).a(), (wyv)esp.ow(this.b).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), srz.d(), (Executor)eqy.fT(this.a).a());
            }
            case 1185: {
                return new gnd((Context)esp.oz(this.b).a(), (ggr)esp.qL(this.b).a(), (tgd)eqy.jn(this.a).a(), (zmf)eqy.pK(this.a).a(), (skt)esp.qH(this.b).a(), (fmr)eqy.lE(this.a).a(), hup.r(), hup.v(), esp.hb(this.b), (vaf)eqy.pn(this.a).a(), (blu)esp.kV(this.b).a(), (hof)esp.rm(this.b).a(), null, null, null, null, null);
            }
            case 1184: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final esp b = this.b;
                final atke wl = esp.wl(b);
                final Map ff = esp.ff(b);
                final Map eu = esp.eU(this.b);
                final Map dk = eqy.dk(this.a);
                final LoggingUrlsPingController loggingUrlsPingController = (LoggingUrlsPingController)esp.lT(this.b).a();
                final c c2 = (c)eqy.wd(this.a).a();
                return gpb.d(activity, tgd, wl, ff, eu, dk, loggingUrlsPingController);
            }
            case 1183: {
                return ljk.d((gpo)esp.gu(this.b).a(), esp.cN(this.b), esp.bk(), ljh.l());
            }
            case 1182: {
                return jex.h(esp.cD(this.b), (wyv)esp.ow(this.b).a());
            }
            case 1181: {
                return jex.g(esp.cD(this.b), (wyv)esp.ow(this.b).a());
            }
            case 1180: {
                return syt.c((bu)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 1179: {
                return hlk.p((hsh)eqy.tF(this.a).a(), (msr)eqy.mM(this.a).a(), (afaq)eqy.kn(this.a).a(), (guw)esp.tj(this.b).a());
            }
            case 1178: {
                return hlk.i((hof)esp.rm(this.b).a(), (goc)esp.mH(this.b).a());
            }
            case 1177: {
                return new gpx((sny)esp.hE(this.b).a(), (wyv)esp.ow(this.b).a(), 19);
            }
            case 1176: {
                return new spt((vpi)eqy.gJ(this.a).a(), (aujg)esp.hD(this.b).a(), (wyv)esp.ow(this.b).a(), (bu)esp.pI(this.b).a(), esp.oW(this.b), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (Executor)eqy.fT(this.a).a(), (tqd)eqy.qe(this.a).a(), 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1175: {
                return new hln((sny)esp.hE(this.b).a(), (fzw)era.fK(eqy.r(this.a)).a(), (hqv)esp.tc(this.b).a(), 0, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1174: {
                return new spt((vpi)eqy.gJ(this.a).a(), (aujg)esp.hD(this.b).a(), (wyv)esp.ow(this.b).a(), (bu)esp.pI(this.b).a(), esp.oW(this.b), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (Executor)eqy.fT(this.a).a(), (tqd)eqy.qe(this.a).a(), 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1173: {
                return new hln((sny)esp.hE(this.b).a(), (snn)esp.oQ(this.b).a(), (wyv)esp.ow(this.b).a(), 7);
            }
            case 1172: {
                return hlb.b((Activity)esp.oz(this.b).a(), (gkx)eqy.hv(this.a).a());
            }
            case 1171: {
                return hlb.t((Context)esp.rj(this.b).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (acpk)eqy.kK(this.a).a(), (aeea)eqy.mB(this.a).a());
            }
            case 1170: {
                return new fca((tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (aadx)eqy.uR(this.a).a(), (acjd)eqy.mT(this.a).a(), 6, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1169: {
                return new fwt((Context)eqy.ps(this.a).a(), (aadx)eqy.uR(this.a).a(), (tqd)eqy.qe(this.a).a(), esp.oW(this.b), (acjd)eqy.mT(this.a).a(), (zqe)eqy.wk(this.a).a(), (vaf)eqy.pn(this.a).a(), null, null, null);
            }
            case 1168: {
                return hlk.h((hof)esp.rm(this.b).a());
            }
            case 1167: {
                return hlb.s((Context)esp.oz(this.b).a(), (zmf)eqy.pK(this.a).a(), eqy.aO(this.a), (tjb)eqy.oI(this.a).a(), (hqv)esp.tc(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 1166: {
                return hlb.v((Context)esp.oz(this.b).a(), (aadx)era.ex(eqy.r(this.a)).a(), (zmf)eqy.pK(this.a).a(), (hzn)eqy.tB(this.a).a(), (hqv)esp.tc(this.b).a(), (bu)esp.pI(this.b).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a());
            }
            case 1165: {
                return hlb.m((hof)esp.rm(this.b).a());
            }
            case 1164: {
                return new eyz((Activity)esp.oz(this.b).a(), (adet)era.bl(eqy.r(this.a)).a(), (acid)era.bk(eqy.r(this.a)).a(), 14, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1163: {
                return new jwk((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (tgd)eqy.jn(this.a).a(), esp.mZ(this.b), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1162: {
                return gns.o((adfq)era.bm(eqy.r(this.a)).a(), (tgd)eqy.jn(this.a).a(), (vcy)esp.oW(this.b).a(), (tqd)eqy.qe(this.a).a(), esp.tU(this.b), (wzs)eqy.pL(this.a).a());
            }
            case 1161: {
                return new gvh((Context)esp.oz(this.b).a(), 7);
            }
            case 1160: {
                return jts.b((vox)era.ay(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (Context)esp.oz(this.b).a(), (vaf)eqy.pn(this.a).a(), (tqd)eqy.qe(this.a).a(), (adia)eqy.pl(this.a).a(), (oby)eqy.gH(this.a).a());
            }
            case 1159: {
                return jpw.g(esp.zb(this.b), (vcy)esp.oW(this.b).a());
            }
            case 1158: {
                return hlb.h(esp.fH(this.b), (vcy)eqy.he(this.a).a(), (wyv)esp.ow(this.b).a(), esp.bk(), (LoggingUrlsPingController)esp.lT(this.b).a());
            }
            case 1157: {
                return new fec(4);
            }
            case 1156: {
                return hdz.e(esp.fG(this.b), (vcy)eqy.he(this.a).a());
            }
            case 1155: {
                return htj.p();
            }
            case 1154: {
                return hup.s((Activity)esp.oz(this.b).a());
            }
            case 1153: {
                return new ucs((bu)esp.pI(this.b).a(), esp.bV(this.b), (adkb)eqy.iB(this.a).a(), esp.zF(this.b), (Executor)eqy.fT(this.a).a(), (zmf)eqy.pK(this.a).a(), (vdr)eqy.kE(this.a).a(), (uev)esp.cu(this.b), esp.ya(this.b), (wyw)esp.gP(this.b).a(), (fzw)esp.eN(this.b), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1152: {
                return htj.j(esp.bO(this.b), (ucs)esp.hu(this.b).a());
            }
            case 1151: {
                return htj.f();
            }
            case 1150: {
                return yot.h((fa)esp.oF(this.b).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a(), esp.ea(this.b));
            }
            case 1149: {
                return yot.k((ShortsEditThumbnailController)esp.tM(this.b).a(), esp.dW(this.b));
            }
            case 1148: {
                return rid.i(esp.pS(this.b));
            }
            case 1147: {
                return hup.d(esp.fe(this.b), (vcy)eqy.he(this.a).a());
            }
            case 1146: {
                return yot.i((vcy)eqy.he(this.a).a());
            }
            case 1145: {
                return gvs.e(esp.eU(this.b), (vcy)eqy.he(this.a).a());
            }
            case 1144: {
                return uzu.e(esp.eU(this.b), eqy.ak(this.a));
            }
            case 1143: {
                return new elx((byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1142: {
                return jpw.c(esp.cE(this.b), (wyv)esp.ow(this.b).a());
            }
            case 1141: {
                return hup.h(esp.cu(this.b));
            }
            case 1140: {
                return rne.f((Activity)esp.oz(this.b).a());
            }
            case 1139: {
                return rne.g((Activity)esp.oz(this.b).a(), esp.fm(this.b));
            }
            case 1138: {
                return rne.d();
            }
            case 1137: {
                return rne.b((Activity)esp.oz(this.b).a(), esp.fd(this.b));
            }
            case 1136: {
                final adfq adfq = (adfq)era.cB(eqy.r(this.a)).a();
                final cl cl = (cl)esp.rK(this.b).a();
                final rlc rlc = (rlc)era.aZ(eqy.r(this.a)).a();
                return rne.t(adfq, cl, (int)esp.sR(this.b).a(), (vcy)esp.oW(this.b).a(), esp.sS(this.b));
            }
            case 1135: {
                return new tag((Executor)eqy.oN(this.a).a(), (vpw)eqy.qh(this.a).a(), 3);
            }
            case 1134: {
                return new vae((vcy)esp.oW(this.b).a(), 1);
            }
            case 1133: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (char[][])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1132: {
                return gqz.n((acgs)eqy.kr(this.a).a(), (Executor)eqy.fT(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (abjj)eqy.kf(this.a).a(), (abpu)eqy.kg(this.a).a(), (arwh)eqy.qn(this.a).a(), (xao)eqy.hS(this.a).a(), (vai)eqy.eS(this.a).a());
            }
            case 1131: {
                final esp b2 = this.b;
                final atke jz = esp.jZ(b2);
                final atke ow = esp.oW(b2);
                final atke qs = esp.qs(b2);
                final atke ic = esp.iC(b2);
                final atke ka = esp.ka(b2);
                final arkg b3 = arlr.b(esp.rB(b2));
                final eqy a = this.a;
                return new ClipController(jz, ow, qs, ic, ka, b3, eqy.jg(a), (tgd)eqy.jn(a).a(), esp.jR(this.b), (Executor)eqy.fT(this.a).a(), (aukf)esp.oT(this.b).a());
            }
            case 1130: {
                return gqz.k((vcy)esp.oW(this.b).a(), (gsd)esp.hv(this.b).a());
            }
            case 1129: {
                return gvs.m();
            }
            case 1128: {
                return guc.n();
            }
            case 1127: {
                return guc.o((bu)esp.pI(this.b).a(), (SfvAudioItemPlaybackController)esp.tI(this.b).a(), (vcy)eqy.he(this.a).a(), (guw)esp.tj(this.b).a(), (hsq)esp.rk(this.b).a(), (cyb)esp.ha(this.b).a(), esp.fx(this.b), (wyv)esp.ow(this.b).a());
            }
            case 1126: {
                return gvs.l((Context)eqy.ps(this.a).a(), (acmr)eqy.hK(this.a).a());
            }
            case 1125: {
                return gvs.h((xao)eqy.hS(this.a).a(), (tjm)eqy.ib(this.a).a());
            }
            case 1124: {
                return gyv.t((Context)esp.oz(this.b).a(), esp.cq(this.b), (aujg)era.eU(eqy.r(this.a)).a());
            }
            case 1123: {
                return hcr.g((Context)esp.oz(this.b).a(), (abll)eqy.oc(this.a).a(), (abmg)eqy.od(this.a).a(), (ynp)eqy.rc(this.a).a(), (Executor)eqy.oN(this.a).a(), (hci)esp.hg(this.b).a(), (Executor)eqy.fT(this.a).a(), esp.zO(this.b), (wyv)esp.ow(this.b).a(), esp.xI(this.b), (zmf)eqy.pK(this.a).a(), (aujg)era.eU(eqy.r(this.a)).a(), (vai)era.eI(eqy.r(this.a)).a(), (ubu)esp.sN(this.b).a());
            }
            case 1122: {
                return gyv.j((bu)esp.pI(this.b).a(), (ubi)esp.tL(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 1121: {
                return hdz.o((bu)esp.pI(this.b).a());
            }
            case 1120: {
                return hdz.p((bu)esp.pI(this.b).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 1119: {
                return guc.f((bu)esp.pI(this.b).a());
            }
            case 1118: {
                return guc.j((Executor)eqy.fT(this.a).a(), (SfvAudioItemPlaybackController)esp.tI(this.b).a());
            }
            case 1117: {
                return eoy.j((Activity)esp.oz(this.b).a(), (zmf)eqy.pK(this.a).a(), (acar)eqy.pE(this.a).a());
            }
            case 1116: {
                return vkh.d(arlr.b(eqy.gh(this.a)), (Executor)eqy.fT(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 1115: {
                return new fcg((vwa)eqy.ul(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (aczb)era.eq(eqy.r(this.a)).a(), (aczb)era.dU(eqy.r(this.a)).a(), (adgc)era.eb(eqy.r(this.a)).a(), (aekp)era.bA(eqy.r(this.a)).a(), (zmf)eqy.pK(this.a).a(), (vcy)esp.oW(this.b).a(), (tqd)eqy.qe(this.a).a(), (acyi)eqy.ol(this.a).a(), (acyl)eqy.tK(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1114: {
                return fdq.u((Activity)esp.oz(this.b).a(), (man)eqy.ep(this.a).a(), (zmf)eqy.pK(this.a).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), eqy.pE(this.a));
            }
            case 1113: {
                return new vqg((adfq)era.bm(eqy.r(this.a)).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1112: {
                return xeb.g((bu)esp.pI(this.b).a(), (xnj)eqy.hW(this.a).a(), (xhv)eqy.mq(this.a).a());
            }
            case 1111: {
                return wji.s((wlx)esp.rC(this.b).a(), (wju)esp.dU(this.b), (vwa)eqy.jw(this.a).a(), (afvt)eqy.lf(this.a).a());
            }
            case 1110: {
                return wdt.k((Context)eqy.ps(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 1109: {
                return wdt.l(esp.dT(this.b));
            }
            case 1108: {
                return wdt.n((vcy)esp.oW(this.b).a(), (wjc)esp.dU(this.b));
            }
            case 1107: {
                return wji.i((wlx)esp.rC(this.b).a(), esp.dS(this.b));
            }
            case 1106: {
                return wdt.i((wjc)esp.dU(this.b));
            }
            case 1105: {
                return wdt.h((wlx)esp.rC(this.b).a(), esp.dQ(this.b), (Executor)eqy.fT(this.a).a(), (afvt)eqy.qE(this.a).a(), (Context)esp.oz(this.b).a());
            }
            case 1104: {
                return wji.j((wlx)esp.rC(this.b).a(), (wlv)esp.gS(this.b).a(), esp.dV(this.b));
            }
            case 1103: {
                return wji.b((wlx)esp.rC(this.b).a(), esp.dR(this.b), (Executor)eqy.fT(this.a).a(), (afvt)eqy.qE(this.a).a());
            }
            case 1102: {
                return wdt.m((wlx)esp.rC(this.b).a(), (wlv)esp.gS(this.b).a(), esp.dS(this.b));
            }
            case 1101: {
                return wdt.j((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 1100: {
                return rne.q((adfs)era.fs(eqy.r(this.a)).a(), (bu)esp.pI(this.b).a());
            }
        }
    }
    
    private final Object f() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 1299: {
                final esp b = this.b;
                return new blu(esp.oz(b), esp.pk(b), eqy.jn(this.a), esp.kg(b), esp.tm(b), (byte[])null, (byte[])null);
            }
            case 1298: {
                return new ldy(2);
            }
            case 1297: {
                return new aekp(null, (short[])null);
            }
            case 1296: {
                final esp b2 = this.b;
                final atke oz = esp.oz(b2);
                final atke ow = esp.oW(b2);
                final atke vc = esp.vc(b2);
                final atke gi = esp.gi(b2);
                final atke tc = esp.tC(b2);
                final atke tu = esp.tu(b2);
                final atke tm = esp.tm(b2);
                final atke vd = esp.vD(b2);
                final eqy a = this.a;
                return new lff(oz, ow, vc, gi, tc, tu, tm, vd, eqy.qn(a), eqy.kE(a), eqy.fU(a));
            }
            case 1295: {
                final lei t = ldi.t((vwt)eqy.vY(this.a).a(), (acps)esp.pk(this.b).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a(), (aeea)esp.kl(this.b).a(), (avu)era.eL(eqy.r(this.a)).a(), (avu)era.bU(eqy.r(this.a)).a(), (asid)eqy.fU(this.a).a(), (accf)esp.kO(this.b).a(), (oby)eqy.gH(this.a).a(), (hzs)esp.sY(this.b).a(), (aezp)esp.nu(this.b).a(), (hox)esp.jJ(this.b).a());
                esp.bx(t);
                return t;
            }
            case 1294: {
                final ldx s = ldi.s((vwt)eqy.vY(this.a).a(), (acps)esp.pk(this.b).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a(), (aeea)esp.kl(this.b).a(), (avu)era.eL(eqy.r(this.a)).a(), (avu)era.bU(eqy.r(this.a)).a(), (asid)eqy.fU(this.a).a(), (accf)esp.kO(this.b).a(), (oby)eqy.gH(this.a).a(), (hzs)esp.sY(this.b).a(), (aezp)esp.nu(this.b).a(), (hox)esp.jJ(this.b).a());
                esp.br(s);
                return s;
            }
            case 1293: {
                return ldi.u((vwt)eqy.vY(this.a).a(), (acps)esp.pk(this.b).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a(), (aeea)esp.kl(this.b).a(), (avu)era.eL(eqy.r(this.a)).a(), (avu)era.bU(eqy.r(this.a)).a(), (asid)eqy.fU(this.a).a(), (accf)esp.kO(this.b).a(), (oby)eqy.gH(this.a).a(), (hzs)esp.sY(this.b).a(), (aezp)esp.nu(this.b).a());
            }
            case 1292: {
                return aezp.k((Object)era.gI());
            }
            case 1291: {
                return new hzs((oby)eqy.gH(this.a).a(), (fjr)esp.nU(this.b).a());
            }
            case 1290: {
                return new aeea((byte[])null, (byte[])null, (byte[])null, (char[])null);
            }
            case 1289: {
                return new lfi((Activity)esp.oz(this.b).a(), (vwt)eqy.vY(this.a).a(), (acps)esp.pk(this.b).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a(), (aeea)esp.kl(this.b).a(), (avu)era.eL(eqy.r(this.a)).a(), (avu)era.bU(eqy.r(this.a)).a(), (asid)eqy.fU(this.a).a(), (accf)esp.kO(this.b).a(), (oby)eqy.gH(this.a).a(), (hzs)esp.sY(this.b).a(), (aezp)esp.nu(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1288: {
                return new blu((bu)esp.pI(this.b).a(), (acvw)esp.pR(this.b).a(), (SharedPreferences)eqy.sp(this.a).a(), (aln)eqy.np(this.a).a(), null, null, null);
            }
            case 1287: {
                return eoy.q((elx)esp.gi(this.b).a());
            }
            case 1286: {
                return eoy.r((rqj)eqy.fE(this.a).a(), (ets)esp.hS(this.b).a());
            }
            case 1285: {
                final gbc gbc = (gbc)esp.oR(this.b).a();
                final Handler handler = (Handler)eqy.sJ(this.a).a();
                final esp b3 = this.b;
                return fuu.q(gbc, handler, esp.iP(b3), (wyv)esp.ow(b3).a(), (aekp)esp.wM(this.b).a());
            }
            case 1284: {
                final Context context = (Context)esp.oz(this.b).a();
                final esp b4 = this.b;
                return abzn.i(context, esp.iP(b4), (aekp)esp.wM(b4).a(), esp.wT(this.b));
            }
            case 1283: {
                final esp b5 = this.b;
                return abzn.c(esp.iX(b5), Optional.of((Object)esp.iU(b5).a()));
            }
            case 1282: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final esp b6 = this.b;
                final atke jz = esp.jZ(b6);
                final atke ka = esp.ka(b6);
                final eqy a2 = this.a;
                return gqz.c(context2, jz, ka, eqy.jg(a2), esp.wA(b6), (Executor)eqy.fT(a2).a(), (Handler)eqy.sJ(this.a).a());
            }
            case 1281: {
                return htj.t((ziy)esp.uA(this.b).a(), (vai)esp.up(this.b).a());
            }
            case 1280: {
                final eqy a3 = this.a;
                return new aekp(eqy.fT(a3), eqy.oN(a3), (byte[])null);
            }
            case 1279: {
                final esp b7 = this.b;
                final atke sz = esp.sZ(b7);
                final atke pk = esp.pk(b7);
                final atke ow2 = esp.oW(b7);
                final eqy a4 = this.a;
                return new adlp(sz, pk, ow2, eqy.tf(a4), eqy.hK(a4), eqy.tw(a4), era.cd(eqy.r(a4)), (byte[])null, null);
            }
            case 1278: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (boolean[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1277: {
                return oqc.j(aezp.k((Object)eqy.oW(this.a).a()), aezp.k((Object)arlr.b(eqy.oX(this.a))), aezp.k((Object)eqy.pQ(this.a).a()), aezp.k((Object)eqy.pH(this.a).a()), esp.eQ(this.b), esp.pf(this.b), aezp.k((Object)eqy.sM(this.a).a()), aezp.k((Object)eqy.a(this.a)));
            }
            case 1276: {
                return ojw.j();
            }
            case 1275: {
                return oqc.k();
            }
            case 1274: {
                return new mdp((oum)esp.pv(this.b).a());
            }
            case 1273: {
                return ooi.d((oum)esp.pv(this.b).a());
            }
            case 1272: {
                final Optional of = Optional.of((Object)era.ga(eqy.r(this.a)));
                final atke oy = eqy.oY(this.a);
                final oqh oqh = (oqh)esp.qQ(this.b).a();
                final Optional empty = Optional.empty();
                final esp b8 = this.b;
                return ooi.c(of, oy, oqh, empty, esp.pg(b8), esp.pf(b8));
            }
            case 1271: {
                return oqc.h(aezp.k((Object)eqy.pH(this.a).a()), esp.pe(this.b));
            }
            case 1270: {
                return oqc.f(aezp.k((Object)eqy.pH(this.a).a()), (Context)eqy.ps(this.a).a(), esp.pf(this.b), (aezp)eqy.nz(this.a).a());
            }
            case 1269: {
                return oqc.g(aezp.k((Object)eqy.pH(this.a).a()), esp.eQ(this.b), esp.pe(this.b), (Context)eqy.ps(this.a).a());
            }
            case 1268: {
                return new adew();
            }
            case 1267: {
                return gqz.h(esp.dU(this.b));
            }
            case 1266: {
                return hup.e((Activity)esp.oz(this.b).a());
            }
            case 1265: {
                return htj.d((Activity)esp.oz(this.b).a());
            }
            case 1264: {
                return yot.f((Activity)esp.oz(this.b).a(), esp.fr(this.b), (adew)esp.nk(this.b).a());
            }
            case 1263: {
                return vvq.s((vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), (tjb)eqy.pc(this.a).a(), (Executor)eqy.oN(this.a).a());
            }
            case 1262: {
                return gku.f((szk)esp.mh(this.b).a(), (oiy)esp.iW(this.b).a(), arlr.b(esp.oU(this.b)), (wyw)eqy.hP(this.a).a(), (acwt)esp.sD(this.b).a(), (geu)esp.kB(this.b).a());
            }
            case 1261: {
                return gcn.n((vaf)eqy.pn(this.a).a());
            }
            case 1260: {
                return kan.h((vai)eqy.ky(this.a).a(), esp.eA(this.b));
            }
            case 1259: {
                return ohv.v(arlr.b(esp.oU(this.b)), esp.er(this.b));
            }
            case 1258: {
                return wji.o();
            }
            case 1257: {
                final acqb acqb = (acqb)esp.gp(this.b).a();
                wji.n(acqb);
                return acqb;
            }
            case 1256: {
                return wdt.o((acqb)esp.gJ(this.b).a());
            }
            case 1255: {
                return abzn.h((Context)esp.oz(this.b).a(), arlr.b(esp.wB(this.b)), arlr.b(esp.ow(this.b)), (aekp)esp.wM(this.b).a());
            }
            case 1254: {
                return wji.h((bu)esp.pI(this.b).a(), (vcy)eqy.he(this.a).a(), (vct)esp.oV(this.b).a(), era.fj(eqy.r(this.a)));
            }
            case 1253: {
                return adca.q((adfs)era.ci(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a());
            }
            case 1252: {
                return new fci((abpq)esp.ka(this.b).a(), (vcy)esp.oW(this.b).a(), 15);
            }
            case 1251: {
                return srz.o((Activity)esp.oz(this.b).a(), esp.zx(this.b), (zmf)eqy.pK(this.a).a(), (wyv)esp.ow(this.b).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a());
            }
            case 1250: {
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                final iri iri = (iri)esp.ip(this.b).a();
                final Context context3 = (Context)esp.oz(this.b).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final esp b9 = this.b;
                return gqz.f(vaf, iri, context3, zmf, tgd, esp.ka(b9), (izv)esp.sF(b9).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (wxx)eqy.tf(this.a).a());
            }
            case 1249: {
                return gqz.m(esp.nt(this.b));
            }
            case 1248: {
                return gqz.e((tgd)eqy.jn(this.a).a(), esp.ka(this.b), (vaf)eqy.pn(this.a).a(), (vcy)esp.oW(this.b).a(), esp.gi(this.b));
            }
            case 1247: {
                final Executor executor = (Executor)eqy.fT(this.a).a();
                final eqy a5 = this.a;
                return gqz.l(executor, eqy.vY(a5), eqy.vZ(a5), esp.kU(this.b));
            }
            case 1246: {
                return gpb.c((Context)eqy.ps(this.a).a(), eqy.pB(this.a), (vcy)esp.oW(this.b).a(), (Executor)eqy.oN(this.a).a(), (Handler)eqy.sJ(this.a).a(), (adaj)esp.go(this.b).a(), (acuq)era.cz(eqy.r(this.a)).a(), (Activity)esp.oz(this.b).a(), (vai)eqy.gD(this.a).a());
            }
            case 1245: {
                return uzu.c((vad)eqy.jN(this.a).a());
            }
            case 1244: {
                final esp b10 = this.b;
                return new eyz(esp.jZ(b10), esp.hv(b10), esp.ka(b10), 8, (byte[])null);
            }
            case 1243: {
                return new hyt((vcy)esp.oW(this.b).a(), 9);
            }
            case 1242: {
                return jex.k((wxx)eqy.tf(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 1241: {
                return new hyt((tgd)eqy.jn(this.a).a(), 10, (short[])null);
            }
            case 1240: {
                return new fdr((tqn)eqy.fh(this.a).a(), 7);
            }
            case 1239: {
                return srz.e((Activity)esp.oz(this.b).a(), (wxx)eqy.tf(this.a).a(), (tgd)eqy.jn(this.a).a(), (zmf)eqy.pK(this.a).a(), (vcy)esp.oW(this.b).a(), (vai)esp.hJ(this.b).a(), (vdr)eqy.kE(this.a).a(), (asid)eqy.fU(this.a).a(), (afss)eqy.vo(this.a).a(), (xao)eqy.hS(this.a).a());
            }
            case 1238: {
                return srz.g((sya)esp.nO(this.b).a());
            }
            case 1237: {
                return new syo((bu)esp.pI(this.b).a(), esp.xX(this.b), (tqd)eqy.qe(this.a).a(), (mdp)era.cI(eqy.r(this.a)).a(), (wxx)eqy.tf(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1236: {
                return new syn((Activity)esp.oz(this.b).a(), esp.xO(this.b), (tqd)eqy.qe(this.a).a(), (mdp)era.cI(eqy.r(this.a)).a(), (wxx)eqy.tf(this.a).a(), (vcy)esp.oW(this.b).a(), (bu)esp.pI(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1235: {
                return new gpx((wyv)esp.ow(this.b).a(), esp.cV(this.b), 20);
            }
            case 1234: {
                return fdq.d((ghe)esp.wl(this.b).a());
            }
            case 1233: {
                return new syh((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1232: {
                return new syj((vcy)esp.oW(this.b).a(), esp.zx(this.b), (zmf)eqy.pK(this.a).a(), (tqd)eqy.qe(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1231: {
                return gns.m((bu)esp.pI(this.b).a(), esp.zx(this.b), (zmf)eqy.pK(this.a).a(), (wyv)esp.ow(this.b).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (YpcOffersListDialogFragmentController)esp.wO(this.b).a(), (Executor)eqy.fT(this.a).a());
            }
            case 1230: {
                return igy.p((bu)esp.pI(this.b).a(), (aadx)era.fR(eqy.r(this.a)).a(), arlr.b(eqy.hP(this.a)), (tqd)eqy.qe(this.a).a(), (ProgressBarDialogFragmentController)esp.oq(this.b).a(), esp.eb(this.b), (vcy)esp.oW(this.b).a(), (tag)esp.iV(this.b).a(), (bx)esp.mi(this.b).a(), (Executor)eqy.fT(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 1229: {
                return srz.l((bu)esp.pI(this.b).a(), esp.eP(this.b), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), esp.dN(this.b), (mdp)era.cI(eqy.r(this.a)).a(), (wyv)esp.ow(this.b).a(), (Executor)eqy.fT(this.a).a());
            }
            case 1228: {
                final atke oz2 = esp.oz(this.b);
                final eqy a6 = this.a;
                return new aujg(oz2, eqy.kK(a6), eqy.kr(a6), (char[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1227: {
                return new vwa(esp.oz(this.b), eqy.kr(this.a), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1226: {
                final esp b11 = this.b;
                final atke oz3 = esp.oz(b11);
                final eqy a7 = this.a;
                return new vbs(oz3, eqy.kr(a7), eqy.kK(a7), esp.ud(b11), (char[])null, (byte[])null);
            }
            case 1225: {
                return gns.u((Activity)esp.oz(this.b).a(), esp.cW(this.b), (tqd)eqy.qe(this.a).a(), (tgd)eqy.jn(this.a).a(), (vcy)esp.oW(this.b).a(), (YpcOffersListDialogFragmentController)esp.wO(this.b).a(), (mdp)era.cI(eqy.r(this.a)).a(), esp.yx(this.b), esp.zQ(this.b), (wyv)esp.ow(this.b).a(), esp.dN(this.b), (acjd)eqy.mT(this.a).a(), (vlq)eqy.kL(this.a).a(), (aeea)eqy.mB(this.a).a());
            }
            case 1224: {
                final bu bu = (bu)esp.pI(this.b).a();
                final vwa aa = esp.Aa(this.b);
                final eqy a8 = this.a;
                return new uyz(bu, aa, eqy.om(a8), (man)eqy.ep(a8).a(), (zmf)eqy.pK(this.a).a(), (Context)eqy.ps(this.a).a(), (wxx)eqy.tf(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1223: {
                return new hln((uyz)esp.jw(this.b).a(), (mdp)era.cI(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1222: {
                return srz.m((mdp)era.cI(eqy.r(this.a)).a());
            }
            case 1221: {
                return srz.h(esp.dN(this.b), (bu)esp.pI(this.b).a(), esp.eO(this.b), (Executor)eqy.fT(this.a).a());
            }
            case 1220: {
                return new sye((bu)esp.pI(this.b).a(), esp.dN(this.b), (acpk)eqy.kK(this.a).a(), (wyw)eqy.hP(this.a).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (mdp)era.fQ(eqy.r(this.a)).a(), (mdp)era.cI(eqy.r(this.a)).a(), (wxx)eqy.tf(this.a).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1219: {
                return gpb.r((avu)era.ae(eqy.r(this.a)).a());
            }
            case 1218: {
                return gns.i((vcy)esp.oW(this.b).a(), (agnt)eqy.tu(this.a).a());
            }
            case 1217: {
                return gns.d((vcy)esp.oW(this.b).a(), (fjv)esp.ra(this.b).a());
            }
            case 1216: {
                return ably.t((tgd)eqy.jn(this.a).a(), (vwt)eqy.vY(this.a).a(), (vwu)eqy.vZ(this.a).a());
            }
            case 1215: {
                return gns.r((vcy)esp.oW(this.b).a(), (aujg)esp.vL(this.b).a(), (agnt)eqy.tu(this.a).a(), (elx)eqy.vz(this.a).a(), esp.wQ(this.b));
            }
            case 1214: {
                return kxz.q((abpu)esp.qW(this.b).a(), (fjv)esp.ra(this.b).a(), (msr)esp.ox(this.b).a(), esp.wZ(this.b));
            }
            case 1213: {
                return gns.l(esp.gI(this.b).a(), (heo)esp.oo(this.b).a(), (wyw)eqy.hP(this.a).a(), (fjv)esp.ra(this.b).a());
            }
            case 1212: {
                return gns.f((itd)esp.nV(this.b).a());
            }
            case 1211: {
                return gns.g((YouTubeControlsOverlay)esp.wA(this.b).a(), (kuk)esp.od(this.b).a());
            }
            case 1210: {
                return gns.c(esp.gI(this.b).a());
            }
            case 1209: {
                return fdq.n(esp.vh(this.b));
            }
            case 1208: {
                return ewu.u((bu)esp.pI(this.b).a(), (tqd)eqy.qe(this.a).a(), (vol)era.av(eqy.r(this.a)).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), esp.wS(this.b));
            }
            case 1207: {
                return eyv.u((bu)esp.pI(this.b).a(), (tqd)eqy.qe(this.a).a(), (zmf)eqy.pK(this.a).a(), (vlf)eqy.jX(this.a).a(), (vcy)esp.oW(this.b).a(), esp.kr(this.b), (vol)era.av(eqy.r(this.a)).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), esp.wS(this.b));
            }
            case 1206: {
                return eyv.f((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a());
            }
            case 1205: {
                return ewu.v((bu)esp.pI(this.b).a(), (tqd)eqy.qe(this.a).a(), (zmf)eqy.pK(this.a).a(), (vdr)eqy.kE(this.a).a(), (acnc)esp.hW(this.b).a(), esp.kr(this.b), (vot)era.aw(eqy.r(this.a)).a(), (Handler)eqy.sJ(this.a).a(), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a(), (aeea)eqy.mB(this.a).a(), esp.wS(this.b));
            }
            case 1204: {
                final esp b12 = this.b;
                return eyv.e(esp.hk(b12), esp.hl(b12), esp.hj(b12));
            }
            case 1203: {
                return new fdr((fzb)esp.vc(this.b).a(), 16);
            }
            case 1202: {
                return new fdr((vcy)esp.oW(this.b).a(), 13);
            }
            case 1201: {
                return fdq.c();
            }
            case 1200: {
                return new fec(7);
            }
        }
    }
    
    private final Object g() {
        final int c = this.c;
        final Integer value = 2131427411;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 1399: {
                return afft.s((Object)lmb.h());
            }
            case 1398: {
                return lmb.b(esp.fD(this.b), (StartupSignalStream)esp.uh(this.b).a(), (asid)eqy.fU(this.a).a(), (toj)eqy.uG(this.a).a());
            }
            case 1397: {
                return afev.m("pane_nav_controller", esp.il(this.b).a());
            }
            case 1396: {
                return afft.u((Object)esp.dF(this.b), (Object)esp.dD(this.b), (Object)esp.dE(this.b));
            }
            case 1395: {
                final affr j = afft.j(3);
                j.h((Object)esp.bj());
                j.j((Iterable)esp.fN(this.b));
                j.h((Object)esp.oy(this.b).a());
                return j.g();
            }
            case 1394: {
                return lmb.g((aun)esp.pI(this.b).a(), arlr.b(esp.gm(this.b)), (vaf)eqy.pn(this.a).a(), (Activity)esp.oz(this.b).a(), (StartupSignalStream)esp.uh(this.b).a(), (asid)eqy.fU(this.a).a(), arlr.b(esp.jF(this.b)), arlr.b(esp.gl(this.b)), (LifecycleInitializableManager)esp.kW(this.b).a(), (toj)eqy.uG(this.a).a());
            }
            case 1393: {
                return hdz.r();
            }
            case 1392: {
                return gyv.d((afvs)eqy.oN(this.a).a(), (acgs)eqy.kr(this.a).a());
            }
            case 1391: {
                return gvs.r((ueu)esp.gV(this.b).a());
            }
            case 1390: {
                return gvs.k((ubu)esp.sN(this.b).a());
            }
            case 1389: {
                return gvs.g((uve)esp.oH(this.b).a());
            }
            case 1388: {
                final ViewGroup viewGroup = (ViewGroup)esp.rr(this.b).a();
                ljh.o(viewGroup);
                return viewGroup;
            }
            case 1387: {
                final ViewGroup viewGroup2 = (ViewGroup)esp.rr(this.b).a();
                hlb.e(viewGroup2);
                return viewGroup2;
            }
            case 1386: {
                return gqz.j((View)esp.oA(this.b).a());
            }
            case 1385: {
                return gqz.g((View)esp.oA(this.b).a());
            }
            case 1384: {
                return gvs.b(esp.cp(this.b));
            }
            case 1383: {
                return htj.b((View)esp.pB(this.b).a());
            }
            case 1382: {
                return ulu.f((Activity)esp.oz(this.b).a(), esp.fE(this.b));
            }
            case 1381: {
                return hdz.d((adkb)eqy.iB(this.a).a(), (Executor)eqy.oN(this.a).a());
            }
            case 1380: {
                return txm.e((Activity)esp.oz(this.b).a(), (acpk)eqy.kK(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 1379: {
                return gvs.t(esp.dL(this.b), esp.dK(this.b), (aujg)era.eU(eqy.r(this.a)).a(), esp.dI(this.b), esp.dH(this.b), (uas)esp.iO(this.b).a(), (uaz)esp.kS(this.b).a(), esp.Ao(this.b));
            }
            case 1378: {
                return gvs.d(esp.cp(this.b));
            }
            case 1376:
            case 1377: {
                return 2131429500;
            }
            case 1375: {
                return 2131428812;
            }
            case 1374: {
                return ulu.h((Activity)esp.oz(this.b).a(), esp.eY(this.b));
            }
            case 1373: {
                return value;
            }
            case 1371:
            case 1372: {
                return 2131429499;
            }
            case 1368:
            case 1369:
            case 1370: {
                return value;
            }
            case 1367: {
                return ulu.g((Activity)esp.oz(this.b).a(), esp.fF(this.b));
            }
            case 1366: {
                return htj.e(esp.ct(this.b));
            }
            case 1365: {
                return ulu.i((Activity)esp.oz(this.b).a(), esp.eZ(this.b));
            }
            case 1364: {
                return new eqb(this, 1);
            }
            case 1363: {
                return new eqc(this, 1);
            }
            case 1362: {
                return new pvh(this);
            }
            case 1361: {
                return new pvh(this);
            }
            case 1360: {
                return ufa.l();
            }
            case 1359: {
                return ufa.k();
            }
            case 1358: {
                return ufa.m(arlr.b(esp.qw(this.b)), arlr.b(esp.qx(this.b)), (Context)eqy.ps(this.a).a());
            }
            case 1357: {
                return wji.p((Context)eqy.ps(this.a).a(), (arwh)eqy.qn(this.a).a(), esp.wU(this.b));
            }
            case 1356: {
                return wji.r();
            }
            case 1355: {
                return new sqq((rgs)esp.sJ(this.b).a(), (zmf)eqy.pK(this.a).a(), (vmz)eqy.et(this.a).a());
            }
            case 1354: {
                return wji.d(esp.dU(this.b));
            }
            case 1353: {
                return ggm.o((vai)eqy.gF(this.a).a(), (ghb)esp.il(this.b).a(), (lag)esp.kf(this.b).a(), (msr)esp.ox(this.b).a(), (vyb)eqy.ix(this.a).a());
            }
            case 1352: {
                return gcn.s((vai)eqy.gF(this.a).a(), (ghb)esp.il(this.b).a(), (lag)esp.kf(this.b).a(), (msr)esp.ox(this.b).a(), (vyb)eqy.ix(this.a).a());
            }
            case 1351: {
                return new gec((Context)esp.oz(this.b).a(), esp.oW(this.b), (acpk)eqy.kK(this.a).a(), (acvw)esp.pR(this.b).a(), jex.s(), era.gU(eqy.r(this.a)), (ghb)esp.il(this.b).a(), esp.zp(this.b), esp.yl(this.b), (vai)era.eI(eqy.r(this.a)).a(), (lag)esp.kf(this.b).a(), null, null, null, null, null);
            }
            case 1350: {
                return new gdg((Context)esp.ut(this.b).a(), (acpk)eqy.kK(this.a).a(), (vaf)eqy.pn(this.a).a());
            }
            case 1349: {
                return gcn.q(esp.ze(this.b), (gdj)esp.gL(this.b).a());
            }
            case 1348: {
                return new gdk((Context)esp.ut(this.b).a(), (acpk)eqy.kK(this.a).a(), (gbc)esp.oR(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 1347: {
                return gcn.p(esp.ze(this.b), (gdj)esp.jz(this.b).a());
            }
            case 1346: {
                return fei.o((skt)esp.qH(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 1345: {
                return ggm.b();
            }
            case 1344: {
                final vai vai = (vai)eqy.lv(this.a).a();
                final afss afss = (afss)eqy.vo(this.a).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final eqy a = this.a;
                return lkh.h(vai, afss, zmf, era.ei(eqy.r(a)), (hze)era.by(eqy.r(a)).a(), (vdr)eqy.kE(this.a).a());
            }
            case 1343: {
                return lkh.l((vai)eqy.lv(this.a).a(), (asid)eqy.fU(this.a).a(), (aun)esp.pI(this.b).a(), (wxx)eqy.tf(this.a).a(), (msr)eqy.mM(this.a).a(), (ShortsTargetedListener)esp.tP(this.b).a(), (afss)eqy.vo(this.a).a(), era.ei(eqy.r(this.a)), (llb)esp.in(this.b).a());
            }
            case 1342: {
                return ewu.s(esp.oW(this.b), (vaf)eqy.pn(this.a).a());
            }
            case 1341: {
                return new c((vcy)esp.oW(this.b).a());
            }
            case 1340: {
                final asid asid = (asid)eqy.fJ(this.a).a();
                final fa fa = (fa)esp.oF(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final aeea aeea = (aeea)esp.iE(this.b).a();
                final fjp fjp = (fjp)eqy.kN(this.a).a();
                final blu blu = (blu)esp.wa(this.b).a();
                final esp b = this.b;
                final atke gf = esp.gF(b);
                final atke pw = esp.pW(b);
                final c c2 = (c)esp.uF(b).a();
                final avu avu = (avu)esp.uv(this.b).a();
                final lko lko = (lko)esp.wl(this.b).a();
                final fam fam = (fam)esp.wn(this.b).a();
                final lki lki = (lki)esp.wj(this.b).a();
                final hze hze = (hze)era.by(eqy.r(this.a)).a();
                final eqy a2 = this.a;
                final atke pl = eqy.pl(a2);
                final Executor executor = (Executor)eqy.fT(a2).a();
                final esp b2 = this.b;
                final atke nn = esp.nN(b2);
                final vai ww = esp.wW(b2);
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final eqy a3 = this.a;
                final atke hp = eqy.hP(a3);
                final bx s = jex.s();
                final fzw v = hup.v();
                final cya o = gcn.o();
                final wxx wxx = (wxx)eqy.tf(a3).a();
                final fgt fgt = (fgt)era.fE(eqy.r(this.a)).a();
                final xbd xbd = (xbd)eqy.pD(this.a).a();
                final eqy a4 = this.a;
                final atke ei = era.ei(eqy.r(a4));
                final zaz zaz = (zaz)era.cW(eqy.r(a4)).a();
                final vai vai2 = (vai)eqy.lv(this.a).a();
                final vai vai3 = (vai)eqy.up(this.a).a();
                final hny hny = (hny)eqy.tG(this.a).a();
                final tol tol = (tol)eqy.uH(this.a).a();
                final arkg b3 = arlr.b(esp.tO(this.b));
                final afss afss2 = (afss)eqy.vo(this.a).a();
                final lkv lkv = (lkv)esp.wr(this.b).a();
                final eqy a5 = this.a;
                return lkh.u(asid, fa, vcy, aeea, fjp, blu, gf, pw, c2, avu, lko, fam, lki, hze, pl, executor, nn, ww, tgd, hp, s, v, o, wxx, fgt, xbd, ei, zaz, vai2, vai3, hny, tol, b3, afss2, lkv, eqy.un(a5), (vai)eqy.lu(a5).a());
            }
            case 1339: {
                final fa fa2 = (fa)esp.oF(this.b).a();
                final esp b4 = this.b;
                return lio.u(fa2, esp.wi(b4), esp.in(b4), (ghb)esp.il(b4).a(), gcn.o(), hup.v());
            }
            case 1338: {
                return ljm.r();
            }
            case 1337: {
                final bu bu = (bu)esp.pI(this.b).a();
                final ghe ghe = (ghe)esp.wl(this.b).a();
                final zmt zmt = (zmt)era.cj(eqy.r(this.a)).a();
                final zmf zmf2 = (zmf)eqy.pK(this.a).a();
                final rjy rjy = (rjy)era.bF(eqy.r(this.a)).a();
                final vcy vcy2 = (vcy)esp.oW(this.b).a();
                final fjp fjp2 = (fjp)eqy.kN(this.a).a();
                final gbu gbu = (gbu)esp.ry(this.b).a();
                final atke in = esp.in(this.b);
                final zml zml = (zml)eqy.hN(this.a).a();
                final riq riq = (riq)eqy.pK(this.a).a();
                final fxw fxw = (fxw)esp.gn(this.b).a();
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final rlq ct = esp.cT(this.b);
                final esp b5 = this.b;
                return lkh.t(bu, ghe, zmt, zmf2, rjy, vcy2, fjp2, gbu, in, zml, riq, fxw, arwh, ct, esp.uQ(b5), (kkj)esp.wm(b5).a(), esp.wf(this.b).a(), esp.wX(this.b), (etq)esp.vO(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 1336: {
                return fei.m((tgd)eqy.jn(this.a).a(), (xbd)eqy.pD(this.a).a(), (vaf)eqy.pn(this.a).a(), (toj)eqy.uG(this.a).a(), (ffe)era.dr(eqy.r(this.a)).a());
            }
            case 1335: {
                return ldi.h(arlr.b(esp.rr(this.b)));
            }
            case 1334: {
                return kxz.s((ghb)esp.il(this.b).a(), (fjv)esp.ra(this.b).a(), (vai)eqy.uo(this.a).a());
            }
            case 1333: {
                return ljk.j((FullscreenEngagementPanelOverlay)esp.jM(this.b).a());
            }
            case 1332: {
                return ljl.h((lik)esp.tV(this.b).a());
            }
            case 1331: {
                return ljk.k((FullscreenEngagementPanelOverlay)esp.jM(this.b).a());
            }
            case 1330: {
                return ljl.i((lik)esp.tV(this.b).a());
            }
            case 1329: {
                return kvu.h(arlr.b(esp.sj(this.b)), (kxg)esp.vA(this.b).a(), (arwh)eqy.qn(this.a).a(), (asie)esp.rd(this.b).a(), (asie)esp.pM(this.b).a(), (kxl)esp.vA(this.b).a());
            }
            case 1328: {
                return kvu.r((Context)esp.oz(this.b).a(), arlr.b(esp.sj(this.b)), (vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (kxk)esp.vC(this.b).a(), (fzw)esp.vM(this.b).a(), (abpu)esp.qW(this.b).a(), (kxg)esp.vA(this.b).a(), (asie)esp.rc(this.b).a(), (asie)esp.pL(this.b).a(), (vai)esp.vZ(this.b).a());
            }
            case 1327: {
                return lgr.f((iri)esp.ip(this.b).a(), (lco)esp.nb(this.b).a());
            }
            case 1326: {
                return lgr.l((Context)esp.oz(this.b).a(), (msr)esp.sm(this.b).a(), (msr)esp.sl(this.b).a(), (msr)esp.ox(this.b).a(), (asid)eqy.fU(this.a).a(), (abpu)esp.qW(this.b).a(), (lco)esp.nb(this.b).a(), (vai)esp.vZ(this.b).a());
            }
            case 1325: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                return ldi.j((msr)esp.sm(this.b).a());
            }
            case 1324: {
                return lgr.k((acvx)esp.pR(this.b).a(), (wyw)eqy.hP(this.a).a(), (lco)esp.nb(this.b).a(), (uve)esp.sj(this.b).a(), (msr)esp.sl(this.b).a(), (abpu)esp.qW(this.b).a(), (msr)esp.ox(this.b).a(), esp.cL(this.b));
            }
            case 1323: {
                return lgr.r((msr)esp.sk(this.b).a(), (msr)esp.sm(this.b).a(), (lhn)esp.sT(this.b).a(), (lhp)esp.vP(this.b).a(), esp.cL(this.b));
            }
            case 1322: {
                final ldz n = ldi.n((bu)esp.pI(this.b).a(), (wyw)esp.qg(this.b).a(), (tgd)eqy.jn(this.a).a(), (abpl)esp.jY(this.b).a(), (PlaybackLoopShuffleMonitor)esp.nT(this.b).a(), (vcy)esp.oW(this.b).a(), (c)esp.ok(this.b).a(), (acpk)eqy.kK(this.a).a(), (vgo)era.dB(eqy.r(this.a)).a(), (bx)era.ah(eqy.r(this.a)).a(), (vai)eqy.vx(this.a).a());
                esp.bs(n);
                return n;
            }
            case 1321: {
                return new c((short[])null);
            }
            case 1320: {
                return kvu.t((Context)esp.oz(this.b).a(), (tgd)eqy.jn(this.a).a(), (vcy)esp.oW(this.b).a(), (vwt)eqy.vY(this.a).a(), (tqd)eqy.qe(this.a).a(), (c)esp.ok(this.b).a(), (hox)esp.jJ(this.b).a(), (acps)esp.pk(this.b).a(), (aeea)esp.sZ(this.b).a(), (abgu)era.dI(eqy.r(this.a)).a(), esp.ee(this.b), (vai)eqy.lv(this.a).a(), (acwb)esp.ry(this.b).a(), esp.yH(this.b), (aeea)eqy.iZ(this.a).a());
            }
            case 1319: {
                final esp b6 = this.b;
                return new e(esp.nT(b6), esp.pR(b6), eqy.hv(this.a), esp.qg(b6));
            }
            case 1318: {
                return knh.i((kni)esp.pl(this.b).a());
            }
            case 1317: {
                return new kdt((man)eqy.ep(this.a).a(), (zmf)eqy.pK(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1316: {
                return new AdsWebViewCacheController((tgd)eqy.jn(this.a).a(), (kdt)esp.gs(this.b).a(), (byte[])null, (byte[])null);
            }
            case 1315: {
                final ShowPlaylistEngagementPanelOnUiReadyHandler f = kvu.f((aaxx)eqy.iF(this.a).a(), (vcy)esp.oW(this.b).a(), arlr.b(esp.sj(this.b)));
                esp.bD(f);
                return f;
            }
            case 1314: {
                return kvu.e((abpu)esp.qW(this.b).a());
            }
            case 1313: {
                return gku.r((vcy)esp.oW(this.b).a(), esp.fT(this.b));
            }
            case 1312: {
                return ldi.c((lff)esp.ub(this.b).a(), (accf)esp.kO(this.b).a());
            }
            case 1311: {
                return ljh.u();
            }
            case 1310: {
                return new c(eqy.mi(this.a), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1309: {
                final esp b7 = this.b;
                return kxz.m(esp.oz(b7), esp.qW(b7), esp.oT(b7), esp.jv(b7));
            }
            case 1308: {
                return ixy.f();
            }
            case 1307: {
                final esp b8 = this.b;
                final atke oz = esp.oz(b8);
                final atke ka = esp.ka(b8);
                final atke qg = esp.qg(b8);
                final atke wn = esp.wn(b8);
                final atke wn2 = esp.wn(b8);
                final atke wn3 = esp.wn(b8);
                final atke qc = esp.qC(b8);
                final atke qb = esp.qB(b8);
                final atke wy = esp.wy(b8);
                final eqy a6 = this.a;
                return new kzc(oz, ka, qg, wn, wn2, wn3, qc, qb, wy, eqy.eO(a6), esp.jB(b8), eqy.pn(a6), eqy.qn(a6), esp.qW(b8), eqy.mm(a6), eqy.hr(a6), esp.ra(b8), esp.jA(b8), esp.rw(b8), esp.jJ(b8), eqy.fU(a6), esp.vI(b8), esp.oR(b8), eqy.wc(a6), esp.oo(b8), eqy.vz(a6));
            }
            case 1306: {
                return ljk.h(esp.hZ(this.b));
            }
            case 1305: {
                return knh.g((kni)esp.pl(this.b).a());
            }
            case 1304: {
                final esp b9 = this.b;
                return new aujg(esp.oz(b9), eqy.fU(this.a), esp.ox(b9), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1303: {
                final esp b10 = this.b;
                return new kdt(esp.oz(b10), esp.ox(b10), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1302: {
                return fqs.v((Context)esp.oz(this.b).a(), (Executor)eqy.lf(this.a).a(), (zlo)eqy.kB(this.a).a(), (otk)eqy.jg(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 1301: {
                return fqs.t((Context)esp.oz(this.b).a(), (Executor)eqy.lf(this.a).a(), (zlo)eqy.kB(this.a).a(), (otk)eqy.jg(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 1300: {
                return fqs.s((Context)esp.oz(this.b).a(), (Executor)eqy.lf(this.a).a(), (zlo)eqy.kB(this.a).a(), (otk)eqy.jg(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
        }
    }
    
    private final Object h() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 1499: {
                return afft.s((Object)esp.yX(this.b));
            }
            case 1498: {
                return htj.u((ziy)eqy.iC(this.a).a(), (asid)eqy.fU(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 1497: {
                return htj.l((Activity)esp.oz(this.b).a(), esp.fs(this.b));
            }
            case 1496: {
                return htj.k((Activity)esp.oz(this.b).a(), esp.fB(this.b));
            }
            case 1495: {
                return hup.c((Activity)esp.oz(this.b).a(), esp.fn(this.b));
            }
            case 1494: {
                return yot.o((Context)eqy.ps(this.a).a());
            }
            case 1493: {
                return htj.v((skt)esp.vd(this.b).a(), (asid)eqy.fU(this.a).a(), (zhk)esp.ps(this.b).a(), (zaz)esp.qN(this.b).a(), (ziy)esp.uA(this.b).a(), (htq)esp.sQ(this.b).a(), (Executor)eqy.fT(this.a).a(), (faq)esp.sH(this.b).a(), (fzg)esp.gf(this.b).a(), (cl)esp.sK(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 1492: {
                return adca.k();
            }
            case 1491: {
                return hup.f((Activity)esp.oz(this.b).a());
            }
            case 1490: {
                return hup.j(esp.cu(this.b));
            }
            case 1489: {
                return htj.i(esp.ct(this.b));
            }
            case 1488: {
                return yot.g((Activity)esp.oz(this.b).a(), esp.fI(this.b));
            }
            case 1487: {
                return adca.p();
            }
            case 1486: {
                return yot.n((Context)eqy.ps(this.a).a(), (skt)esp.vd(this.b).a(), (zgt)esp.dZ(this.b));
            }
            case 1485: {
                return hup.q((acgs)eqy.kr(this.a).a(), (asid)eqy.fU(this.a).a(), (zhk)esp.ps(this.b).a(), (Context)esp.oz(this.b).a(), (atjm)esp.qz(this.b).a());
            }
            case 1484: {
                return hup.p((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (kja)esp.mn(this.b).a());
            }
            case 1483: {
                return lgr.o((lag)esp.kf(this.b).a(), (elx)eqy.io(this.a).a(), (liq)esp.nd(this.b).a());
            }
            case 1482: {
                return lkh.g((ghe)esp.wl(this.b).a(), era.ei(eqy.r(this.a)));
            }
            case 1481: {
                return kan.b(esp.wR(this.b));
            }
            case 1480: {
                return kan.i((Activity)esp.oz(this.b).a(), (arwh)eqy.qn(this.a).a(), (lag)esp.kf(this.b).a(), esp.xY(this.b), (abpu)esp.qW(this.b).a(), arlr.b(esp.rv(this.b)), (oby)eqy.gH(this.a).a(), (aun)esp.pI(this.b).a(), esp.wW(this.b));
            }
            case 1479: {
                return new PlayerResponseServiceEndpointListener((abpu)esp.qW(this.b).a(), (vcy)esp.oW(this.b).a(), (asid)eqy.fU(this.a).a());
            }
            case 1478: {
                return ggm.k((ghe)esp.wl(this.b).a(), (zfw)esp.ik(this.b).a());
            }
            case 1477: {
                return iyu.e((fpn)esp.ws(this.b).a(), (abbd)era.X(eqy.r(this.a)).a(), (iuv)esp.hM(this.b).a());
            }
            case 1476: {
                return kxz.d((abpu)esp.qW(this.b).a(), (kyq)esp.jx(this.b).a(), (abdx)esp.ws(this.b).a());
            }
            case 1475: {
                return syt.b((otk)eqy.jg(this.a).a());
            }
            case 1474: {
                return lgr.j((Context)esp.oz(this.b).a(), (PlaybackLoopShuffleMonitor)esp.nT(this.b).a(), (bhv)era.eW(eqy.r(this.a)).a(), (acwb)esp.ry(this.b).a(), (abpu)esp.qW(this.b).a(), (wyw)esp.qg(this.b).a(), (arwh)eqy.qn(this.a).a());
            }
            case 1473: {
                return eyv.k((rpv)eqy.hp(this.a).a(), (skc)eqy.hr(this.a).a(), (Context)esp.oz(this.b).a(), (lco)esp.nb(this.b).a());
            }
            case 1472: {
                final esp b = this.b;
                final ChapterSeekOverlayController j = isz.j((abap)esp.uL(b).a(), (abpu)esp.qW(this.b).a(), (abgw)esp.rh(this.b).a(), (vaf)eqy.pn(this.a).a());
                esp.xb(b, j);
                return j;
            }
            case 1471: {
                return kxz.j((Context)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a());
            }
            case 1470: {
                return kvu.c((Context)esp.oz(this.b).a(), (otk)eqy.jg(this.a).a(), (uve)esp.sj(this.b).a());
            }
            case 1469: {
                final esp b2 = this.b;
                final PipPaidProductBadgeOverlay s = ivh.s((Context)esp.oz(b2).a(), (abpu)esp.qW(this.b).a(), (Handler)eqy.sJ(this.a).a(), (oby)eqy.gH(this.a).a(), (arwh)eqy.qn(this.a).a());
                esp.xn(b2, s);
                return s;
            }
            case 1468: {
                final esp b3 = this.b;
                final MiniPlayerErrorOverlay f = ivh.f((Context)esp.oz(b3).a(), (abpu)esp.qW(this.b).a(), (asid)eqy.fU(this.a).a());
                esp.xl(b3, f);
                return f;
            }
            case 1467: {
                return kxz.u((Context)esp.oz(this.b).a(), (jki)esp.vD(this.b).a(), (ashi)esp.sx(this.b).a(), (kyq)esp.jx(this.b).a());
            }
            case 1466: {
                return lgr.p((vai)eqy.gF(this.a).a(), esp.wY(this.b), eqy.xU(this.a), (aawy)eqy.iF(this.a).a(), (lhs)esp.nU(this.b).a(), (asid)eqy.fU(this.a).a(), (abpu)esp.qW(this.b).a(), (qv)esp.oc(this.b).a(), esp.fZ(this.b), esp.fY(this.b), esp.zN(this.b));
            }
            case 1465: {
                return new WatchUpsellDialogController((abpq)esp.ka(this.b).a(), (aahh)esp.ii(this.b).a(), (wyw)eqy.hP(this.a).a(), (fzw)era.fK(eqy.r(this.a)).a(), (abpu)esp.qW(this.b).a(), (vcy)esp.oW(this.b).a(), (actt)esp.jL(this.b).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1464: {
                return new VolumeControlsManager(arlr.b(eqy.qY(this.a)), (abux)eqy.ms(this.a).a(), (Activity)esp.oz(this.b).a());
            }
            case 1463: {
                return gku.e((acwt)esp.sD(this.b).a(), (fjv)esp.ra(this.b).a());
            }
            case 1462: {
                final esp b4 = this.b;
                final TooltipPlayerResponseMonitor d = gku.d((acwn)esp.rS(b4).a(), (abpu)esp.qW(this.b).a());
                esp.xr(b4, d);
                return d;
            }
            case 1461: {
                return new ThemeStoreLifecycleController((gkt)eqy.sB(this.a).a());
            }
            case 1460: {
                return new TrailerOverlayPresenter((Context)esp.oz(this.b).a(), (fxm)esp.kT(this.b).a(), (mdp)era.cI(eqy.r(this.a)).a(), (abpu)esp.qW(this.b).a(), (asid)eqy.fU(this.a).a(), (tgd)eqy.jn(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1459: {
                return jts.d((Context)esp.oz(this.b).a(), (acwb)esp.rU(this.b).a(), (tgd)eqy.jn(this.a).a());
            }
            case 1458: {
                return idj.v((ghb)esp.il(this.b).a(), (fjv)esp.ra(this.b).a(), (fny)esp.nW(this.b).a(), (arwh)eqy.qn(this.a).a(), (abpq)esp.ka(this.b).a(), (abpl)esp.jY(this.b).a(), (elx)esp.gi(this.b).a(), (llb)esp.in(this.b).a(), (abpu)esp.qW(this.b).a(), hup.r(), hup.v(), hxp.o(), (skt)esp.qH(this.b).a());
            }
            case 1457: {
                return idj.t((Context)esp.oz(this.b).a(), (abpq)esp.ka(this.b).a(), (ghb)esp.il(this.b).a(), (gpo)esp.gu(this.b).a(), (skt)esp.qH(this.b).a(), (acvy)esp.mz(this.b).a(), (wyv)esp.ow(this.b).a(), (tjm)eqy.ib(this.a).a(), (fjv)esp.ra(this.b).a(), (fmr)eqy.lE(this.a).a(), (elx)esp.gi(this.b).a(), (lhs)esp.nU(this.b).a(), (tgd)eqy.jn(this.a).a(), (abpu)esp.qW(this.b).a(), eqy.zP(this.a));
            }
            case 1456: {
                final esp b5 = this.b;
                return fmf.i(esp.rl(b5), esp.tN(b5), esp.ka(b5));
            }
            case 1455: {
                return new MinimizedPlaybackPolicyController((tgd)eqy.jn(this.a).a(), (fjv)esp.ra(this.b).a(), (vcy)esp.oW(this.b).a(), (kuh)esp.wn(this.b).a(), (abpq)esp.ka(this.b).a());
            }
            case 1454: {
                return iby.c((Context)eqy.ps(this.a).a(), (acwb)esp.ry(this.b).a(), (lag)esp.kf(this.b).a(), (xnt)eqy.mi(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 1453: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final acvy acvy = (acvy)esp.mz(this.b).a();
                final xnt xnt = (xnt)eqy.mi(this.a).a();
                final cl cl = (cl)esp.rK(this.b).a();
                final SharedPreferences sharedPreferences = (SharedPreferences)eqy.sp(this.a).a();
                final abpu abpu = (abpu)eqy.kg(this.a).a();
                final cck cck = (cck)eqy.qU(this.a).a();
                final xip xip = (xip)eqy.lx(this.a).a();
                final eqy a = this.a;
                return iby.b(activity, acvy, xnt, cl, sharedPreferences, abpu, cck, xip, eqy.pn(a), (oby)eqy.gH(a).a(), (zmf)eqy.pK(this.a).a(), (xhy)eqy.tP(this.a).a(), (wyv)esp.ow(this.b).a(), (fjv)esp.ra(this.b).a());
            }
            case 1452: {
                return hzk.t((gbp)esp.mz(this.b).a(), (Context)esp.oz(this.b).a(), (xhy)eqy.tP(this.a).a(), (xhv)eqy.mq(this.a).a(), (wyv)esp.ow(this.b).a(), (aeea)eqy.mj(this.a).a(), (liq)esp.nd(this.b).a(), (xnt)eqy.mi(this.a).a(), (xfl)era.am(eqy.r(this.a)).a(), (xnj)eqy.hW(this.a).a(), (abpu)esp.qW(this.b).a(), (vcy)esp.oW(this.b).a(), (ggr)esp.qL(this.b).a());
            }
            case 1451: {
                final esp b6 = this.b;
                final FullscreenEngagementViewPresenter b7 = jbu.b((jbt)esp.jO(b6).a(), (abho)esp.gz(this.b).a(), (etx)eqy.jZ(this.a).a(), (abpu)esp.qW(this.b).a());
                esp.xj(b6, b7);
                return b7;
            }
            case 1450: {
                return eoy.i((rqo)eqy.kF(this.a).a(), (rqn)esp.ww(this.b).a());
            }
            case 1449: {
                final xlx xlx = (xlx)era.cM(eqy.r(this.a)).a();
                final esp b8 = this.b;
                return new ControlsOverlayAlwaysShownController(xlx, esp.qy(b8), (iur)esp.wA(b8).a());
            }
            case 1448: {
                return gcn.g((gfe)esp.kE(this.b).a());
            }
            case 1447: {
                return fqs.h((iri)esp.ip(this.b).a(), (fjv)esp.ra(this.b).a(), (gfc)esp.kD(this.b).a(), (lif)esp.ne(this.b).a());
            }
            case 1446: {
                return ggm.d((asht)esp.ot(this.b).a(), (tpz)esp.pr(this.b).a(), eqy.tf(this.a));
            }
            case 1445: {
                return ewu.l((Activity)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), arlr.b(esp.oW(this.b)), arlr.b(esp.ox(this.b)), arlr.b(esp.ra(this.b)), arlr.b(esp.ka(this.b)), arlr.b(era.by(eqy.r(this.a))), (abpu)eqy.kg(this.a).a(), arlr.b(esp.nd(this.b)), arlr.b(esp.sj(this.b)), arlr.b(esp.iE(this.b)), (asid)eqy.fU(this.a).a(), (asid)eqy.fJ(this.a).a(), (Executor)eqy.oN(this.a).a(), (gmx)era.aR(eqy.r(this.a)).a(), (vai)eqy.lg(this.a).a(), arlr.b(eqy.mB(this.a)), (tmx)eqy.pR(this.a).a(), arlr.b(esp.tc(this.b)), arlr.b(esp.iW(this.b)));
            }
            case 1444: {
                return ewu.m((Activity)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), arlr.b(esp.oW(this.b)), arlr.b(esp.ox(this.b)), arlr.b(esp.ra(this.b)), arlr.b(esp.ka(this.b)), arlr.b(era.by(eqy.r(this.a))), (abpu)eqy.kg(this.a).a(), arlr.b(esp.nd(this.b)), arlr.b(esp.sj(this.b)), arlr.b(esp.iE(this.b)), (asid)eqy.fU(this.a).a(), (asid)eqy.fJ(this.a).a(), (Executor)eqy.oN(this.a).a(), (YoutubeTimeTimerController)esp.wN(this.b).a(), (vai)eqy.lu(this.a).a(), arlr.b(eqy.mB(this.a)), arlr.b(esp.tc(this.b)), arlr.b(esp.iW(this.b)));
            }
            case 1443: {
                final lnu lnu = (lnu)eqy.vX(this.a).a();
                final lny lny = (lny)era.fP(eqy.r(this.a)).a();
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final skt skt = (skt)esp.qH(this.b).a();
                final eqy a2 = this.a;
                final atke kf = eqy.kf(a2);
                final esp b9 = this.b;
                return lnc.o(lnu, lny, vaf, tgd, skt, kf, esp.ka(b9), esp.qW(b9), (vai)eqy.lu(a2).a(), (msr)esp.ox(this.b).a(), (vlf)eqy.fm(this.a).a());
            }
            case 1442: {
                return wji.l((bu)esp.pI(this.b).a(), (tmx)era.dv(eqy.r(this.a)).a(), (abkn)eqy.lm(this.a).a());
            }
            case 1441: {
                final esp b10 = this.b;
                return ixz.r(esp.ry(b10), (Context)esp.oz(b10).a(), (uve)esp.sj(this.b).a(), (jet)esp.qs(this.b).a(), (ouf)esp.hm(this.b).a(), (aazo)esp.jZ(this.b).a(), (jdn)esp.iw(this.b).a(), (jcf)esp.mm(this.b).a(), (abap)esp.uL(this.b).a(), (wxx)eqy.tf(this.a).a());
            }
            case 1440: {
                return hup.t((Context)esp.oz(this.b).a(), (asid)eqy.fU(this.a).a(), (gbu)esp.ry(this.b).a(), (vdr)eqy.kE(this.a).a(), (vcy)esp.oW(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 1439: {
                return new jac((bu)esp.pI(this.b).a(), (bx)era.W(eqy.r(this.a)).a(), era.hd(eqy.r(this.a)), (vaf)eqy.pn(this.a).a(), (abpu)esp.qW(this.b).a(), (acvy)esp.mz(this.b).a(), (oby)eqy.gH(this.a).a(), (wyw)esp.qg(this.b).a(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1438: {
                return jbu.e();
            }
            case 1437: {
                return jbu.f((wxx)eqy.tf(this.a).a(), (abap)esp.uL(this.b).a(), (abpu)esp.qW(this.b).a(), (abdx)esp.ws(this.b).a(), (jci)esp.hp(this.b).a());
            }
            case 1436: {
                final fpj c2 = fpi.c((abap)esp.uL(this.b).a());
                esp.bz((Object)c2);
                return c2;
            }
            case 1435: {
                final Object eb = esp.eB(this.b);
                final Object a3 = esp.kI(this.b).a();
                final gkx gkx = (gkx)eqy.hv(this.a).a();
                return fpi.b(eb, a3);
            }
            case 1434: {
                final fph fph = (fph)esp.kH(this.b).a();
                final vai vai = (vai)eqy.wc(this.a).a();
                final msr msr = (msr)esp.ox(this.b).a();
                final Context context = (Context)esp.oz(this.b).a();
                return fpi.s(fph, vai, msr);
            }
            case 1433: {
                return jpw.b((vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (tmx)eqy.pR(this.a).a(), (tmx)eqy.qZ(this.a).a(), (tjm)eqy.ib(this.a).a(), (ashi)eqy.pq(this.a).a(), eqy.xG(this.a), (vai)eqy.lg(this.a).a(), (asid)eqy.fS(this.a).a(), (Executor)eqy.oN(this.a).a(), (aapa)eqy.pF(this.a).a());
            }
            case 1432: {
                return afft.x((Object)esp.dj(this.b), (Object)esp.do(this.b), (Object)esp.da(this.b), (Object)esp.de(this.b), (Object)esp.dC(this.b), (Object)esp.dB(this.b), (Object[])new thp[] { esp.dy(this.b), esp.dz(this.b), esp.dr(this.b), esp.dp(this.b), esp.dv(this.b), esp.dm(this.b), esp.du(this.b), esp.dn(this.b), esp.dw(this.b), esp.dx(this.b), esp.ds(this.b), esp.dA(this.b), esp.dt(this.b), esp.dg(this.b), esp.dc(this.b), esp.cZ(this.b), esp.dh(this.b), esp.db(this.b), esp.dl(this.b), esp.dk(this.b), esp.di(this.b), esp.cY(this.b), esp.cX(this.b), esp.df(this.b), esp.dd(this.b), esp.dq(this.b), lmb.k(), (thp)esp.gb(this.b).a(), (thp)esp.vN(this.b).a(), (thp)esp.gr(this.b).a(), (thp)esp.hv(this.b).a(), (thp)esp.lV(this.b).a(), (thp)esp.oh(this.b).a(), (thp)esp.hK(this.b).a(), (thp)esp.pc(this.b).a(), (thp)esp.hX(this.b).a(), (thp)esp.ie(this.b).a(), (thp)esp.it(this.b).a(), (thp)eqy.jD(this.a).a(), (thp)esp.jN(this.b).a(), (thp)esp.dY(this.b), (thp)esp.ib(this.b).a(), (thp)esp.kC(this.b).a(), (thp)esp.lR(this.b).a(), (thp)eqy.lj(this.a).a(), (thp)eqy.lk(this.a).a(), (thp)esp.lT(this.b).a(), (thp)esp.ms(this.b).a(), (thp)era.cf(eqy.r(this.a)).a(), (thp)esp.cw(this.b), (thp)esp.qv(this.b).a(), (thp)esp.mq(this.b).a(), (thp)esp.cB(this.b), (thp)esp.cx(this.b), (thp)esp.mw(this.b).a(), (thp)esp.mB(this.b).a(), (thp)esp.mN(this.b).a(), (thp)esp.mP(this.b).a(), (thp)esp.mT(this.b).a(), (thp)(isy)esp.nf(this.b).a(), (thp)esp.op(this.b).a(), (thp)esp.np(this.b).a(), (thp)esp.nq(this.b).a(), (thp)esp.tZ(this.b).a(), (thp)esp.nM(this.b).a(), (thp)esp.nR(this.b).a(), (thp)esp.nT(this.b).a(), (thp)esp.od(this.b).a(), (thp)esp.om(this.b).a(), (thp)esp.uT(this.b).a(), (thp)esp.tx(this.b).a(), (thp)esp.iv(this.b).a(), (thp)era.fb(eqy.r(this.a)).a(), (thp)esp.uC(this.b).a(), (thp)esp.uO(this.b).a(), (thp)esp.uP(this.b).a(), (thp)esp.vo(this.b).a(), (thp)esp.vY(this.b).a(), (thp)era.fG(eqy.r(this.a)).a(), (thp)esp.vS(this.b).a(), (thp)eqy.wf(this.a).a(), (thp)esp.jP(this.b).a(), (thp)esp.jE(this.b).a(), (thp)esp.wA(this.b).a(), (thp)esp.mu(this.b).a(), (thp)esp.wD(this.b).a(), (thp)esp.nj(this.b).a(), (thp)esp.gO(this.b).a(), (thp)esp.uq(this.b).a(), (thp)esp.cm(this.b), (thp)esp.mM(this.b).a(), (thp)esp.nH(this.b).a(), (thp)esp.vE(this.b).a(), (thp)esp.lW(this.b).a(), (thp)era.bo(eqy.r(this.a)).a(), (thp)esp.vb(this.b).a(), (thp)esp.ho(this.b).a(), (thp)esp.vJ(this.b).a(), (thp)esp.hi(this.b).a(), (thp)(ite)esp.tS(this.b).a(), (thp)esp.tT(this.b).a(), (thp)esp.vB(this.b).a(), (thp)esp.kR(this.b).a(), (thp)esp.vj(this.b).a(), (thp)esp.mV(this.b).a(), (thp)esp.uG(this.b).a(), (thp)(abaz)esp.uK(this.b).a(), (thp)esp.tR(this.b).a(), (thp)esp.gc(this.b).a(), (thp)esp.nx(this.b).a(), (thp)esp.kA(this.b).a(), (thp)esp.iy(this.b).a(), (thp)esp.og(this.b).a(), (thp)eqy.mf(this.a).a(), (thp)esp.ko(this.b).a(), (thp)esp.ed(this.b), (thp)esp.tv(this.b).a(), (thp)esp.cH(this.b), (thp)esp.pZ(this.b).a(), (thp)esp.tH(this.b).a(), (thp)esp.tP(this.b).a(), (thp)esp.iq(this.b).a() });
            }
            case 1431: {
                return afft.p((Collection)esp.fM(this.b));
            }
            case 1430: {
                return thm.b((toj)eqy.uG(this.a).a());
            }
            case 1429: {
                return eoy.o((vgy)eqy.hO(this.a).a(), (wyw)esp.qg(this.b).a());
            }
            case 1428: {
                return lmb.c((InlinePlaybackLifecycleController)esp.kC(this.b).a(), (tol)eqy.uH(this.a).a(), (vaf)eqy.pn(this.a).a());
            }
            case 1427: {
                final esp b11 = this.b;
                final YouTubeInfoCardOverlayPresenter g = isz.g((Context)esp.oz(b11).a(), (uyu)esp.pU(this.b).a(), (tqf)esp.ia(this.b).a(), (uyy)esp.pW(this.b).a(), (uyx)era.ds(eqy.r(this.a)).a(), (skc)eqy.hr(this.a).a(), (aazi)esp.wE(this.b).a(), (tgd)eqy.jn(this.a).a());
                esp.xx(b11, g);
                return g;
            }
            case 1426: {
                return new NfcHelper((Activity)esp.oz(this.b).a(), (Executor)eqy.fT(this.a).a(), esp.ka(this.b));
            }
            case 1425: {
                final xri xri = (xri)esp.gQ(this.b).a();
                final xrd xrd = (xrd)era.cK(eqy.r(this.a)).a();
                final xqx s2 = era.s(eqy.r(this.a));
                final xrm xrm = (xrm)esp.gR(this.b).a();
                final eqy a4 = this.a;
                final atke dd = era.dd(eqy.r(a4));
                final atke da = era.dA(eqy.r(a4));
                final pzi pzi = (pzi)era.dp(eqy.r(a4)).a();
                final wyw wyw = (wyw)eqy.hP(this.a).a();
                final oby oby = (oby)eqy.gH(this.a).a();
                return xqp.c(xri, xrd, s2, xrm, dd, da, pzi, wyw, (tgd)eqy.jn(this.a).a());
            }
            case 1424: {
                return hzk.j((bu)esp.pI(this.b).a(), (xri)esp.gQ(this.b).a(), (xrd)era.cK(eqy.r(this.a)).a(), (SharedPreferences)eqy.sp(this.a).a(), (xbv)eqy.qK(this.a).a(), (oby)eqy.gH(this.a).a(), arlr.b(eqy.pK(this.a)), arlr.b(eqy.ho(this.a)));
            }
            case 1423: {
                final arkg b12 = arlr.b(esp.mo(this.b));
                final arkg b13 = arlr.b(esp.ra(this.b));
                final arkg b14 = arlr.b(esp.jj(this.b));
                final arkg b15 = arlr.b(esp.oF(this.b));
                final arkg b16 = arlr.b(eqy.mi(this.a));
                final arkg b17 = arlr.b(era.eC(eqy.r(this.a)));
                final arkg b18 = arlr.b(esp.oR(this.b));
                final eqy a5 = this.a;
                return hzk.k(b12, b13, b14, b15, b16, b17, b18, era.dy(eqy.r(a5)), arlr.b(eqy.vo(a5)), (Executor)eqy.oN(this.a).a(), (xbt)eqy.jD(this.a).a(), (xfl)era.am(eqy.r(this.a)).a(), arlr.b(eqy.hW(this.a)), arlr.b(eqy.qK(this.a)), arlr.b(esp.ox(this.b)));
            }
            case 1422: {
                return xqp.k((Context)esp.oz(this.b).a(), (acwb)esp.rU(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 1421: {
                final xev xev = (xev)eqy.pY(this.a).a();
                final tgd tgd2 = (tgd)eqy.jn(this.a).a();
                final wxx wxx = (wxx)eqy.tf(this.a).a();
                final String cr = eqy.cR(this.a);
                final riq riq = (riq)eqy.pK(this.a).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                return xqp.f(xev, tgd2, wxx, cr, (xbv)eqy.qK(this.a).a(), era.dx(eqy.r(this.a)), (bu)esp.pI(this.b).a(), (xrm)esp.gR(this.b).a(), (xnt)eqy.mi(this.a).a(), (Executor)eqy.fT(this.a).a(), esp.fW(this.b));
            }
            case 1420: {
                return afft.x((Object)esp.cd(this.b), (Object)esp.cb(this.b), (Object)esp.cc(this.b), (Object)esp.cf(this.b), (Object)esp.ci(this.b), (Object)esp.ch(this.b), (Object[])new aum[] { esp.bZ(this.b), esp.bY(this.b), esp.ce(this.b), esp.bX(this.b), esp.ca(this.b) });
            }
            case 1419: {
                return new InteractionLoggingOverlayController$Observer(esp.ek(this.b));
            }
            case 1418: {
                final affr i = afft.j(2);
                i.j((Iterable)esp.fO(this.b));
                i.h(esp.eH(this.b));
                return i.g();
            }
            case 1417: {
                return hlb.p((Activity)esp.oz(this.b).a(), (msr)esp.ox(this.b).a(), (tpz)esp.pr(this.b).a(), (ghk)esp.sI(this.b).a(), (asid)eqy.fU(this.a).a(), (pja)era.bf(eqy.r(this.a)).a(), (vai)eqy.wc(this.a).a());
            }
            case 1416: {
                return hlb.r((fzw)eqy.tH(this.a).a(), (fzw)eqy.uP(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 1415: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (boolean[][][])null, (byte[])null, (byte[])null);
            }
            case 1414: {
                return hlb.o((bu)esp.pI(this.b).a(), (tgd)eqy.jn(this.a).a(), (acwb)esp.ry(this.b).a(), esp.xS(this.b), (wyv)esp.ow(this.b).a(), (gbc)esp.oR(this.b).a(), (msr)esp.ox(this.b).a(), (vai)esp.tK(this.b).a());
            }
            case 1413: {
                final wyv wyv = (wyv)esp.ow(this.b).a();
                final esp b19 = this.b;
                return hlk.c(wyv, esp.iR(b19), arlw.c(esp.tm(b19)), (Executor)eqy.fT(this.a).a());
            }
            case 1412: {
                return hdz.u((ccb)eqy.ir(this.a).a(), (avu)eqy.rZ(this.a).a(), (hlq)era.aX(eqy.r(this.a)).a(), (hml)esp.tb(this.b).a());
            }
            case 1411: {
                return afft.x((Object)esp.jk(this.b).a(), (Object)esp.te(this.b).a(), (Object)esp.tg(this.b).a(), (Object)esp.th(this.b).a(), (Object)esp.iy(this.b).a(), (Object)era.bo(eqy.r(this.a)).a(), (Object[])new aum[0]);
            }
            case 1410: {
                return fqs.p((Context)esp.oz(this.b).a(), (otk)eqy.jg(this.a).a(), (YouTubePlayerOverlaysLayout)esp.qZ(this.b).a(), (bhv)esp.wH(this.b).a(), (abpu)esp.qW(this.b).a(), (ixc)esp.mK(this.b).a());
            }
            case 1409: {
                return afft.x((Object)era.fH(eqy.r(this.a)).a(), (Object)esp.bW(this.b), (Object)esp.cg(this.b), (Object)esp.qP(this.b).a(), (Object)esp.nG(this.b).a(), (Object)esp.gC(this.b).a(), (Object[])new aum[] { (aum)esp.lY(this.b).a(), (aum)esp.sO(this.b).a(), (aum)esp.sP(this.b).a() });
            }
            case 1408: {
                final affr k = afft.j(3);
                k.j((Iterable)esp.fL(this.b));
                k.j((Iterable)esp.fK(this.b));
                k.j((Iterable)esp.fP(this.b));
                return k.g();
            }
            case 1407: {
                return thm.e((aun)esp.pI(this.b).a(), arlr.b(esp.gk(this.b)));
            }
            case 1406: {
                return afft.s((Object)era.as(eqy.r(this.a)).a());
            }
            case 1405: {
                final avu avu = (avu)era.eT(eqy.r(this.a)).a();
                final vaf vaf2 = (vaf)eqy.pn(this.a).a();
                final msr msr2 = (msr)esp.ox(this.b).a();
                final eqy a6 = this.a;
                return lmb.u(avu, vaf2, msr2, eqy.jd(a6), eqy.kr(a6));
            }
            case 1404: {
                return lmb.f((wxx)eqy.tf(this.a).a());
            }
            case 1403: {
                return lmb.l(esp.ug(this.b), (vaf)eqy.pn(this.a).a());
            }
            case 1402: {
                return lmb.t((tgd)eqy.jn(this.a).a(), (ewp)eqy.uE(this.a).a(), (avu)era.eT(eqy.r(this.a)).a(), (lmj)esp.rA(this.b).a(), (vaf)eqy.pn(this.a).a(), (lmo)esp.we(this.b).a());
            }
            case 1401: {
                return afft.s((Object)lmb.i());
            }
            case 1400: {
                return afft.s((Object)lmb.j());
            }
        }
    }
    
    private final Object i() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 1599: {
                final esp b = this.b;
                return new eg(esp.oz(b), esp.ui(b), esp.uk(b));
            }
            case 1598: {
                final esp b2 = this.b;
                final atke oz = esp.oz(b2);
                final eqy a = this.a;
                return kan.m(oz, eqy.kr(a), eqy.kK(a), esp.oW(b2), esp.pj(b2), esp.gD(b2), esp.kB(b2), esp.kK(b2), esp.uj(b2), esp.kM(b2), esp.nm(b2), esp.oS(b2), esp.mJ(b2), esp.ue(b2), eqy.vx(a));
            }
            case 1597: {
                return new fex();
            }
            case 1596: {
                final esp b3 = this.b;
                final atke oz2 = esp.oz(b3);
                final atke kx = esp.kX(b3);
                final atke kc = esp.kC(b3);
                final atke ga = esp.ga(b3);
                final atke kx2 = esp.kx(b3);
                final eqy a2 = this.a;
                return new lmo(oz2, kx, kc, ga, kx2, eqy.qn(a2), eqy.vx(a2), esp.qd(b3), (byte[])null);
            }
            case 1595: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                return new hzn((xnt)eqy.mi(this.a).a());
            }
            case 1594: {
                return wxn.s();
            }
            case 1593: {
                return wxn.s();
            }
            case 1592: {
                final bu bu = (bu)esp.pI(this.b).a();
                final vgo vgo = (vgo)era.dB(eqy.r(this.a)).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final acpk acpk = (acpk)eqy.kK(this.a).a();
                final vai vai = (vai)eqy.lz(this.a).a();
                return ini.v(bu, vgo, vcy, acpk, arlr.b(esp.iS(this.b)), (acbm)esp.iR(this.b).a(), (aeea)esp.iE(this.b).a());
            }
            case 1591: {
                return ini.r((qcy)esp.nl(this.b).a(), (qcy)esp.iJ(this.b).a(), (flv)eqy.fM(this.a).a());
            }
            case 1590: {
                return wxn.s();
            }
            case 1589: {
                return new sqq((Handler)eqy.sJ(this.a).a());
            }
            case 1588: {
                final esp b4 = this.b;
                return new hyx(esp.oz(b4), esp.pR(b4), esp.hd(b4), esp.sD(b4), null, null, (char[])null);
            }
            case 1587: {
                return eyv.t((Activity)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (sir)eqy.eN(this.a).a(), (fxc)esp.hc(this.b).a(), (hwn)esp.ui(this.b).a(), (hyx)esp.uc(this.b).a(), (hyx)esp.uk(this.b).a(), esp.Ab(this.b), era.eE(eqy.r(this.a)).a(), (fzw)eqy.tH(this.a).a(), (eg)esp.tf(this.b).a(), (acvw)esp.pR(this.b).a(), (ziy)esp.uA(this.b).a());
            }
            case 1586: {
                return new jfv(esp.hf(this.b), 1);
            }
            case 1585: {
                return new etc((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), 0);
            }
            case 1584: {
                return wxn.s();
            }
            case 1583: {
                return ljh.t((Context)esp.oz(this.b).a(), (vaf)eqy.pn(this.a).a(), (fxw)esp.gn(this.b).a(), (acid)eqy.oe(this.a).a());
            }
            case 1582: {
                return hlb.g((Context)esp.ut(this.b).a(), (gjh)esp.kX(this.b).a(), (acps)esp.pk(this.b).a());
            }
            case 1581: {
                final esp b5 = this.b;
                final atke oz3 = esp.oz(b5);
                final eqy a3 = this.a;
                return new exs(oz3, eqy.fD(a3), eqy.qn(a3), eqy.uW(a3), eqy.sY(a3), esp.kX(b5), esp.mZ(b5), eqy.fU(a3), eqy.mB(a3));
            }
            case 1580: {
                return acfd.p((acid)esp.tJ(this.b).a());
            }
            case 1579: {
                final Context context = (Context)esp.oz(this.b).a();
                final esp b6 = this.b;
                return kxz.n(context, esp.pk(b6), (ipd)esp.lZ(b6).a(), esp.yE(this.b), (oug)era.db(eqy.r(this.a)).a());
            }
            case 1578: {
                final esp b7 = this.b;
                return new ziy(esp.oz(b7), esp.lX(b7), eqy.pn(this.a), esp.sM(b7), esp.uZ(b7), (char[])null, (byte[])null);
            }
            case 1577: {
                return kvu.q(esp.yq(this.b));
            }
            case 1576: {
                return new aeea((byte[])null, (byte[])null, (byte[])null, (char[])null, (byte[])null);
            }
            case 1575: {
                return ulu.o((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (Handler)eqy.sJ(this.a).a(), (elx)esp.sX(this.b).a());
            }
            case 1574: {
                return new vzq();
            }
            case 1573: {
                final Context context2 = (Context)eqy.ps(this.a).a();
                final wbs wbs = (wbs)era.bO(eqy.r(this.a)).a();
                final xrm xrm = (xrm)era.bS(eqy.r(this.a)).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final esp b8 = this.b;
                return vvq.i(context2, wbs, xrm, tgd, esp.qn(b8), esp.lf(b8), esp.lc(b8), esp.lG(b8), esp.lh(b8), esp.lk(b8), (xib)esp.lo(b8).a());
            }
            case 1572: {
                return lio.g((gkv)esp.oN(this.b).a());
            }
            case 1571: {
                return new wbu((wbt)esp.qq(this.b).a());
            }
            case 1570: {
                return adca.o(esp.pF(this.b).a());
            }
            case 1569: {
                return fqs.l(arlr.b(esp.hP(this.b)));
            }
            case 1568: {
                return fqs.k(arlr.b(esp.uV(this.b)));
            }
            case 1567: {
                return acfd.l(arlr.b(esp.jm(this.b)));
            }
            case 1566: {
                return acfd.l(arlr.b(esp.jm(this.b)));
            }
            case 1565: {
                return acfd.l(arlr.b(esp.jm(this.b)));
            }
            case 1564: {
                return new acmg();
            }
            case 1563: {
                return new acml();
            }
            case 1562: {
                return new acmj();
            }
            case 1561: {
                return new aclw((byte[])null);
            }
            case 1560: {
                final esp b9 = this.b;
                return acfd.o(esp.jl(b9), esp.jm(b9), esp.uV(b9), esp.hP(b9), (Map)afev.l(), esp.fw(b9), esp.fv(this.b), esp.fC(this.b));
            }
            case 1559: {
                return lnc.d();
            }
            case 1558: {
                return lnc.m((arwh)eqy.qn(this.a).a());
            }
            case 1557: {
                return lnc.g((WebViewFallbackActivity)esp.sv(this.b).a());
            }
            case 1556: {
                final Object a4 = esp.su(this.b).a();
                final esp b10 = this.b;
                return lnc.j(a4, esp.sW(b10), esp.jH(b10));
            }
            case 1555: {
                return lmb.m(esp.bS(this.b));
            }
            case 1554: {
                return lmb.n(esp.bQ(this.b));
            }
            case 1553: {
                return lnc.h((Activity)esp.oz(this.b).a());
            }
            case 1552: {
                return lmb.s(arlr.b(esp.mt(this.b)), (vaf)eqy.pn(this.a).a(), (faq)esp.sA(this.b).a(), (StartupSignalStream)esp.uh(this.b).a(), (msr)esp.ox(this.b).a(), (SharedPreferences)eqy.sp(this.a).a());
            }
            case 1551: {
                return lmb.v((lmf)esp.uh(this.b).a(), (vaf)eqy.pn(this.a).a(), (msr)esp.ox(this.b).a(), (asid)eqy.fU(this.a).a());
            }
            case 1550: {
                return eyv.l();
            }
            case 1549: {
                return ewu.h((Activity)esp.oz(this.b).a(), (vaf)eqy.pn(this.a).a(), (wyv)esp.ow(this.b).a(), arlr.b(esp.oW(this.b)), era.aM(eqy.r(this.a)), arlr.b(esp.ox(this.b)), arlr.b(esp.ra(this.b)), arlr.b(esp.ka(this.b)), arlr.b(era.by(eqy.r(this.a))), (abpu)eqy.kg(this.a).a(), arlr.b(esp.nd(this.b)), arlr.b(esp.sj(this.b)), arlr.b(esp.iE(this.b)), (asid)eqy.fU(this.a).a(), (asid)eqy.fJ(this.a).a(), (Executor)eqy.oN(this.a).a(), arlr.b(eqy.mB(this.a)), arlr.b(esp.tc(this.b)), (vai)eqy.lu(this.a).a(), arlr.b(esp.iW(this.b)));
            }
            case 1548: {
                return lio.c((wyv)esp.ow(this.b).a());
            }
            case 1547: {
                return new jtc((bu)esp.pI(this.b).a(), (gbu)esp.ry(this.b).a(), (gkx)eqy.hv(this.a).a(), (tmx)eqy.ox(this.a).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 1546: {
                final WatchWhileActivity cn = esp.cN(this.b);
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                final gbu gbu = (gbu)esp.ry(this.b).a();
                final fxw fxw = (fxw)esp.gn(this.b).a();
                final gkx gkx = (gkx)eqy.hv(this.a).a();
                final wyv wyv = (wyv)esp.ow(this.b).a();
                return ljl.j(cn, vaf, gbu, fxw, gkx, (tmx)eqy.ox(this.a).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 1545: {
                return lkh.k((vaf)eqy.pn(this.a).a(), (acwb)esp.ry(this.b).a(), (fzw)era.eH(eqy.r(this.a)).a(), (oby)eqy.gH(this.a).a(), (wxx)eqy.tf(this.a).a(), (fvx)era.dM(eqy.r(this.a)).a(), (tgd)eqy.jn(this.a).a(), (bu)esp.pI(this.b).a());
            }
            case 1544: {
                return iey.r((bu)esp.pI(this.b).a(), (acwb)esp.rU(this.b).a(), (aln)eqy.np(this.a).a(), (vai)eqy.lz(this.a).a());
            }
            case 1543: {
                final fa fa = (fa)esp.oF(this.b).a();
                final tgd tgd2 = (tgd)eqy.jn(this.a).a();
                final atke qh = esp.qH(this.b);
                final tqn tqn = (tqn)eqy.fh(this.a).a();
                final irg irg = (irg)esp.tZ(this.b).a();
                final atke nn = esp.nn(this.b);
                final eqy a5 = this.a;
                final atke cn2 = era.cn(eqy.r(a5));
                final atke cl = era.cl(eqy.r(a5));
                final atke fe = era.fe(eqy.r(a5));
                final blu blu = (blu)era.cq(eqy.r(a5)).a();
                final eqy a6 = this.a;
                return lkh.o(fa, tgd2, qh, tqn, irg, nn, cn2, cl, fe, blu, era.df(eqy.r(a6)), eqy.iU(a6), (wyv)esp.ow(this.b).a());
            }
            case 1542: {
                return new lkw((fa)esp.oF(this.b).a(), (mdp)era.cI(eqy.r(this.a)).a(), eqy.qB(this.a), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1541: {
                final Activity activity2 = (Activity)esp.oz(this.b).a();
                final ghb ghb = (ghb)esp.il(this.b).a();
                final fjv fjv = (fjv)esp.ra(this.b).a();
                final kcq kcq = (kcq)esp.rz(this.b).a();
                final esp b11 = this.b;
                return lkh.n(activity2, ghb, fjv, kcq, esp.rM(b11), (hzn)esp.mx(b11).a(), (msr)esp.ox(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 1540: {
                return fuu.d((tjb)eqy.oQ(this.a).a(), eqy.qQ(this.a));
            }
            case 1539: {
                return new fxq((wxx)eqy.tf(this.a).a(), esp.zM(this.b), (Handler)eqy.sJ(this.a).a(), (acvy)esp.mz(this.b).a(), (fxs)esp.tl(this.b).a(), (xev)eqy.pY(this.a).a(), esp.dN(this.b), (bu)esp.pI(this.b).a(), (Executor)eqy.fT(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1538: {
                return new jsn((Activity)esp.oz(this.b).a(), (tqd)eqy.qe(this.a).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1537: {
                final bu bu2 = (bu)esp.pI(this.b).a();
                final abzv abzv = (abzv)eqy.vP(this.a).a();
                final esp b12 = this.b;
                return new lkx(bu2, abzv, esp.ve(b12), esp.xV(b12), (wyw)esp.qg(this.b).a(), (byte[])null);
            }
            case 1536: {
                final Context context3 = (Context)esp.oz(this.b).a();
                final acvy acvy = (acvy)esp.mz(this.b).a();
                final esp b13 = this.b;
                return new jwo(context3, acvy, esp.ka(b13), (abpu)esp.qW(b13).a(), (tmx)era.dV(eqy.r(this.a)).a(), (aun)esp.pI(this.b).a());
            }
            case 1535: {
                final faq faq = (faq)esp.sA(this.b).a();
                final vlf vlf = (vlf)eqy.fm(this.a).a();
                final eqy a7 = this.a;
                final atke kr = eqy.kr(a7);
                final vaf vaf2 = (vaf)eqy.pn(a7).a();
                final eqy a8 = this.a;
                return new jud(faq, vlf, kr, vaf2, eqy.tf(a8), eqy.jL(a8), eqy.ia(a8), (oby)eqy.gH(a8).a(), (byte[])null);
            }
            case 1534: {
                return new lnm((lnu)eqy.vX(this.a).a(), (lnw)era.fD(eqy.r(this.a)).a(), (vaf)eqy.pn(this.a).a(), (tgd)eqy.jn(this.a).a(), (fjv)esp.ra(this.b).a(), (skt)esp.qH(this.b).a(), (xnt)eqy.mi(this.a).a(), (ghv)esp.wb(this.b).a(), (liq)esp.nd(this.b).a(), (abpq)esp.ka(this.b).a(), (vcy)esp.oW(this.b).a(), (Handler)eqy.sJ(this.a).a(), (asid)eqy.fU(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 1533: {
                return new lnv((vaf)eqy.pn(this.a).a(), (vai)eqy.lu(this.a).a(), (lnu)eqy.vX(this.a).a(), esp.ef(this.b), arlr.b(esp.vq(this.b)), arlr.b(era.fC(eqy.r(this.a))), (asid)eqy.fU(this.a).a());
            }
            case 1532: {
                return new aln((Context)esp.oz(this.b).a(), esp.ef(this.b), (acwb)esp.rU(this.b).a());
            }
            case 1531: {
                return new jso((acwb)esp.rU(this.b).a(), esp.xM(this.b), esp.xS(this.b), esp.zm(this.b), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 1530: {
                return knh.m((kni)esp.sC(this.b).a());
            }
            case 1529: {
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final quc quc = (quc)eqy.eq(this.a).a();
                return xeb.k(zmf, (xdx)eqy.qP(this.a).a(), (cl)esp.rK(this.b).a(), era.cR(eqy.r(this.a)), Optional.empty(), era.dw(eqy.r(this.a)));
            }
            case 1528: {
                return new bx((ghb)esp.il(this.b).a());
            }
            case 1527: {
                return new hzm();
            }
            case 1526: {
                return gqz.o((Context)eqy.ps(this.a).a(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 1525: {
                final mcb mcb = (mcb)eqy.fI(this.a).a();
                final xao xao = (xao)eqy.hS(this.a).a();
                final Executor executor = (Executor)eqy.ge(this.a).a();
                final SecureRandom secureRandom = (SecureRandom)eqy.rV(this.a).a();
                final eqy a9 = this.a;
                return gqz.u(mcb, xao, executor, secureRandom, era.bs(eqy.r(a9)), (cyb)eqy.jr(a9).a(), (oby)eqy.gH(this.a).a());
            }
            case 1524: {
                return gqz.r((grq)esp.hs(this.b).a(), esp.co(this.b), (cyb)eqy.jr(this.a).a());
            }
            case 1523: {
                return ljm.f((ViewGroup)esp.qF(this.b).a());
            }
            case 1522: {
                return hlb.f();
            }
            case 1521: {
                return gvs.c();
            }
            case 1520: {
                return ljh.r((Activity)esp.oz(this.b).a(), esp.fp(this.b));
            }
            case 1519: {
                return idj.u((skt)esp.qH(this.b).a(), (ghb)esp.il(this.b).a(), eqy.lE(this.a), hup.r(), hup.v(), hxp.o());
            }
            case 1518: {
                return lio.j((gkv)esp.oN(this.b).a());
            }
            case 1517: {
                return knk.r((jki)esp.rV(this.b).a());
            }
            case 1516: {
                return knk.c((bu)esp.pI(this.b).a(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 1515: {
                return knh.h((kni)esp.pl(this.b).a());
            }
            case 1514: {
                return knh.l((kni)esp.sC(this.b).a());
            }
            case 1513: {
                final eqy a10 = this.a;
                final esp b14 = this.b;
                return knh.u(new mcb(a10, b14, (byte[])null), (Context)esp.us(b14).a());
            }
            case 1512: {
                return knh.n((kni)esp.sC(this.b).a());
            }
            case 1511: {
                return jpw.i((msr)esp.ox(this.b).a(), (Context)eqy.ps(this.a).a(), (aln)eqy.np(this.a).a(), (zmf)eqy.pK(this.a).a(), (gbu)esp.ry(this.b).a(), (asid)eqy.fU(this.a).a(), (vai)eqy.lz(this.a).a());
            }
            case 1510: {
                return jpw.h((fa)esp.oF(this.b).a(), (vaf)eqy.pn(this.a).a(), (tmx)eqy.qZ(this.a).a(), (tmx)eqy.pR(this.a).a(), (tmx)eqy.sX(this.a).a(), (SharedPreferences)eqy.sp(this.a).a(), (gbu)esp.ry(this.b).a(), (asid)eqy.fU(this.a).a(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a(), (msr)esp.ox(this.b).a(), (aln)eqy.np(this.a).a());
            }
            case 1509: {
                return hxp.p((trt)esp.jD(this.b).a(), (ashi)esp.sx(this.b).a(), (arwh)eqy.qn(this.a).a());
            }
            case 1508: {
                return jex.i((Activity)esp.oz(this.b).a());
            }
            case 1507: {
                return jex.t((fa)esp.oF(this.b).a(), (msr)esp.ox(this.b).a(), (ViewGroup)esp.rs(this.b).a(), esp.Al(this.b));
            }
            case 1506: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (short[][][])null, (byte[])null, (byte[])null);
            }
            case 1505: {
                final eqy a11 = this.a;
                return new aln(era.eQ(eqy.r(a11)), era.aY(eqy.r(a11)), eqy.oN(a11), (int[])null);
            }
            case 1504: {
                return actb.t((Executor)eqy.oN(this.a).a());
            }
            case 1503: {
                return new acvg();
            }
            case 1502: {
                final eqy a12 = this.a;
                return new adlp(eqy.pB(a12), eqy.oE(a12), eqy.pt(a12), eqy.pK(a12), eqy.oN(a12), eqy.sJ(a12), eqy.sN(a12));
            }
            case 1501: {
                return new bx((char[])null, (byte[])null, (char[])null);
            }
            case 1500: {
                final eqy a13 = this.a;
                return iey.t(eqy.nt(a13), (Executor)eqy.fT(a13).a(), (e)era.al(eqy.r(this.a)).a());
            }
        }
    }
    
    private final Object j() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 299: {
                return isz.v((bu)esp.pI(this.b).a(), (acwb)esp.ry(this.b).a(), esp.Aq(this.b));
            }
            case 298: {
                return fpi.l((bu)esp.pI(this.b).a());
            }
            case 297: {
                return fpi.m((bu)esp.pI(this.b).a());
            }
            case 296: {
                return fpi.r((Context)esp.ut(this.b).a(), (bu)esp.pI(this.b).a(), (abpq)esp.ka(this.b).a(), (abdk)esp.rH(this.b).a(), (abdk)esp.rF(this.b).a(), (ajb)esp.uo(this.b).a(), esp.cn(this.b), (vai)eqy.wc(this.a).a());
            }
            case 295: {
                return ljm.u((Context)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a(), (itg)esp.kd(this.b).a(), (ajb)esp.uo(this.b).a(), (vaf)eqy.pn(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 294: {
                return ivh.t((iwo)esp.kA(this.b).a(), (iwp)esp.sO(this.b).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (abpu)esp.qW(this.b).a(), esp.wV(this.b), (asid)eqy.fU(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 293: {
                return fpi.j((abpu)esp.qW(this.b).a());
            }
            case 292: {
                return fpi.g((jet)esp.qs(this.b).a());
            }
            case 291: {
                final esp b = this.b;
                return gcn.h(esp.jZ(b), esp.qs(b), (InlinePlaybackLifecycleController)esp.kC(b).a());
            }
            case 290: {
                return fei.t((tgd)eqy.jn(this.a).a(), (arwh)eqy.qn(this.a).a());
            }
            case 289: {
                return kan.r((arwh)eqy.qn(this.a).a(), (vaf)eqy.pn(this.a).a(), eqy.ia(this.a), (InlinePlaybackLifecycleController)esp.kC(this.b).a(), (asid)eqy.fJ(this.a).a(), esp.wW(this.b), (vai)eqy.ky(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 288: {
                return new kaw((Handler)eqy.sJ(this.a).a(), (auda)esp.vi(this.b).a(), (byte[])null, (byte[])null);
            }
            case 287: {
                return ldi.m((vai)eqy.wb(this.a).a());
            }
            case 286: {
                return fei.g((xao)eqy.hS(this.a).a(), (aaxx)eqy.iF(this.a).a(), (lag)esp.kf(this.b).a(), (vai)esp.vZ(this.b).a());
            }
            case 285: {
                final esp b2 = this.b;
                final abpu abpu = (abpu)esp.qW(b2).a();
                final atke ka = esp.ka(this.b);
                final asid asid = (asid)eqy.fU(this.a).a();
                final vai vai = (vai)eqy.gF(this.a).a();
                final vai xu = eqy.xU(this.a);
                final fgt fgt = (fgt)era.fE(eqy.r(this.a)).a();
                final lhs c2 = lgr.c(abpu, ka, asid, vai, xu, (WatchUiActionLatencyLogger)esp.vX(this.b).a());
                esp.xp(b2, c2);
                return c2;
            }
            case 284: {
                final esp b3 = this.b;
                final auda auda = (auda)esp.vi(b3).a();
                final esp b4 = this.b;
                final irk o = ips.o(auda, esp.ka(b4), (fjv)esp.ra(b4).a(), (fjr)esp.nU(this.b).a(), (abpu)esp.qW(this.b).a());
                esp.xd(b3, o);
                return o;
            }
            case 283: {
                return new DefaultInlinePlayerControls((abpq)esp.ka(this.b).a(), (iri)esp.ip(this.b).a(), (fjv)esp.ra(this.b).a(), (tgd)eqy.jn(this.a).a(), (abpu)esp.qW(this.b).a(), (fnt)esp.jU(this.b).a(), (fgt)era.fE(eqy.r(this.a)).a(), (qv)esp.oc(this.b).a(), (abrj)eqy.jt(this.a).a(), (kbn)esp.kK(this.b).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 282: {
                return new kby();
            }
            case 281: {
                return new kbh((geu)esp.kB(this.b).a(), (InlinePlaybackLifecycleController)esp.kC(this.b).a(), (gjl)esp.iv(this.b).a(), (Handler)eqy.sJ(this.a).a());
            }
            case 280: {
                return new kca((fjv)esp.ra(this.b).a(), (InlinePlaybackLifecycleController)esp.kC(this.b).a());
            }
            case 279: {
                final esp b5 = this.b;
                return kan.q(esp.ka(b5), (iri)esp.ip(b5).a(), (vai)esp.vZ(this.b).a(), (msr)esp.ox(this.b).a());
            }
            case 278: {
                return gcn.c((Executor)eqy.fT(this.a).a(), (bu)esp.pI(this.b).a());
            }
            case 277: {
                return kan.o(esp.yh(this.b), (InlinePlaybackLifecycleController)esp.kC(this.b).a(), (ActiveStateLifecycleController)esp.gh(this.b).a(), esp.eC(this.b), (vai)esp.vZ(this.b).a(), (msr)esp.ox(this.b).a());
            }
            case 276: {
                return kan.p((Context)esp.oz(this.b).a(), (msr)esp.ox(this.b).a(), (abpu)esp.qW(this.b).a(), (iri)esp.ip(this.b).a());
            }
            case 275: {
                return ljm.c((fam)esp.wn(this.b).a());
            }
            case 274: {
                final vai vai2 = (vai)eqy.ky(this.a).a();
                final Context context = (Context)esp.oz(this.b).a();
                final msr msr = (msr)esp.ox(this.b).a();
                final esp b6 = this.b;
                return kan.n(vai2, context, msr, esp.sa(b6), (abpu)esp.qW(b6).a(), (iri)esp.ip(this.b).a());
            }
            case 273: {
                final vai vai3 = (vai)era.bD(eqy.r(this.a)).a();
                final esp b7 = this.b;
                return ljk.m(vai3, esp.ic(b7), esp.nz(b7));
            }
            case 272: {
                return new DefaultScrollSelectionController(esp.wW(this.b), (vaf)eqy.pn(this.a).a());
            }
            case 271: {
                final esp b8 = this.b;
                final atke iv = esp.iv(b8);
                final arkg b9 = arlr.b(esp.kB(b8));
                final atke ki = eqy.kI(this.a);
                final esp b10 = this.b;
                final atke vi = esp.vi(b10);
                final atke nd = esp.nd(b10);
                final atke ra = esp.ra(b10);
                final atke px = esp.pX(b10);
                final InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController)esp.kC(b10).a();
                final esp b11 = this.b;
                final atke kk = esp.kK(b11);
                final atke oi = esp.oi(b11);
                final atke kv = esp.kv(b11);
                final atke kl = esp.kL(b11);
                final atke ie = esp.ie(b11);
                final arkg b12 = arlr.b(esp.ix(b11));
                final atke gd = esp.gD(this.b);
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final eqy a = this.a;
                final atke lw = eqy.lw(a);
                final esp b13 = this.b;
                return new InlinePlaybackController(iv, b9, ki, vi, nd, ra, px, inlinePlaybackLifecycleController, kk, oi, kv, kl, ie, b12, gd, arwh, lw, esp.iM(b13), esp.kw(b13), esp.jU(b13), esp.lV(b13), eqy.kH(a), esp.oW(b13), esp.ow(b13), eqy.kx(a), esp.kz(b13), (vai)eqy.uY(a).a(), esp.uf(this.b), (tok)eqy.po(this.a).a(), esp.gt(this.b), (byte[])null, (byte[])null);
            }
            case 270: {
                final esp b14 = this.b;
                final Context context2 = (Context)esp.oz(b14).a();
                final esp b15 = this.b;
                final InteractiveInlineMutedControlsOverlay r = ivh.r(context2, esp.qb(b15), (InlinePlaybackController)esp.kA(b15).a(), (arwh)eqy.qn(this.a).a(), (SubtitleButtonController)esp.sO(this.b).a(), (wyv)esp.ow(this.b).a(), (abuj)esp.kc(this.b).a(), (ViewGroup)esp.st(this.b).a(), (ViewGroup)esp.qa(this.b).a(), (abpu)esp.qW(this.b).a(), (kbm)eqy.kJ(this.a).a(), (wxx)eqy.tf(this.a).a(), esp.cB(this.b), (vai)eqy.ky(this.a).a(), (skc)eqy.hr(this.a).a(), (kcq)esp.rz(this.b).a(), (jco)esp.kF(this.b).a());
                esp.xk(b14, r);
                return r;
            }
            case 269: {
                return ixx.r((Context)esp.oz(this.b).a());
            }
            case 268: {
                return new ixk((Context)esp.oz(this.b).a());
            }
            case 267: {
                final esp b16 = this.b;
                final DefaultInlineMutedControlsOverlay l = isz.l((Context)esp.oz(b16).a(), (abdr)esp.ni(this.b).a(), esp.qb(this.b));
                esp.xc(b16, l);
                return l;
            }
            case 266: {
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                final esp b17 = this.b;
                return ixx.p(vaf, esp.id(b17), esp.kN(b17));
            }
            case 265: {
                return kxz.e();
            }
            case 264: {
                final kwi kwi = (kwi)esp.jM(this.b).a();
                final lac lac = (lac)esp.vH(this.b).a();
                final esp b18 = this.b;
                return kxz.k(kwi, lac, esp.nb(b18), (abty)esp.qR(b18).a(), (fjv)esp.ra(this.b).a());
            }
            case 263: {
                final jcp s = jbu.s((Context)esp.oz(this.b).a(), (jdu)esp.vk(this.b).a(), (arwh)eqy.qn(this.a).a(), (abho)esp.gz(this.b).a(), eqy.fU(this.a), (msr)esp.ox(this.b).a());
                esp.bK(s);
                return s;
            }
            case 262: {
                return ixx.g((Context)esp.oz(this.b).a());
            }
            case 261: {
                return ivh.n((Context)esp.oz(this.b).a());
            }
            case 260: {
                return ixz.t((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (auda)esp.vi(this.b).a(), (arwh)eqy.qn(this.a).a(), (vai)eqy.ky(this.a).a(), (vai)eqy.wc(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 259: {
                return new auda((tgd)eqy.jn(this.a).a(), (tff)eqy.sk(this.a).a());
            }
            case 258: {
                return ivh.v((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (auda)esp.vi(this.b).a(), (arwh)eqy.qn(this.a).a(), (vai)eqy.ky(this.a).a(), (vai)eqy.wc(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 257: {
                final esp b19 = this.b;
                return ixz.n(esp.iD(b19), esp.tX(b19), eqy.xN(this.a));
            }
            case 256: {
                return ixy.s((Context)esp.oz(this.b).a());
            }
            case 255: {
                return ixy.r(eqy.xN(this.a), (pvh)esp.rx(this.b).a(), (izv)esp.sF(this.b).a(), (abdn)esp.oD(this.b).a(), (aayl)esp.pd(this.b).a(), (jcp)esp.wI(this.b).a(), (FullscreenEngagementPanelOverlay)esp.jM(this.b).a(), (InlineMutedControlsOverlay)esp.pZ(this.b).a(), (isl)esp.la(this.b).a(), (iap)esp.qu(this.b).a(), (YouTubeControlsOverlay)esp.wA(this.b).a(), (abcr)esp.ph(this.b).a(), (itw)esp.wF(this.b).a(), (uyu)esp.pU(this.b).a(), (uyw)esp.pV(this.b).a(), (fxm)esp.kT(this.b).a(), (RentalActivationOverlay)esp.tv(this.b).a(), (YouTubeInlineAdOverlay)esp.wD(this.b).a(), (izm)esp.wJ(this.b).a(), (jat)esp.py(this.b).a(), (jas)esp.pt(this.b).a(), (abcg)esp.wG(this.b).a(), (sjh)esp.qt(this.b).a(), (iat)esp.mv(this.b).a(), (isj)esp.mp(this.b).a(), (iab)esp.lA(this.b).a(), (jag)esp.ww(this.b).a(), (NoSoundMemoOverlay)esp.nj(this.b).a(), (iyy)esp.vF(this.b).a(), (ixo)esp.nD(this.b).a(), (jdg)esp.rQ(this.b).a(), (ivn)esp.jf(this.b).a(), (wbf)esp.lm(this.b).a(), (jcf)esp.mm(this.b).a(), (vaf)eqy.pn(this.a).a(), (vai)eqy.ky(this.a).a(), (iyn)esp.rN(this.b).a());
            }
            case 254: {
                return ixy.p((Activity)esp.oz(this.b).a(), (tsb)esp.sp(this.b).a(), (abuc[])esp.qK(this.b).a(), (bhv)esp.wH(this.b).a(), (tqf)esp.ia(this.b).a(), (fps)esp.of(this.b).a(), (jki)esp.uU(this.b).a());
            }
            case 253: {
                return ixy.j((YouTubePlayerOverlaysLayout)esp.qZ(this.b).a());
            }
            case 252: {
                return ixz.h((Context)esp.oz(this.b).a(), (ViewGroup)esp.qY(this.b).a());
            }
            case 251: {
                return ixx.i((YouTubeControlsOverlay)esp.wA(this.b).a(), (aavi)esp.se(this.b).a(), (InlineMutedControlsOverlay)esp.pZ(this.b).a());
            }
            case 250: {
                return ixx.e((abpq)esp.ka(this.b).a(), (abbf)era.fO(eqy.r(this.a)).a(), (abbz)esp.po(this.b).a(), (xwk)eqy.te(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 249: {
                return iyu.b((vai)eqy.lg(this.a).a());
            }
            case 248: {
                return iyu.l((msr)esp.ox(this.b).a(), (jbh)esp.jv(this.b).a(), (iuv)esp.hM(this.b).a(), (wyw)esp.qg(this.b).a(), (jej)esp.vn(this.b).a());
            }
            case 247: {
                return iyu.o((jbh)esp.jv(this.b).a(), (abpu)esp.qW(this.b).a(), (msr)esp.ox(this.b).a(), (fjv)esp.ra(this.b).a());
            }
            case 246: {
                return iyu.r((bu)esp.pI(this.b).a(), esp.yc(this.b), (jbh)esp.jv(this.b).a(), (arfk)esp.ju(this.b).a(), esp.yI(this.b), (msr)esp.ox(this.b).a(), (fpn)esp.ws(this.b).a(), (abap)esp.uL(this.b).a(), (wyw)esp.qg(this.b).a(), (vai)eqy.eS(this.a).a());
            }
            case 245: {
                return fmf.s((msr)esp.ox(this.b).a(), arlr.b(esp.qW(this.b)), arlr.b(eqy.rY(this.a)), (Optional)esp.rl(this.b).a());
            }
            case 244: {
                return ips.p((hzm)esp.ht(this.b).a());
            }
            case 243: {
                return iyu.j((Context)esp.oz(this.b).a(), (vai)eqy.wc(this.a).a(), esp.wV(this.b));
            }
            case 242: {
                return iyu.g((Context)esp.oz(this.b).a(), (vai)eqy.wc(this.a).a(), esp.wV(this.b), (asid)eqy.fU(this.a).a(), (fjv)esp.ra(this.b).a(), arlr.b(esp.js(this.b)), (irz)esp.iy(this.b).a(), arlr.b(esp.jq(this.b)), arlr.b(esp.ju(this.b)), arlr.b(esp.jr(this.b)));
            }
            case 241: {
                final Context context3 = (Context)esp.oz(this.b).a();
                final Handler handler = (Handler)eqy.sJ(this.a).a();
                final acgs acgs = (acgs)eqy.kr(this.a).a();
                final esp b20 = this.b;
                return isz.p(context3, handler, acgs, esp.qg(b20), esp.jM(b20), (msr)esp.ox(b20).a(), (jbi)esp.jv(this.b).a());
            }
            case 240: {
                return ixx.o(esp.vG(this.b));
            }
            case 239: {
                final fa fa = (fa)esp.oF(this.b).a();
                final aahc aahc = (aahc)eqy.ta(this.a).a();
                final zpk zpk = (zpk)eqy.sK(this.a).a();
                final wyw wyw = (wyw)esp.qf(this.b).a();
                final oby oby = (oby)eqy.gH(this.a).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final vcy vcy2 = (vcy)esp.pA(this.b).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final zmt zmt = (zmt)eqy.kb(this.a).a();
                final tqd tqd = (tqd)eqy.qe(this.a).a();
                final uyw uyw = (uyw)esp.pV(this.b).a();
                return ljk.s(fa, aahc, zpk, wyw, oby, vcy, vcy2, zmf, zmt, tqd, (abbv)esp.oZ(this.b).a());
            }
            case 238: {
                final iri iri = (iri)esp.ip(this.b).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                final vai vai4 = (vai)eqy.wc(this.a).a();
                final vai wv = esp.wV(this.b);
                final esp b21 = this.b;
                final jds n = jbu.n(iri, arwh2, vai4, wv, esp.qR(b21), esp.pW(b21), (uwb)esp.jM(b21).a(), (wyw)esp.qg(this.b).a(), (abpu)esp.qW(this.b).a(), (qv)esp.oc(this.b).a(), (fjv)esp.ra(this.b).a(), (aauw)esp.pQ(this.b).a(), (tmx)eqy.sX(this.a).a(), (izv)esp.sF(this.b).a(), (jej)esp.vn(this.b).a(), arlr.b(esp.pc(this.b)), (auda)esp.vm(this.b).a(), (oby)eqy.gH(this.a).a());
                esp.bu(n);
                return n;
            }
            case 237: {
                final vaf vaf2 = (vaf)eqy.pn(this.a).a();
                final esp b22 = this.b;
                return ljl.g(vaf2, esp.iz(b22), esp.tW(b22));
            }
            case 236: {
                return new kyr();
            }
            case 235: {
                return kxz.c((Context)esp.oz(this.b).a(), (vaf)eqy.pn(this.a).a(), eqy.xN(this.a));
            }
            case 234: {
                final Context context4 = (Context)esp.oz(this.b).a();
                final atke tf = eqy.tf(this.a);
                final esp b23 = this.b;
                return ljl.s(context4, tf, esp.jy(b23), esp.jx(b23), esp.yU(b23), esp.cL(this.b));
            }
            case 233: {
                return mft.D((Context)esp.oz(this.b).a());
            }
            case 232: {
                return lio.r();
            }
            case 231: {
                final esp b24 = this.b;
                final lco i = kxz.i((ldg)esp.vI(b24).a(), (lag)esp.kf(this.b).a());
                esp.xm(b24, i);
                return i;
            }
            case 230: {
                return ldi.p((Activity)esp.oz(this.b).a(), (blu)esp.vx(this.b).a(), (lco)esp.nb(this.b).a());
            }
            case 229: {
                return lgr.q((abpu)esp.qW(this.b).a());
            }
            case 228: {
                return ldi.o((gkx)eqy.hv(this.a).a(), (asid)eqy.fU(this.a).a(), (xnt)eqy.mi(this.a).a(), (lag)esp.kf(this.b).a(), (blu)esp.vx(this.b).a(), (abem)esp.vv(this.b).a(), (lfz)esp.vt(this.b).a(), arlr.b(esp.qW(this.b)), (WatchCinematicSettingsController)esp.vy(this.b).a(), arlr.b(esp.vr(this.b)), esp.fX(this.b), (vai)esp.vZ(this.b).a(), (vai)eqy.wb(this.a).a());
            }
            case 227: {
                return lgr.b((Context)esp.oz(this.b).a(), esp.vu(this.b), (tmx)eqy.sX(this.a).a(), esp.cn(this.b));
            }
            case 226: {
                return isz.b((Activity)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a(), esp.cn(this.b), (abbf)era.fO(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (asid)eqy.fU(this.a).a(), (wyw)esp.qg(this.b).a());
            }
            case 225: {
                return new PlaybackLoopShuffleMonitor((abpu)esp.qW(this.b).a());
            }
            case 224: {
                return isz.e((Context)esp.oz(this.b).a(), (PlaybackLoopShuffleMonitor)esp.nT(this.b).a(), (abpu)esp.qW(this.b).a(), (wyw)esp.qg(this.b).a(), esp.cn(this.b));
            }
            case 223: {
                final esp b25 = this.b;
                final atke oz = esp.oz(b25);
                final atke ka2 = esp.ka(b25);
                final eqy a2 = this.a;
                return new kvh(oz, ka2, eqy.kK(a2), esp.tS(b25), esp.nf(b25), esp.vy(b25), esp.iE(b25), esp.qW(b25), esp.gd(b25), esp.qg(b25), esp.mi(b25), esp.oY(b25), esp.oW(b25), esp.sZ(b25), esp.iS(b25), esp.wB(b25), esp.pv(b25), eqy.ja(a2), era.ek(eqy.r(a2)), esp.rt(b25), esp.gX(b25));
            }
            case 222: {
                final bu bu = (bu)esp.pI(this.b).a();
                final esp b26 = this.b;
                return knk.k(bu, esp.ka(b26), (abpu)esp.qW(b26).a(), (vai)eqy.vx(this.a).a(), esp.yP(this.b));
            }
            case 221: {
                final eqy a3 = this.a;
                return new aekp(eqy.ps(a3), eqy.lp(a3), null, null, null);
            }
            case 220: {
                return new acbm((Context)esp.oz(this.b).a(), (omw)esp.wB(this.b).a(), (acdp)eqy.jb(this.a).a(), (aekp)esp.wM(this.b).a(), (vai)eqy.ja(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 219: {
                return ivh.j((Context)esp.oz(this.b).a(), (acbm)esp.iR(this.b).a(), arlr.b(esp.iS(this.b)), (wyw)esp.qg(this.b).a());
            }
            case 218: {
                return lkh.c();
            }
            case 217: {
                return ixy.c();
            }
            case 216: {
                return fmf.n();
            }
            case 215: {
                return new aeea((short[])null, (char[])null);
            }
            case 214: {
                final acwt acwt = (acwt)esp.sD(this.b).a();
                final aeea aeea = (aeea)esp.tn(this.b).a();
                final aeea aeea2 = (aeea)esp.mG(this.b).a();
                final glb glb = (glb)era.en(eqy.r(this.a)).a();
                return actb.v(acwt, aeea, aeea2);
            }
            case 213: {
                return ivh.g((Context)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a(), (acpk)eqy.kK(this.a).a(), (vcy)esp.oW(this.b).a(), (wyw)esp.qe(this.b).a(), arlr.b(esp.rS(this.b)));
            }
            case 212: {
                return ljk.o((wyw)esp.qg(this.b).a(), (Executor)eqy.fT(this.a).a(), (aaxx)eqy.iF(this.a).a());
            }
            case 211: {
                return ips.r((Context)esp.oz(this.b).a(), (wyw)esp.qe(this.b).a(), (acpk)eqy.kK(this.a).a(), (vcy)esp.oW(this.b).a(), (abpu)esp.qW(this.b).a(), (isn)eqy.wi(this.a).a(), esp.wY(this.b), (Handler)eqy.sJ(this.a).a(), (WillAutonavInformer)eqy.wf(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 210: {
                return new qv();
            }
            case 209: {
                return ips.m((qv)esp.oc(this.b).a(), (abpu)esp.qW(this.b).a(), (wyw)esp.qg(this.b).a(), (vcy)esp.pA(this.b).a(), (acgs)eqy.kr(this.a).a(), (vai)eqy.vx(this.a).a());
            }
            case 208: {
                return iyu.i((xnt)eqy.mi(this.a).a(), (isd)esp.hU(this.b).a(), (AutonavToggleController)esp.gC(this.b).a(), (MusicAppDeeplinkButtonController)esp.mU(this.b).a(), (vai)eqy.wc(this.a).a(), (uwb)esp.jM(this.b).a(), (fzw)esp.hL(this.b).a(), arlr.b(esp.rS(this.b)));
            }
            case 207: {
                return iyu.q((gfk)eqy.kK(this.a).a(), (iyt)esp.uS(this.b).a(), (ashy)esp.qm(this.b).a(), esp.yS(this.b), (ixv)esp.ob(this.b).a(), (kuk)esp.od(this.b).a(), (isd)esp.hU(this.b).a(), (AutonavToggleController)esp.gC(this.b).a(), (SubtitleButtonController)esp.sP(this.b).a(), (TouchImageView)esp.rD(this.b).a(), (ImageView)esp.oB(this.b).a(), (MusicAppDeeplinkButtonController)esp.mU(this.b).a(), (mcb)esp.wP(this.b).a(), (arwh)eqy.qn(this.a).a());
            }
            case 206: {
                return abaq.c();
            }
            case 205: {
                return abaq.b((vcy)esp.oW(this.b).a(), (abam)esp.uI(this.b).a());
            }
            case 204: {
                return abaq.o((abap)esp.uL(this.b).a(), eqy.kh(this.a));
            }
            case 203: {
                final esp b27 = this.b;
                return ixy.n(esp.qg(b27), (abgz)esp.sV(b27).a(), (Handler)eqy.sJ(this.a).a(), (abuj)esp.kc(this.b).a(), (qv)esp.hn(this.b).a(), (vaf)eqy.pn(this.a).a(), (abpq)esp.ka(this.b).a());
            }
            case 202: {
                return ljk.p((wyw)esp.qg(this.b).a(), (Executor)eqy.fT(this.a).a(), (aaxx)eqy.iF(this.a).a());
            }
            case 201: {
                final Context context5 = (Context)esp.oz(this.b).a();
                return isz.m((Handler)eqy.sJ(this.a).a());
            }
            case 200: {
                final Context context6 = (Context)esp.oz(this.b).a();
                final eqy a4 = this.a;
                return new iyy(context6, era.fB(eqy.r(a4)), (acgs)eqy.kr(a4).a(), (fxw)esp.gn(this.b).a(), esp.is(this.b), (vaf)eqy.pn(this.a).a());
            }
        }
    }
    
    private final Object k() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 399: {
                return hlb.j((Activity)esp.oz(this.b).a(), esp.dG(this.b), (vcy)esp.oW(this.b).a());
            }
            case 398: {
                return actb.n((vaf)eqy.pn(this.a).a());
            }
            case 397: {
                return hlb.u((Context)esp.ut(this.b).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), esp.dG(this.b), (aghv)esp.mZ(this.b).a(), (kkg)era.af(eqy.r(this.a)).a(), (aeea)eqy.mB(this.a).a());
            }
            case 396: {
                final Context context = (Context)esp.oz(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final agkz agkz = (agkz)esp.rq(this.b).a();
                final xib xib = (xib)esp.lb(this.b).a();
                final esp b = this.b;
                return vvq.o(context, vcy, agkz, xib, esp.ql(b), (aeea)esp.iE(b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 395: {
                return abzn.f((acbm)esp.iR(this.b).a());
            }
            case 394: {
                return new wdp((Context)esp.rP(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 393: {
                return new wdq((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (acgs)eqy.kr(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 392: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final wyv wyv = (wyv)esp.ow(this.b).a();
                final vcy vcy2 = (vcy)esp.oW(this.b).a();
                final aald aald = (aald)esp.uD(this.b).a();
                return new wdu(context2, wyv, vcy2, (acgs)eqy.kr(this.a).a());
            }
            case 391: {
                final Context context3 = (Context)esp.oz(this.b).a();
                final wyv wyv2 = (wyv)esp.ow(this.b).a();
                final vcy vcy3 = (vcy)esp.oW(this.b).a();
                final acgs acgs = (acgs)eqy.kr(this.a).a();
                final aald aald2 = (aald)esp.uD(this.b).a();
                return new wdr(context3, wyv2, vcy3, acgs, (tvr)esp.qr(this.b).a());
            }
            case 390: {
                return new wdv((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (acgs)eqy.kr(this.a).a());
            }
            case 389: {
                return wdt.b((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (acgs)eqy.kr(this.a).a());
            }
            case 388: {
                final esp b2 = this.b;
                return new wud(esp.qn(b2), (Context)esp.rP(b2).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (xib)esp.he(this.b).a(), (aujg)era.bG(eqy.r(this.a)).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 387: {
                return new wuc((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (aujg)era.bG(eqy.r(this.a)).a(), (acpk)eqy.kK(this.a).a(), (aeea)esp.nB(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 386: {
                return new wub((Context)esp.rP(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a());
            }
            case 385: {
                return new wua((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a());
            }
            case 384: {
                return new wue((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (acpk)eqy.kK(this.a).a(), (vcy)esp.oW(this.b).a(), (zmf)eqy.pK(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (zxn)era.bN(eqy.r(this.a)).a(), (xib)esp.lo(this.b).a(), (tvr)esp.qr(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 383: {
                final esp b3 = this.b;
                return new iaf(esp.lK(b3), esp.lq(b3), esp.lt(b3), esp.lx(b3), esp.lE(b3), esp.lB(b3), esp.lD(b3), esp.ly(b3), esp.lC(b3), esp.lw(b3), esp.lv(b3), esp.iQ(b3));
            }
            case 382: {
                final Context context4 = (Context)esp.rP(this.b).a();
                final esp b4 = this.b;
                final atke qn = esp.qn(b4);
                final acps acps = (acps)esp.lz(b4).a();
                final esp b5 = this.b;
                final atke lh = esp.lh(b5);
                final aeea aeea = (aeea)esp.sZ(b5).a();
                final vzf vzf = (vzf)esp.lc(this.b).a();
                final wfi wfi = (wfi)esp.le(this.b).a();
                final abrj abrj = (abrj)esp.ig(this.b).a();
                final xib xib2 = (xib)esp.lo(this.b).a();
                final ashy ashy = (ashy)esp.rR(this.b).a();
                final omw omw = (omw)esp.wB(this.b).a();
                final oum oum = (oum)esp.pv(this.b).a();
                return hzk.s(context4, qn, acps, lh, aeea, vzf, wfi, abrj, xib2, ashy, omw, (acdp)eqy.jb(this.a).a(), (vai)eqy.ja(this.a).a(), (oug)era.db(eqy.r(this.a)).a(), esp.rt(this.b));
            }
            case 381: {
                return ips.e((Context)esp.oz(this.b).a(), (xnt)eqy.mi(this.a).a());
            }
            case 380: {
                return new iat((Context)esp.oz(this.b).a());
            }
            case 379: {
                return ixy.b((Context)esp.oz(this.b).a());
            }
            case 378: {
                return ivh.o((abpu)esp.qW(this.b).a(), esp.ka(this.b), (asid)eqy.fU(this.a).a(), esp.cI(this.b), (qv)esp.oc(this.b).a(), (izx)esp.sF(this.b).a());
            }
            case 377: {
                final esp b6 = this.b;
                final PlaybackLifecycleMonitor j = fmf.j((abpq)esp.ka(b6).a(), (abpu)esp.qW(this.b).a());
                esp.xo(b6, j);
                return j;
            }
            case 376: {
                final esp b7 = this.b;
                final izw m = iyu.m((izv)esp.sF(b7).a(), (PlaybackLifecycleMonitor)esp.nR(this.b).a(), (qv)esp.oc(this.b).a(), (msr)esp.ox(this.b).a(), (tgd)eqy.jn(this.a).a(), (abpu)esp.qW(this.b).a(), (iri)esp.ip(this.b).a(), (fjv)esp.ra(this.b).a(), (vai)eqy.ky(this.a).a(), (vai)esp.vZ(this.b).a());
                esp.xy(b7, m);
                return m;
            }
            case 375: {
                return new LiveOverlayPresenter((Context)eqy.ps(this.a).a(), (abcg)esp.wG(this.b).a(), era.w(eqy.r(this.a)), (Executor)eqy.fT(this.a).a(), (acgs)eqy.kr(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (oby)eqy.gH(this.a).a(), (vcy)esp.pA(this.b).a(), (abcj)esp.wL(this.b).a());
            }
            case 374: {
                return wap.u(esp.zS(this.b), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 373: {
                return new actp((wzs)era.dE(eqy.r(this.a)).a(), (acgs)eqy.kr(this.a).a(), (agmx)era.bh(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 372: {
                return actb.j((Context)esp.oz(this.b).a(), (wzs)era.dE(eqy.r(this.a)).a(), (actp)esp.ja(this.b).a());
            }
            case 371: {
                return actb.i((Context)eqy.ps(this.a).a(), (wzs)era.dE(eqy.r(this.a)).a(), esp.el(this.b));
            }
            case 370: {
                final esp b8 = this.b;
                return actb.b(esp.iY(b8), esp.iZ(b8));
            }
            case 369: {
                return new wbp((Context)eqy.ps(this.a).a(), esp.zW(this.b), (acps)esp.px(this.b).a(), (agmx)era.bh(eqy.r(this.a)).a(), (acpk)eqy.kK(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (wzs)era.dE(eqy.r(this.a)).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 368: {
                return new wdl((Context)esp.rP(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 367: {
                return new wcv((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (acgs)eqy.kr(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 366: {
                final Context context5 = (Context)esp.oz(this.b).a();
                final wyv wyv3 = (wyv)esp.ow(this.b).a();
                final vcy vcy4 = (vcy)esp.oW(this.b).a();
                final acgs acgs2 = (acgs)eqy.kr(this.a).a();
                final aald aald3 = (aald)esp.uD(this.b).a();
                return new wdx(context5, wyv3, vcy4, acgs2, (tvr)esp.qr(this.b).a());
            }
            case 365: {
                final esp b9 = this.b;
                return new xib(esp.oz(b9), esp.uA(b9), (char[])null);
            }
            case 364: {
                final esp b10 = this.b;
                return wdt.s(esp.qn(b10), (Context)esp.rP(b10).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (xib)esp.he(this.b).a(), (aujg)era.bG(eqy.r(this.a)).a());
            }
            case 363: {
                return wdt.c((Context)esp.rP(this.b).a(), (vcy)esp.oW(this.b).a(), (vai)esp.lg(this.b).a());
            }
            case 362: {
                return new aald();
            }
            case 361: {
                final Context context6 = (Context)esp.oz(this.b).a();
                final wyv wyv4 = (wyv)esp.ow(this.b).a();
                final vcy vcy5 = (vcy)esp.oW(this.b).a();
                final aald aald4 = (aald)esp.uD(this.b).a();
                return new wdh(context6, wyv4, vcy5, (acgs)eqy.kr(this.a).a());
            }
            case 360: {
                return wdt.g((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (acgs)eqy.kr(this.a).a());
            }
            case 359: {
                return new weg((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (acgs)eqy.kr(this.a).a());
            }
            case 358: {
                return new wdw((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (wyv)esp.ow(this.b).a(), (vcy)esp.oW(this.b).a(), (aujg)era.bG(eqy.r(this.a)).a(), (acpk)eqy.kK(this.a).a(), (aeea)esp.nB(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 357: {
                return wap.f((Context)esp.rP(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a());
            }
            case 356: {
                return new wdm((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a());
            }
            case 355: {
                return lio.h((gkv)esp.oN(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 354: {
                final Context context7 = (Context)esp.oz(this.b).a();
                return new xib((arwh)eqy.qn(this.a).a(), (vaf)eqy.pn(this.a).a(), (byte[])null, (byte[])null);
            }
            case 353: {
                return new wee((Activity)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (zxn)era.bN(eqy.r(this.a)).a(), (xib)esp.lo(this.b).a(), (tvr)esp.qr(this.b).a(), (vai)esp.lg(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 352: {
                final esp b11 = this.b;
                final atke lj = esp.lJ(b11);
                final atke lp = esp.lp(b11);
                final atke ls = esp.ls(b11);
                final atke lf = esp.lF(b11);
                final atke lm = esp.lM(b11);
                final atke lo = esp.lO(b11);
                final atke ln = esp.lN(b11);
                final atke lu = esp.lu(b11);
                final atke lp2 = esp.lP(b11);
                final aujg an = esp.An(b11);
                final esp b12 = this.b;
                return wdt.v(lj, lp, ls, lf, lm, lo, ln, lu, lp2, an, esp.lH(b12), esp.lr(b12), esp.li(b12), esp.iR(b12));
            }
            case 351: {
                return ggm.j((Activity)esp.oz(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 350: {
                return lio.n((Activity)esp.oz(this.b).a());
            }
            case 349: {
                return gvs.p(esp.zL(this.b));
            }
            case 348: {
                final Map ex = esp.eX(this.b);
                final esp b13 = this.b;
                return acfd.j(ex, esp.pD(b13), (Activity)esp.oz(b13).a());
            }
            case 347: {
                return gqz.i();
            }
            case 346: {
                return guc.b();
            }
            case 345: {
                return lio.f((gkx)eqy.hv(this.a).a(), esp.eV(this.b), (Activity)esp.oz(this.b).a());
            }
            case 344: {
                return lio.l((Context)esp.oz(this.b).a(), (gkv)esp.oN(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 343: {
                final Context context8 = (Context)esp.rP(this.b).a();
                final vzx vzx = (vzx)esp.qn(this.b).a();
                final esp b14 = this.b;
                final atke qn2 = esp.qn(b14);
                final Activity activity = (Activity)esp.oz(b14).a();
                final xrm xrm = (xrm)era.bS(eqy.r(this.a)).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final vcy vcy6 = (vcy)esp.oW(this.b).a();
                final xib xib3 = (xib)esp.lb(this.b).a();
                final wft xj = esp.xJ(this.b);
                final esp b15 = this.b;
                return wdt.r(context8, vzx, qn2, activity, xrm, tgd, vcy6, xib3, xj, esp.sE(b15), (xib)esp.lo(b15).a(), (vai)esp.lg(this.b).a());
            }
            case 342: {
                return new xib((vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 341: {
                return vvq.k((xib)esp.lb(this.b).a(), (vcy)esp.oW(this.b).a(), (tqd)eqy.qe(this.a).a(), (agmx)era.bh(eqy.r(this.a)).a(), (Context)esp.oz(this.b).a());
            }
            case 340: {
                return vvq.d((vcy)esp.oW(this.b).a());
            }
            case 339: {
                return vvq.c();
            }
            case 338: {
                return vvq.e((vcy)esp.oW(this.b).a(), (vyx)esp.ln(this.b).a());
            }
            case 337: {
                return new aeea((arwh)eqy.qn(this.a).a(), (byte[])null, (byte[])null);
            }
            case 336: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (float[][])null, (byte[])null, (byte[])null);
            }
            case 335: {
                final Context context9 = (Context)esp.oz(this.b).a();
                return new vzr((Handler)eqy.sJ(this.a).a());
            }
            case 334: {
                return new vzg((Handler)eqy.sJ(this.a).a(), (vdr)eqy.kE(this.a).a());
            }
            case 333: {
                return ljk.u(esp.dO(this.b), (xib)esp.lb(this.b).a(), (wyw)eqy.hP(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 332: {
                final Context context10 = (Context)esp.oz(this.b).a();
                final esp b16 = this.b;
                return wap.e(context10, esp.qn(b16), esp.lR(b16), (vai)esp.vZ(b16).a(), (vai)esp.lg(this.b).a());
            }
            case 331: {
                return jbu.d((Context)esp.oz(this.b).a(), (abck)esp.wA(this.b).a(), (abch)esp.lm(this.b).a(), (Handler)eqy.sJ(this.a).a());
            }
            case 330: {
                return abzn.p((Context)esp.oz(this.b).a(), (Executor)eqy.lf(this.a).a(), (zlo)eqy.kB(this.a).a(), (otk)eqy.jg(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 329: {
                return ixx.l((Context)esp.oz(this.b).a(), (YouTubeControlsOverlay)esp.wA(this.b).a(), (vcy)esp.pA(this.b).a(), arlr.b(esp.tm(this.b)), (acbm)esp.iR(this.b).a());
            }
            case 328: {
                return ixx.v((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (YouTubeControlsOverlay)esp.wA(this.b).a(), esp.zR(this.b), (vai)eqy.vx(this.a).a());
            }
            case 327: {
                return iyu.d((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (fjv)esp.ra(this.b).a());
            }
            case 326: {
                final izm c2 = iyu.c((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (izp)esp.wK(this.b).a());
                esp.bL(c2);
                return c2;
            }
            case 325: {
                return ixx.s((YouTubeControlsOverlay)esp.wA(this.b).a());
            }
            case 324: {
                return ivh.l((Context)esp.oz(this.b).a());
            }
            case 323: {
                return ixx.b((acgs)eqy.kr(this.a).a());
            }
            case 322: {
                return new YouTubeInlineAdOverlay((Activity)esp.oz(this.b).a(), (acql)esp.qE(this.b).a(), (wyw)esp.qg(this.b).a(), (acgs)eqy.kr(this.a).a(), (fjv)esp.ra(this.b).a(), (vcy)esp.pA(this.b).a(), (sdh)eqy.eO(this.a).a(), (abty)esp.qR(this.b).a(), (ziy)esp.uA(this.b).a(), (iwt)esp.oE(this.b).a(), (ImageView)esp.oB(this.b).a(), (abed)esp.qi(this.b).a(), (tgd)eqy.jn(this.a).a(), (arwh)eqy.qn(this.a).a(), (acwn)esp.rS(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 321: {
                return fuu.e((Context)esp.oz(this.b).a(), (fjv)esp.ra(this.b).a());
            }
            case 320: {
                return new fxm((Context)esp.oz(this.b).a());
            }
            case 319: {
                return esp.cz(this.b);
            }
            case 318: {
                return new itw((Context)esp.oz(this.b).a());
            }
            case 317: {
                return ixx.h((Context)esp.oz(this.b).a());
            }
            case 316: {
                return ixy.d((Context)esp.oz(this.b).a());
            }
            case 315: {
                return hxp.e((Context)esp.oz(this.b).a(), (acpk)eqy.kK(this.a).a());
            }
            case 314: {
                return gku.s((SharedPreferences)eqy.sp(this.a).a(), (oby)eqy.gH(this.a).a());
            }
            case 313: {
                return ljk.v((acwi)esp.sD(this.b).a(), (vcy)esp.oW(this.b).a(), (fzw)esp.ma(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 312: {
                final esp b17 = this.b;
                final atke ow = esp.oW(b17);
                final atke pr = esp.pR(b17);
                final atke ro = esp.rO(b17);
                final atke tn = esp.tn(b17);
                final eqy a = this.a;
                return new hmw(ow, pr, ro, tn, eqy.pn(a), eqy.vx(a), null);
            }
            case 311: {
                return new cya(eqy.kK(this.a), null, null);
            }
            case 310: {
                return ips.s((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (acgs)eqy.kr(this.a).a(), (cya)esp.mI(this.b).a(), (hmw)esp.uB(this.b).a(), esp.wV(this.b), (vai)eqy.vx(this.a).a());
            }
            case 309: {
                return ips.q((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (arwh)eqy.qn(this.a).a(), (bhv)esp.wH(this.b).a(), (qv)esp.oc(this.b).a(), (isb)esp.ji(this.b).a());
            }
            case 308: {
                return aaiu.i((Context)esp.oz(this.b).a(), (abap)esp.uL(this.b).a());
            }
            case 307: {
                return aaiu.j((aazy)esp.hq(this.b).a(), esp.ec(this.b), (vai)eqy.wc(this.a).a());
            }
            case 306: {
                return new epr(this);
            }
            case 305: {
                final Context context11 = (Context)esp.oz(this.b).a();
                final bu bu = (bu)esp.pI(this.b).a();
                final vai ww = esp.wW(this.b);
                final msr msr = (msr)esp.ox(this.b).a();
                final afvt afvt = (afvt)eqy.qE(this.a).a();
                final ghb ghb = (ghb)esp.il(this.b).a();
                final InlinePlaybackController inlinePlaybackController = (InlinePlaybackController)esp.kA(this.b).a();
                final InlinePlaybackLifecycleController inlinePlaybackLifecycleController = (InlinePlaybackLifecycleController)esp.kC(this.b).a();
                final kbm kbm = (kbm)eqy.kJ(this.a).a();
                final SubtitleButtonController subtitleButtonController = (SubtitleButtonController)esp.sO(this.b).a();
                final esp b18 = this.b;
                return ljl.t(context11, bu, ww, msr, afvt, ghb, inlinePlaybackController, inlinePlaybackLifecycleController, kbm, subtitleButtonController, esp.oW(b18), (wyv)esp.ow(b18).a(), (ViewGroup)esp.rr(this.b).a(), (abpu)esp.qW(this.b).a());
            }
            case 304: {
                return ixx.q((Context)esp.oz(this.b).a());
            }
            case 303: {
                return ixz.l((Context)esp.oz(this.b).a());
            }
            case 302: {
                return kan.c();
            }
            case 301: {
                return kan.e((tok)eqy.po(this.a).a(), esp.ox(this.b), (vai)eqy.uY(this.a).a());
            }
            case 300: {
                return fuu.u((Context)esp.ut(this.b).a(), (hzn)esp.eJ(this.b), (gbc)esp.oR(this.b).a(), (Handler)eqy.sJ(this.a).a(), (ziy)esp.uA(this.b).a(), (vai)eqy.vx(this.a).a());
            }
        }
    }
    
    private final Object l() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 499: {
                return ixx.f();
            }
            case 498: {
                final esp b = this.b;
                final ivi b2 = ivh.b((fpn)esp.ws(b).a(), (Handler)eqy.sJ(this.a).a(), (iuv)esp.hM(this.b).a(), (atjz)esp.pa(this.b).a(), (vaf)eqy.pn(this.a).a(), (wyw)esp.qg(this.b).a(), esp.ex(this.b), eqy.xN(this.a), (iws)esp.kJ(this.b).a());
                esp.xg(b, b2);
                return b2;
            }
            case 497: {
                return fpi.f((abpu)esp.qW(this.b).a());
            }
            case 496: {
                final esp b3 = this.b;
                final lcd g = kxz.g();
                esp.xf(b3, g);
                return g;
            }
            case 495: {
                return ljk.t((Context)esp.oz(this.b).a(), (arwh)eqy.qn(this.a).a());
            }
            case 494: {
                final Optional optional = (Optional)esp.qy(this.b).a();
                final uyw uyw = (uyw)esp.pV(this.b).a();
                return ixz.m(optional, (TouchImageView)esp.rD(this.b).a());
            }
            case 493: {
                return new acnc((vcy)esp.oW(this.b).a());
            }
            case 492: {
                final Context context = (Context)esp.oz(this.b).a();
                final arkg b4 = arlr.b(esp.tm(this.b));
                final esp b5 = this.b;
                return jbu.c(context, b4, esp.iR(b5), (wyw)esp.qg(b5).a(), esp.wV(this.b));
            }
            case 491: {
                return new gyw((Context)esp.oz(this.b).a(), arlr.b(esp.tm(this.b)), (acbm)esp.iR(this.b).a(), (wyw)esp.qg(this.b).a(), 2);
            }
            case 490: {
                return zpt.o((Context)esp.oz(this.b).a(), (acpk)esp.rO(this.b).a(), (aujg)esp.hd(this.b).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (vai)eqy.vx(this.a).a());
            }
            case 489: {
                final esp b6 = this.b;
                final atke pi = esp.pI(b6);
                final atke ub = esp.uB(b6);
                final atke pr = esp.pR(b6);
                final eqy a = this.a;
                return new gug(pi, ub, pr, eqy.ib(a), esp.tn(b6), eqy.wk(a), esp.kt(b6), eqy.kE(a));
            }
            case 488: {
                return fuu.b((bu)esp.pI(this.b).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 487: {
                final esp b7 = this.b;
                return new hyx(esp.um(b7), esp.rO(b7), esp.pR(b7), esp.tn(b7), (char[])null);
            }
            case 486: {
                final esp b8 = this.b;
                return new hyx(esp.oW(b8), esp.rO(b8), eqy.ib(this.a), esp.tn(b8), (char[])null, (byte[])null);
            }
            case 485: {
                final atke ck = era.ck(eqy.r(this.a));
                final esp b9 = this.b;
                return new hyx(ck, esp.uM(b9), esp.ul(b9), esp.un(b9), null, null, (byte[])null);
            }
            case 484: {
                return new jjv((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.pA(this.b).a(), (hwn)esp.ui(this.b).a(), (hyx)esp.uk(this.b).a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 483: {
                final esp b10 = this.b;
                final atke ow = esp.oW(b10);
                final eqy a2 = this.a;
                return new kqp(ow, eqy.kK(a2), esp.oz(b10), eqy.jn(a2), eqy.kE(a2), eqy.pn(a2), eqy.fU(a2), eqy.ib(a2), eqy.sp(a2));
            }
            case 482: {
                return fuu.f((fjv)esp.ra(this.b).a(), (vcy)esp.oW(this.b).a(), (Handler)eqy.sJ(this.a).a(), (Executor)eqy.fT(this.a).a(), (oby)eqy.gH(this.a).a(), (fxw)esp.gn(this.b).a(), (vai)eqy.wb(this.a).a(), era.fm(eqy.r(this.a)));
            }
            case 481: {
                final esp b11 = this.b;
                final atke ow2 = esp.oW(b11);
                final eqy a3 = this.a;
                return new kqx(ow2, eqy.kK(a3), esp.oz(b11), esp.vc(b11), eqy.jn(a3), eqy.kE(a3));
            }
            case 480: {
                final esp b12 = this.b;
                return new lkx(esp.oz(b12), esp.qg(b12), esp.pA(b12), eqy.kK(this.a), esp.pR(b12), esp.hd(b12), (byte[])null, (char[])null);
            }
            case 479: {
                final esp b13 = this.b;
                return new aujg(esp.oW(b13), esp.tn(b13), eqy.vx(this.a), (char[])null);
            }
            case 478: {
                final atke kk = eqy.kK(this.a);
                final esp b14 = this.b;
                return new e(kk, esp.pR(b14), esp.oz(b14), esp.hd(b14), (char[])null, (byte[])null, (byte[])null);
            }
            case 477: {
                return new jbt((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), esp.zr(this.b), esp.yz(this.b), (abho)esp.gz(this.b).a(), (arwh)eqy.qn(this.a).a(), null, null, null, null);
            }
            case 476: {
                return jbu.p((Context)esp.oz(this.b).a(), (jej)esp.vn(this.b).a(), (iuv)esp.hM(this.b).a(), (jki)esp.uU(this.b).a());
            }
            case 475: {
                final jed i = jbu.i((Context)esp.oz(this.b).a(), (jej)esp.vn(this.b).a());
                esp.bG(i);
                return i;
            }
            case 474: {
                return kvu.n((Context)esp.oz(this.b).a(), (lco)esp.nb(this.b).a(), (fjv)esp.ra(this.b).a(), (abty)esp.qR(this.b).a(), (vaf)eqy.pn(this.a).a(), (msr)esp.ox(this.b).a(), (vai)esp.vZ(this.b).a());
            }
            case 473: {
                return ixz.o((acbm)esp.iR(this.b).a(), (iyc)esp.vA(this.b).a(), arlr.b(esp.iS(this.b)), (wyw)esp.qg(this.b).a(), (abpu)esp.qW(this.b).a(), (fjr)esp.nU(this.b).a(), eqy.xN(this.a), (uwb)esp.jM(this.b).a());
            }
            case 472: {
                return ixy.h((rpl)era.fc(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (izm)esp.wJ(this.b).a(), (oby)eqy.gH(this.a).a(), (tqf)esp.ia(this.b).a());
            }
            case 471: {
                final esp b15 = this.b;
                return ixy.q(esp.qg(b15), (vcy)esp.oW(b15).a(), (izm)esp.wJ(this.b).a(), (rpi)eqy.eK(this.a).a(), (ziy)eqy.ux(this.a).a(), (qcy)eqy.kY(this.a).a(), (oby)eqy.gH(this.a).a(), (tqf)esp.ia(this.b).a(), (smd)eqy.eC(this.a).a(), (izp)esp.wK(this.b).a());
            }
            case 470: {
                return new fno((qv)esp.oc(this.b).a(), (abty)esp.qR(this.b).a(), (tgd)eqy.jn(this.a).a(), (fjr)esp.nU(this.b).a(), (xnt)eqy.mi(this.a).a(), (sjy)esp.rL(this.b).a(), (sjm)esp.qD(this.b).a(), (byte[])null, (byte[])null);
            }
            case 469: {
                return ggm.e((Activity)esp.oz(this.b).a(), (acql)esp.qE(this.b).a());
            }
            case 468: {
                return jbu.u(esp.zj(this.b), esp.xZ(this.b), esp.zD(this.b), esp.zo(this.b), esp.yJ(this.b), (wyw)esp.qg(this.b).a(), (abdx)esp.ws(this.b).a(), (acql)esp.qE(this.b).a(), (abpu)esp.qW(this.b).a(), (Handler)eqy.sJ(this.a).a(), (uwb)esp.jM(this.b).a());
            }
            case 467: {
                return ggm.r((Activity)esp.oz(this.b).a(), (fxw)esp.gn(this.b).a(), (ghv)esp.wb(this.b).a(), (liq)esp.nd(this.b).a(), (fjv)esp.ra(this.b).a(), (abty)esp.qR(this.b).a(), (skt)esp.wt(this.b).a(), (tpz)esp.pr(this.b).a(), (jki)esp.vD(this.b).a(), (aun)esp.pI(this.b).a(), (msr)esp.ox(this.b).a(), (afvt)eqy.oN(this.a).a(), (hox)esp.jJ(this.b).a(), (pja)era.bf(eqy.r(this.a)).a(), (vai)eqy.wc(this.a).a(), esp.cL(this.b), (iuo)era.aU(eqy.r(this.a)).a(), (Optional)esp.rl(this.b).a(), (acql)esp.qE(this.b).a());
            }
            case 466: {
                return ljl.o(esp.iz(this.b));
            }
            case 465: {
                return iyu.k((jea)esp.rZ(this.b).a(), (wyw)esp.qg(this.b).a());
            }
            case 464: {
                return ixy.l((Context)esp.oz(this.b).a());
            }
            case 463: {
                return ixz.s((Context)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a(), (itg)esp.kd(this.b).a(), (ajb)esp.uo(this.b).a(), (vaf)eqy.pn(this.a).a(), (iuv)esp.hM(this.b).a(), (wyw)esp.qg(this.b).a());
            }
            case 462: {
                return new aekp(eqy.hP(this.a), esp.ow(this.b), (byte[])null, null);
            }
            case 461: {
                return actb.h((Context)esp.oz(this.b).a());
            }
            case 460: {
                return ips.i((Activity)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a());
            }
            case 459: {
                return ips.t((Activity)esp.oz(this.b).a(), (hyx)era.aP(eqy.r(this.a)).a());
            }
            case 458: {
                return new itk((Activity)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), esp.cn(this.b));
            }
            case 457: {
                return ips.h((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (vaf)eqy.pn(this.a).a(), (uve)esp.sj(this.b).a());
            }
            case 456: {
                final isx c2 = isz.c((bu)esp.pI(this.b).a(), (tmx)eqy.oG(this.a).a(), (xnt)eqy.mi(this.a).a(), esp.cn(this.b));
                esp.bA(c2);
                return c2;
            }
            case 455: {
                return ljl.f((bu)esp.pI(this.b).a());
            }
            case 454: {
                return isz.u((bu)esp.pI(this.b).a(), (itc)esp.qU(this.b).a(), (aeea)eqy.mB(this.a).a(), esp.cn(this.b));
            }
            case 453: {
                return ljh.p((bu)esp.pI(this.b).a());
            }
            case 452: {
                return new isq((bu)esp.pI(this.b).a(), (isp)esp.oO(this.b).a(), esp.cn(this.b));
            }
            case 451: {
                final isv g2 = ips.g((Activity)esp.oz(this.b).a(), esp.pW(this.b));
                esp.by(g2);
                return g2;
            }
            case 450: {
                return ljl.m((bu)esp.pI(this.b).a());
            }
            case 449: {
                return ljl.n((bu)esp.pI(this.b).a());
            }
            case 448: {
                return new itj((bu)esp.pI(this.b).a(), (ith)esp.rY(this.b).a(), (iti)esp.rX(this.b).a(), (Handler)eqy.sJ(this.a).a(), (arwh)eqy.qn(this.a).a(), (acwb)esp.ry(this.b).a(), esp.cn(this.b), null, null);
            }
            case 447: {
                return ljh.s((isy)esp.nf(this.b).a(), (itj)esp.vh(this.b).a(), (isv)esp.kq(this.b).a(), (ite)esp.tS(this.b).a(), (itg)esp.kd(this.b).a(), (isq)esp.gB(this.b).a(), (itd)esp.nV(this.b).a(), (isx)esp.mX(this.b).a(), (isw)esp.kZ(this.b).a(), (itk)esp.vp(this.b).a(), (isu)esp.ki(this.b).a(), (gpy)esp.gd(this.b).a(), (MusicDeeplinkMenuItemController)esp.mV(this.b).a());
            }
            case 446: {
                return kan.u(esp.oR(this.b));
            }
            case 445: {
                return gpu.c((vdr)eqy.kE(this.a).a(), (jet)esp.qs(this.b).a());
            }
            case 444: {
                return gpu.t((Activity)esp.oz(this.b).a(), (AccountLinkingController)esp.gc(this.b).a(), (acpk)eqy.kK(this.a).a(), (msr)esp.ox(this.b).a(), (wyw)esp.qg(this.b).a(), esp.cn(this.b), (aeea)eqy.mB(this.a).a());
            }
            case 443: {
                return ljm.t(arlr.b(esp.rr(this.b)));
            }
            case 442: {
                return lgr.h((ldg)esp.vI(this.b).a(), (lag)esp.kf(this.b).a());
            }
            case 441: {
                return lgr.i((Activity)esp.oz(this.b).a(), (tqf)esp.ia(this.b).a(), (lgj)esp.vw(this.b).a(), (c)esp.vV(this.b).a(), (asid)eqy.fU(this.a).a(), (msr)esp.so(this.b).a());
            }
            case 440: {
                return ldi.i(arlr.b(esp.rr(this.b)), (vai)eqy.lg(this.a).a());
            }
            case 439: {
                return ldi.g((msr)esp.sk(this.b).a());
            }
            case 438: {
                return ldi.k((Activity)esp.oz(this.b).a(), (msr)esp.rW(this.b).a());
            }
            case 437: {
                final esp b16 = this.b;
                return lgr.u(esp.vu(b16), (blu)esp.vx(b16).a(), (abij)era.dW(eqy.r(this.a)).a(), esp.yc(this.b), (asid)eqy.fU(this.a).a(), (asid)eqy.fJ(this.a).a(), (abpq)esp.ka(this.b).a(), (abpu)esp.qW(this.b).a());
            }
            case 436: {
                return ldi.q(esp.vz(this.b).a(), (blu)esp.vx(this.b).a(), esp.vu(this.b), gcn.t());
            }
            case 435: {
                return new pvh(this);
            }
            case 434: {
                return new pvh(this);
            }
            case 433: {
                return new pvh(this);
            }
            case 432: {
                return lgr.v((Activity)esp.oz(this.b).a(), esp.zJ(this.b), (pvh)esp.hr(this.b).a(), (addo)esp.vs(this.b).a(), (blu)esp.vx(this.b).a(), (abem)esp.vv(this.b).a());
            }
            case 431: {
                return lgr.s((Activity)esp.oz(this.b).a(), (asid)eqy.fU(this.a).a(), (blu)esp.vx(this.b).a(), (lgj)esp.vw(this.b).a(), (lfz)esp.vt(this.b).a(), (abem)esp.vv(this.b).a(), (msr)esp.sm(this.b).a());
            }
            case 430: {
                return lgr.t((blu)esp.vx(this.b).a(), (aaxx)eqy.iF(this.a).a(), (asid)eqy.fU(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 429: {
                return ldi.l((Context)eqy.ps(this.a).a());
            }
            case 428: {
                return ldi.d();
            }
            case 427: {
                final jdv r = jbu.r((jds)esp.iz(this.b).a(), (jdu)esp.vk(this.b).a(), (msr)esp.ox(this.b).a());
                esp.bF(r);
                return r;
            }
            case 426: {
                return jbu.m((Context)esp.oz(this.b).a(), esp.wV(this.b));
            }
            case 425: {
                return fuu.c((oby)eqy.gH(this.a).a(), (fjv)esp.ra(this.b).a(), (abpu)esp.qW(this.b).a(), (fxw)esp.gn(this.b).a());
            }
            case 424: {
                final esp b17 = this.b;
                final atke pi2 = esp.pI(b17);
                final eqy a4 = this.a;
                return new hwn(pi2, eqy.pK(a4), eqy.kb(a4), eqy.qe(a4), esp.oW(b17), esp.pR(b17), eqy.jn(a4), esp.vg(b17), eqy.ib(a4), eqy.fh(a4), esp.tn(b17), eqy.mT(a4), eqy.kE(a4), eqy.qn(a4), eqy.mB(a4), (char[])null);
            }
            case 423: {
                return isz.n((Activity)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (hwn)esp.ui(this.b).a());
            }
            case 422: {
                return ixx.t((Context)esp.oz(this.b).a(), (aayl)esp.pd(this.b).a(), (its)esp.jb(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.pA(this.b).a(), (abbz)esp.po(this.b).a(), (ViewGroup)esp.qY(this.b).a(), (iri)esp.ip(this.b).a(), (abpq)esp.ka(this.b).a(), (aahc)eqy.ta(this.a).a(), (wyw)esp.qg(this.b).a(), (tqf)esp.ia(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 421: {
                return ixx.m((Context)esp.oz(this.b).a());
            }
            case 420: {
                return ixx.n((iwa)esp.pP(this.b).a(), (aaqz)era.bx(eqy.r(this.a)).a());
            }
            case 419: {
                return fpi.q();
            }
            case 418: {
                return fpi.t((bhv)esp.ir(this.b).a(), (Context)esp.oz(this.b).a(), esp.zT(this.b), (vai)eqy.wc(this.a).a());
            }
            case 417: {
                return ixz.b((Context)esp.oz(this.b).a());
            }
            case 416: {
                return new pvh(this);
            }
            case 415: {
                return new jcf((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (pvh)esp.kj(this.b).a(), null, null, null, null, null);
            }
            case 414: {
                final esp b18 = this.b;
                final ivn c3 = ivh.c((Context)esp.oz(b18).a());
                esp.xh(b18, c3);
                return c3;
            }
            case 413: {
                return ixz.c((Context)esp.oz(this.b).a());
            }
            case 412: {
                return new ixo((Context)esp.oz(this.b).a(), (arwh)eqy.qn(this.a).a(), (byte[])null, (byte[])null);
            }
            case 411: {
                return new NoSoundMemoOverlay((Context)esp.oz(this.b).a());
            }
            case 410: {
                return abzn.o((Context)esp.oz(this.b).a(), (Executor)eqy.lf(this.a).a(), (zlo)eqy.kB(this.a).a(), (otk)eqy.jg(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 409: {
                return new jaq(arlr.b(esp.kO(this.b)), (acbm)esp.iR(this.b).a(), (wyw)eqy.hP(this.a).a());
            }
            case 408: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final acgs acgs = (acgs)eqy.kr(this.a).a();
                final hyx zr = esp.zR(this.b);
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                return new jap(context2, acgs, zr, (rzv)eqy.js(this.a).a(), (wyw)esp.qg(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 407: {
                final Context context3 = (Context)esp.oz(this.b).a();
                final acgs acgs2 = (acgs)eqy.kr(this.a).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                return iyu.h(context3, acgs2, (rzv)eqy.js(this.a).a(), (wyw)esp.qg(this.b).a());
            }
            case 406: {
                return iyu.f((Context)esp.oz(this.b).a(), (jak)esp.wx(this.b).a(), (jap)esp.wz(this.b).a(), (jaq)esp.wC(this.b).a());
            }
            case 405: {
                return ixz.d();
            }
            case 404: {
                return wap.v((Activity)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (aujg)era.bG(eqy.r(this.a)).a(), (zxn)era.bN(eqy.r(this.a)).a(), (xib)esp.lo(this.b).a(), (vai)esp.lg(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 403: {
                return esp.xA(this.b);
            }
            case 402: {
                final esp b19 = this.b;
                final atke oz = esp.oz(b19);
                final atke sg = esp.sG(b19);
                final eqy a5 = this.a;
                return new abrj(oz, sg, era.bS(eqy.r(a5)), esp.oW(b19), esp.tn(b19), esp.iS(b19), eqy.sJ(a5), esp.qg(b19), esp.lg(b19), (byte[])null);
            }
            case 401: {
                final esp b20 = this.b;
                final atke oz2 = esp.oz(b20);
                final atke us = esp.us(b20);
                final atke oz3 = esp.oz(b20);
                final atke lc = esp.lc(b20);
                final eqy a6 = this.a;
                return new wfi(oz2, us, oz3, lc, eqy.kr(a6), esp.qo(b20), eqy.kK(a6), esp.oW(b20), era.bO(eqy.r(a6)), era.bN(eqy.r(a6)), esp.lj(b20), esp.qr(b20), era.bh(eqy.r(a6)), esp.ja(b20), era.bP(eqy.r(a6)), esp.ld(b20), esp.tn(b20), esp.sD(b20), esp.nB(b20), era.bQ(eqy.r(a6)), esp.he(b20), esp.iR(b20), esp.iS(b20), esp.lg(b20), eqy.hK(a6));
            }
            case 400: {
                return abzn.q();
            }
        }
    }
    
    private final Object m() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 599: {
                return jbu.q((msr)esp.ox(this.b).a(), (tmx)eqy.sX(this.a).a());
            }
            case 598: {
                return lgr.n((fjv)esp.ra(this.b).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (asid)eqy.fU(this.a).a(), (abdx)esp.ws(this.b).a(), (abho)esp.gz(this.b).a(), (CreatorEndscreenOverlayPresenter)esp.pc(this.b).a(), (iuv)esp.hM(this.b).a(), (msr)eqy.in(this.a).a(), (mdp)eqy.im(this.a).a(), (jct)esp.iF(this.b).a());
            }
            case 597: {
                return jbu.g((jdg)esp.rQ(this.b).a(), arlr.b(esp.tm(this.b)), (acbm)esp.iR(this.b).a(), (wyw)esp.qg(this.b).a());
            }
            case 596: {
                return new MdxOverlaysPresenter((xnt)eqy.mi(this.a).a(), (iat)esp.mv(this.b).a(), (iap)esp.qu(this.b).a(), (isj)esp.mp(this.b).a(), (xsj)eqy.mm(this.a).a());
            }
            case 595: {
                final esp b = this.b;
                final itr r = isz.r((acql)esp.qE(b).a(), (arwh)eqy.qn(this.a).a(), (vai)eqy.wc(this.a).a(), (itq)esp.gz(this.b).a(), (abhm)esp.gx(this.b).a(), (uwb)esp.jM(this.b).a(), (msr)esp.ox(this.b).a());
                esp.xa(b, r);
                return r;
            }
            case 594: {
                return ixy.v((abpq)esp.ka(this.b).a(), (Context)esp.oz(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 593: {
                return ixz.g((Activity)esp.oz(this.b).a(), (YouTubeControlsOverlay)esp.wA(this.b).a(), era.fB(eqy.r(this.a)), (itk)esp.vp(this.b).a());
            }
            case 592: {
                return ixy.o(esp.yL(this.b), (abcr)esp.ph(this.b).a(), (Context)esp.oz(this.b).a(), (abpu)esp.qW(this.b).a());
            }
            case 591: {
                return ixz.i((Context)esp.oz(this.b).a(), (ViewGroup)esp.qY(this.b).a());
            }
            case 590: {
                return ixy.m((jcp)esp.wI(this.b).a(), (abde)esp.qb(this.b).a(), (aavm)esp.sf(this.b).a());
            }
            case 589: {
                return fpi.k((abdb)esp.rE(this.b).a(), (abse)era.at(eqy.r(this.a)).a(), (abtw)eqy.uS(this.a).a(), esp.eh(this.b), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (vaf)eqy.pn(this.a).a());
            }
            case 588: {
                return hzk.c((otk)eqy.jg(this.a).a());
            }
            case 587: {
                final Context context = (Context)esp.oz(this.b).a();
                final wbf wbf = (wbf)esp.lm(this.b).a();
                final wbj dp = esp.dP(this.b);
                final asht asht = (asht)esp.qm(this.b).a();
                final vcy vcy = (vcy)esp.pA(this.b).a();
                final arkg b2 = arlr.b(esp.tm(this.b));
                final acbm acbm = (acbm)esp.iR(this.b).a();
                final esp b3 = this.b;
                return wap.q(context, wbf, dp, asht, vcy, b2, acbm, esp.iR(b3), (wyw)esp.qg(b3).a(), (xib)esp.lo(this.b).a(), (vai)esp.vZ(this.b).a(), (vyx)esp.ln(this.b).a(), (c)esp.eE(this.b), esp.wV(this.b));
            }
            case 586: {
                final ity q = isz.q((Context)esp.oz(this.b).a(), (itw)esp.wF(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.pA(this.b).a(), (tqf)esp.ia(this.b).a(), (aahc)eqy.ta(this.a).a(), (zpk)eqy.sK(this.a).a(), (wyw)esp.qg(this.b).a(), (aazj)eqy.hr(this.a).a(), (uwb)esp.jM(this.b).a(), (abcd)esp.ll(this.b).a(), (aaon)esp.wy(this.b).a(), (msr)esp.ox(this.b).a());
                esp.bJ(q);
                return q;
            }
            case 585: {
                return ivh.i((ixv)esp.ob(this.b).a(), (asid)eqy.fU(this.a).a());
            }
            case 584: {
                return isz.d(esp.cn(this.b), (abbf)era.fO(eqy.r(this.a)).a());
            }
            case 583: {
                return ixx.j((ixc)esp.mK(this.b).a(), (aavi)esp.se(this.b).a(), (gil)esp.nK(this.b).a(), (isy)esp.nf(this.b).a(), (PreviousPaddleMenuItemController)esp.op(this.b).a());
            }
            case 582: {
                return ixy.k((abpq)esp.ka(this.b).a(), (abpl)esp.jY(this.b).a(), (abcw)esp.pp(this.b).a(), (aapa)eqy.pF(this.a).a());
            }
            case 581: {
                return ixy.i((abpq)esp.ka(this.b).a(), (itd)esp.nV(this.b).a());
            }
            case 580: {
                return ixx.k((aavi)esp.se(this.b).a(), (itj)esp.vh(this.b).a());
            }
            case 579: {
                return ixy.e(era.d(eqy.r(this.a)), (abpq)esp.ka(this.b).a(), (abee)esp.pq(this.b).a(), (xnt)eqy.mi(this.a).a());
            }
            case 578: {
                return fpi.n((bu)esp.pI(this.b).a(), (abpq)esp.ka(this.b).a(), (itg)esp.kd(this.b).a(), (abdk)esp.rF(this.b).a());
            }
            case 577: {
                return ixx.d((abpq)esp.ka(this.b).a(), (isq)esp.gB(this.b).a());
            }
            case 576: {
                return ixx.c((abdn)esp.oD(this.b).a(), (acgs)eqy.kr(this.a).a());
            }
            case 575: {
                final aaqz aaqz = (aaqz)era.bx(eqy.r(this.a)).a();
                final eqy a = this.a;
                final atke fb = era.fB(eqy.r(a));
                final tgd tgd = (tgd)eqy.jn(a).a();
                final itj itj = (itj)esp.vh(this.b).a();
                final qv qv = (qv)esp.oc(this.b).a();
                final sja sja = (sja)esp.oC(this.b).a();
                final abbv abbv = (abbv)esp.oZ(this.b).a();
                final abbj abbj = (abbj)esp.oP(this.b).a();
                final abdj abdj = (abdj)esp.rJ(this.b).a();
                final abeh abeh = (abeh)esp.qv(this.b).a();
                final abcv abcv = (abcv)esp.qV(this.b).a();
                final abcz abcz = (abcz)esp.rf(this.b).a();
                final ixs ixs = (ixs)esp.oa(this.b).a();
                final sjy sjy = (sjy)esp.rL(this.b).a();
                final sjm sjm = (sjm)esp.qD(this.b).a();
                final LiveOverlayPresenter liveOverlayPresenter = (LiveOverlayPresenter)esp.lR(this.b).a();
                final aazi aazi = (aazi)esp.wE(this.b).a();
                final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = (CreatorEndscreenOverlayPresenter)esp.pc(this.b).a();
                final SubtitlesOverlayPresenter subtitlesOverlayPresenter = (SubtitlesOverlayPresenter)esp.gO(this.b).a();
                final abcp abcp = (abcp)esp.qG(this.b).a();
                final aauw aauw = (aauw)esp.pQ(this.b).a();
                final aavh aavh = (aavh)esp.sd(this.b).a();
                final abcs abcs = (abcs)esp.qT(this.b).a();
                final ism ism = (ism)esp.wy(this.b).a();
                final itr itr = (itr)esp.gy(this.b).a();
                final MdxOverlaysPresenter mdxOverlaysPresenter = (MdxOverlaysPresenter)esp.mu(this.b).a();
                final jdh jdh = (jdh)esp.uJ(this.b).a();
                final NoSoundMemoOverlay noSoundMemoOverlay = (NoSoundMemoOverlay)esp.nj(this.b).a();
                final iyy iyy = (iyy)esp.vF(this.b).a();
                final ixo ixo = (ixo)esp.nD(this.b).a();
                final abpu abpu = (abpu)esp.qW(this.b).a();
                final wbi wbi = (wbi)esp.ll(this.b).a();
                final fps fps = (fps)esp.of(this.b).a();
                final isa xb = esp.xB(this.b);
                final jbh jbh = (jbh)esp.jv(this.b).a();
                final esp b4 = this.b;
                return ips.n(aaqz, fb, tgd, itj, qv, sja, abbv, abbj, abdj, abeh, abcv, abcz, ixs, sjy, sjm, liveOverlayPresenter, aazi, creatorEndscreenOverlayPresenter, subtitlesOverlayPresenter, abcp, aauw, aavh, abcs, ism, itr, mdxOverlaysPresenter, jdh, noSoundMemoOverlay, iyy, ixo, abpu, wbi, fps, xb, jbh, esp.vU(b4), (isk)esp.uH(b4).a(), (abag)esp.gM(this.b).a(), (ixw)esp.oe(this.b).a(), esp.xz(this.b), esp.cy(this.b));
            }
            case 574: {
                return ljk.c((DefaultInlinePlayerControls)esp.ie(this.b).a());
            }
            case 573: {
                final Context context2 = (Context)eqy.ps(this.a).a();
                final acgs acgs = (acgs)eqy.kr(this.a).a();
                final glb glb = (glb)eqy.mR(this.a).a();
                return new fbk(context2, acgs, (arwh)eqy.qn(this.a).a(), (fa)esp.oF(this.b).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a(), (byte[])null, (byte[])null);
            }
            case 572: {
                return kxz.b((fjv)esp.ra(this.b).a(), (wyw)esp.qg(this.b).a());
            }
            case 571: {
                return new fom();
            }
            case 570: {
                return new irs();
            }
            case 569: {
                return ggm.n((Context)esp.oz(this.b).a(), (skt)esp.qH(this.b).a(), (wyv)esp.ow(this.b).a(), (gbc)esp.oR(this.b).a());
            }
            case 568: {
                return ggm.m((Context)esp.oz(this.b).a(), (tjm)eqy.ib(this.a).a(), (skt)esp.qH(this.b).a(), (fjv)esp.ra(this.b).a(), (abpq)esp.ka(this.b).a(), (gkc)esp.ua(this.b).a(), (zml)eqy.hN(this.a).a(), (zmf)eqy.pK(this.a).a(), (abpu)esp.qW(this.b).a(), (tgd)eqy.jn(this.a).a(), (riq)eqy.pK(this.a).a());
            }
            case 567: {
                return gcn.d((vaf)eqy.pn(this.a).a(), esp.wW(this.b));
            }
            case 566: {
                return fuu.i((gbc)esp.oR(this.b).a(), (Handler)eqy.sJ(this.a).a(), (acgs)eqy.kr(this.a).a(), (Context)esp.oz(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 565: {
                return fuu.g((fa)esp.oF(this.b).a());
            }
            case 564: {
                return ljm.g((Activity)esp.oz(this.b).a());
            }
            case 563: {
                return kan.j((Activity)esp.oz(this.b).a(), arlr.b(esp.oK(this.b)), arlr.b(esp.pw(this.b)), (arwh)eqy.qn(this.a).a(), (vai)era.eI(eqy.r(this.a)).a());
            }
            case 562: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                return ljm.l(activity);
            }
            case 561: {
                return jts.i(arlr.b(esp.qF(this.b)), (Activity)esp.oz(this.b).a(), arlr.b(esp.pw(this.b)));
            }
            case 560: {
                return jts.h((acwt)esp.sD(this.b).a(), arlr.b(esp.oI(this.b)), (tmx)era.ed(eqy.r(this.a)).a(), (aun)esp.pI(this.b).a(), (oby)eqy.gH(this.a).a());
            }
            case 559: {
                return ljm.e((Activity)esp.oz(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 558: {
                return jts.k((Activity)esp.oz(this.b).a(), arlr.b(esp.oI(this.b)), arlr.b(esp.pw(this.b)), esp.ep(this.b), (arwh)eqy.qn(this.a).a());
            }
            case 557: {
                return ljm.j((ViewGroup)esp.rr(this.b).a());
            }
            case 556: {
                return jts.g((Activity)esp.oz(this.b).a(), arlr.b(esp.pw(this.b)), arlr.b(esp.tm(this.b)), (acbm)esp.iR(this.b).a());
            }
            case 555: {
                return ljm.p((Activity)esp.oz(this.b).a(), (ldg)esp.vI(this.b).a(), (kcq)esp.rz(this.b).a(), (ashi)esp.sx(this.b).a());
            }
            case 554: {
                return ljh.m((faq)esp.sA(this.b).a());
            }
            case 553: {
                return jts.o((arwh)eqy.qn(this.a).a(), esp.wW(this.b), (Activity)esp.oz(this.b).a(), (vef)eqy.nJ(this.a).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (hze)era.by(eqy.r(this.a)).a(), (tmx)eqy.ox(this.a).a(), (gkx)eqy.hv(this.a).a(), (gfk)eqy.kK(this.a).a(), (acgs)eqy.kr(this.a).a(), (msr)esp.ox(this.b).a());
            }
            case 552: {
                return ljl.l((Context)esp.oz(this.b).a(), (vaf)eqy.pn(this.a).a(), (vcy)esp.oW(this.b).a(), (vai)era.eI(eqy.r(this.a)).a(), era.gD(eqy.r(this.a)));
            }
            case 551: {
                return lkh.f((oby)eqy.gH(this.a).a(), (acvw)esp.pR(this.b).a(), (wyv)esp.ow(this.b).a(), arlr.b(era.dH(eqy.r(this.a))), (aun)esp.pI(this.b).a());
            }
            case 550: {
                return jts.c((bu)esp.pI(this.b).a(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 549: {
                final esp b5 = this.b;
                final atke ow = esp.oW(b5);
                final eqy a2 = this.a;
                return new lmo(ow, eqy.kK(a2), esp.pR(b5), esp.oz(b5), era.aa(eqy.r(a2)), esp.rS(b5), eqy.gl(a2), esp.ox(b5), (byte[])null, (byte[])null);
            }
            case 548: {
                final bu bu = (bu)esp.pI(this.b).a();
                final mam mam = (mam)esp.wg(this.b).a();
                final iaw iaw = (iaw)esp.mD(this.b).a();
                final fzm fzm = (fzm)esp.tB(this.b).a();
                final vaf vaf2 = (vaf)eqy.pn(this.a).a();
                final esp b6 = this.b;
                return jts.l(bu, mam, iaw, fzm, vaf2, esp.ky(b6), (WatchOnTvMenuItem)esp.vN(b6).a(), esp.wW(this.b), (vai)eqy.lv(this.a).a());
            }
            case 547: {
                return hzk.f((Activity)esp.oz(this.b).a(), (gkx)eqy.hv(this.a).a(), (xbt)eqy.jD(this.a).a(), (vai)eqy.vx(this.a).a());
            }
            case 546: {
                return new gfg((Context)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a(), (get)eqy.kI(this.a).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 545: {
                return new jsm((gfg)esp.kG(this.b).a(), (Context)esp.oz(this.b).a(), 2);
            }
            case 544: {
                return ljl.r((fa)esp.oF(this.b).a(), (tjm)eqy.ib(this.a).a());
            }
            case 543: {
                return new jxz((ghe)esp.wl(this.b).a(), (tjm)eqy.ib(this.a).a(), (skt)esp.qH(this.b).a(), (tqn)eqy.fh(this.a).a(), era.gU(eqy.r(this.a)), (Context)esp.oz(this.b).a(), (elx)eqy.un(this.a).a(), (vai)eqy.lu(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 542: {
                return jts.r((zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a(), (bu)esp.pI(this.b).a(), (mam)esp.wg(this.b).a(), (iaw)esp.mD(this.b).a(), (fzm)esp.tB(this.b).a(), (skt)esp.qH(this.b).a(), (vaf)eqy.pn(this.a).a(), esp.ky(this.b), (bx)era.H(eqy.r(this.a)), (WatchOnTvMenuItem)esp.vN(this.b).a(), esp.wW(this.b), (vai)eqy.lv(this.a).a());
            }
            case 541: {
                final Activity activity2 = (Activity)esp.oz(this.b).a();
                final vaf vaf3 = (vaf)eqy.pn(this.a).a();
                final arwh arwh = (arwh)eqy.qn(this.a).a();
                final asid asid = (asid)eqy.fU(this.a).a();
                final gae gae = (gae)esp.qj(this.b).a();
                final gae gae2 = (gae)esp.qk(this.b).a();
                final wyv wyv = (wyv)esp.ow(this.b).a();
                final ghe ghe = (ghe)esp.wl(this.b).a();
                final lmo lmo = (lmo)esp.mO(this.b).a();
                final lmo yt = esp.yt(this.b);
                final esp b7 = this.b;
                final atke md = esp.mD(b7);
                final ghb ghb = (ghb)esp.il(b7).a();
                final fzm fzm2 = (fzm)esp.tB(this.b).a();
                final jxy jxy = (jxy)esp.ru(this.b).a();
                final esp b8 = this.b;
                return jts.v(activity2, vaf3, arwh, asid, gae, gae2, wyv, ghe, lmo, yt, md, ghb, fzm2, jxy, esp.uQ(b8), esp.zp(b8), esp.yl(this.b), era.aa(eqy.r(this.a)).a(), ikh.q(), eqy.zP(this.a), (jxm)esp.lU(this.b).a(), (msr)esp.ox(this.b).a(), (hze)era.by(eqy.r(this.a)).a(), (asht)esp.ot(this.b).a(), (aeea)esp.hB(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 540: {
                return ljm.h((Activity)esp.oz(this.b).a());
            }
            case 539: {
                return ljm.i((ConstraintLayout)esp.oL(this.b).a());
            }
            case 538: {
                final fa fa = (fa)esp.oF(this.b).a();
                final AppTabsBar appTabsBar = (AppTabsBar)esp.oM(this.b).a();
                final ViewGroup br = esp.bR(this.b);
                final ConstraintLayout constraintLayout = (ConstraintLayout)esp.oL(this.b).a();
                final jxc jxc = (jxc)esp.gg(this.b).a();
                final esp b9 = this.b;
                return jts.q(fa, appTabsBar, br, constraintLayout, jxc, esp.re(b9), esp.or(b9), (wyv)esp.ow(b9).a(), (vaf)eqy.pn(this.a).a(), (fzl)esp.wc(this.b).a(), (jyf)esp.uy(this.b).a(), (jyi)esp.jp(this.b).a(), (jzn)esp.mW(this.b).a(), esp.eq(this.b), (ElevatedAppBarLayout)esp.pw(this.b).a(), (fzg)esp.gf(this.b).a(), jex.s(), (arwh)eqy.qn(this.a).a(), (asid)eqy.fU(this.a).a(), (lag)esp.kf(this.b).a(), (msr)esp.ox(this.b).a(), (ghb)esp.il(this.b).a(), (tqf)esp.ia(this.b).a(), (vai)eqy.lv(this.a).a());
            }
            case 537: {
                final esp b10 = this.b;
                return lkh.i(esp.uQ(b10), (fam)esp.wn(b10).a());
            }
            case 536: {
                return mft.F((Activity)esp.oz(this.b).a(), esp.wk(this.b));
            }
            case 535: {
                final Activity activity3 = (Activity)esp.oz(this.b).a();
                final a a3 = (a)esp.sq(this.b).a();
                final fxh fxh = (fxh)esp.uY(this.b).a();
                final iaw iaw2 = (iaw)esp.mD(this.b).a();
                final eqy a4 = this.a;
                return new ksj(activity3, a3, fxh, iaw2, eqy.qV(a4), eqy.mq(a4), (byte[])null);
            }
            case 534: {
                return new uak((xhp)esp.mE(this.b).a(), (iav)esp.mD(this.b).a());
            }
            case 533: {
                final xbv xbv = (xbv)eqy.qK(this.a).a();
                final arwh arwh2 = (arwh)eqy.qn(this.a).a();
                final vaf vaf4 = (vaf)eqy.pn(this.a).a();
                return hzk.v(xbv, arwh2, (msr)esp.ox(this.b).a(), (asid)eqy.fU(this.a).a(), (aeea)era.cg(eqy.r(this.a)).a(), (Context)esp.oz(this.b).a(), (xbt)eqy.jD(this.a).a());
            }
            case 532: {
                final tgd tgd2 = (tgd)eqy.jn(this.a).a();
                final eqy a5 = this.a;
                final atke qv2 = eqy.qV(a5);
                final atke qu = eqy.qU(a5);
                final xip xip = (xip)eqy.lx(a5).a();
                final ggj ggj = (ggj)era.ce(eqy.r(this.a)).a();
                final xnt xnt = (xnt)eqy.mi(this.a).a();
                final eqy a6 = this.a;
                return new xhp(tgd2, qv2, qu, xip, ggj, xnt, eqy.mq(a6), (xdo)eqy.pe(a6).a(), (xdr)eqy.pf(this.a).a(), (xbv)eqy.qK(this.a).a(), (xbt)eqy.jD(this.a).a(), (bx)esp.mi(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 531: {
                final tgd tgd3 = (tgd)eqy.jn(this.a).a();
                final arkg b11 = arlr.b(eqy.mq(this.a));
                final arkg b12 = arlr.b(esp.mE(this.b));
                final Handler handler = (Handler)eqy.sJ(this.a).a();
                final arkg b13 = arlr.b(esp.mD(this.b));
                final arkg b14 = arlr.b(esp.mC(this.b));
                final arkg b15 = arlr.b(esp.mF(this.b));
                final arkg b16 = arlr.b(esp.uY(this.b));
                final arkg b17 = arlr.b(era.cM(eqy.r(this.a)));
                final esp b18 = this.b;
                return lmb.e(tgd3, b11, b12, handler, b13, b14, b15, b16, b17, esp.mz(b18), arlr.b(esp.sD(b18)), arlr.b(era.aQ(eqy.r(this.a))), arlr.b(eqy.pu(this.a)), arlr.b(eqy.lN(this.a)), arlr.b(esp.gf(this.b)), arlr.b(esp.wn(this.b)), arlr.b(esp.ow(this.b)), arlr.b(esp.sA(this.b)), esp.qy(this.b), arlr.b(eqy.lO(this.a)), arlr.b(eqy.hW(this.a)));
            }
            case 530: {
                return kan.f((bu)esp.pI(this.b).a(), (lag)esp.kf(this.b).a(), arlr.b(esp.kc(this.b)), arlr.b(esp.ka(this.b)), arlr.b(esp.uo(this.b)), arlr.b(esp.sP(this.b)), arlr.b(esp.uL(this.b)), arlr.b(eqy.pK(this.a)), arlr.b(eqy.ho(this.a)));
            }
            case 529: {
                return gpu.f((bu)esp.pI(this.b).a(), arlr.b(esp.qs(this.b)), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 528: {
                return gqz.p();
            }
            case 527: {
                final eqy a7 = this.a;
                return new kyc(eqy.kh(a7), (vaf)eqy.pn(a7).a());
            }
            case 526: {
                return ljk.e((vcy)esp.oW(this.b).a());
            }
            case 525: {
                return ixz.f((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (ViewGroup)esp.qY(this.b).a());
            }
            case 524: {
                return ixy.g((isl)esp.la(this.b).a(), (aavq)esp.sc(this.b).a());
            }
            case 523: {
                final esp b19 = this.b;
                final ism v = ips.v((aaot)esp.qC(b19).a(), (isn)eqy.wi(this.a).a(), (fzw)era.fK(eqy.r(this.a)).a(), (vcy)esp.pz(this.b).a(), (wyw)esp.qg(this.b).a(), (abpl)esp.jY(this.b).a(), (trc)eqy.vM(this.a).a(), (tjm)eqy.ib(this.a).a(), (ewy)era.aM(eqy.r(this.a)).a(), (tgd)eqy.jn(this.a).a(), (arwh)eqy.qn(this.a).a(), (kyf)esp.iA(this.b).a(), (fzb)esp.vc(this.b).a(), esp.ej(this.b), (fnt)esp.jU(this.b).a(), eqy.tb(this.a), (jbh)esp.jv(this.b).a(), (Context)esp.oz(this.b).a(), (aeea)eqy.mB(this.a).a(), esp.wV(this.b));
                esp.xv(b19, v);
                return v;
            }
            case 522: {
                return new gil();
            }
            case 521: {
                final gif l = ggm.l((Activity)esp.oz(this.b).a(), (hzm)esp.ht(this.b).a(), (gil)esp.nK(this.b).a(), (aaon)esp.wy(this.b).a(), (skc)eqy.hr(this.a).a(), (wyw)esp.qg(this.b).a(), (aaxx)eqy.iF(this.a).a(), (vai)eqy.wc(this.a).a(), (vaf)eqy.pn(this.a).a());
                esp.bB((Object)l);
                return l;
            }
            case 520: {
                return fqs.c((vjg)eqy.nX(this.a).a(), (abpu)eqy.rY(this.a).a());
            }
            case 519: {
                return hoy.t((msr)esp.ox(this.b).a(), (Optional)esp.rl(this.b).a(), (PipPlayerObserver)esp.nJ(this.b).a());
            }
            case 518: {
                final esp b20 = this.b;
                return hoy.m(esp.wq(b20), esp.rm(b20));
            }
            case 517: {
                final esp b21 = this.b;
                return lgr.e(esp.ra(b21), esp.ip(b21));
            }
            case 516: {
                return ggm.q((msr)esp.ox(this.b).a(), (vaf)eqy.pn(this.a).a(), (Optional)esp.rl(this.b).a(), (gin)esp.nc(this.b).a(), (gin)esp.wo(this.b).a(), (abty)esp.qR(this.b).a(), (abty)esp.qS(this.b).a());
            }
            case 515: {
                final msr msr = (msr)esp.ox(this.b).a();
                final bu bu2 = (bu)esp.pI(this.b).a();
                final hzm hzm = (hzm)esp.ht(this.b).a();
                final arwh arwh3 = (arwh)eqy.qn(this.a).a();
                final esp b22 = this.b;
                return ggm.u(msr, bu2, hzm, arwh3, esp.nF(b22), (eg)esp.nI(b22).a());
            }
            case 514: {
                return new eg((Context)eqy.ps(this.a).a(), (arwh)eqy.qn(this.a).a(), era.aL(eqy.r(this.a)), (byte[])null, (byte[])null);
            }
            case 513: {
                final bu bu3 = (bu)esp.pI(this.b).a();
                final hzm hzm2 = (hzm)esp.ht(this.b).a();
                final esp b23 = this.b;
                final atke qw = esp.qW(b23);
                final atke ka = esp.ka(b23);
                final atke nf = esp.nF(b23);
                final atke nl = esp.nL(b23);
                final eqy a8 = this.a;
                final DefaultPipController t = ggm.t(bu3, hzm2, qw, ka, nf, nl, era.cD(eqy.r(a8)), esp.nE(b23), eqy.mi(a8), esp.gA(b23), eqy.jr(a8), arlr.b(eqy.rd(a8)), arlr.b(esp.nP(this.b)), (eg)esp.nI(this.b).a(), (vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (vai)eqy.wc(this.a).a());
                esp.bt(t);
                return t;
            }
            case 512: {
                final esp b24 = this.b;
                return ljl.d(esp.im(b24), esp.nF(b24));
            }
            case 511: {
                final gbc gbc = (gbc)esp.oR(this.b).a();
                final acwt acwt = (acwt)esp.sD(this.b).a();
                final cl cl = (cl)esp.rK(this.b).a();
                era.gU(eqy.r(this.a));
                return new e(gbc, acwt, cl, (oiu)esp.iT(this.b).a());
            }
            case 510: {
                final esp b25 = this.b;
                final lcc p = kxz.p((Context)esp.oz(b25).a(), (vai)eqy.wc(this.a).a(), (lco)esp.nb(this.b).a(), (abpu)esp.qW(this.b).a(), (lcd)esp.iI(this.b).a(), (tgd)eqy.jn(this.a).a(), (jej)esp.vn(this.b).a(), (jki)esp.uU(this.b).a());
                esp.xe(b25, p);
                return p;
            }
            case 509: {
                return kxz.r((lco)esp.nb(this.b).a(), (lcc)esp.iH(this.b).a(), (msr)esp.ox(this.b).a());
            }
            case 508: {
                return jbu.t((Context)esp.oz(this.b).a(), (jej)esp.vn(this.b).a(), (jki)esp.uU(this.b).a(), (abty)esp.qR(this.b).a(), (iuv)esp.hM(this.b).a(), (lgj)esp.vW(this.b).a(), (msr)esp.ox(this.b).a());
            }
            case 507: {
                return new pvh(this);
            }
            case 506: {
                return ixy.t(esp.Ai(this.b));
            }
            case 505: {
                return new pvh(this);
            }
            case 504: {
                return iyu.n((jbh)esp.jv(this.b).a(), (fpn)esp.ws(this.b).a(), (jba)esp.jq(this.b).a(), (arfk)esp.ju(this.b).a(), esp.yI(this.b), (fjv)esp.ra(this.b).a(), (msr)esp.ox(this.b).a(), (wyw)esp.qg(this.b).a(), esp.wV(this.b));
            }
            case 503: {
                return gqz.b();
            }
            case 502: {
                return abaq.s((abpu)eqy.kg(this.a).a(), esp.Aj(this.b));
            }
            case 501: {
                final esp b26 = this.b;
                final iyh q2 = ixz.q((Handler)eqy.sJ(this.a).a(), (iuv)esp.hM(this.b).a(), (atjz)esp.pa(this.b).a(), (wyw)esp.qg(this.b).a(), eqy.xU(this.a));
                esp.xq(b26, (Object)q2);
                return q2;
            }
            case 500: {
                return ivh.d((wyw)esp.qf(this.b).a(), (vaf)eqy.pn(this.a).a(), (jbi)esp.jv(this.b).a());
            }
        }
    }
    
    private final Object n() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 699: {
                return new etb((vcy)esp.oW(this.b).a(), (bu)esp.pI(this.b).a(), (man)eqy.ep(this.a).a(), (Executor)eqy.oN(this.a).a(), esp.Aa(this.b), (zmf)eqy.pK(this.a).a(), (fam)esp.wn(this.b).a(), (abpl)esp.jY(this.b).a(), (xnt)eqy.mi(this.a).a(), (ghb)esp.il(this.b).a(), null, null, null, null, null, null);
            }
            case 698: {
                return gns.k((Activity)esp.oz(this.b).a(), (vgy)eqy.eL(this.a).a(), (fbb)esp.uz(this.b).a(), (LoggingUrlsPingController)esp.lT(this.b).a(), (acar)eqy.pE(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 697: {
                return gpb.n((wyv)esp.ow(this.b).a());
            }
            case 696: {
                return gpb.m((wyv)esp.ow(this.b).a());
            }
            case 695: {
                return gpb.q((vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a(), (vgy)eqy.eL(this.a).a());
            }
            case 694: {
                return gpb.v((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (vgy)eqy.eL(this.a).a(), (hyx)era.cA(eqy.r(this.a)).a(), (wyv)esp.ow(this.b).a(), (fbb)esp.uz(this.b).a(), (arwh)eqy.qn(this.a).a());
            }
            case 693: {
                return new eyz((vtn)eqy.mP(this.a).a(), (vcy)esp.oW(this.b).a(), (tqd)eqy.qe(this.a).a(), 2);
            }
            case 692: {
                return fpi.e((abpu)esp.qW(this.b).a());
            }
            case 691: {
                return hzk.g((xnt)eqy.mi(this.a).a(), esp.eg(this.b), (tqd)eqy.qe(this.a).a(), (Context)eqy.ps(this.a).a(), (abnl)esp.jX(this.b).a(), (kui)esp.wn(this.b).a(), (lag)esp.kf(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 690: {
                return gku.u((bu)esp.pI(this.b).a(), (zmf)eqy.pK(this.a).a(), (zmt)eqy.kb(this.a).a(), (tqd)eqy.qe(this.a).a(), era.hf(eqy.r(this.a)), (bx)esp.mi(this.b).a());
            }
            case 689: {
                return fbd.v((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (tgd)eqy.jn(this.a).a(), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 688: {
                return fbd.u((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 687: {
                return fbd.g((skc)eqy.hr(this.a).a(), (tgd)eqy.jn(this.a).a(), (bu)esp.pI(this.b).a(), (wyv)esp.ow(this.b).a(), (abpq)esp.ka(this.b).a(), (Executor)eqy.fT(this.a).a());
            }
            case 686: {
                return new ojg((acwb)esp.ry(this.b).a());
            }
            case 685: {
                return ljm.s((Handler)eqy.sJ(this.a).a(), (abpu)esp.qW(this.b).a(), (abpq)esp.ka(this.b).a(), (trc)eqy.vM(this.a).a(), (wxx)eqy.tf(this.a).a(), (wyw)esp.qg(this.b).a(), (vcy)esp.oW(this.b).a(), (ojg)esp.wv(this.b).a());
            }
            case 684: {
                return abaq.m((abiq)esp.sz(this.b).a());
            }
            case 683: {
                return gpu.q((bu)esp.pI(this.b).a(), esp.cP(this.b), (man)eqy.ep(this.a).a(), (zmf)eqy.pK(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 682: {
                return gpu.j((wxx)eqy.tf(this.a).a());
            }
            case 681: {
                return rid.l((rna)eqy.wh(this.a).a(), (Activity)esp.oz(this.b).a(), (rlt)eqy.iv(this.a).a(), (vmz)eqy.et(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 680: {
                return fcv.o((vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 679: {
                return gpu.r((Activity)esp.oz(this.b).a(), (gqs)era.fq(eqy.r(this.a)).a(), (man)eqy.ep(this.a).a(), (zmf)eqy.pK(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 678: {
                return gpu.u((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (acpk)eqy.kK(this.a).a(), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 677: {
                return gpu.s((acmr)eqy.hK(this.a).a());
            }
            case 676: {
                return gpu.d((bu)esp.pI(this.b).a(), (vzg)esp.lf(this.b).a(), esp.km(this.b).a(), (ril)eqy.pK(this.a).a(), (vef)eqy.nJ(this.a).a(), (vdr)eqy.kE(this.a).a(), (PlayBilling)esp.nP(this.b).a(), (adia)eqy.pl(this.a).a(), (asid)eqy.fU(this.a).a(), (vcy)esp.oW(this.b).a(), arlr.b(esp.qs(this.b)));
            }
            case 675: {
                return uzu.i((vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (asid)eqy.fU(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 674: {
                return gku.v((Context)esp.oz(this.b).a(), (acpk)eqy.kK(this.a).a(), (aeea)esp.iE(this.b).a(), (acnc)esp.hW(this.b).a(), (aeea)eqy.mB(this.a).a(), (fjv)esp.ra(this.b).a());
            }
            case 673: {
                return fbd.i(arlr.b(eqy.rd(this.a)), arlr.b(esp.hw(this.b)), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (asid)eqy.fU(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 672: {
                return tny.k(arlr.b(eqy.rd(this.a)), (vcy)esp.oW(this.b).a());
            }
            case 671: {
                return fbd.l((bu)esp.pI(this.b).a(), esp.oO(this.b));
            }
            case 670: {
                return tny.j(arlr.b(eqy.rd(this.a)), arlr.b(esp.qA(this.b)), (vcy)esp.oW(this.b).a());
            }
            case 669: {
                return gpu.i((bu)esp.pI(this.b).a(), (gqh)era.br(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a());
            }
            case 668: {
                return sao.l();
            }
            case 667: {
                return sao.r((man)esp.tw(this.b).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 666: {
                return sao.c((tgd)eqy.jn(this.a).a());
            }
            case 665: {
                return sao.q((tgd)eqy.jn(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 664: {
                return sao.e((tgd)eqy.jn(this.a).a());
            }
            case 663: {
                return sao.o((bu)esp.pI(this.b).a(), srz.p());
            }
            case 662: {
                return sao.f(esp.hR(this.b));
            }
            case 661: {
                return fdq.j((vcy)esp.oW(this.b).a());
            }
            case 660: {
                return wji.u((vln)eqy.rS(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), (tjb)eqy.oQ(this.a).a(), (aacf)eqy.ln(this.a).a());
            }
            case 659: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final esp b = this.b;
                return new adaj(activity, esp.oW(b), esp.iE(b), eqy.mB(this.a));
            }
            case 658: {
                return fcv.u((aun)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), (adaj)esp.go(this.b).a(), (wwv)eqy.ka(this.a).a(), (asid)eqy.fU(this.a).a(), (aacf)eqy.ln(this.a).a(), (tmx)era.dv(eqy.r(this.a)).a(), (adfs)esp.tz(this.b).a(), (asid)eqy.fJ(this.a).a(), (abkn)eqy.lm(this.a).a());
            }
            case 657: {
                return fcv.e((fcw)esp.jV(this.b).a());
            }
            case 656: {
                return fcv.f((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 655: {
                return fcv.m((abpu)esp.qW(this.b).a());
            }
            case 654: {
                return gpu.o((bu)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), (kui)esp.wn(this.b).a(), (kuh)esp.wn(this.b).a(), (wyv)esp.ow(this.b).a(), (abpq)esp.ka(this.b).a(), (elx)esp.gi(this.b).a(), (ggr)esp.qL(this.b).a());
            }
            case 653: {
                final Activity activity2 = (Activity)esp.oz(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final Executor executor = (Executor)eqy.fT(this.a).a();
                final esp b2 = this.b;
                return gpu.l(activity2, vcy, executor, esp.nL(b2), esp.ka(b2), (hzm)esp.ht(b2).a(), (vaf)eqy.pn(this.a).a());
            }
            case 652: {
                return new fec(2);
            }
            case 651: {
                return rne.c(esp.eU(this.b), esp.fc(this.b));
            }
            case 650: {
                return xjt.f();
            }
            case 649: {
                return new tag(esp.dM(this.b), (zmf)eqy.pK(this.a).a(), 5);
            }
            case 648: {
                return new spw((Context)esp.oz(this.b).a(), 7);
            }
            case 647: {
                return new uff((bu)esp.pI(this.b).a(), esp.dJ(this.b), (vcy)esp.oW(this.b).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 646: {
                return srz.b(esp.fa(this.b), (vcy)eqy.he(this.a).a());
            }
            case 645: {
                return htj.n((uwx)esp.jc(this.b).a());
            }
            case 644: {
                return ljk.n((vai)era.bD(eqy.r(this.a)).a());
            }
            case 643: {
                return ljm.k((Activity)esp.oz(this.b).a(), (vai)era.bD(eqy.r(this.a)).a());
            }
            case 642: {
                final Context context = (Context)esp.oz(this.b).a();
                final abpu abpu = (abpu)esp.qW(this.b).a();
                final vcy vcy2 = (vcy)esp.oW(this.b).a();
                final msr msr = (msr)esp.ox(this.b).a();
                final fjv fjv = (fjv)esp.ra(this.b).a();
                final SharedPreferences sharedPreferences = (SharedPreferences)eqy.sp(this.a).a();
                return kvu.k(abpu, vcy2, msr, fjv);
            }
            case 641: {
                return kvu.p((ril)eqy.pK(this.a).a(), (zml)eqy.hN(this.a).a(), (vwa)eqy.gI(this.a).a(), esp.bV(this.b));
            }
            case 640: {
                return kvu.s(esp.yM(this.b), (vwa)eqy.gI(this.a).a(), (msr)esp.ox(this.b).a(), esp.bV(this.b));
            }
            case 639: {
                return kvu.l(arlr.b(eqy.rd(this.a)), arlr.b(esp.nS(this.b)), arlr.b(esp.kp(this.b)), (fjv)esp.ra(this.b).a(), (vcy)esp.oW(this.b).a(), (msr)esp.ox(this.b).a());
            }
            case 638: {
                return gku.l((twt)eqy.wj(this.a).a(), (abpu)esp.qW(this.b).a(), (fam)esp.wn(this.b).a(), (fjv)esp.ra(this.b).a(), (Executor)eqy.fT(this.a).a(), (asid)eqy.fU(this.a).a(), (vlq)eqy.kL(this.a).a(), (qv)esp.oc(this.b).a(), (msr)esp.ox(this.b).a(), (vai)eqy.wc(this.a).a());
            }
            case 637: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final SharedPreferences sharedPreferences2 = (SharedPreferences)eqy.sp(this.a).a();
                return ljk.r(esp.vR(this.b), (vai)eqy.wc(this.a).a());
            }
            case 636: {
                final eqy a = this.a;
                return kvu.j(eqy.rd(a), esp.qA(this.b), (Executor)eqy.oN(a).a());
            }
            case 635: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (short[][])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 634: {
                final Context context3 = (Context)esp.oz(this.b).a();
                final arkg b3 = arlr.b(eqy.rd(this.a));
                final arkg b4 = arlr.b(esp.oR(this.b));
                final arkg b5 = arlr.b(esp.ra(this.b));
                final abpu abpu2 = (abpu)esp.qW(this.b).a();
                final wyw wyw = (wyw)esp.qe(this.b).a();
                final msr msr2 = (msr)esp.ox(this.b).a();
                final asid asid = (asid)eqy.fU(this.a).a();
                final vai vai = (vai)esp.uZ(this.b).a();
                return kvu.m(context3, b3, b4, b5, abpu2, wyw, msr2, asid);
            }
            case 633: {
                return knk.l((Context)eqy.ps(this.a).a());
            }
            case 632: {
                return lkh.j();
            }
            case 631: {
                return lmb.o((ghb)esp.il(this.b).a());
            }
            case 630: {
                return ggm.i(esp.ra(this.b));
            }
            case 629: {
                return lmb.q((tgd)eqy.jn(this.a).a(), (acql)esp.qE(this.b).a(), (PipWindowInsetsHelper)esp.nM(this.b).a(), (tqf)esp.ia(this.b).a(), (abpq)esp.ka(this.b).a(), (fjv)esp.ra(this.b).a(), (heo)esp.kn(this.b).a(), (arwh)eqy.qn(this.a).a(), eqy.xN(this.a), (liq)esp.nd(this.b).a(), (c)esp.ux(this.b).a());
            }
            case 628: {
                return gku.j();
            }
            case 627: {
                return new ghr((Activity)esp.oz(this.b).a(), (zfw)esp.ik(this.b).a(), (jki)esp.vD(this.b).a(), (msr)esp.ox(this.b).a(), null, null, null, null);
            }
            case 626: {
                return kxz.h((fjv)esp.ra(this.b).a());
            }
            case 625: {
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final liq liq = (liq)esp.nd(this.b).a();
                final FullscreenExitController fullscreenExitController = (FullscreenExitController)esp.jP(this.b).a();
                final fjv fjv2 = (fjv)esp.ra(this.b).a();
                final iri iri = (iri)esp.ip(this.b).a();
                final esp b6 = this.b;
                final lhr g = lgr.g(tgd, liq, fullscreenExitController, fjv2, iri, esp.nZ(b6), (qv)esp.oc(b6).a(), (ghr)esp.ur(this.b).a(), (xnt)eqy.mi(this.a).a(), (fgt)era.fE(eqy.r(this.a)).a(), (WatchUiActionLatencyLogger)esp.vX(this.b).a(), (cya)esp.vT(this.b).a(), (abrj)eqy.jt(this.a).a(), (vaf)eqy.pn(this.a).a(), (vai)eqy.lg(this.a).a());
                esp.bv(g);
                return g;
            }
            case 624: {
                return lkh.p(esp.cN(this.b), hup.v());
            }
            case 623: {
                return new lil((qv)esp.oc(this.b).a(), (fjr)esp.nU(this.b).a(), (fjv)esp.ra(this.b).a(), (gbc)esp.oR(this.b).a(), (byte[])null, (byte[])null);
            }
            case 622: {
                final iri iri2 = (iri)esp.ip(this.b).a();
                final esp b7 = this.b;
                return gcn.k(iri2, esp.qR(b7), (abpu)esp.qW(b7).a(), (qv)esp.oc(this.b).a(), (fjv)esp.ra(this.b).a(), (InlinePlaybackLifecycleController)esp.kC(this.b).a());
            }
            case 621: {
                return ixz.j((wyw)esp.qg(this.b).a(), (Context)esp.oz(this.b).a(), (ViewGroup)esp.qY(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.pA(this.b).a());
            }
            case 620: {
                return new kud((qv)esp.oc(this.b).a(), (abpu)esp.qW(this.b).a(), (vwt)eqy.vY(this.a).a(), (tgd)eqy.jn(this.a).a(), (tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a(), (aavr)esp.sg(this.b).a(), (byte[])null, (byte[])null);
            }
            case 619: {
                return ivh.p((Context)esp.oz(this.b).a(), esp.eh(this.b), (abtw)eqy.uS(this.a).a(), (abdb)esp.rE(this.b).a(), (qv)esp.oc(this.b).a(), (fjv)esp.ra(this.b).a());
            }
            case 618: {
                return new kue((Context)esp.oz(this.b).a(), (tmx)era.dk(eqy.r(this.a)).a(), (qv)esp.oc(this.b).a(), esp.ka(this.b), (aawr)era.fB(eqy.r(this.a)).a(), (abpu)esp.qW(this.b).a(), (byte[])null, (byte[])null);
            }
            case 617: {
                return new kzo((qv)esp.oc(this.b).a(), (fjv)esp.ra(this.b).a(), (elx)esp.gi(this.b).a(), (oby)eqy.gH(this.a).a(), (c)era.F(eqy.r(this.a)), (acwi)esp.sD(this.b).a(), (aun)esp.pI(this.b).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 616: {
                final qv qv = (qv)esp.oc(this.b).a();
                final mdp mdp = (mdp)era.cI(eqy.r(this.a)).a();
                final esp b8 = this.b;
                return new lin(qv, mdp, esp.ka(b8), esp.oW(b8), esp.nW(b8), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 615: {
                return new lim((qv)esp.oc(this.b).a(), (tgd)eqy.jn(this.a).a(), esp.ka(this.b), (byte[])null, (byte[])null);
            }
            case 614: {
                final WatchHistoryPreviousNextController l = kxz.l((qv)esp.oc(this.b).a(), (vcy)esp.pA(this.b).a(), (kyc)esp.iA(this.b).a(), (abcz)esp.rf(this.b).a(), (PlaybackLoopShuffleMonitor)esp.nT(this.b).a(), esp.ei(this.b), (abpu)esp.qW(this.b).a(), esp.jY(this.b), (asid)eqy.fU(this.a).a(), (elx)eqy.vz(this.a).a());
                esp.bH(l);
                return l;
            }
            case 613: {
                final qv qv2 = (qv)esp.oc(this.b).a();
                final tgd tgd2 = (tgd)eqy.jn(this.a).a();
                final esp b9 = this.b;
                return new lii(qv2, tgd2, esp.ka(b9), esp.nU(b9), esp.wn(b9), (byte[])null, (byte[])null);
            }
            case 612: {
                return ljm.d((Context)esp.oz(this.b).a());
            }
            case 611: {
                return ivh.q((qv)esp.oc(this.b).a(), (tgd)eqy.jn(this.a).a(), (abap)esp.uL(this.b).a(), (fjr)esp.nU(this.b).a(), (abaa)esp.sL(this.b).a(), (Context)esp.oz(this.b).a(), (iuv)esp.hM(this.b).a());
            }
            case 610: {
                return new aeea((short[])null, (byte[])null, (byte[])null);
            }
            case 609: {
                return hzk.u((asid)eqy.fU(this.a).a(), (qv)esp.oc(this.b).a(), (iab)esp.lA(this.b).a(), esp.dP(this.b), (vcy)esp.pA(this.b).a(), (aeea)esp.lQ(this.b).a(), (tgd)eqy.jn(this.a).a(), (asht)esp.qm(this.b).a(), (abpu)esp.qW(this.b).a(), (wyw)eqy.hP(this.a).a(), (xib)esp.lo(this.b).a());
            }
            case 608: {
                return new lij((Activity)esp.oz(this.b).a(), (qv)esp.oc(this.b).a(), (fjv)esp.ra(this.b).a(), (byte[])null, (byte[])null);
            }
            case 607: {
                return new fxt((qv)esp.oc(this.b).a(), (RentalActivationOverlay)esp.tv(this.b).a(), (abpu)esp.qW(this.b).a(), (byte[])null, (byte[])null);
            }
            case 606: {
                final qv qv3 = (qv)esp.oc(this.b).a();
                final tgd tgd3 = (tgd)eqy.jn(this.a).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final vcy vcy3 = (vcy)esp.oW(this.b).a();
                final acjd acjd = (acjd)eqy.mT(this.a).a();
                final fny fny = (fny)esp.nW(this.b).a();
                final esp b10 = this.b;
                return new etq(qv3, tgd3, zmf, vcy3, acjd, fny, esp.wn(b10), (fjv)esp.ra(b10).a(), (byte[])null, (byte[])null);
            }
            case 605: {
                return new fbn((qv)esp.oc(this.b).a(), (fa)esp.oF(this.b).a(), (tgd)eqy.jn(this.a).a(), (fbo)eqy.fu(this.a).a(), (gbu)esp.ry(this.b).a(), (aahh)esp.ii(this.b).a(), (wyw)esp.qg(this.b).a(), (oby)eqy.gH(this.a).a(), (arwh)eqy.qn(this.a).a(), (vaf)eqy.pn(this.a).a(), (vcy)esp.oW(this.b).a(), (actt)esp.jL(this.b).a(), esp.zw(this.b), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 604: {
                return actb.c((oby)eqy.gH(this.a).a(), arlr.b(era.dl(eqy.r(this.a))), (zmf)eqy.pK(this.a).a());
            }
            case 603: {
                return new aahh((Activity)esp.oz(this.b).a(), (acpk)eqy.kK(this.a).a(), (vcy)esp.oW(this.b).a(), (acgs)eqy.kr(this.a).a());
            }
            case 602: {
                return new fbl((qv)esp.oc(this.b).a(), (abpu)esp.qW(this.b).a(), (fbo)eqy.fu(this.a).a(), esp.cl(this.b), (fbk)esp.gE(this.b).a(), (wyw)esp.qg(this.b).a(), (byte[])null, (byte[])null);
            }
            case 601: {
                return ivh.k((acbm)esp.iR(this.b).a(), (accf)esp.iS(this.b).a(), (asid)eqy.fU(this.a).a(), (wyw)esp.qg(this.b).a());
            }
            case 600: {
                return ips.f((abpu)esp.qW(this.b).a());
            }
        }
    }
    
    private final Object o() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 799: {
                return gpb.s((vbs)eqy.hs(this.a).a(), (eg)eqy.jx(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 798: {
                return wap.j(esp.qn(this.b));
            }
            case 797: {
                final Context context = (Context)esp.oz(this.b).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final tqd tqd = (tqd)eqy.qe(this.a).a();
                final esp b = this.b;
                return new acmm(context, vcy, tqd, esp.ql(b), (aeea)esp.iE(b).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null);
            }
            case 796: {
                return new ajb((abpq)esp.ka(this.b).a(), (agkz)esp.rq(this.b).a(), (acmm)esp.hY(this.b).a(), (byte[])null, (byte[])null);
            }
            case 795: {
                return isz.t((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (aeea)eqy.mB(this.a).a(), esp.mZ(this.b));
            }
            case 794: {
                return new ReportVideoController((Activity)esp.oz(this.b).a(), (tjm)eqy.ib(this.a).a(), (zmf)eqy.pK(this.a).a(), (tqd)eqy.qe(this.a).a(), (zmt)eqy.kb(this.a).a(), (abuj)esp.kc(this.b).a(), (itb)esp.nv(this.b).a(), (ajb)esp.ty(this.b).a(), (abpu)esp.qW(this.b).a(), (asid)eqy.fU(this.a).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 793: {
                final esp b2 = this.b;
                return fbd.p(esp.tx(b2), (hof)esp.rm(b2).a());
            }
            case 792: {
                return new fca((Context)esp.oz(this.b).a(), (adfq)era.bn(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), 16, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 791: {
                return uzu.p((aacf)eqy.ji(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 790: {
                return new aawj((aawr)era.fB(eqy.r(this.a)).a(), 0);
            }
            case 789: {
                return fbd.o(esp.jY(this.b));
            }
            case 788: {
                return new fdr((isn)eqy.wi(this.a).a(), 20, (byte[])null);
            }
            case 787: {
                return new eyz((Context)esp.oz(this.b).a(), esp.Aa(this.b), (tgd)eqy.jn(this.a).a(), 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 786: {
                return new fdd((vox)era.ay(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (acjd)eqy.mT(this.a).a(), (Context)esp.oz(this.b).a(), (zqe)eqy.wk(this.a).a(), 6);
            }
            case 785: {
                return new fdd((zmf)eqy.pK(this.a).a(), esp.ym(this.b), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (bu)esp.pI(this.b).a(), 1, (byte[])null, (byte[])null);
            }
            case 784: {
                final eqy a = this.a;
                return gpb.g(eqy.eC(a), eqy.iw(a));
            }
            case 783: {
                return abzn.r((aeea)esp.iE(this.b).a());
            }
            case 782: {
                return fbd.n(esp.jY(this.b));
            }
            case 781: {
                return ldi.r((Activity)esp.oz(this.b).a(), esp.zc(this.b), eqy.hP(this.a), (acwb)esp.ry(this.b).a(), esp.Aq(this.b));
            }
            case 780: {
                return new fdr((isn)eqy.wi(this.a).a(), 19);
            }
            case 779: {
                return new eyy((gug)esp.ol(this.b).a(), 6, (byte[])null);
            }
            case 778: {
                return new goi((Context)esp.oz(this.b).a(), (adfq)era.fx(eqy.r(this.a)).a(), (tgd)eqy.jn(this.a).a(), (Executor)eqy.fT(this.a).a(), (adpp)eqy.vC(this.a).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 777: {
                return new fcl((vol)era.av(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (bu)esp.pI(this.b).a(), 0);
            }
            case 776: {
                return wxn.u((msr)eqy.tw(this.a).a(), (tgd)eqy.jn(this.a).a(), (wzc)eqy.kO(this.a).a(), (wzg)eqy.kP(this.a).a(), (acqb)era.fg(eqy.r(this.a)).a(), (aeea)eqy.nF(this.a).a(), (Context)eqy.ps(this.a).a(), (arwh)eqy.qn(this.a).a(), (vai)eqy.gF(this.a).a(), (vai)eqy.lp(this.a).a());
            }
            case 775: {
                return new gnl((tjm)eqy.ib(this.a).a(), (jsp)eqy.fh(this.a).a(), esp.yT(this.b), null, null);
            }
            case 774: {
                final vpi vpi = (vpi)eqy.gJ(this.a).a();
                final aeea aeea = (aeea)eqy.pt(this.a).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final vcy vcy2 = (vcy)esp.oW(this.b).a();
                final tqd tqd2 = (tqd)eqy.qe(this.a).a();
                final vxg vxg = (vxg)eqy.ok(this.a).a();
                return new fcl(vpi, aeea, zmf, vcy2, tqd2, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 773: {
                return jex.q((bu)esp.pI(this.b).a());
            }
            case 772: {
                return new gug((Activity)esp.oz(this.b).a(), (vuf)era.cH(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (tgd)eqy.jn(this.a).a(), (vcy)esp.oW(this.b).a(), (adfq)era.bn(eqy.r(this.a)).a(), (arwh)eqy.qn(this.a).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 771: {
                return new gni((Activity)esp.oz(this.b).a(), (zmf)eqy.pK(this.a).a(), (zmt)eqy.kb(this.a).a(), (tqd)eqy.qe(this.a).a(), (gug)esp.ol(this.b).a(), (vdr)eqy.kE(this.a).a(), (pvh)esp.pb(this.b).a(), null, null, null, null);
            }
            case 770: {
                return new spt((vpi)eqy.gJ(this.a).a(), (spe)esp.hO(this.b).a(), (aujg)esp.hD(this.b).a(), (wyv)esp.ow(this.b).a(), esp.oW(this.b), (vdr)eqy.kE(this.a).a(), (bu)esp.pI(this.b).a(), (Executor)eqy.fT(this.a).a(), (tqd)eqy.qe(this.a).a(), 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 769: {
                return new adlp((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (sny)esp.hE(this.b).a(), (agmx)esp.uu(this.b).a(), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 768: {
                return new fcl((adlp)esp.hN(this.b).a(), (wyv)esp.ow(this.b).a(), (zmf)eqy.pK(this.a).a(), (vdr)eqy.kE(this.a).a(), (vcy)esp.oW(this.b).a(), 13, (byte[])null, (byte[])null, (byte[])null);
            }
            case 767: {
                return new man((char[])null, (byte[])null);
            }
            case 766: {
                return new agmx((acjd)eqy.mT(this.a).a());
            }
            case 765: {
                return new man((char[])null);
            }
            case 764: {
                return sao.s((Activity)esp.oz(this.b).a(), (Context)esp.oX(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (tqd)eqy.qe(this.a).a(), (tjm)eqy.ib(this.a).a(), (tqn)eqy.fh(this.a).a(), eqy.zR(this.a), (man)esp.hF(this.b).a(), esp.xN(this.b), esp.zy(this.b), esp.zW(this.b), esp.zY(this.b), (actp)esp.ja(this.b).a(), (vaf)eqy.pn(this.a).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (agmx)era.bh(eqy.r(this.a)).a(), srz.p(), (aeea)eqy.mB(this.a).a(), (vai)eqy.vx(this.a).a());
            }
            case 763: {
                return new sps((sny)esp.hE(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 762: {
                return sao.p((bu)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), (acwb)esp.rU(this.b).a(), (vaf)eqy.pn(this.a).a(), srz.p());
            }
            case 761: {
                return new fci(esp.gG(this.b), (abpq)eqy.kh(this.a).a(), 20);
            }
            case 760: {
                return sao.j((Activity)esp.oz(this.b).a(), (adet)era.bl(eqy.r(this.a)).a(), (acid)era.bk(eqy.r(this.a)).a());
            }
            case 759: {
                return new aujg((Context)esp.oz(this.b).a(), (acwb)esp.rU(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 758: {
                return new spe();
            }
            case 757: {
                final vpi vpi2 = (vpi)eqy.gJ(this.a).a();
                final spe spe = (spe)esp.hO(this.b).a();
                final aujg aujg = (aujg)esp.hD(this.b).a();
                final wyv wyv = (wyv)esp.ow(this.b).a();
                final vxg vxg2 = (vxg)eqy.ok(this.a).a();
                return new spt(vpi2, spe, aujg, wyv, esp.oW(this.b), (vdr)eqy.kE(this.a).a(), (Executor)eqy.fT(this.a).a(), (bu)esp.pI(this.b).a(), (tqd)eqy.qe(this.a).a(), 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 756: {
                return hlb.d((Context)esp.ut(this.b).a());
            }
            case 755: {
                return actb.d((Activity)esp.oz(this.b).a(), esp.fy(this.b));
            }
            case 754: {
                return ljh.v((bu)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), (acwb)esp.rU(this.b).a(), (fxw)esp.gn(this.b).a(), (svx)era.ao(eqy.r(this.a)).a(), (vaf)eqy.pn(this.a).a(), srz.p(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 753: {
                return new eyz(esp.oQ(this.b), (abpq)eqy.kh(this.a).a(), (Executor)eqy.fT(this.a).a(), 18);
            }
            case 752: {
                return fbd.h((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 751: {
                final Context context2 = (Context)esp.oz(this.b).a();
                final vcy vcy3 = (vcy)esp.oW(this.b).a();
                final wyv wyv2 = (wyv)esp.ow(this.b).a();
                final acpk acpk = (acpk)eqy.kK(this.a).a();
                final aeea aeea2 = (aeea)esp.iE(this.b).a();
                final trc trc = (trc)eqy.vM(this.a).a();
                final acgs acgs = (acgs)eqy.kr(this.a).a();
                final ziy ziy = (ziy)esp.uA(this.b).a();
                final eqy a2 = this.a;
                return abzn.s(context2, vcy3, wyv2, acpk, aeea2, trc, acgs, ziy, eqy.qn(a2), (aeea)eqy.mB(a2).a());
            }
            case 750: {
                return new hyt((tgd)eqy.jn(this.a).a(), 18, (int[])null);
            }
            case 749: {
                return new hyt((tgd)eqy.jn(this.a).a(), 7, (char[])null);
            }
            case 748: {
                return wap.i((vzr)esp.lG(this.b).a());
            }
            case 747: {
                return new gnf((Context)esp.oz(this.b).a(), (tgd)eqy.jn(this.a).a(), (abll)era.bB(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 746: {
                return new eyy((xnt)eqy.mi(this.a).a(), 5);
            }
            case 745: {
                return wxn.j((vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 744: {
                return new hyt((zqs)eqy.gl(this.a).a(), 0);
            }
            case 743: {
                return new aazw((Context)eqy.ps(this.a).a(), 1);
            }
            case 742: {
                final esp b3 = this.b;
                return qxd.n(esp.sJ(b3), esp.zl(b3));
            }
            case 741: {
                final rgx rgx = (rgx)esp.hV(this.b).a();
                ljh.q(rgx, (fxw)esp.gn(this.b).a());
                return rgx;
            }
            case 740: {
                final rgx rgx2 = (rgx)esp.hV(this.b).a();
                hlb.c(rgx2, (fxw)esp.gn(this.b).a());
                return rgx2;
            }
            case 739: {
                return acdj.v((Context)esp.oz(this.b).a(), arlr.b(esp.oU(this.b)), arlr.b(esp.wB(this.b)), arlr.b(esp.ow(this.b)), arlr.b(eqy.hP(this.a)), (aekp)esp.wM(this.b).a(), (vai)eqy.vx(this.a).a(), (aeea)eqy.mB(this.a).a());
            }
            case 738: {
                return qxd.k((bu)esp.pI(this.b).a(), (tgd)eqy.jn(this.a).a(), (oiy)esp.iW(this.b).a(), (wyw)eqy.hP(this.a).a(), (arwh)eqy.qn(this.a).a());
            }
            case 737: {
                final rgx rgx3 = (rgx)esp.hV(this.b).a();
                hup.b(rgx3, esp.cu(this.b));
                return rgx3;
            }
            case 736: {
                return qxd.j((Activity)esp.oz(this.b).a(), esp.fo(this.b));
            }
            case 735: {
                return fei.k(esp.sJ(this.b));
            }
            case 734: {
                return fqs.r(esp.zC(this.b));
            }
            case 733: {
                return fpi.o((ftk)esp.pT(this.b).a(), (abpq)esp.kb(this.b).a());
            }
            case 732: {
                return fqs.d((bu)esp.pI(this.b).a());
            }
            case 731: {
                return fqs.e((bu)esp.pI(this.b).a());
            }
            case 730: {
                return fqs.q((Context)esp.ut(this.b).a(), (bu)esp.pI(this.b).a(), (abpq)esp.kb(this.b).a(), (abdk)esp.rI(this.b).a(), (abdk)esp.rG(this.b).a(), (ajb)esp.uo(this.b).a(), (hll)esp.jW(this.b).a(), (vai)eqy.wc(this.a).a());
            }
            case 729: {
                return fqs.b((abpu)eqy.rY(this.a).a());
            }
            case 728: {
                return fpi.v((Context)esp.oz(this.b).a(), (abpq)esp.kb(this.b).a(), (irz)esp.iy(this.b).a(), (wyv)esp.ow(this.b).a(), (itg)esp.ke(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 727: {
                return fpi.u((Context)esp.oz(this.b).a(), (abpq)esp.ka(this.b).a(), (irz)esp.iy(this.b).a(), (wyv)esp.ow(this.b).a(), (itg)esp.kd(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 726: {
                final esp b4 = this.b;
                return hlk.m(esp.rl(b4), (gne)esp.jS(b4).a(), (gne)esp.jT(this.b).a());
            }
            case 725: {
                return gpb.j((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 724: {
                return gku.p((bx)esp.jo(this.b).a());
            }
            case 723: {
                return gku.q((bx)esp.jo(this.b).a());
            }
            case 722: {
                return jts.p();
            }
            case 721: {
                return gns.n((bx)esp.jo(this.b).a());
            }
            case 720: {
                return fcv.j((uwx)esp.jc(this.b).a());
            }
            case 719: {
                return new fdr((aukf)era.ez(eqy.r(this.a)).a(), 17);
            }
            case 718: {
                return new mcb((ghb)esp.il(this.b).a(), esp.zU(this.b), (byte[])null, (byte[])null);
            }
            case 717: {
                final eqy a3 = this.a;
                final atke fu = eqy.fU(a3);
                final esp b5 = this.b;
                return hup.l(fu, esp.oz(b5), eqy.kE(a3), era.fp(eqy.r(a3)), era.fo(eqy.r(a3)), eqy.pn(a3), esp.ox(b5));
            }
            case 716: {
                return fei.u((tgd)eqy.jn(this.a).a());
            }
            case 715: {
                return ljk.q((wfg)esp.ld(this.b).a());
            }
            case 714: {
                return ljk.i();
            }
            case 713: {
                final acgs acgs2 = (acgs)eqy.kr(this.a).a();
                final acpk acpk2 = (acpk)eqy.kK(this.a).a();
                final vcy vcy4 = (vcy)esp.oW(this.b).a();
                final jxc jxc = (jxc)esp.gg(this.b).a();
                final zqs zqs = (zqs)eqy.gl(this.a).a();
                final ghb ghb = (ghb)esp.il(this.b).a();
                final fjv fjv = (fjv)esp.ra(this.b).a();
                final vai ww = esp.wW(this.b);
                final kcq kcq = (kcq)esp.rz(this.b).a();
                final esp b6 = this.b;
                return lkh.v(acgs2, acpk2, vcy4, jxc, zqs, ghb, fjv, ww, kcq, esp.io(b6), (aeea)esp.tn(b6).a(), (aeea)esp.hB(this.b).a(), (tqf)esp.ia(this.b).a(), (asht)esp.pK(this.b).a(), (ashi)esp.qp(this.b).a(), (hzf)era.by(eqy.r(this.a)).a(), (msr)esp.ox(this.b).a(), (asid)eqy.fU(this.a).a(), (vaf)eqy.pn(this.a).a(), era.gU(eqy.r(this.a)), gcn.o(), (bhv)esp.kh(this.b).a(), esp.eI(this.b), (asht)esp.ot(this.b).a(), esp.zU(this.b), (mcb)esp.nN(this.b).a(), arlr.b(esp.oH(this.b)), arlr.b(esp.jd(this.b)), arlr.b(esp.rS(this.b)), (gbc)esp.oR(this.b).a(), (vai)eqy.vx(this.a).a(), (vai)eqy.lv(this.a).a(), (PipPlayerObserver)esp.nJ(this.b).a());
            }
            case 712: {
                return fcv.k((llb)esp.in(this.b).a());
            }
            case 711: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (boolean[])null, (byte[])null, (byte[])null);
            }
            case 710: {
                return gpb.o((bu)esp.pI(this.b).a(), (abpq)eqy.kh(this.a).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a(), (vai)esp.on(this.b).a());
            }
            case 709: {
                final eqy a4 = this.a;
                return hxp.m(eqy.fs(a4), eqy.ky(a4));
            }
            case 708: {
                return gku.t((bu)esp.pI(this.b).a(), (vwa)eqy.ul(this.a).a(), (tjm)eqy.ib(this.a).a(), (skt)esp.qH(this.b).a(), (Executor)eqy.fT(this.a).a(), (bx)era.H(eqy.r(this.a)), (zlv)eqy.ho(this.a).a(), (wyv)esp.ow(this.b).a(), (zmf)eqy.pK(this.a).a(), (vai)eqy.vx(this.a).a());
            }
            case 707: {
                return fbd.m((bu)esp.pI(this.b).a(), (vox)era.ay(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a());
            }
            case 706: {
                return euu.r((euk)eqy.hQ(this.a).a(), (Activity)esp.oz(this.b).a(), (qdw)eqy.iY(this.a).a(), (euv)era.bK(eqy.r(this.a)).a(), (acql)esp.qE(this.b).a(), (wyw)eqy.hP(this.a).a(), (uve)esp.sj(this.b).a(), (Executor)eqy.fT(this.a).a(), (ScheduledExecutorService)eqy.oN(this.a).a(), (rpz)eqy.iD(this.a).a(), (rpy)eqy.hT(this.a).a(), (siq)eqy.eM(this.a).a(), (vcy)esp.oW(this.b).a(), (arwh)eqy.qn(this.a).a());
            }
            case 705: {
                return gpb.f(esp.if(this.b));
            }
            case 704: {
                return gpb.b((vcy)esp.oW(this.b).a(), (Executor)eqy.oN(this.a).a(), (Context)eqy.ps(this.a).a());
            }
            case 703: {
                return gns.q((vgy)eqy.eL(this.a).a(), (fbb)esp.uz(this.b).a(), esp.Aa(this.b), (vcy)eqy.he(this.a).a(), (Context)eqy.ps(this.a).a());
            }
            case 702: {
                return gns.h((acaq)eqy.hj(this.a).a());
            }
            case 701: {
                return new eyy((Context)esp.oz(this.b).a(), 4);
            }
            case 700: {
                return ulu.l((Context)esp.oz(this.b).a());
            }
        }
    }
    
    private final Object p() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 899: {
                return new eyz((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (gbu)esp.ry(this.b).a(), 15);
            }
            case 898: {
                return guc.m((Executor)eqy.fT(this.a).a(), (adpp)eqy.vC(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 897: {
                return htj.q((Activity)esp.oz(this.b).a(), (Executor)eqy.fT(this.a).a(), (zmf)eqy.pK(this.a).a(), (adll)era.fn(eqy.r(this.a)).a(), (adpp)eqy.vC(this.a).a(), (vcy)esp.oW(this.b).a(), (acgs)eqy.kr(this.a).a(), (acpk)eqy.kK(this.a).a(), (wyv)esp.ow(this.b).a());
            }
            case 896: {
                return hlk.s(esp.zH(this.b), (vcy)esp.oW(this.b).a(), (eg)esp.tf(this.b).a(), (Executor)eqy.fT(this.a).a());
            }
            case 895: {
                return ljl.k((ksb)esp.rM(this.b).a());
            }
            case 894: {
                return hdz.f((Activity)esp.oz(this.b).a());
            }
            case 893: {
                return gvs.f(esp.cp(this.b));
            }
            case 892: {
                return new gvh(esp.yR(this.b), 4, (byte[])null, (byte[])null);
            }
            case 891: {
                return wap.l((vzx)esp.qn(this.b).a());
            }
            case 890: {
                return wap.m((wfg)esp.ld(this.b).a(), (vzx)esp.qn(this.b).a());
            }
            case 889: {
                return new vae((vzg)esp.lf(this.b).a(), 7);
            }
            case 888: {
                return new gvh((heo)eqy.vL(this.a).a(), 19, (byte[])null, (byte[])null);
            }
            case 887: {
                return new hln((vtn)eqy.mP(this.a).a(), esp.oW(this.b), (Executor)eqy.fT(this.a).a(), 12);
            }
            case 886: {
                return eoy.v((bu)esp.pI(this.b).a(), (oiu)esp.iT(this.b).a(), (vcy)esp.oW(this.b).a(), esp.yr(this.b), (Executor)eqy.fT(this.a).a(), (aeea)eqy.pt(this.a).a(), (zmf)eqy.pK(this.a).a(), eqy.x(this.a), (wyw)eqy.hP(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 885: {
                return new eyy((eth)esp.iu(this.b).a(), 1);
            }
            case 884: {
                return ljl.p((Context)eqy.ps(this.a).a());
            }
            case 883: {
                return gpb.p((aeea)esp.rg(this.b).a(), (ewp)eqy.uE(this.a).a(), (Executor)eqy.oN(this.a).a(), (asid)eqy.fJ(this.a).a());
            }
            case 882: {
                return new adbn((Context)esp.oz(this.b).a(), (vox)era.ay(eqy.r(this.a)).a(), (vaf)eqy.pn(this.a).a(), 0);
            }
            case 881: {
                return jex.j((bu)esp.pI(this.b).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 880: {
                return new fdn((aadx)eqy.oi(this.a).a(), esp.oW(this.b), (tqd)eqy.qe(this.a).a(), (Activity)esp.oz(this.b).a(), (zmf)eqy.pK(this.a).a(), (zmt)eqy.kb(this.a).a(), (ino)era.cG(eqy.r(this.a)).a(), (abgu)era.dI(eqy.r(this.a)).a(), (byte[])null, (byte[])null, (byte[])null);
            }
            case 879: {
                return fcv.n((fpw)esp.is(this.b).a());
            }
            case 878: {
                return gpu.e((bu)esp.pI(this.b).a(), (PlayBilling)esp.nP(this.b).a(), (vzg)esp.lf(this.b).a(), (vcy)esp.oW(this.b).a(), (vdr)eqy.kE(this.a).a(), (ril)eqy.pK(this.a).a(), esp.km(this.b).a(), (adia)eqy.pl(this.a).a(), (asid)eqy.fS(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 877: {
                return fcv.l((abpq)esp.ka(this.b).a(), (abrb)eqy.bn(this.a));
            }
            case 876: {
                return new fec(1);
            }
            case 875: {
                return new gnq((Context)esp.oz(this.b).a(), 5);
            }
            case 874: {
                return vvq.l((adfq)era.fl(eqy.r(this.a)).a(), (Executor)eqy.fT(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 873: {
                return acfd.q((vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (asid)eqy.fU(this.a).a(), (aekp)esp.jC(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 872: {
                return acfd.n((vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (asid)eqy.fU(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 871: {
                return acfd.s((aekp)esp.jC(this.b).a(), (vcy)esp.oW(this.b).a());
            }
            case 870: {
                return acfd.t(esp.xK(this.b));
            }
            case 869: {
                return acfd.r((aekp)esp.jC(this.b).a(), esp.yj(this.b), (zmf)eqy.pK(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (vdr)eqy.kE(this.a).a());
            }
            case 868: {
                return sao.g();
            }
            case 867: {
                final vpi vpi = (vpi)eqy.gJ(this.a).a();
                final esp b = this.b;
                return new fcl(vpi, esp.oW(b), esp.cU(b), (vaf)eqy.pn(this.a).a(), (Executor)eqy.fT(this.a).a(), 14);
            }
            case 866: {
                return new goh((Context)esp.oz(this.b).a(), (tgd)eqy.jn(this.a).a(), (abll)era.bB(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 865: {
                return hzk.q((elx)esp.gi(this.b).a(), (wyw)eqy.hP(this.a).a(), (vcy)esp.oW(this.b).a(), (tag)esp.iV(this.b).a());
            }
            case 864: {
                return hzk.o((Activity)esp.oz(this.b).a(), esp.xW(this.b), (e)esp.lI(this.b).a(), (Executor)eqy.fT(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 863: {
                return new gnr((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), new fec(11), (cl)esp.rK(this.b).a(), (aahh)esp.ii(this.b).a(), (wyv)esp.ow(this.b).a(), esp.iE(this.b), (aeea)eqy.mB(this.a).a(), 2, null, null, null, null);
            }
            case 862: {
                return new spw((adlp)esp.hN(this.b).a(), 1, (char[])null, (byte[])null, (byte[])null);
            }
            case 861: {
                return mft.C((Activity)esp.oz(this.b).a(), esp.wn(this.b));
            }
            case 860: {
                return gku.k((Activity)esp.oz(this.b).a(), (tgd)eqy.jn(this.a).a(), (fan)esp.ss(this.b).a(), (c)eqy.wd(this.a).a(), (fgt)era.fE(eqy.r(this.a)).a(), (WatchUiActionLatencyLogger)esp.vX(this.b).a(), (arwh)eqy.qn(this.a).a(), (tnu)eqy.fH(this.a).a(), (agnt)eqy.tu(this.a).a());
            }
            case 859: {
                return gku.o(esp.gI(this.b).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (fln)eqy.eR(this.a).a(), esp.zv(this.b), (heo)era.aI(eqy.r(this.a)).a());
            }
            case 858: {
                return fcv.h((aaim)esp.mg(this.b).a());
            }
            case 857: {
                return ikh.n((aacg)eqy.nB(this.a).a());
            }
            case 856: {
                final aacg aacg = (aacg)eqy.nB(this.a).a();
                final eqy a = this.a;
                return ini.e(aacg, eqy.ig(a), (fmr)eqy.lE(a).a(), (vef)eqy.nJ(this.a).a(), (zmf)eqy.pK(this.a).a(), (aait)eqy.ju(this.a).a(), (vai)eqy.lz(this.a).a());
            }
            case 855: {
                return ini.u((Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (aain)esp.nr(this.b).a(), (tjm)eqy.ib(this.a).a(), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 854: {
                return ini.o((fa)esp.oF(this.b).a(), (zmf)eqy.pK(this.a).a(), (aabo)eqy.ig(this.a).a(), (aadq)eqy.if(this.a).a(), (zmt)eqy.kb(this.a).a(), (tqd)eqy.qe(this.a).a(), (tjm)eqy.ib(this.a).a(), (ine)eqy.lD(this.a).a(), (aain)esp.nr(this.b).a(), (aaig)esp.me(this.b).a(), (tqn)eqy.fh(this.a).a(), (qcy)esp.nl(this.b).a(), (qcy)esp.no(this.b).a(), (aaio)esp.mk(this.b).a(), eqy.cg(this.a), (zaz)eqy.jf(this.a).a(), (fmr)eqy.lE(this.a).a(), (aait)eqy.ju(this.a).a(), eqy.yS(this.a), (Executor)eqy.fT(this.a).a(), (vai)eqy.lz(this.a).a(), era.bW(eqy.r(this.a)).a(), esp.eF(this.b), (hzn)era.be(eqy.r(this.a)).a());
            }
            case 853: {
                final aaim aaim = (aaim)esp.mg(this.b).a();
                final fmr fmr = (fmr)eqy.lE(this.a).a();
                final eqy a2 = this.a;
                return fcv.r(aaim, fmr, eqy.ig(a2), (aacg)eqy.nB(a2).a(), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a(), (fln)eqy.eR(this.a).a(), (vcy)esp.oW(this.b).a(), (heo)era.aI(eqy.r(this.a)).a());
            }
            case 852: {
                return ini.d((aacg)eqy.nB(this.a).a(), (aabo)eqy.ig(this.a).a(), (aait)eqy.ju(this.a).a(), (tgd)eqy.jn(this.a).a());
            }
            case 851: {
                return ini.s((bu)esp.pI(this.b).a(), (acwb)esp.rU(this.b).a(), (vcy)esp.oW(this.b).a(), (blu)era.cq(eqy.r(this.a)).a(), (wyv)esp.ow(this.b).a());
            }
            case 850: {
                return ini.t((Activity)esp.oz(this.b).a(), (Context)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), (aahh)esp.ii(this.b).a(), esp.eu(this.b), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 849: {
                final bu bu = (bu)esp.pI(this.b).a();
                final ziy ziy = (ziy)era.co(eqy.r(this.a)).a();
                final aaec aaec = (aaec)eqy.lD(this.a).a();
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final aln aln = (aln)eqy.np(this.a).a();
                final eqy a3 = this.a;
                return iey.s(bu, ziy, aaec, vcy, aln, eqy.ig(a3), eqy.ib(a3), (aaig)esp.me(this.b).a(), esp.em(this.b), (fmr)eqy.lE(this.a).a(), (wyv)esp.ow(this.b).a(), eqy.xV(this.a));
            }
            case 848: {
                final Context context = (Context)eqy.ps(this.a).a();
                final bu bu2 = (bu)esp.pI(this.b).a();
                final ziy ziy2 = (ziy)era.co(eqy.r(this.a)).a();
                final ine ine = (ine)eqy.lD(this.a).a();
                final aln aln2 = (aln)eqy.np(this.a).a();
                final eqy a4 = this.a;
                return iey.u(context, bu2, ziy2, ine, aln2, eqy.ig(a4), eqy.ib(a4), (bhv)eqy.jc(a4).a(), (ihb)eqy.iR(this.a).a(), (ifr)esp.md(this.b).a(), (oiy)esp.iW(this.b).a(), (oiu)esp.iT(this.b).a(), (fmr)eqy.lE(this.a).a(), (msr)eqy.mM(this.a).a(), (vai)eqy.lz(this.a).a());
            }
            case 847: {
                return ini.n((Activity)esp.oz(this.b).a(), (zmf)eqy.pK(this.a).a(), (aabo)eqy.ig(this.a).a(), (zmt)eqy.kb(this.a).a(), (tqd)eqy.qe(this.a).a(), (tjm)eqy.ib(this.a).a(), (aaec)eqy.lD(this.a).a(), (aain)esp.nr(this.b).a(), (aaii)esp.nr(this.b).a(), (aaig)esp.me(this.b).a(), (tqn)eqy.fh(this.a).a(), (qcy)esp.nl(this.b).a(), (acid)eqy.nq(this.a).a(), (zaz)eqy.jf(this.a).a(), (aait)eqy.ju(this.a).a(), (ine)eqy.lD(this.a).a(), (vai)eqy.lz(this.a).a(), era.bW(eqy.r(this.a)).a(), (inz)esp.mj(this.b).a());
            }
            case 846: {
                return fcv.b((aaih)esp.mf(this.b).a());
            }
            case 845: {
                return fcv.v((ggr)esp.qL(this.b).a(), (tgd)eqy.jn(this.a).a(), eqy.zP(this.a), ikh.q());
            }
            case 844: {
                return gns.s((bu)esp.pI(this.b).a(), (vtn)eqy.mP(this.a).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a());
            }
            case 843: {
                return new fci((tgd)eqy.jn(this.a).a(), (vcy)esp.oW(this.b).a(), 4);
            }
            case 842: {
                return new god(esp.cF(this.b));
            }
            case 841: {
                return new fwi((Context)eqy.ps(this.a).a(), (vtn)eqy.mP(this.a).a(), esp.oW(this.b), (tqd)eqy.qe(this.a).a(), (acjd)eqy.mT(this.a).a(), (zqe)eqy.wk(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 840: {
                return new ModalDialogController((Context)esp.oz(this.b).a(), (acnc)esp.hW(this.b).a(), (wyv)esp.ow(this.b).a(), (ziy)esp.uA(this.b).a(), (abpq)esp.ka(this.b).a(), (aeea)eqy.mB(this.a).a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 839: {
                return new fda((ModalDialogController)esp.mP(this.b).a());
            }
            case 838: {
                return wap.t((vss)era.bR(eqy.r(this.a)).a(), (xib)esp.lb(this.b).a(), (vzx)esp.qn(this.b).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 837: {
                return new hln((vss)era.bR(eqy.r(this.a)).a(), (xib)esp.lb(this.b).a(), (tqd)eqy.qe(this.a).a(), 16, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 836: {
                final xhv xhv = (xhv)eqy.mq(this.a).a();
                final Context context2 = (Context)eqy.ps(this.a).a();
                final xhy xhy = (xhy)eqy.tP(this.a).a();
                final oby oby = (oby)eqy.gH(this.a).a();
                final aeea az = eqy.Az(this.a);
                final xjz ax = eqy.ax(this.a);
                final afvt afvt = (afvt)eqy.vy(this.a).a();
                final tgd tgd = (tgd)eqy.jn(this.a).a();
                final vcy vcy2 = (vcy)esp.oW(this.b).a();
                final cl cl = (cl)esp.rK(this.b).a();
                final cck cck = (cck)eqy.qU(this.a).a();
                final xip xip = (xip)eqy.lx(this.a).a();
                return new ibf(xhv, context2, xhy, oby, az, ax, afvt, tgd, vcy2, cl, cck, (bu)esp.pI(this.b).a(), (gbu)esp.ry(this.b).a(), (xnt)eqy.mi(this.a).a(), (abpq)esp.ka(this.b).a(), (hzn)era.eC(eqy.r(this.a)).a(), null, null, null, null, null, null, null);
            }
            case 835: {
                return knh.k((kni)esp.pl(this.b).a());
            }
            case 834: {
                return new aeea(esp.tn(this.b), (char[])null);
            }
            case 833: {
                return gns.t((bu)esp.pI(this.b).a(), (vcy)esp.oW(this.b).a(), (acpk)eqy.kK(this.a).a(), (aeea)esp.kY(this.b).a(), (jwv)esp.pm(this.b).a(), (wyv)esp.ow(this.b).a(), (vgo)era.dB(eqy.r(this.a)).a(), (bx)era.ah(eqy.r(this.a)).a(), (aeea)esp.iE(this.b).a(), (vai)eqy.vx(this.a).a(), (aekp)esp.gY(this.b).a(), (hof)esp.rm(this.b).a(), (aeea)eqy.mB(this.a).a(), arlr.b(esp.iS(this.b)), (acbm)esp.iR(this.b).a());
            }
            case 832: {
                return gpb.h((vdr)eqy.kE(this.a).a(), (oby)eqy.gH(this.a).a());
            }
            case 831: {
                return jts.u((bu)esp.pI(this.b).a(), (aeea)esp.iE(this.b).a(), (zlv)eqy.ho(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 830: {
                return new gnq((YpcOffersListDialogFragmentController)esp.wO(this.b).a(), 4);
            }
            case 829: {
                return srz.f((wxx)eqy.tf(this.a).a());
            }
            case 828: {
                return new sxs((wxx)eqy.tf(this.a).a());
            }
            case 827: {
                return new spw((wxx)eqy.tf(this.a).a(), 8);
            }
            case 826: {
                final aaec aaec2 = (aaec)eqy.lD(this.a).a();
                final eqy a5 = this.a;
                return new eyz(aaec2, eqy.ig(a5), (aaex)era.cr(eqy.r(a5)).a(), 7);
            }
            case 825: {
                return wap.k((vzf)esp.lc(this.b).a());
            }
            case 824: {
                final Activity activity = (Activity)esp.oz(this.b).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final zmt zmt = (zmt)eqy.kb(this.a).a();
                final wkb wkb = (wkb)era.bQ(eqy.r(this.a)).a();
                return new hln(activity, zmf, zmt, 15);
            }
            case 823: {
                return wdt.p((Activity)esp.oz(this.b).a(), (wal)esp.qn(this.b).a(), (vzd)esp.lh(this.b).a(), (xib)esp.lo(this.b).a(), (vai)esp.lg(this.b).a());
            }
            case 822: {
                return new gpx((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), 10);
            }
            case 821: {
                return wap.s((vss)era.bR(eqy.r(this.a)).a(), (xib)esp.lb(this.b).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 820: {
                return wap.r((vss)era.bR(eqy.r(this.a)).a(), (xib)esp.lb(this.b).a(), (vzx)esp.qn(this.b).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 819: {
                return new fcu((bu)esp.pI(this.b).a(), (tgd)eqy.jn(this.a).a(), eqy.ze(this.a), (tqd)eqy.qe(this.a).a(), (zmt)eqy.kb(this.a).a(), (zmf)eqy.pK(this.a).a(), (vcy)esp.oW(this.b).a(), (arwh)eqy.qn(this.a).a(), (vdr)eqy.kE(this.a).a(), (Executor)eqy.fT(this.a).a(), (byte[])null, (byte[])null);
            }
            case 818: {
                return new fcl((Context)esp.oz(this.b).a(), (kuf)esp.wn(this.b).a(), (abpq)esp.ka(this.b).a(), (fjw)esp.rM(this.b).a(), (arwh)eqy.qn(this.a).a(), 2, (byte[])null, (byte[])null);
            }
            case 817: {
                return hzk.h((xnt)eqy.mi(this.a).a(), esp.eg(this.b), (tqd)eqy.qe(this.a).a(), (Context)eqy.ps(this.a).a(), (abnl)esp.jX(this.b).a());
            }
            case 816: {
                return new goy((wyv)esp.ow(this.b).a(), (vcy)esp.pA(this.b).a(), (vai)esp.vZ(this.b).a(), (msr)esp.ox(this.b).a(), (byte[])null, (byte[])null);
            }
            case 815: {
                return new hln((kbw)esp.kK(this.b).a(), (wyv)esp.ow(this.b).a(), esp.oW(this.b), 5);
            }
            case 814: {
                return new gnq(esp.ky(this.b), 2);
            }
            case 813: {
                return new spw((tgd)eqy.jn(this.a).a(), 19);
            }
            case 812: {
                return new spw((tgd)eqy.jn(this.a).a(), 18, (char[])null);
            }
            case 811: {
                return gpb.u(esp.Aa(this.b), (vcy)eqy.he(this.a).a(), (Context)eqy.ps(this.a).a());
            }
            case 810: {
                return gns.j((adfq)era.bv(eqy.r(this.a)).a(), (gbo)esp.ib(this.b).a(), (Executor)eqy.fT(this.a).a(), (wyv)esp.ow(this.b).a(), (snn)esp.oQ(this.b).a());
            }
            case 809: {
                return jex.b((bu)esp.pI(this.b).a(), (zmf)eqy.pK(this.a).a(), (zmt)eqy.kb(this.a).a(), (tqd)eqy.qe(this.a).a());
            }
            case 808: {
                return sao.k((agkz)esp.rq(this.b).a(), (tqd)eqy.qe(this.a).a(), (acmm)esp.hY(this.b).a());
            }
            case 807: {
                return new hln((adfq)era.eG(eqy.r(this.a)).a(), esp.pO(this.b), (Executor)eqy.fT(this.a).a(), 13, (byte[])null, (byte[])null, (byte[])null);
            }
            case 806: {
                final bu bu3 = (bu)esp.pI(this.b).a();
                final tgd tgd2 = (tgd)eqy.jn(this.a).a();
                return ljk.l(bu3, (vcy)esp.oW(this.b).a(), (fxw)esp.gn(this.b).a());
            }
            case 805: {
                return fbd.q((riw)esp.pS(this.b).a());
            }
            case 804: {
                return new ProgressBarDialogFragmentController((bu)esp.pI(this.b).a());
            }
            case 803: {
                final jki yy = esp.yy(this.b);
                final vcy vcy3 = (vcy)esp.oW(this.b).a();
                final aeea aeea = (aeea)eqy.nL(this.a).a();
                final zmf zmf2 = (zmf)eqy.pK(this.a).a();
                final eqy a6 = this.a;
                return igy.v(yy, vcy3, aeea, zmf2, eqy.nJ(a6), (ine)eqy.lD(a6).a(), (aln)eqy.np(this.a).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), (wyv)esp.ow(this.b).a(), arlr.b(eqy.hP(this.a)), (tag)esp.iV(this.b).a(), esp.oq(this.b));
            }
            case 802: {
                return gpu.v((Context)esp.oz(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (acpk)eqy.kK(this.a).a(), (aeea)esp.iE(this.b).a(), (aeea)eqy.mB(this.a).a());
            }
            case 801: {
                final vdr vdr = (vdr)eqy.kE(this.a).a();
                final oby oby2 = (oby)eqy.gH(this.a).a();
                final vbs vbs = (vbs)eqy.hs(this.a).a();
                final eg eg = (eg)eqy.jx(this.a).a();
                final eqy a7 = this.a;
                return gpb.t(vdr, oby2, vbs, eg, eqy.eC(a7), eqy.iw(a7));
            }
            case 800: {
                return gku.i((Context)esp.oz(this.b).a(), esp.xW(this.b), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (acgs)eqy.kr(this.a).a(), (wyv)esp.ow(this.b).a(), (zmf)eqy.pK(this.a).a(), (tag)esp.iV(this.b).a());
            }
        }
    }
    
    private final Object q() {
        final int c = this.c;
        switch (c) {
            default: {
                throw new AssertionError(c);
            }
            case 999: {
                return gvs.j((bu)esp.pI(this.b).a(), (abpq)eqy.kh(this.a).a(), (abpq)esp.kb(this.b).a(), (zmf)eqy.pK(this.a).a(), (zlv)eqy.ho(this.a).a());
            }
            case 998: {
                final bu bu = (bu)esp.pI(this.b).a();
                final eqy a = this.a;
                return syt.q(bu, eqy.om(a), (man)eqy.ep(a).a(), (zmf)eqy.pK(this.a).a(), (Context)eqy.ps(this.a).a());
            }
            case 997: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (char[][][])null, (byte[])null, (byte[])null);
            }
            case 996: {
                return srz.i((Activity)esp.oz(this.b).a(), (vcy)esp.oW(this.b).a(), esp.yd(this.b), (syu)esp.nA(this.b).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a());
            }
            case 995: {
                final bu bu2 = (bu)esp.pI(this.b).a();
                final vwa aa = esp.Aa(this.b);
                final eqy a2 = this.a;
                return syt.s(bu2, aa, eqy.om(a2), (man)eqy.ep(a2).a(), (zmf)eqy.pK(this.a).a(), (Context)eqy.ps(this.a).a());
            }
            case 994: {
                return srz.n((sys)esp.gq(this.b).a(), (mdp)era.cI(eqy.r(this.a)).a());
            }
            case 993: {
                return gpb.l(era.aD(eqy.r(this.a)));
            }
            case 992: {
                return aaiu.h((abap)esp.uL(this.b).a());
            }
            case 991: {
                return gpb.k(eqy.tf(this.a));
            }
            case 990: {
                final vdr vdr = (vdr)eqy.kE(this.a).a();
                final zmf zmf = (zmf)eqy.pK(this.a).a();
                final esp b = this.b;
                return gpb.i(vdr, zmf, esp.wn(b), (abty)esp.qR(b).a(), (fjv)esp.ra(this.b).a(), (ghp)esp.nY(this.b).a(), (vai)eqy.wc(this.a).a());
            }
            case 989: {
                return fdq.v(esp.zz(this.b), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (bu)esp.pI(this.b).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (wyw)eqy.hP(this.a).a());
            }
            case 988: {
                return fdq.m((Context)eqy.ps(this.a).a());
            }
            case 987: {
                return new fdr((vcy)esp.oW(this.b).a(), 10);
            }
            case 986: {
                return new fca((zmt)eqy.kb(this.a).a(), (zml)eqy.hN(this.a).a(), (vcy)esp.oW(this.b).a(), (bu)esp.pI(this.b).a(), 1);
            }
            case 985: {
                return qxd.p();
            }
            case 984: {
                return qxd.q((bu)esp.pI(this.b).a(), (zmt)eqy.kb(this.a).a(), (zmf)eqy.pK(this.a).a(), (zml)eqy.hN(this.a).a(), (rlt)eqy.iv(this.a).a(), (ubu)eqy.or(this.a).a(), (vcy)esp.oW(this.b).a(), eqy.xs(this.a), (Executor)eqy.oN(this.a).a(), (man)esp.na(this.b).a());
            }
            case 983: {
                return actb.k((acvx)esp.pR(this.b).a(), (wyv)esp.ow(this.b).a(), (acwn)esp.rS(this.b).a());
            }
            case 982: {
                return gcn.u((Context)esp.oz(this.b).a(), (gbo)esp.ib(this.b).a(), esp.eM(this.b), (aeea)eqy.mB(this.a).a());
            }
            case 981: {
                return new fdr((SubscriptionNotificationOptionsDialogFragmentControllerImpl)esp.um(this.b).a(), 9, (byte[])null);
            }
            case 980: {
                return hxp.l((tgd)eqy.jn(this.a).a());
            }
            case 979: {
                return fdq.i((SubscriptionNotificationOptionsDialogFragmentControllerImpl)esp.um(this.b).a());
            }
            case 978: {
                return fuu.r((vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a(), (actt)esp.jL(this.b).a(), (oiu)esp.iT(this.b).a());
            }
            case 977: {
                return fuu.t((Context)esp.oz(this.b).a(), (wyw)esp.qg(this.b).a(), (acvy)esp.mz(this.b).a(), esp.eG(this.b), esp.zM(this.b), (tgd)eqy.jn(this.a).a(), (abpu)esp.qW(this.b).a(), (ziy)esp.uA(this.b).a(), (fjv)esp.ra(this.b).a(), (actt)esp.jL(this.b).a(), esp.zw(this.b), (hyx)esp.mA(this.b).a());
            }
            case 976: {
                return new fci((MealbarPromoController)esp.mB(this.b).a(), (wyv)esp.ow(this.b).a(), 10);
            }
            case 975: {
                final wbl a3 = wbm.a;
                return wap.d();
            }
            case 974: {
                return wap.b(esp.qn(this.b));
            }
            case 973: {
                return wap.h(esp.qn(this.b));
            }
            case 972: {
                final vyy vyy = (vyy)esp.ll(this.b).a();
                final wbl a4 = wbm.a;
                return wap.g(vyy);
            }
            case 971: {
                return wap.c((Activity)esp.oz(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 970: {
                return new fcl((Activity)esp.oz(this.b).a(), (xib)esp.he(this.b).a(), (acgs)eqy.kr(this.a).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), 19, (byte[])null, (byte[])null, (byte[])null);
            }
            case 969: {
                return new hyw((wyv)esp.ow(this.b).a(), esp.Ac(this.b), (glf)esp.mh(this.b).a(), null, null, null);
            }
            case 968: {
                return rid.c((vcy)esp.oW(this.b).a(), (Handler)eqy.sJ(this.a).a(), (rkg)era.em(eqy.r(this.a)).a(), (Activity)esp.oz(this.b).a());
            }
            case 967: {
                return rid.k(esp.mR(this.b));
            }
            case 966: {
                return new rjq((vcy)esp.oW(this.b).a(), (Handler)eqy.sJ(this.a).a(), (rkg)era.em(eqy.r(this.a)).a(), (bu)esp.pI(this.b).a());
            }
            case 965: {
                return new rjk(esp.mQ(this.b));
            }
            case 964: {
                return rid.j((rjk)esp.ks(this.b).a(), (hyt)esp.ku(this.b).a(), (vaf)eqy.pn(this.a).a());
            }
            case 963: {
                return fdq.h((abho)esp.gz(this.b).a());
            }
            case 962: {
                return fdq.o((vcy)esp.oW(this.b).a(), (tmx)eqy.pR(this.a).a(), eqy.xG(this.a), (vai)eqy.lg(this.a).a(), (xnt)eqy.mi(this.a).a(), (abpq)esp.ka(this.b).a(), esp.ef(this.b), (heo)era.aI(eqy.r(this.a)).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a(), (aanx)eqy.nt(this.a).a(), (Executor)eqy.fT(this.a).a(), (Executor)eqy.oN(this.a).a(), (fam)esp.wn(this.b).a(), (jqg)esp.hQ(this.b).a(), (fln)eqy.eR(this.a).a(), (vai)eqy.lz(this.a).a());
            }
            case 961: {
                return fdq.g((kwg)esp.jc(this.b).a());
            }
            case 960: {
                return fdq.l((kwg)esp.jc(this.b).a(), (vaf)eqy.pn(this.a).a(), (uxa)esp.eD(this.b), (vcy)esp.oW(this.b).a());
            }
            case 959: {
                return fcv.d((uwx)esp.jc(this.b).a());
            }
            case 958: {
                final uwx uwx = (uwx)esp.jc(this.b).a();
                final vaf vaf = (vaf)eqy.pn(this.a).a();
                final Object ed = esp.eD(this.b);
                final kzr g = kvu.g();
                arlr.b(esp.vA(this.b));
                arlr.b(esp.ra(this.b));
                return fdq.t(uwx, vaf, (uxa)ed, g, (abrj)esp.mY(this.b).a());
            }
            case 957: {
                return gcn.b((vaf)eqy.pn(this.a).a(), (Activity)esp.oz(this.b).a(), (acpk)eqy.kK(this.a).a(), (gbc)esp.oR(this.b).a(), (vai)eqy.vx(this.a).a());
            }
            case 956: {
                return gcn.r(esp.ze(this.b), (gdj)esp.rn(this.b).a());
            }
            case 955: {
                return new gvh((gdh)esp.ro(this.b).a(), 20);
            }
            case 954: {
                return vvq.n((adfq)era.bt(eqy.r(this.a)).a(), (Executor)eqy.fT(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 953: {
                return vvq.m((adfq)era.bu(eqy.r(this.a)).a(), (Executor)eqy.fT(this.a).a(), (vcy)esp.oW(this.b).a());
            }
            case 952: {
                return new gnq((elx)esp.gi(this.b).a(), 19, null, null);
            }
            case 951: {
                return gpu.h((tgd)eqy.jn(this.a).a());
            }
            case 950: {
                return gpu.b((bu)esp.pI(this.b).a(), (abpq)eqy.kh(this.a).a());
            }
            case 949: {
                return hlb.l((hmg)esp.ta(this.b).a());
            }
            case 948: {
                return new sqq();
            }
            case 947: {
                final esp b2 = this.b;
                final atke pk = esp.pk(b2);
                final eqy a5 = this.a;
                return new sva(pk, eqy.jn(a5), eqy.qe(a5), esp.hH(b2), esp.kO(b2), eqy.pn(a5), (byte[])null);
            }
            case 946: {
                return hlk.v((Context)esp.ut(this.b).a(), (tgd)eqy.jn(this.a).a(), (wyv)esp.ow(this.b).a(), (tqd)eqy.qe(this.a).a(), (vnu)eqy.gk(this.a).a(), (acps)esp.pk(this.b).a(), esp.yp(this.b), (sva)esp.hG(this.b).a(), (aeea)esp.sZ(this.b).a(), (vwa)era.aE(eqy.r(this.a)).a(), (aujg)era.aF(eqy.r(this.a)).a(), esp.cr(this.b), (Executor)eqy.fT(this.a).a(), (arwh)eqy.qn(this.a).a(), (ashi)era.eA(eqy.r(this.a)).a());
            }
            case 945: {
                return hlk.j((hmg)esp.ta(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 944: {
                return new gpx(esp.jc(this.b), kvu.g(), 1, (byte[])null);
            }
            case 943: {
                return hlk.n(eqy.pn(this.a), (ghb)esp.il(this.b).a(), (gpx)esp.tQ(this.b).a(), esp.td(this.b).a());
            }
            case 942: {
                return new hyt((tgd)eqy.jn(this.a).a(), 2);
            }
            case 941: {
                return gpu.n((paq)era.eV(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a());
            }
            case 940: {
                return new gnq(esp.pW(this.b), 13, null);
            }
            case 939: {
                return new fcl((vwa)eqy.ul(this.a).a(), esp.oW(this.b), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a(), (zmf)eqy.pK(this.a).a(), 16, (byte[])null);
            }
            case 938: {
                return gns.e((YouTubeControlsOverlay)esp.wA(this.b).a());
            }
            case 937: {
                return new fci((abpq)esp.ka(this.b).a(), (abuj)esp.kc(this.b).a(), 14);
            }
            case 936: {
                return jpw.e(eqy.xG(this.a), (vai)eqy.lg(this.a).a(), (gbu)esp.ry(this.b).a(), (vcy)esp.oW(this.b).a(), (abpu)esp.qW(this.b).a(), (tmx)eqy.pR(this.a).a(), (tmx)eqy.qZ(this.a).a(), (tjm)eqy.ib(this.a).a());
            }
            case 935: {
                return new blu((dax)eqy.pb(this.a).a(), (zrg)eqy.ga(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 934: {
                final vcy vcy = (vcy)esp.oW(this.b).a();
                final zrg zrg = (zrg)eqy.ga(this.a).a();
                final blu blu = (blu)esp.mb(this.b).a();
                final eqy a6 = this.a;
                return new acbc(vcy, zrg, blu, eqy.np(a6), eqy.pK(a6), (tmx)eqy.pR(a6).a(), (jqg)esp.hQ(this.b).a(), (Executor)eqy.oN(this.a).a(), (Executor)eqy.fT(this.a).a(), 1, (byte[])null, (byte[])null, (byte[])null);
            }
            case 933: {
                return vkh.b((Executor)eqy.fT(this.a).a(), era.ax(eqy.r(this.a)).a());
            }
            case 932: {
                return hxp.k((Activity)esp.oz(this.b).a(), (gkx)eqy.hv(this.a).a());
            }
            case 931: {
                return new gnq((Context)esp.oz(this.b).a(), 6, null);
            }
            case 930: {
                return actb.g((Activity)esp.oz(this.b).a());
            }
            case 929: {
                return actb.s(esp.yQ(this.b), esp.yV(this.b), esp.yZ(this.b));
            }
            case 928: {
                return jbu.l((jcf)esp.mm(this.b).a(), (jdn)esp.iw(this.b).a());
            }
            case 927: {
                return fcv.t((e)esp.mS(this.b).a());
            }
            case 926: {
                return knk.j((fa)esp.oF(this.b).a(), (accf)esp.iS(this.b).a(), (acbm)esp.iR(this.b).a());
            }
            case 925: {
                return fcv.s((aun)esp.pI(this.b).a(), era.cx(eqy.r(this.a)), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (e)esp.mS(this.b).a(), (wyw)eqy.hP(this.a).a());
            }
            case 924: {
                return acdj.u((aun)esp.pI(this.b).a(), era.cx(eqy.r(this.a)), (vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (acbq)esp.iT(this.b).a(), (aeea)eqy.iZ(this.a).a());
            }
            case 923: {
                return adca.b((vcy)esp.oW(this.b).a(), (Executor)eqy.fT(this.a).a(), (vox)era.ay(eqy.r(this.a)).a(), (cl)esp.rK(this.b).a(), (wyv)esp.ow(this.b).a(), era.bp(eqy.r(this.a)));
            }
            case 922: {
                return new spv((Context)esp.oz(this.b).a(), (adfs)era.ci(eqy.r(this.a)).a(), (vcy)esp.oW(this.b).a(), (wyw)eqy.hP(this.a).a(), (Executor)eqy.fT(this.a).a(), (bu)esp.pI(this.b).a(), (aeea)eqy.mB(this.a).a(), 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 921: {
                return new adbp((vox)era.ay(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (vcy)esp.oW(this.b).a(), (wyv)esp.ow(this.b).a());
            }
            case 920: {
                return new fca((vss)era.bR(eqy.r(this.a)).a(), (xib)esp.lb(this.b).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a(), 18, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 919: {
                return new tag((vss)era.bR(eqy.r(this.a)).a(), (xib)esp.lb(this.b).a(), 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 918: {
                return actb.l((tgd)eqy.jn(this.a).a());
            }
            case 917: {
                return fdq.s((avu)era.bU(eqy.r(this.a)).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 916: {
                return fdq.q((avu)era.eL(eqy.r(this.a)).a(), (vdr)eqy.kE(this.a).a(), (zmf)eqy.pK(this.a).a());
            }
            case 915: {
                return gns.p((ggr)esp.qL(this.b).a(), (ghb)esp.il(this.b).a(), (SharedPreferences)eqy.sp(this.a).a(), (jln)era.cJ(eqy.r(this.a)).a(), era.gU(eqy.r(this.a)), esp.zp(this.b), jex.s(), esp.yl(this.b), (wyw)eqy.hP(this.a).a());
            }
            case 914: {
                return new fdr((acvw)esp.pR(this.b).a(), 3);
            }
            case 913: {
                return jbu.k((ghk)esp.sI(this.b).a(), (abty)esp.qR(this.b).a(), (ghp)esp.nY(this.b).a(), (vai)eqy.wc(this.a).a());
            }
            case 912: {
                return new gor((Context)esp.oz(this.b).a(), (tgd)eqy.jn(this.a).a(), (abll)era.bB(eqy.r(this.a)).a(), (tqd)eqy.qe(this.a).a(), (Executor)eqy.fT(this.a).a(), (aeea)eqy.mB(this.a).a(), null, null, null, null, null);
            }
            case 911: {
                return fdq.f((uwx)esp.jc(this.b).a());
            }
            case 910: {
                return new gpx((acjd)eqy.mT(this.a).a(), (tgd)eqy.jn(this.a).a(), 7);
            }
            case 909: {
                return new gnq((tgd)eqy.jn(this.a).a(), 12);
            }
            case 908: {
                return new eyz((vtn)eqy.mP(this.a).a(), (vcy)esp.oW(this.b).a(), (tqd)eqy.qe(this.a).a(), 12, (byte[])null);
            }
            case 907: {
                return actb.m((tgd)eqy.jn(this.a).a());
            }
            case 906: {
                return hzk.l((Context)eqy.ps(this.a).a(), (xnt)eqy.mi(this.a).a());
            }
            case 905: {
                return gns.b((tqd)eqy.qe(this.a).a(), (wyw)esp.qg(this.b).a(), esp.eK(this.b));
            }
            case 904: {
                return fdq.b(esp.fQ(this.b));
            }
            case 903: {
                return new spw(esp.bP(this.b), 14);
            }
            case 902: {
                final PipObserver g2 = ggm.g((Activity)esp.oz(this.b).a(), (atjz)esp.qO(this.b).a());
                esp.bC(g2);
                return g2;
            }
            case 901: {
                return new vai((vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (char[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 900: {
                return gns.v((Context)esp.oz(this.b).a(), (xnt)eqy.mi(this.a).a(), hdz.t(), (hng)eqy.tE(this.a).a(), (hrp)eqy.tA(this.a).a(), (fzw)eqy.tH(this.a).a(), (fzw)eqy.uP(this.a).a(), (oby)eqy.gH(this.a).a(), arlr.b(esp.qJ(this.b)), (wyv)esp.ow(this.b).a(), Optional.of((Object)hoy.n()), (Optional)esp.rl(this.b).a(), (hny)eqy.tG(this.a).a(), (elx)eqy.un(this.a).a(), (vai)eqy.lu(this.a).a(), (vai)eqy.up(this.a).a(), (vai)eqy.uo(this.a).a(), (cyb)eqy.tC(this.a).a(), era.q(eqy.r(this.a)), (aeea)eqy.mB(this.a).a(), (fkf)eqy.gG(this.a).a(), (vaf)eqy.pn(this.a).a(), (arwh)eqy.qn(this.a).a(), (vai)esp.tN(this.b).a(), (PipObserver)esp.nG(this.b).a(), (acgs)eqy.kr(this.a).a(), (vdr)eqy.kE(this.a).a(), (msr)eqy.mM(this.a).a(), (hsh)eqy.tF(this.a).a(), (lkx)eqy.tD(this.a).a());
            }
        }
    }
    
    public final Object a() {
        final int c = this.c;
        switch (c / 100) {
            default: {
                Object o = null;
                switch (c) {
                    default: {
                        throw new AssertionError(c);
                    }
                    case 1610: {
                        final Context context = (Context)this.b.d.a();
                        final Executor executor = (Executor)this.a.E.a();
                        final zlo zlo = (zlo)this.a.nv.a();
                        final otk otk = (otk)this.a.fR.a();
                        o = new accl(executor, (aeea)this.a.jm.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        break;
                    }
                    case 1609: {
                        o = new acof(new gob((Activity)this.b.d.a(), 3));
                        break;
                    }
                    case 1608: {
                        o = new acof(new gob(this.b.D(), 2));
                        break;
                    }
                    case 1607: {
                        final Activity activity = (Activity)this.b.d.a();
                        final esp b = this.b;
                        final afev n = afev.n(ShortsCreationActivity.class, b.gJ, ReelWatchActivity.class, b.gK);
                        if (n.containsKey(activity.getClass())) {
                            o = ((atke)n.get(activity.getClass())).a();
                        }
                        else {
                            o = new acof(new gob(activity, 8));
                        }
                        ((accl)o).getClass();
                        break;
                    }
                    case 1606: {
                        final esp b2 = this.b;
                        o = new aels((msr)b2.m.a(), (elx)this.b.am.a(), null, null);
                        ((msr)((aels)o).d).Q((Callable)new exo((aels)o, (fjv)b2.z.a(), 5, (byte[])null, (byte[])null));
                        break;
                    }
                    case 1605: {
                        o = wxn.s();
                        break;
                    }
                    case 1604: {
                        o = wxn.s();
                        break;
                    }
                    case 1603: {
                        o = new jki(this.a.jL, this.b.d);
                        break;
                    }
                    case 1602: {
                        o = new kdt(this.b.d, this.a.jl, (byte[])null);
                        break;
                    }
                    case 1601: {
                        final eqy a = this.a;
                        o = new qcy(a.r, a.g, a.en, a.h, a.el, a.lC, a.jp, (short[])null, (byte[])null);
                        break;
                    }
                    case 1600: {
                        o = new acjy((Context)this.b.d.a(), (vcy)this.b.F.a(), (aeea)this.b.gG.a(), (byte[])null, (byte[])null, (byte[])null);
                        break;
                    }
                }
                return o;
            }
            case 15: {
                return this.i();
            }
            case 14: {
                return this.h();
            }
            case 13: {
                return this.g();
            }
            case 12: {
                return this.f();
            }
            case 11: {
                return this.e();
            }
            case 10: {
                return this.d();
            }
            case 9: {
                return this.q();
            }
            case 8: {
                return this.p();
            }
            case 7: {
                return this.o();
            }
            case 6: {
                return this.n();
            }
            case 5: {
                return this.m();
            }
            case 4: {
                return this.l();
            }
            case 3: {
                return this.k();
            }
            case 2: {
                return this.j();
            }
            case 1: {
                return this.c();
            }
            case 0: {
                return this.b();
            }
        }
    }
}
