import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import android.view.ViewGroup;
import android.app.Activity;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khc implements arls
{
    public static kgq b(final Context context, final gjh gjh) {
        return new kgq(context, gjh);
    }
    
    public static acko c(final Context context) {
        return (acko)jgk.n(context);
    }
    
    public static acks d(final atke atke, final Map map, final Activity activity) {
        acks acks;
        if (map.containsKey(activity.getClass())) {
            acks = (acks)map.get(activity.getClass()).a();
        }
        else {
            acks = (acks)atke.a();
        }
        acks.getClass();
        return acks;
    }
    
    public static acks e(final Context context, final jfv jfv, final jgc jgc) {
        if (!fal.v(context)) {
            return (acks)jfv;
        }
        return (acks)jgc;
    }
    
    public static acko f(final Context context) {
        return (acko)jgk.n(context);
    }
    
    public static acko g(final khq khq) {
        final Activity activity = (Activity)khq.a.a();
        activity.getClass();
        return new khp(activity, null);
    }
    
    public static khf h(final Context context, final acgs acgs, final gjh gjh, final vcy vcy, final acpn acpn) {
        return new khf(context, acgs, gjh, vcy, acpn);
    }
    
    public static fuw i(final Context context, final gjh gjh) {
        return new fuw(context, gjh, 5);
    }
    
    public static acko j(final qcy qcy) {
        return (acko)qcy.I(2131625714);
    }
    
    public static acko k(final qcy qcy) {
        return (acko)qcy.I(2131625715);
    }
    
    public static acko l(final qcy qcy) {
        return (acko)qcy.I(2131625739);
    }
    
    public static acko m(final qcy qcy) {
        return (acko)qcy.I(2131625739);
    }
    
    public static acko n(final qcy qcy) {
        return (acko)qcy.I(2131625741);
    }
    
    public static acko o(final qcy qcy) {
        return (acko)qcy.I(2131625743);
    }
    
    public static acko p(final qcy qcy) {
        return (acko)qcy.I(2131625744);
    }
    
    public static acko q(final qcy qcy) {
        return (acko)qcy.I(2131625738);
    }
    
    public static kis r(final Context context, final vcy vcy, final acgs acgs, final vdr vdr, final mcb mcb, final vai vai) {
        return new kis(context, vcy, acgs, vdr, mcb, vai, null, null);
    }
    
    public static kmz s(final Context context, final rpa rpa, final oby oby, final avu avu, final vcy vcy, final AdsWebViewCacheController adsWebViewCacheController) {
        return new kmz(context, rpa, oby, avu, vcy, adsWebViewCacheController, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static khz t(final Context context, final acgs acgs, final vcy vcy, final acpn acpn, final acpk acpk, final hyx hyx, final aujg aujg, final oby oby, final jst jst, final qcy qcy, final cya cya, final jki jki, final aeea aeea, final vai vai) {
        return new khz(context, acgs, vcy, acpn, acpk, hyx, aujg, oby, jst, qcy, cya, jki, aeea, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kle u(final Context context, final acgs acgs, final vcy vcy, final acpk acpk, final acpn acpn, final rzy rzy, final oyy oyy, final vgy vgy, final hyx hyx, final tgd tgd, final hyx hyx2, final aeea aeea, final vai vai, final arwh arwh) {
        return new kle(context, acgs, vcy, acpk, acpn, rzy, oyy, vgy, hyx, tgd, hyx2, aeea, vai, arwh, 2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kle v(final Context context, final acgs acgs, final vcy vcy, final acpk acpk, final acpn acpn, final rzy rzy, final oyy oyy, final vgy vgy, final hyx hyx, final tgd tgd, final hyx hyx2, final aeea aeea, final vai vai, final arwh arwh) {
        return new kle(context, acgs, vcy, acpk, acpn, rzy, oyy, vgy, hyx, tgd, hyx2, aeea, vai, arwh, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
