// 
// Decompiled by Procyon v0.6.0
// 

public enum anuo implements ahdd
{
    a("REEL_LOOP_BEHAVIOR_UNKNOWN", 0, 0), 
    b("REEL_LOOP_BEHAVIOR_SINGLE_PLAY", 1, 1), 
    c("REEL_LOOP_BEHAVIOR_REPEAT", 2, 2), 
    d("REEL_LOOP_BEHAVIOR_END_SCREEN", 3, 3);
    
    private static final anuo[] e;
    private final int f;
    
    private anuo(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return ansp.s;
    }
    
    public static anuo b(final int n) {
        if (n == 0) {
            return anuo.a;
        }
        if (n == 1) {
            return anuo.b;
        }
        if (n == 2) {
            return anuo.c;
        }
        if (n != 3) {
            return null;
        }
        return anuo.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
