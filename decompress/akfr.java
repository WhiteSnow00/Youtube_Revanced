// 
// Decompiled by Procyon v0.6.0
// 

public enum akfr implements ahbl
{
    a("CAPTION_VISIBILITY_STATUS_UNKNOWN", 0, 0), 
    b("CAPTION_VISIBILITY_STATUS_ENABLED", 1, 1), 
    c("CAPTION_VISIBILITY_STATUS_DISABLED", 2, 2), 
    d("CAPTION_VISIBILITY_STATUS_UNAVAILABLE", 3, 3);
    
    private static final akfr[] f;
    public final int e;
    
    private akfr(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return akeh.d;
    }
    
    public static akfr b(final int n) {
        if (n == 0) {
            return akfr.a;
        }
        if (n == 1) {
            return akfr.b;
        }
        if (n == 2) {
            return akfr.c;
        }
        if (n != 3) {
            return null;
        }
        return akfr.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
