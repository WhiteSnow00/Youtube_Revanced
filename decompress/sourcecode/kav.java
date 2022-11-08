import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import android.app.Activity;
import java.util.Map;
import android.content.Context;
import com.google.android.apps.youtube.app.ui.keyboardshortcuts.KeyboardShortcutsController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kav implements arjd
{
    public static kbc b(final tme tme, final atjj atjj, final uyi uyi) {
        return new kbc(tme, atjj, uyi);
    }
    
    public static KeyboardShortcutsController c(final bu bu, final kzd kzd, final arhr arhr, final arhr arhr2, final arhr arhr3, final arhr arhr4, final arhr arhr5, final arhr arhr6, final arhr arhr7) {
        return new KeyboardShortcutsController(bu, kzd, arhr, arhr2, arhr3, arhr4, arhr5, arhr6, arhr7);
    }
    
    public static kek d(final Context context, final acno acno, final flg flg, final asho asho, final asho asho2) {
        return new kek(context, acno, flg, asho, asho2);
    }
    
    public static kfp e(final Context context, final giz giz) {
        return new kfp(context, giz);
    }
    
    public static acil f(final Context context) {
        return (acil)jfi.n(context);
    }
    
    public static acip g(final atjj atjj, final Map map, final Activity activity) {
        acip acip;
        if (map.containsKey(activity.getClass())) {
            acip = (acip)map.get(activity.getClass()).a();
        }
        else {
            acip = (acip)atjj.a();
        }
        acip.getClass();
        return acip;
    }
    
    public static acip h(final jet jet, final jfa jfa, final uyi uyi) {
        if (!uyi.bh()) {
            return (acip)jet;
        }
        return (acip)jfa;
    }
    
    public static acil i(final Context context) {
        return (acil)jfi.n(context);
    }
    
    public static fun j(final Context context, final giz giz) {
        return new fun(context, giz, 5);
    }
    
    public static kal k(final arud arud) {
        return new kal(arud, null, null);
    }
    
    public static kfi l(final Context context, final giz giz, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController, final feq feq, final Object o, final arud arud, final uyi uyi, final Optional optional) {
        return new kfi(context, giz, inlinePlaybackLifecycleController, (aboh)o, arud, uyi, optional, false, (byte[])null, (byte[])null);
    }
    
    public static aboh m(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6, final atjj atjj7, final atjj atjj8, final atjj atjj9, final atjj atjj10, final atjj atjj11, final atjj atjj12, final atjj atjj13, final atjj atjj14, final atjj atjj15) {
        return new aboh(atjj, atjj2, atjj3, atjj4, atjj5, atjj6, atjj7, atjj8, atjj9, atjj10, atjj11, atjj12, atjj13, atjj14, atjj15, (byte[])null);
    }
    
    public static acil n(final qbo qbo) {
        return (acil)qbo.I(2131625710);
    }
    
    public static acil o(final qbo qbo) {
        return (acil)qbo.I(2131625711);
    }
    
    public static kep p(final atjj atjj, final iqi iqi, final uyi uyi, final mrm mrm) {
        return new kep(atjj, iqi, uyi, mrm, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kaw q(final kct kct, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController, final ActiveStateLifecycleController activeStateLifecycleController, final Object o, final uyi uyi, final mrm mrm) {
        return new kaw(kct, inlinePlaybackLifecycleController, activeStateLifecycleController, (alm)o, uyi, mrm, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kaz r(final Context context, final mrm mrm, final abns abns, final iqi iqi) {
        return new kaz(context, mrm, abns, iqi, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kde s(final Context context, final ScheduledExecutorService scheduledExecutorService, final oas oas, final kdk kdk, final kfb kfb, final tdz tdz, final gkx gkx, final lht lht, final InlinePlaybackController inlinePlaybackController, final zhb zhb, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController, final aceo aceo, final uyi uyi) {
        return new kde(context, scheduledExecutorService, oas, kdk, kfb, tdz, gkx, lht, inlinePlaybackController, zhb, inlinePlaybackLifecycleController, aceo, uyi, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kea t(final Context context, final giz giz, final aceo aceo, final acnj acnj, final vax vax, final jjg jjg, final cxz cxz, final uyi uyi) {
        return new kea(context, giz, aceo, acnj, vax, jjg, cxz, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kew u(final Context context, final giz giz, final aceo aceo, final acnj acnj, final vax vax, final jjg jjg, final cxz cxz, final uyi uyi) {
        return new kew(context, giz, aceo, acnj, vax, jjg, cxz, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static bx v(final atjj atjj) {
        return new bx(atjj, (byte[])null, (byte[])null);
    }
}
