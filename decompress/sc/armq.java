import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armq implements armp
{
    public static final qiz a;
    public static final qiz b;
    
    static {
        final qjd f = new qjd("com.google.android.libraries.notifications").h((List)afeq.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        try {
            final pti b2 = pti.b;
            final qjb g = qjb.g;
            a = f.e("SyncFeature__disable_fetch_latest_threads_by_reason", (Object)b2, (qjc)g);
            try {
                b = f.e("SyncFeature__disable_fetch_updated_threads_by_reason", (Object)pti.b, (qjc)g);
            }
            catch (final Exception ex) {
                throw new AssertionError((Object)ex);
            }
        }
        catch (final Exception ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    public final pti a() {
        return (pti)armq.a.a();
    }
    
    public final pti b() {
        return (pti)armq.b.a();
    }
}
