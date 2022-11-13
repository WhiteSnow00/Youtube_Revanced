// 
// Decompiled by Procyon v0.6.0
// 

public enum aguf implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("INCOMING", 1, 1), 
    c("OUTGOING", 2, 2), 
    d("UNRECOGNIZED", 3, -1);
    
    private static final aguf[] e;
    private final int f;
    
    private aguf(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static aguf a(final int n) {
        if (n == 0) {
            return aguf.a;
        }
        if (n == 1) {
            return aguf.b;
        }
        if (n != 2) {
            return null;
        }
        return aguf.c;
    }
    
    public final int getNumber() {
        if (this != aguf.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
