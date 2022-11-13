// 
// Decompiled by Procyon v0.6.0
// 

public enum ambv implements ahbl
{
    a("SYNC_MODE_UNKNOWN", 0, 0), 
    b("SYNC_MODE_USER_BROWSING", 1, 1), 
    c("SYNC_MODE_SYNCED_WITH_VIDEO", 2, 2);
    
    private static final ambv[] e;
    public final int d;
    
    private ambv(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return alyw.d;
    }
    
    public static ambv b(final int n) {
        if (n == 0) {
            return ambv.a;
        }
        if (n == 1) {
            return ambv.b;
        }
        if (n != 2) {
            return null;
        }
        return ambv.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
