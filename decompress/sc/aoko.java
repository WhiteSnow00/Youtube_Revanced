// 
// Decompiled by Procyon v0.6.0
// 

public enum aoko implements ahbl
{
    a("STARTUP_SIGNAL_UNKNOWN", 0, 0), 
    b("STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED", 1, 1), 
    c("STARTUP_SIGNAL_BROWSE_FEED_LOADED", 2, 2), 
    d("STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED", 3, 3);
    
    private static final aoko[] e;
    private final int f;
    
    private aoko(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return aoet.s;
    }
    
    public static aoko b(final int n) {
        if (n == 0) {
            return aoko.a;
        }
        if (n == 1) {
            return aoko.b;
        }
        if (n == 2) {
            return aoko.c;
        }
        if (n != 3) {
            return null;
        }
        return aoko.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
