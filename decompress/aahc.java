import android.text.TextUtils;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aahc
{
    public static final afgm a;
    public static final afhk b;
    public static final afhk c;
    public static final long d;
    
    static {
        final afgj h = afgm.h();
        h.g("video_id", String.class);
        h.g("playlist_id", String.class);
        h.g("video_list_id", String.class);
        h.g("stream_quality", Integer.TYPE);
        h.g("audio_track_id", String.class);
        h.g("offline_audio_quality", Integer.TYPE);
        h.g("click_tracking_params", byte[].class);
        h.g("user_triggered", Boolean.TYPE);
        h.g("is_unmetered_5g", Boolean.TYPE);
        h.g("transfer_nonce", String.class);
        h.g("logging_params", byte[].class);
        h.g("disco_session_nonce", String.class);
        h.g("partial_playback_nonce", String.class);
        h.g("transfer_type", Integer.TYPE);
        h.g("triggered_by_refresh", Boolean.TYPE);
        h.g("is_sync", Boolean.TYPE);
        h.g("retry_strategy", Integer.TYPE);
        h.g("base_retry_milli_secs", Long.TYPE);
        h.g("max_retry_milli_secs", Long.TYPE);
        h.g("max_retries", Integer.TYPE);
        h.g("transfer_added_time_millis", Long.TYPE);
        h.g("running_media_status", Integer.TYPE);
        h.g("complete_media_status", Integer.TYPE);
        h.g("offline_digest_store_level", Integer.TYPE);
        h.g("is_truncated_hash", Boolean.TYPE);
        h.g("use_cached_disco", Boolean.TYPE);
        h.g("cache_bytes_read", Long.TYPE);
        h.g("storage_bytes_read", Long.TYPE);
        h.g("bytes_per_sec", Double.TYPE);
        h.g("stream_verification_attempts", Integer.TYPE);
        h.g("sd_card_offline_disk_error", Boolean.TYPE);
        h.g("back_off_total_millis", Long.TYPE);
        h.g("back_off_start_millis", Long.TYPE);
        h.g("pending_delete", Boolean.TYPE);
        h.g("download_constraint", Integer.TYPE);
        h.g("transferFailureCount", Integer.TYPE);
        h.g("has_logged_first_start", Boolean.TYPE);
        h.g("offline_mode_type", Integer.TYPE);
        a = h.c();
        b = afhk.x("video_id", "playlist_id", "video_list_id", "stream_quality", "audio_track_id", "offline_audio_quality", "click_tracking_params", "user_triggered", "is_unmetered_5g", "transfer_nonce", "logging_params", "disco_session_nonce", "partial_playback_nonce", "transfer_type", "triggered_by_refresh", "is_sync", "retry_strategy", "base_retry_milli_secs", "max_retry_milli_secs", "max_retries", "transfer_added_time_millis", "running_media_status", "complete_media_status", "offline_digest_store_level", "is_truncated_hash", "use_cached_disco", "back_off_total_millis", "back_off_start_millis", "pending_delete", "download_constraint", "offline_mode_type");
        c = afhk.x("cache_bytes_read", "storage_bytes_read", "bytes_per_sec", "stream_verification_attempts", "sd_card_offline_disk_error", "transferFailureCount", "has_logged_first_start");
        d = TimeUnit.HOURS.toMillis(1L);
    }
    
    public static void A(final aach aach, final byte[] array) {
        aach.j("click_tracking_params", array);
    }
    
    public static void B(final SharedPreferences sharedPreferences, final String s, final boolean b) {
        sharedPreferences.edit().putBoolean(tqf.aL("offline_active_transfers_%s", new Object[] { s }), b).apply();
    }
    
    public static void C(final aach aach, final boolean b) {
        aach.i("sd_card_offline_disk_error", b);
    }
    
    public static void D(final aach aach, final boolean b) {
        aach.i("is_sync", b);
    }
    
    public static void E(final aach aach, final boolean b) {
        aach.i("triggered_by_refresh", b);
    }
    
    public static void F(final aach aach, final boolean b) {
        aach.i("user_triggered", b);
    }
    
    public static void G(final aach aach, final byte[] array) {
        aach.j("logging_params", array);
    }
    
    public static void H(final aach aach, final int n) {
        aach.l("max_retries", n);
    }
    
    public static void I(final aach aach, final long n) {
        aach.m("max_retry_milli_secs", n);
    }
    
    public static void J(final aach aach, final String s) {
        aach.n("audio_track_id", s);
    }
    
    public static void K(final aach aach, final int n) {
        aach.l("offline_digest_store_level", n);
    }
    
    public static void L(final aach aach, final int n) {
        aach.l("stream_quality", n);
    }
    
    public static void M(final aach aach, final String s) {
        aach.n("playlist_id", s);
    }
    
    public static void N(final aach aach, final long n) {
        aach.m("storage_bytes_read", n);
    }
    
    public static void O(final aach aach, final long n) {
        aach.m("transfer_added_time_millis", n);
    }
    
    public static void P(final aach aach, final int n) {
        aach.l("transferFailureCount", n);
    }
    
    public static void Q(final aach aach, final String s) {
        aach.n("transfer_nonce", s);
    }
    
    public static void R(final aach aach, final int n) {
        aach.l("retry_strategy", n);
    }
    
    public static void S(final aach aach, final double n) {
        aach.k("bytes_per_sec", n);
    }
    
    public static void T(final aach aach, final int n) {
        aach.l("transfer_type", n);
    }
    
    public static void U(final aach aach, final String s) {
        aach.n("video_id", s);
    }
    
    public static void V(final aach aach, final String s) {
        aach.n("video_list_id", s);
    }
    
    public static boolean W(final aach aach) {
        return aach.p("has_logged_first_start", false);
    }
    
    public static boolean X(final aach aach) {
        return aach.o("sd_card_offline_disk_error");
    }
    
    public static boolean Y(final aach aach) {
        return aach.p("is_sync", false);
    }
    
    public static boolean Z(final aach aach) {
        return aach.p("triggered_by_refresh", false);
    }
    
    public static int a(final aach aach) {
        return aach.c("max_retries", 35);
    }
    
    public static boolean aa(final aach aach) {
        return aach.p("is_truncated_hash", false);
    }
    
    public static boolean ab(final aach aach) {
        return aach.p("is_unmetered_5g", false);
    }
    
    public static boolean ac(final aach aach) {
        return aach.p("user_triggered", true);
    }
    
    public static boolean ad(final SharedPreferences sharedPreferences, final String s) {
        return sharedPreferences.getBoolean(tqf.aL("offline_active_transfers_%s", new Object[] { s }), true);
    }
    
    public static boolean ae(final aadf aadf) {
        final int h = h(aadf.f);
        return h == 1 || h == 4 || h == 7 || h == 6;
    }
    
    public static byte[] af(final aach aach) {
        return aach.q("click_tracking_params");
    }
    
    public static byte[] ag(final aach aach) {
        return aach.q("logging_params");
    }
    
    public static void ah(final aach aach) {
        aach.i("has_logged_first_start", true);
    }
    
    public static void ai(final aach aach) {
        aach.i("is_unmetered_5g", true);
    }
    
    public static int aj(final aach aach) {
        return aqvq.cS(aach.c("offline_audio_quality", 0));
    }
    
    public static int ak(final aach aach) {
        return aqvq.cN(aach.c("offline_mode_type", 0));
    }
    
    public static void al(final aach aach, final int n) {
        aach.l("offline_audio_quality", n - 1);
    }
    
    public static void am(final aach aach, final int n) {
        aach.l("offline_mode_type", n - 1);
    }
    
    public static void an(final aach aach, final int n) {
        aach.l("download_constraint", n - 1);
    }
    
    public static int b(final aach aach) {
        return aach.c("stream_verification_attempts", 0);
    }
    
    public static int c(final aach aach) {
        return aach.c("offline_digest_store_level", -1);
    }
    
    public static int d(final aach aach) {
        return aach.b("stream_quality");
    }
    
    public static int e(final aach aach) {
        return aach.c("transferFailureCount", 0);
    }
    
    public static int f(final aach aach) {
        return aach.c("download_constraint", 0);
    }
    
    public static int g(final aach aach) {
        return aach.c("retry_strategy", 1);
    }
    
    public static int h(final aach aach) {
        return aach.c("transfer_type", 0);
    }
    
    public static long i(final aach aach) {
        return aach.e("back_off_total_millis", 0L);
    }
    
    public static long j(final aach aach) {
        return aach.e("base_retry_milli_secs", 2000L);
    }
    
    public static long k(final aach aach) {
        return aach.d("cache_bytes_read");
    }
    
    public static long l(final aach aach) {
        return aach.d("storage_bytes_read");
    }
    
    public static long m(final aach aach) {
        return aach.d("transfer_added_time_millis");
    }
    
    public static aacn n(final aach aach) {
        return aacn.a(aach.c("complete_media_status", aacn.b.q));
    }
    
    public static aacn o(final aach aach) {
        return aacn.a(aach.c("running_media_status", aacn.c.q));
    }
    
    public static String p(final aach aach) {
        final String s = s(aach);
        if (TextUtils.isEmpty((CharSequence)s)) {
            return v(aach);
        }
        return s;
    }
    
    public static String q(final aach aach) {
        return aach.g("audio_track_id");
    }
    
    public static String r(final aach aach) {
        return aach.g("partial_playback_nonce");
    }
    
    public static String s(final aach aach) {
        return aach.g("playlist_id");
    }
    
    public static String t(final aach aach) {
        return aach.s();
    }
    
    public static String u(final aach aach) {
        return afbj.e(aach.g("video_id"));
    }
    
    public static String v(final aach aach) {
        return aach.g("video_list_id");
    }
    
    public static void w(final aach aach, final long n) {
        final long i = i(aach);
        final long e = aach.e("back_off_start_millis", -1L);
        if (e >= 0L) {
            x(aach, -1L);
            aach.m("back_off_total_millis", i + (n - e));
        }
    }
    
    public static void x(final aach aach, final long n) {
        aach.m("back_off_start_millis", n);
    }
    
    public static void y(final aach aach, final long n) {
        aach.m("base_retry_milli_secs", n);
    }
    
    public static void z(final aach aach, final long n) {
        aach.m("cache_bytes_read", n);
    }
}
