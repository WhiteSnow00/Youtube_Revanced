import android.view.View;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.controls.PreviousPaddleMenuItemController;
import com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixx implements arls
{
    public static iwt b(final acgs acgs) {
        return new iwt(acgs);
    }
    
    public static sja c(final abdn abdn, final acgs acgs) {
        return new sja((abdl)abdn, acgs);
    }
    
    public static abbj d(final abpq abpq, final isq isq) {
        return new abbj(abpq, (abbh)isq);
    }
    
    public static abbv e(final abpq abpq, final abbf abbf, final abbz abbz, final xwk xwk, final ScheduledExecutorService scheduledExecutorService, final Executor executor) {
        return new abbv(abpq, abbf, abbz, xwk, scheduledExecutorService, executor);
    }
    
    public static atjz f() {
        return ((atjz)atjm.e()).bc();
    }
    
    public static aayl g(final Context context) {
        return new aayl(context);
    }
    
    public static abcr h(final Context context) {
        return new abcr(context);
    }
    
    public static abbz i(final YouTubeControlsOverlay youTubeControlsOverlay, final aavi aavi, final InlineMutedControlsOverlay inlineMutedControlsOverlay) {
        return new abbz(new abbs[] { (abbs)youTubeControlsOverlay, aavi, (abbs)inlineMutedControlsOverlay });
    }
    
    public static abcw j(final ixc ixc, final aavi aavi, final gil gil, final isy isy, final PreviousPaddleMenuItemController previousPaddleMenuItemController) {
        return new abcw(new abcy[] { (abcy)ixc, (abcy)aavi, (abcy)gil, (abcy)isy, (abcy)previousPaddleMenuItemController });
    }
    
    public static abee k(final aavi aavi, final itj itj) {
        return new abee(new abeg[] { (abeg)aavi, (abeg)itj });
    }
    
    public static jas l(final Context context, final YouTubeControlsOverlay youTubeControlsOverlay, final vcy vcy, final arkg arkg, final acbm acbm) {
        return new jas(context, arkg, acbm, vcy, youTubeControlsOverlay.q());
    }
    
    public static iwa m(final Context context) {
        return new iwa(new aaux(context));
    }
    
    public static aauw n(final iwa iwa, final aaqz aaqz) {
        return new aauw(iwa, aaqz);
    }
    
    public static uyw o(final atke atke) {
        final uyw uyw = (uyw)atke.a();
        uyw.getClass();
        return uyw;
    }
    
    public static InlineMutedControlsOverlay p(final vaf vaf, final atke atke, final atke atke2) {
        InlineMutedControlsOverlay inlineMutedControlsOverlay;
        if (fbu.Z(vaf)) {
            inlineMutedControlsOverlay = (InlineMutedControlsOverlay)atke2.a();
        }
        else {
            inlineMutedControlsOverlay = (InlineMutedControlsOverlay)atke.a();
        }
        inlineMutedControlsOverlay.getClass();
        return inlineMutedControlsOverlay;
    }
    
    public static ViewGroup q(final Context context) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2131624585, (ViewGroup)null);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static abde r(final Context context) {
        return new abde(context);
    }
    
    public static abed s(final YouTubeControlsOverlay youTubeControlsOverlay) {
        final iwv r = youTubeControlsOverlay.r;
        r.getClass();
        return (abed)r;
    }
    
    public static CreatorEndscreenOverlayPresenter t(final Context context, final aayl aayl, final its its, final acgs acgs, final vcy vcy, final abbz abbz, final ViewGroup viewGroup, final iri iri, final abpq abpq, final aahc aahc, final wyw wyw, final tqf tqf, final vai vai) {
        return new CreatorEndscreenOverlayPresenter(context, aayl, its, acgs, vcy, abbz, viewGroup, new ajb((View)viewGroup, (atke)new esd(iri, 18)), abpq, aahc, new zpk(), wyw, tqf, vai, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static sjf u(final jat jat, final acgs acgs, final vcy vcy, final tqf tqf, final smd smd, final rpi rpi, final ziy ziy, final qcy qcy, final vdr vdr, final arwh arwh, final wyw wyw) {
        return new sjf((sjd)jat, acgs, vcy, tqf, smd, rpi, ziy, qcy, vdr, arwh, wyw, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static jat v(final Context context, final acgs acgs, final YouTubeControlsOverlay youTubeControlsOverlay, final hyx hyx, final vai vai) {
        return new jat(context, acgs, youTubeControlsOverlay.q(), hyx, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
