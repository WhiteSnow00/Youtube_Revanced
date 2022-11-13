// 
// Decompiled by Procyon v0.6.0
// 

public enum ajpj implements ahbl
{
    a("ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN", 0, 0), 
    b("ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER", 1, 1), 
    c("ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED", 2, 2);
    
    private static final ajpj[] d;
    private final int e;
    
    private ajpj(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return ajmw.m;
    }
    
    public static ajpj b(final int n) {
        if (n == 0) {
            return ajpj.a;
        }
        if (n == 1) {
            return ajpj.b;
        }
        if (n != 2) {
            return null;
        }
        return ajpj.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
