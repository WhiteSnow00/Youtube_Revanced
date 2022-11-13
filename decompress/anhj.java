// 
// Decompiled by Procyon v0.6.0
// 

public enum anhj implements ahbl
{
    a("ADS_STATE_UNKNOWN", 0, 0), 
    b("ADS_STATE_PLAYING", 1, 1), 
    c("ADS_STATE_NONE", 2, 2);
    
    private static final anhj[] e;
    public final int d;
    
    private anhj(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return anci.p;
    }
    
    public static anhj b(final int n) {
        if (n == 0) {
            return anhj.a;
        }
        if (n == 1) {
            return anhj.b;
        }
        if (n != 2) {
            return null;
        }
        return anhj.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
