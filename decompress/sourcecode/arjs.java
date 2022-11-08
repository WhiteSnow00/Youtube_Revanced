import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arjs implements arjr
{
    public static final qhp a;
    public static final qhp b;
    public static final qhp c;
    
    static {
        final qht f = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f.d("PeriodicWipeoutFeature__enabled", true);
        b = f.b("PeriodicWipeoutFeature__max_threads_in_storage", 0L);
        c = f.b("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }
    
    @Override
    public final long a() {
        return (long)arjs.b.a();
    }
    
    @Override
    public final long b() {
        return (long)arjs.c.a();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arjs.a.a();
    }
}
