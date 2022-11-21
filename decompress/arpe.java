import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arpe implements arpd
{
    public static final qjt a;
    public static final qjt b;
    
    static {
        final qjx f = new qjx("com.google.android.libraries.notifications").h((List)afgh.v("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).f();
        try {
            a = f.e("RegistrationFeature__disable_registration_by_reason", (Object)ahcz.parseFrom((ahcz)puc.b, Base64.decode("CAM", 3)), (qjw)qjv.e);
            b = f.d("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final puc a() {
        return (puc)arpe.a.a();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arpe.b.a();
    }
}
