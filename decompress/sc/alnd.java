// 
// Decompiled by Procyon v0.6.0
// 

public enum alnd implements ahbl
{
    a("LATENCY_PLAYER_VISIBILITY_STATE_UNKNOWN", 0, 0), 
    b("LATENCY_PLAYER_VISIBILITY_STATE_MINIMIZED", 1, 1), 
    c("LATENCY_PLAYER_VISIBILITY_STATE_FULLSCREEN", 2, 2), 
    d("LATENCY_PLAYER_VISIBILITY_STATE_BACKGROUND", 3, 3), 
    e("LATENCY_PLAYER_VISIBILITY_STATE_EXTERNAL_DISPLAY", 4, 4), 
    f("LATENCY_PLAYER_VISIBILITY_STATE_INLINE", 5, 5), 
    g("LATENCY_PLAYER_VISIBILITY_STATE_VR", 6, 6), 
    h("LATENCY_PLAYER_VISIBILITY_STATE_PIP", 7, 7);
    
    private static final alnd[] j;
    public final int i;
    
    private alnd(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahbn a() {
        return alna.d;
    }
    
    public static alnd b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return alnd.h;
            }
            case 6: {
                return alnd.g;
            }
            case 5: {
                return alnd.f;
            }
            case 4: {
                return alnd.e;
            }
            case 3: {
                return alnd.d;
            }
            case 2: {
                return alnd.c;
            }
            case 1: {
                return alnd.b;
            }
            case 0: {
                return alnd.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
