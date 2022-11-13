// 
// Decompiled by Procyon v0.6.0
// 

public enum admy implements ahbl
{
    a("PRIVATE", 0, 0), 
    b("PUBLIC", 1, 1), 
    c("UNLISTED", 2, 2);
    
    private static final admy[] e;
    public final int d;
    
    private admy(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static admy a(final int n) {
        if (n == 0) {
            return admy.a;
        }
        if (n == 1) {
            return admy.b;
        }
        if (n != 2) {
            return null;
        }
        return admy.c;
    }
    
    public static ahbn b() {
        return pff.s;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
