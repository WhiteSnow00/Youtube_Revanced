import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import android.os.Handler;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbk implements arjd
{
    public static MealbarPromoController b(final aeoe aeoe) {
        final MealbarPromoController p = ((gbl)((arix)aeoe.a()).aR()).p();
        p.getClass();
        return p;
    }
    
    public static gda c(final uyf uyf, final Activity activity, final acng acng, final gau gau, final uyi uyi) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        Object o;
        if (alvl.G) {
            o = new gcx((Context)activity, acng, uyf);
        }
        else {
            o = new gdb((Context)activity, acng, gau, uyi);
        }
        return (gda)o;
    }
    
    public static gdh d(final uyf uyf) {
        return new gdh(uyf);
    }
    
    public static ActiveStateLifecycleController e(final Executor executor, final bu bu) {
        return new ActiveStateLifecycleController(executor, bu);
    }
    
    public static ActiveStateScrollSelectionController f(final uyf uyf, final uyi uyi) {
        return new ActiveStateScrollSelectionController(uyf, uyi);
    }
    
    public static gen g(final Context context, final xlv xlv, final AccessibilityStateReceiver accessibilityStateReceiver, final fxo fxo, final tdz tdz, final gel gel, final fnq fnq) {
        return new gen(context, xlv, accessibilityStateReceiver, fxo, tdz, gel, fnq);
    }
    
    public static InlinePlaybackLifecycleController h(final Handler handler) {
        return new InlinePlaybackLifecycleController(handler);
    }
    
    public static geu i(final gew gew) {
        return new geu(gew);
    }
    
    public static LoopController j(final atjj atjj, final atjj atjj2, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        return new LoopController(atjj, atjj2, inlinePlaybackLifecycleController);
    }
    
    public static gen k(final aeoe aeoe) {
        final gen s = ((gfb)((arix)aeoe.a()).aR()).s();
        s.getClass();
        return s;
    }
    
    public static gew l(final iqi iqi, final atjj atjj, final abns abns, final qv qv, final fjp fjp, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        return new gew(iqi, atjj, abns, qv, fjp, inlinePlaybackLifecycleController, null, null);
    }
    
    public static gel m(final tdz tdz, final thh thh, final arud arud, final tku tku, final asgt asgt, final Executor executor, final asho asho, final asho asho2) {
        return new gel(tdz, thh, arud, tku, asgt, executor, asho, asho2, (byte[])null, (byte[])null);
    }
    
    public static gbn n(final Context context, final hyr hyr, final gau gau, final Handler handler, final zhb zhb, final uyi uyi) {
        return (gbn)new gax(Optional.of((Object)context), Optional.of((Object)hyr), gau, handler, zhb, uyi, (byte[])null);
    }
    
    public static gcy o(final cxz cxz, final gda gda) {
        return cxz.z(gda);
    }
    
    public static gcy p(final cxz cxz, final gda gda) {
        return cxz.z(gda);
    }
    
    public static gcy q(final cxz cxz, final gda gda) {
        return cxz.z(gda);
    }
    
    public static cxz r() {
        return new cxz(null, null, (short[])null);
    }
    
    public static hyc s(final vax vax, final wwu wwu, final acro acro, final ohn ohn) {
        return new hyc(vax, wwu, acro, ohn);
    }
    
    public static MealbarPromoController t(final Context context, final wwv wwv, final actu actu, final Object o, final hyc hyc, final tdz tdz, final abns abns, final zhb zhb, final fjp fjp, final acro acro, final alm alm, final hyc hyc2) {
        return new MealbarPromoController(context, wwv, actu, (hdv)o, hyc, tdz, abns, zhb, fjp, acro, alm, hyc2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fzo u(final hyr hyr, final cya cya) {
        return new fzo(hyr, cya, null, null, null, null, null);
    }
    
    public static fbw v(final Context context, final gbg gbg, final Object o, final aeby aeby) {
        return new fbw(context, gbg, (cxz)o, aeby, 7, null, null, null, null, null);
    }
}
