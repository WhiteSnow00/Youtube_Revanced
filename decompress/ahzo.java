// 
// Decompiled by Procyon v0.6.0
// 

public enum ahzo implements ahdd
{
    a("AUTOTAG_VISIBILITY_STATE_UNSPECIFIED", 0, 0), 
    b("AUTOTAG_VISIBILITY_STATE_VISIBLE", 1, 1), 
    c("AUTOTAG_VISIBILITY_STATE_HIDDEN", 2, 2);
    
    private static final ahzo[] d;
    private final int e;
    
    private ahzo(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return ahvv.n;
    }
    
    public static ahzo b(final int n) {
        if (n == 0) {
            return ahzo.a;
        }
        if (n == 1) {
            return ahzo.b;
        }
        if (n != 2) {
            return null;
        }
        return ahzo.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
