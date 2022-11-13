import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class armn implements armm
{
    public static final qiz a;
    public static final qiz b;
    public static final qiz c;
    public static final qiz d;
    public static final qiz e;
    public static final qiz f;
    
    static {
        final qjd f2 = new qjd("com.google.android.libraries.notifications").h((List)afeq.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f2.a("RichNotificationFeature__default_aspect_ratio", 1.777);
        b = f2.d("RichNotificationFeature__enable_enlarged_image_for_collaborator", true);
        c = f2.d("RichNotificationFeature__enable_reply", true);
        try {
            d = f2.e("RichNotificationFeature__enlarged_image_layout", (Object)ahbh.parseFrom((ahbh)ptl.a, Base64.decode("CAA", 3)), (qjc)qjb.f);
            e = f2.a("RichNotificationFeature__max_aspect_ratio", 2.5);
            f = f2.a("RichNotificationFeature__min_aspect_ratio", 0.75);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final double a() {
        return (double)armn.a.a();
    }
    
    public final double b() {
        return (double)armn.e.a();
    }
    
    public final double c() {
        return (double)armn.f.a();
    }
    
    public final ptl d() {
        return (ptl)armn.d.a();
    }
    
    public final boolean e() {
        return (boolean)armn.b.a();
    }
    
    public final boolean f() {
        return (boolean)armn.c.a();
    }
}
