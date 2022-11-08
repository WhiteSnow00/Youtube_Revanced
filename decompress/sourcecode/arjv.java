import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arjv implements arju
{
    public static final qhp a;
    public static final qhp b;
    
    static {
        final qht f = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        try {
            a = f.e("RegistrationFeature__disable_registration_by_reason", (Object)agzi.parseFrom((agzi)psa.b, Base64.decode("CAM", 3)), (qhs)qhr.e);
            b = f.d("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final psa a() {
        return (psa)arjv.a.a();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arjv.b.a();
    }
}
