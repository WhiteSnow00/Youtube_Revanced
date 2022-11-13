// 
// Decompiled by Procyon v0.6.0
// 

public enum aovv implements ahbl
{
    a("TRANSACTION_ID_STATUS_UNKNOWN", 0, 0), 
    b("TRANSACTION_ID_STATUS_STARTED", 1, 1), 
    c("TRANSACTION_ID_STATUS_ERROR", 2, 2), 
    d("TRANSACTION_ID_STATUS_OK", 3, 3);
    
    private static final aovv[] e;
    private final int f;
    
    private aovv(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return aove.e;
    }
    
    public static aovv b(final int n) {
        if (n == 0) {
            return aovv.a;
        }
        if (n == 1) {
            return aovv.b;
        }
        if (n == 2) {
            return aovv.c;
        }
        if (n != 3) {
            return null;
        }
        return aovv.d;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
