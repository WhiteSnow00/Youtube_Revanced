// 
// Decompiled by Procyon v0.6.0
// 

public enum ajpk implements ahbl
{
    a("ENGAGEMENT_PANEL_SURFACE_UNKNOWN", 0, 0), 
    b("ENGAGEMENT_PANEL_SURFACE_WATCH", 1, 1), 
    c("ENGAGEMENT_PANEL_SURFACE_BROWSE", 2, 2), 
    d("ENGAGEMENT_PANEL_SURFACE_SEARCH", 3, 3), 
    e("ENGAGEMENT_PANEL_SURFACE_SHORTS", 4, 4);
    
    private static final ajpk[] f;
    private final int g;
    
    private ajpk(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return ajmw.q;
    }
    
    public static ajpk b(final int n) {
        if (n == 0) {
            return ajpk.a;
        }
        if (n == 1) {
            return ajpk.b;
        }
        if (n == 2) {
            return ajpk.c;
        }
        if (n == 3) {
            return ajpk.d;
        }
        if (n != 4) {
            return null;
        }
        return ajpk.e;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
