// 
// Decompiled by Procyon v0.6.0
// 

public enum aqwt implements agzm
{
    a("LOCATION_STYLE_UNSPECIFIED", 0, 0), 
    b("LOCATION_NORMAL", 1, 1), 
    c("LOCATION_LIGHT", 2, 2);
    
    public final int d;
    
    private aqwt(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aqtg.n;
    }
    
    public static aqwt b(final int n) {
        if (n == 0) {
            return aqwt.a;
        }
        if (n == 1) {
            return aqwt.b;
        }
        if (n != 2) {
            return null;
        }
        return aqwt.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
