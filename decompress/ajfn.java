// 
// Decompiled by Procyon v0.6.0
// 

public enum ajfn implements ahdd
{
    a("DELAYED_EVENT_TIER_UNSPECIFIED", 0, 0), 
    b("DELAYED_EVENT_TIER_DEFAULT", 1, 100), 
    c("DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY", 2, 200), 
    d("DELAYED_EVENT_TIER_FAST", 3, 300), 
    e("DELAYED_EVENT_TIER_IMMEDIATE", 4, 400);
    
    private static final ajfn[] g;
    public final int f;
    
    private ajfn(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahdf a() {
        return aitw.t;
    }
    
    public static ajfn b(final int n) {
        if (n == 0) {
            return ajfn.a;
        }
        if (n == 100) {
            return ajfn.b;
        }
        if (n == 200) {
            return ajfn.c;
        }
        if (n == 300) {
            return ajfn.d;
        }
        if (n != 400) {
            return null;
        }
        return ajfn.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
