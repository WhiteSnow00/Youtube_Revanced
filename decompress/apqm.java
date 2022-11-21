// 
// Decompiled by Procyon v0.6.0
// 

public enum apqm implements ahdd
{
    a("UNKNOWN", 0, 0), 
    b("WIFI", 1, 1), 
    c("CELLULAR", 2, 2);
    
    private static final apqm[] d;
    private final int e;
    
    private apqm(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return apnc.o;
    }
    
    public static apqm b(final int n) {
        if (n == 0) {
            return apqm.a;
        }
        if (n == 1) {
            return apqm.b;
        }
        if (n != 2) {
            return null;
        }
        return apqm.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
