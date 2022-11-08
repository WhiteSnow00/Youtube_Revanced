import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arjp implements arjo
{
    public static final qhp a;
    public static final qhp b;
    public static final qhp c;
    public static final qhp d;
    public static final qhp e;
    public static final qhp f;
    
    static {
        final qht f2 = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f2.d("LoggingFeature__log_removed_event", true);
        b = f2.d("LoggingFeature__log_system_event_app_updated", false);
        c = f2.d("LoggingFeature__log_system_event_boot_completed", false);
        d = f2.d("LoggingFeature__log_system_event_locale_changed", false);
        e = f2.d("LoggingFeature__log_system_event_scheduled_job", false);
        f = f2.d("LoggingFeature__log_system_event_timezone_changed", false);
    }
    
    public final boolean a() {
        return (boolean)arjp.a.a();
    }
    
    public final boolean b() {
        return (boolean)arjp.b.a();
    }
    
    public final boolean c() {
        return (boolean)arjp.c.a();
    }
    
    public final boolean d() {
        return (boolean)arjp.d.a();
    }
    
    public final boolean e() {
        return (boolean)arjp.e.a();
    }
    
    public final boolean f() {
        return (boolean)arjp.f.a();
    }
}
