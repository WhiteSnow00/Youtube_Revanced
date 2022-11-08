// 
// Decompiled by Procyon v0.6.0
// 

public enum aplw implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("WIFI", 1, 1), 
    c("CELLULAR", 2, 2);
    
    private final int e;
    
    private aplw(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return apjd.m;
    }
    
    public static aplw b(final int n) {
        if (n == 0) {
            return aplw.a;
        }
        if (n == 1) {
            return aplw.b;
        }
        if (n != 2) {
            return null;
        }
        return aplw.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
