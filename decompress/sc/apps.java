// 
// Decompiled by Procyon v0.6.0
// 

public enum apps implements ahbl
{
    a("VOICE_SEARCH_VAA_EVENT_UNKNOWN", 0, 0), 
    b("VOICE_SEARCH_VAA_EVENT_SKIPPED", 1, 1), 
    c("VOICE_SEARCH_VAA_EVENT_ERROR", 2, 2);
    
    private static final ahbm d;
    private static final apps[] e;
    private final int f;
    
    static {
        e = c();
        d = (ahbm)new afqn(8);
    }
    
    private apps(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return apow.m;
    }
    
    public static apps b(final int n) {
        if (n == 0) {
            return apps.a;
        }
        if (n == 1) {
            return apps.b;
        }
        if (n != 2) {
            return null;
        }
        return apps.c;
    }
    
    private static apps[] c() {
        return new apps[] { apps.a, apps.b, apps.c };
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
