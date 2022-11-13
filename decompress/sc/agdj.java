// 
// Decompiled by Procyon v0.6.0
// 

public enum agdj implements ahbl
{
    a("UNKNOWN_KEYMATERIAL", 0, 0), 
    b("SYMMETRIC", 1, 1), 
    c("ASYMMETRIC_PRIVATE", 2, 2), 
    d("ASYMMETRIC_PUBLIC", 3, 3), 
    e("REMOTE", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final agdj[] g;
    private final int h;
    
    private agdj(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agdj a(final int n) {
        if (n == 0) {
            return agdj.a;
        }
        if (n == 1) {
            return agdj.b;
        }
        if (n == 2) {
            return agdj.c;
        }
        if (n == 3) {
            return agdj.d;
        }
        if (n != 4) {
            return null;
        }
        return agdj.e;
    }
    
    public final int getNumber() {
        if (this != agdj.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
