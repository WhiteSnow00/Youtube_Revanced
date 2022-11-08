// 
// Decompiled by Procyon v0.6.0
// 

public enum ahhi implements agzm
{
    a("ACCOUNT_SELECTOR_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("ACCOUNT_SELECTOR_EVENT_TYPE_AUTO", 1, 1);
    
    public final int c;
    
    private ahhi(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static agzo a() {
        return ahec.s;
    }
    
    public static ahhi b(final int n) {
        if (n == 0) {
            return ahhi.a;
        }
        if (n != 1) {
            return null;
        }
        return ahhi.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
