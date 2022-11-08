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

public final class arsj
{
    static final aexm a;
    public static final arsj b;
    public final byte[] c;
    private final Map d;
    
    static {
        a = new aexm(",");
        b = b().c((arsi)new arrt(1), true).c((arsi)arrt.a, false);
    }
    
    private arsj() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }
    
    private arsj(final arsi arsi, final boolean b, final arsj arsj) {
        final String b2 = arsi.b();
        agot.v(b2.contains(",") ^ true, (Object)"Comma is currently not allowed in message encoding");
        int size = arsj.d.size();
        if (!arsj.d.containsKey(arsi.b())) {
            ++size;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(size);
        for (final fwn fwn : arsj.d.values()) {
            final String b3 = ((arsi)fwn.b).b();
            if (!b3.equals(b2)) {
                linkedHashMap.put((Object)b3, (Object)new fwn((arsi)fwn.b, fwn.a));
            }
        }
        linkedHashMap.put((Object)b2, (Object)new fwn(arsi, b));
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
        this.d = unmodifiableMap;
        final aexm a = arsj.a;
        final HashSet set = new HashSet(unmodifiableMap.size());
        for (final Map.Entry<K, fwn> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().a) {
                set.add((Object)entry.getKey());
            }
        }
        this.c = a.d((Iterable)Collections.unmodifiableSet((Set<?>)set)).getBytes(Charset.forName("US-ASCII"));
    }
    
    public static arsj b() {
        return new arsj();
    }
    
    public final arsi a(final String s) {
        final fwn fwn = this.d.get(s);
        if (fwn != null) {
            return (arsi)fwn.b;
        }
        return null;
    }
    
    public final arsj c(final arsi arsi, final boolean b) {
        return new arsj(arsi, b, this);
    }
}
