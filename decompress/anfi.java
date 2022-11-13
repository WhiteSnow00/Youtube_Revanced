// 
// Decompiled by Procyon v0.6.0
// 

public enum anfi implements ahbl
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
    
    private static final anfi[] n;
    public final int m;
    
    private anfi(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static ahbn a() {
        return anci.o;
    }
    
    public static anfi b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return anfi.l;
            }
            case 10: {
                return anfi.k;
            }
            case 9: {
                return anfi.j;
            }
            case 8: {
                return anfi.i;
            }
            case 7: {
                return anfi.h;
            }
            case 6: {
                return anfi.g;
            }
            case 5: {
                return anfi.f;
            }
            case 4: {
                return anfi.e;
            }
            case 3: {
                return anfi.d;
            }
            case 2: {
                return anfi.c;
            }
            case 1: {
                return anfi.b;
            }
            case 0: {
                return anfi.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
