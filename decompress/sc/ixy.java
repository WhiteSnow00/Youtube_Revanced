import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import j$.util.Optional;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View$AccessibilityDelegate;
import app.revanced.integrations.sponsorblock.player.ui.SponsorBlockView;
import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.libraries.youtube.mdx.player.MdxVideoQualitySelectorPresenter;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixy implements arls
{
    public static sjh b(final Context context) {
        return new sjh(context);
    }
    
    public static atjz c() {
        return ((atjz)atjs.e()).bc();
    }
    
    public static iap d(final Context context) {
        return new iap(context, context.getResources().getDimensionPixelSize(2131167882));
    }
    
    public static MdxVideoQualitySelectorPresenter e(final Resources resources, final abpq abpq, final abee abee, final xnt xnt) {
        return new MdxVideoQualitySelectorPresenter(resources, abpq, (abeg)abee, xnt);
    }
    
    public static sji f() {
        return new sji(new six[0]);
    }
    
    public static aaot g(final isl isl, final aavq aavq) {
        return new aaot(new aaod[] { (aaod)isl, (aaod)aavq });
    }
    
    public static sjm h(final rpl rpl, final vcy vcy, final izm izm, final oby oby, final tqf tqf) {
        return new sjm(rpl, vcy, (sjs)izm, oby, tqf);
    }
    
    public static abcv i(final abpq abpq, final itd itd) {
        return new abcv(abpq, (abcu)itd);
    }
    
    public static ViewGroup j(final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout) {
        final ViewGroup d = youTubePlayerOverlaysLayout.d;
        d.getClass();
        return d;
    }
    
    public static abcz k(final abpq abpq, final abpl abpl, final abcw abcw, final aapa aapa) {
        return new abcz(abpq, abpl, (abcy)abcw, aapa);
    }
    
    public static TouchImageView l(final Context context) {
        final TouchImageView touchImageView = (TouchImageView)LayoutInflater.from(context).inflate(2131625833, (ViewGroup)null);
        touchImageView.setVisibility(0);
        touchImageView.getClass();
        return touchImageView;
    }
    
    public static abdb m(final jcp jcp, final abde abde, final aavm aavm) {
        return (abdb)new abda(new abdb[] { (abdb)jcp, (abdb)abde, (abdb)aavm });
    }
    
    public static abgw n(final atke atke, final abgz abgz, final Handler handler, final abuj abuj, final qv qv, final vaf vaf, final abpq abpq) {
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        if (alxp.aJ) {
            qv.b = true;
        }
        final abgw abgw = new abgw(atke, abgz, handler, abuj, qv, abpq, (byte[])null);
        if (fbu.am(vaf)) {
            abgw.e = true;
        }
        if (fbu.an(vaf)) {
            abgw.f = true;
        }
        return abgw;
    }
    
    public static abcp o(final abrj abrj, final abcr abcr, final Context context, final abpu abpu) {
        return abrj.H(context, (abcn)abcr, abpu);
    }
    
    public static YouTubePlayerOverlaysLayout p(final Activity activity, final tsb e, final abuc[] array, final bhv i, final tqf tqf, final fps f, final jki jki) {
        final View inflate = activity.getLayoutInflater().inflate(2131625031, (ViewGroup)null);
        SponsorBlockView.initialize((Object)inflate);
        final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = (YouTubePlayerOverlaysLayout)inflate;
        final boolean n = jki.n();
        youTubePlayerOverlaysLayout.setAccessibilityDelegate((View$AccessibilityDelegate)new fqp());
        youTubePlayerOverlaysLayout.f = f;
        youTubePlayerOverlaysLayout.i(tqf);
        youTubePlayerOverlaysLayout.e = e;
        youTubePlayerOverlaysLayout.i = i;
        youTubePlayerOverlaysLayout.g = n;
        final tsa tsa = new tsa(ViewConfiguration.get(youTubePlayerOverlaysLayout.getContext()));
        final fop fop = new fop((View)youTubePlayerOverlaysLayout);
        ((tse)tsa).c = (tsd)fop;
        tsa.b = (trz)fop;
        e.b((tsc)tsa);
        youTubePlayerOverlaysLayout.c(array);
        youTubePlayerOverlaysLayout.getClass();
        return youTubePlayerOverlaysLayout;
    }
    
    public static sjy q(final atke atke, final vcy vcy, final izm izm, final rpi rpi, final ziy ziy, final qcy qcy, final oby oby, final tqf tqf, final smd smd, final izp izp) {
        tqf.getClass();
        return new sjy(atke, vcy, (sjs)izm, oby, (ttg)new spu(tqf, 1), smd, rpi, ziy, qcy, Optional.of((Object)izp), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static abuc[] r(final vai vai, final pvh pvh, final izv izv, final abdn abdn, final aayl aayl, final jcp jcp, final FullscreenEngagementPanelOverlay fullscreenEngagementPanelOverlay, final InlineMutedControlsOverlay inlineMutedControlsOverlay, final isl isl, final iap iap, final YouTubeControlsOverlay youTubeControlsOverlay, final abcr abcr, final itw itw, final uyu uyu, final uyw uyw, final fxm fxm, final RentalActivationOverlay rentalActivationOverlay, YouTubeInlineAdOverlay youTubeInlineAdOverlay, final izm izm, final jat jat, final jas jas, final abcg abcg, final sjh sjh, final iat iat, final isj isj, final iab iab, final jag jag, final NoSoundMemoOverlay noSoundMemoOverlay, final iyy iyy, final ixo ixo, final jdg jdg, final ivn ivn, final wbf wbf, final jcf jcf, final vaf vaf, final vai vai2, final iyn iyn) {
        final fqk c = ezt.c((abuc)aayl, "player_overlay_creator_endscreen");
        final fqk c2 = ezt.c((abuc)abdn, "player_overlay_placeholder_image");
        final fqk i = fal.i((abuc)abcg);
        Object u = c;
        if (vai.f(45356784L)) {
            u = pvh.u((abuc)c, false);
        }
        final fqk g = fal.g((abuc)jcp);
        final fqk j = fal.i((abuc)ezt.c((abuc)iap, "player_overlay_mdx_header_text"));
        final fqk k = fal.i((abuc)ezt.c((abuc)wbf, "player_overlay_live_chat_entry_point"));
        final fqk c3 = ezt.c((abuc)jag, "player_overlay_ads_cta");
        final fqk h = fal.h((abuc)ezt.c((abuc)abcr, "player_overlay_nerd_stats"));
        final fqk g2 = fal.g((abuc)itw);
        final fqk g3 = fal.g((abuc)uyu);
        final fqk g4 = fal.g((abuc)uyw);
        final fqk c4 = ezt.c((abuc)fxm, "player_overlay_player_trailer_label");
        final fqk c5 = ezt.c((abuc)rentalActivationOverlay, "player_overlay_rental_activation");
        if (!vai2.f(45364466L)) {
            final ahqo l = qdw.k(vaf);
            if (l == null || !l.n) {
                return new abuc[] { (abuc)izv, (abuc)c2, (abuc)i, (abuc)u, (abuc)fullscreenEngagementPanelOverlay, (abuc)g, (abuc)inlineMutedControlsOverlay, (abuc)isl, (abuc)j, (abuc)iab, (abuc)k, (abuc)c3, (abuc)youTubeControlsOverlay, (abuc)h, (abuc)g2, (abuc)g3, (abuc)g4, (abuc)c4, (abuc)c5, (abuc)youTubeInlineAdOverlay, (abuc)izm, (abuc)ezt.c((abuc)jat, "player_overlay_endcap"), (abuc)ezt.c((abuc)jas, "player_overlay_elements_ad_video_end"), (abuc)ezt.c((abuc)sjh, "player_overlay_mdx_ad"), (abuc)fal.g((abuc)noSoundMemoOverlay), (abuc)fal.h((abuc)iyy), (abuc)new fqi((abuc)ixo), (abuc)fal.i((abuc)jdg), (abuc)fal.i((abuc)ezt.c((abuc)iat, "player_overlay_mdx_status")), (abuc)fal.i((abuc)ezt.c((abuc)isj, "player_overlay_mdx_autoplay")), (abuc)jcf, (abuc)ivn, (abuc)iyn };
            }
        }
        youTubeInlineAdOverlay = (YouTubeInlineAdOverlay)new fqj((abuc)fal.g((abuc)youTubeInlineAdOverlay));
        return new abuc[] { (abuc)izv, (abuc)c2, (abuc)i, (abuc)u, (abuc)fullscreenEngagementPanelOverlay, (abuc)g, (abuc)inlineMutedControlsOverlay, (abuc)isl, (abuc)j, (abuc)iab, (abuc)k, (abuc)c3, (abuc)youTubeControlsOverlay, (abuc)h, (abuc)g2, (abuc)g3, (abuc)g4, (abuc)c4, (abuc)c5, (abuc)youTubeInlineAdOverlay, (abuc)izm, (abuc)ezt.c((abuc)jat, "player_overlay_endcap"), (abuc)ezt.c((abuc)jas, "player_overlay_elements_ad_video_end"), (abuc)ezt.c((abuc)sjh, "player_overlay_mdx_ad"), (abuc)fal.g((abuc)noSoundMemoOverlay), (abuc)fal.h((abuc)iyy), (abuc)new fqi((abuc)ixo), (abuc)fal.i((abuc)jdg), (abuc)fal.i((abuc)ezt.c((abuc)iat, "player_overlay_mdx_status")), (abuc)fal.i((abuc)ezt.c((abuc)isj, "player_overlay_mdx_autoplay")), (abuc)jcf, (abuc)ivn, (abuc)iyn };
    }
    
    public static pvh s(final Context context) {
        return new pvh(context);
    }
    
    public static abbr t(final aujg aujg) {
        final abbq abbq = new abbq();
        final abdg abdg = new abdg();
        final abpq abpq = (abpq)((atke)aujg.b).a();
        abpq.getClass();
        final tgd tgd = (tgd)((atke)aujg.c).a();
        tgd.getClass();
        final abuj abuj = (abuj)((atke)aujg.a).a();
        abuj.getClass();
        return new abby(abpq, tgd, abuj, abbq, (abdi)abdg, false);
    }
    
    public static abby u(final aujg aujg, final YouTubeControlsOverlay youTubeControlsOverlay) {
        return aujg.Q((abbs)youTubeControlsOverlay, (abdi)new abdg());
    }
    
    public static abcs v(final abpq abpq, final Context context, final aeea aeea) {
        return new abcs(abpq, context, aeea, null, null, null);
    }
    
    public final Object a() {
        throw null;
    }
}
