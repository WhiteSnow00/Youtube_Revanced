// 
// Decompiled by Procyon v0.6.0
// 

public enum apjz implements ahdd
{
    a("UPLOAD_CONTENT_SOURCE_UNKNOWN", 0, 0), 
    b("UPLOAD_CONTENT_SOURCE_LOCAL", 1, 1), 
    c("UPLOAD_CONTENT_SOURCE_NONLOCAL", 2, 2);
    
    private static final apjz[] e;
    public final int d;
    
    private apjz(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aoxk.t;
    }
    
    public static apjz b(final int n) {
        if (n == 0) {
            return apjz.a;
        }
        if (n == 1) {
            return apjz.b;
        }
        if (n != 2) {
            return null;
        }
        return apjz.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
