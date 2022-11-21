// 
// Decompiled by Procyon v0.6.0
// 

public enum arbe implements ahdd
{
    a("DAY_OF_WEEK_STYLE_UNSPECIFIED", 0, 0), 
    b("DAY_OF_WEEK_NORMAL", 1, 1), 
    c("DAY_OF_WEEK_LIGHT", 2, 2);
    
    private static final arbe[] e;
    public final int d;
    
    private arbe(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aqym.k;
    }
    
    public static arbe b(final int n) {
        if (n == 0) {
            return arbe.a;
        }
        if (n == 1) {
            return arbe.b;
        }
        if (n != 2) {
            return null;
        }
        return arbe.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
