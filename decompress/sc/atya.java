// 
// Decompiled by Procyon v0.6.0
// 

public enum atya implements ahbl
{
    a("PEER_DISTANCE_UNKNOWN", 0, 0), 
    b("PEER_DISTANCE_IN_PROCESS", 1, 1), 
    c("PEER_DISTANCE_INTER_PROCESS", 2, 2);
    
    private static final atya[] e;
    public final int d;
    
    private atya(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return areg.k;
    }
    
    public static atya b(final int n) {
        if (n == 0) {
            return atya.a;
        }
        if (n == 1) {
            return atya.b;
        }
        if (n != 2) {
            return null;
        }
        return atya.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
