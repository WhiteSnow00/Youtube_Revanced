import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arpk implements arpj
{
    public static final qjt a;
    public static final qjt b;
    
    static {
        final qjx f = new qjx("com.google.android.libraries.notifications").h((List)afgh.v("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).f();
        try {
            final pua b2 = pua.b;
            final qjv g = qjv.g;
            a = f.e("SyncFeature__disable_fetch_latest_threads_by_reason", (Object)b2, (qjw)g);
            try {
                b = f.e("SyncFeature__disable_fetch_updated_threads_by_reason", (Object)pua.b, (qjw)g);
            }
            catch (final Exception ex) {
                throw new AssertionError((Object)ex);
            }
        }
        catch (final Exception ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    @Override
    public final pua a() {
        return (pua)arpk.a.a();
    }
    
    @Override
    public final pua b() {
        return (pua)arpk.b.a();
    }
}
