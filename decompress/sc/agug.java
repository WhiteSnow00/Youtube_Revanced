// 
// Decompiled by Procyon v0.6.0
// 

public enum agug implements ahbl
{
    a("UNDEFINED", 0, 0), 
    b("HEARTBEAT", 1, 1), 
    c("UPDATE", 2, 2), 
    d("UNRECOGNIZED", 3, -1);
    
    private static final agug[] e;
    private final int f;
    
    private agug(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agug a(final int n) {
        if (n == 0) {
            return agug.a;
        }
        if (n == 1) {
            return agug.b;
        }
        if (n != 2) {
            return null;
        }
        return agug.c;
    }
    
    public final int getNumber() {
        if (this != agug.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
