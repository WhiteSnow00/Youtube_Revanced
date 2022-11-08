// 
// Decompiled by Procyon v0.6.0
// 

public enum aots implements agzm
{
    a("TRANSACTION_ID_STATUS_UNKNOWN", 0, 0), 
    b("TRANSACTION_ID_STATUS_STARTED", 1, 1), 
    c("TRANSACTION_ID_STATUS_ERROR", 2, 2), 
    d("TRANSACTION_ID_STATUS_OK", 3, 3);
    
    private final int f;
    
    private aots(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return aotc.d;
    }
    
    public static aots b(final int n) {
        if (n == 0) {
            return aots.a;
        }
        if (n == 1) {
            return aots.b;
        }
        if (n == 2) {
            return aots.c;
        }
        if (n != 3) {
            return null;
        }
        return aots.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
