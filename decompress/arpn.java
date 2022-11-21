import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arpn implements arpm
{
    public static final qjt a;
    public static final qjt b;
    public static final qjt c;
    public static final qjt d;
    
    static {
        final qjx f = new qjx("com.google.android.libraries.notifications").h((List)afgh.v("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).f();
        a = f.d("SystemTrayFeature__enable_html_tags", true);
        b = f.c("SystemTrayFeature__force_action_to_open_as_activity", "");
        c = f.d("SystemTrayFeature__forced_notifications_storage_update", false);
        d = f.d("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }
    
    @Override
    public final String a() {
        return (String)arpn.b.a();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arpn.a.a();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arpn.c.a();
    }
    
    @Override
    public final boolean d() {
        return (boolean)arpn.d.a();
    }
}
