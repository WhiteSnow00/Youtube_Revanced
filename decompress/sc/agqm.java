// 
// Decompiled by Procyon v0.6.0
// 

public enum agqm implements ahbl
{
    a("ERROR_CODE_UNSPECIFIED", 0, 0), 
    b("ERROR_CODE_INVALID_REQUEST", 1, 1), 
    c("ERROR_CODE_RPC_ERROR", 2, 2), 
    d("ERROR_CODE_INTERNAL_ERROR", 3, 3), 
    e("ERROR_CODE_AUTHENTICATION_DENIED_BY_USER", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final agqm[] g;
    private final int h;
    
    private agqm(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agqm a(final int n) {
        if (n == 0) {
            return agqm.a;
        }
        if (n == 1) {
            return agqm.b;
        }
        if (n == 2) {
            return agqm.c;
        }
        if (n == 3) {
            return agqm.d;
        }
        if (n != 4) {
            return null;
        }
        return agqm.e;
    }
    
    public final int getNumber() {
        if (this != agqm.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
