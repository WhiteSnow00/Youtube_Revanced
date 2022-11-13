import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armh implements armg
{
    public static final qiz a;
    public static final qiz b;
    public static final qiz c;
    
    static {
        final qjd f = new qjd("com.google.android.libraries.notifications").h((List)afeq.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f.d("PeriodicWipeoutFeature__enabled", true);
        b = f.b("PeriodicWipeoutFeature__max_threads_in_storage", 0L);
        c = f.b("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }
    
    public final long a() {
        return (long)armh.b.a();
    }
    
    public final long b() {
        return (long)armh.c.a();
    }
    
    public final boolean c() {
        return (boolean)armh.a.a();
    }
}
