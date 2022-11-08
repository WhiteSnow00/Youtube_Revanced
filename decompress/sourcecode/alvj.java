// 
// Decompiled by Procyon v0.6.0
// 

public enum alvj implements agzm
{
    a("MAIN_APP_BROWSE_CACHE_EVENT_UNKNOWN", 0, 0), 
    b("MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_CONSIDERED", 1, 1), 
    c("MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_PERFORMED", 2, 2), 
    d("MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_DECLINED", 3, 3);
    
    private static final agzn e;
    private final int g;
    
    static {
        e = (agzn)new afom(4);
    }
    
    private alvj(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agzo a() {
        return alsb.n;
    }
    
    public static alvj b(final int n) {
        if (n == 0) {
            return alvj.a;
        }
        if (n == 1) {
            return alvj.b;
        }
        if (n == 2) {
            return alvj.c;
        }
        if (n != 3) {
            return null;
        }
        return alvj.d;
    }
    
    @Override
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
