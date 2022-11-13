// 
// Decompiled by Procyon v0.6.0
// 

public enum ajhj implements ahbl
{
    a("REQUEST_TYPE_UNSPECIFIED", 0, 0), 
    b("REQUEST_TYPE_FILTER_CHANGE", 1, 1), 
    c("REQUEST_TYPE_EXPANSION", 2, 2);
    
    private static final ajhj[] e;
    public final int d;
    
    private ajhj(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return ajek.k;
    }
    
    public static ajhj b(final int n) {
        if (n == 0) {
            return ajhj.a;
        }
        if (n == 1) {
            return ajhj.b;
        }
        if (n != 2) {
            return null;
        }
        return ajhj.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
