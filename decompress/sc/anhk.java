// 
// Decompiled by Procyon v0.6.0
// 

public enum anhk implements ahbl
{
    a("PLAYER_STATE_UNKNOWN", 0, 0), 
    b("PLAYER_STATE_LOADING_CONTENT", 1, 1), 
    c("PLAYER_STATE_PLAYING", 2, 2), 
    d("PLAYER_STATE_PAUSED", 3, 3), 
    e("PLAYER_STATE_FINISHED", 4, 4), 
    f("PLAYER_STATE_ERROR", 5, 5), 
    g("PLAYER_STATE_SEEKING", 6, 6), 
    h("PLAYER_STATE_PAUSED_SEEKING", 7, 7);
    
    private static final anhk[] j;
    public final int i;
    
    private anhk(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahbn a() {
        return anci.q;
    }
    
    public static anhk b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return anhk.h;
            }
            case 6: {
                return anhk.g;
            }
            case 5: {
                return anhk.f;
            }
            case 4: {
                return anhk.e;
            }
            case 3: {
                return anhk.d;
            }
            case 2: {
                return anhk.c;
            }
            case 1: {
                return anhk.b;
            }
            case 0: {
                return anhk.a;
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
