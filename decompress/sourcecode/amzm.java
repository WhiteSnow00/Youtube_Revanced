// 
// Decompiled by Procyon v0.6.0
// 

public enum amzm implements agzm
{
    a("PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN", 0, 0), 
    b("PIVOT_BAR_NAVIGATION_TYPE_SELECT_TAB", 1, 1), 
    c("PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB", 2, 2), 
    d("PIVOT_BAR_NAVIGATION_TYPE_OVERFLOW_TAB", 3, 3);
    
    private final int f;
    
    private amzm(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agzo a() {
        return amtt.r;
    }
    
    public static amzm b(final int n) {
        if (n == 0) {
            return amzm.a;
        }
        if (n == 1) {
            return amzm.b;
        }
        if (n == 2) {
            return amzm.c;
        }
        if (n != 3) {
            return null;
        }
        return amzm.d;
    }
    
    @Override
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
