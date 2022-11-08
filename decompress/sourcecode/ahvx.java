// 
// Decompiled by Procyon v0.6.0
// 

public enum ahvx implements agzm
{
    a("AUTOTAG_VISIBILITY_STATE_UNSPECIFIED", 0, 0), 
    b("AUTOTAG_VISIBILITY_STATE_VISIBLE", 1, 1), 
    c("AUTOTAG_VISIBILITY_STATE_HIDDEN", 2, 2);
    
    private final int e;
    
    private ahvx(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return ahse.n;
    }
    
    public static ahvx b(final int n) {
        if (n == 0) {
            return ahvx.a;
        }
        if (n == 1) {
            return ahvx.b;
        }
        if (n != 2) {
            return null;
        }
        return ahvx.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
