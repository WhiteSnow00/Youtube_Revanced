// 
// Decompiled by Procyon v0.6.0
// 

public enum ahmd implements agzm
{
    a("ANIMATION_DECISION_UNKNOWN", 0, 0), 
    b("ANIMATION_DECISION_ON", 1, 1), 
    c("ANIMATION_DECISION_THROTTLED", 2, 2), 
    d("ANIMATION_DECISION_OFF", 3, 3);
    
    public static final agzn e;
    public final int f;
    
    static {
        e = (agzn)new afom(2);
    }
    
    private ahmd(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return ahho.n;
    }
    
    public static ahmd b(final int n) {
        if (n == 0) {
            return ahmd.a;
        }
        if (n == 1) {
            return ahmd.b;
        }
        if (n == 2) {
            return ahmd.c;
        }
        if (n != 3) {
            return null;
        }
        return ahmd.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
