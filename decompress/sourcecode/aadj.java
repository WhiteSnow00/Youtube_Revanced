import android.text.TextUtils;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadj
{
    public static final afcw a;
    public static final afdu b;
    public static final afdu c;
    public static final long d;
    
    static {
        final afct h = afcw.h();
        h.g((Object)"video_id", (Object)String.class);
        h.g((Object)"playlist_id", (Object)String.class);
        h.g((Object)"video_list_id", (Object)String.class);
        h.g((Object)"stream_quality", (Object)Integer.TYPE);
        h.g((Object)"audio_track_id", (Object)String.class);
        h.g((Object)"offline_audio_quality", (Object)Integer.TYPE);
        h.g((Object)"click_tracking_params", (Object)byte[].class);
        h.g((Object)"user_triggered", (Object)Boolean.TYPE);
        h.g((Object)"is_unmetered_5g", (Object)Boolean.TYPE);
        h.g((Object)"transfer_nonce", (Object)String.class);
        h.g((Object)"logging_params", (Object)byte[].class);
        h.g((Object)"disco_session_nonce", (Object)String.class);
        h.g((Object)"partial_playback_nonce", (Object)String.class);
        h.g((Object)"transfer_type", (Object)Integer.TYPE);
        h.g((Object)"triggered_by_refresh", (Object)Boolean.TYPE);
        h.g((Object)"is_sync", (Object)Boolean.TYPE);
        h.g((Object)"retry_strategy", (Object)Integer.TYPE);
        h.g((Object)"base_retry_milli_secs", (Object)Long.TYPE);
        h.g((Object)"max_retry_milli_secs", (Object)Long.TYPE);
        h.g((Object)"max_retries", (Object)Integer.TYPE);
        h.g((Object)"transfer_added_time_millis", (Object)Long.TYPE);
        h.g((Object)"running_media_status", (Object)Integer.TYPE);
        h.g((Object)"complete_media_status", (Object)Integer.TYPE);
        h.g((Object)"offline_digest_store_level", (Object)Integer.TYPE);
        h.g((Object)"is_truncated_hash", (Object)Boolean.TYPE);
        h.g((Object)"use_cached_disco", (Object)Boolean.TYPE);
        h.g((Object)"cache_bytes_read", (Object)Long.TYPE);
        h.g((Object)"storage_bytes_read", (Object)Long.TYPE);
        h.g((Object)"bytes_per_sec", (Object)Double.TYPE);
        h.g((Object)"stream_verification_attempts", (Object)Integer.TYPE);
        h.g((Object)"sd_card_offline_disk_error", (Object)Boolean.TYPE);
        h.g((Object)"back_off_total_millis", (Object)Long.TYPE);
        h.g((Object)"back_off_start_millis", (Object)Long.TYPE);
        h.g((Object)"pending_delete", (Object)Boolean.TYPE);
        h.g((Object)"download_constraint", (Object)Integer.TYPE);
        h.g((Object)"transferFailureCount", (Object)Integer.TYPE);
        h.g((Object)"has_logged_first_start", (Object)Boolean.TYPE);
        h.g((Object)"offline_mode_type", (Object)Integer.TYPE);
        a = h.c();
        b = afdu.x((Object)"video_id", (Object)"playlist_id", (Object)"video_list_id", (Object)"stream_quality", (Object)"audio_track_id", (Object)"offline_audio_quality", (Object[])new String[] { "click_tracking_params", "user_triggered", "is_unmetered_5g", "transfer_nonce", "logging_params", "disco_session_nonce", "partial_playback_nonce", "transfer_type", "triggered_by_refresh", "is_sync", "retry_strategy", "base_retry_milli_secs", "max_retry_milli_secs", "max_retries", "transfer_added_time_millis", "running_media_status", "complete_media_status", "offline_digest_store_level", "is_truncated_hash", "use_cached_disco", "back_off_total_millis", "back_off_start_millis", "pending_delete", "download_constraint", "offline_mode_type" });
        c = afdu.x((Object)"cache_bytes_read", (Object)"storage_bytes_read", (Object)"bytes_per_sec", (Object)"stream_verification_attempts", (Object)"sd_card_offline_disk_error", (Object)"transferFailureCount", (Object[])new String[] { "has_logged_first_start" });
        d = TimeUnit.HOURS.toMillis(1L);
    }
    
    public static void A(final zyq zyq, final byte[] array) {
        zyq.j("click_tracking_params", array);
    }
    
    public static void B(final SharedPreferences sharedPreferences, final String s, final boolean b) {
        sharedPreferences.edit().putBoolean(tmy.aL("offline_active_transfers_%s", new Object[] { s }), b).apply();
    }
    
    public static void C(final zyq zyq, final boolean b) {
        zyq.i("sd_card_offline_disk_error", b);
    }
    
    public static void D(final zyq zyq, final boolean b) {
        zyq.i("is_sync", b);
    }
    
    public static void E(final zyq zyq, final boolean b) {
        zyq.i("triggered_by_refresh", b);
    }
    
    public static void F(final zyq zyq, final boolean b) {
        zyq.i("user_triggered", b);
    }
    
    public static void G(final zyq zyq, final byte[] array) {
        zyq.j("logging_params", array);
    }
    
    public static void H(final zyq zyq, final int n) {
        zyq.l("max_retries", n);
    }
    
    public static void I(final zyq zyq, final long n) {
        zyq.m("max_retry_milli_secs", n);
    }
    
    public static void J(final zyq zyq, final String s) {
        zyq.n("audio_track_id", s);
    }
    
    public static void K(final zyq zyq, final int n) {
        zyq.l("offline_digest_store_level", n);
    }
    
    public static void L(final zyq zyq, final int n) {
        zyq.l("stream_quality", n);
    }
    
    public static void M(final zyq zyq, final String s) {
        zyq.n("playlist_id", s);
    }
    
    public static void N(final zyq zyq, final long n) {
        zyq.m("storage_bytes_read", n);
    }
    
    public static void O(final zyq zyq, final long n) {
        zyq.m("transfer_added_time_millis", n);
    }
    
    public static void P(final zyq zyq, final int n) {
        zyq.l("transferFailureCount", n);
    }
    
    public static void Q(final zyq zyq, final String s) {
        zyq.n("transfer_nonce", s);
    }
    
    public static void R(final zyq zyq, final int n) {
        zyq.l("retry_strategy", n);
    }
    
    public static void S(final zyq zyq, final double n) {
        zyq.k("bytes_per_sec", n);
    }
    
    public static void T(final zyq zyq, final int n) {
        zyq.l("transfer_type", n);
    }
    
    public static void U(final zyq zyq, final String s) {
        zyq.n("video_id", s);
    }
    
    public static void V(final zyq zyq, final String s) {
        zyq.n("video_list_id", s);
    }
    
    public static boolean W(final zyq zyq) {
        return zyq.p("has_logged_first_start", false);
    }
    
    public static boolean X(final zyq zyq) {
        return zyq.o("sd_card_offline_disk_error");
    }
    
    public static boolean Y(final zyq zyq) {
        return zyq.p("is_sync", false);
    }
    
    public static boolean Z(final zyq zyq) {
        return zyq.p("triggered_by_refresh", false);
    }
    
    public static int a(final zyq zyq) {
        return zyq.c("max_retries", 35);
    }
    
    public static boolean aa(final zyq zyq) {
        return zyq.p("is_truncated_hash", false);
    }
    
    public static boolean ab(final zyq zyq) {
        return zyq.p("is_unmetered_5g", false);
    }
    
    public static boolean ac(final zyq zyq) {
        return zyq.p("user_triggered", true);
    }
    
    public static boolean ad(final SharedPreferences sharedPreferences, final String s) {
        return sharedPreferences.getBoolean(tmy.aL("offline_active_transfers_%s", new Object[] { s }), true);
    }
    
    public static boolean ae(final zzo zzo) {
        final int h = h(zzo.f);
        return h == 1 || h == 4 || h == 7 || h == 6;
    }
    
    public static byte[] af(final zyq zyq) {
        return zyq.q("click_tracking_params");
    }
    
    public static byte[] ag(final zyq zyq) {
        return zyq.q("logging_params");
    }
    
    public static void ah(final zyq zyq) {
        zyq.i("has_logged_first_start", true);
    }
    
    public static void ai(final zyq zyq) {
        zyq.i("is_unmetered_5g", true);
    }
    
    public static int aj(final zyq zyq) {
        return aqql.cZ(zyq.c("offline_audio_quality", 0));
    }
    
    public static int ak(final zyq zyq) {
        return aqql.cU(zyq.c("offline_mode_type", 0));
    }
    
    public static void al(final zyq zyq, final int n) {
        zyq.l("offline_audio_quality", n - 1);
    }
    
    public static void am(final zyq zyq, final int n) {
        zyq.l("offline_mode_type", n - 1);
    }
    
    public static void an(final zyq zyq, final int n) {
        zyq.l("download_constraint", n - 1);
    }
    
    public static int b(final zyq zyq) {
        return zyq.c("stream_verification_attempts", 0);
    }
    
    public static int c(final zyq zyq) {
        return zyq.c("offline_digest_store_level", -1);
    }
    
    public static int d(final zyq zyq) {
        return zyq.b("stream_quality");
    }
    
    public static int e(final zyq zyq) {
        return zyq.c("transferFailureCount", 0);
    }
    
    public static int f(final zyq zyq) {
        return zyq.c("download_constraint", 0);
    }
    
    public static int g(final zyq zyq) {
        return zyq.c("retry_strategy", 1);
    }
    
    public static int h(final zyq zyq) {
        return zyq.c("transfer_type", 0);
    }
    
    public static long i(final zyq zyq) {
        return zyq.e("back_off_total_millis", 0L);
    }
    
    public static long j(final zyq zyq) {
        return zyq.e("base_retry_milli_secs", 2000L);
    }
    
    public static long k(final zyq zyq) {
        return zyq.d("cache_bytes_read");
    }
    
    public static long l(final zyq zyq) {
        return zyq.d("storage_bytes_read");
    }
    
    public static long m(final zyq zyq) {
        return zyq.d("transfer_added_time_millis");
    }
    
    public static zyw n(final zyq zyq) {
        return zyw.a(zyq.c("complete_media_status", zyw.b.q));
    }
    
    public static zyw o(final zyq zyq) {
        return zyw.a(zyq.c("running_media_status", zyw.c.q));
    }
    
    public static String p(final zyq zyq) {
        final String s = s(zyq);
        if (TextUtils.isEmpty((CharSequence)s)) {
            return v(zyq);
        }
        return s;
    }
    
    public static String q(final zyq zyq) {
        return zyq.g("audio_track_id");
    }
    
    public static String r(final zyq zyq) {
        return zyq.g("partial_playback_nonce");
    }
    
    public static String s(final zyq zyq) {
        return zyq.g("playlist_id");
    }
    
    public static String t(final zyq zyq) {
        return zyq.s();
    }
    
    public static String u(final zyq zyq) {
        return aexs.e(zyq.g("video_id"));
    }
    
    public static String v(final zyq zyq) {
        return zyq.g("video_list_id");
    }
    
    public static void w(final zyq zyq, final long n) {
        final long i = i(zyq);
        final long e = zyq.e("back_off_start_millis", -1L);
        if (e >= 0L) {
            x(zyq, -1L);
            zyq.m("back_off_total_millis", i + (n - e));
        }
    }
    
    public static void x(final zyq zyq, final long n) {
        zyq.m("back_off_start_millis", n);
    }
    
    public static void y(final zyq zyq, final long n) {
        zyq.m("base_retry_milli_secs", n);
    }
    
    public static void z(final zyq zyq, final long n) {
        zyq.m("cache_bytes_read", n);
    }
}
