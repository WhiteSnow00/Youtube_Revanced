import android.os.Bundle;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeem
{
    private static final Map a;
    
    static {
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        new aefs("PlayCoreVersion", null);
    }
    
    public static Bundle a() {
        final Bundle bundle = new Bundle();
        final Map b = b();
        bundle.putInt("playcore_version_code", (int)b.get("java"));
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", (int)b.get("native"));
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", (int)b.get("unity"));
        }
        return bundle;
    }
    
    public static Map b() {
        synchronized (aeem.class) {
            final Map a = aeem.a;
            a.put("java", 11004);
            return a;
        }
    }
}
