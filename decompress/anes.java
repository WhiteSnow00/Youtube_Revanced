// 
// Decompiled by Procyon v0.6.0
// 

public enum anes implements ahbl
{
    a("PLAYER_CONTROLS_VISIBILITY_UNKNOWN", 0, 0), 
    b("PLAYER_CONTROLS_VISIBILITY_WILL_HIDE", 1, 1), 
    c("PLAYER_CONTROLS_VISIBILITY_HIDDEN", 2, 2), 
    d("PLAYER_CONTROLS_VISIBILITY_WILL_SHOW", 3, 3), 
    e("PLAYER_CONTROLS_VISIBILITY_SHOWN", 4, 4);
    
    private static final anes[] g;
    public final int f;
    
    private anes(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return anci.l;
    }
    
    public static anes b(final int n) {
        if (n == 0) {
            return anes.a;
        }
        if (n == 1) {
            return anes.b;
        }
        if (n == 2) {
            return anes.c;
        }
        if (n == 3) {
            return anes.d;
        }
        if (n != 4) {
            return null;
        }
        return anes.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
