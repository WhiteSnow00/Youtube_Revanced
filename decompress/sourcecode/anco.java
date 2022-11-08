// 
// Decompiled by Procyon v0.6.0
// 

public enum anco implements agzm
{
    a("PLAYER_CONTROLS_VISIBILITY_UNKNOWN", 0, 0), 
    b("PLAYER_CONTROLS_VISIBILITY_WILL_HIDE", 1, 1), 
    c("PLAYER_CONTROLS_VISIBILITY_HIDDEN", 2, 2), 
    d("PLAYER_CONTROLS_VISIBILITY_WILL_SHOW", 3, 3), 
    e("PLAYER_CONTROLS_VISIBILITY_SHOWN", 4, 4);
    
    public final int f;
    
    private anco(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return anaf.k;
    }
    
    public static anco b(final int n) {
        if (n == 0) {
            return anco.a;
        }
        if (n == 1) {
            return anco.b;
        }
        if (n == 2) {
            return anco.c;
        }
        if (n == 3) {
            return anco.d;
        }
        if (n != 4) {
            return null;
        }
        return anco.e;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
