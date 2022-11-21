// 
// Decompiled by Procyon v0.6.0
// 

public enum arba implements ahdd
{
    a("COMMENT_STYLE_UNSPECIFIED", 0, 0), 
    b("COMMENT_NORMAL", 1, 1), 
    c("COMMENT_LIGHT", 2, 2);
    
    private static final arba[] e;
    public final int d;
    
    private arba(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aqym.j;
    }
    
    public static arba b(final int n) {
        if (n == 0) {
            return arba.a;
        }
        if (n == 1) {
            return arba.b;
        }
        if (n != 2) {
            return null;
        }
        return arba.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
