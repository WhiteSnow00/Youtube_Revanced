import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedScrimOverlayRedirectController;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import android.view.accessibility.CaptioningManager;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.os.Handler;
import com.google.android.apps.youtube.app.player.overlay.DefaultInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.ChapterSeekOverlayController;
import java.util.Set;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isw implements arjd
{
    public static YouTubeInfoCardOverlayPresenter b(final Context context, final uwx uwx, final toa toa, final uxb uxb, final uxa uxa, final shw shw, final aaxm aaxm, final tdz tdz) {
        return new YouTubeInfoCardOverlayPresenter(context, uwx, toa, uxb, uxa, shw, aaxm, tdz);
    }
    
    public static itd c(final wyo wyo, final afqr afqr) {
        return new itd(wyo, afqr);
    }
    
    public static itj d(final Context context, final wvu wvu, final thh thh, final abhq abhq, final fbj fbj, final abns abns, final uyi uyi, final Set set) {
        return new itj(context, wvu, thh, abhq, fbj, abns, uyi, set);
    }
    
    public static ChapterSeekOverlayController e(final aays aays, final abns abns, final abfc abfc, final uyf uyf) {
        return new ChapterSeekOverlayController(aays, abns, abfc, uyf);
    }
    
    public static itx f() {
        return new itx();
    }
    
    public static DefaultInlineMutedControlsOverlay g(final Context context, final abbx abbx, final atjj atjj) {
        return new DefaultInlineMutedControlsOverlay(context, abbx, atjj);
    }
    
    public static iub h(final Handler handler) {
        return new iub(handler);
    }
    
    public static iuj i(final fpg fpg, final Handler handler, final itx itx, final atje atje, final uyf uyf, final wwv wwv, final Object o, final uyi uyi, final ivt ivt) {
        return new iuj(fpg, handler, itx, atje, uyf, wwv, (e)o, uyi, ivt, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static iuo j(final Context context) {
        return new iuo(context);
    }
    
    public static ivt k(final wwv wwv, final uyf uyf, final jaj jaj) {
        return new ivt(wwv, uyf, jaj);
    }
    
    public static iwd l(final aamw aamw) {
        return new iwd(aamw);
    }
    
    public static iud m(final abns abns, final atjj atjj, final asho asho, final lcl lcl, final qv qv, final iyy iyy) {
        return new iud(abns, atjj, asho, lcl, qv, iyy, (byte[])null, (byte[])null);
    }
    
    public static ivm n(final Context context, final abqa abqa, final abrv abrv, final abbh abbh, final qv qv, final fjp fjp) {
        CaptioningManager captioningManager;
        if (context.getSystemService("captioning") != null) {
            captioningManager = (CaptioningManager)context.getSystemService("captioning");
        }
        else {
            captioningManager = null;
        }
        return new ivm(context, captioningManager, abqa, abrv, abbh, qv, fjp, (byte[])null, (byte[])null);
    }
    
    public static ivy o(final qv qv, final tdz tdz, final aays aays, final fjl fjl, final aayd aayd, final Context context, final itx itx) {
        return new ivy(qv, tdz, aays, fjl, aayd, context, itx, (byte[])null, (byte[])null);
    }
    
    public static InteractiveInlineMutedControlsOverlay p(final Context context, final atjj atjj, final InlinePlaybackController inlinePlaybackController, final arud arud, final SubtitleButtonController subtitleButtonController, final wwu wwu, final absi absi, final ViewGroup viewGroup, final ViewGroup viewGroup2, final abns abns, final kal kal, final wvu wvu, final InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController, final uyi uyi, final shw shw, final kbr kbr, final jbp jbp) {
        return new InteractiveInlineMutedControlsOverlay(context, atjj, inlinePlaybackController, arud, subtitleButtonController, wwu, absi, viewGroup, viewGroup2, abns, kal, wvu, inlineMutedScrimOverlayRedirectController, uyi, shw, kbr, jbp, (byte[])null, (byte[])null);
    }
    
    public static isu q(final Context context, final jdj jdj, final abfv abfv, final a a) {
        return new isu(context, jdj, abfv, a, null, null, null, null);
    }
    
    public static isv r(final Context context, final Handler handler, final aceo aceo, final atjj atjj, final atjj atjj2, final mrm mrm, final jaj jaj) {
        return new isv(context, handler, aceo, atjj, atjj2, mrm, jaj, null, null, null);
    }
    
    public static ivr s(final ivp ivp, final ivq ivq, final vbq vbq, final zki zki, final abns abns, final uyi uyi, final asho asho, final mrm mrm) {
        return new ivr(ivp, ivq, vbq, zki, abns, uyi, asho, mrm, null, null, null);
    }
    
    public static ita t(final Context context, final isy isy, final aceo aceo, final vax vax, final toa toa, final aafi aafi, final zno zno, final wwv wwv, final aaxn aaxn, final uug uug, final abai abai, final aams aams, final mrm mrm) {
        return new ita(context, isy, aceo, vax, toa, aafi, zno, wwv, aaxn, uug, abai, aams, mrm, null, null, null, null);
    }
    
    public static iui u(final Context context, final aceo aceo, final aucj aucj, final arud arud, final uyi uyi, final uyi uyi2, final mrm mrm) {
        return new iui(context, aceo, aucj, arud, uyi, uyi2, mrm, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static FullscreenEngagementPanelOverlay v(final Context context, final fjp fjp, final xlv xlv, final arhr arhr, final iwq iwq, final abns abns, final arhr arhr2, final uyf uyf, final uyi uyi, final bhu bhu, final mrm mrm) {
        return new FullscreenEngagementPanelOverlay(context, fjp, xlv, arhr, iwq, abns, arhr2, uyf, uyi, bhu, mrm, null, null, null, null);
    }
}
