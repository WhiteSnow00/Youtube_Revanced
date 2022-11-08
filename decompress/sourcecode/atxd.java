// 
// Decompiled by Procyon v0.6.0
// 

public enum atxd implements agzm
{
    a("PEER_DISTANCE_UNKNOWN", 0, 0), 
    b("PEER_DISTANCE_IN_PROCESS", 1, 1), 
    c("PEER_DISTANCE_INTER_PROCESS", 2, 2);
    
    public final int d;
    
    private atxd(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return arbt.j;
    }
    
    public static atxd b(final int n) {
        if (n == 0) {
            return atxd.a;
        }
        if (n == 1) {
            return atxd.b;
        }
        if (n != 2) {
            return null;
        }
        return atxd.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
