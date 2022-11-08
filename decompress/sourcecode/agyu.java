import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

final class agyu implements Comparable
{
    public final Field a;
    public final agyx b;
    public final Class c;
    public final int d;
    public final Field e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final ahbd i;
    public final Class j;
    public final Object k;
    public final agzo l;
    
    public agyu(final Field a, final int d, final agyx b, final Class c, final Field e, final int f, final boolean g, final boolean h, final ahbd i, final Class j, final Object k, final agzo l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public static agyu a(final int n, final agyx agyx, final ahbd ahbd, final Class clazz, final boolean b, final agzo agzo) {
        b(n);
        agzz.i(agyx, "fieldType");
        agzz.i(ahbd, "oneof");
        agzz.i(clazz, "oneofStoredType");
        if (agyx.aa == agyw.a) {
            return new agyu(null, n, agyx, null, null, 0, false, b, ahbd, clazz, null, agzo);
        }
        final String value = String.valueOf(agyx);
        final StringBuilder sb = new StringBuilder("Oneof is only supported for scalar fields. Field ");
        sb.append(n);
        sb.append(" is of type ");
        sb.append(value);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void b(final int n) {
        if (n > 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder("fieldNumber must be positive: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static boolean c(final int n) {
        return n != 0 && (n & n - 1) == 0x0;
    }
}
