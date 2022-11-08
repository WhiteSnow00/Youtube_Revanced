// 
// Decompiled by Procyon v0.6.0
// 

public enum agsh implements agzm
{
    a("UNDEFINED", 0, 0), 
    b("HEARTBEAT", 1, 1), 
    c("UPDATE", 2, 2), 
    d("UNRECOGNIZED", 3, -1);
    
    private final int f;
    
    private agsh(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static agsh a(final int n) {
        if (n == 0) {
            return agsh.a;
        }
        if (n == 1) {
            return agsh.b;
        }
        if (n != 2) {
            return null;
        }
        return agsh.c;
    }
    
    public final int getNumber() {
        if (this != agsh.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
