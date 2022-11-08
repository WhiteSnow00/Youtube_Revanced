import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aflo extends aflm
{
    private static final Map c;
    private final afjk d;
    
    static {
        final EnumMap enumMap = new EnumMap((Class<K>)afjk.class);
        for (final afjk afjk : afjk.values()) {
            final aflo[] array = new aflo[10];
            for (int j = 0; j < 10; ++j) {
                array[j] = new aflo(j, afjk, afjl.a);
            }
            enumMap.put(afjk, array);
        }
        c = Collections.unmodifiableMap((Map<?, ?>)enumMap);
    }
    
    private aflo(int l, final afjk d, final afjl afjl) {
        super(afjl, l);
        alhb.K((Object)d, "format char");
        this.d = d;
        if (!afjl.c()) {
            final char c = (char)(l = d.l);
            if (afjl.d()) {
                l = (c & '\uffdf');
            }
            final StringBuilder sb = new StringBuilder("%");
            afjl.f(sb);
            sb.append((char)l);
            return;
        }
        final String o = d.o;
    }
    
    public static aflo b(final int n, final afjk afjk, final afjl afjl) {
        if (n < 10 && afjl.c()) {
            return ((aflo[])aflo.c.get(afjk))[n];
        }
        return new aflo(n, afjk, afjl);
    }
    
    public final void a(final afln afln, final Object o) {
        afln.a(o, this.d, super.b);
    }
}
