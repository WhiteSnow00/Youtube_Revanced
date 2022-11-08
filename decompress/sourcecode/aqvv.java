// 
// Decompiled by Procyon v0.6.0
// 

public enum aqvv implements agzm
{
    a("DAY_OF_WEEK_STYLE_UNSPECIFIED", 0, 0), 
    b("DAY_OF_WEEK_NORMAL", 1, 1), 
    c("DAY_OF_WEEK_LIGHT", 2, 2);
    
    public final int d;
    
    private aqvv(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aqtg.i;
    }
    
    public static aqvv b(final int n) {
        if (n == 0) {
            return aqvv.a;
        }
        if (n == 1) {
            return aqvv.b;
        }
        if (n != 2) {
            return null;
        }
        return aqvv.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
