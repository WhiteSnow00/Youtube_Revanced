// 
// Decompiled by Procyon v0.6.0
// 

public enum ajpi implements ahbl
{
    a("ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_UNSPECIFIED", 0, 0), 
    b("ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP", 1, 1), 
    c("ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP", 2, 2), 
    d("ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP_STACK", 3, 3);
    
    private static final ajpi[] e;
    private final int f;
    
    private ajpi(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return ajmw.j;
    }
    
    public static ajpi b(final int n) {
        if (n == 0) {
            return ajpi.a;
        }
        if (n == 1) {
            return ajpi.b;
        }
        if (n == 2) {
            return ajpi.c;
        }
        if (n != 3) {
            return null;
        }
        return ajpi.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
