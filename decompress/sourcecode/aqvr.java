// 
// Decompiled by Procyon v0.6.0
// 

public enum aqvr implements agzm
{
    a("COMMENT_STYLE_UNSPECIFIED", 0, 0), 
    b("COMMENT_NORMAL", 1, 1), 
    c("COMMENT_LIGHT", 2, 2);
    
    public final int d;
    
    private aqvr(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aqtg.h;
    }
    
    public static aqvr b(final int n) {
        if (n == 0) {
            return aqvr.a;
        }
        if (n == 1) {
            return aqvr.b;
        }
        if (n != 2) {
            return null;
        }
        return aqvr.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
