// 
// Decompiled by Procyon v0.6.0
// 

public enum alnb implements ahbl
{
    a("LATENCY_PLAYER_PRELOAD_TYPE_UNKNOWN", 0, 0), 
    b("LATENCY_PLAYER_PRELOAD_TYPE_CONFIG", 1, 1), 
    c("LATENCY_PLAYER_PRELOAD_TYPE_PREBUFFER", 2, 2);
    
    private static final alnb[] e;
    public final int d;
    
    private alnb(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return alna.a;
    }
    
    public static alnb b(final int n) {
        if (n == 0) {
            return alnb.a;
        }
        if (n == 1) {
            return alnb.b;
        }
        if (n != 2) {
            return null;
        }
        return alnb.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
