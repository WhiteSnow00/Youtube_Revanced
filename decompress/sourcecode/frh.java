import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.util.Map;
import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frh implements arjd
{
    public static ftt b(final arhr arhr) {
        return new ftt(arhr);
    }
    
    public static ftu c(final arhr arhr) {
        return new ftu(arhr);
    }
    
    public static SubscriptionNotificationOptionsDialogFragmentControllerImpl d(final bu bu, final zki zki, final zjy zjy) {
        return new SubscriptionNotificationOptionsDialogFragmentControllerImpl(bu, zki, zjy);
    }
    
    public static fwr e(final oas oas, final fjp fjp, final abns abns, final fxo fxo) {
        return new fwr(oas, fjp, new Handler(), abns, fxo);
    }
    
    public static fxk f(final tgw tgw, final atjj atjj) {
        return new fxk(tgw, atjj);
    }
    
    public static RentalActivationOverlay g(final Context context, final fjp fjp) {
        return new RentalActivationOverlay(context, fjp);
    }
    
    public static fyt h(final fjp fjp, final vax vax, final Handler handler, final Executor executor, final oas oas, final fxo fxo, final uyi uyi, final atjj atjj) {
        return new fyt(fjp, vax, handler, executor, oas, fxo, uyi, atjj);
    }
    
    public static fyy i(final fa fa) {
        return new fyy(fa);
    }
    
    public static gau j(final Activity activity, final Map map, final atjj atjj) {
        atjj atjj2 = map.get(activity.getClass());
        if (atjj2 == null) {
            atjj2 = atjj;
        }
        final gau gau = (gau)atjj2.a();
        gau.getClass();
        return gau;
    }
    
    public static gbh k(final gau gau, final Handler handler, final aceo aceo, final Context context, final uyi uyi) {
        return new gbh(gau, handler, aceo, context, uyi);
    }
    
    public static fun l(final Context context) {
        return new fun(context, 1);
    }
    
    public static fzo m(final atjj atjj, final oas oas) {
        return new fzo(atjj, oas);
    }
    
    public static tku n(final Context context, final String c, final aftr aftr, final qbo qbo) {
        final String[] a = fvn.a;
        final qmr a2 = qms.a(context);
        a2.e("restorecontext");
        a2.f("restore_context.pb");
        final Uri a3 = a2.a();
        final qoq a4 = qor.a();
        a4.e((MessageLite)fvq.a);
        a4.f(a3);
        final qos d = qou.d(context, (Executor)aftr);
        d.c = c;
        d.b();
        d.d(fvn.a);
        d.e((qot)fnd.c);
        a4.b((qon)d.a());
        return (tku)new tks(qan.h(qbo.D(a4.a())), (MessageLite)fvq.a);
    }
    
    public static fty o(final blt blt, final Context context, final uyi uyi) {
        return new fty(blt, context, uyi, 3, (byte[])null, (byte[])null);
    }
    
    public static MainAppPlayerOverlayDataProvider p(final Context context, final osb osb, final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, final bhu bhu, final abns abns, final iwd iwd) {
        return new MainAppPlayerOverlayDataProvider(context, osb, youTubePlayerOverlaysLayout, bhu, abns, iwd, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static cxz q(final aagm aagm) {
        return new cxz(aagm, (byte[])null);
    }
    
    public static gaz r(final gau gau, final Handler handler, final atjj atjj, final wwu wwu, final aeim aeim) {
        return new gaz(gau, handler, atjj, wwu, aeim, null, null, null, null);
    }
    
    public static cxz s(final tku tku) {
        return new cxz(tku);
    }
    
    public static hyc t(final adcg adcg, final zki zki, final vup vup, final cxz cxz) {
        return new hyc(adcg, zki, vup, cxz, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static frg u(final Context context, final Executor executor, final zjr zjr, final osb osb, final aeby aeby) {
        return new frg(executor, aeby, null, null);
    }
    
    public static frd v(final Context context, final Executor executor, final zjr zjr, final osb osb, final aeby aeby) {
        return new frd(executor, aeby, null, null);
    }
}
