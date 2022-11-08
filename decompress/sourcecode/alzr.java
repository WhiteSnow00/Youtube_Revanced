// 
// Decompiled by Procyon v0.6.0
// 

public enum alzr implements agzm
{
    a("SYNC_MODE_UNKNOWN", 0, 0), 
    b("SYNC_MODE_USER_BROWSING", 1, 1), 
    c("SYNC_MODE_SYNCED_WITH_VIDEO", 2, 2);
    
    public final int d;
    
    private alzr(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return alyk.c;
    }
    
    public static alzr b(final int n) {
        if (n == 0) {
            return alzr.a;
        }
        if (n == 1) {
            return alzr.b;
        }
        if (n != 2) {
            return null;
        }
        return alzr.c;
    }
    
    @Override
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
