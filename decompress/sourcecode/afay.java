import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afay extends afba
{
    public static final afba g(final int n) {
        afba afba;
        if (n < 0) {
            afba = afba.c;
        }
        else if (n > 0) {
            afba = afba.d;
        }
        else {
            afba = afba.b;
        }
        return afba;
    }
    
    public final int a() {
        return 0;
    }
    
    public final afba b(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else if (n > n2) {
            n = 1;
        }
        else {
            n = 0;
        }
        return g(n);
    }
    
    public final afba c(final Comparable comparable, final Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }
    
    public final afba d(final Object o, final Object o2, final Comparator comparator) {
        return g(comparator.compare(o, o2));
    }
    
    public final afba e(final boolean b, final boolean b2) {
        return g(aesy.G(b, b2));
    }
    
    public final afba f(final boolean b, final boolean b2) {
        return g(aesy.G(b2, b));
    }
}
