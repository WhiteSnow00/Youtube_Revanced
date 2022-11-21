import java.util.Iterator;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxl
{
    static final afbd a;
    public static final arxl b;
    public final Map c;
    public final byte[] d;
    
    static {
        a = new afbd(",");
        b = new arxl().a((arxk)new arxa(1), true).a((arxk)arxa.a, false);
    }
    
    private arxl() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }
    
    private arxl(final arxk arxk, final boolean b, final arxl arxl) {
        final String b2 = arxk.b();
        adme.L(b2.contains(",") ^ true, "Comma is currently not allowed in message encoding");
        int size = arxl.c.size();
        if (!arxl.c.containsKey(arxk.b())) {
            ++size;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(size);
        for (final fwz fwz : arxl.c.values()) {
            final String b3 = ((arxk)fwz.b).b();
            if (!b3.equals(b2)) {
                linkedHashMap.put((Object)b3, (Object)new fwz((arxk)fwz.b, fwz.a));
            }
        }
        linkedHashMap.put((Object)b2, (Object)new fwz(arxk, b));
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
        this.c = unmodifiableMap;
        final afbd a = arxl.a;
        final HashSet set = new HashSet(unmodifiableMap.size());
        for (final Map.Entry<K, fwz> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().a) {
                set.add((Object)entry.getKey());
            }
        }
        this.d = a.d(Collections.unmodifiableSet((Set<?>)set)).getBytes(Charset.forName("US-ASCII"));
    }
    
    public final arxl a(final arxk arxk, final boolean b) {
        return new arxl(arxk, b, this);
    }
}
