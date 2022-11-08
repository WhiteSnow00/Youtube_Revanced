import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.player.overlay.RepeatChapterPlaybackLoopController;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import android.os.Handler;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import j$.util.Optional;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixb implements arjd
{
    public static ViewGroup b(final Context context) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2131624586, (ViewGroup)null);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static tpw c() {
        return new tpw();
    }
    
    public static View[] d(final Optional optional, final TouchImageView touchImageView) {
        return new View[] { (View)optional.get(), (View)touchImageView };
    }
    
    public static iyw e(final atjj atjj, final atjj atjj2, final uyi uyi) {
        iyw iyw;
        if (uyi.f(45356780L)) {
            iyw = (iyw)atjj2.a();
        }
        else {
            iyw = (iyw)atjj.a();
        }
        iyw.getClass();
        return iyw;
    }
    
    public static ixd f(final abzk abzk, final ixe ixe, final arhr arhr, final wwv wwv, final abns abns, final fjl fjl, final uyi uyi, final uug uug) {
        return new ixd(abzk, ixe, arhr, wwv, abns, fjl, uyi, uug);
    }
    
    public static ixh g() {
        return new ixh();
    }
    
    public static ixj h(final Handler handler, final itx itx, final atje atje, final wwv wwv, final uyi uyi) {
        return new ixj(handler, itx, atje, wwv, uyi);
    }
    
    public static iye i(final uyi uyi) {
        return new iye(uyi);
    }
    
    public static iyn j(final Context context, final aceo aceo, final iyq iyq) {
        return new iyn(context, aceo, iyq);
    }
    
    public static iyq k(final Context context, final aceo aceo, final fjp fjp) {
        return new iyq(context, aceo, fjp);
    }
    
    public static ixv l(final xlv xlv, final irf irf, final AutonavToggleController autonavToggleController, final MusicAppDeeplinkButtonController musicAppDeeplinkButtonController, final uyi uyi, final uug uug, final fzo fzo, final arhr arhr) {
        return new ixv(xlv, irf, autonavToggleController, musicAppDeeplinkButtonController, uyi, uug, fzo, arhr, (byte[])null, (byte[])null);
    }
    
    public static RepeatChapterPlaybackLoopController m(final atjj atjj, final Context context, final utk utk, final jdt jdt, final agkw agkw, final aaxs aaxs, final jcm jcm, final jbg jbg, final aays aays, final wvu wvu) {
        return new RepeatChapterPlaybackLoopController(atjj, context, utk, jdt, agkw, aaxs, jcm, jbg, aays, wvu, (byte[])null, (byte[])null);
    }
    
    public static ixm n(final Context context, final aceo aceo, final aucj aucj, final arud arud, final uyi uyi, final uyi uyi2, final mrm mrm) {
        return new ixm(context, aceo, aucj, arud, uyi, uyi2, mrm, null, null, null, null);
    }
    
    public static iyx o(final iyw iyw, final PlaybackLifecycleMonitor playbackLifecycleMonitor, final qv qv, final mrm mrm, final tdz tdz, final abns abns, final iqi iqi, final fjp fjp, final uyi uyi, final uyi uyi2) {
        return new iyx(iyw, playbackLifecycleMonitor, qv, mrm, tdz, abns, iqi, fjp, uyi, uyi2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static SubtitleButtonController p(final Context context, final abns abns, final ish ish, final aja aja, final uyf uyf, final itx itx, final wwv wwv) {
        final SubtitleButtonController subtitleButtonController = new SubtitleButtonController(context, abns, ish, aja, uyf, (wwu)new hxp(wwv, 3), (byte[])null, (byte[])null);
        itx.a((itw)subtitleButtonController);
        return subtitleButtonController;
    }
    
    public static maw q(final jda jda, final wwv wwv) {
        return new maw(jda, wwv);
    }
    
    public static ixu r(final gfc gfc, final ixv ixv, final ashj ashj, final aja aja, final iwx iwx, final kti kti, final irf irf, final AutonavToggleController autonavToggleController, final SubtitleButtonController subtitleButtonController, final TouchImageView touchImageView, final ImageView imageView, final MusicAppDeeplinkButtonController musicAppDeeplinkButtonController, final maw maw, final arud arud) {
        return new ixu(gfc, ixv, ashj, aja, iwx, kti, irf, autonavToggleController, subtitleButtonController, touchImageView, imageView, musicAppDeeplinkButtonController, maw, arud, null, null, null, null, null);
    }
    
    public static bx s(final Context context) {
        return new bx(context, (char[])null);
    }
    
    public static bx t(final Object o) {
        return new bx((bx)o, null, null, null, null, null);
    }
    
    public static bx u(final atjj atjj) {
        return new bx(atjj, (byte[])null, (byte[])null);
    }
    
    public static YouTubeControlsOverlay v(final Context context, final tpw tpw, final ixh ixh, final jcm jcm, final abft abft, final abfr abfr, final iwk iwk, final wwv wwv, final elw elw, final abfc abfc, final arhr arhr, final ixu ixu, final jjg jjg, final Object o, final SuggestedActionsMainController suggestedActionsMainController, final isu isu, final jda jda, final abit abit, final jdd jdd, final jcz jcz, final ixv ixv, final jau jau, final uug uug, final ixd ixd, final abns abns, final asho asho, final uyf uyf, final arud arud, final iye iye, final aazk aazk, final ackz ackz, final iwd iwd, final kct kct, final View[] array, final lbc lbc, final iub iub, final itx itx, final abni abni, final iuj iuj, final Object o2, final Object o3, final ixk ixk, final lll lll, final blt blt, final ivd ivd, final ivt ivt, final jai jai, final jaf jaf, final jad jad, final uyi uyi, final uyi uyi2, final asgt asgt, final jbp jbp, final qpt qpt, final jdj jdj, final qpt qpt2, final uyi uyi3, final jaz jaz, final a a) {
        return new YouTubeControlsOverlay(context, tpw, ixh, jcm, abft, abfr, iwk, wwv, elw, abfc, arhr, ixu, jjg, (lht)o, suggestedActionsMainController, isu, jda, abit, jdd, jcz, ixv, jau, uug, ixd, abns, asho, uyf, arud, iye, aazk, (abyc)ackz, iwd, kct, array, lbc, iub, itx, abni, iuj, (iul)o2, (ixj)o3, ixk, lll, blt, ivd, ivt, jai, jaf, jad, uyi, uyi2, asgt, jbp, qpt, jdj, qpt2, uyi3, jaz, a, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
