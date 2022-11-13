// 
// Decompiled by Procyon v0.6.0
// 

public enum ajdp implements ahbl
{
    a("DELAYED_EVENT_TIER_UNSPECIFIED", 0, 0), 
    b("DELAYED_EVENT_TIER_DEFAULT", 1, 100), 
    c("DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY", 2, 200), 
    d("DELAYED_EVENT_TIER_FAST", 3, 300), 
    e("DELAYED_EVENT_TIER_IMMEDIATE", 4, 400);
    
    private static final ajdp[] g;
    public final int f;
    
    private ajdp(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return airy.t;
    }
    
    public static ajdp b(final int n) {
        if (n == 0) {
            return ajdp.a;
        }
        if (n == 100) {
            return ajdp.b;
        }
        if (n == 200) {
            return ajdp.c;
        }
        if (n == 300) {
            return ajdp.d;
        }
        if (n != 400) {
            return null;
        }
        return ajdp.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
