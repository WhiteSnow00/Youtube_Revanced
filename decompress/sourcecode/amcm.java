// 
// Decompiled by Procyon v0.6.0
// 

public enum amcm implements agzm
{
    a("MDX_NOTIFICATION_GEL_TYPE_UNKNOWN", 0, 0), 
    b("MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_SINGLE_SCREEN", 1, 1), 
    c("MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN", 2, 2);
    
    public final int d;
    
    private amcm(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return alyk.n;
    }
    
    public static amcm b(final int n) {
        if (n == 0) {
            return amcm.a;
        }
        if (n == 1) {
            return amcm.b;
        }
        if (n != 2) {
            return null;
        }
        return amcm.c;
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
