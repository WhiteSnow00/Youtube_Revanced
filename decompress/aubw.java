// 
// Decompiled by Procyon v0.6.0
// 

public enum aubw implements ahdd
{
    a("UNKNOWN", 0, 0), 
    @Deprecated
    b("PRIMES_INITIALIZED", 1, 1), 
    c("PRIMES_CRASH_MONITORING_INITIALIZED", 2, 2), 
    d("PRIMES_FIRST_ACTIVITY_LAUNCHED", 3, 3), 
    e("PRIMES_CUSTOM_LAUNCHED", 4, 4);
    
    private static final ahde f;
    private static final aubw[] g;
    private final int h;
    
    static {
        g = c();
        f = (ahde)new afsc(9);
    }
    
    private aubw(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahdf a() {
        return areg.t;
    }
    
    public static aubw b(final int n) {
        if (n == 0) {
            return aubw.a;
        }
        if (n == 1) {
            return aubw.b;
        }
        if (n == 2) {
            return aubw.c;
        }
        if (n == 3) {
            return aubw.d;
        }
        if (n != 4) {
            return null;
        }
        return aubw.e;
    }
    
    private static aubw[] c() {
        return new aubw[] { aubw.a, aubw.b, aubw.c, aubw.d, aubw.e };
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
