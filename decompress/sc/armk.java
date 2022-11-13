import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armk implements armj
{
    public static final qiz a;
    public static final qiz b;
    
    static {
        final qjd f = new qjd("com.google.android.libraries.notifications").h((List)afeq.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        try {
            a = f.e("RegistrationFeature__disable_registration_by_reason", (Object)ahbh.parseFrom((ahbh)ptk.b, Base64.decode("CAM", 3)), (qjc)qjb.e);
            b = f.d("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final ptk a() {
        return (ptk)armk.a.a();
    }
    
    public final boolean b() {
        return (boolean)armk.b.a();
    }
}
