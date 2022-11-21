// 
// Decompiled by Procyon v0.6.0
// 

public enum ahkw implements ahdd
{
    a("ACCOUNT_SELECTOR_EVENT_RESULT_UNKNOWN", 0, 0), 
    b("ACCOUNT_SELECTOR_EVENT_RESULT_SUCCESS", 1, 1), 
    c("ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED", 2, 2);
    
    private static final ahkw[] e;
    public final int d;
    
    private ahkw(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return ahhs.r;
    }
    
    public static ahkw b(final int n) {
        if (n == 0) {
            return ahkw.a;
        }
        if (n == 1) {
            return ahkw.b;
        }
        if (n != 2) {
            return null;
        }
        return ahkw.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
