// 
// Decompiled by Procyon v0.6.0
// 

public enum anpd implements ahbl
{
    a("PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN", 0, 0), 
    b("PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP", 1, 1), 
    c("PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD", 2, 3);
    
    private static final anpd[] d;
    private final int e;
    
    private anpd(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return anic.r;
    }
    
    public static anpd b(final int n) {
        if (n == 0) {
            return anpd.a;
        }
        if (n == 1) {
            return anpd.b;
        }
        if (n != 3) {
            return null;
        }
        return anpd.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
