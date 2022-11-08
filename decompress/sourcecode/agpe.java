// 
// Decompiled by Procyon v0.6.0
// 

public enum agpe implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("ENFORCE", 1, 1), 
    c("DO_NOT_ENFORCE", 2, 2);
    
    public final int d;
    
    private agpe(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agpe a(final int n) {
        if (n == 0) {
            return agpe.a;
        }
        if (n == 1) {
            return agpe.b;
        }
        if (n != 2) {
            return null;
        }
        return agpe.c;
    }
    
    public static agzo b() {
        return afon.h;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
