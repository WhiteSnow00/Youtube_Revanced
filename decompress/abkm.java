import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkm
{
    private static final Map a;
    
    static {
        a = new EnumMap(abkl.class);
        for (final abkl abkl : abkl.values()) {
            abkm.a.put(abkl, afmy.p(abkl.c));
        }
    }
    
    public static void a(final abkl abkl, final String s, final Object... array) {
        final afmy afmy = abkm.a.get(abkl);
        if (afmy != null) {
            ((afmv)((afmv)((aflw)afmy).h()).j("com/google/android/libraries/youtube/player/internal/utils/PlayerLog", "w", 92, "PlayerLog.java")).z(s, array);
        }
    }
}
