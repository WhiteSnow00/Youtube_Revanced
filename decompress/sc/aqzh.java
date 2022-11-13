// 
// Decompiled by Procyon v0.6.0
// 

public enum aqzh implements ahbl
{
    a("LOCATION_STYLE_UNSPECIFIED", 0, 0), 
    b("LOCATION_NORMAL", 1, 1), 
    c("LOCATION_LIGHT", 2, 2);
    
    private static final aqzh[] e;
    public final int d;
    
    private aqzh(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return aqvs.o;
    }
    
    public static aqzh b(final int n) {
        if (n == 0) {
            return aqzh.a;
        }
        if (n == 1) {
            return aqzh.b;
        }
        if (n != 2) {
            return null;
        }
        return aqzh.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
