import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakx
{
    public static final Comparator a;
    public static final Comparator b;
    public static final Comparator c;
    public static final Comparator d;
    public static final Comparator e;
    public static final Comparator f;
    public static final Map g;
    private static final Map h;
    private static final Map i;
    
    static {
        a = (Comparator)zmm.h;
        b = (Comparator)zmm.i;
        c = (Comparator)zmm.j;
        d = (Comparator)zmm.k;
        e = (Comparator)zmm.l;
        f = (Comparator)zmm.m;
        final Map map = g = new HashMap();
        final Map map2 = h = new HashMap();
        final Map map3 = i = new HashMap();
        final amze e2 = amze.e;
        final Integer value = 0;
        map.put(e2, value);
        final amze b2 = amze.b;
        final Integer value2 = 144;
        map.put(b2, value2);
        final amze f2 = amze.f;
        final Integer value3 = 240;
        map.put(f2, value3);
        final amze c2 = amze.c;
        final Integer value4 = 360;
        map.put(c2, value4);
        final amze g2 = amze.g;
        final Integer value5 = 480;
        map.put(g2, value5);
        final amze d2 = amze.d;
        final Integer value6 = 720;
        map.put(d2, value6);
        final amze h2 = amze.h;
        final Integer value7 = 1080;
        map.put(h2, value7);
        final amze j = amze.i;
        final Integer value8 = 1440;
        map.put(j, value8);
        final amze k = amze.j;
        final Integer value9 = 2160;
        map.put(k, value9);
        map2.put(value, amze.e);
        map2.put(value2, amze.b);
        map2.put(value3, amze.f);
        map2.put(value4, amze.c);
        map2.put(value5, amze.g);
        map2.put(value6, amze.d);
        map2.put(value7, amze.h);
        map2.put(value8, amze.i);
        map2.put(value9, amze.j);
        map3.put(amze.e, 2132018918);
        map3.put(amze.b, 2132018913);
        map3.put(amze.c, 2132018914);
        map3.put(amze.d, 2132018915);
        map3.put(amze.h, 2132018912);
    }
    
    public static int a(final amze amze, final int n) {
        final Map g = aakx.g;
        if (g.containsKey(amze)) {
            return (int)g.get(amze);
        }
        return n;
    }
    
    public static final int b(final amze amze) {
        final Map i = aakx.i;
        if (i.containsKey(amze)) {
            return (int)i.get(amze);
        }
        return -1;
    }
    
    public static amze c(final int n) {
        final amze amze = aakx.h.get(n);
        if (amze != null) {
            return amze;
        }
        return amze.a;
    }
}
