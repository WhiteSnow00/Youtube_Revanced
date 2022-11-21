// 
// Decompiled by Procyon v0.6.0
// 

public enum arcc implements ahdd
{
    a("LOCATION_STYLE_UNSPECIFIED", 0, 0), 
    b("LOCATION_NORMAL", 1, 1), 
    c("LOCATION_LIGHT", 2, 2);
    
    private static final arcc[] e;
    public final int d;
    
    private arcc(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aqym.p;
    }
    
    public static arcc b(final int n) {
        if (n == 0) {
            return arcc.a;
        }
        if (n == 1) {
            return arcc.b;
        }
        if (n != 2) {
            return null;
        }
        return arcc.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
