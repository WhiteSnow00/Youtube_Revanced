// 
// Decompiled by Procyon v0.6.0
// 

public enum ameq implements ahbl
{
    a("MDX_NOTIFICATION_GEL_TYPE_UNKNOWN", 0, 0), 
    b("MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_SINGLE_SCREEN", 1, 1), 
    c("MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN", 2, 2);
    
    private static final ameq[] e;
    public final int d;
    
    private ameq(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return alyw.o;
    }
    
    public static ameq b(final int n) {
        if (n == 0) {
            return ameq.a;
        }
        if (n == 1) {
            return ameq.b;
        }
        if (n != 2) {
            return null;
        }
        return ameq.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
