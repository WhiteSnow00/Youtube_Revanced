import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjw
{
    public static long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public String f;
    public int g;
    public String h;
    public boolean i;
    public int j;
    
    static {
        new mnb("ApplicationAnalyticsSession");
        mjw.a = System.currentTimeMillis();
    }
    
    private mjw(final boolean i) {
        this.d = mjw.a;
        this.e = 1;
        this.i = i;
    }
    
    public static mjw a(final boolean b) {
        final mjw mjw = new mjw(b);
        ++mjw.a;
        return mjw;
    }
    
    public static mjw b(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        final mjw mjw = new mjw(sharedPreferences.getBoolean("is_app_backgrounded", false));
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        mjw.b = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        mjw.c = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        mjw.d = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        mjw.e = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        mjw.f = sharedPreferences.getString("receiver_session_id", "");
        mjw.g = sharedPreferences.getInt("device_capabilities", 0);
        mjw.h = sharedPreferences.getString("device_model_name", "");
        mjw.j = sharedPreferences.getInt("analytics_session_start_type", 0);
        return mjw;
    }
}
