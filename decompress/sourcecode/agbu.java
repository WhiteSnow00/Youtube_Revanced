// 
// Decompiled by Procyon v0.6.0
// 

public enum agbu implements agzm
{
    a("UNKNOWN_PREFIX", 0, 0), 
    b("TINK", 1, 1), 
    c("LEGACY", 2, 2), 
    d("RAW", 3, 3), 
    e("CRUNCHY", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private final int h;
    
    private agbu(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agbu a(final int n) {
        if (n == 0) {
            return agbu.a;
        }
        if (n == 1) {
            return agbu.b;
        }
        if (n == 2) {
            return agbu.c;
        }
        if (n == 3) {
            return agbu.d;
        }
        if (n != 4) {
            return null;
        }
        return agbu.e;
    }
    
    @Override
    public final int getNumber() {
        if (this != agbu.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
