import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afeo extends afeq
{
    public static final afeq g(final int n) {
        afeq afeq;
        if (n < 0) {
            afeq = afeq.c;
        }
        else if (n > 0) {
            afeq = afeq.d;
        }
        else {
            afeq = afeq.b;
        }
        return afeq;
    }
    
    @Override
    public final int a() {
        return 0;
    }
    
    @Override
    public final afeq b(int n, final int n2) {
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
    
    @Override
    public final afeq c(final Comparable comparable, final Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }
    
    @Override
    public final afeq d(final Object o, final Object o2, final Comparator comparator) {
        return g(comparator.compare(o, o2));
    }
    
    @Override
    public final afeq e(final boolean b, final boolean b2) {
        return g(aftz.a(b, b2));
    }
    
    @Override
    public final afeq f(final boolean b, final boolean b2) {
        return g(aftz.a(b2, b));
    }
}
