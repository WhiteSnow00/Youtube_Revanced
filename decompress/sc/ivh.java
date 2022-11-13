import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedScrimOverlayRedirectController;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import android.view.accessibility.CaptioningManager;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivh implements arls
{
    public static ivi b(final fpn fpn, final Handler handler, final iuv iuv, final atjz atjz, final vaf vaf, final wyw wyw, final Object o, final vai vai, final iws iws) {
        return new ivi(fpn, handler, iuv, atjz, vaf, wyw, (e)o, vai, iws, null, null, null, null);
    }
    
    public static ivn c(final Context context) {
        return new ivn(context);
    }
    
    public static iws d(final wyw wyw, final vaf vaf, final jbi jbi) {
        return new iws(wyw, vaf, jbi);
    }
    
    public static ixc e(final aaor aaor) {
        return new ixc(aaor);
    }
    
    public static MiniPlayerErrorOverlay f(final Context context, final abpu abpu, final asid asid) {
        return new MiniPlayerErrorOverlay(context, abpu, asid);
    }
    
    public static MusicAppDeeplinkButtonController g(final Context context, final abpu abpu, final acpk acpk, final vcy vcy, final wyw wyw, final arkg arkg) {
        return new MusicAppDeeplinkButtonController(context, abpu, acpk, vcy, wyw, arkg);
    }
    
    public static ixn h(final arkg arkg, final itt itt, final vai vai) {
        return new ixn(arkg, itt, vai);
    }
    
    public static ixs i(final ixv ixv, final asid asid) {
        return new ixs(ixv, asid);
    }
    
    public static ixv j(final Context context, final acbm acbm, final arkg arkg, final wyw wyw) {
        return new ixv(context, acbm, arkg, wyw);
    }
    
    public static ixw k(final acbm acbm, final accf accf, final asid asid, final wyw wyw) {
        return new ixw(acbm, accf, asid, wyw);
    }
    
    public static ImageView l(final Context context) {
        final ImageView imageView = (ImageView)LayoutInflater.from(context).inflate(2131625832, (ViewGroup)null);
        imageView.setVisibility(8);
        imageView.getClass();
        return imageView;
    }
    
    public static siz m(final sji sji, final YouTubeInlineAdOverlay youTubeInlineAdOverlay, final sjh sjh, final snd snd, final wyw wyw, final vcy vcy, final sja sja) {
        sji.c((six)youTubeInlineAdOverlay);
        sji.c((six)sjh);
        sji.c((six)snd);
        return new siz((six)sji, wyw, vcy, new siw[] { (siw)sja });
    }
    
    public static abdn n(final Context context) {
        return new abdn(context);
    }
    
    public static ivb o(final abpu abpu, final atke atke, final asid asid, final ldn ldn, final qv qv, final izx izx) {
        return new ivb(abpu, atke, asid, ldn, qv, izx, (byte[])null, (byte[])null);
    }
    
    public static iwl p(final Context context, final absb absb, final abtw abtw, final abdb abdb, final qv qv, final fjv fjv) {
        CaptioningManager captioningManager;
        if (context.getSystemService("captioning") != null) {
            captioningManager = (CaptioningManager)context.getSystemService("captioning");
        }
        else {
            captioningManager = null;
        }
        return new iwl(context, captioningManager, absb, abtw, abdb, qv, fjv, (byte[])null, (byte[])null);
    }
    
    public static iwx q(final qv qv, final tgd tgd, final abap abap, final fjr fjr, final abaa abaa, final Context context, final iuv iuv) {
        return new iwx(qv, tgd, abap, fjr, abaa, context, iuv, (byte[])null, (byte[])null);
    }
    
    public static InteractiveInlineMutedControlsOverlay r(final Context context, final atke atke, final InlinePlaybackController inlinePlaybackController, final arwh arwh, final SubtitleButtonController subtitleButtonController, final wyv wyv, final abuj abuj, final ViewGroup viewGroup, final ViewGroup viewGroup2, final abpu abpu, final kbm kbm, final wxx wxx, final InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController, final vai vai, final skc skc, final kcq kcq, final jco jco) {
        return new InteractiveInlineMutedControlsOverlay(context, atke, inlinePlaybackController, arwh, subtitleButtonController, wyv, abuj, viewGroup, viewGroup2, abpu, kbm, wxx, inlineMutedScrimOverlayRedirectController, vai, skc, kcq, jco, (byte[])null, (byte[])null);
    }
    
    public static PipPaidProductBadgeOverlay s(final Context context, final abpu abpu, final Handler handler, final oby oby, final arwh arwh) {
        return new PipPaidProductBadgeOverlay(context, abpu, handler, oby, arwh, (byte[])null, (byte[])null);
    }
    
    public static iwq t(final iwo iwo, final iwp iwp, final vdr vdr, final zmf zmf, final abpu abpu, final vai vai, final asid asid, final msr msr) {
        return new iwq(iwo, iwp, vdr, zmf, abpu, vai, asid, msr, (byte[])null, (byte[])null);
    }
    
    public static FullscreenEngagementPanelOverlay u(final Context context, final fjv fjv, final xnt xnt, final arkg arkg, final ixn ixn, final abpu abpu, final arkg arkg2, final vaf vaf, final vai vai, final bhv bhv, final msr msr) {
        return new FullscreenEngagementPanelOverlay(context, fjv, xnt, arkg, ixn, abpu, arkg2, vaf, vai, bhv, msr, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ivg v(final Context context, final acgs acgs, final auda auda, final arwh arwh, final vai vai, final vai vai2, final msr msr) {
        return new ivg(context, acgs, auda, arwh, vai, vai2, msr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
