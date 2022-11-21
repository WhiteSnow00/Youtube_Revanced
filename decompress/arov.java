import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arov implements arou
{
    public static final qjt a;
    public static final qjt b;
    public static final qjt c;
    
    static {
        final qjx f = new qjx("com.google.android.libraries.notifications").h((List)afgh.v("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).f();
        a = f.d("ChimeBroadcastReceiverFeature__enable_broadcast_receiver_timeout", false);
        b = f.d("ChimeBroadcastReceiverFeature__enable_check_process_start_for_timeout", true);
        c = f.b("ChimeBroadcastReceiverFeature__process_start_threshold_ms", 5000L);
    }
    
    @Override
    public final long a() {
        return (long)arov.c.a();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arov.a.a();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arov.b.a();
    }
}
