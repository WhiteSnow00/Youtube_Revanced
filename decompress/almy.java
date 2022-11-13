// 
// Decompiled by Procyon v0.6.0
// 

public enum almy implements ahbl
{
    a("LATENCY_AD_BREAK_TYPE_UNKNOWN", 0, 0), 
    b("LATENCY_AD_BREAK_TYPE_PREROLL", 1, 1), 
    c("LATENCY_AD_BREAK_TYPE_MIDROLL", 2, 2), 
    d("LATENCY_AD_BREAK_TYPE_POSTROLL", 3, 3);
    
    private static final almy[] f;
    public final int e;
    
    private almy(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return aldq.t;
    }
    
    public static almy b(final int n) {
        if (n == 0) {
            return almy.a;
        }
        if (n == 1) {
            return almy.b;
        }
        if (n == 2) {
            return almy.c;
        }
        if (n != 3) {
            return null;
        }
        return almy.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
