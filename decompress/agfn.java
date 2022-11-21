// 
// Decompiled by Procyon v0.6.0
// 

public enum agfn implements ahdd
{
    a("UNKNOWN_PREFIX", 0, 0), 
    b("TINK", 1, 1), 
    c("LEGACY", 2, 2), 
    d("RAW", 3, 3), 
    e("CRUNCHY", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final agfn[] g;
    private final int h;
    
    private agfn(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agfn a(final int n) {
        if (n == 0) {
            return agfn.a;
        }
        if (n == 1) {
            return agfn.b;
        }
        if (n == 2) {
            return agfn.c;
        }
        if (n == 3) {
            return agfn.d;
        }
        if (n != 4) {
            return null;
        }
        return agfn.e;
    }
    
    public final int getNumber() {
        if (this != agfn.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
