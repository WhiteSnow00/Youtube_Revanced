// 
// Decompiled by Procyon v0.6.0
// 

public enum anws implements ahbl
{
    a("SCROLL_DIRECTION_UNKNOWN", 0, 0), 
    b("SCROLL_DIRECTION_FORWARD", 1, 1), 
    c("SCROLL_DIRECTION_BACKWARDS", 2, 2);
    
    private static final anws[] e;
    public final int d;
    
    private anws(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return ansm.u;
    }
    
    public static anws b(final int n) {
        if (n == 0) {
            return anws.a;
        }
        if (n == 1) {
            return anws.b;
        }
        if (n != 2) {
            return null;
        }
        return anws.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
