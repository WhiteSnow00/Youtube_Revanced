import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armt implements arms
{
    public static final qiz a;
    public static final qiz b;
    public static final qiz c;
    public static final qiz d;
    
    static {
        final qjd f = new qjd("com.google.android.libraries.notifications").h((List)afeq.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f.d("SystemTrayFeature__enable_html_tags", true);
        b = f.c("SystemTrayFeature__force_action_to_open_as_activity", "");
        c = f.d("SystemTrayFeature__forced_notifications_storage_update", false);
        d = f.d("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }
    
    public final String a() {
        return (String)armt.b.a();
    }
    
    public final boolean b() {
        return (boolean)armt.a.a();
    }
    
    public final boolean c() {
        return (boolean)armt.c.a();
    }
    
    public final boolean d() {
        return (boolean)armt.d.a();
    }
}
