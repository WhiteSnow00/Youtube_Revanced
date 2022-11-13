// 
// Decompiled by Procyon v0.6.0
// 

public enum agrd implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("ENFORCE", 1, 1), 
    c("DO_NOT_ENFORCE", 2, 2);
    
    private static final agrd[] e;
    public final int d;
    
    private agrd(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agrd a(final int n) {
        if (n == 0) {
            return agrd.a;
        }
        if (n == 1) {
            return agrd.b;
        }
        if (n != 2) {
            return null;
        }
        return agrd.c;
    }
    
    public static ahbn b() {
        return afqo.h;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
