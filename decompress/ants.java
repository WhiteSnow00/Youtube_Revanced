// 
// Decompiled by Procyon v0.6.0
// 

public enum ants implements ahdd
{
    a("REACHABILITY_DETECTION_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST", 1, 1), 
    c("REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST", 2, 2), 
    d("REACHABILITY_DETECTION_EVENT_TYPE_REFRESH", 3, 3);
    
    private static final ants[] f;
    public final int e;
    
    private ants(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ansp.k;
    }
    
    public static ants b(final int n) {
        if (n == 0) {
            return ants.a;
        }
        if (n == 1) {
            return ants.b;
        }
        if (n == 2) {
            return ants.c;
        }
        if (n != 3) {
            return null;
        }
        return ants.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
