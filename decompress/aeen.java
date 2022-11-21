import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeen
{
    public static final Map a;
    public static final Map b;
    
    static {
        final Map map = a = new HashMap();
        final Map map2 = b = new HashMap();
        final Integer value = -1;
        map.put(value, "The Play Store app is either not installed or not the official version.");
        final Integer value2 = -2;
        map.put(value2, "Call first requestReviewFlow to get the ReviewInfo.");
        final Integer value3 = -100;
        map.put(value3, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(value, "PLAY_STORE_NOT_FOUND");
        map2.put(value2, "INVALID_REQUEST");
        map2.put(value3, "INTERNAL_ERROR");
    }
}
