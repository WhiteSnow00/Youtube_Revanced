import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armb implements arma
{
    public static final qiz a;
    public static final qiz b;
    public static final qiz c;
    
    static {
        final qjd f = new qjd("com.google.android.libraries.notifications").h((List)afeq.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f.d("ChimeBroadcastReceiverFeature__enable_broadcast_receiver_timeout", false);
        b = f.d("ChimeBroadcastReceiverFeature__enable_check_process_start_for_timeout", true);
        c = f.b("ChimeBroadcastReceiverFeature__process_start_threshold_ms", 5000L);
    }
    
    public final long a() {
        return (long)armb.c.a();
    }
    
    public final boolean b() {
        return (boolean)armb.a.a();
    }
    
    public final boolean c() {
        return (boolean)armb.b.a();
    }
}
