import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abhm
{
    private static final Map a;
    
    static {
        a = new EnumMap(abhl.class);
        for (final abhl abhl : abhl.values()) {
            abhm.a.put(abhl, afji.p(abhl.c));
        }
    }
    
    public static void a(final abhl abhl, final String s, final Object... array) {
        final afji afji = abhm.a.get(abhl);
        if (afji != null) {
            ((afjf)((afjf)((afig)afji).h()).j("com/google/android/libraries/youtube/player/internal/utils/PlayerLog", "w", 92, "PlayerLog.java")).z(s, array);
        }
    }
}
