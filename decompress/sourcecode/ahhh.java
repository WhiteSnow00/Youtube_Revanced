// 
// Decompiled by Procyon v0.6.0
// 

public enum ahhh implements agzm
{
    a("ACCOUNT_SELECTOR_EVENT_RESULT_UNKNOWN", 0, 0), 
    b("ACCOUNT_SELECTOR_EVENT_RESULT_SUCCESS", 1, 1), 
    c("ACCOUNT_SELECTOR_EVENT_RESULT_INITIATED", 2, 2);
    
    public final int d;
    
    private ahhh(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return ahec.r;
    }
    
    public static ahhh b(final int n) {
        if (n == 0) {
            return ahhh.a;
        }
        if (n == 1) {
            return ahhh.b;
        }
        if (n != 2) {
            return null;
        }
        return ahhh.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
