// 
// Decompiled by Procyon v0.6.0
// 

public enum apno implements agzm
{
    a("VOICE_SEARCH_VAA_EVENT_UNKNOWN", 0, 0), 
    b("VOICE_SEARCH_VAA_EVENT_SKIPPED", 1, 1), 
    c("VOICE_SEARCH_VAA_EVENT_ERROR", 2, 2);
    
    private static final agzn d;
    private final int f;
    
    static {
        d = (agzn)new afom(8);
    }
    
    private apno(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return apms.l;
    }
    
    public static apno b(final int n) {
        if (n == 0) {
            return apno.a;
        }
        if (n == 1) {
            return apno.b;
        }
        if (n != 2) {
            return null;
        }
        return apno.c;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
