// 
// Decompiled by Procyon v0.6.0
// 

public enum agfb implements ahdd
{
    a("UNKNOWN_KEYMATERIAL", 0, 0), 
    b("SYMMETRIC", 1, 1), 
    c("ASYMMETRIC_PRIVATE", 2, 2), 
    d("ASYMMETRIC_PUBLIC", 3, 3), 
    e("REMOTE", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final agfb[] g;
    private final int h;
    
    private agfb(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agfb a(final int n) {
        if (n == 0) {
            return agfb.a;
        }
        if (n == 1) {
            return agfb.b;
        }
        if (n == 2) {
            return agfb.c;
        }
        if (n == 3) {
            return agfb.d;
        }
        if (n != 4) {
            return null;
        }
        return agfb.e;
    }
    
    public final int getNumber() {
        if (this != agfb.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
