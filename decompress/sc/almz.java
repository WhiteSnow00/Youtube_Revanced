// 
// Decompiled by Procyon v0.6.0
// 

public enum almz implements ahbl
{
    a("LATENCY_PLAYER_PREFETCH_TYPE_UNKNOWN", 0, 0), 
    b("LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE", 1, 1), 
    c("LATENCY_PLAYER_PREFETCH_TYPE_CACHE", 2, 2);
    
    private static final almz[] e;
    public final int d;
    
    private almz(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return alna.b;
    }
    
    public static almz b(final int n) {
        if (n == 0) {
            return almz.a;
        }
        if (n == 1) {
            return almz.b;
        }
        if (n != 2) {
            return null;
        }
        return almz.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
