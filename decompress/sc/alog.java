// 
// Decompiled by Procyon v0.6.0
// 

public enum alog implements ahbl
{
    a("LIKE", 0, 0), 
    b("DISLIKE", 1, 1), 
    c("INDIFFERENT", 2, 2);
    
    public static final ahbm d;
    private static final alog[] f;
    public final int e;
    
    static {
        d = (ahbm)new afqn(3);
    }
    
    private alog(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return alnf.e;
    }
    
    public static alog b(final int n) {
        if (n == 0) {
            return alog.a;
        }
        if (n == 1) {
            return alog.b;
        }
        if (n != 2) {
            return null;
        }
        return alog.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
