// 
// Decompiled by Procyon v0.6.0
// 

public enum agdv implements ahbl
{
    a("UNKNOWN_PREFIX", 0, 0), 
    b("TINK", 1, 1), 
    c("LEGACY", 2, 2), 
    d("RAW", 3, 3), 
    e("CRUNCHY", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final agdv[] g;
    private final int h;
    
    private agdv(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agdv a(final int n) {
        if (n == 0) {
            return agdv.a;
        }
        if (n == 1) {
            return agdv.b;
        }
        if (n == 2) {
            return agdv.c;
        }
        if (n == 3) {
            return agdv.d;
        }
        if (n != 4) {
            return null;
        }
        return agdv.e;
    }
    
    public final int getNumber() {
        if (this != agdv.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
