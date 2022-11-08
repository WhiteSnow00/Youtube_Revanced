import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.common.csi.WatchUiActionLatencyLogger;
import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.app.Activity;
import com.google.android.apps.youtube.app.watch.panel.ui.cinematics.WatchCinematicContainerVisibilityController;
import java.util.Set;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watch.panel.ui.cinematics.WatchCinematicSettingsController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcw implements arjd
{
    public static ley b() {
        return new ley();
    }
    
    public static lfb c(final tku tku, final uyi uyi) {
        return new lfb(tku, uyi);
    }
    
    public static WatchCinematicSettingsController d(final Context context, final atjj atjj, final tku tku, final ftc ftc) {
        return new WatchCinematicSettingsController(context, atjj, tku, ftc);
    }
    
    public static lec e(final abhr abhr, final acae acae) {
        return new lec(abhr, acae, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static c f(final lcf lcf, final kzd kzd) {
        return new c(lcf, kzd);
    }
    
    public static c g(final Context context) {
        return new c(context, (byte[])null, (byte[])null);
    }
    
    public static c h(final uyi uyi) {
        return new c(uyi);
    }
    
    public static blt i(final abns abns) {
        return new blt(abns);
    }
    
    public static lcy j(final bu bu, final wwv wwv, final tdz tdz, final abni abni, final PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, final vax vax, final c c, final acng acng, final veo veo, final bx bx, final uyi uyi) {
        return new lcy(bu, wwv, tdz, abni, playbackLoopShuffleMonitor, vax, c, acng, veo, bx, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static WatchCinematicContainerVisibilityController k(final gko gko, final asho asho, final xlv xlv, final kzd kzd, final blt blt, final abcr abcr, final ley ley, final arhr arhr, final WatchCinematicSettingsController watchCinematicSettingsController, final arhr arhr2, final Set set, final uyi uyi, final uyi uyi2) {
        return new WatchCinematicContainerVisibilityController(gko, asho, xlv, kzd, blt, abcr, ley, arhr, watchCinematicSettingsController, arhr2, set, uyi, uyi2, null, null, null, null, null);
    }
    
    public static abcr l(final Activity activity, final blt blt, final lbn lbn) {
        return new abcr(activity, blt, lbn, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static lfo m(final blt blt, final aawb aawb, final asho asho, final mrm mrm) {
        return new lfo(blt, aawb, asho, mrm, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static lfy n(final atjj atjj, final blt blt, final abgp abgp, final jjg jjg, final asho asho, final asho asho2, final abno abno, final abns abns) {
        return new lfy(atjj, blt, abgp, jjg, asho, asho2, abno, abns, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static lgb o(final Activity activity, final asho asho, final blt blt, final lfh lfh, final ley ley, final abcr abcr, final mrm mrm) {
        return new lgb(activity, asho, blt, lfh, ley, abcr, mrm, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static adbl p(final Object o, final blt blt, final atjj atjj, final cxz cxz) {
        return new adbl((lfy)o, blt, atjj, cxz, null, null, null, null, null);
    }
    
    public static ldz q(final vut vut, final acno acno, final tdz tdz, final tny tny, final wwv wwv, final aeby aeby, final avt avt, final asho asho, final acae acae, final oas oas, final hyw hyw, final aexq aexq) {
        return new ldz(vut, acno, tdz, tny, wwv, aeby, avt, asho, acae, oas, hyw, aexq, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static lcv r(final vut vut, final acno acno, final tdz tdz, final tny tny, final wwv wwv, final aeby aeby, final avt avt, final asho asho, final acae acae, final oas oas, final hyw hyw, final aexq aexq, final hob hob) {
        return new lcv(vut, acno, tdz, tny, wwv, aeby, avt, asho, acae, oas, hyw, aexq, hob, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ldg s(final vut vut, final acno acno, final tdz tdz, final tny tny, final wwv wwv, final aeby aeby, final avt avt, final asho asho, final acae acae, final oas oas, final hyw hyw, final aexq aexq, final hob hob) {
        return new ldg(vut, acno, tdz, tny, wwv, aeby, avt, asho, acae, oas, hyw, aexq, hob, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static lem t(final Activity activity, final c c, final atjj atjj, final actx actx, final aeby aeby) {
        return new lem(activity, c, atjj, actx, aeby, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static DefaultWatchPanelViewController u(final Activity activity, final tdz tdz, final hyy hyy, final hyz hyz, final abns abns, final lzi lzi, final rop rop, final lzi lzi2, final fzo fzo, final ruo ruo, final fzo fzo2, final aafi aafi, final fwz fwz, final vax vax, final fnt fnt, final blt blt, final fjp fjp, final e e, final wwv wwv, final fyt fyt, final ActiveStateScrollSelectionController activeStateScrollSelectionController, final hzf hzf, final lej lej, final leg leg, final aeby aeby, final blt blt2, final lds lds, final a a, final c c, final kct kct, final fxo fxo, final fav fav, final kyf kyf, final uyf uyf, final arud arud, final acnx acnx, final aeby aeby2, final c c2, final fzo fzo3, final ioe ioe, final AdsWebViewCacheController adsWebViewCacheController, final atjj atjj, final utk utk, final kct kct2, final osx osx, final kct kct3, final abhr abhr, final aawb aawb, final uyi uyi, final uyi uyi2, final kwe kwe, final mrm mrm, final mrm mrm2, final fjz fjz, final tlq tlq, final blt blt3, final WatchUiActionLatencyLogger watchUiActionLatencyLogger, final ley ley, final asho asho, final elw elw) {
        return new DefaultWatchPanelViewController(activity, tdz, hyy, hyz, abns, lzi, rop, lzi2, fzo, ruo, fzo2, fwz, vax, fnt, blt, fjp, e, wwv, fyt, activeStateScrollSelectionController, hzf, lej, leg, aeby, blt2, lds, a, c, kct, fxo, fav, kyf, uyf, arud, acnx, aeby2, c2, fzo3, ioe, adsWebViewCacheController, atjj, utk, kct2, osx, kct3, abhr, aawb, uyi, uyi2, kwe, mrm, mrm2, fjz, tlq, blt3, watchUiActionLatencyLogger, ley, asho, elw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static lfh v(final Activity activity, final hyc hyc, final qpt qpt, final adbl adbl, final blt blt, final abcr abcr) {
        return new lfh(activity, hyc, qpt, adbl, blt, abcr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
