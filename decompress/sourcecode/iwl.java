import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import android.os.Handler;
import android.view.View;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.apps.youtube.app.player.controls.PreviousPaddleMenuItemController;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.youtube.app.player.overlay.YouTubeInlineAdOverlay;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwl implements arjd
{
    public static MusicAppDeeplinkButtonController b(final Context context, final abns abns, final acng acng, final vax vax, final wwv wwv, final arhr arhr) {
        return new MusicAppDeeplinkButtonController(context, abns, acng, vax, wwv, arhr);
    }
    
    public static MiniPlayerErrorOverlay c(final Context context, final abns abns, final asho asho) {
        return new MiniPlayerErrorOverlay(context, abns, asho);
    }
    
    public static iwq d(final arhr arhr, final isu isu, final uyi uyi) {
        return new iwq(arhr, isu, uyi);
    }
    
    public static iwu e(final iwx iwx, final asho asho) {
        return new iwu(iwx, asho);
    }
    
    public static iwx f(final Context context, final abzk abzk, final arhr arhr, final wwv wwv) {
        return new iwx(context, abzk, arhr, wwv);
    }
    
    public static iwy g(final abzk abzk, final acae acae, final asho asho, final wwv wwv) {
        return new iwy(abzk, acae, asho, wwv);
    }
    
    public static ImageView h(final Context context) {
        final ImageView imageView = (ImageView)LayoutInflater.from(context).inflate(2131625828, (ViewGroup)null);
        imageView.setVisibility(8);
        imageView.getClass();
        return imageView;
    }
    
    public static sgu i(final shc shc, final YouTubeInlineAdOverlay youTubeInlineAdOverlay, final shb shb, final sky sky, final wwv wwv, final vax vax, final sgv sgv) {
        shc.c((sgs)youTubeInlineAdOverlay);
        shc.c((sgs)shb);
        shc.c((sgs)sky);
        return new sgu((sgs)shc, wwv, vax, new sgr[] { (sgr)sgv });
    }
    
    public static abbt j(final Context context) {
        return new abbt(context);
    }
    
    public static sgv k(final abbt abbt, final aceo aceo) {
        return new sgv((abbq)abbt, aceo);
    }
    
    public static ivu l(final aceo aceo) {
        return new ivu(aceo);
    }
    
    public static aazo m(final abno abno, final irs irs) {
        return new aazo(abno, (aazm)irs);
    }
    
    public static abaa n(final abno abno, final aazk aazk, final abae abae, final xun xun, final ScheduledExecutorService scheduledExecutorService, final Executor executor) {
        return new abaa(abno, aazk, (aazx)abae, xun, scheduledExecutorService, executor);
    }
    
    public static atje o() {
        return ((atje)atir.e()).aX();
    }
    
    public static aawp p(final Context context) {
        return new aawp(context);
    }
    
    public static abax q(final Context context) {
        return new abax(context);
    }
    
    public static abae r(final YouTubeControlsOverlay youTubeControlsOverlay, final aatl aatl, final InlineMutedControlsOverlay inlineMutedControlsOverlay) {
        return new abae(new aazx[] { (aazx)youTubeControlsOverlay, (aazx)aatl, (aazx)inlineMutedControlsOverlay });
    }
    
    public static abbc s(final iwd iwd, final aatl aatl, final gic gic, final isa isa, final PreviousPaddleMenuItemController previousPaddleMenuItemController) {
        return new abbc(new abbe[] { (abbe)iwd, (abbe)aatl, (abbe)gic, (abbe)isa, (abbe)previousPaddleMenuItemController });
    }
    
    public static abck t(final aatl aatl, final isk isk) {
        return new abck(new abcm[] { (abcm)aatl, (abcm)isk });
    }
    
    public static CreatorEndscreenOverlayPresenter u(final Context context, final aawp aawp, final ist ist, final aceo aceo, final vax vax, final abae abae, final ViewGroup viewGroup, final iqi iqi, final abno abno, final aafi aafi, final wwv wwv, final toa toa, final uyi uyi) {
        return new CreatorEndscreenOverlayPresenter(context, aawp, ist, aceo, vax, abae, viewGroup, new aja((View)viewGroup, (atjj)new esb(iqi, 18)), abno, aafi, new zno(), wwv, toa, uyi, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static PipPaidProductBadgeOverlay v(final Context context, final abns abns, final Handler handler, final oas oas, final arud arud) {
        return new PipPaidProductBadgeOverlay(context, abns, handler, oas, arud, null, null);
    }
}
