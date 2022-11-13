// 
// Decompiled by Procyon v0.6.0
// 

public enum aqra implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("UNMETERED_WIFI", 1, 1), 
    c("UNMETERED_WIFI_OR_UNMETERED_MOBILE", 2, 2), 
    d("ANY", 3, 3);
    
    private static final aqra[] f;
    public final int e;
    
    private aqra(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aqls.m;
    }
    
    public static aqra b(final int n) {
        if (n == 0) {
            return aqra.a;
        }
        if (n == 1) {
            return aqra.b;
        }
        if (n == 2) {
            return aqra.c;
        }
        if (n != 3) {
            return null;
        }
        return aqra.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
