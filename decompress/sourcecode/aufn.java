import java.util.Arrays;
import java.util.HashMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufn implements Serializable
{
    public static aufn a;
    private static aufn c;
    private static aufn d;
    private static final long serialVersionUID = 2274324892792009998L;
    public final aufg[] b;
    private final String e;
    
    static {
        new HashMap(32);
    }
    
    public aufn(final String e, final aufg[] b) {
        this.e = e;
        this.b = b;
    }
    
    public static aufn c() {
        aufn d;
        if ((d = aufn.d) == null) {
            d = (aufn.d = new aufn("Seconds", new aufg[] { aufg.k }));
        }
        return d;
    }
    
    public static aufn d() {
        aufn c;
        if ((c = aufn.c) == null) {
            c = (aufn.c = new aufn("Standard", new aufg[] { aufg.d, aufg.e, aufg.f, aufg.g, aufg.i, aufg.j, aufg.k, aufg.l }));
        }
        return c;
    }
    
    public final int a(final aufg aufg) {
        for (int b = this.b(), i = 0; i < b; ++i) {
            if (this.b[i] == aufg) {
                return i;
            }
        }
        return -1;
    }
    
    public final int b() {
        return this.b.length;
    }
    
    public final boolean e(final aufg aufg) {
        return this.a(aufg) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aufn && Arrays.equals(this.b, ((aufn)o).b));
    }
    
    @Override
    public final int hashCode() {
        int n = 0;
        int n2 = 0;
        while (true) {
            final aufg[] b = this.b;
            if (n >= b.length) {
                break;
            }
            n2 += b[n].hashCode();
            ++n;
        }
        return n2;
    }
    
    @Override
    public final String toString() {
        final String e = this.e;
        final StringBuilder sb = new StringBuilder("PeriodType[");
        sb.append(e);
        sb.append("]");
        return sb.toString();
    }
}
