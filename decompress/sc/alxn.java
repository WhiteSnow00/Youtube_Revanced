// 
// Decompiled by Procyon v0.6.0
// 

public enum alxn implements ahbl
{
    a("MAIN_APP_BROWSE_CACHE_EVENT_UNKNOWN", 0, 0), 
    b("MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_CONSIDERED", 1, 1), 
    c("MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_PERFORMED", 2, 2), 
    d("MAIN_APP_BROWSE_CACHE_EVENT_RELOAD_DECLINED", 3, 3);
    
    private static final ahbm e;
    private static final alxn[] f;
    private final int g;
    
    static {
        f = c();
        e = (ahbm)new afqn(4);
    }
    
    private alxn(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return alua.o;
    }
    
    public static alxn b(final int n) {
        if (n == 0) {
            return alxn.a;
        }
        if (n == 1) {
            return alxn.b;
        }
        if (n == 2) {
            return alxn.c;
        }
        if (n != 3) {
            return null;
        }
        return alxn.d;
    }
    
    private static alxn[] c() {
        return new alxn[] { alxn.a, alxn.b, alxn.c, alxn.d };
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
