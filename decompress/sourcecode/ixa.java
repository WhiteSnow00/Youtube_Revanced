import java.util.Set;
import android.view.ViewConfiguration;
import android.view.View$AccessibilityDelegate;
import app.revanced.integrations.sponsorblock.player.ui.SponsorBlockView;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import j$.util.Optional;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.app.Activity;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixa implements arjd
{
    public static abbb b(final abno abno, final ise ise) {
        return new abbb(abno, (abba)ise);
    }
    
    public static ViewGroup c(final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout) {
        final ViewGroup d = youTubePlayerOverlaysLayout.d;
        d.getClass();
        return d;
    }
    
    public static abbf d(final abno abno, final abni abni, final abbc abbc, final aanf aanf) {
        return new abbf(abno, abni, (abbe)abbc, aanf);
    }
    
    public static TouchImageView e(final Context context) {
        final TouchImageView touchImageView = (TouchImageView)LayoutInflater.from(context).inflate(2131625829, (ViewGroup)null);
        touchImageView.setVisibility(0);
        touchImageView.getClass();
        return touchImageView;
    }
    
    public static abbh f(final jbq jbq, final abbi abbi, final aatp aatp) {
        return (abbh)new abbg(new abbh[] { (abbh)jbq, (abbh)abbi, (abbh)aatp });
    }
    
    public static ixp g(final Context context) {
        return new ixp(context);
    }
    
    public static jcf h(final Context context) {
        return new jcf(context);
    }
    
    public static atje i() {
        return ((atje)atir.e()).aX();
    }
    
    public static sky j(final Context context, final wwv wwv, final sbc sbc) {
        return new sky(context.getResources(), wwv, sbc);
    }
    
    public static aatu k(final Context context, final aceo aceo, final ViewGroup viewGroup) {
        return new aatu(context, aceo, viewGroup);
    }
    
    public static aatk l(final Activity activity, final YouTubeControlsOverlay youTubeControlsOverlay, final atjj atjj, final isl isl) {
        final TouchImageView touchImageView = (TouchImageView)LayoutInflater.from((Context)activity).inflate(2131625756, (ViewGroup)null);
        youTubeControlsOverlay.B((View)touchImageView);
        return new aatk(atjj, (aatn)new aato(touchImageView), (aatn)isl, (Context)activity);
    }
    
    public static aatl m(final Context context, final ViewGroup viewGroup) {
        return new aatl(viewGroup, context);
    }
    
    public static aatp n(final Context context, final ViewGroup viewGroup) {
        return new aatp(viewGroup, context);
    }
    
    public static aatv o(final wwv wwv, final Context context, final ViewGroup viewGroup, final aceo aceo, final vax vax) {
        return new aatv(wwv, context, viewGroup, aceo, vax);
    }
    
    public static abfc p(final atjj atjj, final abff abff, final Handler handler, final absi absi, final qv qv, final uyf uyf, final abno abno) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        if (alvl.aJ) {
            qv.b = true;
        }
        final abfc abfc = new abfc(atjj, abff, handler, absi, qv, abno, (byte[])null);
        if (gkt.K(uyf)) {
            abfc.e = true;
        }
        if (gkt.L(uyf)) {
            abfc.f = true;
        }
        return abfc;
    }
    
    public static shs q(final atjj atjj, final vax vax, final iyn iyn, final rne rne, final zhb zhb, final qbo qbo, final oas oas, final toa toa, final sjy sjy, final iyq iyq) {
        toa.getClass();
        return new shs(atjj, vax, (shm)iyn, oas, (trb)new snq(toa, 1), sjy, rne, zhb, qbo, Optional.of((Object)iyq), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static YouTubePlayerOverlaysLayout r(final Activity activity, final tpw e, final absb[] array, final bhu i, final toa toa, final fpl f, final a a) {
        final View inflate = activity.getLayoutInflater().inflate(2131625030, (ViewGroup)null);
        SponsorBlockView.initialize((Object)inflate);
        final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = (YouTubePlayerOverlaysLayout)inflate;
        final boolean m = a.m();
        youTubePlayerOverlaysLayout.setAccessibilityDelegate((View$AccessibilityDelegate)new fqg());
        youTubePlayerOverlaysLayout.f = f;
        ((absd)youTubePlayerOverlaysLayout).i(toa);
        youTubePlayerOverlaysLayout.e = e;
        youTubePlayerOverlaysLayout.i = i;
        youTubePlayerOverlaysLayout.g = m;
        final tpv tpv = new tpv(ViewConfiguration.get(youTubePlayerOverlaysLayout.getContext()));
        final fok fok = new fok((View)youTubePlayerOverlaysLayout);
        ((tpz)tpv).c = (tpy)fok;
        tpv.b = (tpu)fok;
        e.b((tpx)tpv);
        ((absd)youTubePlayerOverlaysLayout).c(array);
        ((absd)youTubePlayerOverlaysLayout).getClass();
        return youTubePlayerOverlaysLayout;
    }
    
    public static eg s(final ixp ixp, final adof adof, final Set set) {
        return new eg(ixp, adof, set, (byte[])null, (byte[])null);
    }
    
    public static abad t(final auip auip, final YouTubeControlsOverlay youTubeControlsOverlay) {
        return auip.P((aazx)youTubeControlsOverlay, (abbm)new abbk());
    }
    
    public static abad u(final auip auip, final aatl aatl) {
        return auip.P((aazx)aatl, (abbm)new abbk());
    }
    
    public static qpt v(final Context context) {
        return new qpt(context);
    }
}
