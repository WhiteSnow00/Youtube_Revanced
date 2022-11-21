import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arph implements arpg
{
    public static final qjt a;
    public static final qjt b;
    public static final qjt c;
    public static final qjt d;
    public static final qjt e;
    public static final qjt f;
    
    static {
        final qjx f2 = new qjx("com.google.android.libraries.notifications").h((List)afgh.v("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).f();
        a = f2.a("RichNotificationFeature__default_aspect_ratio", 1.777);
        b = f2.d("RichNotificationFeature__enable_enlarged_image_for_collaborator", true);
        c = f2.d("RichNotificationFeature__enable_reply", true);
        try {
            d = f2.e("RichNotificationFeature__enlarged_image_layout", (Object)ahcz.parseFrom((ahcz)pud.a, Base64.decode("CAA", 3)), (qjw)qjv.f);
            e = f2.a("RichNotificationFeature__max_aspect_ratio", 2.5);
            f = f2.a("RichNotificationFeature__min_aspect_ratio", 0.75);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final double a() {
        return (double)arph.a.a();
    }
    
    @Override
    public final double b() {
        return (double)arph.e.a();
    }
    
    @Override
    public final double c() {
        return (double)arph.f.a();
    }
    
    @Override
    public final pud d() {
        return (pud)arph.d.a();
    }
    
    @Override
    public final boolean e() {
        return (boolean)arph.b.a();
    }
    
    @Override
    public final boolean f() {
        return (boolean)arph.c.a();
    }
}
