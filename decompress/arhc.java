// 
// Decompiled by Procyon v0.6.0
// 

public enum arhc implements ahdd
{
    a("NONE", 0, 0), 
    b("FRAMERATE", 1, 1), 
    c("DYNAMIC", 2, 2);
    
    private static final arhc[] e;
    public final int d;
    
    private arhc(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return areg.c;
    }
    
    public static arhc b(final int n) {
        if (n == 0) {
            return arhc.a;
        }
        if (n == 1) {
            return arhc.b;
        }
        if (n != 2) {
            return null;
        }
        return arhc.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
