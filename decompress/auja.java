import java.util.Arrays;
import java.util.HashMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auja implements Serializable
{
    public static auja a;
    private static auja c;
    private static auja d;
    private static final long serialVersionUID = 2274324892792009998L;
    public final auit[] b;
    private final String e;
    
    static {
        new HashMap(32);
    }
    
    public auja(final String e, final auit[] b) {
        this.e = e;
        this.b = b;
    }
    
    public static auja c() {
        auja d;
        if ((d = auja.d) == null) {
            d = (auja.d = new auja("Seconds", new auit[] { auit.k }));
        }
        return d;
    }
    
    public static auja d() {
        auja c;
        if ((c = auja.c) == null) {
            c = (auja.c = new auja("Standard", new auit[] { auit.d, auit.e, auit.f, auit.g, auit.i, auit.j, auit.k, auit.l }));
        }
        return c;
    }
    
    public final int a(final auit auit) {
        for (int b = this.b(), i = 0; i < b; ++i) {
            if (this.b[i] == auit) {
                return i;
            }
        }
        return -1;
    }
    
    public final int b() {
        return this.b.length;
    }
    
    public final boolean e(final auit auit) {
        return this.a(auit) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof auja && Arrays.equals(this.b, ((auja)o).b));
    }
    
    @Override
    public final int hashCode() {
        int n = 0;
        int n2 = 0;
        while (true) {
            final auit[] b = this.b;
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
