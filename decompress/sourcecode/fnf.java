import java.util.concurrent.Executor;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnf
{
    public static final afdu a;
    private static final afdu b;
    
    static {
        b = afdu.x((Object)"cross_device_offline_device_name", (Object)"cross_device_offline_device_state", (Object)"offline_has_shown_1080p_option", (Object)"offline_has_shown_1080p_tooltip", (Object)"offline_has_shown_download_expiration_disclaimer", (Object)"offline_stream_snackbar_impressions", (Object[])new String[] { "offline_stream_snackbar_last_shown", "offline_recs_enabled", "offline_quality_preference_updated_timestamp_millis", "last_downloads_page_usage_seconds" });
        a = afdu.v((Object)"offline_first_add_tooltip", (Object)"offline_stream_selection_dialog_remember_setting_checked", (Object)"offline_button_poor_connectivity_tooltip_disabled", (Object)"offline_last_client_video_playback_position_sync_time_millis");
    }
    
    static tku a(final Context context, final atjj atjj) {
        final qbo qbo = (qbo)atjj.a();
        final qmr a = qms.a(context);
        a.e("offlinestartup");
        a.f("offlinestartup.pb");
        final Uri a2 = a.a();
        final qoq a3 = qor.a();
        a3.e((MessageLite)fmx.a);
        a3.f(a2);
        return (tku)new tks(qan.h(qbo.D(a3.a())), (MessageLite)fmx.a);
    }
    
    public static String b(final String s, final String s2) {
        return (String)adwd.aK(aeyk.c(s).h(s2));
    }
    
    public static boolean c(final uyf uyf) {
        amhi amhi;
        if ((amhi = uyf.b().m) == null) {
            amhi = amhi.a;
        }
        anoq anoq;
        if ((anoq = amhi.f) == null) {
            anoq = anoq.a;
        }
        return anoq.g;
    }
    
    static String d(final int n) {
        if (n == 1) {
            return "offline_last_scheduled_ad_hoc_refresh_time_millis";
        }
        if (n != 0) {
            return tmy.aL("offline_last_scheduled_ad_hoc_refresh_time_millis_%d", new Object[] { n - 1 });
        }
        throw null;
    }
    
    public static void e(final agza agza, final tkr tkr, final tkr tkr2, final tkr tkr3, final aext aext) {
        final afct afct = new afct();
        afct.g((Object)"cross_device_offline_device_name", (Object)new fmz(aext, tkr2, 0));
        afct.g((Object)"cross_device_offline_device_state", (Object)new fmz(aext, tkr, 2));
        afct.g((Object)"offline_has_shown_1080p_option", (Object)new fmz(aext, tkr, 3));
        afct.g((Object)"offline_has_shown_1080p_tooltip", (Object)new fmz(aext, tkr, 6));
        afct.g((Object)"offline_has_shown_download_expiration_disclaimer", (Object)new fmz(aext, tkr, 7));
        afct.g((Object)"offline_stream_snackbar_impressions", (Object)new fmz(aext, tkr3, 8));
        afct.g((Object)"offline_stream_snackbar_last_shown", (Object)new fmz(aext, tkr3, 9));
        afct.g((Object)"offline_recs_enabled", (Object)new fmz(aext, tkr, 10));
        afct.g((Object)"offline_quality_preference_updated_timestamp_millis", (Object)new fmz(aext, tkr3, 11));
        afct.g((Object)"last_downloads_page_usage_seconds", (Object)new fmz(aext, tkr3, 12));
        tdb.j(fnf.b, (ahaw)agza, afct.c());
    }
    
    public static void f(final agza agza, final tkr tkr, final tkr tkr2, final aext aext) {
        final afct afct = new afct();
        afct.g((Object)"offline_first_add_tooltip", (Object)new fne(tkr, 1));
        afct.g((Object)"offline_stream_selection_dialog_remember_setting_checked", (Object)new fne(tkr, 0));
        afct.g((Object)"offline_button_poor_connectivity_tooltip_disabled", (Object)new fmz(aext, tkr, 4));
        afct.g((Object)"offline_last_client_video_playback_position_sync_time_millis", (Object)new fmz(aext, tkr2, 5));
        tdb.j(fnf.a, (ahaw)agza, afct.c());
    }
    
    static tks g(final Context context, final aftr aftr, final String c, final qbo qbo, final atjj atjj, final uyf uyf) {
        final qmr a = qms.a(context);
        a.e("offline");
        a.f("offlinemain.pb");
        final Uri a2 = a.a();
        final qoq a3 = qor.a();
        a3.e((MessageLite)fmw.a);
        a3.f(a2);
        if (c(uyf)) {
            final qos d = qou.d(context, (Executor)aftr);
            d.c = c;
            final afdu b = fnf.b;
            d.d((String[])((afci)b).toArray(new String[b.size()]));
            d.e((qot)fnd.a);
            a3.b((qon)d.a());
            final tkv d2 = tkw.d(atjj, aftr);
            d2.a = bbt.o;
            d2.b((aexg)fna.d);
            d2.b = fna.e;
            d2.c = (tad)fnb.d;
            a3.b((qon)d2.a());
        }
        return new tks(qan.h(qbo.D(a3.a())), (MessageLite)fmw.a);
    }
}
