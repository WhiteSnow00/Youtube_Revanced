// 
// Decompiled by Procyon v0.6.0
// 

public enum anpc implements ahbl
{
    a("PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN", 0, 0), 
    b("PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP", 1, 1), 
    c("PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_TOGGLE_STATE", 2, 2), 
    d("PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD", 3, 3);
    
    private static final anpc[] e;
    private final int f;
    
    private anpc(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return anic.q;
    }
    
    public static anpc b(final int n) {
        if (n == 0) {
            return anpc.a;
        }
        if (n == 1) {
            return anpc.b;
        }
        if (n == 2) {
            return anpc.c;
        }
        if (n != 3) {
            return null;
        }
        return anpc.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
