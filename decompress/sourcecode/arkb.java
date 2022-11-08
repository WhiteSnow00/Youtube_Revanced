import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkb implements arka
{
    public static final qhp a;
    public static final qhp b;
    
    static {
        final qht f = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        try {
            final pry b2 = pry.b;
            final qhr g = qhr.g;
            a = f.e("SyncFeature__disable_fetch_latest_threads_by_reason", (Object)b2, (qhs)g);
            try {
                b = f.e("SyncFeature__disable_fetch_updated_threads_by_reason", (Object)pry.b, (qhs)g);
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
    public final pry a() {
        return (pry)arkb.a.a();
    }
    
    @Override
    public final pry b() {
        return (pry)arkb.b.a();
    }
}
