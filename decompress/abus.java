import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum abus
{
    a("UNKNOWN", 0), 
    b("OFF", 1), 
    c("ON", 2), 
    d("ON_RECOMMENDED", 3);
    
    public static final Map e;
    public static final Map f;
    private static final abus[] g;
    
    static {
        final abus abus;
        final abus abus2;
        final abus abus3;
        final abus abus4;
        g = new abus[] { abus, abus2, abus3, abus4 };
        final HashMap hashMap = new HashMap();
        hashMap.put(aigg.a, abus);
        hashMap.put(aigg.e, abus3);
        hashMap.put(aigg.d, abus4);
        hashMap.put(aigg.c, abus2);
        hashMap.put(aigg.b, abus);
        f = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(angh.a, abus);
        hashMap2.put(angh.c, abus3);
        hashMap2.put(angh.b, abus2);
        hashMap2.put(angh.e, abus);
        hashMap2.put(angh.f, abus);
        hashMap2.put(angh.d, abus3);
        e = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    private abus(final String s, final int n) {
    }
}
