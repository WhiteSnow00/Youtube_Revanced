// 
// Decompiled by Procyon v0.6.0
// 

public enum ahkv implements ahdd
{
    a("ACCOUNT_SELECTOR_EVENT_API_UNKNOWN", 0, 0), 
    b("ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION", 1, 1), 
    c("ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION", 2, 2);
    
    private static final ahkv[] e;
    public final int d;
    
    private ahkv(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return ahhs.q;
    }
    
    public static ahkv b(final int n) {
        if (n == 0) {
            return ahkv.a;
        }
        if (n == 1) {
            return ahkv.b;
        }
        if (n != 2) {
            return null;
        }
        return ahkv.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
