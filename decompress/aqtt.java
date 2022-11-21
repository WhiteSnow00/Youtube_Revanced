// 
// Decompiled by Procyon v0.6.0
// 

public enum aqtt implements ahdd
{
    a("UNKNOWN", 0, 0), 
    b("UNMETERED_WIFI", 1, 1), 
    c("UNMETERED_WIFI_OR_UNMETERED_MOBILE", 2, 2), 
    d("ANY", 3, 3);
    
    private static final aqtt[] f;
    public final int e;
    
    private aqtt(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aqnr.n;
    }
    
    public static aqtt b(final int n) {
        if (n == 0) {
            return aqtt.a;
        }
        if (n == 1) {
            return aqtt.b;
        }
        if (n == 2) {
            return aqtt.c;
        }
        if (n != 3) {
            return null;
        }
        return aqtt.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
