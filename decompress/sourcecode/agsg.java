// 
// Decompiled by Procyon v0.6.0
// 

public enum agsg implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("INCOMING", 1, 1), 
    c("OUTGOING", 2, 2), 
    d("UNRECOGNIZED", 3, -1);
    
    private final int f;
    
    private agsg(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agsg a(final int n) {
        if (n == 0) {
            return agsg.a;
        }
        if (n == 1) {
            return agsg.b;
        }
        if (n != 2) {
            return null;
        }
        return agsg.c;
    }
    
    public final int getNumber() {
        if (this != agsg.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
