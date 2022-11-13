// 
// Decompiled by Procyon v0.6.0
// 

public enum atyb implements ahbl
{
    a("REQUEST_STATUS_UNSPECIFIED", 0, 0), 
    b("SUCCEEDED", 1, 1), 
    c("FAILED", 2, 2), 
    d("CANCELED", 3, 3);
    
    private static final atyb[] f;
    public final int e;
    
    private atyb(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return areg.n;
    }
    
    public static atyb b(final int n) {
        if (n == 0) {
            return atyb.a;
        }
        if (n == 1) {
            return atyb.b;
        }
        if (n == 2) {
            return atyb.c;
        }
        if (n != 3) {
            return null;
        }
        return atyb.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
