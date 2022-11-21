// 
// Decompiled by Procyon v0.6.0
// 

public enum antt implements ahdd
{
    a("REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN", 0, 0), 
    b("REACHABILITY_DETECTION_STRATEGY_TYPE_LOGGING", 1, 1), 
    c("REACHABILITY_DETECTION_STRATEGY_TYPE_DELAYED", 2, 2), 
    d("REACHABILITY_DETECTION_STRATEGY_TYPE_GEN204", 3, 3), 
    e("REACHABILITY_DETECTION_STRATEGY_TYPE_ALWAYS_ON", 4, 4);
    
    private static final antt[] g;
    public final int f;
    
    private antt(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return ansp.l;
    }
    
    public static antt b(final int n) {
        if (n == 0) {
            return antt.a;
        }
        if (n == 1) {
            return antt.b;
        }
        if (n == 2) {
            return antt.c;
        }
        if (n == 3) {
            return antt.d;
        }
        if (n != 4) {
            return null;
        }
        return antt.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
