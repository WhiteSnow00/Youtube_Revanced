// 
// Decompiled by Procyon v0.6.0
// 

public enum aluv implements ahbl
{
    a("LIVESTREAM_CONNECTION_STATE_UNKNOWN", 0, 0), 
    b("LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED", 1, 1), 
    c("LIVESTREAM_CONNECTION_STATE_DISCONNECTED", 2, 2), 
    d("LIVESTREAM_CONNECTION_STATE_RECONNECTING", 3, 3), 
    e("LIVESTREAM_CONNECTION_STATE_ACTIVE", 4, 4);
    
    private static final aluv[] g;
    public final int f;
    
    private aluv(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return alua.f;
    }
    
    public static aluv b(final int n) {
        if (n == 0) {
            return aluv.a;
        }
        if (n == 1) {
            return aluv.b;
        }
        if (n == 2) {
            return aluv.c;
        }
        if (n == 3) {
            return aluv.d;
        }
        if (n != 4) {
            return null;
        }
        return aluv.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
