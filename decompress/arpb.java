import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arpb implements arpa
{
    public static final qjt a;
    public static final qjt b;
    public static final qjt c;
    
    static {
        final qjx f = new qjx("com.google.android.libraries.notifications").h((List)afgh.v("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).f();
        a = f.d("PeriodicWipeoutFeature__enabled", true);
        b = f.b("PeriodicWipeoutFeature__max_threads_in_storage", 0L);
        c = f.b("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }
    
    @Override
    public final long a() {
        return (long)arpb.b.a();
    }
    
    @Override
    public final long b() {
        return (long)arpb.c.a();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arpb.a.a();
    }
}
