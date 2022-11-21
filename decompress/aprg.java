// 
// Decompiled by Procyon v0.6.0
// 

public enum aprg implements ahdd
{
    a("COMMENT_SOURCE_UNSPECIFIED", 0, 0), 
    b("COMMENT_SOURCE_VOD_COMMENTS", 1, 1), 
    c("COMMENT_SOURCE_SHORT_COMMENTS", 2, 2);
    
    private static final aprg[] e;
    public final int d;
    
    private aprg(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return apnc.t;
    }
    
    public static aprg b(final int n) {
        if (n == 0) {
            return aprg.a;
        }
        if (n == 1) {
            return aprg.b;
        }
        if (n != 2) {
            return null;
        }
        return aprg.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
