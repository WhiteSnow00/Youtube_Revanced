// 
// Decompiled by Procyon v0.6.0
// 

public enum apou implements ahbl
{
    a("COMMENT_SOURCE_UNSPECIFIED", 0, 0), 
    b("COMMENT_SOURCE_VOD_COMMENTS", 1, 1), 
    c("COMMENT_SOURCE_SHORT_COMMENTS", 2, 2);
    
    private static final apou[] e;
    public final int d;
    
    private apou(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return aplg.s;
    }
    
    public static apou b(final int n) {
        if (n == 0) {
            return apou.a;
        }
        if (n == 1) {
            return apou.b;
        }
        if (n != 2) {
            return null;
        }
        return apou.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
