// 
// Decompiled by Procyon v0.6.0
// 

public enum ahps implements ahdd
{
    a("ANIMATION_DECISION_UNKNOWN", 0, 0), 
    b("ANIMATION_DECISION_ON", 1, 1), 
    c("ANIMATION_DECISION_THROTTLED", 2, 2), 
    d("ANIMATION_DECISION_OFF", 3, 3);
    
    public static final ahde e;
    private static final ahps[] g;
    public final int f;
    
    static {
        e = (ahde)new afsc(2);
    }
    
    private ahps(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return ahld.n;
    }
    
    public static ahps b(final int n) {
        if (n == 0) {
            return ahps.a;
        }
        if (n == 1) {
            return ahps.b;
        }
        if (n == 2) {
            return ahps.c;
        }
        if (n != 3) {
            return null;
        }
        return ahps.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
