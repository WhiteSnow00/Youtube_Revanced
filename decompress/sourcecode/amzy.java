// 
// Decompiled by Procyon v0.6.0
// 

public enum amzy implements agzm
{
    a("PLAY_BILLING_STATUS_UNKNOWN", 0, 0), 
    b("PLAY_BILLING_STATUS_NOT_STARTED", 1, 1), 
    c("PLAY_BILLING_STATUS_STARTED", 2, 2);
    
    public final int d;
    
    private amzy(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return amtt.t;
    }
    
    public static amzy b(final int n) {
        if (n == 0) {
            return amzy.a;
        }
        if (n == 1) {
            return amzy.b;
        }
        if (n != 2) {
            return null;
        }
        return amzy.c;
    }
    
    @Override
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
