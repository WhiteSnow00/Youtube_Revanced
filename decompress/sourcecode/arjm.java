import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arjm implements arjl
{
    public static final qhp a;
    public static final qhp b;
    public static final qhp c;
    
    static {
        final qht f = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f.d("ChimeBroadcastReceiverFeature__enable_broadcast_receiver_timeout", false);
        b = f.d("ChimeBroadcastReceiverFeature__enable_check_process_start_for_timeout", true);
        c = f.b("ChimeBroadcastReceiverFeature__process_start_threshold_ms", 5000L);
    }
    
    public final long a() {
        return (long)arjm.c.a();
    }
    
    public final boolean b() {
        return (boolean)arjm.a.a();
    }
    
    public final boolean c() {
        return (boolean)arjm.b.a();
    }
}
