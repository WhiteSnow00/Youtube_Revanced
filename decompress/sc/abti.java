import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum abti
{
    a("UNKNOWN", 0), 
    b("OFF", 1), 
    c("ON", 2), 
    d("ON_RECOMMENDED", 3);
    
    public static final Map e;
    public static final Map f;
    private static final abti[] g;
    
    static {
        final abti abti;
        final abti abti2;
        final abti abti3;
        final abti abti4;
        g = new abti[] { abti, abti2, abti3, abti4 };
        final HashMap hashMap = new HashMap();
        hashMap.put(aien.a, abti);
        hashMap.put(aien.e, abti3);
        hashMap.put(aien.d, abti4);
        hashMap.put(aien.c, abti2);
        hashMap.put(aien.b, abti);
        f = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(anea.a, abti);
        hashMap2.put(anea.c, abti3);
        hashMap2.put(anea.b, abti2);
        hashMap2.put(anea.e, abti);
        hashMap2.put(anea.f, abti);
        hashMap2.put(anea.d, abti3);
        e = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    private abti(final String s, final int n) {
    }
}
