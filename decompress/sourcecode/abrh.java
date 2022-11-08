import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum abrh
{
    a("UNKNOWN", 0), 
    b("OFF", 1), 
    c("ON", 2), 
    d("ON_RECOMMENDED", 3);
    
    public static final Map e;
    public static final Map f;
    
    static {
        final HashMap hashMap = new HashMap();
        final abrh abrh;
        hashMap.put(aicp.a, abrh);
        final abrh abrh3;
        hashMap.put(aicp.e, abrh3);
        final abrh abrh4;
        hashMap.put(aicp.d, abrh4);
        final abrh abrh2;
        hashMap.put(aicp.c, abrh2);
        hashMap.put(aicp.b, abrh);
        f = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(anbw.a, abrh);
        hashMap2.put(anbw.c, abrh3);
        hashMap2.put(anbw.b, abrh2);
        hashMap2.put(anbw.e, abrh);
        hashMap2.put(anbw.f, abrh);
        hashMap2.put(anbw.d, abrh3);
        e = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    private abrh(final String s, final int n) {
    }
}
