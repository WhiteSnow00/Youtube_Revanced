// 
// Decompiled by Procyon v0.6.0
// 

public enum ande implements agzm
{
    a("PLAYER_LAYOUT_STATE_UNKNOWN", 0, 0), 
    b("PLAYER_LAYOUT_STATE_DEFAULT", 1, 1), 
    c("PLAYER_LAYOUT_STATE_MINIMIZED", 2, 2), 
    d("PLAYER_LAYOUT_STATE_FULLSCREEN", 3, 3), 
    e("PLAYER_LAYOUT_STATE_BACKGROUND", 4, 4), 
    f("PLAYER_LAYOUT_STATE_INLINE", 5, 5), 
    g("PLAYER_LAYOUT_STATE_VR", 6, 6), 
    h("PLAYER_LAYOUT_STATE_PICTURE_IN_PICTURE", 7, 7), 
    i("PLAYER_LAYOUT_STATE_IMMERSIVE_PREVIEW", 8, 8), 
    j("PLAYER_LAYOUT_STATE_THEATRE", 9, 9), 
    k("PLAYER_LAYOUT_STATE_TRANSITIONING_BETWEEN_MINIMIZED_AND_DEFAULT", 10, 10), 
    l("PLAYER_LAYOUT_STATE_TRANSITIONING_BETWEEN_DEFAULT_AND_FULLSCREEN", 11, 11);
    
    public final int m;
    
    private ande(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static agzo a() {
        return anaf.n;
    }
    
    public static ande b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return ande.l;
            }
            case 10: {
                return ande.k;
            }
            case 9: {
                return ande.j;
            }
            case 8: {
                return ande.i;
            }
            case 7: {
                return ande.h;
            }
            case 6: {
                return ande.g;
            }
            case 5: {
                return ande.f;
            }
            case 4: {
                return ande.e;
            }
            case 3: {
                return ande.d;
            }
            case 2: {
                return ande.c;
            }
            case 1: {
                return ande.b;
            }
            case 0: {
                return ande.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
