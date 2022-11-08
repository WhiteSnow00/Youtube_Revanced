// 
// Decompiled by Procyon v0.6.0
// 

public enum ahhg implements agzm
{
    a("ACCOUNT_SELECTOR_EVENT_API_UNKNOWN", 0, 0), 
    b("ACCOUNT_SELECTOR_EVENT_API_GET_SELECTION", 1, 1), 
    c("ACCOUNT_SELECTOR_EVENT_API_USE_SELECTION", 2, 2);
    
    public final int d;
    
    private ahhg(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return ahec.q;
    }
    
    public static ahhg b(final int n) {
        if (n == 0) {
            return ahhg.a;
        }
        if (n == 1) {
            return ahhg.b;
        }
        if (n != 2) {
            return null;
        }
        return ahhg.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
