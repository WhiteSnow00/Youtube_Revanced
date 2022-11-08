// 
// Decompiled by Procyon v0.6.0
// 

public enum apmq implements agzm
{
    a("COMMENT_SOURCE_UNSPECIFIED", 0, 0), 
    b("COMMENT_SOURCE_VOD_COMMENTS", 1, 1), 
    c("COMMENT_SOURCE_SHORT_COMMENTS", 2, 2);
    
    public final int d;
    
    private apmq(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return apjd.r;
    }
    
    public static apmq b(final int n) {
        if (n == 0) {
            return apmq.a;
        }
        if (n == 1) {
            return apmq.b;
        }
        if (n != 2) {
            return null;
        }
        return apmq.c;
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
