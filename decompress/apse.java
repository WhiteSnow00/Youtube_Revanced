// 
// Decompiled by Procyon v0.6.0
// 

public enum apse implements ahdd
{
    a("VOICE_SEARCH_VAA_EVENT_UNKNOWN", 0, 0), 
    b("VOICE_SEARCH_VAA_EVENT_SKIPPED", 1, 1), 
    c("VOICE_SEARCH_VAA_EVENT_ERROR", 2, 2);
    
    private static final ahde d;
    private static final apse[] e;
    private final int f;
    
    static {
        e = c();
        d = (ahde)new afsc(8);
    }
    
    private apse(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aprh.n;
    }
    
    public static apse b(final int n) {
        if (n == 0) {
            return apse.a;
        }
        if (n == 1) {
            return apse.b;
        }
        if (n != 2) {
            return null;
        }
        return apse.c;
    }
    
    private static apse[] c() {
        return new apse[] { apse.a, apse.b, apse.c };
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
