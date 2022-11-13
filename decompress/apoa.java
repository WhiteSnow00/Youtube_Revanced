// 
// Decompiled by Procyon v0.6.0
// 

public enum apoa implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("WIFI", 1, 1), 
    c("CELLULAR", 2, 2);
    
    private static final apoa[] d;
    private final int e;
    
    private apoa(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aplg.n;
    }
    
    public static apoa b(final int n) {
        if (n == 0) {
            return apoa.a;
        }
        if (n == 1) {
            return apoa.b;
        }
        if (n != 2) {
            return null;
        }
        return apoa.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
