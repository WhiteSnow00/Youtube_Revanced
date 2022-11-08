// 
// Decompiled by Procyon v0.6.0
// 

public enum atyc implements agzm
{
    a("UNKNOWN", 0, 0), 
    @Deprecated
    b("PRIMES_INITIALIZED", 1, 1), 
    c("PRIMES_CRASH_MONITORING_INITIALIZED", 2, 2), 
    d("PRIMES_FIRST_ACTIVITY_LAUNCHED", 3, 3), 
    e("PRIMES_CUSTOM_LAUNCHED", 4, 4);
    
    private static final agzn f;
    private final int h;
    
    static {
        f = (agzn)new afom(9);
    }
    
    private atyc(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agzo a() {
        return arbt.r;
    }
    
    public static atyc b(final int n) {
        if (n == 0) {
            return atyc.a;
        }
        if (n == 1) {
            return atyc.b;
        }
        if (n == 2) {
            return atyc.c;
        }
        if (n == 3) {
            return atyc.d;
        }
        if (n != 4) {
            return null;
        }
        return atyc.e;
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
