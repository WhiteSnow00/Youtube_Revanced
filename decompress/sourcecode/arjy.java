import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arjy implements arjx
{
    public static final qhp a;
    public static final qhp b;
    public static final qhp c;
    public static final qhp d;
    public static final qhp e;
    public static final qhp f;
    
    static {
        final qht f2 = new qht("com.google.android.libraries.notifications").h((List)afcr.v((Object)"CHIME", (Object)"PHOTOS_ANDROID_PRIMES", (Object)"YT_MAIN_APP_ANDROID_PRIMES", (Object)"ANDROID_GSA_ANDROID_PRIMES", (Object)"GMM_PRIMES")).f();
        a = f2.a("RichNotificationFeature__default_aspect_ratio", 1.777);
        b = f2.d("RichNotificationFeature__enable_enlarged_image_for_collaborator", true);
        c = f2.d("RichNotificationFeature__enable_reply", true);
        try {
            d = f2.e("RichNotificationFeature__enlarged_image_layout", (Object)agzi.parseFrom((agzi)psc.a, Base64.decode("CAA", 3)), (qhs)qhr.f);
            e = f2.a("RichNotificationFeature__max_aspect_ratio", 2.5);
            f = f2.a("RichNotificationFeature__min_aspect_ratio", 0.75);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final double a() {
        return (double)arjy.a.a();
    }
    
    @Override
    public final double b() {
        return (double)arjy.e.a();
    }
    
    @Override
    public final double c() {
        return (double)arjy.f.a();
    }
    
    @Override
    public final psc d() {
        return (psc)arjy.d.a();
    }
    
    @Override
    public final boolean e() {
        return (boolean)arjy.b.a();
    }
    
    @Override
    public final boolean f() {
        return (boolean)arjy.c.a();
    }
}
