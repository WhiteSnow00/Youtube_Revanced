import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arke implements arkd
{
    public static final qhp a;
    public static final qhp b;
    public static final qhp c;
    public static final qhp d;
    
    static {
        final qht f = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f.d("SystemTrayFeature__enable_html_tags", true);
        b = f.c("SystemTrayFeature__force_action_to_open_as_activity", "");
        c = f.d("SystemTrayFeature__forced_notifications_storage_update", false);
        d = f.d("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }
    
    @Override
    public final String a() {
        return (String)arke.b.a();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arke.a.a();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arke.c.a();
    }
    
    @Override
    public final boolean d() {
        return (boolean)arke.d.a();
    }
}
