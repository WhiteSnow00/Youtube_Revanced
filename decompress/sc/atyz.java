// 
// Decompiled by Procyon v0.6.0
// 

public enum atyz implements ahbl
{
    a("UNKNOWN", 0, 0), 
    @Deprecated
    b("PRIMES_INITIALIZED", 1, 1), 
    c("PRIMES_CRASH_MONITORING_INITIALIZED", 2, 2), 
    d("PRIMES_FIRST_ACTIVITY_LAUNCHED", 3, 3), 
    e("PRIMES_CUSTOM_LAUNCHED", 4, 4);
    
    private static final ahbm f;
    private static final atyz[] g;
    private final int h;
    
    static {
        g = c();
        f = (ahbm)new afqn(9);
    }
    
    private atyz(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static ahbn a() {
        return areg.s;
    }
    
    public static atyz b(final int n) {
        if (n == 0) {
            return atyz.a;
        }
        if (n == 1) {
            return atyz.b;
        }
        if (n == 2) {
            return atyz.c;
        }
        if (n == 3) {
            return atyz.d;
        }
        if (n != 4) {
            return null;
        }
        return atyz.e;
    }
    
    private static atyz[] c() {
        return new atyz[] { atyz.a, atyz.b, atyz.c, atyz.d, atyz.e };
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
